package o00oOoO0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R;
import com.google.common.collect.LinkedHashMultimap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
/* loaded from: classes.dex */
public class o00oo00O extends Drawable {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f6979o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f6980o00oo00O = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final float f6981o00oo0O = (float) Math.toRadians(45.0d);

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f6982o00oo0O0 = 3;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f6983o00oo0OO = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Paint f6984o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f6985o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float f6986o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f6987o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f6988o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final int f6989o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Path f6990o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f6991o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f6992o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public float f6993o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f6994o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f6995o00oOooo;

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    public o00oo00O(Context context) {
        Paint paint = new Paint();
        this.f6984o00oOOo0 = paint;
        this.f6990o00oOoO0 = new Path();
        this.f6991o00oOoOO = false;
        this.f6995o00oOooo = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        o00oo0O0(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        o00oo0OO(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        o00oo0o(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        o00oo0Oo(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f6989o00oOoO = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f6986o00oOo00 = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f6985o00oOOoO = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f6994o00oOooO = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float o00oOoo0(float f, float f2, float f3) {
        return o00oOoO.o00oOOo0(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oo0oO0 Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.f6995o00oOooo;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? o0O0O0Oo.o00oOo00.o00oOOo0(this) == 0 : o0O0O0Oo.o00oOo00.o00oOOo0(this) == 1))) {
            z = true;
        }
        float f2 = this.f6985o00oOOoO;
        float sqrt = (float) Math.sqrt(f2 * f2 * 2.0f);
        float f3 = this.f6986o00oOo00;
        float f4 = this.f6992o00oOoOo;
        float o00oOOo02 = o00oOoO.o00oOOo0(sqrt, f3, f4, f3);
        float o00oOOo03 = o00oOoO.o00oOOo0(this.f6994o00oOooO, f3, f4, f3);
        float round = Math.round(((this.f6993o00oOoo0 - 0.0f) * f4) + 0.0f);
        float f5 = f6981o00oo0O;
        float f6 = this.f6992o00oOoOo;
        float o00oOOo04 = o00oOoO.o00oOOo0(f5, 0.0f, f6, 0.0f);
        float f7 = z ? 0.0f : -180.0f;
        float o00oOOo05 = o00oOoO.o00oOOo0(z ? 180.0f : 0.0f, f7, f6, f7);
        double d = o00oOOo02;
        double d2 = o00oOOo04;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(Math.sin(d2) * d);
        this.f6990o00oOoO0.rewind();
        float strokeWidth = this.f6984o00oOOo0.getStrokeWidth() + this.f6987o00oOo0O;
        float o00oOOo06 = o00oOoO.o00oOOo0(-this.f6993o00oOoo0, strokeWidth, this.f6992o00oOoOo, strokeWidth);
        float f8 = (-o00oOOo03) / 2.0f;
        this.f6990o00oOoO0.moveTo(f8 + round, 0.0f);
        this.f6990o00oOoO0.rLineTo(o00oOOo03 - (round * 2.0f), 0.0f);
        this.f6990o00oOoO0.moveTo(f8, o00oOOo06);
        this.f6990o00oOoO0.rLineTo(round2, round3);
        this.f6990o00oOoO0.moveTo(f8, -o00oOOo06);
        this.f6990o00oOoO0.rLineTo(round2, -round3);
        this.f6990o00oOoO0.close();
        canvas.save();
        float strokeWidth2 = this.f6984o00oOOo0.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth2);
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + this.f6987o00oOo0O + ((((int) (height - (2.0f * f))) / 4) * 2));
        if (this.f6988o00oOo0o) {
            canvas.rotate(o00oOOo05 * (this.f6991o00oOoOO ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f6990o00oOoO0, this.f6984o00oOOo0);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6989o00oOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6989o00oOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float o00oOOo0() {
        return this.f6985o00oOOoO;
    }

    public float o00oOOoO() {
        return this.f6994o00oOooO;
    }

    public float o00oOo00() {
        return this.f6986o00oOo00;
    }

    @o0O00O
    public int o00oOo0O() {
        return this.f6984o00oOOo0.getColor();
    }

    public int o00oOo0o() {
        return this.f6995o00oOooo;
    }

    public final Paint o00oOoO() {
        return this.f6984o00oOOo0;
    }

    public float o00oOoO0() {
        return this.f6987o00oOo0O;
    }

    @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float o00oOoOO() {
        return this.f6992o00oOoOo;
    }

    public boolean o00oOoOo() {
        return this.f6988o00oOo0o;
    }

    public float o00oOooO() {
        return this.f6984o00oOOo0.getStrokeWidth();
    }

    public void o00oOooo(float f) {
        if (this.f6985o00oOOoO != f) {
            this.f6985o00oOOoO = f;
            invalidateSelf();
        }
    }

    public void o00oo0(float f) {
        if (this.f6986o00oOo00 != f) {
            this.f6986o00oOo00 = f;
            invalidateSelf();
        }
    }

    public void o00oo00O(float f) {
        if (this.f6994o00oOooO != f) {
            this.f6994o00oOooO = f;
            invalidateSelf();
        }
    }

    public void o00oo0O(int i) {
        if (i != this.f6995o00oOooo) {
            this.f6995o00oOooo = i;
            invalidateSelf();
        }
    }

    public void o00oo0O0(@o0O00O int i) {
        if (i != this.f6984o00oOOo0.getColor()) {
            this.f6984o00oOOo0.setColor(i);
            invalidateSelf();
        }
    }

    public void o00oo0OO(float f) {
        if (this.f6984o00oOOo0.getStrokeWidth() != f) {
            this.f6984o00oOOo0.setStrokeWidth(f);
            this.f6993o00oOoo0 = (float) (Math.cos(f6981o00oo0O) * (f / 2.0f));
            invalidateSelf();
        }
    }

    public void o00oo0Oo(float f) {
        if (f != this.f6987o00oOo0O) {
            this.f6987o00oOo0O = f;
            invalidateSelf();
        }
    }

    public void o00oo0o(boolean z) {
        if (this.f6988o00oOo0o != z) {
            this.f6988o00oOo0o = z;
            invalidateSelf();
        }
    }

    public void o00oo0o0(@o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        if (this.f6992o00oOoOo != f) {
            this.f6992o00oOoOo = f;
            invalidateSelf();
        }
    }

    public void o00oo0oO(boolean z) {
        if (this.f6991o00oOoOO != z) {
            this.f6991o00oOoOO = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f6984o00oOOo0.getAlpha()) {
            this.f6984o00oOOo0.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6984o00oOOo0.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
