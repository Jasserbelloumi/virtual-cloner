package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O000oo.o0O0o00O;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o0 extends o0O00O0o {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f4945o00oo0o = "android:slide:screenPosition";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f4952o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo0 f4953o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final TimeInterpolator f4944o00oo0Oo = new DecelerateInterpolator();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final TimeInterpolator f4946o00oo0o0 = new AccelerateInterpolator();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final o00oo0 f4947o00oo0oO = new o00oOOo0();

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final o00oo0 f4951o0O0o = new o00oOOoO();

    /* renamed from: o00oo  reason: collision with root package name */
    public static final o00oo0 f4943o00oo = new o00oOo00();

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final o00oo0 f4949o00ooO00 = new o00oOo0O();

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final o00oo0 f4948o00ooO0 = new o00oOoO();

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final o00oo0 f4950o00ooO0O = new o00oo00O();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo0OO {
        public o00oOOo0() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOoO(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oo0OO {
        public o00oOOoO() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOoO(ViewGroup viewGroup, View view) {
            boolean z = o0O0o00O.o0O000O(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oo0O0 {
        public o00oOo00() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOo0(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oo0OO {
        public o00oOo0O() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOoO(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends o00oo0OO {
        public o00oOoO() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOoO(ViewGroup viewGroup, View view) {
            boolean z = o0O0o00O.o0O000O(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0 {
        float o00oOOo0(ViewGroup viewGroup, View view);

        float o00oOOoO(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o00oo0O0 {
        public o00oo00O() {
            super(null);
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOo0(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0O {
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0O0 implements o00oo0 {
        public o00oo0O0() {
        }

        public o00oo0O0(o00oOOo0 o00oooo02) {
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOoO(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0OO implements o00oo0 {
        public o00oo0OO() {
        }

        public o00oo0OO(o00oOOo0 o00oooo02) {
        }

        @Override // androidx.transition.o0.o00oo0
        public float o00oOOo0(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public o0() {
        this.f4953o00oo0O0 = f4950o00ooO0O;
        this.f4952o00oo0O = 80;
        o00oOo00(80);
    }

    public o0(int i) {
        this.f4953o00oo0O0 = f4950o00ooO0O;
        this.f4952o00oo0O = 80;
        o00oOo00(i);
    }

    @SuppressLint({"RestrictedApi"})
    public o0(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4953o00oo0O0 = f4950o00ooO0O;
        this.f4952o00oo0O = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5118o00oOoO);
        int o00oOoo02 = o0O0o00.o00oOoo0(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        o00oOo00(o00oOoo02);
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
        int[] iArr = new int[2];
        o0ooo00o.f11945o00oOOoO.getLocationOnScreen(iArr);
        o0ooo00o.f11944o00oOOo0.put(f4945o00oo0o, iArr);
    }

    public int o00oOOoO() {
        return this.f4952o00oo0O;
    }

    public void o00oOo00(int i) {
        o00oo0 o00oo0Var;
        if (i == 3) {
            o00oo0Var = f4947o00oo0oO;
        } else if (i == 5) {
            o00oo0Var = f4949o00ooO00;
        } else if (i == 48) {
            o00oo0Var = f4943o00oo;
        } else if (i == 80) {
            o00oo0Var = f4950o00ooO0O;
        } else if (i == 8388611) {
            o00oo0Var = f4951o0O0o;
        } else if (i != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            o00oo0Var = f4948o00ooO0;
        }
        this.f4953o00oo0O0 = o00oo0Var;
        this.f4952o00oo0O = i;
        o0O0Oo0o.o0O00 o0o00 = new o0O0Oo0o.o0O00();
        o0o00.f11909o00oOo0O = i;
        setPropagation(o0o00);
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onAppear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o2 == null) {
            return null;
        }
        int[] iArr = (int[]) o0ooo00o2.f11944o00oOOo0.get(f4945o00oo0o);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return o0O00.o00oOOo0(view, o0ooo00o2, iArr[0], iArr[1], this.f4953o00oo0O0.o00oOOoO(viewGroup, view), this.f4953o00oo0O0.o00oOOo0(viewGroup, view), translationX, translationY, f4944o00oo0Oo, this);
    }

    @Override // androidx.transition.o0O00O0o
    @o0OO00OO
    public Animator onDisappear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null) {
            return null;
        }
        int[] iArr = (int[]) o0ooo00o.f11944o00oOOo0.get(f4945o00oo0o);
        return o0O00.o00oOOo0(view, o0ooo00o, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f4953o00oo0O0.o00oOOoO(viewGroup, view), this.f4953o00oo0O0.o00oOOo0(viewGroup, view), f4946o00oo0o0, this);
    }
}
