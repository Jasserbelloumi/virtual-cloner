package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import o00oOooO.o0O000Oo;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    @o0OO0
    public int indicatorInset;
    @o0OO0
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, @o0O000Oo int i) {
        this(context, attributeSet, i, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.indicatorSize = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = obtainStyledAttributes.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        obtainStyledAttributes.recycle();
        validateSpec();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        if (this.indicatorSize >= this.trackThickness * 2) {
            return;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("The indicatorSize (");
        o00oOOo02.append(this.indicatorSize);
        o00oOOo02.append(" px) cannot be less than twice of the trackThickness (");
        throw new IllegalArgumentException(o00oOo00.o00oOOo0(o00oOOo02, this.trackThickness, " px)."));
    }
}
