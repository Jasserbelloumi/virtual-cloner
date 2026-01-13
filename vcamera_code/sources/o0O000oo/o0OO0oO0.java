package o0O000oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class o0OO0oO0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10701o00oOo0O = 2113929216;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final WeakReference<View> f10702o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Runnable f10703o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Runnable f10704o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f10705o00oOooO = -1;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OO0oO f10706o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f10707o00oOOoO;

        public o00oOOo0(o0OO0oO o0oo0oo, View view) {
            this.f10706o00oOOo0 = o0oo0oo;
            this.f10707o00oOOoO = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10706o00oOOo0.o00oOOo0(this.f10707o00oOOoO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10706o00oOOo0.o00oOOoO(this.f10707o00oOOoO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10706o00oOOo0.o00oOo00(this.f10707o00oOOoO);
        }
    }

    @o00oOooO.o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOOo0(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOOoO(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOo00(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @o00oOooO.o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static Interpolator o00oOOo0(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @o00oOooO.o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOOo0(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOOo0(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOOoO(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOo00(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @o00oOooO.o0O0O0Oo
        public static ViewPropertyAnimator o00oOooO(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O implements o0OO0oO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0OO0oO0 f10709o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f10710o00oOOoO;

        public o00oo00O(o0OO0oO0 o0oo0oo0) {
            this.f10709o00oOOo0 = o0oo0oo0;
        }

        @Override // o0O000oo.o0OO0oO
        public void o00oOOo0(@o00oOooO.oo0oO0 View view) {
            Object tag = view.getTag(o0OO0oO0.f10701o00oOo0O);
            o0OO0oO o0oo0oo = tag instanceof o0OO0oO ? (o0OO0oO) tag : null;
            if (o0oo0oo != null) {
                o0oo0oo.o00oOOo0(view);
            }
        }

        @Override // o0O000oo.o0OO0oO
        @SuppressLint({"WrongConstant"})
        public void o00oOOoO(@o00oOooO.oo0oO0 View view) {
            int i = this.f10709o00oOOo0.f10705o00oOooO;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f10709o00oOOo0.f10705o00oOooO = -1;
            }
            o0OO0oO0 o0oo0oo0 = this.f10709o00oOOo0;
            Runnable runnable = o0oo0oo0.f10704o00oOo00;
            if (runnable != null) {
                o0oo0oo0.f10704o00oOo00 = null;
                runnable.run();
            }
            Object tag = view.getTag(o0OO0oO0.f10701o00oOo0O);
            o0OO0oO o0oo0oo = tag instanceof o0OO0oO ? (o0OO0oO) tag : null;
            if (o0oo0oo != null) {
                o0oo0oo.o00oOOoO(view);
            }
            this.f10710o00oOOoO = true;
        }

        @Override // o0O000oo.o0OO0oO
        public void o00oOo00(@o00oOooO.oo0oO0 View view) {
            this.f10710o00oOOoO = false;
            if (this.f10709o00oOOo0.f10705o00oOooO > -1) {
                view.setLayerType(2, null);
            }
            o0OO0oO0 o0oo0oo0 = this.f10709o00oOOo0;
            Runnable runnable = o0oo0oo0.f10703o00oOOoO;
            if (runnable != null) {
                o0oo0oo0.f10703o00oOOoO = null;
                runnable.run();
            }
            Object tag = view.getTag(o0OO0oO0.f10701o00oOo0O);
            o0OO0oO o0oo0oo = tag instanceof o0OO0oO ? (o0OO0oO) tag : null;
            if (o0oo0oo != null) {
                o0oo0oo.o00oOo00(view);
            }
        }
    }

    public o0OO0oO0(View view) {
        this.f10702o00oOOo0 = new WeakReference<>(view);
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOOoO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOo00(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public long o00oOo0O() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @o00oOooO.o0OO00OO
    public Interpolator o00oOo0o() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            return o00oOo00.o00oOOo0(view.animate());
        }
        return null;
    }

    public long o00oOoO0() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOoOO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOoOo(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOoo0(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public void o00oOooO() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oOooo(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo(long j) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo00O(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0O(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0O0(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0OO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0Oo(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0o(@o00oOooO.o0OO00OO Interpolator interpolator) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0o0(long j) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oo0oO(@o00oOooO.o0OO00OO o0OO0oO o0oo0oo) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o0O0o(view, o0oo0oo);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public void o00ooO0() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooO00(@o00oOooO.o0OO00OO final o0OOO00 o0ooo00) {
        final View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOo0O.o00oOOo0(view.animate(), o0ooo00 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o0O000oo.o0OO0o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o0OOO00.this.o00oOOo0(view);
                }
            } : null);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooO0O(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooO0o(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOoO.o00oOOo0(view.animate(), f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOO0(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOOo(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOoO.o00oOOoO(view.animate(), f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    @SuppressLint({"WrongConstant"})
    public o0OO0oO0 o00ooOo() {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOOoO.o00oOOoO(view.animate());
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOo0(@o00oOooO.oo0oO0 Runnable runnable) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOOoO.o00oOOo0(view.animate(), runnable);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOoO(@o00oOooO.oo0oO0 Runnable runnable) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOOoO.o00oOo00(view.animate(), runnable);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooOoo(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooo0(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooo00(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooo0O(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00ooo0o(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOoO.o00oOo00(view.animate(), f);
        }
        return this;
    }

    @o00oOooO.oo0oO0
    public o0OO0oO0 o00oooO(float f) {
        View view = this.f10702o00oOOo0.get();
        if (view != null) {
            o00oOoO.o00oOooO(view.animate(), f);
        }
        return this;
    }

    public final void o0O0o(View view, o0OO0oO o0oo0oo) {
        if (o0oo0oo != null) {
            view.animate().setListener(new o00oOOo0(o0oo0oo, view));
        } else {
            view.animate().setListener(null);
        }
    }
}
