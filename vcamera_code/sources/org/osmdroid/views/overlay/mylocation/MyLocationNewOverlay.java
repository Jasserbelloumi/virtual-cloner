package org.osmdroid.views.overlay.mylocation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.IOverlayMenuProvider;
import org.osmdroid.views.overlay.Overlay;
/* loaded from: classes3.dex */
public class MyLocationNewOverlay extends Overlay implements IMyLocationConsumer, IOverlayMenuProvider, Overlay.Snappable {
    public static final int MENU_MY_LOCATION = Overlay.getSafeMenuId();
    public boolean enableAutoStop;
    public Paint mCirclePaint;
    public Bitmap mDirectionArrowBitmap;
    public float mDirectionArrowCenterX;
    public float mDirectionArrowCenterY;
    public boolean mDrawAccuracyEnabled;
    private final Point mDrawPixel;
    private final GeoPoint mGeoPoint;
    private Handler mHandler;
    private Object mHandlerToken;
    public boolean mIsFollowing;
    private boolean mIsLocationEnabled;
    private Location mLocation;
    private IMapController mMapController;
    public MapView mMapView;
    public IMyLocationProvider mMyLocationProvider;
    private boolean mOptionsMenuEnabled;
    public Paint mPaint;
    public Bitmap mPersonBitmap;
    public final PointF mPersonHotspot;
    private final LinkedList<Runnable> mRunOnFirstFix;
    public final float mScale;
    private final Point mSnapPixel;
    private boolean wasEnabledOnPause;

    public MyLocationNewOverlay(MapView mapView) {
        this(new GpsMyLocationProvider(mapView.getContext()), mapView);
    }

    public MyLocationNewOverlay(IMyLocationProvider iMyLocationProvider, MapView mapView) {
        this.mPaint = new Paint();
        this.mCirclePaint = new Paint();
        this.mRunOnFirstFix = new LinkedList<>();
        this.mDrawPixel = new Point();
        this.mSnapPixel = new Point();
        this.mHandlerToken = new Object();
        this.enableAutoStop = true;
        this.mGeoPoint = new GeoPoint(0, 0);
        this.mIsLocationEnabled = false;
        this.mIsFollowing = false;
        this.mDrawAccuracyEnabled = true;
        this.mOptionsMenuEnabled = true;
        this.wasEnabledOnPause = false;
        float f = mapView.getContext().getResources().getDisplayMetrics().density;
        this.mScale = f;
        this.mMapView = mapView;
        this.mMapController = mapView.getController();
        this.mCirclePaint.setARGB(0, 100, 100, 255);
        this.mCirclePaint.setAntiAlias(true);
        this.mPaint.setFilterBitmap(true);
        setDirectionArrow(((BitmapDrawable) mapView.getContext().getResources().getDrawable(R.drawable.person)).getBitmap(), ((BitmapDrawable) mapView.getContext().getResources().getDrawable(R.drawable.twotone_navigation_black_48)).getBitmap());
        this.mPersonHotspot = new PointF((24.0f * f) + 0.5f, (f * 39.0f) + 0.5f);
        this.mHandler = new Handler(Looper.getMainLooper());
        setMyLocationProvider(iMyLocationProvider);
    }

    public void disableFollowLocation() {
        this.mMapController.stopAnimation(false);
        this.mIsFollowing = false;
    }

    public void disableMyLocation() {
        this.mIsLocationEnabled = false;
        stopLocationProvider();
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (this.mLocation == null || !isMyLocationEnabled()) {
            return;
        }
        drawMyLocation(canvas, projection, this.mLocation);
    }

