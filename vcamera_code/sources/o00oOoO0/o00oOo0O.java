package o00oOoO0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
/* loaded from: classes.dex */
public class o00oOo0O extends Drawable implements Drawable.Callback {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Drawable f6973o00oo0O0;

    public o00oOo0O(Drawable drawable) {
        o00oOOoO(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oo0oO0 Canvas canvas) {
        this.f6973o00oo0O0.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f6973o00oo0O0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6973o00oo0O0.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6973o00oo0O0.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6973o00oo0O0.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f6973o00oo0O0.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f6973o00oo0O0.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6973o00oo0O0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f6973o00oo0O0.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f6973o00oo0O0.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f6973o00oo0O0.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return o0O0O0Oo.o00oOOo0.o00oOooO(this.f6973o00oo0O0);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f6973o00oo0O0.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f6973o00oo0O0.jumpToCurrentState();
    }

    @o0OO00OO
    public Drawable o00oOOo0() {
        return this.f6973o00oo0O0;
    }

    public void o00oOOoO(@o0OO00OO Drawable drawable) {
        Drawable drawable2 = this.f6973o00oo0O0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6973o00oo0O0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6973o00oo0O0.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f6973o00oo0O0.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6973o00oo0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        o0O0O0Oo.o00oOOo0.o00oOo0O(this.f6973o00oo0O0, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f6973o00oo0O0.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6973o00oo0O0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f6973o00oo0O0.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f6973o00oo0O0.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        o0O0O0Oo.o00oOOoO.o00oOo0O(this.f6973o00oo0O0, f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        o0O0O0Oo.o00oOOoO.o00oOo0o(this.f6973o00oo0O0, i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f6973o00oo0O0.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        o0O0O0Oo.o00oOOoO.o00oOoO0(this.f6973o00oo0O0, i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        o0O0O0Oo.o00oOOoO.o00oOoO(this.f6973o00oo0O0, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        o0O0O0Oo.o00oOOoO.o00oOoOO(this.f6973o00oo0O0, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f6973o00oo0O0.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
