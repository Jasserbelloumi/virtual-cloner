package org.osmdroid.views.drawing;

import android.graphics.Path;
import android.graphics.Point;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.Projection;
@Deprecated
/* loaded from: classes3.dex */
public class OsmPath extends Path {
    private static final GeoPoint sReferenceGeoPoint = new GeoPoint(0, 0);
    private double mLastZoomLevel;
    public final Point mReferencePoint;

    public OsmPath() {
        this.mReferencePoint = new Point();
        this.mLastZoomLevel = -1.0d;
    }

    public OsmPath(Path path) {
        super(path);
        this.mReferencePoint = new Point();
        this.mLastZoomLevel = -1.0d;
    }

    public void onDrawCycle(Projection projection) {
        if (this.mLastZoomLevel != projection.getZoomLevel()) {
            projection.toPixels(sReferenceGeoPoint, this.mReferencePoint);
            this.mLastZoomLevel = projection.getZoomLevel();
        }
        Point point = this.mReferencePoint;
        int i = point.x;
        int i2 = point.y;
        projection.toPixels(sReferenceGeoPoint, point);
        Point point2 = this.mReferencePoint;
        offset(point2.x - i, point2.y - i2);
    }
}
