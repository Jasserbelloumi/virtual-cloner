package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O0O0Oo;
/* loaded from: classes.dex */
public class o00oOo0O extends o0O0000O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f5005o00oo0O = "android:clipBounds:bounds";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5006o00oo0O0 = "android:clipBounds:clip";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String[] f5007o00oo0Oo = {f5006o00oo0O0};

    /* loaded from: classes.dex */
    public class o00oOOo0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f5008o00oOOo0;

        public o00oOOo0(View view) {
            this.f5008o00oOOo0 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0O0o00O.o0O(this.f5008o00oOOo0, null);
        }
    }

    public o00oOo0O() {
    }

    public o00oOo0O(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    public final void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect o00oooOo2 = o0O0o00O.o00oooOo(view);
        o0ooo00o.f11944o00oOOo0.put(f5006o00oo0O0, o00oooOo2);
        if (o00oooOo2 == null) {
            o0ooo00o.f11944o00oOOo0.put(f5005o00oo0O, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        ObjectAnimator objectAnimator = null;
        if (o0ooo00o != null && o0ooo00o2 != null && o0ooo00o.f11944o00oOOo0.containsKey(f5006o00oo0O0) && o0ooo00o2.f11944o00oOOo0.containsKey(f5006o00oo0O0)) {
            Rect rect = (Rect) o0ooo00o.f11944o00oOOo0.get(f5006o00oo0O0);
            Rect rect2 = (Rect) o0ooo00o2.f11944o00oOOo0.get(f5006o00oo0O0);
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) o0ooo00o.f11944o00oOOo0.get(f5005o00oo0O);
            } else if (rect2 == null) {
                rect2 = (Rect) o0ooo00o2.f11944o00oOOo0.get(f5005o00oo0O);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            o0O0o00O.o0O(o0ooo00o2.f11945o00oOOoO, rect);
            objectAnimator = ObjectAnimator.ofObject(o0ooo00o2.f11945o00oOOoO, (Property<View, V>) o0O0O0Oo.f11934o00oOooO, (TypeEvaluator) new o0O0Oo0o.o0O000o0(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimator.addListener(new o00oOOo0(o0ooo00o2.f11945o00oOOoO));
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public String[] getTransitionProperties() {
        return f5007o00oo0Oo;
    }
}
