package o00oooOo;

import android.graphics.PointF;
import android.support.v4.media.o00oOo0O;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class oOO0O0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final PointF f9798o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float f9799o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final PointF f9800o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final float f9801o00oOooO;

    public oOO0O0O(@oo0oO0 PointF pointF, float f, @oo0oO0 PointF pointF2, float f2) {
        this.f9798o00oOOo0 = (PointF) ooOOOOoo.o00oo00O(pointF, "start == null");
        this.f9799o00oOOoO = f;
        this.f9800o00oOo00 = (PointF) ooOOOOoo.o00oo00O(pointF2, "end == null");
        this.f9801o00oOooO = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oOO0O0O) {
            oOO0O0O ooo0o0o = (oOO0O0O) obj;
            return Float.compare(this.f9799o00oOOoO, ooo0o0o.f9799o00oOOoO) == 0 && Float.compare(this.f9801o00oOooO, ooo0o0o.f9801o00oOooO) == 0 && this.f9798o00oOOo0.equals(ooo0o0o.f9798o00oOOo0) && this.f9800o00oOo00.equals(ooo0o0o.f9800o00oOo00);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9798o00oOOo0.hashCode() * 31;
        float f = this.f9799o00oOOoO;
        int hashCode2 = (this.f9800o00oOo00.hashCode() + ((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31)) * 31;
        float f2 = this.f9801o00oOooO;
        return hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    @oo0oO0
    public PointF o00oOOo0() {
        return this.f9800o00oOo00;
    }

    public float o00oOOoO() {
        return this.f9801o00oOooO;
    }

    @oo0oO0
    public PointF o00oOo00() {
        return this.f9798o00oOOo0;
    }

    public float o00oOooO() {
        return this.f9799o00oOOoO;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("PathSegment{start=");
        o00oOOo02.append(this.f9798o00oOOo0);
        o00oOOo02.append(", startFraction=");
        o00oOOo02.append(this.f9799o00oOOoO);
        o00oOOo02.append(", end=");
        o00oOOo02.append(this.f9800o00oOo00);
        o00oOOo02.append(", endFraction=");
        o00oOOo02.append(this.f9801o00oOooO);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
