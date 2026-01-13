package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f905o00oo0o0 = 16;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f906o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f907o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f908o00oo0Oo;

    public ButtonBarLayout(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f908o00oo0Oo = -1;
        int[] iArr = R.styleable.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        o0O000oo.o0O0o00O.o0O0oOo0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f907o00oo0O0 = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f907o00oo0O0);
        }
    }

    private void setStacked(boolean z) {
        if (this.f906o00oo0O != z) {
            if (!z || this.f907o00oo0O0) {
                this.f906o00oo0O = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int o00oOOo0(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean o00oOOoO() {
        return this.f906o00oo0O;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f907o00oo0O0) {
            if (size > this.f908o00oo0Oo && o00oOOoO()) {
                setStacked(false);
            }
            this.f908o00oo0Oo = size;
        }
        if (o00oOOoO() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f907o00oo0O0 && !o00oOOoO()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int o00oOOo02 = o00oOOo0(0);
        if (o00oOOo02 >= 0) {
            View childAt = getChildAt(o00oOOo02);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (o00oOOoO()) {
                int o00oOOo03 = o00oOOo0(o00oOOo02 + 1);
                i4 = o00oOOo03 >= 0 ? getChildAt(o00oOOo03).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        if (o0O000oo.o0O0o00O.o0O000o(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f907o00oo0O0 != z) {
            this.f907o00oo0O0 = z;
            if (!z && o00oOOoO()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
