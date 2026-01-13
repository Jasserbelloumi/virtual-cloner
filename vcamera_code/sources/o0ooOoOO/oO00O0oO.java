package o0ooOoOO;

import android.util.SizeF;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO00O0oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final float f17172o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float f17173o00oOOoO;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o0O0O0Oo
        @oo0oO0
        public static SizeF o00oOOo0(@oo0oO0 oO00O0oO oo00o0oo) {
            oo00o0oo.getClass();
            return new SizeF(oo00o0oo.f17172o00oOOo0, oo00o0oo.f17173o00oOOoO);
        }

        @o0O0O0Oo
        @oo0oO0
        public static oO00O0oO o00oOOoO(@oo0oO0 SizeF sizeF) {
            sizeF.getClass();
            return new oO00O0oO(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public oO00O0oO(float f, float f2) {
        this.f17172o00oOOo0 = ooOOOOoo.o00oOooO(f, "width");
        this.f17173o00oOOoO = ooOOOOoo.o00oOooO(f2, "height");
    }

    @o0OOooO0(21)
    @oo0oO0
    public static oO00O0oO o00oOooO(@oo0oO0 SizeF sizeF) {
        return o00oOOo0.o00oOOoO(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO00O0oO) {
            oO00O0oO oo00o0oo = (oO00O0oO) obj;
            return oo00o0oo.f17172o00oOOo0 == this.f17172o00oOOo0 && oo00o0oo.f17173o00oOOoO == this.f17173o00oOOoO;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f17172o00oOOo0) ^ Float.floatToIntBits(this.f17173o00oOOoO);
    }

    public float o00oOOo0() {
        return this.f17173o00oOOoO;
    }

    public float o00oOOoO() {
        return this.f17172o00oOOo0;
    }

    @o0OOooO0(21)
    @oo0oO0
    public SizeF o00oOo00() {
        return o00oOOo0.o00oOOo0(this);
    }

    @oo0oO0
    public String toString() {
        return this.f17172o00oOOo0 + "x" + this.f17173o00oOOoO;
    }
}