    public void drawMyLocation(Canvas canvas, Projection projection, Location location) {
        Bitmap bitmap;
        float f;
        float f2;
        float f3;
        projection.toPixels(this.mGeoPoint, this.mDrawPixel);
        if (this.mDrawAccuracyEnabled) {
            float accuracy = location.getAccuracy() / ((float) TileSystem.GroundResolution(location.getLatitude(), projection.getZoomLevel()));
            this.mCirclePaint.setAlpha(50);
            this.mCirclePaint.setStyle(Paint.Style.FILL);
            Point point = this.mDrawPixel;
            canvas.drawCircle(point.x, point.y, accuracy, this.mCirclePaint);
            this.mCirclePaint.setAlpha(150);
            this.mCirclePaint.setStyle(Paint.Style.STROKE);
            Point point2 = this.mDrawPixel;
            canvas.drawCircle(point2.x, point2.y, accuracy, this.mCirclePaint);
        }
        boolean hasBearing = location.hasBearing();
        canvas.save();
        if (hasBearing) {
            float bearing = location.getBearing();
            if (bearing >= 360.0f) {
                bearing -= 360.0f;
            }
            Point point3 = this.mDrawPixel;
            canvas.rotate(bearing, point3.x, point3.y);
            bitmap = this.mDirectionArrowBitmap;
            Point point4 = this.mDrawPixel;
            f = point4.x - this.mDirectionArrowCenterX;
            f2 = point4.y;
            f3 = this.mDirectionArrowCenterY;
        } else {
            Point point5 = this.mDrawPixel;
            canvas.rotate(-this.mMapView.getMapOrientation(), point5.x, point5.y);
            bitmap = this.mPersonBitmap;
            Point point6 = this.mDrawPixel;
            PointF pointF = this.mPersonHotspot;
            f = point6.x - pointF.x;
            f2 = point6.y;
            f3 = pointF.y;
        }
        canvas.drawBitmap(bitmap, f, f2 - f3, this.mPaint);
        canvas.restore();
    }

    public void enableFollowLocation() {
        Location lastKnownLocation;
        this.mIsFollowing = true;
        if (isMyLocationEnabled() && (lastKnownLocation = this.mMyLocationProvider.getLastKnownLocation()) != null) {
            setLocation(lastKnownLocation);
        }
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    public boolean enableMyLocation() {
        return enableMyLocation(this.mMyLocationProvider);
    }

    public boolean enableMyLocation(IMyLocationProvider iMyLocationProvider) {
        Location lastKnownLocation;
        setMyLocationProvider(iMyLocationProvider);
        boolean startLocationProvider = this.mMyLocationProvider.startLocationProvider(this);
        this.mIsLocationEnabled = startLocationProvider;
        if (startLocationProvider && (lastKnownLocation = this.mMyLocationProvider.getLastKnownLocation()) != null) {
            setLocation(lastKnownLocation);
        }
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.postInvalidate();
        }
        return startLocationProvider;
    }

    public boolean getEnableAutoStop() {
        return this.enableAutoStop;
    }

    public Location getLastFix() {
        return this.mLocation;
    }

    public GeoPoint getMyLocation() {
        if (this.mLocation == null) {
            return null;
        }
        return new GeoPoint(this.mLocation);
    }

    public IMyLocationProvider getMyLocationProvider() {
        return this.mMyLocationProvider;
    }

    public boolean isDrawAccuracyEnabled() {
        return this.mDrawAccuracyEnabled;
    }

    public boolean isFollowLocationEnabled() {
        return this.mIsFollowing;
    }

    public boolean isMyLocationEnabled() {
        return this.mIsLocationEnabled;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return this.mOptionsMenuEnabled;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i, MapView mapView) {
        menu.add(0, MENU_MY_LOCATION + i, 0, mapView.getContext().getResources().getString(R.string.my_location)).setIcon(mapView.getContext().getResources().getDrawable(R.drawable.ic_menu_mylocation)).setCheckable(true);
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        disableMyLocation();
        this.mMapView = null;
        this.mHandler = null;
        this.mCirclePaint = null;
        this.mHandlerToken = null;
        this.mLocation = null;
        this.mMapController = null;
        IMyLocationProvider iMyLocationProvider = this.mMyLocationProvider;
        if (iMyLocationProvider != null) {
            iMyLocationProvider.destroy();
        }
        this.mMyLocationProvider = null;
        super.onDetach(mapView);
    }

