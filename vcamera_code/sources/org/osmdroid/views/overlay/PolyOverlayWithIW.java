package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.Distance;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.infowindow.InfoWindow;
import org.osmdroid.views.overlay.milestones.MilestoneManager;
/* loaded from: classes3.dex */
public abstract class PolyOverlayWithIW extends OverlayWithIW {
    private final boolean mClosePath;
    public float mDensity;
    private boolean mDowngradeDisplay;
    private int mDowngradeMaximumPixelSize;
    private int mDowngradeMaximumRectanglePixelSize;
    private float[] mDowngradeSegments;
    public Paint mFillPaint;
    private GeoPoint mInfoWindowLocation;
    private LineDrawer mLineDrawer;
    public LinearRing mOutline;
    public Path mPath;
    public List<LinearRing> mHoles = new ArrayList();
    public Paint mOutlinePaint = new Paint();
    private final List<PaintList> mOutlinePaintLists = new ArrayList();
    private List<MilestoneManager> mMilestoneManagers = new ArrayList();
    private boolean mIsPaintOrPaintList = true;
    private final PointL mVisibilityProjectedCenter = new PointL();
    private final PointL mVisibilityProjectedCorner = new PointL();
    private final PointL mVisibilityRectangleCenter = new PointL();
    private final PointL mVisibilityRectangleCorner = new PointL();
    private final Point mDowngradeTopLeft = new Point();
    private final Point mDowngradeBottomRight = new Point();
    private final PointL mDowngradeCenter = new PointL();
    private final PointL mDowngradeOffset = new PointL();
    private float mDensityMultiplier = 1.0f;

