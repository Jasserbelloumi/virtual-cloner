package com.willy.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
/* loaded from: classes2.dex */
public class BaseRatingBar extends LinearLayout implements o00oo0 {

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f6627o00ooOoO = "SimpleRatingBar";

    /* renamed from: o00oo  reason: collision with root package name */
    public float f6628o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f6629o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f6630o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f6631o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f6632o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f6633o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f6634o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f6635o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f6636o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f6637o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f6638o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f6639o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public Drawable f6640o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f6641o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public Drawable f6642o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public List<o00oOo00> f6643o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public o00oOOo0 f6644o00ooOo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public float f6645o0O0o;

    /* loaded from: classes2.dex */
    public interface o00oOOo0 {
        void o00oOOo0(BaseRatingBar baseRatingBar, float f, boolean z);
    }

    public BaseRatingBar(Context context) {
        this(context, null);
    }

    public BaseRatingBar(Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseRatingBar(Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6629o00oo0O = 20;
        this.f6632o00oo0o = 0.0f;
        this.f6634o00oo0oO = -1.0f;
        this.f6645o0O0o = 1.0f;
        this.f6628o00oo = 0.0f;
        this.f6637o00ooO00 = false;
        this.f6636o00ooO0 = true;
        this.f6638o00ooO0O = true;
        this.f6639o00ooO0o = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BaseRatingBar);
        float f = obtainStyledAttributes.getFloat(R.styleable.BaseRatingBar_srb_rating, 0.0f);
        o00oOoOO(obtainStyledAttributes, context);
        o00oo00O();
        o00oOoOo();
        setRating(f);
    }

    @Override // com.willy.ratingbar.o00oo0
    public int getNumStars() {
        return this.f6630o00oo0O0;
    }

    @Override // com.willy.ratingbar.o00oo0
    public float getRating() {
        return this.f6634o00oo0oO;
    }

    @Override // com.willy.ratingbar.o00oo0
    public int getStarHeight() {
        return this.f6633o00oo0o0;
    }

    @Override // com.willy.ratingbar.o00oo0
    public int getStarPadding() {
        return this.f6629o00oo0O;
    }

    @Override // com.willy.ratingbar.o00oo0
    public int getStarWidth() {
        return this.f6631o00oo0Oo;
    }

    @Override // com.willy.ratingbar.o00oo0
    public float getStepSize() {
        return this.f6645o0O0o;
    }

    @Override // android.view.View, com.willy.ratingbar.o00oo0
    public boolean isClickable() {
        return this.f6638o00ooO0O;
    }

    @Override // com.willy.ratingbar.o00oo0
    public boolean o00oOOo0() {
        return this.f6637o00ooO00;
    }

    @Override // com.willy.ratingbar.o00oo0
    public boolean o00oOOoO() {
        return this.f6639o00ooO0o;
    }

    @Override // com.willy.ratingbar.o00oo0
    public boolean o00oOo00() {
        return this.f6636o00ooO0;
    }

