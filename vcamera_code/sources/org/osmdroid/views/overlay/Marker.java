package org.osmdroid.views.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.MapViewRepository;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.infowindow.InfoWindow;
import org.osmdroid.views.overlay.infowindow.MarkerInfoWindow;
/* loaded from: classes3.dex */
public class Marker extends OverlayWithIW {
    public static final float ANCHOR_BOTTOM = 1.0f;
    public static final float ANCHOR_CENTER = 0.5f;
    public static final float ANCHOR_LEFT = 0.0f;
    public static final float ANCHOR_RIGHT = 1.0f;
    public static final float ANCHOR_TOP = 0.0f;
    public float mAlpha;
    public float mAnchorU;
    public float mAnchorV;
    public float mBearing;
    private boolean mDisplayed;
    public float mDragOffsetY;
    public boolean mDraggable;
    public boolean mFlat;
    public float mIWAnchorU;
    public float mIWAnchorV;
    public Drawable mIcon;
    public Drawable mImage;
    public boolean mIsDragged;
    private MapViewRepository mMapViewRepository;
    public OnMarkerClickListener mOnMarkerClickListener;
    public OnMarkerDragListener mOnMarkerDragListener;
    private final Rect mOrientedMarkerRect;
    private Paint mPaint;
    public boolean mPanToView;
    public GeoPoint mPosition;
    public Point mPositionPixels;
    private final Rect mRect;
    public Resources mResources;
    public int mTextLabelBackgroundColor;
    public int mTextLabelFontSize;
    public int mTextLabelForegroundColor;