    public PolyOverlayWithIW(MapView mapView, boolean z, boolean z2) {
        this.mDensity = 1.0f;
        this.mClosePath = z2;
        if (mapView != null) {
            setInfoWindow(mapView.getRepository().getDefaultPolylineInfoWindow());
            this.mDensity = mapView.getContext().getResources().getDisplayMetrics().density;
        }
        usePath(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void displayDowngrade(android.graphics.Canvas r23, org.osmdroid.views.Projection r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.PolyOverlayWithIW.displayDowngrade(android.graphics.Canvas, org.osmdroid.views.Projection):void");
    }

    private void drawWithLines(Canvas canvas, Projection projection) {
        InfoWindow infoWindow;
        this.mLineDrawer.setCanvas(canvas);
        this.mOutline.setClipArea(projection);
        boolean z = this.mMilestoneManagers.size() > 0;
        if (this.mIsPaintOrPaintList) {
            this.mLineDrawer.setPaint(getOutlinePaint());
            this.mOutline.buildLinePortion(projection, z);
        } else {
            for (PaintList paintList : getOutlinePaintLists()) {
                this.mLineDrawer.setPaint(paintList);
                this.mOutline.buildLinePortion(projection, z);
                z = false;
            }
        }
        for (MilestoneManager milestoneManager : this.mMilestoneManagers) {
            milestoneManager.init();
            milestoneManager.setDistances(this.mOutline.getDistances());
            Iterator<PointL> it = this.mOutline.getPointsForMilestones().iterator();
            while (it.hasNext()) {
                PointL next = it.next();
                milestoneManager.add(next.x, next.y);
            }
            milestoneManager.end();
        }
        for (MilestoneManager milestoneManager2 : this.mMilestoneManagers) {
            milestoneManager2.draw(canvas);
        }
        if (isInfoWindowOpen() && (infoWindow = this.mInfoWindow) != null && infoWindow.getRelatedObject() == this) {
            this.mInfoWindow.draw();
        }
    }

    private void drawWithPath(Canvas canvas, Projection projection) {
        InfoWindow infoWindow;
        this.mPath.rewind();
        this.mOutline.setClipArea(projection);
        PointL buildPathPortion = this.mOutline.buildPathPortion(projection, null, this.mMilestoneManagers.size() > 0);
        for (MilestoneManager milestoneManager : this.mMilestoneManagers) {
            milestoneManager.init();
            milestoneManager.setDistances(this.mOutline.getDistances());
            Iterator<PointL> it = this.mOutline.getPointsForMilestones().iterator();
            while (it.hasNext()) {
                PointL next = it.next();
                milestoneManager.add(next.x, next.y);
            }
            milestoneManager.end();
        }
        List<LinearRing> list = this.mHoles;
        if (list != null) {
            for (LinearRing linearRing : list) {
                linearRing.setClipArea(projection);
                linearRing.buildPathPortion(projection, buildPathPortion, this.mMilestoneManagers.size() > 0);
            }
            this.mPath.setFillType(Path.FillType.EVEN_ODD);
        }
        if (isVisible(this.mFillPaint)) {
            canvas.drawPath(this.mPath, this.mFillPaint);
        }
        if (isVisible(this.mOutlinePaint)) {
            canvas.drawPath(this.mPath, this.mOutlinePaint);
        }
        for (MilestoneManager milestoneManager2 : this.mMilestoneManagers) {
            milestoneManager2.draw(canvas);
        }
        if (isInfoWindowOpen() && (infoWindow = this.mInfoWindow) != null && infoWindow.getRelatedObject() == this) {
            this.mInfoWindow.draw();
        }
    }

    private boolean isVisible(Paint paint) {
        return (paint == null || paint.getColor() == 0) ? false : true;
    }

    private boolean isVisible(Projection projection) {
        PointL pointL;
        BoundingBox bounds = getBounds();
        projection.toProjectedPixels(bounds.getCenterLatitude(), bounds.getCenterLongitude(), this.mVisibilityProjectedCenter);
        projection.toProjectedPixels(bounds.getLatNorth(), bounds.getLonEast(), this.mVisibilityProjectedCorner);
        projection.getLongPixelsFromProjected(this.mVisibilityProjectedCenter, projection.getProjectedPowerDifference(), true, this.mVisibilityRectangleCenter);
        projection.getLongPixelsFromProjected(this.mVisibilityProjectedCorner, projection.getProjectedPowerDifference(), true, this.mVisibilityRectangleCorner);
        double d = this.mVisibilityRectangleCenter.y;
        PointL pointL2 = this.mVisibilityRectangleCorner;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(pointL.x, d, pointL2.x, pointL2.y));
        PointL pointL3 = this.mVisibilityRectangleCenter;
        double d2 = pointL3.y;
        double width = projection.getWidth() / 2;
        double height = projection.getHeight() / 2;
        return Math.sqrt(Distance.getSquaredDistanceToPoint((double) pointL3.x, d2, width, height)) <= Math.sqrt(Distance.getSquaredDistanceToPoint(0.0d, 0.0d, width, height)) + sqrt;
    }

    private boolean isWorthDisplaying(Projection projection) {
        BoundingBox bounds = getBounds();
        projection.toPixels(new GeoPoint(bounds.getLatNorth(), bounds.getLonEast()), this.mDowngradeTopLeft);
        projection.toPixels(new GeoPoint(bounds.getLatSouth(), bounds.getLonWest()), this.mDowngradeBottomRight);
        double worldMapSize = projection.getWorldMapSize();
        return Math.abs(this.mDowngradeTopLeft.x - this.mDowngradeBottomRight.x) >= this.mDowngradeMaximumPixelSize && Math.abs(((long) this.mDowngradeTopLeft.x) - Math.round(LinearRing.getCloserValue((double) this.mDowngradeTopLeft.x, (double) this.mDowngradeBottomRight.x, worldMapSize))) >= ((long) this.mDowngradeMaximumPixelSize) && Math.abs(this.mDowngradeTopLeft.y - this.mDowngradeBottomRight.y) >= this.mDowngradeMaximumPixelSize && Math.abs(((long) this.mDowngradeTopLeft.y) - Math.round(LinearRing.getCloserValue((double) this.mDowngradeTopLeft.y, (double) this.mDowngradeBottomRight.y, worldMapSize))) >= ((long) this.mDowngradeMaximumPixelSize);
    }

    public void addPoint(GeoPoint geoPoint) {
        this.mOutline.addPoint(geoPoint);
    }

    public abstract boolean click(MapView mapView, GeoPoint geoPoint);

    public boolean contains(MotionEvent motionEvent) {
        if (this.mPath.isEmpty()) {
            return false;
        }
        RectF rectF = new RectF();
        this.mPath.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(this.mPath, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (isVisible(projection)) {
            if (this.mDowngradeMaximumPixelSize > 0 && !isWorthDisplaying(projection)) {
                if (this.mDowngradeDisplay) {
                    displayDowngrade(canvas, projection);
                }
            } else if (this.mPath != null) {
                drawWithPath(canvas, projection);
            } else {
                drawWithLines(canvas, projection);
            }
        }
    }

    public List<GeoPoint> getActualPoints() {
        return this.mOutline.getPoints();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public BoundingBox getBounds() {
        return this.mOutline.getBoundingBox();
    }

    public GeoPoint getCloseTo(GeoPoint geoPoint, double d, MapView mapView) {
        return this.mOutline.getCloseTo(geoPoint, d, mapView.getProjection(), this.mClosePath);
    }

    public double getDistance() {
        return this.mOutline.getDistance();
    }

    public Paint getFillPaint() {
        return this.mFillPaint;
    }

    public GeoPoint getInfoWindowLocation() {
        return this.mInfoWindowLocation;
    }

    public Paint getOutlinePaint() {
        this.mIsPaintOrPaintList = true;
        return this.mOutlinePaint;
    }

    public List<PaintList> getOutlinePaintLists() {
        this.mIsPaintOrPaintList = false;
        return this.mOutlinePaintLists;
    }

    public boolean isCloseTo(GeoPoint geoPoint, double d, MapView mapView) {
        return getCloseTo(geoPoint, d, mapView) != null;
    }

    public boolean isGeodesic() {
        return this.mOutline.isGeodesic();
    }

    public boolean isVisible() {
        return isEnabled();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        LinearRing linearRing = this.mOutline;
        if (linearRing != null) {
            linearRing.clear();
            this.mOutline = null;
        }
        this.mHoles.clear();
        this.mMilestoneManagers.clear();
        onDestroy();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        GeoPoint geoPoint = (GeoPoint) mapView.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY());
        if (this.mPath == null) {
            geoPoint = getCloseTo(geoPoint, this.mOutlinePaint.getStrokeWidth() * this.mDensity * this.mDensityMultiplier, mapView);
        } else if (!contains(motionEvent)) {
            geoPoint = null;
        }
        if (geoPoint != null) {
            return click(mapView, geoPoint);
        }
        return false;
    }

    public void setDefaultInfoWindowLocation() {
        if (this.mOutline.getPoints().size() == 0) {
            this.mInfoWindowLocation = new GeoPoint(0.0d, 0.0d);
            return;
        }
        if (this.mInfoWindowLocation == null) {
            this.mInfoWindowLocation = new GeoPoint(0.0d, 0.0d);
        }
        this.mOutline.getCenter(this.mInfoWindowLocation);
    }

    public void setDensityMultiplier(float f) {
        this.mDensityMultiplier = f;
    }

    public void setDowngradeDisplay(boolean z) {
        this.mDowngradeDisplay = z;
    }

    public void setDowngradePixelSizes(int i, int i2) {
        this.mDowngradeMaximumRectanglePixelSize = i2;
        this.mDowngradeMaximumPixelSize = Math.max(i, i2);
    }

    public void setGeodesic(boolean z) {
        this.mOutline.setGeodesic(z);
    }

    @Override // org.osmdroid.views.overlay.OverlayWithIW
    public void setInfoWindow(InfoWindow infoWindow) {
        InfoWindow infoWindow2 = this.mInfoWindow;
        if (infoWindow2 != null && infoWindow2.getRelatedObject() == this) {
            this.mInfoWindow.setRelatedObject(null);
        }
        this.mInfoWindow = infoWindow;
    }

    public void setInfoWindowLocation(GeoPoint geoPoint) {
        this.mInfoWindowLocation = geoPoint;
    }

    public void setMilestoneManagers(List<MilestoneManager> list) {
        if (list != null) {
            this.mMilestoneManagers = list;
        } else if (this.mMilestoneManagers.size() > 0) {
            this.mMilestoneManagers.clear();
        }
    }

    public void setPoints(List<GeoPoint> list) {
        this.mOutline.setPoints(list);
        setDefaultInfoWindowLocation();
    }

    public void setVisible(boolean z) {
        setEnabled(z);
    }

    public void showInfoWindow() {
        GeoPoint geoPoint;
        InfoWindow infoWindow = this.mInfoWindow;
        if (infoWindow == null || (geoPoint = this.mInfoWindowLocation) == null) {
            return;
        }
        infoWindow.open(this, geoPoint, 0, 0);
    }

    public void usePath(boolean z) {
        LinearRing linearRing = this.mOutline;
        ArrayList<GeoPoint> points = linearRing == null ? null : linearRing.getPoints();
        if (z) {
            Path path = new Path();
            this.mPath = path;
            this.mLineDrawer = null;
            this.mOutline = new LinearRing(path, this.mClosePath);
        } else {
            this.mPath = null;
            LineDrawer lineDrawer = new LineDrawer(256);
            this.mLineDrawer = lineDrawer;
            this.mOutline = new LinearRing(lineDrawer, this.mClosePath);
            this.mLineDrawer.setPaint(this.mOutlinePaint);
        }
        if (points != null) {
            setPoints(points);
        }
    }
}
