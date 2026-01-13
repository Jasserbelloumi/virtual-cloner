package org.osmdroid.views.util;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
@Deprecated
/* loaded from: classes3.dex */
public class PathProjection {
    public static Path toPixels(Projection projection, List<? extends GeoPoint> list, Path path) {
        return toPixels(projection, list, path, true);
    }

    public static Path toPixels(Projection projection, List<? extends GeoPoint> list, Path path, boolean z) throws IllegalArgumentException {
        if (list.size() >= 2) {
            Path path2 = path != null ? path : new Path();
            path2.incReserve(list.size());
            TileSystem tileSystem = MapView.getTileSystem();
            Iterator<? extends GeoPoint> it = list.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                GeoPoint next = it.next();
                Point point = new Point();
                double MapSize = TileSystem.MapSize(projection.getZoomLevel());
                PointL mercatorFromGeo = tileSystem.getMercatorFromGeo(next.getLatitude(), next.getLongitude(), MapSize, null, true);
                point.x = projection.getTileFromMercator(mercatorFromGeo.x);
                point.y = projection.getTileFromMercator(mercatorFromGeo.y);
                PointL pointL = new PointL(projection.getMercatorFromTile(point.x), projection.getMercatorFromTile(point.y));
                PointL pointL2 = new PointL(projection.getMercatorFromTile(TileSystem.getTileSize() + point.x), projection.getMercatorFromTile(TileSystem.getTileSize() + point.y));
                Iterator<? extends GeoPoint> it2 = it;
                GeoPoint geoFromMercator = tileSystem.getGeoFromMercator(pointL.x, pointL.y, MapSize, null, true, true);
                GeoPoint geoFromMercator2 = tileSystem.getGeoFromMercator(pointL2.x, pointL2.y, MapSize, null, true, true);
                BoundingBox boundingBox = new BoundingBox(geoFromMercator.getLatitude(), geoFromMercator.getLongitude(), geoFromMercator2.getLatitude(), geoFromMercator2.getLongitude());
                PointF relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation = (!z || projection.getZoomLevel() >= 7.0d) ? boundingBox.getRelativePositionOfGeoPointInBoundingBoxWithLinearInterpolation(next.getLatitude(), next.getLongitude(), null) : boundingBox.getRelativePositionOfGeoPointInBoundingBoxWithExactGudermannInterpolation(next.getLatitude(), next.getLongitude(), null);
                Rect screenRect = projection.getScreenRect();
                Point point2 = new Point(projection.getTileFromMercator(screenRect.centerX()), projection.getTileFromMercator(screenRect.centerY()));
                PointL pointL3 = new PointL(projection.getMercatorFromTile(point2.x), projection.getMercatorFromTile(point2.y));
                int i = point2.x - point.x;
                int i2 = point2.y - point.y;
                long tileSize = pointL3.x - (TileSystem.getTileSize() * i);
                long tileSize2 = (pointL3.y - (TileSystem.getTileSize() * i2)) + (relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation.y * TileSystem.getTileSize());
                float tileSize3 = (float) (tileSize + (relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation.x * TileSystem.getTileSize()));
                float f = (float) tileSize2;
                if (z2) {
                    path2.moveTo(tileSize3, f);
                } else {
                    path2.lineTo(tileSize3, f);
                }
                z2 = false;
                it = it2;
            }
            return path2;
        }
        throw new IllegalArgumentException("List of GeoPoints needs to be at least 2.");
    }
}
