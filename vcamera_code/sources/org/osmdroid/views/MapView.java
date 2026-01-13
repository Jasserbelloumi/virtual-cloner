package org.osmdroid.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.ZoomButtonsController;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.metalev.multitouch.controller.MultiTouchController;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.IStyledTileSource;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.util.SimpleInvalidationHandler;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.GeometryMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.util.TileSystemWebMercator;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.overlay.DefaultOverlayManager;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.OverlayManager;
import org.osmdroid.views.overlay.TilesOverlay;
/* loaded from: classes3.dex */
public class MapView extends ViewGroup implements IMapView, MultiTouchController.MultiTouchObjectCanvas<Object> {
    private static TileSystem mTileSystem = new TileSystemWebMercator();
    private boolean enableFling;
    private boolean horizontalMapRepetitionEnabled;
    private GeoPoint mCenter;
    private final MapController mController;
    private boolean mDestroyModeOnDetach;
    private final GestureDetector mGestureDetector;
    private boolean mImpossibleFlinging;
    private final Rect mInvalidateRect;
    public final AtomicBoolean mIsAnimating;
    public boolean mIsFlinging;
    private boolean mLayoutOccurred;
    private final Point mLayoutPoint;
    public List<MapListener> mListners;
    private int mMapCenterOffsetX;
    private int mMapCenterOffsetY;
    private TilesOverlay mMapOverlay;
    private long mMapScrollX;
    private long mMapScrollY;
    public Double mMaximumZoomLevel;
    public Double mMinimumZoomLevel;
    private MultiTouchController<Object> mMultiTouchController;
    private PointF mMultiTouchScaleCurrentPoint;
    private final GeoPoint mMultiTouchScaleGeoPoint;
    private final PointF mMultiTouchScaleInitPoint;
    private final LinkedList<OnFirstLayoutListener> mOnFirstLayoutListeners;
    private OverlayManager mOverlayManager;
    public Projection mProjection;
    private final MapViewRepository mRepository;
    private final Rect mRescaleScreenRect;
    public final Point mRotateScalePoint;
    private double mScrollableAreaLimitEast;
    private int mScrollableAreaLimitExtraPixelHeight;
    private int mScrollableAreaLimitExtraPixelWidth;
    private boolean mScrollableAreaLimitLatitude;
    private boolean mScrollableAreaLimitLongitude;
    private double mScrollableAreaLimitNorth;
    private double mScrollableAreaLimitSouth;
    private double mScrollableAreaLimitWest;
    private final Scroller mScroller;
    private double mStartAnimationZoom;
    private MapTileProviderBase mTileProvider;
    private Handler mTileRequestCompleteHandler;
    private float mTilesScaleFactor;
    private boolean mTilesScaledToDpi;
    private final CustomZoomButtonsController mZoomController;
    private double mZoomLevel;
    private boolean mZoomRounding;
    private float mapOrientation;
    private boolean pauseFling;
    private boolean verticalMapRepetitionEnabled;

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static final int BOTTOM_CENTER = 8;
        public static final int BOTTOM_LEFT = 7;
        public static final int BOTTOM_RIGHT = 9;
        public static final int CENTER = 5;
        public static final int CENTER_LEFT = 4;
        public static final int CENTER_RIGHT = 6;
        public static final int TOP_CENTER = 2;
        public static final int TOP_LEFT = 1;
        public static final int TOP_RIGHT = 3;
        public int alignment;
        public IGeoPoint geoPoint;
        public int offsetX;
        public int offsetY;

