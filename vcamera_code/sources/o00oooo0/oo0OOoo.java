package o00oooo0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
/* loaded from: classes.dex */
public class oo0OOoo extends Drawable implements Drawable.Callback, o0OooO0, o0O0OOOo {

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final PorterDuff.Mode f9910o0O0o = PorterDuff.Mode.SRC_IN;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public PorterDuff.Mode f9911o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f9912o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f9913o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f9914o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o0O0o00 f9915o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Drawable f9916o00oo0oO;

    public oo0OOoo(@o0OO00OO Drawable drawable) {
        this.f9915o00oo0o0 = o00oOooO();
        o00oOOoO(drawable);
    }

    public oo0OOoo(@oo0oO0 o0O0o00 o0o0o00, @o0OO00OO Resources resources) {
        this.f9915o00oo0o0 = o0o0o00;
        o00oOo0O(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oo0oO0 Canvas canvas) {
        this.f9916o00oo0oO.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o0O0o00 o0o0o00 = this.f9915o00oo0o0;
        return changingConfigurations | (o0o0o00 != null ? o0o0o00.getChangingConfigurations() : 0) | this.f9916o00oo0oO.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @o0OO00OO
    public Drawable.ConstantState getConstantState() {
        o0O0o00 o0o0o00 = this.f9915o00oo0o0;
        if (o0o0o00 == null || !o0o0o00.o00oOOo0()) {
            return null;
        }
        this.f9915o00oo0o0.f9904o00oOOo0 = getChangingConfigurations();
        return this.f9915o00oo0o0;
    }

    @Override // android.graphics.drawable.Drawable
    @oo0oO0
    public Drawable getCurrent() {
        return this.f9916o00oo0oO.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9916o00oo0oO.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9916o00oo0oO.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(23)
    public int getLayoutDirection() {
        return o0O0O0Oo.o00oOo00.o00oOOo0(this.f9916o00oo0oO);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f9916o00oo0oO.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f9916o00oo0oO.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9916o00oo0oO.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@oo0oO0 Rect rect) {
        return this.f9916o00oo0oO.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @oo0oO0
    public int[] getState() {
        return this.f9916o00oo0oO.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f9916o00oo0oO.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@oo0oO0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(19)
    public boolean isAutoMirrored() {
        return o0O0O0Oo.o00oOOo0.o00oOooO(this.f9916o00oo0oO);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        o0O0o00 o0o0o00;
        ColorStateList colorStateList = (!o00oOo00() || (o0o0o00 = this.f9915o00oo0o0) == null) ? null : o0o0o00.f9906o00oOo00;
        return (colorStateList != null && colorStateList.isStateful()) || this.f9916o00oo0oO.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f9916o00oo0oO.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @oo0oO0
    public Drawable mutate() {
        if (!this.f9914o00oo0o && super.mutate() == this) {
            this.f9915o00oo0o0 = o00oOooO();
            Drawable drawable = this.f9916o00oo0oO;
            if (drawable != null) {
                drawable.mutate();
            }
            o0O0o00 o0o0o00 = this.f9915o00oo0o0;
            if (o0o0o00 != null) {
                Drawable drawable2 = this.f9916o00oo0oO;
                o0o0o00.f9905o00oOOoO = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f9914o00oo0o = true;
        }
        return this;
    }

    @Override // o00oooo0.o0OooO0
    public final Drawable o00oOOo0() {
        return this.f9916o00oo0oO;
    }

    @Override // o00oooo0.o0OooO0
    public final void o00oOOoO(Drawable drawable) {
        Drawable drawable2 = this.f9916o00oo0oO;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9916o00oo0oO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o0O0o00 o0o0o00 = this.f9915o00oo0o0;
            if (o0o0o00 != null) {
                o0o0o00.f9905o00oOOoO = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean o00oOo00() {
        return true;
    }

    public final void o00oOo0O(@o0OO00OO Resources resources) {
        Drawable.ConstantState constantState;
        o0O0o00 o0o0o00 = this.f9915o00oo0o0;
        if (o0o0o00 == null || (constantState = o0o0o00.f9905o00oOOoO) == null) {
            return;
        }
        o00oOOoO(constantState.newDrawable(resources));
    }

    public final boolean o00oOo0o(int[] iArr) {
        if (o00oOo00()) {
            o0O0o00 o0o0o00 = this.f9915o00oo0o0;
            ColorStateList colorStateList = o0o0o00.f9906o00oOo00;
            PorterDuff.Mode mode = o0o0o00.f9907o00oOooO;
            if (colorStateList == null || mode == null) {
                this.f9913o00oo0Oo = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f9913o00oo0Oo || colorForState != this.f9912o00oo0O0 || mode != this.f9911o00oo0O) {
                    setColorFilter(colorForState, mode);
                    this.f9912o00oo0O0 = colorForState;
                    this.f9911o00oo0O = mode;
                    this.f9913o00oo0Oo = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @oo0oO0
    public final o0O0o00 o00oOooO() {
        return new o0O0o00(this.f9915o00oo0o0);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9916o00oo0oO;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(23)
    public boolean onLayoutDirectionChanged(int i) {
        return o0O0O0Oo.o00oOo00.o00oOOoO(this.f9916o00oo0oO, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f9916o00oo0oO.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9916o00oo0oO.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    @o0OOooO0(19)
    public void setAutoMirrored(boolean z) {
        o0O0O0Oo.o00oOOo0.o00oOo0O(this.f9916o00oo0oO, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f9916o00oo0oO.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9916o00oo0oO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f9916o00oo0oO.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f9916o00oo0oO.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@oo0oO0 int[] iArr) {
        return o00oOo0o(iArr) || this.f9916o00oo0oO.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintList(ColorStateList colorStateList) {
        this.f9915o00oo0o0.f9906o00oOo00 = colorStateList;
        o00oOo0o(getState());
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintMode(@oo0oO0 PorterDuff.Mode mode) {
        this.f9915o00oo0o0.f9907o00oOooO = mode;
        o00oOo0o(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f9916o00oo0oO.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@oo0oO0 Drawable drawable, @oo0oO0 Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
