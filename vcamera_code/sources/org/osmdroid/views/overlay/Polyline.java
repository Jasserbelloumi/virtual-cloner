package org.osmdroid.views.overlay;

import android.graphics.Paint;
import java.util.ArrayList;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class Polyline extends PolyOverlayWithIW {
    public OnClickListener mOnClickListener;

    /* loaded from: classes3.dex */
    public interface OnClickListener {
        boolean onClick(Polyline polyline, MapView mapView, GeoPoint geoPoint);
    }

    public Polyline() {
        this(null);
    }

    public Polyline(MapView mapView) {
        this(mapView, false);
    }

    public Polyline(MapView mapView, boolean z) {
        this(mapView, z, false);
    }

    public Polyline(MapView mapView, boolean z, boolean z2) {
        super(mapView, z, z2);
        this.mOutlinePaint.setColor(-16777216);
        this.mOutlinePaint.setStrokeWidth(10.0f);
        this.mOutlinePaint.setStyle(Paint.Style.STROKE);
        this.mOutlinePaint.setAntiAlias(true);
    }

    @Override // org.osmdroid.views.overlay.PolyOverlayWithIW
    public boolean click(MapView mapView, GeoPoint geoPoint) {
        OnClickListener onClickListener = this.mOnClickListener;
        return onClickListener == null ? onClickDefault(this, mapView, geoPoint) : onClickListener.onClick(this, mapView, geoPoint);
    }

    @Deprecated
    public int getColor() {
        return this.mOutlinePaint.getColor();
    }

    @Override // org.osmdroid.views.overlay.PolyOverlayWithIW
    public double getDistance() {
        return this.mOutline.getDistance();
    }

    @Deprecated
    public Paint getPaint() {
        return getOutlinePaint();
    }

    @Deprecated
    public ArrayList<GeoPoint> getPoints() {
        return new ArrayList<>(getActualPoints());
    }

    @Deprecated
    public float getWidth() {
        return this.mOutlinePaint.getStrokeWidth();
    }

    public boolean onClickDefault(Polyline polyline, MapView mapView, GeoPoint geoPoint) {
        polyline.setInfoWindowLocation(geoPoint);
        polyline.showInfoWindow();
        return true;
    }

    @Override // org.osmdroid.views.overlay.PolyOverlayWithIW, org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        super.onDetach(mapView);
        this.mOnClickListener = null;
    }

    @Deprecated
    public void setColor(int i) {
        this.mOutlinePaint.setColor(i);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    @Deprecated
    public void setWidth(float f) {
        this.mOutlinePaint.setStrokeWidth(f);
    }
}