    /* loaded from: classes3.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker, MapView mapView);
    }

    /* loaded from: classes3.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public Marker(MapView mapView) {
        this(mapView, mapView.getContext());
    }

    public Marker(MapView mapView, Context context) {
        this.mTextLabelBackgroundColor = -1;
        this.mTextLabelForegroundColor = -16777216;
        this.mTextLabelFontSize = 24;
        this.mRect = new Rect();
        this.mOrientedMarkerRect = new Rect();
        this.mMapViewRepository = mapView.getRepository();
        this.mResources = mapView.getContext().getResources();
        this.mBearing = 0.0f;
        this.mAlpha = 1.0f;
        this.mPosition = new GeoPoint(0.0d, 0.0d);
        this.mAnchorU = 0.5f;
        this.mAnchorV = 0.5f;
        this.mIWAnchorU = 0.5f;
        this.mIWAnchorV = 0.0f;
        this.mDraggable = false;
        this.mIsDragged = false;
        this.mPositionPixels = new Point();
        this.mPanToView = true;
        this.mDragOffsetY = 0.0f;
        this.mFlat = false;
        this.mOnMarkerClickListener = null;
        this.mOnMarkerDragListener = null;
        setDefaultIcon();
        setInfoWindow(this.mMapViewRepository.getDefaultMarkerInfoWindow());
    }

    @Deprecated
    public static void cleanDefaults() {
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (this.mIcon != null && isEnabled()) {
            projection.toPixels(this.mPosition, this.mPositionPixels);
            float f = this.mFlat ? -this.mBearing : (-projection.getOrientation()) - this.mBearing;
            Point point = this.mPositionPixels;
            drawAt(canvas, point.x, point.y, f);
            if (isInfoWindowShown()) {
                this.mInfoWindow.draw();
            }
        }
    }

    public void drawAt(Canvas canvas, int i, int i2, float f) {
        Paint paint;
        int intrinsicWidth = this.mIcon.getIntrinsicWidth();
        int intrinsicHeight = this.mIcon.getIntrinsicHeight();
        int round = i - Math.round(intrinsicWidth * this.mAnchorU);
        int round2 = i2 - Math.round(intrinsicHeight * this.mAnchorV);
        this.mRect.set(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
        RectL.getBounds(this.mRect, i, i2, f, this.mOrientedMarkerRect);
        boolean intersects = Rect.intersects(this.mOrientedMarkerRect, canvas.getClipBounds());
        this.mDisplayed = intersects;
        if (intersects && this.mAlpha != 0.0f) {
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i3 != 0) {
                canvas.save();
                canvas.rotate(f, i, i2);
            }
            Drawable drawable = this.mIcon;
            if (drawable instanceof BitmapDrawable) {
                if (this.mAlpha == 1.0f) {
                    paint = null;
                } else {
                    if (this.mPaint == null) {
                        this.mPaint = new Paint();
                    }
                    this.mPaint.setAlpha((int) (this.mAlpha * 255.0f));
                    paint = this.mPaint;
                }
                canvas.drawBitmap(((BitmapDrawable) this.mIcon).getBitmap(), round, round2, paint);
            } else {
                drawable.setAlpha((int) (this.mAlpha * 255.0f));
                this.mIcon.setBounds(this.mRect);
                this.mIcon.draw(canvas);
            }
            if (i3 != 0) {
                canvas.restore();
            }
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getDragOffset() {
        return this.mDragOffsetY;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public Drawable getImage() {
        return this.mImage;
    }

    public GeoPoint getPosition() {
        return this.mPosition;
    }

    public float getRotation() {
        return this.mBearing;
    }

    public int getTextLabelBackgroundColor() {
        return this.mTextLabelBackgroundColor;
    }

    public int getTextLabelFontSize() {
        return this.mTextLabelFontSize;
    }

    public int getTextLabelForegroundColor() {
        return this.mTextLabelForegroundColor;
    }

    public boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        return this.mIcon != null && this.mDisplayed && this.mOrientedMarkerRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public boolean isDisplayed() {
        return this.mDisplayed;
    }

    public boolean isDraggable() {
        return this.mDraggable;
    }

    public boolean isFlat() {
        return this.mFlat;
    }

    public boolean isInfoWindowShown() {
        InfoWindow infoWindow = this.mInfoWindow;
        if (infoWindow instanceof MarkerInfoWindow) {
            MarkerInfoWindow markerInfoWindow = (MarkerInfoWindow) infoWindow;
            return markerInfoWindow != null && markerInfoWindow.isOpen() && markerInfoWindow.getMarkerReference() == this;
        }
        return super.isInfoWindowOpen();
    }

    public void moveToEventPosition(MotionEvent motionEvent, MapView mapView) {
        setPosition((GeoPoint) mapView.getProjection().fromPixels((int) motionEvent.getX(), (int) (motionEvent.getY() - TypedValue.applyDimension(5, this.mDragOffsetY, mapView.getContext().getResources().getDisplayMetrics()))));
        mapView.invalidate();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        BitmapPool.getInstance().asyncRecycle(this.mIcon);
        this.mIcon = null;
        BitmapPool.getInstance().asyncRecycle(this.mImage);
        this.mOnMarkerClickListener = null;
        this.mOnMarkerDragListener = null;
        this.mResources = null;
        setRelatedObject(null);
        if (isInfoWindowShown()) {
            closeInfoWindow();
        }
        this.mMapViewRepository = null;
        setInfoWindow((MarkerInfoWindow) null);
        onDestroy();
        super.onDetach(mapView);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest && this.mDraggable) {
            this.mIsDragged = true;
            closeInfoWindow();
            OnMarkerDragListener onMarkerDragListener = this.mOnMarkerDragListener;
            if (onMarkerDragListener != null) {
                onMarkerDragListener.onMarkerDragStart(this);
            }
            moveToEventPosition(motionEvent, mapView);
        }
        return hitTest;
    }

    public boolean onMarkerClickDefault(Marker marker, MapView mapView) {
        marker.showInfoWindow();
        if (marker.mPanToView) {
            mapView.getController().animateTo(marker.getPosition());
            return true;
        }
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest) {
            OnMarkerClickListener onMarkerClickListener = this.mOnMarkerClickListener;
            return onMarkerClickListener == null ? onMarkerClickDefault(this, mapView) : onMarkerClickListener.onMarkerClick(this, mapView);
        }
        return hitTest;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.mDraggable && this.mIsDragged) {
            if (motionEvent.getAction() == 1) {
                this.mIsDragged = false;
                OnMarkerDragListener onMarkerDragListener = this.mOnMarkerDragListener;
                if (onMarkerDragListener != null) {
                    onMarkerDragListener.onMarkerDragEnd(this);
                }
                return true;
            } else if (motionEvent.getAction() == 2) {
                moveToEventPosition(motionEvent, mapView);
                OnMarkerDragListener onMarkerDragListener2 = this.mOnMarkerDragListener;
                if (onMarkerDragListener2 != null) {
                    onMarkerDragListener2.onMarkerDrag(this);
                }
                return true;
            }
        }
        return false;
    }

    public void remove(MapView mapView) {
        mapView.getOverlays().remove(this);
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    public void setAnchor(float f, float f2) {
        this.mAnchorU = f;
        this.mAnchorV = f2;
    }

    public void setDefaultIcon() {
        this.mIcon = this.mMapViewRepository.getDefaultMarkerIcon();
        setAnchor(0.5f, 1.0f);
    }

    public void setDragOffset(float f) {
        this.mDragOffsetY = f;
    }

    public void setDraggable(boolean z) {
        this.mDraggable = z;
    }

    public void setFlat(boolean z) {
        this.mFlat = z;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.mIcon = drawable;
        } else {
            setDefaultIcon();
        }
    }

    public void setImage(Drawable drawable) {
        this.mImage = drawable;
    }

    public void setInfoWindow(MarkerInfoWindow markerInfoWindow) {
        this.mInfoWindow = markerInfoWindow;
    }

    public void setInfoWindowAnchor(float f, float f2) {
        this.mIWAnchorU = f;
        this.mIWAnchorV = f2;
    }

    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        this.mOnMarkerClickListener = onMarkerClickListener;
    }

    public void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        this.mOnMarkerDragListener = onMarkerDragListener;
    }

    public void setPanToView(boolean z) {
        this.mPanToView = z;
    }

    public void setPosition(GeoPoint geoPoint) {
        this.mPosition = geoPoint.clone();
        if (isInfoWindowShown()) {
            closeInfoWindow();
            showInfoWindow();
        }
        this.mBounds = new BoundingBox(geoPoint.getLatitude(), geoPoint.getLongitude(), geoPoint.getLatitude(), geoPoint.getLongitude());
    }

    public void setRotation(float f) {
        this.mBearing = f;
    }

    public void setTextIcon(String str) {
        Paint paint = new Paint();
        paint.setColor(this.mTextLabelBackgroundColor);
        Paint paint2 = new Paint();
        paint2.setTextSize(this.mTextLabelFontSize);
        paint2.setColor(this.mTextLabelForegroundColor);
        paint2.setAntiAlias(true);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setTextAlign(Paint.Align.LEFT);
        float f = (int) ((-paint2.ascent()) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap((int) (paint2.measureText(str) + 0.5f), (int) (paint2.descent() + f + 0.5f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawPaint(paint);
        canvas.drawText(str, 0.0f, f, paint2);
        this.mIcon = new BitmapDrawable(this.mResources, createBitmap);
        setAnchor(0.5f, 0.5f);
    }

    public void setTextLabelBackgroundColor(int i) {
        this.mTextLabelBackgroundColor = i;
    }

    public void setTextLabelFontSize(int i) {
        this.mTextLabelFontSize = i;
    }

    public void setTextLabelForegroundColor(int i) {
        this.mTextLabelForegroundColor = i;
    }

    public void setVisible(boolean z) {
        setAlpha(z ? 1.0f : 0.0f);
    }

    public void showInfoWindow() {
        float f;
        if (this.mInfoWindow == null) {
            return;
        }
        int intrinsicWidth = this.mIcon.getIntrinsicWidth();
        int intrinsicHeight = this.mIcon.getIntrinsicHeight();
        int i = (int) ((this.mIWAnchorU - this.mAnchorU) * intrinsicWidth);
        int i2 = (int) ((this.mIWAnchorV - this.mAnchorV) * intrinsicHeight);
        if (this.mBearing != 0.0f) {
            double d = ((-f) * 3.141592653589793d) / 180.0d;
            double cos = Math.cos(d);
            double sin = Math.sin(d);
            long j = i;
            long j2 = i2;
            i = (int) RectL.getRotatedX(j, j2, 0L, 0L, cos, sin);
            i2 = (int) RectL.getRotatedY(j, j2, 0L, 0L, cos, sin);
        }
        this.mInfoWindow.open(this, this.mPosition, i, i2);
    }
}
