package o00oo0oO;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.cardview.R;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public class o0O00O0o extends Drawable {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final double f7563o00oo0O = Math.cos(Math.toRadians(45.0d));

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final float f7564o00oo0Oo = 1.5f;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static o00oOOo0 f7565o00oo0o0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f7566o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Paint f7568o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final RectF f7569o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f7570o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f7571o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Path f7572o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float f7573o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f7574o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public ColorStateList f7575o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Paint f7576o00oOooO;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final int f7578o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final int f7579o00oo00O;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f7577o00oOooo = true;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public boolean f7581o00oo0OO = true;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f7580o00oo0O0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Paint f7567o00oOOoO = new Paint(5);

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public o0O00O0o(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f7579o00oo00O = resources.getColor(R.color.cardview_shadow_start_color);
        this.f7578o00oo0 = resources.getColor(R.color.cardview_shadow_end_color);
        this.f7566o00oOOo0 = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        o00oo0(colorStateList);
        Paint paint = new Paint(5);
        this.f7568o00oOo00 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7570o00oOo0o = (int) (f + 0.5f);
        this.f7569o00oOo0O = new RectF();
        Paint paint2 = new Paint(this.f7568o00oOo00);
        this.f7576o00oOooO = paint2;
        paint2.setAntiAlias(false);
        o00oo0o0(f2, f3);
    }

    public static float o00oOo00(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - f7563o00oo0O) * f2) + f);
        }
        return f;
    }

    public static float o00oOooO(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            return (float) (((1.0d - f7563o00oo0O) * f2) + f3);
        }
        return f3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f7577o00oOooo) {
            o00oOOo0(getBounds());
            this.f7577o00oOooo = false;
        }
        canvas.translate(0.0f, this.f7574o00oOoOo / 2.0f);
        o00oOo0O(canvas);
        canvas.translate(0.0f, (-this.f7574o00oOoOo) / 2.0f);
        f7565o00oo0o0.o00oOOo0(canvas, this.f7569o00oOo0O, this.f7570o00oOo0o, this.f7567o00oOOoO);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(o00oOooO(this.f7571o00oOoO, this.f7570o00oOo0o, this.f7581o00oo0OO));
        int ceil2 = (int) Math.ceil(o00oOo00(this.f7571o00oOoO, this.f7570o00oOo0o, this.f7581o00oo0OO));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f7575o00oOoo0;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void o00oOOo0(Rect rect) {
        float f = this.f7571o00oOoO;
        float f2 = 1.5f * f;
        this.f7569o00oOo0O.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        o00oOOoO();
    }

    public final void o00oOOoO() {
        float f = this.f7570o00oOo0o;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f7573o00oOoOO;
        rectF2.inset(-f2, -f2);
        Path path = this.f7572o00oOoO0;
        if (path == null) {
            this.f7572o00oOoO0 = new Path();
        } else {
            path.reset();
        }
        this.f7572o00oOoO0.setFillType(Path.FillType.EVEN_ODD);
        this.f7572o00oOoO0.moveTo(-this.f7570o00oOo0o, 0.0f);
        this.f7572o00oOoO0.rLineTo(-this.f7573o00oOoOO, 0.0f);
        this.f7572o00oOoO0.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f7572o00oOoO0.arcTo(rectF, 270.0f, -90.0f, false);
        this.f7572o00oOoO0.close();
        float f3 = this.f7570o00oOo0o;
        float f4 = f3 / (this.f7573o00oOoOO + f3);
        Paint paint = this.f7568o00oOo00;
        float f5 = this.f7570o00oOo0o + this.f7573o00oOoOO;
        int i = this.f7579o00oo00O;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f7578o00oo0}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f7576o00oOooO;
        float f6 = this.f7570o00oOo0o;
        float f7 = this.f7573o00oOoOO;
        int i2 = this.f7579o00oo00O;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f7578o00oo0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f7576o00oOooO.setAntiAlias(false);
    }

    public final void o00oOo0O(Canvas canvas) {
        float f = this.f7570o00oOo0o;
        float f2 = (-f) - this.f7573o00oOoOO;
        float f3 = (this.f7574o00oOoOo / 2.0f) + f + this.f7566o00oOOo0;
        float f4 = f3 * 2.0f;
        boolean z = this.f7569o00oOo0O.width() - f4 > 0.0f;
        boolean z2 = this.f7569o00oOo0O.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f7569o00oOo0O;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f7572o00oOoO0, this.f7568o00oOo00);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f7569o00oOo0O.width() - f4, -this.f7570o00oOo0o, this.f7576o00oOooO);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f7569o00oOo0O;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f7572o00oOoO0, this.f7568o00oOo00);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f7569o00oOo0O.width() - f4, (-this.f7570o00oOo0o) + this.f7573o00oOoOO, this.f7576o00oOooO);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f7569o00oOo0O;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f7572o00oOoO0, this.f7568o00oOo00);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f7569o00oOo0O.height() - f4, -this.f7570o00oOo0o, this.f7576o00oOooO);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f7569o00oOo0O;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f7572o00oOoO0, this.f7568o00oOo00);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f7569o00oOo0O.height() - f4, -this.f7570o00oOo0o, this.f7576o00oOooO);
        }
        canvas.restoreToCount(save4);
    }

    public ColorStateList o00oOo0o() {
        return this.f7575o00oOoo0;
    }

    public void o00oOoO(Rect rect) {
        getPadding(rect);
    }

    public float o00oOoO0() {
        return this.f7570o00oOo0o;
    }

    public float o00oOoOO() {
        return this.f7571o00oOoO;
    }

    public float o00oOoOo() {
        float f = this.f7571o00oOoO;
        float f2 = (f * 1.5f) / 2.0f;
        return (((this.f7571o00oOoO * 1.5f) + this.f7566o00oOOo0) * 2.0f) + (Math.max(f, f2 + this.f7570o00oOo0o + this.f7566o00oOOo0) * 2.0f);
    }

    public float o00oOoo0() {
        float f = this.f7571o00oOoO;
        float f2 = f / 2.0f;
        return ((this.f7571o00oOoO + this.f7566o00oOOo0) * 2.0f) + (Math.max(f, f2 + this.f7570o00oOo0o + this.f7566o00oOOo0) * 2.0f);
    }

    public float o00oOooo() {
        return this.f7574o00oOoOo;
    }

    public final void o00oo0(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7575o00oOoo0 = colorStateList;
        this.f7567o00oOOoO.setColor(colorStateList.getColorForState(getState(), this.f7575o00oOoo0.getDefaultColor()));
    }

    public void o00oo00O(boolean z) {
        this.f7581o00oo0OO = z;
        invalidateSelf();
    }

    public void o00oo0O(float f) {
        o00oo0o0(this.f7574o00oOoOo, f);
    }

    public void o00oo0O0(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f7570o00oOo0o == f2) {
            return;
        }
        this.f7570o00oOo0o = f2;
        this.f7577o00oOooo = true;
        invalidateSelf();
    }

    public void o00oo0OO(@o0OO00OO ColorStateList colorStateList) {
        o00oo0(colorStateList);
        invalidateSelf();
    }

    public void o00oo0Oo(float f) {
        o00oo0o0(f, this.f7571o00oOoO);
    }

    public final int o00oo0o(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public final void o00oo0o0(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float o00oo0o2 = o00oo0o(f);
            float o00oo0o3 = o00oo0o(f2);
            if (o00oo0o2 > o00oo0o3) {
                if (!this.f7580o00oo0O0) {
                    this.f7580o00oo0O0 = true;
                }
                o00oo0o2 = o00oo0o3;
            }
            if (this.f7574o00oOoOo == o00oo0o2 && this.f7571o00oOoO == o00oo0o3) {
                return;
            }
            this.f7574o00oOoOo = o00oo0o2;
            this.f7571o00oOoO = o00oo0o3;
            this.f7573o00oOoOO = (int) ((o00oo0o2 * 1.5f) + this.f7566o00oOOo0 + 0.5f);
            this.f7577o00oOooo = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7577o00oOooo = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f7575o00oOoo0;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f7567o00oOOoO.getColor() == colorForState) {
            return false;
        }
        this.f7567o00oOOoO.setColor(colorForState);
        this.f7577o00oOooo = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7567o00oOOoO.setAlpha(i);
        this.f7568o00oOo00.setAlpha(i);
        this.f7576o00oOooO.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7567o00oOOoO.setColorFilter(colorFilter);
    }
}
