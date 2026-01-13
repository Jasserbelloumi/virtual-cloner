package o00oooOo;

import android.graphics.Insets;
import android.graphics.Rect;
import android.support.v4.media.o00oOo0O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oOO00o {
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final oOO00o f9790o00oOo0O = new oOO00o(0, 0, 0, 0);

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f9791o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f9792o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f9793o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f9794o00oOooO;

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Insets o00oOOo0(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public oOO00o(int i, int i2, int i3, int i4) {
        this.f9791o00oOOo0 = i;
        this.f9792o00oOOoO = i2;
        this.f9793o00oOo00 = i3;
        this.f9794o00oOooO = i4;
    }

    @oo0oO0
    public static oOO00o o00oOOo0(@oo0oO0 oOO00o ooo00o, @oo0oO0 oOO00o ooo00o2) {
        return o00oOooO(ooo00o.f9791o00oOOo0 + ooo00o2.f9791o00oOOo0, ooo00o.f9792o00oOOoO + ooo00o2.f9792o00oOOoO, ooo00o.f9793o00oOo00 + ooo00o2.f9793o00oOo00, ooo00o.f9794o00oOooO + ooo00o2.f9794o00oOooO);
    }

    @oo0oO0
    public static oOO00o o00oOOoO(@oo0oO0 oOO00o ooo00o, @oo0oO0 oOO00o ooo00o2) {
        return o00oOooO(Math.max(ooo00o.f9791o00oOOo0, ooo00o2.f9791o00oOOo0), Math.max(ooo00o.f9792o00oOOoO, ooo00o2.f9792o00oOOoO), Math.max(ooo00o.f9793o00oOo00, ooo00o2.f9793o00oOo00), Math.max(ooo00o.f9794o00oOooO, ooo00o2.f9794o00oOooO));
    }

    @oo0oO0
    public static oOO00o o00oOo00(@oo0oO0 oOO00o ooo00o, @oo0oO0 oOO00o ooo00o2) {
        return o00oOooO(Math.min(ooo00o.f9791o00oOOo0, ooo00o2.f9791o00oOOo0), Math.min(ooo00o.f9792o00oOOoO, ooo00o2.f9792o00oOOoO), Math.min(ooo00o.f9793o00oOo00, ooo00o2.f9793o00oOo00), Math.min(ooo00o.f9794o00oOooO, ooo00o2.f9794o00oOooO));
    }

    @oo0oO0
    public static oOO00o o00oOo0O(@oo0oO0 Rect rect) {
        return o00oOooO(rect.left, rect.top, rect.right, rect.bottom);
    }

    @oo0oO0
    public static oOO00o o00oOo0o(@oo0oO0 oOO00o ooo00o, @oo0oO0 oOO00o ooo00o2) {
        return o00oOooO(ooo00o.f9791o00oOOo0 - ooo00o2.f9791o00oOOo0, ooo00o.f9792o00oOOoO - ooo00o2.f9792o00oOOoO, ooo00o.f9793o00oOo00 - ooo00o2.f9793o00oOo00, ooo00o.f9794o00oOooO - ooo00o2.f9794o00oOooO);
    }

    @o0OOooO0(api = 29)
    @oo0oO0
    public static oOO00o o00oOoO0(@oo0oO0 Insets insets) {
        return o00oOooO(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    @o0OOooO0(api = 29)
    @oo0oO0
    public static oOO00o o00oOoOO(@oo0oO0 Insets insets) {
        return o00oOoO0(insets);
    }

    @oo0oO0
    public static oOO00o o00oOooO(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f9790o00oOo0O : new oOO00o(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oOO00o.class != obj.getClass()) {
            return false;
        }
        oOO00o ooo00o = (oOO00o) obj;
        return this.f9794o00oOooO == ooo00o.f9794o00oOooO && this.f9791o00oOOo0 == ooo00o.f9791o00oOOo0 && this.f9793o00oOo00 == ooo00o.f9793o00oOo00 && this.f9792o00oOOoO == ooo00o.f9792o00oOOoO;
    }

    public int hashCode() {
        return (((((this.f9791o00oOOo0 * 31) + this.f9792o00oOOoO) * 31) + this.f9793o00oOo00) * 31) + this.f9794o00oOooO;
    }

    @o0OOooO0(29)
    @oo0oO0
    public Insets o00oOoO() {
        return o00oOOo0.o00oOOo0(this.f9791o00oOOo0, this.f9792o00oOOoO, this.f9793o00oOo00, this.f9794o00oOooO);
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Insets{left=");
        o00oOOo02.append(this.f9791o00oOOo0);
        o00oOOo02.append(", top=");
        o00oOOo02.append(this.f9792o00oOOoO);
        o00oOOo02.append(", right=");
        o00oOOo02.append(this.f9793o00oOo00);
        o00oOOo02.append(", bottom=");
        o00oOOo02.append(this.f9794o00oOooO);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
