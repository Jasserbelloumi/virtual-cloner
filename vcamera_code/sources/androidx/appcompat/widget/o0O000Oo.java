package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.core.widget.o00ooO0;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O000Oo {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ImageView f1147o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OO f1148o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OO f1149o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1150o00oOo0O = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0OO f1151o00oOooO;

    public o0O000Oo(@o00oOooO.oo0oO0 ImageView imageView) {
        this.f1147o00oOOo0 = imageView;
    }

    public final boolean o00oOOo0(@o00oOooO.oo0oO0 Drawable drawable) {
        if (this.f1151o00oOooO == null) {
            this.f1151o00oOooO = new o0OO();
        }
        o0OO o0oo = this.f1151o00oOooO;
        o0oo.o00oOOo0();
        ColorStateList o00oOOo02 = o00ooO0.o00oOOo0.o00oOOo0(this.f1147o00oOOo0);
        if (o00oOOo02 != null) {
            o0oo.f1261o00oOooO = true;
            o0oo.f1258o00oOOo0 = o00oOOo02;
        }
        PorterDuff.Mode o00oOOoO2 = o00ooO0.o00oOOo0.o00oOOoO(this.f1147o00oOOo0);
        if (o00oOOoO2 != null) {
            o0oo.f1260o00oOo00 = true;
            o0oo.f1259o00oOOoO = o00oOOoO2;
        }
        if (o0oo.f1261o00oOooO || o0oo.f1260o00oOo00) {
            o00ooO.o00oOoOo(drawable, o0oo, this.f1147o00oOOo0.getDrawableState());
            return true;
        }
        return false;
    }

    public void o00oOOoO() {
        if (this.f1147o00oOOo0.getDrawable() != null) {
            this.f1147o00oOOo0.getDrawable().setLevel(this.f1150o00oOo0O);
        }
    }

    public void o00oOo00() {
        Drawable drawable = this.f1147o00oOOo0.getDrawable();
        if (drawable != null) {
            o0O0OOOo.o00oOOoO(drawable);
        }
        if (drawable != null) {
            if (o00oo00O() && o00oOOo0(drawable)) {
                return;
            }
            o0OO o0oo = this.f1149o00oOo00;
            if (o0oo != null) {
                o00ooO.o00oOoOo(drawable, o0oo, this.f1147o00oOOo0.getDrawableState());
                return;
            }
            o0OO o0oo2 = this.f1148o00oOOoO;
            if (o0oo2 != null) {
                o00ooO.o00oOoOo(drawable, o0oo2, this.f1147o00oOOo0.getDrawableState());
            }
        }
    }

    public PorterDuff.Mode o00oOo0O() {
        o0OO o0oo = this.f1149o00oOo00;
        if (o0oo != null) {
            return o0oo.f1259o00oOOoO;
        }
        return null;
    }

    public boolean o00oOo0o() {
        return !(this.f1147o00oOOo0.getBackground() instanceof RippleDrawable);
    }

    public void o00oOoO(@o00oOooO.oo0oO0 Drawable drawable) {
        this.f1150o00oOo0O = drawable.getLevel();
    }

    public void o00oOoO0(AttributeSet attributeSet, int i) {
        int o00oo0oO2;
        Context context = this.f1147o00oOOo0.getContext();
        int[] iArr = R.styleable.AppCompatImageView;
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1147o00oOOo0;
        o0O000oo.o0O0o00O.o0O0oOo0(imageView, imageView.getContext(), iArr, attributeSet, o00ooOo2.o00ooO(), i, 0);
        try {
            Drawable drawable = this.f1147o00oOOo0.getDrawable();
            if (drawable == null && (o00oo0oO2 = o00ooOo2.o00oo0oO(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = o00oOo0o.o00oOo00.o00oOOoO(this.f1147o00oOOo0.getContext(), o00oo0oO2)) != null) {
                this.f1147o00oOOo0.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o0O0OOOo.o00oOOoO(drawable);
            }
            int i2 = R.styleable.AppCompatImageView_tint;
            if (o00ooOo2.o00ooOO0(i2)) {
                o00ooO0.o00oOOo0.o00oOo00(this.f1147o00oOOo0, o00ooOo2.o00oOooO(i2));
            }
            int i3 = R.styleable.AppCompatImageView_tintMode;
            if (o00ooOo2.o00ooOO0(i3)) {
                o00ooO0.o00oOOo0.o00oOooO(this.f1147o00oOOo0, o0O0OOOo.o00oOo0O(o00ooOo2.o00oo0OO(i3, -1), null));
            }
        } finally {
            o00ooOo2.o00ooOoo();
        }
    }

    public void o00oOoOO(int i) {
        if (i != 0) {
            Drawable o00oOOoO2 = o00oOo0o.o00oOo00.o00oOOoO(this.f1147o00oOOo0.getContext(), i);
            if (o00oOOoO2 != null) {
                o0O0OOOo.o00oOOoO(o00oOOoO2);
            }
            this.f1147o00oOOo0.setImageDrawable(o00oOOoO2);
        } else {
            this.f1147o00oOOo0.setImageDrawable(null);
        }
        o00oOo00();
    }

    public void o00oOoOo(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1148o00oOOoO == null) {
                this.f1148o00oOOoO = new o0OO();
            }
            o0OO o0oo = this.f1148o00oOOoO;
            o0oo.f1258o00oOOo0 = colorStateList;
            o0oo.f1261o00oOooO = true;
        } else {
            this.f1148o00oOOoO = null;
        }
        o00oOo00();
    }

    public void o00oOoo0(ColorStateList colorStateList) {
        if (this.f1149o00oOo00 == null) {
            this.f1149o00oOo00 = new o0OO();
        }
        o0OO o0oo = this.f1149o00oOo00;
        o0oo.f1258o00oOOo0 = colorStateList;
        o0oo.f1261o00oOooO = true;
        o00oOo00();
    }

    public ColorStateList o00oOooO() {
        o0OO o0oo = this.f1149o00oOo00;
        if (o0oo != null) {
            return o0oo.f1258o00oOOo0;
        }
        return null;
    }

    public void o00oOooo(PorterDuff.Mode mode) {
        if (this.f1149o00oOo00 == null) {
            this.f1149o00oOo00 = new o0OO();
        }
        o0OO o0oo = this.f1149o00oOo00;
        o0oo.f1259o00oOOoO = mode;
        o0oo.f1260o00oOo00 = true;
        o00oOo00();
    }

    public final boolean o00oo00O() {
        return this.f1148o00oOOoO != null;
    }
}
