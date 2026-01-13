package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O0O0Oo;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o00oo0 extends o0O0000O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f5023o00oo = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f5026o00oo0oO = "android:changeTransform:parent";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f5029o00ooO00 = "android:changeTransform:intermediateMatrix";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f5033o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f5034o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Matrix f5035o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f5025o00oo0o0 = "android:changeTransform:matrix";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f5024o00oo0o = "android:changeTransform:transforms";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f5032o0O0o = "android:changeTransform:parentMatrix";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String[] f5028o00ooO0 = {f5025o00oo0o0, f5024o00oo0o, f5032o0O0o};

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final Property<o00oOoO, float[]> f5030o00ooO0O = new o00oOOo0(float[].class, "nonTranslations");

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final Property<o00oOoO, PointF> f5031o00ooO0o = new o00oOOoO(PointF.class, "translations");

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final boolean f5027o00ooO = true;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Property<o00oOoO, float[]> {
        public o00oOOo0(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public float[] get(o00oOoO o00oooo2) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(o00oOoO o00oooo2, float[] fArr) {
            o00oooo2.o00oOooO(fArr);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends Property<o00oOoO, PointF> {
        public o00oOOoO(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(o00oOoO o00oooo2) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(o00oOoO o00oooo2, PointF pointF) {
            o00oooo2.o00oOo00(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f5036o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Matrix f5037o00oOOoO = new Matrix();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ boolean f5038o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ View f5039o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f5040o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final /* synthetic */ o00oOoO f5042o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ Matrix f5043o00oOooO;

        public o00oOo00(boolean z, Matrix matrix, View view, o00oo00O o00oo00o, o00oOoO o00oooo2) {
            this.f5038o00oOo00 = z;
            this.f5043o00oOooO = matrix;
            this.f5039o00oOo0O = view;
            this.f5040o00oOo0o = o00oo00o;
            this.f5042o00oOoO0 = o00oooo2;
        }

        public final void o00oOOo0(Matrix matrix) {
            this.f5037o00oOOoO.set(matrix);
            this.f5039o00oOo0O.setTag(R.id.transition_transform, this.f5037o00oOOoO);
            this.f5040o00oOo0o.o00oOOo0(this.f5039o00oOo0O);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5036o00oOOo0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5036o00oOOo0) {
                if (this.f5038o00oOo00 && o00oo0.this.f5034o00oo0O0) {
                    o00oOOo0(this.f5043o00oOooO);
                } else {
                    this.f5039o00oOo0O.setTag(R.id.transition_transform, null);
                    this.f5039o00oOo0O.setTag(R.id.parent_matrix, null);
                }
            }
            o0O0O0Oo.o00oOo0o(this.f5039o00oOo0O, null);
            this.f5040o00oOo0o.o00oOOo0(this.f5039o00oOo0O);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            o00oOOo0(this.f5042o00oOoO0.o00oOOo0());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            o00oo0.o00oOoOo(this.f5039o00oOo0O);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public View f5044o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0O0Oo0o.o00oo f5045o00oOOoO;

        public o00oOo0O(View view, o0O0Oo0o.o00oo o00ooVar) {
            this.f5044o00oOOo0 = view;
            this.f5045o00oOOoO = o00ooVar;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o0o0000o.removeListener(this);
            o0O0Oo0o.o00ooO.o00oOOoO(this.f5044o00oOOo0);
            this.f5044o00oOOo0.setTag(R.id.transition_transform, null);
            this.f5044o00oOOo0.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
            this.f5045o00oOOoO.setVisibility(4);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
            this.f5045o00oOOoO.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Matrix f5046o00oOOo0 = new Matrix();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final View f5047o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final float[] f5048o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f5049o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f5050o00oOooO;

        public o00oOoO(View view, float[] fArr) {
            this.f5047o00oOOoO = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f5048o00oOo00 = fArr2;
            this.f5050o00oOooO = fArr2[2];
            this.f5049o00oOo0O = fArr2[5];
            o00oOOoO();
        }

        public Matrix o00oOOo0() {
            return this.f5046o00oOOo0;
        }

        public final void o00oOOoO() {
            float[] fArr = this.f5048o00oOo00;
            fArr[2] = this.f5050o00oOooO;
            fArr[5] = this.f5049o00oOo0O;
            this.f5046o00oOOo0.setValues(fArr);
            o0O0O0Oo.o00oOo0o(this.f5047o00oOOoO, this.f5046o00oOOo0);
        }

        public void o00oOo00(PointF pointF) {
            this.f5050o00oOooO = pointF.x;
            this.f5049o00oOo0O = pointF.y;
            o00oOOoO();
        }

        public void o00oOooO(float[] fArr) {
            System.arraycopy(fArr, 0, this.f5048o00oOo00, 0, fArr.length);
            o00oOOoO();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final float f5051o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final float f5052o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final float f5053o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final float f5054o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final float f5055o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final float f5056o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final float f5057o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final float f5058o00oOooO;

        public o00oo00O(View view) {
            this.f5051o00oOOo0 = view.getTranslationX();
            this.f5052o00oOOoO = view.getTranslationY();
            this.f5053o00oOo00 = o0O0o00O.o0O0O0Oo(view);
            this.f5058o00oOooO = view.getScaleX();
            this.f5054o00oOo0O = view.getScaleY();
            this.f5055o00oOo0o = view.getRotationX();
            this.f5057o00oOoO0 = view.getRotationY();
            this.f5056o00oOoO = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (obj instanceof o00oo00O) {
                o00oo00O o00oo00o = (o00oo00O) obj;
                return o00oo00o.f5051o00oOOo0 == this.f5051o00oOOo0 && o00oo00o.f5052o00oOOoO == this.f5052o00oOOoO && o00oo00o.f5053o00oOo00 == this.f5053o00oOo00 && o00oo00o.f5058o00oOooO == this.f5058o00oOooO && o00oo00o.f5054o00oOo0O == this.f5054o00oOo0O && o00oo00o.f5055o00oOo0o == this.f5055o00oOo0o && o00oo00o.f5057o00oOoO0 == this.f5057o00oOoO0 && o00oo00o.f5056o00oOoO == this.f5056o00oOoO;
            }
            return false;
        }

        public int hashCode() {
            float f = this.f5051o00oOOo0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f5052o00oOOoO;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f5053o00oOo00;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f5058o00oOooO;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f5054o00oOo0O;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f5055o00oOo0o;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f5057o00oOoO0;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f5056o00oOoO;
            return floatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }

        public void o00oOOo0(View view) {
            o00oo0.o00oo0(view, this.f5051o00oOOo0, this.f5052o00oOOoO, this.f5053o00oOo00, this.f5058o00oOooO, this.f5054o00oOo0O, this.f5055o00oOo0o, this.f5057o00oOoO0, this.f5056o00oOoO);
        }
    }

    public o00oo0() {
        this.f5034o00oo0O0 = true;
        this.f5033o00oo0O = true;
        this.f5035o00oo0Oo = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public o00oo0(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5034o00oo0O0 = true;
        this.f5033o00oo0O = true;
        this.f5035o00oo0Oo = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5119o00oOoO0);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f5034o00oo0O0 = o0O0o00.o00oOo0O(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f5033o00oo0O = o0O0o00.o00oOo0O(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public static void o00oOoOo(View view) {
        o00oo0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void o00oo0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        o0O0o00O.o0OOO0OO(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
        if (f5027o00ooO) {
            return;
        }
        ((ViewGroup) o0ooo00o.f11945o00oOOoO.getParent()).startViewTransition(o0ooo00o.f11945o00oOOoO);
    }

    public final void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        if (view.getVisibility() == 8) {
            return;
        }
        o0ooo00o.f11944o00oOOo0.put(f5026o00oo0oO, view.getParent());
        o0ooo00o.f11944o00oOOo0.put(f5024o00oo0o, new o00oo00O(view));
        Matrix matrix = view.getMatrix();
        o0ooo00o.f11944o00oOOo0.put(f5025o00oo0o0, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f5033o00oo0O) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            o0O0O0Oo.o00oOoOo(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            o0ooo00o.f11944o00oOOo0.put(f5032o0O0o, matrix2);
            o0ooo00o.f11944o00oOOo0.put(f5029o00ooO00, view.getTag(R.id.transition_transform));
            o0ooo00o.f11944o00oOOo0.put(f5023o00oo, view.getTag(R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null || o0ooo00o2 == null || !o0ooo00o.f11944o00oOOo0.containsKey(f5026o00oo0oO) || !o0ooo00o2.f11944o00oOOo0.containsKey(f5026o00oo0oO)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) o0ooo00o.f11944o00oOOo0.get(f5026o00oo0oO);
        boolean z = this.f5033o00oo0O && !o00oOoOO(viewGroup2, (ViewGroup) o0ooo00o2.f11944o00oOOo0.get(f5026o00oo0oO));
        Matrix matrix = (Matrix) o0ooo00o.f11944o00oOOo0.get(f5029o00ooO00);
        if (matrix != null) {
            o0ooo00o.f11944o00oOOo0.put(f5025o00oo0o0, matrix);
        }
        Matrix matrix2 = (Matrix) o0ooo00o.f11944o00oOOo0.get(f5023o00oo);
        if (matrix2 != null) {
            o0ooo00o.f11944o00oOOo0.put(f5032o0O0o, matrix2);
        }
        if (z) {
            o00oOoo0(o0ooo00o, o0ooo00o2);
        }
        ObjectAnimator o00oOo002 = o00oOo00(o0ooo00o, o0ooo00o2, z);
        if (z && o00oOo002 != null && this.f5034o00oo0O0) {
            o00oOOoO(viewGroup, o0ooo00o, o0ooo00o2);
        } else if (!f5027o00ooO) {
            viewGroup2.endViewTransition(o0ooo00o.f11945o00oOOoO);
        }
        return o00oOo002;
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public String[] getTransitionProperties() {
        return f5028o00ooO0;
    }

    public final void o00oOOoO(ViewGroup viewGroup, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        View view = o0ooo00o2.f11945o00oOOoO;
        Matrix matrix = new Matrix((Matrix) o0ooo00o2.f11944o00oOOo0.get(f5032o0O0o));
        o0O0O0Oo.o00oOoo0(viewGroup, matrix);
        o0O0Oo0o.o00oo o00oOOo02 = o0O0Oo0o.o00ooO.o00oOOo0(view, viewGroup, matrix);
        if (o00oOOo02 == null) {
            return;
        }
        o00oOOo02.o00oOOo0((ViewGroup) o0ooo00o.f11944o00oOOo0.get(f5026o00oo0oO), o0ooo00o.f11945o00oOOoO);
        o0O0000O o0o0000o = this;
        while (true) {
            o0O0000O o0o0000o2 = o0o0000o.mParent;
            if (o0o0000o2 == null) {
                break;
            }
            o0o0000o = o0o0000o2;
        }
        o0o0000o.addListener(new o00oOo0O(view, o00oOOo02));
        if (f5027o00ooO) {
            View view2 = o0ooo00o.f11945o00oOOoO;
            if (view2 != o0ooo00o2.f11945o00oOOoO) {
                o0O0O0Oo.o00oOoO(view2, 0.0f);
            }
            o0O0O0Oo.o00oOoO(view, 1.0f);
        }
    }

    public final ObjectAnimator o00oOo00(o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2, boolean z) {
        Matrix matrix = (Matrix) o0ooo00o.f11944o00oOOo0.get(f5025o00oo0o0);
        Matrix matrix2 = (Matrix) o0ooo00o2.f11944o00oOOo0.get(f5025o00oo0o0);
        if (matrix == null) {
            matrix = o0O0Oo0o.o0O0000O.f11914o00oOOo0;
        }
        if (matrix2 == null) {
            matrix2 = o0O0Oo0o.o0O0000O.f11914o00oOOo0;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        o00oo00O o00oo00o = (o00oo00O) o0ooo00o2.f11944o00oOOo0.get(f5024o00oo0o);
        View view = o0ooo00o2.f11945o00oOOoO;
        o00oOoOo(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        o00oOoO o00oooo2 = new o00oOoO(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(o00oooo2, PropertyValuesHolder.ofObject(f5030o00ooO0O, new o0O0Oo0o.o0O0o(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f5031o00ooO0o, (TypeConverter) null, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        o00oOo00 o00ooo002 = new o00oOo00(z, matrix3, view, o00oo00o, o00oooo2);
        ofPropertyValuesHolder.addListener(o00ooo002);
        ofPropertyValuesHolder.addPauseListener(o00ooo002);
        return ofPropertyValuesHolder;
    }

    public boolean o00oOo0o() {
        return this.f5034o00oo0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.f11945o00oOOoO) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o00oOoOO(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            o0O0Oo0o.o0OoO00O r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f11945o00oOOoO
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o00oo0.o00oOoOO(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    public final void o00oOoo0(o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        Matrix matrix = (Matrix) o0ooo00o2.f11944o00oOOo0.get(f5032o0O0o);
        o0ooo00o2.f11945o00oOOoO.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.f5035o00oo0Oo;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) o0ooo00o.f11944o00oOOo0.get(f5025o00oo0o0);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            o0ooo00o.f11944o00oOOo0.put(f5025o00oo0o0, matrix3);
        }
        matrix3.postConcat((Matrix) o0ooo00o.f11944o00oOOo0.get(f5032o0O0o));
        matrix3.postConcat(matrix2);
    }

    public boolean o00oOooO() {
        return this.f5033o00oo0O;
    }

    public void o00oOooo(boolean z) {
        this.f5033o00oo0O = z;
    }

    public void o00oo00O(boolean z) {
        this.f5034o00oo0O0 = z;
    }
}
