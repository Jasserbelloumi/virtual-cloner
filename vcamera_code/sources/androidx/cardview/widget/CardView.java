package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.R;
import o00oOooO.o0O00O;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oo0oO.o0O00;
import o00oo0oO.o0O000Oo;
import o00oo0oO.o0O00O0;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final o0O00O0 IMPL;
    private final o0O00 mCardViewDelegate;
    private boolean mCompatPadding;
    public final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    public final Rect mShadowBounds;
    public int mUserSetMinHeight;
    public int mUserSetMinWidth;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0O00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Drawable f1659o00oOOo0;

        public o00oOOo0() {
        }

        @Override // o00oo0oO.o0O00
        public void o00oOOo0(Drawable drawable) {
            this.f1659o00oOOo0 = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // o00oo0oO.o0O00
        public boolean o00oOOoO() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // o00oo0oO.o0O00
        public Drawable o00oOo00() {
            return this.f1659o00oOOo0;
        }

        @Override // o00oo0oO.o0O00
        public boolean o00oOo0O() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // o00oo0oO.o0O00
        public View o00oOo0o() {
            return CardView.this;
        }

        @Override // o00oo0oO.o0O00
        public void o00oOooO(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // o00oo0oO.o0O00
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        o0O000Oo o0o000oo = new o0O000Oo();
        IMPL = o0o000oo;
        o0o000oo.o00oo0();
    }

    public CardView(@oo0oO0 Context context) {
        this(context, null);
    }

    public CardView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources;
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.mCardViewDelegate = o00oooo02;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        int i3 = R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i2 = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        IMPL.o00oOoO0(o00oooo02, context, colorStateList, dimension, dimension2, f);
    }

    @oo0oO0
    public ColorStateList getCardBackgroundColor() {
        return IMPL.o00oOo0o(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.o00oOoOO(this.mCardViewDelegate);
    }

    @o0OO0
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @o0OO0
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @o0OO0
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @o0OO0
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.o00oOo0O(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.o00oOoO(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        o0O00O0 o0o00o0 = IMPL;
        if (!(o0o00o0 instanceof o0O000Oo)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(o0o00o0.o00oOo00(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(o0o00o0.o00oOOoO(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@o0O00O int i) {
        IMPL.o00oo00O(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(@o0OO00OO ColorStateList colorStateList) {
        IMPL.o00oo00O(this.mCardViewDelegate, colorStateList);
    }

    public void setCardElevation(float f) {
        IMPL.o00oOooO(this.mCardViewDelegate, f);
    }

    public void setContentPadding(@o0OO0 int i, @o0OO0 int i2, @o0OO0 int i3, @o0OO0 int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.o00oOooo(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.o00oOoOo(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.o00oOOo0(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.o00oOoo0(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.o00oo0OO(this.mCardViewDelegate);
        }
    }
}