    public void o00oOo0O(float f) {
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            int i = (((Integer) o00ooo002.getTag()).intValue() > Math.ceil(f) ? 1 : (((Integer) o00ooo002.getTag()).intValue() == Math.ceil(f) ? 0 : -1));
            if (i > 0) {
                o00ooo002.o00oOOoO();
            } else if (i == 0) {
                o00ooo002.o00oOo0o(f);
            } else {
                o00ooo002.o00oOooO();
            }
        }
    }

    public final o00oOo00 o00oOo0o(int i, int i2, int i3, int i4, Drawable drawable, Drawable drawable2) {
        o00oOo00 o00ooo002 = new o00oOo00(getContext(), i, i2, i3, i4);
        o00ooo002.o00oOo0O(drawable);
        o00ooo002.o00oOo00(drawable2);
        return o00ooo002;
    }

    public final void o00oOoO(float f) {
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            if (f < (this.f6632o00oo0o * o00ooo002.getWidth()) + (o00ooo002.getWidth() / 10.0f)) {
                o00oOooo(this.f6632o00oo0o, true);
                return;
            } else if (o00oOoo0(f, o00ooo002)) {
                float o00oOOo02 = o00oOo0O.o00oOOo0(o00ooo002, this.f6645o0O0o, f);
                if (this.f6634o00oo0oO != o00oOOo02) {
                    o00oOooo(o00oOOo02, true);
                }
            }
        }
    }

    public final void o00oOoO0(float f) {
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            if (o00oOoo0(f, o00ooo002)) {
                float f2 = this.f6645o0O0o;
                float intValue = f2 == 1.0f ? ((Integer) o00ooo002.getTag()).intValue() : o00oOo0O.o00oOOo0(o00ooo002, f2, f);
                if (this.f6628o00oo == intValue && o00oOOoO()) {
                    intValue = this.f6632o00oo0o;
                }
                o00oOooo(intValue, true);
                return;
            }
        }
    }

    public final void o00oOoOO(TypedArray typedArray, Context context) {
        this.f6630o00oo0O0 = typedArray.getInt(R.styleable.BaseRatingBar_srb_numStars, this.f6630o00oo0O0);
        this.f6645o0O0o = typedArray.getFloat(R.styleable.BaseRatingBar_srb_stepSize, this.f6645o0O0o);
        this.f6632o00oo0o = typedArray.getFloat(R.styleable.BaseRatingBar_srb_minimumStars, this.f6632o00oo0o);
        this.f6629o00oo0O = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starPadding, this.f6629o00oo0O);
        this.f6631o00oo0Oo = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starWidth, 0);
        this.f6633o00oo0o0 = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starHeight, 0);
        int i = R.styleable.BaseRatingBar_srb_drawableEmpty;
        this.f6640o00ooOO = typedArray.hasValue(i) ? o0.getDrawable(context, typedArray.getResourceId(i, -1)) : null;
        int i2 = R.styleable.BaseRatingBar_srb_drawableFilled;
        this.f6642o00ooOOo = typedArray.hasValue(i2) ? o0.getDrawable(context, typedArray.getResourceId(i2, -1)) : null;
        this.f6637o00ooO00 = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_isIndicator, this.f6637o00ooO00);
        this.f6636o00ooO0 = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_scrollable, this.f6636o00ooO0);
        this.f6638o00ooO0O = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_clickable, this.f6638o00ooO0O);
        this.f6639o00ooO0o = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_clearRatingEnabled, this.f6639o00ooO0o);
        typedArray.recycle();
    }

    public final void o00oOoOo() {
        this.f6643o00ooOo = new ArrayList();
        for (int i = 1; i <= this.f6630o00oo0O0; i++) {
            o00oOo00 o00oOo0o2 = o00oOo0o(i, this.f6631o00oo0Oo, this.f6633o00oo0o0, this.f6629o00oo0O, this.f6642o00ooOOo, this.f6640o00ooOO);
            addView(o00oOo0o2);
            this.f6643o00ooOo.add(o00oOo0o2);
        }
    }

    public final boolean o00oOoo0(float f, View view) {
        return f > ((float) view.getLeft()) && f < ((float) view.getRight());
    }

    public void o00oOooO() {
        o00oOo0O(0.0f);
    }

    public final void o00oOooo(float f, boolean z) {
        int i = this.f6630o00oo0O0;
        if (f > i) {
            f = i;
        }
        float f2 = this.f6632o00oo0o;
        if (f < f2) {
            f = f2;
        }
        if (this.f6634o00oo0oO == f) {
            return;
        }
        float floatValue = Double.valueOf(Math.floor(f / this.f6645o0O0o)).floatValue() * this.f6645o0O0o;
        this.f6634o00oo0oO = floatValue;
        o00oOOo0 o00oooo02 = this.f6644o00ooOo0;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(this, floatValue, z);
        }
        o00oOo0O(this.f6634o00oo0oO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r0 < 0.1f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oo00O() {
        /*
            r3 = this;
            int r0 = r3.f6630o00oo0O0
            if (r0 > 0) goto L7
            r0 = 5
            r3.f6630o00oo0O0 = r0
        L7:
            int r0 = r3.f6629o00oo0O
            if (r0 >= 0) goto Le
            r0 = 0
            r3.f6629o00oo0O = r0
        Le:
            android.graphics.drawable.Drawable r0 = r3.f6640o00ooOO
            if (r0 != 0) goto L1e
            android.content.Context r0 = r3.getContext()
            int r1 = com.willy.ratingbar.R.drawable.empty
            android.graphics.drawable.Drawable r0 = o00ooo0.o0.getDrawable(r0, r1)
            r3.f6640o00ooOO = r0
        L1e:
            android.graphics.drawable.Drawable r0 = r3.f6642o00ooOOo
            if (r0 != 0) goto L2e
            android.content.Context r0 = r3.getContext()
            int r1 = com.willy.ratingbar.R.drawable.filled
            android.graphics.drawable.Drawable r0 = o00ooo0.o0.getDrawable(r0, r1)
            r3.f6642o00ooOOo = r0
        L2e:
            float r0 = r3.f6645o0O0o
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L39
        L36:
            r3.f6645o0O0o = r1
            goto L41
        L39:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
            goto L36
        L41:
            float r0 = r3.f6632o00oo0o
            int r1 = r3.f6630o00oo0O0
            float r2 = r3.f6645o0O0o
            float r0 = com.willy.ratingbar.o00oOo0O.o00oOo00(r0, r1, r2)
            r3.f6632o00oo0o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.willy.ratingbar.BaseRatingBar.o00oo00O():void");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRating(savedState.o00oOOo0());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6646o00oo0O0 = this.f6634o00oo0oO;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (o00oOOo0()) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6635o00ooO = x;
            this.f6641o00ooOO0 = y;
            this.f6628o00oo = this.f6634o00oo0oO;
        } else if (action != 1) {
            if (action == 2) {
                if (!o00oOo00()) {
                    return false;
                }
                o00oOoO(x);
            }
        } else if (!o00oOo0O.o00oOooO(this.f6635o00ooO, this.f6641o00ooOO0, motionEvent) || !isClickable()) {
            return false;
        } else {
            o00oOoO0(x);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setClearRatingEnabled(boolean z) {
        this.f6639o00ooO0o = z;
    }

    @Override // android.view.View, com.willy.ratingbar.o00oo0
    public void setClickable(boolean z) {
        this.f6638o00ooO0O = z;
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setEmptyDrawable(@oo0oO0 Drawable drawable) {
        this.f6640o00ooOO = drawable;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            o00ooo002.o00oOo00(drawable);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setEmptyDrawableRes(@o0O0O0o0 int i) {
        Drawable drawable = o0.getDrawable(getContext(), i);
        if (drawable != null) {
            setEmptyDrawable(drawable);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setFilledDrawable(@oo0oO0 Drawable drawable) {
        this.f6642o00ooOOo = drawable;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            o00ooo002.o00oOo0O(drawable);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setFilledDrawableRes(@o0O0O0o0 int i) {
        Drawable drawable = o0.getDrawable(getContext(), i);
        if (drawable != null) {
            setFilledDrawable(drawable);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setIsIndicator(boolean z) {
        this.f6637o00ooO00 = z;
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setMinimumStars(@o0O0OO0(from = 0.0d) float f) {
        this.f6632o00oo0o = o00oOo0O.o00oOo00(f, this.f6630o00oo0O0, this.f6645o0O0o);
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setNumStars(int i) {
        if (i <= 0) {
            return;
        }
        this.f6643o00ooOo.clear();
        removeAllViews();
        this.f6630o00oo0O0 = i;
        o00oOoOo();
    }

    public void setOnRatingChangeListener(o00oOOo0 o00oooo02) {
        this.f6644o00ooOo0 = o00oooo02;
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setRating(float f) {
        o00oOooo(f, false);
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setScrollable(boolean z) {
        this.f6636o00ooO0 = z;
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setStarHeight(@o0O0o00O(from = 0) int i) {
        this.f6633o00oo0o0 = i;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            o00ooo002.o00oOoO0(i);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setStarPadding(int i) {
        if (i < 0) {
            return;
        }
        this.f6629o00oo0O = i;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            int i2 = this.f6629o00oo0O;
            o00ooo002.setPadding(i2, i2, i2, i2);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setStarWidth(@o0O0o00O(from = 0) int i) {
        this.f6631o00oo0Oo = i;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            o00ooo002.o00oOoO(i);
        }
    }

    @Override // com.willy.ratingbar.o00oo0
    public void setStepSize(@o0O0OO0(from = 0.1d, to = 1.0d) float f) {
        this.f6645o0O0o = f;
    }
}
