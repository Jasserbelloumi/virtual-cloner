package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo00O extends o0O0000O {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5060o00oo0O0 = "android:changeScroll:x";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f5059o00oo0O = "android:changeScroll:y";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String[] f5061o00oo0Oo = {f5060o00oo0O0, f5059o00oo0O};

    public o00oo00O() {
    }

    public o00oo00O(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
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
        o0ooo00o.f11944o00oOOo0.put(f5060o00oo0O0, Integer.valueOf(o0ooo00o.f11945o00oOOoO.getScrollX()));
        o0ooo00o.f11944o00oOOo0.put(f5059o00oo0O, Integer.valueOf(o0ooo00o.f11945o00oOOoO.getScrollY()));
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (o0ooo00o == null || o0ooo00o2 == null) {
            return null;
        }
        View view = o0ooo00o2.f11945o00oOOoO;
        int intValue = ((Integer) o0ooo00o.f11944o00oOOo0.get(f5060o00oo0O0)).intValue();
        int intValue2 = ((Integer) o0ooo00o2.f11944o00oOOo0.get(f5060o00oo0O0)).intValue();
        int intValue3 = ((Integer) o0ooo00o.f11944o00oOOo0.get(f5059o00oo0O)).intValue();
        int intValue4 = ((Integer) o0ooo00o2.f11944o00oOOo0.get(f5059o00oo0O)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return o0O000o0.o00oOo00(objectAnimator, objectAnimator2);
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public String[] getTransitionProperties() {
        return f5061o00oo0Oo;
    }
}
