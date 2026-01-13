package o0O0Oo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.widget.o0O00000;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o0O000oo.o0O00oO0;
import o0O000oo.o0O0O0O;
import o0O000oo.o0O0O0Oo;
import o0O000oo.o0O0O0o0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O000 extends ViewGroup implements o0O0O0Oo, o0O00oO0 {
    @o0o0000

    /* renamed from: o0O00  reason: collision with root package name */
    public static final int f11760o0O00 = 56;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f11761o0O000o = 1;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f11762o0O000o0 = 0;
    @o0o0000

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f11763o0O000oo = 40;

    /* renamed from: o0O00O  reason: collision with root package name */
    public static final float f11764o0O00O = 2.0f;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static final int f11766o0O00O0o = 76;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public static final int f11767o0O00OO = -1;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public static final float f11768o0O00OOO = 0.5f;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public static final float f11769o0O00Oo = 0.8f;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public static final int f11770o0O00OoO = 300;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public static final int f11771o0O00Ooo = 200;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public static final int f11773o0O00o00 = 200;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public static final int f11774o0O00o0O = -328966;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public static final int f11775o0O00o0o = 64;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final int f11776o0OoO00O = 255;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public static final int f11777o0oO0Ooo = 150;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final int f11778o0ooOoOO = -1;

    /* renamed from: o0  reason: collision with root package name */
    public Animation f11779o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public final o0O0O0O f11780o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oo0O f11781o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public View f11782o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f11783o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f11784o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f11785o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f11786o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f11787o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final int[] f11788o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int[] f11789o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f11790o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f11791o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f11792o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f11793o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public boolean f11794o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f11795o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f11796o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f11797o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final DecelerateInterpolator f11798o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f11799o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public o0O00000 f11800o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f11801o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public float f11802o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public int f11803o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public int f11804o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f11805o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public Animation f11806o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public o0O0000O f11807o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public Animation f11808o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public Animation f11809o00ooooo;

    /* renamed from: o0O000  reason: collision with root package name */
    public boolean f11810o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public Animation f11811o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public boolean f11812o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public int f11813o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public o00oo0O0 f11814o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public final Animation f11815o0O000Oo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final o0O0O0o0 f11816o0O0o;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public final Animation f11817o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public Animation.AnimationListener f11818o0OoOoOo;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static final String f11765o0O00O0 = o0O000.class.getSimpleName();

    /* renamed from: o0O00o  reason: collision with root package name */
    public static final int[] f11772o0O00o = {16842766};

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Animation.AnimationListener {
        public o00oOOo0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o00oo0O o00oo0o2;
            o0O000 o0o000 = o0O000.this;
            if (!o0o000.f11783o00oo0Oo) {
                o0o000.o00oOooo();
                return;
            }
            o0o000.f11807o00oooo0.setAlpha(255);
            o0O000.this.f11807o00oooo0.start();
            o0O000 o0o0002 = o0O000.this;
            if (o0o0002.f11812o0O0000O && (o00oo0o2 = o0o0002.f11781o00oo0O) != null) {
                o00oo0o2.o00oOOo0();
            }
            o0O000 o0o0003 = o0O000.this;
            o0o0003.f11787o00ooO = o0o0003.f11800o00ooo00.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends Animation {
        public o00oOOoO() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O000.this.setAnimationProgress(f);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends Animation {
        public o00oOo00() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O000.this.setAnimationProgress(1.0f - f);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends Animation {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f11822o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f11823o00oo0O0;

        public o00oOo0O(int i, int i2) {
            this.f11823o00oo0O0 = i;
            this.f11822o00oo0O = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O0000O o0o0000o = o0O000.this.f11807o00oooo0;
            int i = this.f11823o00oo0O0;
            o0o0000o.setAlpha((int) (((this.f11822o00oo0O - i) * f) + i));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Animation.AnimationListener {
        public o00oOoO() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            o0O000 o0o000 = o0O000.this;
            if (o0o000.f11795o00ooOo) {
                return;
            }
            o0o000.o00oo0o(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends Animation {
        public o00oo0() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O000.this.o00oOoOo(f);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends Animation {
        public o00oo00O() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O000 o0o000 = o0O000.this;
            int abs = !o0o000.f11810o0O000 ? o0o000.f11804o00oooOO - Math.abs(o0o000.f11803o00oooO) : o0o000.f11804o00oooOO;
            o0O000 o0o0002 = o0O000.this;
            int i = o0o0002.f11801o00ooo0O;
            o0O000.this.setTargetOffsetTopAndBottom((i + ((int) ((abs - i) * f))) - o0o0002.f11800o00ooo00.getTop());
            o0O000.this.f11807o00oooo0.o00oo0o0(1.0f - f);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        void o00oOOo0();
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        boolean o00oOOo0(@oo0oO0 o0O000 o0o000, @o0OO00OO View view);
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends Animation {
        public o00oo0OO() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            o0O000 o0o000 = o0O000.this;
            float f2 = o0o000.f11802o00ooo0o;
            o0o000.setAnimationProgress(((-f2) * f) + f2);
            o0O000.this.o00oOoOo(f);
        }
    }

    public o0O000(@oo0oO0 Context context) {
        this(context, null);
    }

    public o0O000(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11783o00oo0Oo = false;
        this.f11784o00oo0o = -1.0f;
        this.f11789o00ooO00 = new int[2];
        this.f11788o00ooO0 = new int[2];
        this.f11796o00ooOo0 = -1;
        this.f11799o00ooo0 = -1;
        this.f11818o0OoOoOo = new o00oOOo0();
        this.f11815o0O000Oo = new o00oo00O();
        this.f11817o0OoOoOO = new o00oo0();
        this.f11785o00oo0o0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11791o00ooO0o = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f11798o00ooOoo = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11813o0O0000o = (int) (displayMetrics.density * 40.0f);
        o00oOooO();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f11804o00oooOO = i;
        this.f11784o00oo0o = i;
        this.f11816o0O0o = new o0O0O0o0(this);
        this.f11780o00oo = new o0O0O0O(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f11813o0O0000o;
        this.f11787o00ooO = i2;
        this.f11803o00oooO = i2;
        o00oOoOo(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11772o0O00o);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f11800o00ooo00.getBackground().setAlpha(i);
        this.f11807o00oooo0.setAlpha(i);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f11780o00oo.o00oOOo0(f, f2, z);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f11780o00oo.o00oOOoO(f, f2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f11780o00oo.o00oOo00(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f11780o00oo.o00oOo0o(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f11799o00ooo0;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup, o0O000oo.o0O0O0Oo
    public int getNestedScrollAxes() {
        return this.f11816o0O0o.o00oOOo0();
    }

    public int getProgressCircleDiameter() {
        return this.f11813o0O0000o;
    }

    public int getProgressViewEndOffset() {
        return this.f11804o00oooOO;
    }

    public int getProgressViewStartOffset() {
        return this.f11803o00oooO;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean hasNestedScrollingParent() {
        return this.f11780o00oo.o00oOoo0();
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean isNestedScrollingEnabled() {
        return this.f11780o00oo.o00oo00O();
    }

    public final void o00oOOo0(int i, Animation.AnimationListener animationListener) {
        this.f11801o00ooo0O = i;
        this.f11815o0O000Oo.reset();
        this.f11815o0O000Oo.setDuration(200L);
        this.f11815o0O000Oo.setInterpolator(this.f11798o00ooOoo);
        if (animationListener != null) {
            this.f11800o00ooo00.o00oOOoO(animationListener);
        }
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(this.f11815o0O000Oo);
    }

    public final void o00oOOoO(int i, Animation.AnimationListener animationListener) {
        if (this.f11795o00ooOo) {
            o00oo0oO(i, animationListener);
            return;
        }
        this.f11801o00ooo0O = i;
        this.f11817o0OoOoOO.reset();
        this.f11817o0OoOoOO.setDuration(200L);
        this.f11817o0OoOoOO.setInterpolator(this.f11798o00ooOoo);
        if (animationListener != null) {
            this.f11800o00ooo00.o00oOOoO(animationListener);
        }
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(this.f11817o0OoOoOO);
    }

    public boolean o00oOo00() {
        o00oo0O0 o00oo0o02 = this.f11814o0O000O;
        if (o00oo0o02 != null) {
            return o00oo0o02.o00oOOo0(this, this.f11782o00oo0O0);
        }
        View view = this.f11782o00oo0O0;
        return view instanceof ListView ? o0O00000.o00oOOo0.o00oOOo0((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void o00oOo0O() {
        if (this.f11782o00oo0O0 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f11800o00ooo00)) {
                    this.f11782o00oo0O0 = childAt;
                    return;
                }
            }
        }
    }

    public final void o00oOo0o(float f) {
        if (f > this.f11784o00oo0o) {
            o00oo0OO(true, true);
            return;
        }
        this.f11783o00oo0Oo = false;
        this.f11807o00oooo0.o00ooO0O(0.0f, 0.0f);
        o00oOOoO(this.f11787o00ooO, this.f11795o00ooOo ? null : new o00oOoO());
        this.f11807o00oooo0.o00oo0Oo(false);
    }

    public boolean o00oOoO() {
        return this.f11783o00oo0Oo;
    }

    public final boolean o00oOoO0(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void o00oOoOO(float f) {
        this.f11807o00oooo0.o00oo0Oo(true);
        float min = Math.min(1.0f, Math.abs(f / this.f11784o00oo0o));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f11784o00oo0o;
        int i = this.f11805o00oooOo;
        if (i <= 0) {
            i = this.f11810o0O000 ? this.f11804o00oooOO - this.f11803o00oooO : this.f11804o00oooOO;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f11803o00oooO + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f11800o00ooo00.getVisibility() != 0) {
            this.f11800o00ooo00.setVisibility(0);
        }
        if (!this.f11795o00ooOo) {
            this.f11800o00ooo00.setScaleX(1.0f);
            this.f11800o00ooo00.setScaleY(1.0f);
        }
        if (this.f11795o00ooOo) {
            setAnimationProgress(Math.min(1.0f, f / this.f11784o00oo0o));
        }
        if (f < this.f11784o00oo0o) {
            if (this.f11807o00oooo0.getAlpha() > 76 && !o00oOoO0(this.f11809o00ooooo)) {
                o00oo0o0();
            }
        } else if (this.f11807o00oooo0.getAlpha() < 255 && !o00oOoO0(this.f11779o0)) {
            o00oo0Oo();
        }
        this.f11807o00oooo0.o00ooO0O(0.0f, Math.min(0.8f, max * 0.8f));
        this.f11807o00oooo0.o00oo0o0(Math.min(1.0f, max));
        this.f11807o00oooo0.o00oo(((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f11787o00ooO);
    }

    public void o00oOoOo(float f) {
        int i = this.f11801o00ooo0O;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f11803o00oooO - i) * f))) - this.f11800o00ooo00.getTop());
    }

    public final void o00oOoo0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11796o00ooOo0) {
            this.f11796o00ooOo0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public final void o00oOooO() {
        this.f11800o00ooo00 = new o0O00000(getContext(), f11774o0O00o0O);
        o0O0000O o0o0000o = new o0O0000O(getContext());
        this.f11807o00oooo0 = o0o0000o;
        o0o0000o.o00ooOO0(1);
        this.f11800o00ooo00.setImageDrawable(this.f11807o00oooo0);
        this.f11800o00ooo00.setVisibility(8);
        addView(this.f11800o00ooo00);
    }

    public void o00oOooo() {
        this.f11800o00ooo00.clearAnimation();
        this.f11807o00oooo0.stop();
        this.f11800o00ooo00.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f11795o00ooOo) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f11803o00oooO - this.f11787o00ooO);
        }
        this.f11787o00ooO = this.f11800o00ooo00.getTop();
    }

    public void o00oo0(boolean z, int i, int i2) {
        this.f11795o00ooOo = z;
        this.f11803o00oooO = i;
        this.f11804o00oooOO = i2;
        this.f11810o0O000 = true;
        o00oOooo();
        this.f11783o00oo0Oo = false;
    }

    public void o00oo00O(boolean z, int i) {
        this.f11804o00oooOO = i;
        this.f11795o00ooOo = z;
        this.f11800o00ooo00.invalidate();
    }

    public final void o00oo0O(float f) {
        float f2 = this.f11792o00ooOO;
        int i = this.f11785o00oo0o0;
        if (f - f2 <= i || this.f11794o00ooOOo) {
            return;
        }
        this.f11793o00ooOO0 = f2 + i;
        this.f11794o00ooOOo = true;
        this.f11807o00oooo0.setAlpha(76);
    }

    public final Animation o00oo0O0(int i, int i2) {
        o00oOo0O o00ooo0o2 = new o00oOo0O(i, i2);
        o00ooo0o2.setDuration(300L);
        this.f11800o00ooo00.o00oOOoO(null);
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(o00ooo0o2);
        return o00ooo0o2;
    }

    public final void o00oo0OO(boolean z, boolean z2) {
        if (this.f11783o00oo0Oo != z) {
            this.f11812o0O0000O = z2;
            o00oOo0O();
            this.f11783o00oo0Oo = z;
            if (z) {
                o00oOOo0(this.f11787o00ooO, this.f11818o0OoOoOo);
            } else {
                o00oo0o(this.f11818o0OoOoOo);
            }
        }
    }

    public final void o00oo0Oo() {
        this.f11779o0 = o00oo0O0(this.f11807o00oooo0.getAlpha(), 255);
    }

    public void o00oo0o(Animation.AnimationListener animationListener) {
        o00oOo00 o00ooo002 = new o00oOo00();
        this.f11808o00ooooO = o00ooo002;
        o00ooo002.setDuration(150L);
        this.f11800o00ooo00.o00oOOoO(animationListener);
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(this.f11808o00ooooO);
    }

    public final void o00oo0o0() {
        this.f11809o00ooooo = o00oo0O0(this.f11807o00oooo0.getAlpha(), 76);
    }

    public final void o00oo0oO(int i, Animation.AnimationListener animationListener) {
        this.f11801o00ooo0O = i;
        this.f11802o00ooo0o = this.f11800o00ooo00.getScaleX();
        o00oo0OO o00oo0oo = new o00oo0OO();
        this.f11811o0O00000 = o00oo0oo;
        o00oo0oo.setDuration(150L);
        if (animationListener != null) {
            this.f11800o00ooo00.o00oOOoO(animationListener);
        }
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(this.f11811o0O00000);
    }

    public final void o0O0o(Animation.AnimationListener animationListener) {
        this.f11800o00ooo00.setVisibility(0);
        this.f11807o00oooo0.setAlpha(255);
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f11806o00oooo = o00ooooo2;
        o00ooooo2.setDuration(this.f11791o00ooO0o);
        if (animationListener != null) {
            this.f11800o00ooo00.o00oOOoO(animationListener);
        }
        this.f11800o00ooo00.clearAnimation();
        this.f11800o00ooo00.startAnimation(this.f11806o00oooo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oOooo();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        o00oOo0O();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11797o00ooOoO && actionMasked == 0) {
            this.f11797o00ooOoO = false;
        }
        if (!isEnabled() || this.f11797o00ooOoO || o00oOo00() || this.f11783o00oo0Oo || this.f11790o00ooO0O) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f11796o00ooOo0;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    o00oo0O(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        o00oOoo0(motionEvent);
                    }
                }
            }
            this.f11794o00ooOOo = false;
            this.f11796o00ooOo0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f11803o00oooO - this.f11800o00ooo00.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f11796o00ooOo0 = pointerId;
            this.f11794o00ooOOo = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f11792o00ooOO = motionEvent.getY(findPointerIndex2);
        }
        return this.f11794o00ooOOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f11782o00oo0O0 == null) {
            o00oOo0O();
        }
        View view = this.f11782o00oo0O0;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f11800o00ooo00.getMeasuredWidth();
        int measuredHeight2 = this.f11800o00ooo00.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f11787o00ooO;
        this.f11800o00ooo00.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11782o00oo0O0 == null) {
            o00oOo0O();
        }
        View view = this.f11782o00oo0O0;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f11800o00ooo00.measure(View.MeasureSpec.makeMeasureSpec(this.f11813o0O0000o, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11813o0O0000o, 1073741824));
        this.f11799o00ooo0 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f11800o00ooo00) {
                this.f11799o00ooo0 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f11786o00oo0oO;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f11786o00oo0oO = 0.0f;
                } else {
                    this.f11786o00oo0oO = f - f2;
                    iArr[1] = i2;
                }
                o00oOoOO(this.f11786o00oo0oO);
            }
        }
        if (this.f11810o0O000 && i2 > 0 && this.f11786o00oo0oO == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f11800o00ooo00.setVisibility(8);
        }
        int[] iArr2 = this.f11789o00ooO00;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f11788o00ooO0);
        int i5 = i4 + this.f11788o00ooO0[1];
        if (i5 >= 0 || o00oOo00()) {
            return;
        }
        float abs = this.f11786o00oo0oO + Math.abs(i5);
        this.f11786o00oo0oO = abs;
        o00oOoOO(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f11816o0O0o.o00oOOoO(view, view2, i);
        startNestedScroll(i & 2);
        this.f11786o00oo0oO = 0.0f;
        this.f11790o00ooO0O = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f11797o00ooOoO || this.f11783o00oo0Oo || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onStopNestedScroll(View view) {
        this.f11816o0O0o.o00oOooO(view);
        this.f11790o00ooO0O = false;
        float f = this.f11786o00oo0oO;
        if (f > 0.0f) {
            o00oOo0o(f);
            this.f11786o00oo0oO = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11797o00ooOoO && actionMasked == 0) {
            this.f11797o00ooOoO = false;
        }
        if (!isEnabled() || this.f11797o00ooOoO || o00oOo00() || this.f11783o00oo0Oo || this.f11790o00ooO0O) {
            return false;
        }
        if (actionMasked == 0) {
            this.f11796o00ooOo0 = motionEvent.getPointerId(0);
            this.f11794o00ooOOo = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f11796o00ooOo0);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f11794o00ooOOo) {
                this.f11794o00ooOOo = false;
                o00oOo0o((motionEvent.getY(findPointerIndex) - this.f11793o00ooOO0) * 0.5f);
            }
            this.f11796o00ooOo0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f11796o00ooOo0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            o00oo0O(y);
            if (this.f11794o00ooOOo) {
                float f = (y - this.f11793o00ooOO0) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                o00oOoOO(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f11796o00ooOo0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o00oOoo0(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f11782o00oo0O0;
        if (view == null || o0O0o00O.oo0OOoo(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        this.f11800o00ooo00.setScaleX(f);
        this.f11800o00ooo00.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@o0O00OOO int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@o0O00O int... iArr) {
        o00oOo0O();
        this.f11807o00oooo0.o0O0o(iArr);
    }

    public void setColorSchemeResources(@o0O00OOO int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = o0.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f11784o00oo0o = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        o00oOooo();
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void setNestedScrollingEnabled(boolean z) {
        this.f11780o00oo.o00oo0O0(z);
    }

    public void setOnChildScrollUpCallback(@o0OO00OO o00oo0O0 o00oo0o02) {
        this.f11814o0O000O = o00oo0o02;
    }

    public void setOnRefreshListener(@o0OO00OO o00oo0O o00oo0o2) {
        this.f11781o00oo0O = o00oo0o2;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@o0O00O int i) {
        this.f11800o00ooo00.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@o0O00OOO int i) {
        setProgressBackgroundColorSchemeColor(o0.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f11783o00oo0Oo == z) {
            o00oo0OO(z, false);
            return;
        }
        this.f11783o00oo0Oo = z;
        setTargetOffsetTopAndBottom((!this.f11810o0O000 ? this.f11804o00oooOO + this.f11803o00oooO : this.f11804o00oooOO) - this.f11787o00ooO);
        this.f11812o0O0000O = false;
        o0O0o(this.f11818o0OoOoOo);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f11813o0O0000o = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f11800o00ooo00.setImageDrawable(null);
            this.f11807o00oooo0.o00ooOO0(i);
            this.f11800o00ooo00.setImageDrawable(this.f11807o00oooo0);
        }
    }

    public void setSlingshotDistance(@o0OO0 int i) {
        this.f11805o00oooOo = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f11800o00ooo00.bringToFront();
        o0O0o00O.o0O0o00o(this.f11800o00ooo00, i);
        this.f11787o00ooO = this.f11800o00ooo00.getTop();
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean startNestedScroll(int i) {
        return this.f11780o00oo.o00oo0Oo(i);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void stopNestedScroll() {
        this.f11780o00oo.o00oo0o();
    }
}
