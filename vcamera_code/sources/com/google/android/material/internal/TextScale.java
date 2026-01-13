package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.o0O0000O;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Oo0o.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class TextScale extends o0O0000O {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@oo0oO0 o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        if (view instanceof TextView) {
            o0ooo00o.f11944o00oOOo0.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0OoO00O o0ooo00o, @o0OO00OO o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null || o0ooo00o2 == null || !(o0ooo00o.f11945o00oOOoO instanceof TextView)) {
            return null;
        }
        View view = o0ooo00o2.f11945o00oOOoO;
        if (view instanceof TextView) {
            final TextView textView = (TextView) view;
            Map<String, Object> map = o0ooo00o.f11944o00oOOo0;
            Map<String, Object> map2 = o0ooo00o2.f11944o00oOOo0;
            float floatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
            float floatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@oo0oO0 ValueAnimator valueAnimator) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    textView.setScaleX(floatValue3);
                    textView.setScaleY(floatValue3);
                }
            });
            return ofFloat;
        }
        return null;
    }
}
