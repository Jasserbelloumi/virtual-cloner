package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class o00oo00O extends ViewGroup {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f2256o00oo0O = "Constraints";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOoO f2257o00oo0O0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends ConstraintLayout.o00oOOoO {

        /* renamed from: o0O0OO  reason: collision with root package name */
        public boolean f2258o0O0OO;

        /* renamed from: o0O0OO0O  reason: collision with root package name */
        public float f2259o0O0OO0O;

        /* renamed from: o0O0OOO  reason: collision with root package name */
        public float f2260o0O0OOO;

        /* renamed from: o0O0OOO0  reason: collision with root package name */
        public float f2261o0O0OOO0;

        /* renamed from: o0O0OOOo  reason: collision with root package name */
        public float f2262o0O0OOOo;

        /* renamed from: o0O0OOo  reason: collision with root package name */
        public float f2263o0O0OOo;

        /* renamed from: o0O0OOoO  reason: collision with root package name */
        public float f2264o0O0OOoO;

        /* renamed from: o0O0OOoo  reason: collision with root package name */
        public float f2265o0O0OOoo;

        /* renamed from: o0O0Oo  reason: collision with root package name */
        public float f2266o0O0Oo;

        /* renamed from: o0O0Oo0  reason: collision with root package name */
        public float f2267o0O0Oo0;

        /* renamed from: o0O0Oo0O  reason: collision with root package name */
        public float f2268o0O0Oo0O;

        /* renamed from: o0O0Oo0o  reason: collision with root package name */
        public float f2269o0O0Oo0o;

        /* renamed from: o0OooO0  reason: collision with root package name */
        public float f2270o0OooO0;

        public o00oOOo0(int i, int i2) {
            super(i, i2);
            this.f2259o0O0OO0O = 1.0f;
            this.f2258o0O0OO = false;
            this.f2261o0O0OOO0 = 0.0f;
            this.f2260o0O0OOO = 0.0f;
            this.f2262o0O0OOOo = 0.0f;
            this.f2263o0O0OOo = 0.0f;
            this.f2264o0O0OOoO = 1.0f;
            this.f2265o0O0OOoo = 1.0f;
            this.f2270o0OooO0 = 0.0f;
            this.f2267o0O0Oo0 = 0.0f;
            this.f2268o0O0Oo0O = 0.0f;
            this.f2269o0O0Oo0o = 0.0f;
            this.f2266o0O0Oo = 0.0f;
        }

        public o00oOOo0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2259o0O0OO0O = 1.0f;
            this.f2258o0O0OO = false;
            this.f2261o0O0OOO0 = 0.0f;
            this.f2260o0O0OOO = 0.0f;
            this.f2262o0O0OOOo = 0.0f;
            this.f2263o0O0OOo = 0.0f;
            this.f2264o0O0OOoO = 1.0f;
            this.f2265o0O0OOoo = 1.0f;
            this.f2270o0OooO0 = 0.0f;
            this.f2267o0O0Oo0 = 0.0f;
            this.f2268o0O0Oo0O = 0.0f;
            this.f2269o0O0Oo0o = 0.0f;
            this.f2266o0O0Oo = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintSet_android_alpha) {
                    this.f2259o0O0OO0O = obtainStyledAttributes.getFloat(index, this.f2259o0O0OO0O);
                } else if (index == R.styleable.ConstraintSet_android_elevation) {
                    this.f2261o0O0OOO0 = obtainStyledAttributes.getFloat(index, this.f2261o0O0OOO0);
                    this.f2258o0O0OO = true;
                } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                    this.f2262o0O0OOOo = obtainStyledAttributes.getFloat(index, this.f2262o0O0OOOo);
                } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                    this.f2263o0O0OOo = obtainStyledAttributes.getFloat(index, this.f2263o0O0OOo);
                } else if (index == R.styleable.ConstraintSet_android_rotation) {
                    this.f2260o0O0OOO = obtainStyledAttributes.getFloat(index, this.f2260o0O0OOO);
                } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                    this.f2264o0O0OOoO = obtainStyledAttributes.getFloat(index, this.f2264o0O0OOoO);
                } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                    this.f2265o0O0OOoo = obtainStyledAttributes.getFloat(index, this.f2265o0O0OOoo);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                    this.f2270o0OooO0 = obtainStyledAttributes.getFloat(index, this.f2270o0OooO0);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                    this.f2267o0O0Oo0 = obtainStyledAttributes.getFloat(index, this.f2267o0O0Oo0);
                } else if (index == R.styleable.ConstraintSet_android_translationX) {
                    this.f2268o0O0Oo0O = obtainStyledAttributes.getFloat(index, this.f2268o0O0Oo0O);
                } else if (index == R.styleable.ConstraintSet_android_translationY) {
                    this.f2269o0O0Oo0o = obtainStyledAttributes.getFloat(index, this.f2269o0O0Oo0o);
                } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                    this.f2266o0O0Oo = obtainStyledAttributes.getFloat(index, this.f2266o0O0Oo);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public o00oOOo0(o00oOOo0 o00oooo02) {
            super((ConstraintLayout.o00oOOoO) o00oooo02);
            this.f2259o0O0OO0O = 1.0f;
            this.f2258o0O0OO = false;
            this.f2261o0O0OOO0 = 0.0f;
            this.f2260o0O0OOO = 0.0f;
            this.f2262o0O0OOOo = 0.0f;
            this.f2263o0O0OOo = 0.0f;
            this.f2264o0O0OOoO = 1.0f;
            this.f2265o0O0OOoo = 1.0f;
            this.f2270o0OooO0 = 0.0f;
            this.f2267o0O0Oo0 = 0.0f;
            this.f2268o0O0Oo0O = 0.0f;
            this.f2269o0O0Oo0o = 0.0f;
            this.f2266o0O0Oo = 0.0f;
        }
    }

    public o00oo00O(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public o00oo00O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o00oOo00(attributeSet);
        super.setVisibility(8);
    }

    public o00oo00O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o00oOo00(attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.o00oOOoO(layoutParams);
    }

    public o00oOoO getConstraintSet() {
        if (this.f2257o00oo0O0 == null) {
            this.f2257o00oo0O0 = new o00oOoO();
        }
        this.f2257o00oo0O0.o00ooOO0(this);
        return this.f2257o00oo0O0;
    }

    @Override // android.view.ViewGroup
    /* renamed from: o00oOOo0 */
    public o00oOOo0 generateDefaultLayoutParams() {
        return new o00oOOo0(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o00oOOoO */
    public o00oOOo0 generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOOo0(getContext(), attributeSet);
    }

    public final void o00oOo00(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
