package o0O0Oo0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import o00ooo0.o0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O00000 extends ImageView {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f11829o00oo = 4;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f11830o00oo0Oo = 503316480;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final float f11831o00oo0o = 0.0f;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f11832o00oo0o0 = 1023410176;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final float f11833o00oo0oO = 1.75f;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final float f11834o0O0o = 3.5f;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f11835o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Animation.AnimationListener f11836o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends OvalShape {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Paint f11837o00oo0O = new Paint();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public RadialGradient f11838o00oo0O0;

        public o00oOOo0(int i) {
            o0O00000.this.f11835o00oo0O = i;
            o00oOOoO((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = o0O00000.this.getWidth() / 2;
            float height = o0O00000.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f11837o00oo0O);
            canvas.drawCircle(width2, height, width - o0O00000.this.f11835o00oo0O, paint);
        }

        public final void o00oOOoO(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, o0O00000.this.f11835o00oo0O, new int[]{o0O00000.f11832o00oo0o0, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f11838o00oo0O0 = radialGradient;
            this.f11837o00oo0O.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            o00oOOoO((int) f);
        }
    }

    public o0O00000(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f11835o00oo0O = (int) (3.5f * f);
        if (o00oOOo0()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            o0O0o00O.o0OO000(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new o00oOOo0(this.f11835o00oo0O));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f11835o00oo0O, i3, i2, f11830o00oo0Oo);
            int i4 = this.f11835o00oo0O;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        o0O0o00O.o0O0ooo0(this, shapeDrawable);
    }

    public final boolean o00oOOo0() {
        return true;
    }

    public void o00oOOoO(Animation.AnimationListener animationListener) {
        this.f11836o00oo0O0 = animationListener;
    }

    public void o00oOo00(int i) {
        setBackgroundColor(o0.getColor(getContext(), i));
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f11836o00oo0O0;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f11836o00oo0O0;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (o00oOOo0()) {
            return;
        }
        setMeasuredDimension((this.f11835o00oo0O * 2) + getMeasuredWidth(), (this.f11835o00oo0O * 2) + getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
