package o0O000oo;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class o0O0O0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ViewParent f10592o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ViewParent f10593o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final View f10594o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int[] f10595o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f10596o00oOooO;

    public o0O0O0O(@o00oOooO.oo0oO0 View view) {
        this.f10594o00oOo00 = view;
    }

    public boolean o00oOOo0(float f, float f2, boolean z) {
        ViewParent o00oOoOO2;
        if (!o00oo00O() || (o00oOoOO2 = o00oOoOO(0)) == null) {
            return false;
        }
        return o0OO0o00.o00oOo00(o00oOoOO2, this.f10594o00oOo00, f, f2, z);
    }

    public boolean o00oOOoO(float f, float f2) {
        ViewParent o00oOoOO2;
        if (!o00oo00O() || (o00oOoOO2 = o00oOoOO(0)) == null) {
            return false;
        }
        return o0OO0o00.o00oOooO(o00oOoOO2, this.f10594o00oOo00, f, f2);
    }

    public boolean o00oOo00(int i, int i2, @o00oOooO.o0OO00OO int[] iArr, @o00oOooO.o0OO00OO int[] iArr2) {
        return o00oOooO(i, i2, iArr, iArr2, 0);
    }

    public void o00oOo0O(int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr, int i5, @o00oOooO.o0OO00OO int[] iArr2) {
        o00oOoO(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean o00oOo0o(int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr) {
        return o00oOoO(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean o00oOoO(int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr, int i5, @o00oOooO.o0OO00OO int[] iArr2) {
        ViewParent o00oOoOO2;
        int i6;
        int i7;
        int[] iArr3;
        if (!o00oo00O() || (o00oOoOO2 = o00oOoOO(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f10594o00oOo00.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] o00oOoOo2 = o00oOoOo();
            o00oOoOo2[0] = 0;
            o00oOoOo2[1] = 0;
            iArr3 = o00oOoOo2;
        } else {
            iArr3 = iArr2;
        }
        o0OO0o00.o00oOoOO(o00oOoOO2, this.f10594o00oOo00, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f10594o00oOo00.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean o00oOoO0(int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr, int i5) {
        return o00oOoO(i, i2, i3, i4, iArr, i5, null);
    }

    public final ViewParent o00oOoOO(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f10593o00oOOoO;
        }
        return this.f10592o00oOOo0;
    }

    public final int[] o00oOoOo() {
        if (this.f10595o00oOo0O == null) {
            this.f10595o00oOo0O = new int[2];
        }
        return this.f10595o00oOo0O;
    }

    public boolean o00oOoo0() {
        return o00oOooo(0);
    }

    public boolean o00oOooO(int i, int i2, @o00oOooO.o0OO00OO int[] iArr, @o00oOooO.o0OO00OO int[] iArr2, int i3) {
        ViewParent o00oOoOO2;
        int i4;
        int i5;
        if (!o00oo00O() || (o00oOoOO2 = o00oOoOO(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f10594o00oOo00.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = o00oOoOo();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        o0OO0o00.o00oOo0o(o00oOoOO2, this.f10594o00oOo00, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f10594o00oOo00.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean o00oOooo(int i) {
        return o00oOoOO(i) != null;
    }

    public void o00oo0() {
        o0O0o00O.o0OOOOO0(this.f10594o00oOo00);
    }

    public boolean o00oo00O() {
        return this.f10596o00oOooO;
    }

    public final void o00oo0O(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f10592o00oOOo0 = viewParent;
        } else if (i != 1) {
        } else {
            this.f10593o00oOOoO = viewParent;
        }
    }

    public void o00oo0O0(boolean z) {
        if (this.f10596o00oOooO) {
            o0O0o00O.o0OOOOO0(this.f10594o00oOo00);
        }
        this.f10596o00oOooO = z;
    }

    public void o00oo0OO(@o00oOooO.oo0oO0 View view) {
        o0O0o00O.o0OOOOO0(this.f10594o00oOo00);
    }

    public boolean o00oo0Oo(int i) {
        return o00oo0o0(i, 0);
    }

    public void o00oo0o() {
        o00oo0oO(0);
    }

    public boolean o00oo0o0(int i, int i2) {
        if (o00oOooo(i2)) {
            return true;
        }
        if (o00oo00O()) {
            View view = this.f10594o00oOo00;
            for (ViewParent parent = this.f10594o00oOo00.getParent(); parent != null; parent = parent.getParent()) {
                if (o0OO0o00.o00oo00O(parent, view, this.f10594o00oOo00, i, i2)) {
                    o00oo0O(i2, parent);
                    o0OO0o00.o00oOoo0(parent, view, this.f10594o00oOo00, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void o00oo0oO(int i) {
        ViewParent o00oOoOO2 = o00oOoOO(i);
        if (o00oOoOO2 != null) {
            o0OO0o00.o00oo0OO(o00oOoOO2, this.f10594o00oOo00, i);
            o00oo0O(i, null);
        }
    }
}
