package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import o00oooo0.o0O0O0Oo;
/* loaded from: classes.dex */
public class o0O00o00 extends o0O00O0o {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Drawable f1173o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public ColorStateList f1174o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f1175o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public PorterDuff.Mode f1176o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f1177o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final SeekBar f1178o00oOooO;

    public o0O00o00(SeekBar seekBar) {
        super(seekBar);
        this.f1174o00oOo0o = null;
        this.f1176o00oOoO0 = null;
        this.f1175o00oOoO = false;
        this.f1177o00oOoOO = false;
        this.f1178o00oOooO = seekBar;
    }

    @Override // androidx.appcompat.widget.o0O00O0o
    public void o00oOo00(AttributeSet attributeSet, int i) {
        super.o00oOo00(attributeSet, i);
        Context context = this.f1178o00oOooO.getContext();
        int[] iArr = R.styleable.AppCompatSeekBar;
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1178o00oOooO;
        o0O000oo.o0O0o00O.o0O0oOo0(seekBar, seekBar.getContext(), iArr, attributeSet, o00ooOo2.o00ooO(), i, 0);
        Drawable o00oOoOO2 = o00ooOo2.o00oOoOO(R.styleable.AppCompatSeekBar_android_thumb);
        if (o00oOoOO2 != null) {
            this.f1178o00oOooO.setThumb(o00oOoOO2);
        }
        o00oo00O(o00ooOo2.o00oOoO(R.styleable.AppCompatSeekBar_tickMark));
        int i2 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (o00ooOo2.o00ooOO0(i2)) {
            this.f1176o00oOoO0 = o0O0OOOo.o00oOo0O(o00ooOo2.o00oo0OO(i2, -1), this.f1176o00oOoO0);
            this.f1177o00oOoOO = true;
        }
        int i3 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (o00ooOo2.o00ooOO0(i3)) {
            this.f1174o00oOo0o = o00ooOo2.o00oOooO(i3);
            this.f1175o00oOoO = true;
        }
        o00ooOo2.o00ooOoo();
        o00oOo0o();
    }

    public final void o00oOo0o() {
        Drawable drawable = this.f1173o00oOo0O;
        if (drawable != null) {
            if (this.f1175o00oOoO || this.f1177o00oOoOO) {
                Drawable mutate = drawable.mutate();
                this.f1173o00oOo0O = mutate;
                if (this.f1175o00oOoO) {
                    o0O0O0Oo.o00oOOoO.o00oOoO(mutate, this.f1174o00oOo0o);
                }
                if (this.f1177o00oOoOO) {
                    o0O0O0Oo.o00oOOoO.o00oOoOO(this.f1173o00oOo0O, this.f1176o00oOoO0);
                }
                if (this.f1173o00oOo0O.isStateful()) {
                    this.f1173o00oOo0O.setState(this.f1178o00oOooO.getDrawableState());
                }
            }
        }
    }

    public void o00oOoO() {
        Drawable drawable = this.f1173o00oOo0O;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1178o00oOooO.getDrawableState())) {
            this.f1178o00oOooO.invalidateDrawable(drawable);
        }
    }

    public void o00oOoO0(Canvas canvas) {
        if (this.f1173o00oOo0O != null) {
            int max = this.f1178o00oOooO.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1173o00oOo0O.getIntrinsicWidth();
                int intrinsicHeight = this.f1173o00oOo0O.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1173o00oOo0O.setBounds(-i, -i2, i, i2);
                float width = ((this.f1178o00oOooO.getWidth() - this.f1178o00oOooO.getPaddingLeft()) - this.f1178o00oOooO.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1178o00oOooO.getPaddingLeft(), this.f1178o00oOooO.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1173o00oOo0O.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @o00oOooO.o0OO00OO
    public Drawable o00oOoOO() {
        return this.f1173o00oOo0O;
    }

    @o00oOooO.o0OO00OO
    public ColorStateList o00oOoOo() {
        return this.f1174o00oOo0o;
    }

    @o00oOooO.o0OO00OO
    public PorterDuff.Mode o00oOoo0() {
        return this.f1176o00oOoO0;
    }

    public void o00oOooo() {
        Drawable drawable = this.f1173o00oOo0O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void o00oo0(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        this.f1174o00oOo0o = colorStateList;
        this.f1175o00oOoO = true;
        o00oOo0o();
    }

    public void o00oo00O(@o00oOooO.o0OO00OO Drawable drawable) {
        Drawable drawable2 = this.f1173o00oOo0O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1173o00oOo0O = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1178o00oOooO);
            o0O0O0Oo.o00oOo00.o00oOOoO(drawable, o0O000oo.o0O0o00O.o0O000O(this.f1178o00oOooO));
            if (drawable.isStateful()) {
                drawable.setState(this.f1178o00oOooO.getDrawableState());
            }
            o00oOo0o();
        }
        this.f1178o00oOooO.invalidate();
    }

    public void o00oo0OO(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.f1176o00oOoO0 = mode;
        this.f1177o00oOoOO = true;
        o00oOo0o();
    }
}
