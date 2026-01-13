package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0OO extends o0O00O0o {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final TimeInterpolator f5088o00oo0O = new DecelerateInterpolator();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final TimeInterpolator f5089o00oo0Oo = new AccelerateInterpolator();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5090o00oo0o0 = "android:explode:screenBounds";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int[] f5091o00oo0O0;

    public o00oo0OO() {
        this.f5091o00oo0O0 = new int[2];
        setPropagation(new o0O0Oo0o.o00oo0O());
    }

    public o00oo0OO(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5091o00oo0O0 = new int[2];
        setPropagation(new o0O0Oo0o.o00oo0O());
    }

    public static float o00oOOoO(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static float o00oOo00(View view, int i, int i2) {
        return o00oOOoO(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // androidx.transition.o0O00O0o, androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        super.captureEndValues(o0ooo00o);
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O00O0o, androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        super.captureStartValues(o0ooo00o);
        captureValues(o0ooo00o);
    }

    public final void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        view.getLocationOnScreen(this.f5091o00oo0O0);
        int[] iArr = this.f5091o00oo0O0;
        int i = iArr[0];
        int i2 = iArr[1];
        o0ooo00o.f11944o00oOOo0.put(f5090o00oo0o0, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public final void o00oOooO(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.f5091o00oo0O0);
        int[] iArr2 = this.f5091o00oo0O0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i2;
        } else {
            centerX = epicenter.centerX();
            centerY = epicenter.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float o00oOOoO2 = o00oOOoO(centerX2, centerY2);
        float o00oOo002 = o00oOo00(view, centerX - i, centerY - i2);
        iArr[0] = Math.round((centerX2 / o00oOOoO2) * o00oOo002);
        iArr[1] = Math.round(o00oOo002 * (centerY2 / o00oOOoO2));
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onAppear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o2 == null) {
            return null;
        }
        Rect rect = (Rect) o0ooo00o2.f11944o00oOOo0.get(f5090o00oo0o0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        o00oOooO(viewGroup, rect, this.f5091o00oo0O0);
        int[] iArr = this.f5091o00oo0O0;
        return o0O00.o00oOOo0(view, o0ooo00o2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f5088o00oo0O, this);
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onDisappear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        float f;
        float f2;
        if (o0ooo00o == null) {
            return null;
        }
        Rect rect = (Rect) o0ooo00o.f11944o00oOOo0.get(f5090o00oo0o0);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o0ooo00o.f11945o00oOOoO.getTag(R.id.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        o00oOooO(viewGroup, rect, this.f5091o00oo0O0);
        int[] iArr2 = this.f5091o00oo0O0;
        return o0O00.o00oOOo0(view, o0ooo00o, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f5089o00oo0Oo, this);
    }
}
