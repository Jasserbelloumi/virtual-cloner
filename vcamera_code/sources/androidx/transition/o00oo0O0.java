package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O0O0Oo;
/* loaded from: classes.dex */
public class o00oo0O0 extends o0O00O0o {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f5080o00oo0O = "Fade";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5081o00oo0O0 = "android:fade:transitionAlpha";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f5082o00oo0Oo = 1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f5083o00oo0o0 = 2;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f5084o00oOOo0;

        public o00oOOo0(View view) {
            this.f5084o00oOOo0 = view;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o0O0O0Oo.o00oOoO(this.f5084o00oOOo0, 1.0f);
            o0O0O0Oo.o00oOOo0(this.f5084o00oOOo0);
            o0o0000o.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final View f5086o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f5087o00oOOoO = false;

        public o00oOOoO(View view) {
            this.f5086o00oOOo0 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0O0O0Oo.o00oOoO(this.f5086o00oOOo0, 1.0f);
            if (this.f5087o00oOOoO) {
                this.f5086o00oOOo0.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (o0O0o00O.o0O0OOOo(this.f5086o00oOOo0) && this.f5086o00oOOo0.getLayerType() == 0) {
                this.f5087o00oOOoO = true;
                this.f5086o00oOOo0.setLayerType(2, null);
            }
        }
    }

    public o00oo0O0() {
    }

    public o00oo0O0(int i) {
        setMode(i);
    }

    @SuppressLint({"RestrictedApi"})
    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5117o00oOo0o);
        setMode(o0O0o00.o00oOoo0(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }

    public static float o00oOo00(o0O0Oo0o.o0OoO00O o0ooo00o, float f) {
        Float f2;
        return (o0ooo00o == null || (f2 = (Float) o0ooo00o.f11944o00oOOo0.get(f5081o00oo0O0)) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.o0O00O0o, androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        super.captureStartValues(o0ooo00o);
        o0ooo00o.f11944o00oOOo0.put(f5081o00oo0O0, Float.valueOf(o0O0O0Oo.o00oOo00(o0ooo00o.f11945o00oOOoO)));
    }

    public final Animator o00oOOoO(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        o0O0O0Oo.o00oOoO(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o0O0O0Oo.f11933o00oOo00, f2);
        ofFloat.addListener(new o00oOOoO(view));
        addListener(new o00oOOo0(view));
        return ofFloat;
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onAppear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        float o00oOo002 = o00oOo00(o0ooo00o, 0.0f);
        return o00oOOoO(view, o00oOo002 != 1.0f ? o00oOo002 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onDisappear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        o0O0O0Oo.o00oOo0O(view);
        return o00oOOoO(view, o00oOo00(o0ooo00o, 1.0f), 0.0f);
    }
}
