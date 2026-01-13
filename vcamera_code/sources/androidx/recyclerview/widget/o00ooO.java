package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
@o0o0000
/* loaded from: classes.dex */
public class o00ooO extends RecyclerView.o0 implements RecyclerView.o0OoOoOo {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f4424o00ooOO = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f4425o00ooOOo = 1;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f4426o00ooOo = 0;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f4427o00ooOo0 = 2;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f4428o00ooOoO = 1;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f4429o00ooOoo = 2;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f4430o00ooo0 = 1;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f4431o00ooo00 = 0;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f4432o00ooo0O = 2;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f4433o00ooo0o = 3;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f4434o00oooO = 500;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f4435o00oooOO = 1500;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f4436o00oooOo = 1200;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f4437o00oooo = 255;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f4438o00oooo0 = 500;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int[] f4439o00ooooO = {16842919};

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int[] f4440o00ooooo = new int[0];

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f4441o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f4442o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final StateListDrawable f4443o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f4444o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int f4445o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Drawable f4446o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final StateListDrawable f4447o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int f4448o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final int f4449o00oOoOo;
    @o0o0000

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f4450o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Drawable f4451o00oOooO;
    @o0o0000

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f4452o00oOooo;
    @o0o0000

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f4454o00oo0;
    @o0o0000

    /* renamed from: o00oo00O  reason: collision with root package name */
    public float f4455o00oo00O;
    @o0o0000

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public float f4457o00oo0O0;
    @o0o0000

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f4458o00oo0OO;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public RecyclerView f4461o00oo0o0;

