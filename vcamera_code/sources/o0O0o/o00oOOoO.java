package o0O0o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o00oOOoO extends androidx.constraintlayout.widget.o00oOOoO {

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f12284o00oooo0 = "Layer";

    /* renamed from: o00ooO  reason: collision with root package name */
    public ConstraintLayout f12285o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public float f12286o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public float f12287o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f12288o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f12289o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f12290o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f12291o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f12292o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f12293o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f12294o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public float f12295o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public boolean f12296o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public float f12297o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public View[] f12298o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public float f12299o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public float f12300o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public boolean f12301o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f12302o00oooOo;

    public o00oOOoO(Context context) {
        super(context);
        this.f12286o00ooO0 = Float.NaN;
        this.f12287o00ooO0O = Float.NaN;
        this.f12288o00ooO0o = Float.NaN;
        this.f12290o00ooOO0 = 1.0f;
        this.f12289o00ooOO = 1.0f;
        this.f12291o00ooOOo = Float.NaN;
        this.f12293o00ooOo0 = Float.NaN;
        this.f12292o00ooOo = Float.NaN;
        this.f12294o00ooOoO = Float.NaN;
        this.f12295o00ooOoo = Float.NaN;
        this.f12297o00ooo00 = Float.NaN;
        this.f12296o00ooo0 = true;
        this.f12298o00ooo0O = null;
        this.f12299o00ooo0o = 0.0f;
        this.f12300o00oooO = 0.0f;
    }

    public o00oOOoO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12286o00ooO0 = Float.NaN;
        this.f12287o00ooO0O = Float.NaN;
        this.f12288o00ooO0o = Float.NaN;
        this.f12290o00ooOO0 = 1.0f;
        this.f12289o00ooOO = 1.0f;
        this.f12291o00ooOOo = Float.NaN;
        this.f12293o00ooOo0 = Float.NaN;
        this.f12292o00ooOo = Float.NaN;
        this.f12294o00ooOoO = Float.NaN;
        this.f12295o00ooOoo = Float.NaN;
        this.f12297o00ooo00 = Float.NaN;
        this.f12296o00ooo0 = true;
        this.f12298o00ooo0O = null;
        this.f12299o00ooo0o = 0.0f;
        this.f12300o00oooO = 0.0f;
    }

    public o00oOOoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12286o00ooO0 = Float.NaN;
        this.f12287o00ooO0O = Float.NaN;
        this.f12288o00ooO0o = Float.NaN;
        this.f12290o00ooOO0 = 1.0f;
        this.f12289o00ooOO = 1.0f;
        this.f12291o00ooOOo = Float.NaN;
        this.f12293o00ooOo0 = Float.NaN;
        this.f12292o00ooOo = Float.NaN;
        this.f12294o00ooOoO = Float.NaN;
        this.f12295o00ooOoo = Float.NaN;
        this.f12297o00ooo00 = Float.NaN;
        this.f12296o00ooo0 = true;
        this.f12298o00ooo0O = null;
        this.f12299o00ooo0o = 0.0f;
        this.f12300o00oooO = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        this.f1934o00oo0o = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f12301o00oooOO = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f12302o00oooOo = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0o(ConstraintLayout constraintLayout) {
        o00ooO0o();
        this.f12291o00ooOOo = Float.NaN;
        this.f12293o00ooOo0 = Float.NaN;
        o00oOoO o00oOOoO2 = ((ConstraintLayout.o00oOOoO) getLayoutParams()).o00oOOoO();
        o00oOOoO2.o0O0ooOO(0);
        o00oOOoO2.o0O0o00(0);
        o00ooO0O();
        layout(((int) this.f12295o00ooOoo) - getPaddingLeft(), ((int) this.f12297o00ooo00) - getPaddingTop(), getPaddingRight() + ((int) this.f12292o00ooOo), getPaddingBottom() + ((int) this.f12294o00ooOoO));
        o00ooO();
    }

    public final void o00ooO() {
        if (this.f12285o00ooO == null) {
            return;
        }
        if (this.f12298o00ooo0O == null) {
            o00ooO0o();
        }
        o00ooO0O();
        double radians = Float.isNaN(this.f12288o00ooO0o) ? 0.0d : Math.toRadians(this.f12288o00ooO0o);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.f12290o00ooOO0;
        float f2 = f * cos;
        float f3 = this.f12289o00ooOO;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.f1931o00oo0O; i++) {
            View view = this.f12298o00ooo0O[i];
            int left = view.getLeft();
            int top = view.getTop();
            float right = ((view.getRight() + left) / 2) - this.f12291o00ooOOo;
            float bottom = ((view.getBottom() + top) / 2) - this.f12293o00ooOo0;
            view.setTranslationX((((f4 * bottom) + (f2 * right)) - right) + this.f12299o00ooo0o);
            view.setTranslationY((((f6 * bottom) + (right * f5)) - bottom) + this.f12300o00oooO);
            view.setScaleY(this.f12289o00ooOO);
            view.setScaleX(this.f12290o00ooOO0);
            if (!Float.isNaN(this.f12288o00ooO0o)) {
                view.setRotation(this.f12288o00ooO0o);
            }
        }
    }

    public void o00ooO0O() {
        if (this.f12285o00ooO == null) {
            return;
        }
        if (this.f12296o00ooo0 || Float.isNaN(this.f12291o00ooOOo) || Float.isNaN(this.f12293o00ooOo0)) {
            if (!Float.isNaN(this.f12286o00ooO0) && !Float.isNaN(this.f12287o00ooO0O)) {
                this.f12293o00ooOo0 = this.f12287o00ooO0O;
                this.f12291o00ooOOo = this.f12286o00ooO0;
                return;
            }
            View[] o00oo02 = o00oo0(this.f12285o00ooO);
            int left = o00oo02[0].getLeft();
            int top = o00oo02[0].getTop();
            int right = o00oo02[0].getRight();
            int bottom = o00oo02[0].getBottom();
            for (int i = 0; i < this.f1931o00oo0O; i++) {
                View view = o00oo02[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f12292o00ooOo = right;
            this.f12294o00ooOoO = bottom;
            this.f12295o00ooOoo = left;
            this.f12297o00ooo00 = top;
            this.f12291o00ooOOo = Float.isNaN(this.f12286o00ooO0) ? (left + right) / 2 : this.f12286o00ooO0;
            this.f12293o00ooOo0 = Float.isNaN(this.f12287o00ooO0O) ? (top + bottom) / 2 : this.f12287o00ooO0O;
        }
    }

    public final void o00ooO0o() {
        int i;
        if (this.f12285o00ooO == null || (i = this.f1931o00oo0O) == 0) {
            return;
        }
        View[] viewArr = this.f12298o00ooo0O;
        if (viewArr == null || viewArr.length != i) {
            this.f12298o00ooo0O = new View[i];
        }
        for (int i2 = 0; i2 < this.f1931o00oo0O; i2++) {
            this.f12298o00ooo0O[i2] = this.f12285o00ooO.getViewById(this.f1932o00oo0O0[i2]);
        }
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o0O0o(ConstraintLayout constraintLayout) {
        this.f12285o00ooO = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f && Float.isNaN(this.f12288o00ooO0o)) {
            return;
        }
        this.f12288o00ooO0o = rotation;
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12285o00ooO = (ConstraintLayout) getParent();
        if (this.f12301o00oooOO || this.f12302o00oooOo) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f1931o00oo0O; i++) {
                View viewById = this.f12285o00ooO.getViewById(this.f1932o00oo0O0[i]);
                if (viewById != null) {
                    if (this.f12301o00oooOO) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f12302o00oooOo && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        o00oOoOO();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f12286o00ooO0 = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f12287o00ooO0O = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f12288o00ooO0o = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f12290o00ooOO0 = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f12289o00ooOO = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f12299o00ooo0o = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f12300o00oooO = f;
        o00ooO();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        o00oOoOO();
    }
}
