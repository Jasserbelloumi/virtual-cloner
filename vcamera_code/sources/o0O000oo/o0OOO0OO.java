package o0O000oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.R;
import com.google.common.collect.LinkedHashMultimap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO00o;
import o0O000oo.o0OOo000;
/* loaded from: classes.dex */
public final class o0OOO0OO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f10714o00oOOoO = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f10715o00oOo00 = "WindowInsetsAnimCompat";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOoO f10716o00oOOo0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final oOO00o f10717o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final oOO00o f10718o00oOOoO;

        @o00oOooO.o0OOooO0(30)
        public o00oOOo0(@o00oOooO.oo0oO0 WindowInsetsAnimation.Bounds bounds) {
            this.f10717o00oOOo0 = o00oOo0O.o00oOoo0(bounds);
            this.f10718o00oOOoO = o00oOo0O.o00oOoOo(bounds);
        }

        public o00oOOo0(@o00oOooO.oo0oO0 oOO00o ooo00o, @o00oOooO.oo0oO0 oOO00o ooo00o2) {
            this.f10717o00oOOo0 = ooo00o;
            this.f10718o00oOOoO = ooo00o2;
        }

        @o00oOooO.o0OOooO0(30)
        @o00oOooO.oo0oO0
        public static o00oOOo0 o00oOo0O(@o00oOooO.oo0oO0 WindowInsetsAnimation.Bounds bounds) {
            return new o00oOOo0(bounds);
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOOo0() {
            return this.f10717o00oOOo0;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOOoO() {
            return this.f10718o00oOOoO;
        }

        @o00oOooO.oo0oO0
        public o00oOOo0 o00oOo00(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            return new o00oOOo0(o0OOo000.o00ooO0O(this.f10717o00oOOo0, ooo00o.f9791o00oOOo0, ooo00o.f9792o00oOOoO, ooo00o.f9793o00oOo00, ooo00o.f9794o00oOooO), o0OOo000.o00ooO0O(this.f10718o00oOOoO, ooo00o.f9791o00oOOo0, ooo00o.f9792o00oOOoO, ooo00o.f9793o00oOo00, ooo00o.f9794o00oOooO));
        }

        @o00oOooO.o0OOooO0(30)
        @o00oOooO.oo0oO0
        public WindowInsetsAnimation.Bounds o00oOooO() {
            return o00oOo0O.o00oOoOO(this);
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Bounds{lower=");
            o00oOOo02.append(this.f10717o00oOOo0);
            o00oOOo02.append(" upper=");
            o00oOOo02.append(this.f10718o00oOOoO);
            o00oOOo02.append("}");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10719o00oOo00 = 0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10720o00oOooO = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public WindowInsets f10721o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f10722o00oOOoO;

        @Retention(RetentionPolicy.SOURCE)
        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        public o00oOOoO(int i) {
            this.f10722o00oOOoO = i;
        }

        public final int o00oOOo0() {
            return this.f10722o00oOOoO;
        }

        public void o00oOOoO(@o00oOooO.oo0oO0 o0OOO0OO o0ooo0oo) {
        }

        public void o00oOo00(@o00oOooO.oo0oO0 o0OOO0OO o0ooo0oo) {
        }

        @o00oOooO.oo0oO0
        public o00oOOo0 o00oOo0O(@o00oOooO.oo0oO0 o0OOO0OO o0ooo0oo, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
            return o00oooo02;
        }

        @o00oOooO.oo0oO0
        public abstract o0OOo000 o00oOooO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 List<o0OOO0OO> list);
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOoO {

        @o00oOooO.o0OOooO0(21)
        /* loaded from: classes.dex */
        public static class o00oOOo0 implements View.OnApplyWindowInsetsListener {

            /* renamed from: o00oOo00  reason: collision with root package name */
            public static final int f10723o00oOo00 = 160;

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final o00oOOoO f10724o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public o0OOo000 f10725o00oOOoO;

            /* renamed from: o0O000oo.o0OOO0OO$o00oOo00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0134o00oOOo0 implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public final /* synthetic */ o0OOO0OO f10726o00oOOo0;

                /* renamed from: o00oOOoO  reason: collision with root package name */
                public final /* synthetic */ o0OOo000 f10727o00oOOoO;

                /* renamed from: o00oOo00  reason: collision with root package name */
                public final /* synthetic */ o0OOo000 f10728o00oOo00;

                /* renamed from: o00oOo0O  reason: collision with root package name */
                public final /* synthetic */ View f10729o00oOo0O;

                /* renamed from: o00oOooO  reason: collision with root package name */
                public final /* synthetic */ int f10731o00oOooO;

                public C0134o00oOOo0(o0OOO0OO o0ooo0oo, o0OOo000 o0ooo000, o0OOo000 o0ooo0002, int i, View view) {
                    this.f10726o00oOOo0 = o0ooo0oo;
                    this.f10727o00oOOoO = o0ooo000;
                    this.f10728o00oOo00 = o0ooo0002;
                    this.f10731o00oOooO = i;
                    this.f10729o00oOo0O = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f10726o00oOOo0.o00oOoOO(valueAnimator.getAnimatedFraction());
                    o00oOo00.o00oo0(this.f10729o00oOo0O, o00oOo00.o00oo0Oo(this.f10727o00oOOoO, this.f10728o00oOo00, this.f10726o00oOOo0.o00oOooO(), this.f10731o00oOooO), Collections.singletonList(this.f10726o00oOOo0));
                }
            }

            /* loaded from: classes.dex */
            public class o00oOOoO extends AnimatorListenerAdapter {

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public final /* synthetic */ o0OOO0OO f10732o00oOOo0;

                /* renamed from: o00oOOoO  reason: collision with root package name */
                public final /* synthetic */ View f10733o00oOOoO;

                public o00oOOoO(o0OOO0OO o0ooo0oo, View view) {
                    this.f10732o00oOOo0 = o0ooo0oo;
                    this.f10733o00oOOoO = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f10732o00oOOo0.o00oOoOO(1.0f);
                    o00oOo00.o00oOooo(this.f10733o00oOOoO, this.f10732o00oOOo0);
                }
            }

            /* renamed from: o0O000oo.o0OOO0OO$o00oOo00$o00oOOo0$o00oOo00  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0135o00oOo00 implements Runnable {

                /* renamed from: o00oo0O  reason: collision with root package name */
                public final /* synthetic */ o0OOO0OO f10735o00oo0O;

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ View f10736o00oo0O0;

                /* renamed from: o00oo0Oo  reason: collision with root package name */
                public final /* synthetic */ o00oOOo0 f10737o00oo0Oo;

                /* renamed from: o00oo0o0  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f10739o00oo0o0;

                public RunnableC0135o00oOo00(View view, o0OOO0OO o0ooo0oo, o00oOOo0 o00oooo02, ValueAnimator valueAnimator) {
                    this.f10736o00oo0O0 = view;
                    this.f10735o00oo0O = o0ooo0oo;
                    this.f10737o00oo0Oo = o00oooo02;
                    this.f10739o00oo0o0 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    o00oOo00.o00oo0OO(this.f10736o00oo0O0, this.f10735o00oo0O, this.f10737o00oo0Oo);
                    this.f10739o00oo0o0.start();
                }
            }

            public o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00oOOoO o00ooooo2) {
                this.f10724o00oOOo0 = o00ooooo2;
                o0OOo000 o0O00Oo2 = o0O0o00O.o0O00Oo(view);
                this.f10725o00oOOoO = o0O00Oo2 != null ? new o0OOo000.o00oOOoO(o0O00Oo2).o00oOOo0() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int o00oOoOO2;
                if (view.isLaidOut()) {
                    o0OOo000 o00ooo0O2 = o0OOo000.o00ooo0O(windowInsets, view);
                    if (this.f10725o00oOOoO == null) {
                        this.f10725o00oOOoO = o0O0o00O.o0O00Oo(view);
                    }
                    if (this.f10725o00oOOoO != null) {
                        o00oOOoO o00oo0O2 = o00oOo00.o00oo0O(view);
                        if ((o00oo0O2 == null || !Objects.equals(o00oo0O2.f10721o00oOOo0, windowInsets)) && (o00oOoOO2 = o00oOo00.o00oOoOO(o00ooo0O2, this.f10725o00oOOoO)) != 0) {
                            o0OOo000 o0ooo000 = this.f10725o00oOOoO;
                            o0OOO0OO o0ooo0oo = new o0OOO0OO(o00oOoOO2, new DecelerateInterpolator(), 160L);
                            o0ooo0oo.o00oOoOO(0.0f);
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o0ooo0oo.o00oOOoO());
                            o00oOOo0 o00oOoOo2 = o00oOo00.o00oOoOo(o00ooo0O2, o0ooo000, o00oOoOO2);
                            o00oOo00.o00oo00O(view, o0ooo0oo, windowInsets, false);
                            duration.addUpdateListener(new C0134o00oOOo0(o0ooo0oo, o00ooo0O2, o0ooo000, o00oOoOO2, view));
                            duration.addListener(new o00oOOoO(o0ooo0oo, view));
                            o0O0OOO0.o00oOOo0(view, new RunnableC0135o00oOo00(view, o0ooo0oo, o00oOoOo2, duration));
                        }
                        return o00oOo00.o00oo0O0(view, windowInsets);
                    }
                    this.f10725o00oOOoO = o00ooo0O2;
                } else {
                    this.f10725o00oOOoO = o0OOo000.o00ooo0O(windowInsets, view);
                }
                return o00oOo00.o00oo0O0(view, windowInsets);
            }
        }

        public o00oOo00(int i, @o00oOooO.o0OO00OO Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        public static int o00oOoOO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o0OOo000 o0ooo0002) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!o0ooo000.o00oOo0o(i2).equals(o0ooo0002.o00oOo0o(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @o00oOooO.oo0oO0
        public static o00oOOo0 o00oOoOo(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o0OOo000 o0ooo0002, int i) {
            oOO00o o00oOo0o2 = o0ooo000.o00oOo0o(i);
            oOO00o o00oOo0o3 = o0ooo0002.o00oOo0o(i);
            return new o00oOOo0(oOO00o.o00oOooO(Math.min(o00oOo0o2.f9791o00oOOo0, o00oOo0o3.f9791o00oOOo0), Math.min(o00oOo0o2.f9792o00oOOoO, o00oOo0o3.f9792o00oOOoO), Math.min(o00oOo0o2.f9793o00oOo00, o00oOo0o3.f9793o00oOo00), Math.min(o00oOo0o2.f9794o00oOooO, o00oOo0o3.f9794o00oOooO)), oOO00o.o00oOooO(Math.max(o00oOo0o2.f9791o00oOOo0, o00oOo0o3.f9791o00oOOo0), Math.max(o00oOo0o2.f9792o00oOOoO, o00oOo0o3.f9792o00oOOoO), Math.max(o00oOo0o2.f9793o00oOo00, o00oOo0o3.f9793o00oOo00), Math.max(o00oOo0o2.f9794o00oOooO, o00oOo0o3.f9794o00oOooO)));
        }

        @o00oOooO.oo0oO0
        public static View.OnApplyWindowInsetsListener o00oOoo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00oOOoO o00ooooo2) {
            return new o00oOOo0(view, o00ooooo2);
        }

        public static void o00oOooo(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOO0OO o0ooo0oo) {
            o00oOOoO o00oo0O2 = o00oo0O(view);
            if (o00oo0O2 != null) {
                o00oo0O2.o00oOOoO(o0ooo0oo);
                if (o00oo0O2.o00oOOo0() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    o00oOooo(viewGroup.getChildAt(i), o0ooo0oo);
                }
            }
        }

        public static void o00oo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 List<o0OOO0OO> list) {
            o00oOOoO o00oo0O2 = o00oo0O(view);
            if (o00oo0O2 != null) {
                o0ooo000 = o00oo0O2.o00oOooO(o0ooo000, list);
                if (o00oo0O2.o00oOOo0() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    o00oo0(viewGroup.getChildAt(i), o0ooo000, list);
                }
            }
        }

        public static void o00oo00O(View view, o0OOO0OO o0ooo0oo, WindowInsets windowInsets, boolean z) {
            o00oOOoO o00oo0O2 = o00oo0O(view);
            if (o00oo0O2 != null) {
                o00oo0O2.f10721o00oOOo0 = windowInsets;
                if (!z) {
                    o00oo0O2.o00oOo00(o0ooo0oo);
                    z = o00oo0O2.o00oOOo0() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    o00oo00O(viewGroup.getChildAt(i), o0ooo0oo, windowInsets, z);
                }
            }
        }

        @o00oOooO.o0OO00OO
        public static o00oOOoO o00oo0O(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof o00oOOo0) {
                return ((o00oOOo0) tag).f10724o00oOOo0;
            }
            return null;
        }

        @o00oOooO.oo0oO0
        public static WindowInsets o00oo0O0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static void o00oo0OO(View view, o0OOO0OO o0ooo0oo, o00oOOo0 o00oooo02) {
            o00oOOoO o00oo0O2 = o00oo0O(view);
            if (o00oo0O2 != null) {
                o00oo0O2.o00oOo0O(o0ooo0oo, o00oooo02);
                if (o00oo0O2.o00oOOo0() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    o00oo0OO(viewGroup.getChildAt(i), o0ooo0oo, o00oooo02);
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        public static o0OOo000 o00oo0Oo(o0OOo000 o0ooo000, o0OOo000 o0ooo0002, float f, int i) {
            oOO00o o00ooO0O2;
            o0OOo000.o00oOOoO o00ooooo2 = new o0OOo000.o00oOOoO(o0ooo000);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    o00ooO0O2 = o0ooo000.o00oOo0o(i2);
                } else {
                    oOO00o o00oOo0o2 = o0ooo000.o00oOo0o(i2);
                    oOO00o o00oOo0o3 = o0ooo0002.o00oOo0o(i2);
                    float f2 = 1.0f - f;
                    o00ooO0O2 = o0OOo000.o00ooO0O(o00oOo0o2, (int) (((o00oOo0o2.f9791o00oOOo0 - o00oOo0o3.f9791o00oOOo0) * f2) + 0.5d), (int) (((o00oOo0o2.f9792o00oOOoO - o00oOo0o3.f9792o00oOOoO) * f2) + 0.5d), (int) (((o00oOo0o2.f9793o00oOo00 - o00oOo0o3.f9793o00oOo00) * f2) + 0.5d), (int) (((o00oOo0o2.f9794o00oOooO - o00oOo0o3.f9794o00oOooO) * f2) + 0.5d));
                }
                o00ooooo2.o00oOo00(i2, o00ooO0O2);
            }
            return o00ooooo2.o00oOOo0();
        }

        public static void o00oo0o0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o00oOOoO o00ooooo2) {
            View.OnApplyWindowInsetsListener o00oooo02;
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (o00ooooo2 == null) {
                o00oooo02 = null;
                view.setTag(R.id.tag_window_insets_animation_callback, null);
                if (tag != null) {
                    return;
                }
            } else {
                o00oooo02 = new o00oOOo0(view, o00ooooo2);
                view.setTag(R.id.tag_window_insets_animation_callback, o00oooo02);
                if (tag != null) {
                    return;
                }
            }
            view.setOnApplyWindowInsetsListener(o00oooo02);
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final WindowInsetsAnimation f10740o00oOo0o;

        @o00oOooO.o0OOooO0(30)
        /* loaded from: classes.dex */
        public static class o00oOOo0 extends WindowInsetsAnimation.Callback {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final o00oOOoO f10741o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public List<o0OOO0OO> f10742o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public ArrayList<o0OOO0OO> f10743o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, o0OOO0OO> f10744o00oOooO;

            public o00oOOo0(@o00oOooO.oo0oO0 o00oOOoO o00ooooo2) {
                new Object(o00ooooo2.o00oOOo0()) { // from class: android.view.WindowInsetsAnimation.Callback
                    static {
                        throw new NoClassDefFoundError();
                    }
                };
                this.f10744o00oOooO = new HashMap<>();
                this.f10741o00oOOo0 = o00ooooo2;
            }

            @o00oOooO.oo0oO0
            public final o0OOO0OO o00oOOo0(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation) {
                o0OOO0OO o0ooo0oo = this.f10744o00oOooO.get(windowInsetsAnimation);
                if (o0ooo0oo == null) {
                    o0OOO0OO o0ooo0oo2 = new o0OOO0OO(windowInsetsAnimation);
                    this.f10744o00oOooO.put(windowInsetsAnimation, o0ooo0oo2);
                    return o0ooo0oo2;
                }
                return o0ooo0oo;
            }

            public void onEnd(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f10741o00oOOo0.o00oOOoO(o00oOOo0(windowInsetsAnimation));
                this.f10744o00oOooO.remove(windowInsetsAnimation);
            }

            public void onPrepare(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f10741o00oOOo0.o00oOo00(o00oOOo0(windowInsetsAnimation));
            }

            @o00oOooO.oo0oO0
            public WindowInsets onProgress(@o00oOooO.oo0oO0 WindowInsets windowInsets, @o00oOooO.oo0oO0 List<WindowInsetsAnimation> list) {
                ArrayList<o0OOO0OO> arrayList = this.f10743o00oOo00;
                if (arrayList == null) {
                    ArrayList<o0OOO0OO> arrayList2 = new ArrayList<>(list.size());
                    this.f10743o00oOo00 = arrayList2;
                    this.f10742o00oOOoO = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    o0OOO0OO o00oOOo02 = o00oOOo0(windowInsetsAnimation);
                    o00oOOo02.o00oOoOO(windowInsetsAnimation.getFraction());
                    this.f10743o00oOo00.add(o00oOOo02);
                }
                return this.f10741o00oOOo0.o00oOooO(o0OOo000.o00ooo0(windowInsets), this.f10742o00oOOoO).o00ooo00();
            }

            @o00oOooO.oo0oO0
            public WindowInsetsAnimation.Bounds onStart(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation, @o00oOooO.oo0oO0 WindowInsetsAnimation.Bounds bounds) {
                o00oOOo0 o00oOo0O2 = this.f10741o00oOOo0.o00oOo0O(o00oOOo0(windowInsetsAnimation), new o00oOOo0(bounds));
                o00oOo0O2.getClass();
                return o00oOo0O.o00oOoOO(o00oOo0O2);
            }
        }

        public o00oOo0O(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }

        public o00oOo0O(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f10740o00oOo0o = windowInsetsAnimation;
        }

        @o00oOooO.oo0oO0
        public static WindowInsetsAnimation.Bounds o00oOoOO(@o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
            return new WindowInsetsAnimation.Bounds(o00oooo02.f10717o00oOOo0.o00oOoO(), o00oooo02.f10718o00oOOoO.o00oOoO());
        }

        @o00oOooO.oo0oO0
        public static oOO00o o00oOoOo(@o00oOooO.oo0oO0 WindowInsetsAnimation.Bounds bounds) {
            return oOO00o.o00oOoO0(bounds.getUpperBound());
        }

        @o00oOooO.oo0oO0
        public static oOO00o o00oOoo0(@o00oOooO.oo0oO0 WindowInsetsAnimation.Bounds bounds) {
            return oOO00o.o00oOoO0(bounds.getLowerBound());
        }

        public static void o00oOooo(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o00oOOoO o00ooooo2) {
            view.setWindowInsetsAnimationCallback(o00ooooo2 != null ? new o00oOOo0(o00ooooo2) : null);
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        public long o00oOOoO() {
            return this.f10740o00oOo0o.getDurationMillis();
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        public float o00oOo00() {
            return this.f10740o00oOo0o.getFraction();
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        @o00oOooO.o0OO00OO
        public Interpolator o00oOo0O() {
            return this.f10740o00oOo0o.getInterpolator();
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        public int o00oOo0o() {
            return this.f10740o00oOo0o.getTypeMask();
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        public void o00oOoO(float f) {
            this.f10740o00oOo0o.setFraction(f);
        }

        @Override // o0O000oo.o0OOO0OO.o00oOoO
        public float o00oOooO() {
            return this.f10740o00oOo0o.getInterpolatedFraction();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f10745o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f10746o00oOOoO;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Interpolator f10747o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f10748o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final long f10749o00oOooO;

        public o00oOoO(int i, @o00oOooO.o0OO00OO Interpolator interpolator, long j) {
            this.f10745o00oOOo0 = i;
            this.f10747o00oOo00 = interpolator;
            this.f10749o00oOooO = j;
        }

        public float o00oOOo0() {
            return this.f10748o00oOo0O;
        }

        public long o00oOOoO() {
            return this.f10749o00oOooO;
        }

        public float o00oOo00() {
            return this.f10746o00oOOoO;
        }

        @o00oOooO.o0OO00OO
        public Interpolator o00oOo0O() {
            return this.f10747o00oOo00;
        }

        public int o00oOo0o() {
            return this.f10745o00oOOo0;
        }

        public void o00oOoO(float f) {
            this.f10746o00oOOoO = f;
        }

        public void o00oOoO0(float f) {
            this.f10748o00oOo0O = f;
        }

        public float o00oOooO() {
            Interpolator interpolator = this.f10747o00oOo00;
            return interpolator != null ? interpolator.getInterpolation(this.f10746o00oOOoO) : this.f10746o00oOOoO;
        }
    }

    public o0OOO0OO(int i, @o00oOooO.o0OO00OO Interpolator interpolator, long j) {
        this.f10716o00oOOo0 = Build.VERSION.SDK_INT >= 30 ? new o00oOo0O(i, interpolator, j) : new o00oOo00(i, interpolator, j);
    }

    @o00oOooO.o0OOooO0(30)
    public o0OOO0OO(@o00oOooO.oo0oO0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10716o00oOOo0 = new o00oOo0O(windowInsetsAnimation);
        }
    }

    public static void o00oOoO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o00oOOoO o00ooooo2) {
        if (Build.VERSION.SDK_INT >= 30) {
            o00oOo0O.o00oOooo(view, o00ooooo2);
        } else {
            o00oOo00.o00oo0o0(view, o00ooooo2);
        }
    }

    @o00oOooO.o0OOooO0(30)
    public static o0OOO0OO o00oOoOo(WindowInsetsAnimation windowInsetsAnimation) {
        return new o0OOO0OO(windowInsetsAnimation);
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float o00oOOo0() {
        return this.f10716o00oOOo0.o00oOOo0();
    }

    public long o00oOOoO() {
        return this.f10716o00oOOo0.o00oOOoO();
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float o00oOo00() {
        return this.f10716o00oOOo0.o00oOo00();
    }

    @o00oOooO.o0OO00OO
    public Interpolator o00oOo0O() {
        return this.f10716o00oOOo0.o00oOo0O();
    }

    public int o00oOo0o() {
        return this.f10716o00oOOo0.o00oOo0o();
    }

    public void o00oOoO0(@o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        this.f10716o00oOOo0.o00oOoO0(f);
    }

    public void o00oOoOO(@o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        this.f10716o00oOOo0.o00oOoO(f);
    }

    public float o00oOooO() {
        return this.f10716o00oOOo0.o00oOooO();
    }
}