    /* renamed from: o00ooO  reason: collision with root package name */
    public final Runnable f4463o00ooO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final ValueAnimator f4466o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f4467o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final RecyclerView.o0O000Oo f4468o00ooOO0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f4456o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f4459o00oo0Oo = 0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f4460o00oo0o = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f4462o00oo0oO = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f4469o0O0o = 0;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f4453o00oo = 0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int[] f4465o00ooO00 = new int[2];

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final int[] f4464o00ooO0 = new int[2];

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00ooO.this.o00oo0O(500);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends RecyclerView.o0O000Oo {
        public o00oOOoO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            o00ooO.this.o00ooOO(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4472o00oOOo0 = false;

        public o00oOo00() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4472o00oOOo0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4472o00oOOo0) {
                this.f4472o00oOOo0 = false;
            } else if (((Float) o00ooO.this.f4466o00ooO0O.getAnimatedValue()).floatValue() == 0.0f) {
                o00ooO o00ooo = o00ooO.this;
                o00ooo.f4467o00ooO0o = 0;
                o00ooo.o00ooO0o(0);
            } else {
                o00ooO o00ooo2 = o00ooO.this;
                o00ooo2.f4467o00ooO0o = 2;
                o00ooo2.o00ooO00();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements ValueAnimator.AnimatorUpdateListener {
        public o00oOo0O() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            o00ooO.this.f4443o00oOo00.setAlpha(floatValue);
            o00ooO.this.f4451o00oOooO.setAlpha(floatValue);
            o00ooO.this.o00ooO00();
        }
    }

    public o00ooO(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4466o00ooO0O = ofFloat;
        this.f4467o00ooO0o = 0;
        this.f4463o00ooO = new o00oOOo0();
        this.f4468o00ooOO0 = new o00oOOoO();
        this.f4443o00oOo00 = stateListDrawable;
        this.f4451o00oOooO = drawable;
        this.f4447o00oOoO0 = stateListDrawable2;
        this.f4446o00oOoO = drawable2;
        this.f4444o00oOo0O = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4445o00oOo0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f4448o00oOoOO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4449o00oOoOo = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4441o00oOOo0 = i2;
        this.f4442o00oOOoO = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new o00oOo00());
        ofFloat.addUpdateListener(new o00oOo0O());
        o00oOo0o(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
    public void o00oOOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
        if (this.f4469o0O0o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean o0O0o2 = o0O0o(motionEvent.getX(), motionEvent.getY());
            boolean o00oo0oO2 = o00oo0oO(motionEvent.getX(), motionEvent.getY());
            if (o0O0o2 || o00oo0oO2) {
                if (o00oo0oO2) {
                    this.f4453o00oo = 1;
                    this.f4457o00oo0O0 = (int) motionEvent.getX();
                } else if (o0O0o2) {
                    this.f4453o00oo = 2;
                    this.f4455o00oo00O = (int) motionEvent.getY();
                }
                o00ooO0o(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f4469o0O0o == 2) {
            this.f4455o00oo00O = 0.0f;
            this.f4457o00oo0O0 = 0.0f;
            o00ooO0o(1);
            this.f4453o00oo = 0;
        } else if (motionEvent.getAction() == 2 && this.f4469o0O0o == 2) {
            o00ooOO0();
            if (this.f4453o00oo == 1) {
                o00oo0Oo(motionEvent.getX());
            }
            if (this.f4453o00oo == 2) {
                o00ooOOo(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
    public boolean o00oOo00(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
        int i = this.f4469o0O0o;
        if (i == 1) {
            boolean o0O0o2 = o0O0o(motionEvent.getX(), motionEvent.getY());
            boolean o00oo0oO2 = o00oo0oO(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!o0O0o2 && !o00oo0oO2) {
                return false;
            }
            if (o00oo0oO2) {
                this.f4453o00oo = 1;
                this.f4457o00oo0O0 = (int) motionEvent.getX();
            } else if (o0O0o2) {
                this.f4453o00oo = 2;
                this.f4455o00oo00O = (int) motionEvent.getY();
            }
            o00ooO0o(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
    public void o00oOo0O(boolean z) {
    }

    public void o00oOo0o(@o0OO00OO RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4461o00oo0o0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            o00oOoO();
        }
        this.f4461o00oo0o0 = recyclerView;
        if (recyclerView != null) {
            o00ooO();
        }
    }

    public final void o00oOoO() {
        this.f4461o00oo0o0.removeItemDecoration(this);
        this.f4461o00oo0o0.removeOnItemTouchListener(this);
        this.f4461o00oo0o0.removeOnScrollListener(this.f4468o00ooOO0);
        o00oOoO0();
    }

    public final void o00oOoO0() {
        this.f4461o00oo0o0.removeCallbacks(this.f4463o00ooO);
    }

    public final void o00oOoOO(Canvas canvas) {
        int i = this.f4459o00oo0Oo;
        int i2 = this.f4448o00oOoOO;
        int i3 = i - i2;
        int i4 = this.f4458o00oo0OO;
        int i5 = this.f4454o00oo0;
        int i6 = i4 - (i5 / 2);
        this.f4447o00oOoO0.setBounds(0, 0, i5, i2);
        this.f4446o00oOoO.setBounds(0, 0, this.f4456o00oo0O, this.f4449o00oOoOo);
        canvas.translate(0.0f, i3);
        this.f4446o00oOoO.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f4447o00oOoO0.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    public final void o00oOoOo(Canvas canvas) {
        int i = this.f4456o00oo0O;
        int i2 = this.f4444o00oOo0O;
        int i3 = i - i2;
        int i4 = this.f4452o00oOooo;
        int i5 = this.f4450o00oOoo0;
        int i6 = i4 - (i5 / 2);
        this.f4443o00oOo00.setBounds(0, 0, i2, i5);
        this.f4451o00oOooO.setBounds(0, 0, this.f4445o00oOo0o, this.f4459o00oo0Oo);
        if (o00oo0o()) {
            this.f4451o00oOooO.draw(canvas);
            canvas.translate(this.f4444o00oOo0O, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4443o00oOo00.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i3 = this.f4444o00oOo0O;
        } else {
            canvas.translate(i3, 0.0f);
            this.f4451o00oOooO.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f4443o00oOo00.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    public final int[] o00oOoo0() {
        int[] iArr = this.f4464o00ooO0;
        int i = this.f4442o00oOOoO;
        iArr[0] = i;
        iArr[1] = this.f4456o00oo0O - i;
        return iArr;
    }

    @o0o0000
    public Drawable o00oOooo() {
        return this.f4447o00oOoO0;
    }

    @o0o0000
    public boolean o00oo() {
        return this.f4469o0O0o == 1;
    }

    public final int[] o00oo0() {
        int[] iArr = this.f4465o00ooO00;
        int i = this.f4442o00oOOoO;
        iArr[0] = i;
        iArr[1] = this.f4459o00oo0Oo - i;
        return iArr;
    }

    @o0o0000
    public Drawable o00oo00O() {
        return this.f4446o00oOoO;
    }

    @o0o0000
    public void o00oo0O(int i) {
        int i2 = this.f4467o00ooO0o;
        if (i2 == 1) {
            this.f4466o00ooO0O.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4467o00ooO0o = 3;
        ValueAnimator valueAnimator = this.f4466o00ooO0O;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4466o00ooO0O.setDuration(i);
        this.f4466o00ooO0O.start();
    }

    @o0o0000
    public Drawable o00oo0O0() {
        return this.f4451o00oOooO;
    }

    @o0o0000
    public Drawable o00oo0OO() {
        return this.f4443o00oOo00;
    }

    public final void o00oo0Oo(float f) {
        int[] o00oOoo02 = o00oOoo0();
        float max = Math.max(o00oOoo02[0], Math.min(o00oOoo02[1], f));
        if (Math.abs(this.f4458o00oo0OO - max) < 2.0f) {
            return;
        }
        int o00ooO0O2 = o00ooO0O(this.f4457o00oo0O0, max, o00oOoo02, this.f4461o00oo0o0.computeHorizontalScrollRange(), this.f4461o00oo0o0.computeHorizontalScrollOffset(), this.f4456o00oo0O);
        if (o00ooO0O2 != 0) {
            this.f4461o00oo0o0.scrollBy(o00ooO0O2, 0);
        }
        this.f4457o00oo0O0 = max;
    }

    public final boolean o00oo0o() {
        return o0O0o00O.o0O000O(this.f4461o00oo0o0) == 1;
    }

    public boolean o00oo0o0() {
        return this.f4469o0O0o == 2;
    }

    @o0o0000
    public boolean o00oo0oO(float f, float f2) {
        if (f2 >= this.f4459o00oo0Oo - this.f4448o00oOoOO) {
            int i = this.f4458o00oo0OO;
            int i2 = this.f4454o00oo0;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final void o00ooO() {
        this.f4461o00oo0o0.addItemDecoration(this);
        this.f4461o00oo0o0.addOnItemTouchListener(this);
        this.f4461o00oo0o0.addOnScrollListener(this.f4468o00ooOO0);
    }

    public final void o00ooO0(int i) {
        o00oOoO0();
        this.f4461o00oo0o0.postDelayed(this.f4463o00ooO, i);
    }

    public void o00ooO00() {
        this.f4461o00oo0o0.invalidate();
    }

    public final int o00ooO0O(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void o00ooO0o(int i) {
        int i2;
        if (i == 2 && this.f4469o0O0o != 2) {
            this.f4443o00oOo00.setState(f4439o00ooooO);
            o00oOoO0();
        }
        if (i == 0) {
            o00ooO00();
        } else {
            o00ooOO0();
        }
        if (this.f4469o0O0o != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1500;
            this.f4469o0O0o = i;
        }
        this.f4443o00oOo00.setState(f4440o00ooooo);
        i2 = f4436o00oooOo;
        o00ooO0(i2);
        this.f4469o0O0o = i;
    }

    public void o00ooOO(int i, int i2) {
        int computeVerticalScrollRange = this.f4461o00oo0o0.computeVerticalScrollRange();
        int i3 = this.f4459o00oo0Oo;
        this.f4460o00oo0o = computeVerticalScrollRange - i3 > 0 && i3 >= this.f4441o00oOOo0;
        int computeHorizontalScrollRange = this.f4461o00oo0o0.computeHorizontalScrollRange();
        int i4 = this.f4456o00oo0O;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4441o00oOOo0;
        this.f4462o00oo0oO = z;
        boolean z2 = this.f4460o00oo0o;
        if (!z2 && !z) {
            if (this.f4469o0O0o != 0) {
                o00ooO0o(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f4452o00oOooo = (int) ((((f / 2.0f) + i2) * f) / computeVerticalScrollRange);
            this.f4450o00oOoo0 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f4462o00oo0oO) {
            float f2 = i4;
            this.f4458o00oo0OO = (int) ((((f2 / 2.0f) + i) * f2) / computeHorizontalScrollRange);
            this.f4454o00oo0 = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f4469o0O0o;
        if (i5 == 0 || i5 == 1) {
            o00ooO0o(1);
        }
    }

    public void o00ooOO0() {
        int i = this.f4467o00ooO0o;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f4466o00ooO0O.cancel();
        }
        this.f4467o00ooO0o = 1;
        ValueAnimator valueAnimator = this.f4466o00ooO0O;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4466o00ooO0O.setDuration(500L);
        this.f4466o00ooO0O.setStartDelay(0L);
        this.f4466o00ooO0O.start();
    }

    public final void o00ooOOo(float f) {
        int[] o00oo02 = o00oo0();
        float max = Math.max(o00oo02[0], Math.min(o00oo02[1], f));
        if (Math.abs(this.f4452o00oOooo - max) < 2.0f) {
            return;
        }
        int o00ooO0O2 = o00ooO0O(this.f4455o00oo00O, max, o00oo02, this.f4461o00oo0o0.computeVerticalScrollRange(), this.f4461o00oo0o0.computeVerticalScrollOffset(), this.f4459o00oo0Oo);
        if (o00ooO0O2 != 0) {
            this.f4461o00oo0o0.scrollBy(0, o00ooO0O2);
        }
        this.f4455o00oo00O = max;
    }

    @o0o0000
    public boolean o0O0o(float f, float f2) {
        if (!o00oo0o() ? f >= this.f4456o00oo0O - this.f4444o00oOo0O : f <= this.f4444o00oOo0O) {
            int i = this.f4452o00oOooo;
            int i2 = this.f4450o00oOoo0;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        if (this.f4456o00oo0O != this.f4461o00oo0o0.getWidth() || this.f4459o00oo0Oo != this.f4461o00oo0o0.getHeight()) {
            this.f4456o00oo0O = this.f4461o00oo0o0.getWidth();
            this.f4459o00oo0Oo = this.f4461o00oo0o0.getHeight();
            o00ooO0o(0);
        } else if (this.f4467o00ooO0o != 0) {
            if (this.f4460o00oo0o) {
                o00oOoOo(canvas);
            }
            if (this.f4462o00oo0oO) {
                o00oOoOO(canvas);
            }
        }
    }
}
