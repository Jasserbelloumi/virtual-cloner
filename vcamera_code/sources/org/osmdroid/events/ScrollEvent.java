package org.osmdroid.events;

import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class ScrollEvent implements MapEvent {
    public MapView source;
    public int x;
    public int y;

    public ScrollEvent(MapView mapView, int i, int i2) {
        this.source = mapView;
        this.x = i;
        this.y = i2;
    }

    public MapView getSource() {
        return this.source;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ScrollEvent [source=");
        o00oOOo02.append(this.source);
        o00oOOo02.append(", x=");
        o00oOOo02.append(this.x);
        o00oOOo02.append(", y=");
        return o00oOo00.o00oOOo0(o00oOOo02, this.y, "]");
    }
}
