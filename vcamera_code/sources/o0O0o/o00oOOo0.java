package o0O0o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oOoO;
import androidx.constraintlayout.widget.o00oo0O;
import o00ooO.o00oo0;
import o00ooO.o00ooO0;
/* loaded from: classes.dex */
public class o00oOOo0 extends o00oo0O {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f12267o00ooO = "Flow";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f12268o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f12269o00ooOO0 = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f12270o00ooOOo = 0;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f12271o00ooOo = 2;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f12272o00ooOo0 = 1;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f12273o00ooOoO = 0;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f12274o00ooOoo = 1;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f12275o00ooo0 = 0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f12276o00ooo00 = 2;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f12277o00ooo0O = 1;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f12278o00ooo0o = 2;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f12279o00oooO = 0;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f12280o00oooOO = 1;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f12281o00oooOo = 2;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f12282o00oooo0 = 3;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oo0 f12283o00ooO0o;

    public o00oOOo0(Context context) {
        super(context);
    }

    public o00oOOo0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o00oOOo0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0O0(o00oOoO.o00oOOo0 o00oooo02, o00ooO.o00oo0O o00oo0o2, ConstraintLayout.o00oOOoO o00ooooo2, SparseArray<o00ooO.o00oOoO> sparseArray) {
        super.o00oo0O0(o00oooo02, o00oo0o2, o00ooooo2, sparseArray);
        if (o00oo0o2 instanceof o00oo0) {
            o00oo0 o00oo0Var = (o00oo0) o00oo0o2;
            int i = o00ooooo2.f1837o00ooooO;
            if (i != -1) {
                o00oo0Var.o0OOo000(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.o00oo0O, androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        this.f12283o00ooO0o = new o00oo0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f12283o00ooO0o.o0OOo000(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.f12283o00ooO0o.o0OO0o0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.f12283o00ooO0o.o0OO0oO(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f12283o00ooO0o.o0OO0o0o(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f12283o00ooO0o.o0OO0o(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f12283o00ooO0o.o0OO0oOO(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f12283o00ooO0o.o0OO0oO0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f12283o00ooO0o.o0OO0o0O(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f12283o00ooO0o.o0OooOo(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f12283o00ooO0o.o0OOOoO(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f12283o00ooO0o.o0OOo0O0(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f12283o00ooO0o.o0OOOo00(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f12283o00ooO0o.o0OOOoo0(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f12283o00ooO0o.o0OOOo0O(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f12283o00ooO0o.o0OOOooO(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f12283o00ooO0o.o0OOOo(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f12283o00ooO0o.o0OOOOoo(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f12283o00ooO0o.o0OOOoOo(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f12283o00ooO0o.o0OOOo0(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f12283o00ooO0o.o0OOOoo(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f12283o00ooO0o.o0OOo00O(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f12283o00ooO0o.o0OOOo0o(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f12283o00ooO0o.o0OOo00(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f12283o00ooO0o.o0OOOoO0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f12283o00ooO0o.o0OOo00o(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f12283o00ooO0o.o0OOOooo(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1935o00oo0o0 = this.f12283o00ooO0o;
        o00ooO0();
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0Oo(o00ooO.o00oOoO o00oooo2, boolean z) {
        this.f12283o00ooO0o.oo0ooO(z);
    }

    @Override // androidx.constraintlayout.widget.o00oo0O
    public void o00ooO0O(o00ooO0 o00ooo02, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (o00ooo02 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        o00ooo02.o0OO0O0(mode, size, mode2, size2);
        setMeasuredDimension(o00ooo02.o0OO00Oo(), o00ooo02.o0OO00oo());
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        o00ooO0O(this.f12283o00ooO0o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f12283o00ooO0o.o0OOOOoo(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f12283o00ooO0o.o0OOOo00(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f12283o00ooO0o.o0OOOo0(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f12283o00ooO0o.o0OOOo0O(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f12283o00ooO0o.o0OOOo0o(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f12283o00ooO0o.o0OOOo(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f12283o00ooO0o.o0OOOoO0(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f12283o00ooO0o.o0OOOoO(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f12283o00ooO0o.o0OOOooo(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f12283o00ooO0o.o0OOo000(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f12283o00ooO0o.o0OO0o0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f12283o00ooO0o.o0OO0o0O(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f12283o00ooO0o.o0OO0o(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f12283o00ooO0o.o0OO0oO0(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f12283o00ooO0o.o0OO0oOO(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f12283o00ooO0o.o0OOo00(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f12283o00ooO0o.o0OOo00O(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f12283o00ooO0o.o0OOo00o(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f12283o00ooO0o.o0OOo0O0(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f12283o00ooO0o.o0OooOo(i);
        requestLayout();
    }
}
