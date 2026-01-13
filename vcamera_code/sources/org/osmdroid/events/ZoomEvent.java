package org.osmdroid.events;

import android.support.v4.media.o00oOo0O;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class ZoomEvent implements MapEvent {
    public MapView source;
    public double zoomLevel;

    public ZoomEvent(MapView mapView, double d) {
        this.source = mapView;
        this.zoomLevel = d;
    }

    public MapView getSource() {
        return this.source;
    }

    public double getZoomLevel() {
        return this.zoomLevel;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ZoomEvent [source=");
        o00oOOo02.append(this.source);
        o00oOOo02.append(", zoomLevel=");
        o00oOOo02.append(this.zoomLevel);
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
