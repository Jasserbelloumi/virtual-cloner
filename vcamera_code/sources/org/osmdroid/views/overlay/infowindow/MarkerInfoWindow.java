package org.osmdroid.views.overlay.infowindow;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
/* loaded from: classes3.dex */
public class MarkerInfoWindow extends BasicInfoWindow {
    public Marker mMarkerRef;

    public MarkerInfoWindow(int i, MapView mapView) {
        super(i, mapView);
    }

    public Marker getMarkerReference() {
        return this.mMarkerRef;
    }

    @Override // org.osmdroid.views.overlay.infowindow.BasicInfoWindow, org.osmdroid.views.overlay.infowindow.InfoWindow
    public void onClose() {
        super.onClose();
        this.mMarkerRef = null;
    }

    @Override // org.osmdroid.views.overlay.infowindow.BasicInfoWindow, org.osmdroid.views.overlay.infowindow.InfoWindow
    public void onOpen(Object obj) {
        int i;
        super.onOpen(obj);
        this.mMarkerRef = (Marker) obj;
        View view = this.mView;
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(BasicInfoWindow.mImageId);
        Drawable image = this.mMarkerRef.getImage();
        if (image != null) {
            imageView.setImageDrawable(image);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
