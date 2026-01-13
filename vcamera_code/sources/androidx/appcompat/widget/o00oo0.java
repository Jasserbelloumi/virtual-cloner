package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o00oo0 {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final View f1086o00oOOo0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0OO f1089o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0OO f1090o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0OO f1091o00oOooO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1088o00oOo00 = -1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00ooO f1087o00oOOoO = o00ooO.o00oOOoO();

    public o00oo0(@o00oOooO.oo0oO0 View view) {
        this.f1086o00oOOo0 = view;
    }

    public final boolean o00oOOo0(@o00oOooO.oo0oO0 Drawable drawable) {
        if (this.f1090o00oOo0o == null) {
            this.f1090o00oOo0o = new o0OO();
        }
        o0OO o0oo = this.f1090o00oOo0o;
        o0oo.o00oOOo0();
        ColorStateList o00oooO2 = o0O000oo.o0O0o00O.o00oooO(this.f1086o00oOOo0);
        if (o00oooO2 != null) {
            o0oo.f1261o00oOooO = true;
            o0oo.f1258o00oOOo0 = o00oooO2;
        }
        PorterDuff.Mode o00oOoO2 = o0O0o00O.o00ooO0.o00oOoO(this.f1086o00oOOo0);
        if (o00oOoO2 != null) {
            o0oo.f1260o00oOo00 = true;
            o0oo.f1259o00oOOoO = o00oOoO2;
        }
        if (o0oo.f1261o00oOooO || o0oo.f1260o00oOo00) {
            o00ooO.o00oOoOo(drawable, o0oo, this.f1086o00oOOo0.getDrawableState());
            return true;
        }
        return false;
    }

    public void o00oOOoO() {
        Drawable background = this.f1086o00oOOo0.getBackground();
        if (background != null) {
            if (o00oOoo0() && o00oOOo0(background)) {
                return;
            }
            o0OO o0oo = this.f1089o00oOo0O;
            if (o0oo != null) {
                o00ooO.o00oOoOo(background, o0oo, this.f1086o00oOOo0.getDrawableState());
                return;
            }
            o0OO o0oo2 = this.f1091o00oOooO;
            if (o0oo2 != null) {
                o00ooO.o00oOoOo(background, o0oo2, this.f1086o00oOOo0.getDrawableState());
            }
        }
    }

    public ColorStateList o00oOo00() {
        o0OO o0oo = this.f1089o00oOo0O;
        if (o0oo != null) {
            return o0oo.f1258o00oOOo0;
        }
        return null;
    }

    public void o00oOo0O(@o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        Context context = this.f1086o00oOOo0.getContext();
        int[] iArr = R.styleable.ViewBackgroundHelper;
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, iArr, i, 0);
        View view = this.f1086o00oOOo0;
        o0O000oo.o0O0o00O.o0O0oOo0(view, view.getContext(), iArr, attributeSet, o00ooOo2.o00ooO(), i, 0);
        try {
            int i2 = R.styleable.ViewBackgroundHelper_android_background;
            if (o00ooOo2.o00ooOO0(i2)) {
                this.f1088o00oOo00 = o00ooOo2.o00oo0oO(i2, -1);
                ColorStateList o00oOo0o2 = this.f1087o00oOOoO.o00oOo0o(this.f1086o00oOOo0.getContext(), this.f1088o00oOo00);
                if (o00oOo0o2 != null) {
                    o00oOoO(o00oOo0o2);
                }
            }
            int i3 = R.styleable.ViewBackgroundHelper_backgroundTint;
            if (o00ooOo2.o00ooOO0(i3)) {
                o0O0o00O.o00ooO0.o00oo0O(this.f1086o00oOOo0, o00ooOo2.o00oOooO(i3));
            }
            int i4 = R.styleable.ViewBackgroundHelper_backgroundTintMode;
            if (o00ooOo2.o00ooOO0(i4)) {
                o0O0o00O.o00ooO0.o00oo0Oo(this.f1086o00oOOo0, o0O0OOOo.o00oOo0O(o00ooOo2.o00oo0OO(i4, -1), null));
            }
        } finally {
            o00ooOo2.o00ooOoo();
        }
    }

    public void o00oOo0o(Drawable drawable) {
        this.f1088o00oOo00 = -1;
        o00oOoO(null);
        o00oOOoO();
    }

    public void o00oOoO(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1091o00oOooO == null) {
                this.f1091o00oOooO = new o0OO();
            }
            o0OO o0oo = this.f1091o00oOooO;
            o0oo.f1258o00oOOo0 = colorStateList;
            o0oo.f1261o00oOooO = true;
        } else {
            this.f1091o00oOooO = null;
        }
        o00oOOoO();
    }

    public void o00oOoO0(int i) {
        this.f1088o00oOo00 = i;
        o00ooO o00ooo = this.f1087o00oOOoO;
        o00oOoO(o00ooo != null ? o00ooo.o00oOo0o(this.f1086o00oOOo0.getContext(), i) : null);
        o00oOOoO();
    }

    public void o00oOoOO(ColorStateList colorStateList) {
        if (this.f1089o00oOo0O == null) {
            this.f1089o00oOo0O = new o0OO();
        }
        o0OO o0oo = this.f1089o00oOo0O;
        o0oo.f1258o00oOOo0 = colorStateList;
        o0oo.f1261o00oOooO = true;
        o00oOOoO();
    }

    public void o00oOoOo(PorterDuff.Mode mode) {
        if (this.f1089o00oOo0O == null) {
            this.f1089o00oOo0O = new o0OO();
        }
        o0OO o0oo = this.f1089o00oOo0O;
        o0oo.f1259o00oOOoO = mode;
        o0oo.f1260o00oOo00 = true;
        o00oOOoO();
    }

    public final boolean o00oOoo0() {
        return this.f1091o00oOooO != null;
    }

    public PorterDuff.Mode o00oOooO() {
        o0OO o0oo = this.f1089o00oOo0O;
        if (o0oo != null) {
            return o0oo.f1259o00oOOoO;
        }
        return null;
    }
}
