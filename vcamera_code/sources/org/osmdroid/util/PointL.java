package org.osmdroid.util;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.o00oOo00;
/* loaded from: classes3.dex */
public class PointL {
    public long x;
    public long y;

    public PointL() {
    }

    public PointL(long j, long j2) {
        this.x = j;
        this.y = j2;
    }

    public PointL(PointL pointL) {
        set(pointL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointL) {
            PointL pointL = (PointL) obj;
            return this.x == pointL.x && this.y == pointL.y;
        }
        return false;
    }

    public final void offset(long j, long j2) {
        this.x += j;
        this.y += j2;
    }

    public void set(long j, long j2) {
        this.x = j;
        this.y = j2;
    }

    public void set(PointL pointL) {
        this.x = pointL.x;
        this.y = pointL.y;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("PointL(");
        o00oOOo02.append(this.x);
        o00oOOo02.append(", ");
        return o00oOo00.o00oOOo0(o00oOOo02, this.y, ")");
    }
}
