package com.roger.catloadinglibrary;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.HashMap;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b2\u00106B#\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b2\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0014J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010!¨\u00069"}, d2 = {"Lcom/roger/catloadinglibrary/GraduallyTextView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "o00oOoO0", "", "duration", "setDuration", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "o00oOo0O", "Landroid/graphics/Paint;", "o00oo0O0", "Landroid/graphics/Paint;", "paint", "Landroid/animation/ValueAnimator;", "o00oo0O", "Landroid/animation/ValueAnimator;", "valueAnimator", "", "o00oo0Oo", "Ljava/lang/CharSequence;", "charSequence", "o00oo0o0", "I", "startY", "", "o00oo0o", "F", "progress", "", "o00oo0oO", "Z", "isLoading", "o0O0o", "textLength", "o00oo", "isStop", "o00ooO00", "localScaleX", "o00ooO0", "o00ooO0O", "singleDuration", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "catloadinglibrary_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class GraduallyTextView extends AppCompatEditText {

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f6556o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ValueAnimator f6557o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Paint f6558o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public CharSequence f6559o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f6560o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f6561o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f6562o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f6563o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public float f6564o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public float f6565o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public HashMap f6566o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f6567o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Lo0OO0o/oO0Ooooo;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 implements ValueAnimator.AnimatorUpdateListener {
        public o00oOOo0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            GraduallyTextView graduallyTextView = GraduallyTextView.this;
            o0ooO.o00oo0OO(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            graduallyTextView.f6560o00oo0o = ((Float) animatedValue).floatValue();
            GraduallyTextView.this.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduallyTextView(@NotNull Context context) {
        super(context);
        o0ooO.o00oo0O0(context, "context");
        this.f6556o00oo = true;
        this.f6563o00ooO0 = 2000;
        o00oOo0O();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduallyTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O0(context, "context");
        this.f6556o00oo = true;
        this.f6563o00ooO0 = 2000;
        o00oOo0O();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduallyTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        this.f6556o00oo = true;
        this.f6563o00ooO0 = 2000;
        o00oOo0O();
    }

    public void o00oOOo0() {
        HashMap hashMap = this.f6566o00ooO0o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View o00oOOoO(int i) {
        if (this.f6566o00ooO0o == null) {
            this.f6566o00ooO0o = new HashMap();
        }
        View view = (View) this.f6566o00ooO0o.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f6566o00ooO0o.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void o00oOo0O() {
        Paint paint = new Paint(1);
        this.f6558o00oo0O0 = paint;
        paint.setStyle(Paint.Style.FILL);
        setBackground(null);
        setCursorVisible(false);
        setFocusable(false);
        setEnabled(false);
        setFocusableInTouchMode(false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 100.0f).setDuration(this.f6563o00ooO0);
        o0ooO.o00oo0OO(duration, "ValueAnimator.ofFloat(0f…ration(duration.toLong())");
        this.f6557o00oo0O = duration;
        if (duration == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator = this.f6557o00oo0O;
        if (valueAnimator == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator.setRepeatCount(-1);
        ValueAnimator valueAnimator2 = this.f6557o00oo0O;
        if (valueAnimator2 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator2.setRepeatMode(1);
        ValueAnimator valueAnimator3 = this.f6557o00oo0O;
        if (valueAnimator3 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator3.addUpdateListener(new o00oOOo0());
    }

    public final void o00oOo0o() {
        if (this.f6556o00oo) {
            Editable text = getText();
            o0ooO.o00oo00O(text);
            this.f6567o0O0o = text.length();
            if (String.valueOf(getText()).length() == 0) {
                return;
            }
            this.f6562o00oo0oO = true;
            this.f6556o00oo = false;
            Editable text2 = getText();
            o0ooO.o00oo00O(text2);
            this.f6559o00oo0Oo = text2;
            this.f6564o00ooO00 = getTextScaleX() * 10;
            this.f6561o00oo0o0 = getLineHeight();
            Paint paint = this.f6558o00oo0O0;
            if (paint == null) {
                o0ooO.o00ooooO("paint");
            }
            paint.setColor(getCurrentTextColor());
            Paint paint2 = this.f6558o00oo0O0;
            if (paint2 == null) {
                o0ooO.o00ooooO("paint");
            }
            paint2.setTextSize(getTextSize());
            setMinWidth(getWidth());
            setText("");
            setHint("");
            ValueAnimator valueAnimator = this.f6557o00oo0O;
            if (valueAnimator == null) {
                o0ooO.o00ooooO("valueAnimator");
            }
            valueAnimator.start();
            this.f6565o00ooO0O = 100.0f / this.f6567o0O0o;
        }
    }

    public final void o00oOoO0() {
        this.f6562o00oo0oO = false;
        ValueAnimator valueAnimator = this.f6557o00oo0O;
        if (valueAnimator == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator.end();
        ValueAnimator valueAnimator2 = this.f6557o00oo0O;
        if (valueAnimator2 == null) {
            o0ooO.o00ooooO("valueAnimator");
        }
        valueAnimator2.cancel();
        this.f6556o00oo = true;
        CharSequence charSequence = this.f6559o00oo0Oo;
        if (charSequence == null) {
            o0ooO.o00ooooO("charSequence");
        }
        setText(charSequence);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        o0ooO.o00oo0O0(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f6556o00oo) {
            return;
        }
        Paint paint = this.f6558o00oo0O0;
        if (paint == null) {
            o0ooO.o00ooooO("paint");
        }
        paint.setAlpha(255);
        if (this.f6560o00oo0o / this.f6565o00ooO0O >= 1) {
            CharSequence charSequence = this.f6559o00oo0Oo;
            if (charSequence == null) {
                o0ooO.o00ooooO("charSequence");
            }
            String obj = charSequence.toString();
            int i = (int) (this.f6560o00oo0o / this.f6565o00ooO0O);
            float f = this.f6564o00ooO00;
            float f2 = this.f6561o00oo0o0;
            Paint paint2 = this.f6558o00oo0O0;
            if (paint2 == null) {
                o0ooO.o00ooooO("paint");
            }
            canvas.drawText(obj, 0, i, f, f2, paint2);
        }
        Paint paint3 = this.f6558o00oo0O0;
        if (paint3 == null) {
            o0ooO.o00ooooO("paint");
        }
        float f3 = this.f6560o00oo0o;
        float f4 = this.f6565o00ooO0O;
        paint3.setAlpha((int) (((f3 % f4) / f4) * 255));
        int i2 = (int) (this.f6560o00oo0o / this.f6565o00ooO0O);
        if (i2 < this.f6567o0O0o) {
            CharSequence charSequence2 = this.f6559o00oo0Oo;
            if (charSequence2 == null) {
                o0ooO.o00ooooO("charSequence");
            }
            String valueOf = String.valueOf(charSequence2.charAt(i2));
            float f5 = this.f6564o00ooO00;
            Paint paint4 = this.f6558o00oo0O0;
            if (paint4 == null) {
                o0ooO.o00ooooO("paint");
            }
            CharSequence charSequence3 = this.f6559o00oo0Oo;
            if (charSequence3 == null) {
                o0ooO.o00ooooO("charSequence");
            }
            float measureText = paint4.measureText(charSequence3.subSequence(0, i2).toString()) + f5;
            float height = getHeight() / 2;
            Paint paint5 = this.f6558o00oo0O0;
            if (paint5 == null) {
                o0ooO.o00ooooO("paint");
            }
            canvas.drawText(valueOf, 0, 1, measureText, height, paint5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(@NotNull View view, int i) {
        o0ooO.o00oo0O0(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (this.f6562o00oo0oO) {
            if (i == 0) {
                ValueAnimator valueAnimator = this.f6557o00oo0O;
                if (valueAnimator == null) {
                    o0ooO.o00ooooO("valueAnimator");
                }
                valueAnimator.resume();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6557o00oo0O;
            if (valueAnimator2 == null) {
                o0ooO.o00ooooO("valueAnimator");
            }
            valueAnimator2.pause();
        }
    }

    public final void setDuration(int i) {
        this.f6563o00ooO0 = i;
    }
}
