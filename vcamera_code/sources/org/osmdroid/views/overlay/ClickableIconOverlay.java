package org.osmdroid.views.overlay;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
/* loaded from: classes3.dex */
public abstract class ClickableIconOverlay<DataType> extends IconOverlay {
    private DataType mData;
    public int mId = 0;

    public ClickableIconOverlay(DataType datatype) {
        this.mData = datatype;
    }

    public static ClickableIconOverlay find(List<ClickableIconOverlay> list, int i) {
        for (ClickableIconOverlay clickableIconOverlay : list) {
            if (clickableIconOverlay != null && clickableIconOverlay.mId == i) {
                return clickableIconOverlay;
            }
        }
        return null;
    }

    public DataType getData() {
        return this.mData;
    }

    public int getID() {
        return this.mId;
    }

    public boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        Point point;
        Projection projection = mapView.getProjection();
        IGeoPoint iGeoPoint = this.mPosition;
        if (iGeoPoint == null || (point = this.mPositionPixels) == null || projection == null) {
            return false;
        }
        projection.toPixels(iGeoPoint, point);
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        return this.mIcon.getBounds().contains((-this.mPositionPixels.x) + intrinsicScreenRect.left + ((int) motionEvent.getX()), (-this.mPositionPixels.y) + intrinsicScreenRect.top + ((int) motionEvent.getY()));
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        return hitTest(motionEvent, mapView) ? onMarkerLongPress(mapView, this.mId, this.mPosition, this.mData) : super.onLongPress(motionEvent, mapView);
    }

    public abstract boolean onMarkerClicked(MapView mapView, int i, IGeoPoint iGeoPoint, DataType datatype);

    public boolean onMarkerLongPress(MapView mapView, int i, IGeoPoint iGeoPoint, Object obj) {
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        return hitTest(motionEvent, mapView) ? onMarkerClicked(mapView, this.mId, this.mPosition, this.mData) : super.onSingleTapConfirmed(motionEvent, mapView);
    }

    public ClickableIconOverlay set(int i, IGeoPoint iGeoPoint, Drawable drawable, DataType datatype) {
        set(iGeoPoint, drawable);
        this.mId = i;
        this.mData = datatype;
        return this;
    }
}
