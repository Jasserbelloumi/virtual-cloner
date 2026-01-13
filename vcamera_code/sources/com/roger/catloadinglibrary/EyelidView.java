package com.roger.catloadinglibrary;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b-\u00101B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b-\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#¨\u00064"}, d2 = {"Lcom/roger/catloadinglibrary/EyelidView;", "Landroid/view/View;", "", TtmlNode.ATTR_TTS_COLOR, "Lo0OO0o/oO0Ooooo;", "setColor", "o00oOoO0", "o00oOo0o", "o00oOoO", "duration", "setDuration", "changedView", "visibility", "onVisibilityChanged", "", "fromFull", "setFromFull", "Landroid/graphics/Canvas;", "canvas", "onDraw", "o00oOo0O", "o00oOoOO", "Landroid/animation/ValueAnimator;", "o00oo0O0", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/graphics/Paint;", "o00oo0O", "Landroid/graphics/Paint;", "paint", "", "o00oo0Oo", "F", "progress", "o00oo0o0", "Z", "isLoading", "o00oo0o", "isStop", "o00oo0oO", "I", "o0O0o", "isFromFull", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "catloadinglibrary_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class EyelidView extends View {

    /* renamed from: o00oo  reason: collision with root package name */
    public HashMap f6547o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Paint f6548o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ValueAnimator f6549o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f6550o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f6551o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f6552o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f6553o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f6554o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Lo0OO0o/oO0Ooooo;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 implements ValueAnimator.AnimatorUpdateListener {
        public o00oOOo0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            EyelidView eyelidView = EyelidView.this;
            o0ooO.o00oo0OO(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            eyelidView.f6550o00oo0Oo = ((Float) animatedValue).floatValue();
            EyelidView.this.invalidate();
        }
    }

    public EyelidView(@Nullable Context context) {
        super(context);
        this.f6551o00oo0o = true;
        this.f6553o00oo0oO = 1000;
        o00oOo0O();
    }

    public EyelidView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6551o00oo0o = true;
        this.f6553o00oo0oO = 1000;
        o00oOo0O();
    }

    public EyelidView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6551o00oo0o = true;
        this.f6553o00oo0oO = 1000;
        o00oOo0O();
    }

    public void o00oOOo0() {
        HashMap hashMap = this.f6547o00oo;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View o00oOOoO(int i) {
        if (this.f6547o00oo == null) {
            this.f6547o00oo = new HashMap();
        }
        View view = (View) this.f6547o00oo.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f6547o00oo.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void o00oOo0O() {
        Paint paint = new Paint(1);
        this.f6548o00oo0O = paint;
        paint.setColor(-16777216);
        Paint paint2 = this.f6548o00oo0O;
        if (paint2 == null) {
            o0ooO.o00ooooO("paint");
        }
        paint2.setStyle(Paint.Style.FILL);
        setBackground(null);
        setFocusable(false);
        setEnabled(false);
        setFocusableInTouchMode(false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f6553o00oo0oO);
        o0ooO.o00oo0OO(duration, "ValueAnimator.ofFloat(0f…ration(duration.toLong())");
        this.f6549o00oo0O0 = duration;
        if (duration == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator = this.f6549o00oo0O0;
        if (valueAnimator == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator.setRepeatCount(-1);
        ValueAnimator valueAnimator2 = this.f6549o00oo0O0;
        if (valueAnimator2 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator2.setRepeatMode(2);
        ValueAnimator valueAnimator3 = this.f6549o00oo0O0;
        if (valueAnimator3 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator3.addUpdateListener(new o00oOOo0());
    }

    public final void o00oOo0o() {
        ValueAnimator valueAnimator = this.f6549o00oo0O0;
        if (valueAnimator == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator.start();
    }

    public final void o00oOoO() {
        this.f6552o00oo0o0 = false;
        ValueAnimator valueAnimator = this.f6549o00oo0O0;
        if (valueAnimator == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator.end();
        ValueAnimator valueAnimator2 = this.f6549o00oo0O0;
        if (valueAnimator2 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator2.cancel();
        this.f6551o00oo0o = true;
    }

    public final void o00oOoO0() {
        if (this.f6551o00oo0o) {
            this.f6552o00oo0o0 = true;
            this.f6551o00oo0o = false;
            ValueAnimator valueAnimator = this.f6549o00oo0O0;
            if (valueAnimator == null) {
                o0ooO.o00ooooO("valueAnimator");
            }
            valueAnimator.start();
        }
    }

    public final boolean o00oOoOO() {
        return !this.f6552o00oo0o0 && this.f6550o00oo0Oo <= 0.001f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        o0ooO.o00oo0O0(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f6551o00oo0o) {
            return;
        }
        float height = (!this.f6554o0O0o ? this.f6550o00oo0Oo : 1.0f - this.f6550o00oo0Oo) * getHeight();
        if (height >= getHeight() / 2) {
            height = getHeight() / 2;
        }
        float f = height;
        float width = getWidth();
        Paint paint = this.f6548o00oo0O;
        if (paint == null) {
            o0ooO.o00ooooO("paint");
        }
        canvas.drawRect(0.0f, 0.0f, width, f, paint);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i) {
        o0ooO.o00oo0O0(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (this.f6552o00oo0o0) {
            if (i == 0) {
                ValueAnimator valueAnimator = this.f6549o00oo0O0;
                if (valueAnimator == null) {
                    o0ooO.o00ooooO("valueAnimator");
                }
                valueAnimator.resume();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6549o00oo0O0;
            if (valueAnimator2 == null) {
                o0ooO.o00ooooO("valueAnimator");
            }
            valueAnimator2.pause();
        }
    }

    public final void setColor(int i) {
        Paint paint = this.f6548o00oo0O;
        if (paint == null) {
            o0ooO.o00ooooO("paint");
        }
        paint.setColor(i);
    }

    public final void setDuration(int i) {
        this.f6553o00oo0oO = i;
    }

    public final void setFromFull(boolean z) {
        this.f6554o0O0o = z;
    }
}
