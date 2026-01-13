package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import o00ooO.o00ooO0;
/* loaded from: classes.dex */
public abstract class o00oo0O extends o00oOOoO {

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f2271o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f2272o00ooO0O;

    public o00oo0O(Context context) {
        super(context);
    }

    public o00oo0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o00oo0O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f2271o00ooO0 = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f2272o00ooO0O = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o00ooO0O(o00ooO0 o00ooo02, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2271o00ooO0 || this.f2272o00ooO0O) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f1931o00oo0O; i++) {
                View viewById = constraintLayout.getViewById(this.f1932o00oo0O0[i]);
                if (viewById != null) {
                    if (this.f2271o00ooO0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f2272o00ooO0O && elevation > 0.0f) {
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
    public void setVisibility(int i) {
        super.setVisibility(i);
        o00oOoOO();
    }
}
