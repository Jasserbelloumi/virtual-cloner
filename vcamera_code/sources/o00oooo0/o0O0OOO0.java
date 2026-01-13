package o00oooo0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O0OOO0 extends Drawable {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f9890o00oo0 = 3;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Bitmap f9891o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f9892o00oOOoO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final BitmapShader f9894o00oOo0O;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f9897o00oOoO0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f9900o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f9902o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f9903o00oo00O;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f9893o00oOo00 = 119;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Paint f9901o00oOooO = new Paint(3);

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Matrix f9895o00oOo0o = new Matrix();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Rect f9896o00oOoO = new Rect();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final RectF f9898o00oOoOO = new RectF();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f9899o00oOoOo = true;

    public o0O0OOO0(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.f9892o00oOOoO = 160;
        if (resources != null) {
            this.f9892o00oOOoO = resources.getDisplayMetrics().densityDpi;
        }
        this.f9891o00oOOo0 = bitmap;
        if (bitmap != null) {
            o00oOOo0();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f9903o00oo00O = -1;
            this.f9902o00oOooo = -1;
            bitmapShader = null;
        }
        this.f9894o00oOo0O = bitmapShader;
    }

    public static boolean o00oOoOo(float f) {
        return f > 0.05f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oo0oO0 Canvas canvas) {
        Bitmap bitmap = this.f9891o00oOOo0;
        if (bitmap == null) {
            return;
        }
        o00oo0o();
        if (this.f9901o00oOooO.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f9896o00oOoO, this.f9901o00oOooO);
            return;
        }
        RectF rectF = this.f9898o00oOoOO;
        float f = this.f9897o00oOoO0;
        canvas.drawRoundRect(rectF, f, f, this.f9901o00oOooO);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9901o00oOooO.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9901o00oOooO.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9903o00oo00O;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9902o00oOooo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f9893o00oOo00 != 119 || this.f9900o00oOoo0 || (bitmap = this.f9891o00oOOo0) == null || bitmap.hasAlpha() || this.f9901o00oOooO.getAlpha() < 255 || o00oOoOo(this.f9897o00oOoO0)) ? -3 : -1;
    }

    public final void o00oOOo0() {
        this.f9902o00oOooo = this.f9891o00oOOo0.getScaledWidth(this.f9892o00oOOoO);
        this.f9903o00oo00O = this.f9891o00oOOo0.getScaledHeight(this.f9892o00oOOoO);
    }

    @o0OO00OO
    public final Bitmap o00oOOoO() {
        return this.f9891o00oOOo0;
    }

    public float o00oOo00() {
        return this.f9897o00oOoO0;
    }

    @oo0oO0
    public final Paint o00oOo0O() {
        return this.f9901o00oOooO;
    }

    public void o00oOo0o(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean o00oOoO() {
        throw new UnsupportedOperationException();
    }

    public boolean o00oOoO0() {
        return this.f9901o00oOooO.isAntiAlias();
    }

    public boolean o00oOoOO() {
        return this.f9900o00oOoo0;
    }

    public void o00oOoo0(boolean z) {
        this.f9901o00oOooO.setAntiAlias(z);
        invalidateSelf();
    }

    public int o00oOooO() {
        return this.f9893o00oOo00;
    }

    public void o00oOooo(boolean z) {
        this.f9900o00oOoo0 = z;
        this.f9899o00oOoOo = true;
        if (!z) {
            o00oo00O(0.0f);
            return;
        }
        o00oo0o0();
        this.f9901o00oOooO.setShader(this.f9894o00oOo0O);
        invalidateSelf();
    }

    public void o00oo0(int i) {
        if (this.f9893o00oOo00 != i) {
            this.f9893o00oOo00 = i;
            this.f9899o00oOoOo = true;
            invalidateSelf();
        }
    }

    public void o00oo00O(float f) {
        Paint paint;
        BitmapShader bitmapShader;
        if (this.f9897o00oOoO0 == f) {
            return;
        }
        this.f9900o00oOoo0 = false;
        if (o00oOoOo(f)) {
            paint = this.f9901o00oOooO;
            bitmapShader = this.f9894o00oOo0O;
        } else {
            paint = this.f9901o00oOooO;
            bitmapShader = null;
        }
        paint.setShader(bitmapShader);
        this.f9897o00oOoO0 = f;
        invalidateSelf();
    }

    public void o00oo0O(@oo0oO0 Canvas canvas) {
        o00oo0O0(canvas.getDensity());
    }

    public void o00oo0O0(int i) {
        if (this.f9892o00oOOoO != i) {
            if (i == 0) {
                i = 160;
            }
            this.f9892o00oOOoO = i;
            if (this.f9891o00oOOo0 != null) {
                o00oOOo0();
            }
            invalidateSelf();
        }
    }

    public void o00oo0OO(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void o00oo0Oo(@oo0oO0 DisplayMetrics displayMetrics) {
        o00oo0O0(displayMetrics.densityDpi);
    }

    public void o00oo0o() {
        if (this.f9899o00oOoOo) {
            if (this.f9900o00oOoo0) {
                int min = Math.min(this.f9902o00oOooo, this.f9903o00oo00O);
                o00oOo0o(this.f9893o00oOo00, min, min, getBounds(), this.f9896o00oOoO);
                int min2 = Math.min(this.f9896o00oOoO.width(), this.f9896o00oOoO.height());
                this.f9896o00oOoO.inset(Math.max(0, (this.f9896o00oOoO.width() - min2) / 2), Math.max(0, (this.f9896o00oOoO.height() - min2) / 2));
                this.f9897o00oOoO0 = min2 * 0.5f;
            } else {
                o00oOo0o(this.f9893o00oOo00, this.f9902o00oOooo, this.f9903o00oo00O, getBounds(), this.f9896o00oOoO);
            }
            this.f9898o00oOoOO.set(this.f9896o00oOoO);
            if (this.f9894o00oOo0O != null) {
                Matrix matrix = this.f9895o00oOo0o;
                RectF rectF = this.f9898o00oOoOO;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f9895o00oOo0o.preScale(this.f9898o00oOoOO.width() / this.f9891o00oOOo0.getWidth(), this.f9898o00oOoOO.height() / this.f9891o00oOOo0.getHeight());
                this.f9894o00oOo0O.setLocalMatrix(this.f9895o00oOo0o);
                this.f9901o00oOooO.setShader(this.f9894o00oOo0O);
            }
            this.f9899o00oOoOo = false;
        }
    }

    public final void o00oo0o0() {
        this.f9897o00oOoO0 = Math.min(this.f9903o00oo00O, this.f9902o00oOooo) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@oo0oO0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f9900o00oOoo0) {
            o00oo0o0();
        }
        this.f9899o00oOoOo = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f9901o00oOooO.getAlpha()) {
            this.f9901o00oOooO.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9901o00oOooO.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f9901o00oOooO.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f9901o00oOooO.setFilterBitmap(z);
        invalidateSelf();
    }
}
