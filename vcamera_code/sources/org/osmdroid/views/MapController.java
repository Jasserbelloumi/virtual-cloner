package org.osmdroid.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MyMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class MapController implements IMapController, MapView.OnFirstLayoutListener {
    private Animator mCurrentAnimator;
    public final MapView mMapView;
    private ScaleAnimation mZoomInAnimationOld;
    private ScaleAnimation mZoomOutAnimationOld;
    private double mTargetZoomLevel = 0.0d;
    private ReplayController mReplayController = new ReplayController(this, null);

    /* renamed from: org.osmdroid.views.MapController$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$MapController$ReplayType;

        static {
            int[] iArr = new int[ReplayType.values().length];
            $SwitchMap$org$osmdroid$views$MapController$ReplayType = iArr;
            try {
                iArr[ReplayType.AnimateToGeoPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.AnimateToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.SetCenterPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$osmdroid$views$MapController$ReplayType[ReplayType.ZoomToSpanPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @TargetApi(11)
    /* loaded from: classes3.dex */
    public static class MapAnimatorListener implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        private final GeoPoint mCenter = new GeoPoint(0.0d, 0.0d);
        private final IGeoPoint mCenterEnd;
        private final IGeoPoint mCenterStart;
        private final MapController mMapController;
        private final Float mOrientationSpan;
        private final Float mOrientationStart;
        private final Double mZoomEnd;
        private final Double mZoomStart;

        public MapAnimatorListener(MapController mapController, Double d, Double d2, IGeoPoint iGeoPoint, IGeoPoint iGeoPoint2, Float f, Float f2, Boolean bool) {
            Float valueOf;
            this.mMapController = mapController;
            this.mZoomStart = d;
            this.mZoomEnd = d2;
            this.mCenterStart = iGeoPoint;
            this.mCenterEnd = iGeoPoint2;
            if (f2 == null) {
                valueOf = null;
                this.mOrientationStart = null;
            } else {
                this.mOrientationStart = f;
                valueOf = Float.valueOf((float) MyMath.getAngleDifference(f.floatValue(), f2.floatValue(), bool));
            }
            this.mOrientationSpan = valueOf;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.mMapController.onAnimationStart();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.mZoomEnd != null) {
                this.mMapController.mMapView.setZoomLevel(((this.mZoomEnd.doubleValue() - this.mZoomStart.doubleValue()) * floatValue) + this.mZoomStart.doubleValue());
            }
            if (this.mOrientationSpan != null) {
                this.mMapController.mMapView.setMapOrientation((this.mOrientationSpan.floatValue() * floatValue) + this.mOrientationStart.floatValue());
            }
            if (this.mCenterEnd != null) {
                MapView mapView = this.mMapController.mMapView;
                TileSystem tileSystem = MapView.getTileSystem();
                double cleanLongitude = tileSystem.cleanLongitude(this.mCenterStart.getLongitude());
                double d = floatValue;
                double cleanLongitude2 = tileSystem.cleanLongitude(((tileSystem.cleanLongitude(this.mCenterEnd.getLongitude()) - cleanLongitude) * d) + cleanLongitude);
                double cleanLatitude = tileSystem.cleanLatitude(this.mCenterStart.getLatitude());
                this.mCenter.setCoords(tileSystem.cleanLatitude(((tileSystem.cleanLatitude(this.mCenterEnd.getLatitude()) - cleanLatitude) * d) + cleanLatitude), cleanLongitude2);
                this.mMapController.mMapView.setExpectedCenter(this.mCenter);
            }
            this.mMapController.mMapView.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class ReplayController {
        private LinkedList<ReplayClass> mReplayList;

        /* loaded from: classes3.dex */
        public class ReplayClass {
            private final Boolean mClockwise;
            private IGeoPoint mGeoPoint;
            private final Float mOrientation;
            private Point mPoint;
            private ReplayType mReplayType;
            private final Long mSpeed;
            private final Double mZoom;

            public ReplayClass(ReplayController replayController, ReplayType replayType, Point point, IGeoPoint iGeoPoint) {
                this(replayType, point, iGeoPoint, null, null, null, null);
            }

            public ReplayClass(ReplayType replayType, Point point, IGeoPoint iGeoPoint, Double d, Long l, Float f, Boolean bool) {
                this.mReplayType = replayType;
                this.mPoint = point;
                this.mGeoPoint = iGeoPoint;
                this.mSpeed = l;
                this.mZoom = d;
                this.mOrientation = f;
                this.mClockwise = bool;
            }
        }

        private ReplayController() {
            this.mReplayList = new LinkedList<>();
        }

        public /* synthetic */ ReplayController(MapController mapController, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void animateTo(int i, int i2) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.AnimateToPoint, new Point(i, i2), null));
        }

        public void animateTo(IGeoPoint iGeoPoint, Double d, Long l, Float f, Boolean bool) {
            this.mReplayList.add(new ReplayClass(ReplayType.AnimateToGeoPoint, null, iGeoPoint, d, l, f, bool));
        }

        public void replayCalls() {
            Iterator<ReplayClass> it = this.mReplayList.iterator();
            while (it.hasNext()) {
                ReplayClass next = it.next();
                int i = AnonymousClass1.$SwitchMap$org$osmdroid$views$MapController$ReplayType[next.mReplayType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && next.mPoint != null) {
                                MapController.this.zoomToSpan(next.mPoint.x, next.mPoint.y);
                            }
                        } else if (next.mGeoPoint != null) {
                            MapController.this.setCenter(next.mGeoPoint);
                        }
                    } else if (next.mPoint != null) {
                        MapController.this.animateTo(next.mPoint.x, next.mPoint.y);
                    }
                } else if (next.mGeoPoint != null) {
                    MapController.this.animateTo(next.mGeoPoint, next.mZoom, next.mSpeed, next.mOrientation, next.mClockwise);
                }
            }
            this.mReplayList.clear();
        }

        public void setCenter(IGeoPoint iGeoPoint) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.SetCenterPoint, null, iGeoPoint));
        }

        public void zoomToSpan(double d, double d2) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.ZoomToSpanPoint, new Point((int) (d * 1000000.0d), (int) (d2 * 1000000.0d)), null));
        }

        public void zoomToSpan(int i, int i2) {
            this.mReplayList.add(new ReplayClass(this, ReplayType.ZoomToSpanPoint, new Point(i, i2), null));
        }
    }

    /* loaded from: classes3.dex */
    public enum ReplayType {
        ZoomToSpanPoint,
        AnimateToPoint,
        AnimateToGeoPoint,
        SetCenterPoint
    }

    /* loaded from: classes3.dex */
    public static class ZoomAnimationListener implements Animation.AnimationListener {
        private MapController mMapController;

        public ZoomAnimationListener(MapController mapController) {
            this.mMapController = mapController;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.mMapController.onAnimationEnd();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.mMapController.onAnimationStart();
        }
    }

    public MapController(MapView mapView) {
        this.mMapView = mapView;
        if (mapView.isLayoutOccurred()) {
            return;
        }
        mapView.addOnFirstLayoutListener(this);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(int i, int i2) {
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.animateTo(i, i2);
        } else if (this.mMapView.isAnimating()) {
        } else {
            MapView mapView = this.mMapView;
            mapView.mIsFlinging = false;
            int mapScrollX = (int) mapView.getMapScrollX();
            int mapScrollY = (int) this.mMapView.getMapScrollY();
            int width = i - (this.mMapView.getWidth() / 2);
            int height = i2 - (this.mMapView.getHeight() / 2);
            if (width == mapScrollX && height == mapScrollY) {
                return;
            }
            this.mMapView.getScroller().startScroll(mapScrollX, mapScrollY, width, height, Configuration.getInstance().getAnimationSpeedDefault());
            this.mMapView.postInvalidate();
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint) {
        animateTo(iGeoPoint, null, null);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d, Long l) {
        animateTo(iGeoPoint, d, l, null);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d, Long l, Float f) {
        animateTo(iGeoPoint, d, l, f, null);
    }

    @Override // org.osmdroid.api.IMapController
    public void animateTo(IGeoPoint iGeoPoint, Double d, Long l, Float f, Boolean bool) {
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.animateTo(iGeoPoint, d, l, f, bool);
            return;
        }
        MapAnimatorListener mapAnimatorListener = new MapAnimatorListener(this, Double.valueOf(this.mMapView.getZoomLevelDouble()), d, new GeoPoint(this.mMapView.getProjection().getCurrentCenter()), iGeoPoint, Float.valueOf(this.mMapView.getMapOrientation()), f, bool);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(mapAnimatorListener);
        ofFloat.addUpdateListener(mapAnimatorListener);
        ofFloat.setDuration(l == null ? Configuration.getInstance().getAnimationSpeedDefault() : l.longValue());
        Animator animator = this.mCurrentAnimator;
        if (animator != null) {
            mapAnimatorListener.onAnimationCancel(animator);
        }
        this.mCurrentAnimator = ofFloat;
        ofFloat.start();
    }

    public void onAnimationEnd() {
        this.mMapView.mIsAnimating.set(false);
        this.mMapView.resetMultiTouchScale();
        this.mCurrentAnimator = null;
        this.mMapView.invalidate();
    }

    public void onAnimationStart() {
        this.mMapView.mIsAnimating.set(true);
    }

    @Override // org.osmdroid.views.MapView.OnFirstLayoutListener
    public void onFirstLayout(View view, int i, int i2, int i3, int i4) {
        this.mReplayController.replayCalls();
    }

    @Override // org.osmdroid.api.IMapController
    public void scrollBy(int i, int i2) {
        this.mMapView.scrollBy(i, i2);
    }

    @Override // org.osmdroid.api.IMapController
    public void setCenter(IGeoPoint iGeoPoint) {
        if (this.mMapView.isLayoutOccurred()) {
            this.mMapView.setExpectedCenter(iGeoPoint);
        } else {
            this.mReplayController.setCenter(iGeoPoint);
        }
    }

    @Override // org.osmdroid.api.IMapController
    public double setZoom(double d) {
        return this.mMapView.setZoomLevel(d);
    }

    @Override // org.osmdroid.api.IMapController
    public int setZoom(int i) {
        return (int) setZoom(i);
    }

    @Override // org.osmdroid.api.IMapController
    public void stopAnimation(boolean z) {
        if (!this.mMapView.getScroller().isFinished()) {
            if (z) {
                MapView mapView = this.mMapView;
                mapView.mIsFlinging = false;
                mapView.getScroller().abortAnimation();
            } else {
                stopPanning();
            }
        }
        Animator animator = this.mCurrentAnimator;
        if (this.mMapView.mIsAnimating.get()) {
            if (z) {
                animator.end();
            } else {
                animator.cancel();
            }
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void stopPanning() {
        MapView mapView = this.mMapView;
        mapView.mIsFlinging = false;
        mapView.getScroller().forceFinished(true);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomIn() {
        return zoomIn(null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomIn(Long l) {
        return zoomTo(this.mMapView.getZoomLevelDouble() + 1.0d, l);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomInFixing(int i, int i2) {
        return zoomInFixing(i, i2, null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomInFixing(int i, int i2, Long l) {
        return zoomToFixing(this.mMapView.getZoomLevelDouble() + 1.0d, i, i2, l);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomOut() {
        return zoomOut(null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomOut(Long l) {
        return zoomTo(this.mMapView.getZoomLevelDouble() - 1.0d, l);
    }

    @Override // org.osmdroid.api.IMapController
    @Deprecated
    public boolean zoomOutFixing(int i, int i2) {
        return zoomToFixing(this.mMapView.getZoomLevelDouble() - 1.0d, i, i2, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(double d) {
        return zoomTo(d, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(double d, Long l) {
        return zoomToFixing(d, this.mMapView.getWidth() / 2, this.mMapView.getHeight() / 2, l);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(int i) {
        return zoomTo(i, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomTo(int i, Long l) {
        return zoomTo(i, l);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(double d, int i, int i2) {
        return zoomToFixing(d, i, i2, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(double d, int i, int i2, Long l) {
        double maxZoomLevel = d > this.mMapView.getMaxZoomLevel() ? this.mMapView.getMaxZoomLevel() : d;
        if (maxZoomLevel < this.mMapView.getMinZoomLevel()) {
            maxZoomLevel = this.mMapView.getMinZoomLevel();
        }
        double zoomLevelDouble = this.mMapView.getZoomLevelDouble();
        if (((maxZoomLevel < zoomLevelDouble && this.mMapView.canZoomOut()) || (maxZoomLevel > zoomLevelDouble && this.mMapView.canZoomIn())) && !this.mMapView.mIsAnimating.getAndSet(true)) {
            ZoomEvent zoomEvent = null;
            for (MapListener mapListener : this.mMapView.mListners) {
                if (zoomEvent == null) {
                    zoomEvent = new ZoomEvent(this.mMapView, maxZoomLevel);
                }
                mapListener.onZoom(zoomEvent);
            }
            this.mMapView.setMultiTouchScaleInitPoint(i, i2);
            this.mMapView.startAnimation();
            Math.pow(2.0d, maxZoomLevel - zoomLevelDouble);
            MapAnimatorListener mapAnimatorListener = new MapAnimatorListener(this, Double.valueOf(zoomLevelDouble), Double.valueOf(maxZoomLevel), null, null, null, null, null);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addListener(mapAnimatorListener);
            ofFloat.addUpdateListener(mapAnimatorListener);
            ofFloat.setDuration(l == null ? Configuration.getInstance().getAnimationSpeedShort() : l.longValue());
            this.mCurrentAnimator = ofFloat;
            ofFloat.start();
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(int i, int i2, int i3) {
        return zoomToFixing(i, i2, i3, (Long) null);
    }

    @Override // org.osmdroid.api.IMapController
    public boolean zoomToFixing(int i, int i2, int i3, Long l) {
        return zoomToFixing(i, i2, i3, l);
    }

    @Override // org.osmdroid.api.IMapController
    public void zoomToSpan(double d, double d2) {
        if (d <= 0.0d || d2 <= 0.0d) {
            return;
        }
        if (!this.mMapView.isLayoutOccurred()) {
            this.mReplayController.zoomToSpan(d, d2);
            return;
        }
        BoundingBox boundingBox = this.mMapView.getProjection().getBoundingBox();
        double zoomLevel = this.mMapView.getProjection().getZoomLevel();
        double max = Math.max(d / boundingBox.getLatitudeSpan(), d2 / boundingBox.getLongitudeSpan());
        if (max > 1.0d) {
            this.mMapView.setZoomLevel(zoomLevel - MyMath.getNextSquareNumberAbove((float) max));
        } else if (max < 0.5d) {
            this.mMapView.setZoomLevel((zoomLevel + MyMath.getNextSquareNumberAbove(1.0f / ((float) max))) - 1.0d);
        }
    }

    @Override // org.osmdroid.api.IMapController
    public void zoomToSpan(int i, int i2) {
        zoomToSpan(i * 1.0E-6d, i2 * 1.0E-6d);
    }
}
