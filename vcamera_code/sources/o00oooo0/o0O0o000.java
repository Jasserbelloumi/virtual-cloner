package o00oooo0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0O0o000 extends oo0OOoo {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f9908o00oo = "WrappedDrawableApi21";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static Method f9909o00ooO00;

    public o0O0o000(Drawable drawable) {
        super(drawable);
        o00oOoO0();
    }

    public o0O0o000(o0O0o00 o0o0o00, Resources resources) {
        super(o0o0o00, resources);
        o00oOoO0();
    }

    @Override // android.graphics.drawable.Drawable
    @oo0oO0
    public Rect getDirtyBounds() {
        return this.f9916o00oo0oO.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@oo0oO0 Outline outline) {
        this.f9916o00oo0oO.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f9916o00oo0oO;
        if (drawable != null && (method = f9909o00ooO00) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // o00oooo0.oo0OOoo
    public boolean o00oOo00() {
        return false;
    }

    public final void o00oOoO0() {
        if (f9909o00ooO00 == null) {
            try {
                f9909o00ooO00 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f9916o00oo0oO.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f9916o00oo0oO.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o00oooo0.oo0OOoo, android.graphics.drawable.Drawable
    public boolean setState(@oo0oO0 int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // o00oooo0.oo0OOoo, android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTint(int i) {
        if (o00oOo00()) {
            super.setTint(i);
        } else {
            this.f9916o00oo0oO.setTint(i);
        }
    }

    @Override // o00oooo0.oo0OOoo, android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintList(ColorStateList colorStateList) {
        if (o00oOo00()) {
            super.setTintList(colorStateList);
        } else {
            this.f9916o00oo0oO.setTintList(colorStateList);
        }
    }

    @Override // o00oooo0.oo0OOoo, android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintMode(@oo0oO0 PorterDuff.Mode mode) {
        if (o00oOo00()) {
            super.setTintMode(mode);
        } else {
            this.f9916o00oo0oO.setTintMode(mode);
        }
    }
}