    @Override // org.osmdroid.views.overlay.mylocation.IMyLocationConsumer
    public void onLocationChanged(final Location location, IMyLocationProvider iMyLocationProvider) {
        Handler handler;
        if (location == null || (handler = this.mHandler) == null) {
            return;
        }
        handler.postAtTime(new Runnable() { // from class: org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay.1
            @Override // java.lang.Runnable
            public void run() {
                MyLocationNewOverlay.this.setLocation(location);
                Iterator it = MyLocationNewOverlay.this.mRunOnFirstFix.iterator();
                while (it.hasNext()) {
                    Thread thread = new Thread((Runnable) it.next());
                    thread.setName(getClass().getName() + "#onLocationChanged");
                    thread.start();
                }
                MyLocationNewOverlay.this.mRunOnFirstFix.clear();
            }
        }, this.mHandlerToken, 0L);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i, MapView mapView) {
        if (menuItem.getItemId() - i == MENU_MY_LOCATION) {
            if (isMyLocationEnabled()) {
                disableFollowLocation();
                disableMyLocation();
                return true;
            }
            enableFollowLocation();
            enableMyLocation();
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onPause() {
        this.wasEnabledOnPause = this.mIsFollowing;
        disableMyLocation();
        super.onPause();
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i, MapView mapView) {
        menu.findItem(MENU_MY_LOCATION + i).setChecked(isMyLocationEnabled());
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onResume() {
        super.onResume();
        if (this.wasEnabledOnPause) {
            enableFollowLocation();
        }
        enableMyLocation();
    }

    @Override // org.osmdroid.views.overlay.Overlay.Snappable
    public boolean onSnapToItem(int i, int i2, Point point, IMapView iMapView) {
        if (this.mLocation != null) {
            this.mMapView.getProjection().toPixels(this.mGeoPoint, this.mSnapPixel);
            Point point2 = this.mSnapPixel;
            point.x = point2.x;
            point.y = point2.y;
            double d = i - point2.x;
            double d2 = i2 - point2.y;
            r0 = (d2 * d2) + (d * d) < 64.0d;
            Configuration.getInstance().isDebugMode();
        }
        return r0;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        boolean z = motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1;
        if (motionEvent.getAction() == 0 && this.enableAutoStop) {
            disableFollowLocation();
        } else if (z && isFollowLocationEnabled()) {
            return true;
        }
        return super.onTouchEvent(motionEvent, mapView);
    }

    public boolean runOnFirstFix(Runnable runnable) {
        if (this.mMyLocationProvider == null || this.mLocation == null) {
            this.mRunOnFirstFix.addLast(runnable);
            return false;
        }
        Thread thread = new Thread(runnable);
        thread.setName(getClass().getName() + "#runOnFirstFix");
        thread.start();
        return true;
    }

    public void setDirectionArrow(Bitmap bitmap, Bitmap bitmap2) {
        this.mPersonBitmap = bitmap;
        this.mDirectionArrowBitmap = bitmap2;
        this.mDirectionArrowCenterX = (bitmap2.getWidth() / 2.0f) - 0.5f;
        this.mDirectionArrowCenterY = (this.mDirectionArrowBitmap.getHeight() / 2.0f) - 0.5f;
    }

    public void setDrawAccuracyEnabled(boolean z) {
        this.mDrawAccuracyEnabled = z;
    }

    public void setEnableAutoStop(boolean z) {
        this.enableAutoStop = z;
    }

    public void setLocation(Location location) {
        this.mLocation = location;
        this.mGeoPoint.setCoords(location.getLatitude(), this.mLocation.getLongitude());
        if (this.mIsFollowing) {
            this.mMapController.animateTo(this.mGeoPoint);
            return;
        }
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    public void setMyLocationProvider(IMyLocationProvider iMyLocationProvider) {
        if (iMyLocationProvider == null) {
            throw new RuntimeException("You must pass an IMyLocationProvider to setMyLocationProvider()");
        }
        if (isMyLocationEnabled()) {
            stopLocationProvider();
        }
        this.mMyLocationProvider = iMyLocationProvider;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z) {
        this.mOptionsMenuEnabled = z;
    }

    public void setPersonHotspot(float f, float f2) {
        this.mPersonHotspot.set(f, f2);
    }

    public void setPersonIcon(Bitmap bitmap) {
        this.mPersonBitmap = bitmap;
    }

    public void stopLocationProvider() {
        Object obj;
        IMyLocationProvider iMyLocationProvider = this.mMyLocationProvider;
        if (iMyLocationProvider != null) {
            iMyLocationProvider.stopLocationProvider();
        }
        Handler handler = this.mHandler;
        if (handler == null || (obj = this.mHandlerToken) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(obj);
    }
}
