package o00oo0oO;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0OoO00O extends Drawable {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float f7582o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final RectF f7584o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f7585o00oOo0O;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public ColorStateList f7587o00oOoO;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public PorterDuffColorFilter f7589o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public ColorStateList f7590o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Rect f7592o00oOooO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f7586o00oOo0o = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f7588o00oOoO0 = true;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public PorterDuff.Mode f7591o00oOoo0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Paint f7583o00oOOoO = new Paint(5);

    public o0OoO00O(ColorStateList colorStateList, float f) {
        this.f7582o00oOOo0 = f;
        o00oOo0O(colorStateList);
        this.f7584o00oOo00 = new RectF();
        this.f7592o00oOooO = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f7583o00oOOoO;
        if (this.f7589o00oOoOO == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f7589o00oOoOO);
            z = true;
        }
        RectF rectF = this.f7584o00oOo00;
        float f = this.f7582o00oOOo0;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f7592o00oOooO, this.f7582o00oOOo0);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f7590o00oOoOo;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f7587o00oOoO) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final PorterDuffColorFilter o00oOOo0(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList o00oOOoO() {
        return this.f7587o00oOoO;
    }

    public float o00oOo00() {
        return this.f7585o00oOo0O;
    }

    public final void o00oOo0O(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7587o00oOoO = colorStateList;
        this.f7583o00oOOoO.setColor(colorStateList.getColorForState(getState(), this.f7587o00oOoO.getDefaultColor()));
    }

    public void o00oOo0o(@o0OO00OO ColorStateList colorStateList) {
        o00oOo0O(colorStateList);
        invalidateSelf();
    }

    public void o00oOoO(float f) {
        if (f == this.f7582o00oOOo0) {
            return;
        }
        this.f7582o00oOOo0 = f;
        o00oOoOO(null);
        invalidateSelf();
    }

    public void o00oOoO0(float f, boolean z, boolean z2) {
        if (f == this.f7585o00oOo0O && this.f7586o00oOo0o == z && this.f7588o00oOoO0 == z2) {
            return;
        }
        this.f7585o00oOo0O = f;
        this.f7586o00oOo0o = z;
        this.f7588o00oOoO0 = z2;
        o00oOoOO(null);
        invalidateSelf();
    }

    public final void o00oOoOO(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f7584o00oOo00.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f7592o00oOooO.set(rect);
        if (this.f7586o00oOo0o) {
            float o00oOooO2 = o0O00O0o.o00oOooO(this.f7585o00oOo0O, this.f7582o00oOOo0, this.f7588o00oOoO0);
            this.f7592o00oOooO.inset((int) Math.ceil(o0O00O0o.o00oOo00(this.f7585o00oOo0O, this.f7582o00oOOo0, this.f7588o00oOoO0)), (int) Math.ceil(o00oOooO2));
            this.f7584o00oOo00.set(this.f7592o00oOooO);
        }
    }

    public float o00oOooO() {
        return this.f7582o00oOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        o00oOoOO(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f7587o00oOoO;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f7583o00oOOoO.getColor();
        if (z) {
            this.f7583o00oOOoO.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f7590o00oOoOo;
        if (colorStateList2 == null || (mode = this.f7591o00oOoo0) == null) {
            return z;
        }
        this.f7589o00oOoOO = o00oOOo0(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7583o00oOOoO.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7583o00oOOoO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f7590o00oOoOo = colorStateList;
        this.f7589o00oOoOO = o00oOOo0(colorStateList, this.f7591o00oOoo0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f7591o00oOoo0 = mode;
        this.f7589o00oOoOO = o00oOOo0(this.f7590o00oOoOo, mode);
        invalidateSelf();
    }
}
