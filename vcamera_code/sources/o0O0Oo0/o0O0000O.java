package o0O0Oo0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0000O extends Drawable implements Animatable {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f11841o00ooO = 6;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final float f11842o00ooO0 = 11.0f;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f11843o00ooO00 = 0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final float f11844o00ooO0O = 3.0f;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f11845o00ooO0o = 12;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final float f11846o00ooOO = 7.5f;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f11847o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final float f11848o00ooOOo = 2.5f;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f11849o00ooOo = 5;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f11850o00ooOo0 = 10;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final float f11852o00ooOoo = 0.75f;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f11853o00ooo0 = 1332;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final float f11854o00ooo00 = 0.5f;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final float f11855o00ooo0O = 216.0f;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final float f11856o00ooo0o = 0.8f;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final float f11857o00oooO = 0.01f;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final float f11858o00oooOO = 0.20999998f;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public float f11860o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O f11861o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Resources f11862o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f11863o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Animator f11864o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f11865o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final Interpolator f11859o0O0o = new LinearInterpolator();

    /* renamed from: o00oo  reason: collision with root package name */
    public static final Interpolator f11840o00oo = new o0O00o00.o00oOOoO();

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int[] f11851o00ooOoO = {-16777216};

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f11866o00oOOo0;

        public o00oOOo0(o00oOo0O o00ooo0o2) {
            this.f11866o00oOOo0 = o00ooo0o2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            o0O0000O.this.o00ooOOo(floatValue, this.f11866o00oOOo0);
            o0O0000O.this.o00oOOoO(floatValue, this.f11866o00oOOo0, false);
            o0O0000O.this.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Animator.AnimatorListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f11868o00oOOo0;

        public o00oOOoO(o00oOo0O o00ooo0o2) {
            this.f11868o00oOOo0 = o00ooo0o2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            o0O0000O.this.o00oOOoO(1.0f, this.f11868o00oOOo0, true);
            this.f11868o00oOOo0.o00ooo0o();
            this.f11868o00oOOo0.o0O0o();
            o0O0000O o0o0000o = o0O0000O.this;
            if (!o0o0000o.f11865o00oo0oO) {
                o0o0000o.f11863o00oo0o += 1.0f;
                return;
            }
            o0o0000o.f11865o00oo0oO = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f11868o00oOOo0.o00ooOoo(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0000O.this.f11863o00oo0o = 0.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final RectF f11870o00oOOo0 = new RectF();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Paint f11871o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Paint f11872o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f11873o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f11874o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public float f11875o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f11876o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int[] f11877o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f11878o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public float f11879o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Paint f11880o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public float f11881o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public boolean f11882o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public float f11883o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public float f11884o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public float f11885o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public Path f11886o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f11887o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f11888o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f11889o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public int f11890o00oo0oO;

        public o00oOo0O() {
            Paint paint = new Paint();
            this.f11871o00oOOoO = paint;
            Paint paint2 = new Paint();
            this.f11872o00oOo00 = paint2;
            Paint paint3 = new Paint();
            this.f11880o00oOooO = paint3;
            this.f11873o00oOo0O = 0.0f;
            this.f11874o00oOo0o = 0.0f;
            this.f11876o00oOoO0 = 0.0f;
            this.f11875o00oOoO = 5.0f;
            this.f11885o00oo0O0 = 1.0f;
            this.f11888o00oo0o = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void o00oOOo0(Canvas canvas, Rect rect) {
            RectF rectF = this.f11870o00oOOo0;
            float f = this.f11884o00oo0O;
            float f2 = (this.f11875o00oOoO / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f11887o00oo0Oo * this.f11885o00oo0O0) / 2.0f, this.f11875o00oOoO / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f11873o00oOo0O;
            float f4 = this.f11876o00oOoO0;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f11874o00oOo0o + f4) * 360.0f) - f5;
            this.f11871o00oOOoO.setColor(this.f11890o00oo0oO);
            this.f11871o00oOOoO.setAlpha(this.f11888o00oo0o);
            float f7 = this.f11875o00oOoO / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f11880o00oOooO);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f11871o00oOOoO);
            o00oOOoO(canvas, f5, f6, rectF);
        }

        public void o00oOOoO(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f11882o00oo0) {
                Path path = this.f11886o00oo0OO;
                if (path == null) {
                    Path path2 = new Path();
                    this.f11886o00oo0OO = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f11886o00oo0OO.moveTo(0.0f, 0.0f);
                this.f11886o00oo0OO.lineTo(this.f11887o00oo0Oo * this.f11885o00oo0O0, 0.0f);
                Path path3 = this.f11886o00oo0OO;
                float f3 = this.f11885o00oo0O0;
                path3.lineTo((this.f11887o00oo0Oo * f3) / 2.0f, this.f11889o00oo0o0 * f3);
                this.f11886o00oo0OO.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((this.f11887o00oo0Oo * this.f11885o00oo0O0) / 2.0f), (this.f11875o00oOoO / 2.0f) + rectF.centerY());
                this.f11886o00oo0OO.close();
                this.f11872o00oOo00.setColor(this.f11890o00oo0oO);
                this.f11872o00oOo00.setAlpha(this.f11888o00oo0o);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f11886o00oo0OO, this.f11872o00oOo00);
                canvas.restore();
            }
        }

        public int o00oOo00() {
            return this.f11888o00oo0o;
        }

        public float o00oOo0O() {
            return this.f11885o00oo0O0;
        }

        public float o00oOo0o() {
            return this.f11887o00oo0Oo;
        }

        public float o00oOoO() {
            return this.f11884o00oo0O;
        }

        public int o00oOoO0() {
            return this.f11880o00oOooO.getColor();
        }

        public int[] o00oOoOO() {
            return this.f11877o00oOoOO;
        }

        public float o00oOoOo() {
            return this.f11874o00oOo0o;
        }

        public int o00oOoo0() {
            return this.f11877o00oOoOO[o00oOooo()];
        }

        public float o00oOooO() {
            return this.f11889o00oo0o0;
        }

        public int o00oOooo() {
            return (this.f11878o00oOoOo + 1) % this.f11877o00oOoOO.length;
        }

        public void o00oo() {
            this.f11879o00oOoo0 = 0.0f;
            this.f11881o00oOooo = 0.0f;
            this.f11883o00oo00O = 0.0f;
            o00ooo00(0.0f);
            o00ooOo(0.0f);
            o00ooOoO(0.0f);
        }

        public boolean o00oo0() {
            return this.f11882o00oo0;
        }

        public float o00oo00O() {
            return this.f11876o00oOoO0;
        }

        public float o00oo0O() {
            return this.f11881o00oOooo;
        }

        public int o00oo0O0() {
            return this.f11877o00oOoOO[this.f11878o00oOoOo];
        }

        public float o00oo0OO() {
            return this.f11873o00oOo0O;
        }

        public float o00oo0Oo() {
            return this.f11883o00oo00O;
        }

        public Paint.Cap o00oo0o() {
            return this.f11871o00oOOoO.getStrokeCap();
        }

        public float o00oo0o0() {
            return this.f11879o00oOoo0;
        }

        public float o00oo0oO() {
            return this.f11875o00oOoO;
        }

        public void o00ooO(float f) {
            this.f11884o00oo0O = f;
        }

        public void o00ooO0(float f, float f2) {
            this.f11887o00oo0Oo = (int) f;
            this.f11889o00oo0o0 = (int) f2;
        }

        public void o00ooO00(int i) {
            this.f11888o00oo0o = i;
        }

        public void o00ooO0O(float f) {
            if (f != this.f11885o00oo0O0) {
                this.f11885o00oo0O0 = f;
            }
        }

        public void o00ooO0o(int i) {
            this.f11880o00oOooO.setColor(i);
        }

        public void o00ooOO(ColorFilter colorFilter) {
            this.f11871o00oOOoO.setColorFilter(colorFilter);
        }

        public void o00ooOO0(int i) {
            this.f11890o00oo0oO = i;
        }

        public void o00ooOOo(int i) {
            this.f11878o00oOoOo = i;
            this.f11890o00oo0oO = this.f11877o00oOoOO[i];
        }

        public void o00ooOo(float f) {
            this.f11874o00oOo0o = f;
        }

        public void o00ooOo0(@oo0oO0 int[] iArr) {
            this.f11877o00oOoOO = iArr;
            o00ooOOo(0);
        }

        public void o00ooOoO(float f) {
            this.f11876o00oOoO0 = f;
        }

        public void o00ooOoo(boolean z) {
            if (this.f11882o00oo0 != z) {
                this.f11882o00oo0 = z;
            }
        }

        public void o00ooo0(Paint.Cap cap) {
            this.f11871o00oOOoO.setStrokeCap(cap);
        }

        public void o00ooo00(float f) {
            this.f11873o00oOo0O = f;
        }

        public void o00ooo0O(float f) {
            this.f11875o00oOoO = f;
            this.f11871o00oOOoO.setStrokeWidth(f);
        }

        public void o00ooo0o() {
            this.f11879o00oOoo0 = this.f11873o00oOo0O;
            this.f11881o00oOooo = this.f11874o00oOo0o;
            this.f11883o00oo00O = this.f11876o00oOoO0;
        }

        public void o0O0o() {
            o00ooOOo(o00oOooo());
        }
    }

    public o0O0000O(@oo0oO0 Context context) {
        context.getClass();
        this.f11862o00oo0Oo = context.getResources();
        o00oOo0O o00ooo0o2 = new o00oOo0O();
        this.f11861o00oo0O0 = o00ooo0o2;
        o00ooo0o2.o00ooOo0(f11851o00ooOoO);
        o00ooO(2.5f);
        o00ooOO();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11860o00oo0O, bounds.exactCenterX(), bounds.exactCenterY());
        this.f11861o00oo0O0.o00oOOo0(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11861o00oo0O0.o00oOo00();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f11864o00oo0o0.isRunning();
    }

    public final void o00oOOo0(float f, o00oOo0O o00ooo0o2) {
        o00ooOOo(f, o00ooo0o2);
        o00ooo0o2.o00ooo00((((o00ooo0o2.o00oo0O() - 0.01f) - o00ooo0o2.o00oo0o0()) * f) + o00ooo0o2.o00oo0o0());
        o00ooo0o2.o00ooOo(o00ooo0o2.o00oo0O());
        o00ooo0o2.o00ooOoO(((((float) (Math.floor(o00ooo0o2.o00oo0Oo() / 0.8f) + 1.0d)) - o00ooo0o2.o00oo0Oo()) * f) + o00ooo0o2.o00oo0Oo());
    }

    public void o00oOOoO(float f, o00oOo0O o00ooo0o2, boolean z) {
        float interpolation;
        float f2;
        if (this.f11865o00oo0oO) {
            o00oOOo0(f, o00ooo0o2);
        } else if (f != 1.0f || z) {
            float o00oo0Oo2 = o00ooo0o2.o00oo0Oo();
            if (f < 0.5f) {
                interpolation = o00ooo0o2.o00oo0o0();
                f2 = (f11840o00oo.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float o00oo0o02 = o00ooo0o2.o00oo0o0() + 0.79f;
                interpolation = o00oo0o02 - (((1.0f - f11840o00oo.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = o00oo0o02;
            }
            o00ooo0o2.o00ooo00(interpolation);
            o00ooo0o2.o00ooOo(f2);
            o00ooo0o2.o00ooOoO((0.20999998f * f) + o00oo0Oo2);
            o00ooO00((f + this.f11863o00oo0o) * 216.0f);
        }
    }

    public final int o00oOo00(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    public float o00oOo0O() {
        return this.f11861o00oo0O0.o00oOooO();
    }

    public float o00oOo0o() {
        return this.f11861o00oo0O0.o00oOo0O();
    }

    public int o00oOoO() {
        return this.f11861o00oo0O0.o00oOoO0();
    }

    public float o00oOoO0() {
        return this.f11861o00oo0O0.o00oOo0o();
    }

    public float o00oOoOO() {
        return this.f11861o00oo0O0.o00oOoO();
    }

    @oo0oO0
    public int[] o00oOoOo() {
        return this.f11861o00oo0O0.o00oOoOO();
    }

    public float o00oOoo0() {
        return this.f11861o00oo0O0.o00oOoOo();
    }

    public boolean o00oOooO() {
        return this.f11861o00oo0O0.o00oo0();
    }

    public float o00oOooo() {
        return this.f11861o00oo0O0.o00oo00O();
    }

    public void o00oo(float f) {
        this.f11861o00oo0O0.o00ooOoO(f);
        invalidateSelf();
    }

    public float o00oo0() {
        return this.f11861o00oo0O0.o00oo0OO();
    }

    public final float o00oo00O() {
        return this.f11860o00oo0O;
    }

    public void o00oo0O(float f, float f2) {
        this.f11861o00oo0O0.o00ooO0(f, f2);
        invalidateSelf();
    }

    public float o00oo0O0() {
        return this.f11861o00oo0O0.o00oo0oO();
    }

    @oo0oO0
    public Paint.Cap o00oo0OO() {
        return this.f11861o00oo0O0.o00oo0o();
    }

    public void o00oo0Oo(boolean z) {
        this.f11861o00oo0O0.o00ooOoo(z);
        invalidateSelf();
    }

    public void o00oo0o(int i) {
        this.f11861o00oo0O0.o00ooO0o(i);
        invalidateSelf();
    }

    public void o00oo0o0(float f) {
        this.f11861o00oo0O0.o00ooO0O(f);
        invalidateSelf();
    }

    public void o00oo0oO(float f) {
        this.f11861o00oo0O0.o00ooO(f);
        invalidateSelf();
    }

    public void o00ooO(float f) {
        this.f11861o00oo0O0.o00ooo0O(f);
        invalidateSelf();
    }

    public final void o00ooO0(float f, float f2, float f3, float f4) {
        o00oOo0O o00ooo0o2 = this.f11861o00oo0O0;
        float f5 = this.f11862o00oo0Oo.getDisplayMetrics().density;
        o00ooo0o2.o00ooo0O(f2 * f5);
        o00ooo0o2.o00ooO(f * f5);
        o00ooo0o2.o00ooOOo(0);
        o00ooo0o2.o00ooO0(f3 * f5, f4 * f5);
    }

    public final void o00ooO00(float f) {
        this.f11860o00oo0O = f;
    }

    public void o00ooO0O(float f, float f2) {
        this.f11861o00oo0O0.o00ooo00(f);
        this.f11861o00oo0O0.o00ooOo(f2);
        invalidateSelf();
    }

    public void o00ooO0o(@oo0oO0 Paint.Cap cap) {
        this.f11861o00oo0O0.o00ooo0(cap);
        invalidateSelf();
    }

    public final void o00ooOO() {
        o00oOo0O o00ooo0o2 = this.f11861o00oo0O0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new o00oOOo0(o00ooo0o2));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f11859o0O0o);
        ofFloat.addListener(new o00oOOoO(o00ooo0o2));
        this.f11864o00oo0o0 = ofFloat;
    }

    public void o00ooOO0(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        o00ooO0(f, f2, f3, f4);
        invalidateSelf();
    }

    public void o00ooOOo(float f, o00oOo0O o00ooo0o2) {
        o00ooo0o2.o00ooOO0(f > 0.75f ? o00oOo00((f - 0.75f) / 0.25f, o00ooo0o2.o00oo0O0(), o00ooo0o2.o00oOoo0()) : o00ooo0o2.o00oo0O0());
    }

    public void o0O0o(@oo0oO0 int... iArr) {
        this.f11861o00oo0O0.o00ooOo0(iArr);
        this.f11861o00oo0O0.o00ooOOo(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f11861o00oo0O0.o00ooO00(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11861o00oo0O0.o00ooOO(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f11864o00oo0o0.cancel();
        this.f11861o00oo0O0.o00ooo0o();
        if (this.f11861o00oo0O0.o00oOoOo() != this.f11861o00oo0O0.o00oo0OO()) {
            this.f11865o00oo0oO = true;
            animator = this.f11864o00oo0o0;
            j = 666;
        } else {
            this.f11861o00oo0O0.o00ooOOo(0);
            this.f11861o00oo0O0.o00oo();
            animator = this.f11864o00oo0o0;
            j = 1332;
        }
        animator.setDuration(j);
        this.f11864o00oo0o0.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f11864o00oo0o0.cancel();
        o00ooO00(0.0f);
        this.f11861o00oo0O0.o00ooOoo(false);
        this.f11861o00oo0O0.o00ooOOo(0);
        this.f11861o00oo0O0.o00oo();
        invalidateSelf();
    }
}