        public LayoutParams(int i, int i2, IGeoPoint iGeoPoint, int i3, int i4, int i5) {
            super(i, i2);
            if (iGeoPoint != null) {
                this.geoPoint = iGeoPoint;
            } else {
                this.geoPoint = new GeoPoint(0.0d, 0.0d);
            }
            this.alignment = i3;
            this.offsetX = i4;
            this.offsetY = i5;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.geoPoint = new GeoPoint(0.0d, 0.0d);
            this.alignment = 8;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes3.dex */
    public class MapViewDoubleClickListener implements GestureDetector.OnDoubleTapListener {
        private MapViewDoubleClickListener() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (MapView.this.getOverlayManager().onDoubleTap(motionEvent, MapView.this)) {
                return true;
            }
            MapView.this.getProjection().rotateAndScalePoint((int) motionEvent.getX(), (int) motionEvent.getY(), MapView.this.mRotateScalePoint);
            IMapController controller = MapView.this.getController();
            Point point = MapView.this.mRotateScalePoint;
            return controller.zoomInFixing(point.x, point.y);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onDoubleTapEvent(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onSingleTapConfirmed(motionEvent, MapView.this);
        }
    }

    /* loaded from: classes3.dex */
    public class MapViewGestureDetectorListener implements GestureDetector.OnGestureListener {
        private MapViewGestureDetectorListener() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            MapView mapView = MapView.this;
            if (mapView.mIsFlinging) {
                if (mapView.mScroller != null) {
                    MapView.this.mScroller.abortAnimation();
                }
                MapView.this.mIsFlinging = false;
            }
            if (!MapView.this.getOverlayManager().onDown(motionEvent, MapView.this) && MapView.this.mZoomController != null) {
                MapView.this.mZoomController.activate();
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!MapView.this.enableFling || MapView.this.pauseFling) {
                MapView.this.pauseFling = false;
                return false;
            } else if (MapView.this.getOverlayManager().onFling(motionEvent, motionEvent2, f, f2, MapView.this)) {
                return true;
            } else {
                if (MapView.this.mImpossibleFlinging) {
                    MapView.this.mImpossibleFlinging = false;
                    return false;
                }
                MapView mapView = MapView.this;
                mapView.mIsFlinging = true;
                if (mapView.mScroller != null) {
                    MapView.this.mScroller.fling((int) MapView.this.getMapScrollX(), (int) MapView.this.getMapScrollY(), -((int) f), -((int) f2), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (MapView.this.mMultiTouchController == null || !MapView.this.mMultiTouchController.isPinching()) {
                MapView.this.getOverlayManager().onLongPress(motionEvent, MapView.this);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (MapView.this.getOverlayManager().onScroll(motionEvent, motionEvent2, f, f2, MapView.this)) {
                return true;
            }
            MapView.this.scrollBy((int) f, (int) f2);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            MapView.this.getOverlayManager().onShowPress(motionEvent, MapView.this);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return MapView.this.getOverlayManager().onSingleTapUp(motionEvent, MapView.this);
        }
    }

    /* loaded from: classes3.dex */
    public class MapViewZoomListener implements CustomZoomButtonsController.OnZoomListener, ZoomButtonsController.OnZoomListener {
        private MapViewZoomListener() {
        }

        @Override // org.osmdroid.views.CustomZoomButtonsController.OnZoomListener, android.widget.ZoomButtonsController.OnZoomListener
        public void onVisibilityChanged(boolean z) {
        }

        @Override // org.osmdroid.views.CustomZoomButtonsController.OnZoomListener, android.widget.ZoomButtonsController.OnZoomListener
        public void onZoom(boolean z) {
            if (z) {
                MapView.this.getController().zoomIn();
            } else {
                MapView.this.getController().zoomOut();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface OnFirstLayoutListener {
        void onFirstLayout(View view, int i, int i2, int i3, int i4);
    }

    public MapView(Context context) {
        this(context, null, null, null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, null, null, attributeSet);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase) {
        this(context, mapTileProviderBase, null);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler) {
        this(context, mapTileProviderBase, handler, null);
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler, AttributeSet attributeSet) {
        this(context, mapTileProviderBase, handler, attributeSet, Configuration.getInstance().isMapViewHardwareAccelerated());
    }

    public MapView(Context context, MapTileProviderBase mapTileProviderBase, Handler handler, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.mZoomLevel = 0.0d;
        this.mIsAnimating = new AtomicBoolean(false);
        this.mMultiTouchScaleInitPoint = new PointF();
        this.mMultiTouchScaleGeoPoint = new GeoPoint(0.0d, 0.0d);
        this.mapOrientation = 0.0f;
        this.mInvalidateRect = new Rect();
        this.mTilesScaledToDpi = false;
        this.mTilesScaleFactor = 1.0f;
        this.mRotateScalePoint = new Point();
        this.mLayoutPoint = new Point();
        this.mOnFirstLayoutListeners = new LinkedList<>();
        this.mLayoutOccurred = false;
        this.horizontalMapRepetitionEnabled = true;
        this.verticalMapRepetitionEnabled = true;
        this.mListners = new ArrayList();
        this.mRepository = new MapViewRepository(this);
        this.mRescaleScreenRect = new Rect();
        this.mDestroyModeOnDetach = true;
        this.enableFling = true;
        this.pauseFling = false;
        Configuration.getInstance().getOsmdroidTileCache(context);
        if (isInEditMode()) {
            this.mTileRequestCompleteHandler = null;
            this.mController = null;
            this.mZoomController = null;
            this.mScroller = null;
            this.mGestureDetector = null;
            return;
        }
        if (!z) {
            setLayerType(1, null);
        }
        this.mController = new MapController(this);
        this.mScroller = new Scroller(context);
        mapTileProviderBase = mapTileProviderBase == null ? new MapTileProviderBasic(context.getApplicationContext(), getTileSourceFromAttributes(attributeSet)) : mapTileProviderBase;
        this.mTileRequestCompleteHandler = handler == null ? new SimpleInvalidationHandler(this) : handler;
        this.mTileProvider = mapTileProviderBase;
        mapTileProviderBase.getTileRequestCompleteHandlers().add(this.mTileRequestCompleteHandler);
        updateTileSizeForDensity(this.mTileProvider.getTileSource());
        this.mMapOverlay = new TilesOverlay(this.mTileProvider, context, this.horizontalMapRepetitionEnabled, this.verticalMapRepetitionEnabled);
        this.mOverlayManager = new DefaultOverlayManager(this.mMapOverlay);
        CustomZoomButtonsController customZoomButtonsController = new CustomZoomButtonsController(this);
        this.mZoomController = customZoomButtonsController;
        customZoomButtonsController.setOnZoomListener(new MapViewZoomListener());
        checkZoomButtons();
        GestureDetector gestureDetector = new GestureDetector(context, new MapViewGestureDetectorListener());
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new MapViewDoubleClickListener());
        if (Configuration.getInstance().isMapViewRecyclerFriendly()) {
            setHasTransientState(true);
        }
        customZoomButtonsController.setVisibility(CustomZoomButtonsController.Visibility.SHOW_AND_FADEOUT);
    }

    private void checkZoomButtons() {
        this.mZoomController.setZoomInEnabled(canZoomIn());
        this.mZoomController.setZoomOutEnabled(canZoomOut());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.osmdroid.tileprovider.tilesource.ITileSource, java.lang.Object] */
    private ITileSource getTileSourceFromAttributes(AttributeSet attributeSet) {
        String attributeValue;
        String attributeValue2;
        OnlineTileSourceBase onlineTileSourceBase = TileSourceFactory.DEFAULT_TILE_SOURCE;
        if (attributeSet != null && (attributeValue2 = attributeSet.getAttributeValue(null, "tilesource")) != null) {
            try {
                ?? tileSource = TileSourceFactory.getTileSource(attributeValue2);
                Objects.toString(tileSource);
                onlineTileSourceBase = tileSource;
            } catch (IllegalArgumentException unused) {
                Objects.toString(onlineTileSourceBase);
            }
        }
        if (attributeSet != null && (onlineTileSourceBase instanceof IStyledTileSource) && (attributeValue = attributeSet.getAttributeValue(null, TtmlNode.TAG_STYLE)) != null) {
            ((IStyledTileSource) onlineTileSourceBase).setStyle(attributeValue);
        }
        onlineTileSourceBase.name();
        return onlineTileSourceBase;
    }

    public static TileSystem getTileSystem() {
        return mTileSystem;
    }

    private void invalidateMapCoordinates(int i, int i2, int i3, int i4, boolean z) {
        this.mInvalidateRect.set(i, i2, i3, i4);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        if (getMapOrientation() != 0.0f) {
            GeometryMath.getBoundingBoxForRotatatedRectangle(this.mInvalidateRect, width, height, getMapOrientation() + 180.0f, this.mInvalidateRect);
        }
        Rect rect = this.mInvalidateRect;
        if (z) {
            super.postInvalidate(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            super.invalidate(rect);
        }
    }

    private void resetProjection() {
        this.mProjection = null;
    }

    private MotionEvent rotateTouchEvent(MotionEvent motionEvent) {
        if (getMapOrientation() == 0.0f) {
            return motionEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(getProjection().getInvertedScaleRotateCanvasMatrix());
        return obtain;
    }

    public static void setTileSystem(TileSystem tileSystem) {
        mTileSystem = tileSystem;
    }

    private void updateTileSizeForDensity(ITileSource iTileSource) {
        float tileSizePixels = iTileSource.getTileSizePixels();
        float f = isTilesScaledToDpi() ? ((getResources().getDisplayMetrics().density * 256.0f) / tileSizePixels) * this.mTilesScaleFactor : this.mTilesScaleFactor;
        Configuration.getInstance().isDebugMapView();
        TileSystem.setTileSize((int) (tileSizePixels * f));
    }

    public void addMapListener(MapListener mapListener) {
        this.mListners.add(mapListener);
    }

    public void addOnFirstLayoutListener(OnFirstLayoutListener onFirstLayoutListener) {
        if (isLayoutOccurred()) {
            return;
        }
        this.mOnFirstLayoutListeners.add(onFirstLayoutListener);
    }

    public boolean canZoomIn() {
        return this.mZoomLevel < getMaxZoomLevel();
    }

    public boolean canZoomOut() {
        return this.mZoomLevel > getMinZoomLevel();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        if (scroller != null && this.mIsFlinging && scroller.computeScrollOffset()) {
            if (this.mScroller.isFinished()) {
                this.mIsFlinging = false;
                return;
            }
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        System.currentTimeMillis();
        resetProjection();
        getProjection().save(canvas, true, false);
        try {
            getOverlayManager().onDraw(canvas, this);
            getProjection().restore(canvas, false);
            CustomZoomButtonsController customZoomButtonsController = this.mZoomController;
            if (customZoomButtonsController != null) {
                customZoomButtonsController.draw(canvas);
            }
            super.dispatchDraw(canvas);
        } catch (Exception unused) {
        }
        if (Configuration.getInstance().isDebugMapView()) {
            System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (Configuration.getInstance().isDebugMapView()) {
            Objects.toString(motionEvent);
        }
        if (this.mZoomController.isTouched(motionEvent)) {
            this.mZoomController.activate();
            return true;
        }
        MotionEvent rotateTouchEvent = rotateTouchEvent(motionEvent);
        try {
            if (super.dispatchTouchEvent(motionEvent)) {
                Configuration.getInstance().isDebugMapView();
                return true;
            } else if (getOverlayManager().onTouchEvent(rotateTouchEvent, this)) {
                if (rotateTouchEvent != motionEvent) {
                    rotateTouchEvent.recycle();
                }
                return true;
            } else {
                MultiTouchController<Object> multiTouchController = this.mMultiTouchController;
                if (multiTouchController == null || !multiTouchController.onTouchEvent(motionEvent)) {
                    z = false;
                } else {
                    Configuration.getInstance().isDebugMapView();
                    z = true;
                }
                if (this.mGestureDetector.onTouchEvent(rotateTouchEvent)) {
                    Configuration.getInstance().isDebugMapView();
                    z = true;
                }
                if (z) {
                    if (rotateTouchEvent != motionEvent) {
                        rotateTouchEvent.recycle();
                    }
                    return true;
                }
                if (rotateTouchEvent != motionEvent) {
                    rotateTouchEvent.recycle();
                }
                Configuration.getInstance().isDebugMapView();
                return false;
            }
        } finally {
            if (rotateTouchEvent != motionEvent) {
                rotateTouchEvent.recycle();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2, null, 8, 0, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public BoundingBox getBoundingBox() {
        return getProjection().getBoundingBox();
    }

    @Override // org.osmdroid.api.IMapView
    public IMapController getController() {
        return this.mController;
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public Object getDraggableObjectAtPoint(MultiTouchController.PointInfo pointInfo) {
        if (isAnimating()) {
            return null;
        }
        setMultiTouchScaleInitPoint(pointInfo.getX(), pointInfo.getY());
        return this;
    }

    public GeoPoint getExpectedCenter() {
        return this.mCenter;
    }

    public Rect getIntrinsicScreenRect(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(0, 0, getWidth(), getHeight());
        return rect;
    }

    @Override // org.osmdroid.api.IMapView
    public double getLatitudeSpanDouble() {
        return getBoundingBox().getLatitudeSpan();
    }

    @Override // org.osmdroid.api.IMapView
    public double getLongitudeSpanDouble() {
        return getBoundingBox().getLongitudeSpan();
    }

    @Override // org.osmdroid.api.IMapView
    public IGeoPoint getMapCenter() {
        return getMapCenter(null);
    }

    public IGeoPoint getMapCenter(GeoPoint geoPoint) {
        return getProjection().fromPixels(getWidth() / 2, getHeight() / 2, geoPoint, false);
    }

    public int getMapCenterOffsetX() {
        return this.mMapCenterOffsetX;
    }

    public int getMapCenterOffsetY() {
        return this.mMapCenterOffsetY;
    }

    public float getMapOrientation() {
        return this.mapOrientation;
    }

    public TilesOverlay getMapOverlay() {
        return this.mMapOverlay;
    }

    @Deprecated
    public float getMapScale() {
        return 1.0f;
    }

    public long getMapScrollX() {
        return this.mMapScrollX;
    }

    public long getMapScrollY() {
        return this.mMapScrollY;
    }

    @Override // org.osmdroid.api.IMapView
    public double getMaxZoomLevel() {
        Double d = this.mMaximumZoomLevel;
        return d == null ? this.mMapOverlay.getMaximumZoomLevel() : d.doubleValue();
    }

    public double getMinZoomLevel() {
        Double d = this.mMinimumZoomLevel;
        return d == null ? this.mMapOverlay.getMinimumZoomLevel() : d.doubleValue();
    }

    public OverlayManager getOverlayManager() {
        return this.mOverlayManager;
    }

    public List<Overlay> getOverlays() {
        return getOverlayManager().overlays();
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public void getPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale) {
        startAnimation();
        PointF pointF = this.mMultiTouchScaleInitPoint;
        positionAndScale.set(pointF.x, pointF.y, true, 1.0f, false, 0.0f, 0.0f, false, 0.0f);
    }

    @Override // org.osmdroid.api.IMapView
    public Projection getProjection() {
        if (this.mProjection == null) {
            Projection projection = new Projection(this);
            this.mProjection = projection;
            projection.adjustOffsets(this.mMultiTouchScaleGeoPoint, this.mMultiTouchScaleCurrentPoint);
            if (this.mScrollableAreaLimitLatitude) {
                projection.adjustOffsets(this.mScrollableAreaLimitNorth, this.mScrollableAreaLimitSouth, true, this.mScrollableAreaLimitExtraPixelHeight);
            }
            if (this.mScrollableAreaLimitLongitude) {
                projection.adjustOffsets(this.mScrollableAreaLimitWest, this.mScrollableAreaLimitEast, false, this.mScrollableAreaLimitExtraPixelWidth);
            }
            this.mImpossibleFlinging = projection.setMapScroll(this);
        }
        return this.mProjection;
    }

    public MapViewRepository getRepository() {
        return this.mRepository;
    }

    public Rect getScreenRect(Rect rect) {
        Rect intrinsicScreenRect = getIntrinsicScreenRect(rect);
        if (getMapOrientation() != 0.0f && getMapOrientation() != 180.0f) {
            GeometryMath.getBoundingBoxForRotatatedRectangle(intrinsicScreenRect, intrinsicScreenRect.centerX(), intrinsicScreenRect.centerY(), getMapOrientation(), intrinsicScreenRect);
        }
        return intrinsicScreenRect;
    }

    public Scroller getScroller() {
        return this.mScroller;
    }

    public MapTileProviderBase getTileProvider() {
        return this.mTileProvider;
    }

    public Handler getTileRequestCompleteHandler() {
        return this.mTileRequestCompleteHandler;
    }

    public float getTilesScaleFactor() {
        return this.mTilesScaleFactor;
    }

    public CustomZoomButtonsController getZoomController() {
        return this.mZoomController;
    }

    @Deprecated
    public double getZoomLevel(boolean z) {
        return getZoomLevelDouble();
    }

    @Override // org.osmdroid.api.IMapView
    @Deprecated
    public int getZoomLevel() {
        return (int) getZoomLevelDouble();
    }

    @Override // org.osmdroid.api.IMapView
    public double getZoomLevelDouble() {
        return this.mZoomLevel;
    }

    public void invalidateMapCoordinates(int i, int i2, int i3, int i4) {
        invalidateMapCoordinates(i, i2, i3, i4, false);
    }

    public void invalidateMapCoordinates(Rect rect) {
        invalidateMapCoordinates(rect.left, rect.top, rect.right, rect.bottom, false);
    }

    public boolean isAnimating() {
        return this.mIsAnimating.get();
    }

    public boolean isFlingEnabled() {
        return this.enableFling;
    }

    public boolean isHorizontalMapRepetitionEnabled() {
        return this.horizontalMapRepetitionEnabled;
    }

    public boolean isLayoutOccurred() {
        return this.mLayoutOccurred;
    }

    public boolean isScrollableAreaLimitLatitude() {
        return this.mScrollableAreaLimitLatitude;
    }

    public boolean isScrollableAreaLimitLongitude() {
        return this.mScrollableAreaLimitLongitude;
    }

    public boolean isTilesScaledToDpi() {
        return this.mTilesScaledToDpi;
    }

    public boolean isVerticalMapRepetitionEnabled() {
        return this.verticalMapRepetitionEnabled;
    }

    public void myOnLayout(boolean z, int i, int i2, int i3, int i4) {
        long paddingLeft;
        long j;
        long paddingLeft2;
        long j2;
        long paddingTop;
        long j3;
        long paddingLeft3;
        long j4;
        resetProjection();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredWidth = childAt.getMeasuredWidth();
                getProjection().toPixels(layoutParams.geoPoint, this.mLayoutPoint);
                if (getMapOrientation() != 0.0f) {
                    Projection projection = getProjection();
                    Point point = this.mLayoutPoint;
                    Point rotateAndScalePoint = projection.rotateAndScalePoint(point.x, point.y, null);
                    Point point2 = this.mLayoutPoint;
                    point2.x = rotateAndScalePoint.x;
                    point2.y = rotateAndScalePoint.y;
                }
                Point point3 = this.mLayoutPoint;
                long j5 = point3.x;
                long j6 = point3.y;
                switch (layoutParams.alignment) {
                    case 1:
                        j5 += getPaddingLeft();
                        j6 += getPaddingTop();
                        long j7 = j5 + layoutParams.offsetX;
                        long j8 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j7), TileSystem.truncateToInt(j8), TileSystem.truncateToInt(j7 + measuredWidth), TileSystem.truncateToInt(j8 + measuredHeight));
                        break;
                    case 2:
                        paddingLeft = getPaddingLeft() + j5;
                        j = measuredWidth / 2;
                        j5 = paddingLeft - j;
                        j6 += getPaddingTop();
                        long j72 = j5 + layoutParams.offsetX;
                        long j82 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j72), TileSystem.truncateToInt(j82), TileSystem.truncateToInt(j72 + measuredWidth), TileSystem.truncateToInt(j82 + measuredHeight));
                        break;
                    case 3:
                        paddingLeft = getPaddingLeft() + j5;
                        j = measuredWidth;
                        j5 = paddingLeft - j;
                        j6 += getPaddingTop();
                        long j722 = j5 + layoutParams.offsetX;
                        long j822 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j722), TileSystem.truncateToInt(j822), TileSystem.truncateToInt(j722 + measuredWidth), TileSystem.truncateToInt(j822 + measuredHeight));
                        break;
                    case 4:
                        j5 += getPaddingLeft();
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight / 2;
                        j6 = paddingTop - j3;
                        long j7222 = j5 + layoutParams.offsetX;
                        long j8222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j7222), TileSystem.truncateToInt(j8222), TileSystem.truncateToInt(j7222 + measuredWidth), TileSystem.truncateToInt(j8222 + measuredHeight));
                        break;
                    case 5:
                        paddingLeft2 = getPaddingLeft() + j5;
                        j2 = measuredWidth / 2;
                        j5 = paddingLeft2 - j2;
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight / 2;
                        j6 = paddingTop - j3;
                        long j72222 = j5 + layoutParams.offsetX;
                        long j82222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j72222), TileSystem.truncateToInt(j82222), TileSystem.truncateToInt(j72222 + measuredWidth), TileSystem.truncateToInt(j82222 + measuredHeight));
                        break;
                    case 6:
                        paddingLeft2 = getPaddingLeft() + j5;
                        j2 = measuredWidth;
                        j5 = paddingLeft2 - j2;
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight / 2;
                        j6 = paddingTop - j3;
                        long j722222 = j5 + layoutParams.offsetX;
                        long j822222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j722222), TileSystem.truncateToInt(j822222), TileSystem.truncateToInt(j722222 + measuredWidth), TileSystem.truncateToInt(j822222 + measuredHeight));
                        break;
                    case 7:
                        j5 += getPaddingLeft();
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight;
                        j6 = paddingTop - j3;
                        long j7222222 = j5 + layoutParams.offsetX;
                        long j8222222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j7222222), TileSystem.truncateToInt(j8222222), TileSystem.truncateToInt(j7222222 + measuredWidth), TileSystem.truncateToInt(j8222222 + measuredHeight));
                        break;
                    case 8:
                        paddingLeft3 = getPaddingLeft() + j5;
                        j4 = measuredWidth / 2;
                        j5 = paddingLeft3 - j4;
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight;
                        j6 = paddingTop - j3;
                        long j72222222 = j5 + layoutParams.offsetX;
                        long j82222222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j72222222), TileSystem.truncateToInt(j82222222), TileSystem.truncateToInt(j72222222 + measuredWidth), TileSystem.truncateToInt(j82222222 + measuredHeight));
                        break;
                    case 9:
                        paddingLeft3 = getPaddingLeft() + j5;
                        j4 = measuredWidth;
                        j5 = paddingLeft3 - j4;
                        paddingTop = getPaddingTop() + j6;
                        j3 = measuredHeight;
                        j6 = paddingTop - j3;
                        long j722222222 = j5 + layoutParams.offsetX;
                        long j822222222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j722222222), TileSystem.truncateToInt(j822222222), TileSystem.truncateToInt(j722222222 + measuredWidth), TileSystem.truncateToInt(j822222222 + measuredHeight));
                        break;
                    default:
                        long j7222222222 = j5 + layoutParams.offsetX;
                        long j8222222222 = j6 + layoutParams.offsetY;
                        childAt.layout(TileSystem.truncateToInt(j7222222222), TileSystem.truncateToInt(j8222222222), TileSystem.truncateToInt(j7222222222 + measuredWidth), TileSystem.truncateToInt(j8222222222 + measuredHeight));
                        break;
                }
            }
        }
        if (!isLayoutOccurred()) {
            this.mLayoutOccurred = true;
            Iterator<OnFirstLayoutListener> it = this.mOnFirstLayoutListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstLayout(this, i, i2, i3, i4);
            }
            this.mOnFirstLayoutListeners.clear();
        }
        resetProjection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetach() {
        getOverlayManager().onDetach(this);
        this.mTileProvider.detach();
        CustomZoomButtonsController customZoomButtonsController = this.mZoomController;
        if (customZoomButtonsController != null) {
            customZoomButtonsController.onDetach();
        }
        Handler handler = this.mTileRequestCompleteHandler;
        if (handler instanceof SimpleInvalidationHandler) {
            ((SimpleInvalidationHandler) handler).destroy();
        }
        this.mTileRequestCompleteHandler = null;
        Projection projection = this.mProjection;
        if (projection != null) {
            projection.detach();
        }
        this.mProjection = null;
        this.mRepository.onDetach();
        this.mListners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.mDestroyModeOnDetach) {
            onDetach();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return getOverlayManager().onKeyDown(i, keyEvent, this) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return getOverlayManager().onKeyUp(i, keyEvent, this) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        myOnLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }

    public void onPause() {
        getOverlayManager().onPause();
    }

    public void onResume() {
        getOverlayManager().onResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (getOverlayManager().onTrackballEvent(motionEvent, this)) {
            return true;
        }
        scrollBy((int) (motionEvent.getX() * 25.0f), (int) (motionEvent.getY() * 25.0f));
        return super.onTrackballEvent(motionEvent);
    }

    public void postInvalidateMapCoordinates(int i, int i2, int i3, int i4) {
        invalidateMapCoordinates(i, i2, i3, i4, true);
    }

    public void removeMapListener(MapListener mapListener) {
        this.mListners.remove(mapListener);
    }

    public void removeOnFirstLayoutListener(OnFirstLayoutListener onFirstLayoutListener) {
        this.mOnFirstLayoutListeners.remove(onFirstLayoutListener);
    }

    public void resetMultiTouchScale() {
        this.mMultiTouchScaleCurrentPoint = null;
    }

    public void resetScrollableAreaLimitLatitude() {
        this.mScrollableAreaLimitLatitude = false;
    }

    public void resetScrollableAreaLimitLongitude() {
        this.mScrollableAreaLimitLongitude = false;
    }

    public void resetTilesScaleFactor() {
        this.mTilesScaleFactor = 1.0f;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        scrollTo((int) (getMapScrollX() + i), (int) (getMapScrollY() + i2));
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        setMapScroll(i, i2);
        resetProjection();
        invalidate();
        if (getMapOrientation() != 0.0f) {
            myOnLayout(true, getLeft(), getTop(), getRight(), getBottom());
        }
        ScrollEvent scrollEvent = null;
        for (MapListener mapListener : this.mListners) {
            if (scrollEvent == null) {
                scrollEvent = new ScrollEvent(this, i, i2);
            }
            mapListener.onScroll(scrollEvent);
        }
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public void selectObject(Object obj, MultiTouchController.PointInfo pointInfo) {
        if (this.mZoomRounding) {
            this.mZoomLevel = Math.round(this.mZoomLevel);
            invalidate();
        }
        resetMultiTouchScale();
    }

    @Override // android.view.View, org.osmdroid.api.IMapView
    public void setBackgroundColor(int i) {
        this.mMapOverlay.setLoadingBackgroundColor(i);
        invalidate();
    }

    @Deprecated
    public void setBuiltInZoomControls(boolean z) {
        this.mZoomController.setVisibility(z ? CustomZoomButtonsController.Visibility.SHOW_AND_FADEOUT : CustomZoomButtonsController.Visibility.NEVER);
    }

    public void setDestroyMode(boolean z) {
        this.mDestroyModeOnDetach = z;
    }

    public void setExpectedCenter(IGeoPoint iGeoPoint) {
        setExpectedCenter(iGeoPoint, 0L, 0L);
    }

    public void setExpectedCenter(IGeoPoint iGeoPoint, long j, long j2) {
        GeoPoint currentCenter = getProjection().getCurrentCenter();
        this.mCenter = (GeoPoint) iGeoPoint;
        setMapScroll(-j, -j2);
        resetProjection();
        if (!getProjection().getCurrentCenter().equals(currentCenter)) {
            ScrollEvent scrollEvent = null;
            for (MapListener mapListener : this.mListners) {
                if (scrollEvent == null) {
                    scrollEvent = new ScrollEvent(this, 0, 0);
                }
                mapListener.onScroll(scrollEvent);
            }
        }
        invalidate();
    }

    public void setFlingEnabled(boolean z) {
        this.enableFling = z;
    }

    public void setHorizontalMapRepetitionEnabled(boolean z) {
        this.horizontalMapRepetitionEnabled = z;
        this.mMapOverlay.setHorizontalWrapEnabled(z);
        resetProjection();
        invalidate();
    }

    @Deprecated
    public void setInitCenter(IGeoPoint iGeoPoint) {
        setExpectedCenter(iGeoPoint);
    }

    @Deprecated
    public void setMapCenter(double d, double d2) {
        setMapCenter(new GeoPoint(d, d2));
    }

    @Deprecated
    public void setMapCenter(int i, int i2) {
        setMapCenter(new GeoPoint(i, i2));
    }

    @Deprecated
    public void setMapCenter(IGeoPoint iGeoPoint) {
        getController().animateTo(iGeoPoint);
    }

    public void setMapCenterOffset(int i, int i2) {
        this.mMapCenterOffsetX = i;
        this.mMapCenterOffsetY = i2;
    }

    @Deprecated
    public void setMapListener(MapListener mapListener) {
        this.mListners.add(mapListener);
    }

    public void setMapOrientation(float f) {
        setMapOrientation(f, true);
    }

    public void setMapOrientation(float f, boolean z) {
        this.mapOrientation = f % 360.0f;
        if (z) {
            requestLayout();
            invalidate();
        }
    }

    public void setMapScroll(long j, long j2) {
        this.mMapScrollX = j;
        this.mMapScrollY = j2;
        requestLayout();
    }

    public void setMaxZoomLevel(Double d) {
        this.mMaximumZoomLevel = d;
    }

    public void setMinZoomLevel(Double d) {
        this.mMinimumZoomLevel = d;
    }

    public void setMultiTouchControls(boolean z) {
        this.mMultiTouchController = z ? new MultiTouchController<>(this, false) : null;
    }

    public void setMultiTouchScale(float f) {
        setZoomLevel((Math.log(f) / Math.log(2.0d)) + this.mStartAnimationZoom);
    }

    public void setMultiTouchScaleCurrentPoint(float f, float f2) {
        this.mMultiTouchScaleCurrentPoint = new PointF(f, f2);
    }

    public void setMultiTouchScaleInitPoint(float f, float f2) {
        this.mMultiTouchScaleInitPoint.set(f, f2);
        Point unrotateAndScalePoint = getProjection().unrotateAndScalePoint((int) f, (int) f2, null);
        getProjection().fromPixels(unrotateAndScalePoint.x, unrotateAndScalePoint.y, this.mMultiTouchScaleGeoPoint);
        setMultiTouchScaleCurrentPoint(f, f2);
    }

    public void setOverlayManager(OverlayManager overlayManager) {
        this.mOverlayManager = overlayManager;
    }

    @Override // org.metalev.multitouch.controller.MultiTouchController.MultiTouchObjectCanvas
    public boolean setPositionAndScale(Object obj, MultiTouchController.PositionAndScale positionAndScale, MultiTouchController.PointInfo pointInfo) {
        setMultiTouchScaleCurrentPoint(positionAndScale.getXOff(), positionAndScale.getYOff());
        setMultiTouchScale(positionAndScale.getScale());
        requestLayout();
        invalidate();
        return true;
    }

    @Deprecated
    public void setProjection(Projection projection) {
        this.mProjection = projection;
    }

    public void setScrollableAreaLimitDouble(BoundingBox boundingBox) {
        if (boundingBox == null) {
            resetScrollableAreaLimitLatitude();
            resetScrollableAreaLimitLongitude();
            return;
        }
        setScrollableAreaLimitLatitude(boundingBox.getActualNorth(), boundingBox.getActualSouth(), 0);
        setScrollableAreaLimitLongitude(boundingBox.getLonWest(), boundingBox.getLonEast(), 0);
    }

    public void setScrollableAreaLimitLatitude(double d, double d2, int i) {
        this.mScrollableAreaLimitLatitude = true;
        this.mScrollableAreaLimitNorth = d;
        this.mScrollableAreaLimitSouth = d2;
        this.mScrollableAreaLimitExtraPixelHeight = i;
    }

    public void setScrollableAreaLimitLongitude(double d, double d2, int i) {
        this.mScrollableAreaLimitLongitude = true;
        this.mScrollableAreaLimitWest = d;
        this.mScrollableAreaLimitEast = d2;
        this.mScrollableAreaLimitExtraPixelWidth = i;
    }

    public void setTileProvider(MapTileProviderBase mapTileProviderBase) {
        this.mTileProvider.detach();
        this.mTileProvider.clearTileCache();
        this.mTileProvider = mapTileProviderBase;
        mapTileProviderBase.getTileRequestCompleteHandlers().add(this.mTileRequestCompleteHandler);
        updateTileSizeForDensity(this.mTileProvider.getTileSource());
        TilesOverlay tilesOverlay = new TilesOverlay(this.mTileProvider, getContext(), this.horizontalMapRepetitionEnabled, this.verticalMapRepetitionEnabled);
        this.mMapOverlay = tilesOverlay;
        this.mOverlayManager.setTilesOverlay(tilesOverlay);
        invalidate();
    }

    public void setTileSource(ITileSource iTileSource) {
        this.mTileProvider.setTileSource(iTileSource);
        updateTileSizeForDensity(iTileSource);
        checkZoomButtons();
        setZoomLevel(this.mZoomLevel);
        postInvalidate();
    }

    public void setTilesScaleFactor(float f) {
        this.mTilesScaleFactor = f;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    public void setTilesScaledToDpi(boolean z) {
        this.mTilesScaledToDpi = z;
        updateTileSizeForDensity(getTileProvider().getTileSource());
    }

    public void setUseDataConnection(boolean z) {
        this.mMapOverlay.setUseDataConnection(z);
    }

    public void setVerticalMapRepetitionEnabled(boolean z) {
        this.verticalMapRepetitionEnabled = z;
        this.mMapOverlay.setVerticalWrapEnabled(z);
        resetProjection();
        invalidate();
    }

    public double setZoomLevel(double d) {
        double max = Math.max(getMinZoomLevel(), Math.min(getMaxZoomLevel(), d));
        double d2 = this.mZoomLevel;
        int i = (max > d2 ? 1 : (max == d2 ? 0 : -1));
        if (i != 0) {
            Scroller scroller = this.mScroller;
            if (scroller != null) {
                scroller.forceFinished(true);
            }
            this.mIsFlinging = false;
        }
        GeoPoint currentCenter = getProjection().getCurrentCenter();
        this.mZoomLevel = max;
        setExpectedCenter(currentCenter);
        checkZoomButtons();
        ZoomEvent zoomEvent = null;
        if (isLayoutOccurred()) {
            getController().setCenter(currentCenter);
            Point point = new Point();
            Projection projection = getProjection();
            OverlayManager overlayManager = getOverlayManager();
            PointF pointF = this.mMultiTouchScaleInitPoint;
            if (overlayManager.onSnapToItem((int) pointF.x, (int) pointF.y, point, this)) {
                getController().animateTo(projection.fromPixels(point.x, point.y, null, false));
            }
            this.mTileProvider.rescaleCache(projection, max, d2, getScreenRect(this.mRescaleScreenRect));
            this.pauseFling = true;
        }
        if (i != 0) {
            for (MapListener mapListener : this.mListners) {
                if (zoomEvent == null) {
                    zoomEvent = new ZoomEvent(this, max);
                }
                mapListener.onZoom(zoomEvent);
            }
        }
        requestLayout();
        invalidate();
        return this.mZoomLevel;
    }

    public void setZoomRounding(boolean z) {
        this.mZoomRounding = z;
    }

    public void startAnimation() {
        this.mStartAnimationZoom = getZoomLevelDouble();
    }

    public boolean useDataConnection() {
        return this.mMapOverlay.useDataConnection();
    }

    @Deprecated
    public boolean zoomIn() {
        return getController().zoomIn();
    }

    @Deprecated
    public boolean zoomInFixing(int i, int i2) {
        return getController().zoomInFixing(i, i2);
    }

    @Deprecated
    public boolean zoomInFixing(IGeoPoint iGeoPoint) {
        Point pixels = getProjection().toPixels(iGeoPoint, null);
        return getController().zoomInFixing(pixels.x, pixels.y);
    }

    @Deprecated
    public boolean zoomOut() {
        return getController().zoomOut();
    }

    @Deprecated
    public boolean zoomOutFixing(int i, int i2) {
        return getController().zoomOutFixing(i, i2);
    }

    @Deprecated
    public boolean zoomOutFixing(IGeoPoint iGeoPoint) {
        Point pixels = getProjection().toPixels(iGeoPoint, null);
        return zoomOutFixing(pixels.x, pixels.y);
    }

    public double zoomToBoundingBox(BoundingBox boundingBox, boolean z, int i, double d, Long l) {
        int i2 = i * 2;
        double boundingBoxZoom = mTileSystem.getBoundingBoxZoom(boundingBox, getWidth() - i2, getHeight() - i2);
        if (boundingBoxZoom == Double.MIN_VALUE || boundingBoxZoom > d) {
            boundingBoxZoom = d;
        }
        double min = Math.min(getMaxZoomLevel(), Math.max(boundingBoxZoom, getMinZoomLevel()));
        GeoPoint centerWithDateLine = boundingBox.getCenterWithDateLine();
        Projection projection = new Projection(min, getWidth(), getHeight(), centerWithDateLine, getMapOrientation(), isHorizontalMapRepetitionEnabled(), isVerticalMapRepetitionEnabled(), getMapCenterOffsetX(), getMapCenterOffsetY());
        Point point = new Point();
        double centerLongitude = boundingBox.getCenterLongitude();
        projection.toPixels(new GeoPoint(boundingBox.getActualNorth(), centerLongitude), point);
        int i3 = point.y;
        projection.toPixels(new GeoPoint(boundingBox.getActualSouth(), centerLongitude), point);
        int height = ((getHeight() - point.y) - i3) / 2;
        if (height != 0) {
            projection.adjustOffsets(0L, height);
            projection.fromPixels(getWidth() / 2, getHeight() / 2, centerWithDateLine);
        }
        IMapController controller = getController();
        if (z) {
            controller.animateTo(centerWithDateLine, Double.valueOf(min), l);
        } else {
            controller.setZoom(min);
            getController().setCenter(centerWithDateLine);
        }
        return min;
    }

    public void zoomToBoundingBox(BoundingBox boundingBox, boolean z) {
        zoomToBoundingBox(boundingBox, z, 0);
    }

    public void zoomToBoundingBox(BoundingBox boundingBox, boolean z, int i) {
        zoomToBoundingBox(boundingBox, z, i, getMaxZoomLevel(), null);
    }
}
