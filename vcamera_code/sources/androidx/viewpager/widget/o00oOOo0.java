package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ViewPager.o00oOoO
/* loaded from: classes.dex */
public class o00oOOo0 extends ViewGroup {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int[] f5316o00ooOO = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int[] f5317o00ooOOo = {16843660};

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f5318o00ooOo = 16;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final float f5319o00ooOo0 = 0.6f;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f5320o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public TextView f5321o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ViewPager f5322o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public TextView f5323o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f5324o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public TextView f5325o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f5326o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f5327o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f5328o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f5329o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final C0059o00oOOo0 f5330o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public WeakReference<oo0OOoo.o00oOOo0> f5331o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f5332o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f5333o0O0o;

    /* renamed from: androidx.viewpager.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0059o00oOOo0 extends DataSetObserver implements ViewPager.o00oo0O, ViewPager.o00oo0O0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f5334o00oOOo0;

        public C0059o00oOOo0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O0
        public void onAdapterChanged(ViewPager viewPager, oo0OOoo.o00oOOo0 o00oooo02, oo0OOoo.o00oOOo0 o00oooo03) {
            o00oOOo0.this.o00oOOoO(o00oooo02, o00oooo03);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.o00oOo00(o00oooo02.f5322o00oo0O0.getCurrentItem(), o00oOOo0.this.f5322o00oo0O0.getAdapter());
            o00oOOo0 o00oooo03 = o00oOOo0.this;
            float f = o00oooo03.f5326o00oo0oO;
            if (f < 0.0f) {
                f = 0.0f;
            }
            o00oooo03.o00oOooO(o00oooo03.f5322o00oo0O0.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageScrollStateChanged(int i) {
            this.f5334o00oOOo0 = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            o00oOOo0.this.o00oOooO(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageSelected(int i) {
            if (this.f5334o00oOOo0 == 0) {
                o00oOOo0 o00oooo02 = o00oOOo0.this;
                o00oooo02.o00oOo00(o00oooo02.f5322o00oo0O0.getCurrentItem(), o00oOOo0.this.f5322o00oo0O0.getAdapter());
                o00oOOo0 o00oooo03 = o00oOOo0.this;
                float f = o00oooo03.f5326o00oo0oO;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                o00oooo03.o00oOooO(o00oooo03.f5322o00oo0O0.getCurrentItem(), f, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends SingleLineTransformationMethod {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Locale f5336o00oo0O0;

        public o00oOOoO(Context context) {
            this.f5336o00oo0O0 = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f5336o00oo0O0);
            }
            return null;
        }
    }

    public o00oOOo0(@oo0oO0 Context context) {
        this(context, null);
    }

    public o00oOOo0(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5324o00oo0o = -1;
        this.f5326o00oo0oO = -1.0f;
        this.f5330o00ooO0O = new C0059o00oOOo0();
        TextView textView = new TextView(context);
        this.f5321o00oo0O = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f5323o00oo0Oo = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f5325o00oo0o0 = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5316o00ooOO);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f5321o00oo0O.setTextAppearance(resourceId);
            this.f5323o00oo0Oo.setTextAppearance(resourceId);
            this.f5325o00oo0o0.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            o00oOOo0(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f5321o00oo0O.setTextColor(color);
            this.f5323o00oo0Oo.setTextColor(color);
            this.f5325o00oo0o0.setTextColor(color);
        }
        this.f5320o00oo = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f5332o00ooOO0 = this.f5323o00oo0Oo.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f5321o00oo0O.setEllipsize(TextUtils.TruncateAt.END);
        this.f5323o00oo0Oo.setEllipsize(TextUtils.TruncateAt.END);
        this.f5325o00oo0o0.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f5317o00ooOOo);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.f5321o00oo0O;
        if (z) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.f5323o00oo0Oo);
            setSingleLineAllCaps(this.f5325o00oo0o0);
        } else {
            textView4.setSingleLine();
            this.f5323o00oo0Oo.setSingleLine();
            this.f5325o00oo0o0.setSingleLine();
        }
        this.f5333o0O0o = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new o00oOOoO(textView.getContext()));
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f5333o0O0o;
    }

    public void o00oOOo0(int i, float f) {
        this.f5321o00oo0O.setTextSize(i, f);
        this.f5323o00oo0Oo.setTextSize(i, f);
        this.f5325o00oo0o0.setTextSize(i, f);
    }

    public void o00oOOoO(oo0OOoo.o00oOOo0 o00oooo02, oo0OOoo.o00oOOo0 o00oooo03) {
        if (o00oooo02 != null) {
            o00oooo02.o00oo0oO(this.f5330o00ooO0O);
            this.f5331o00ooO0o = null;
        }
        if (o00oooo03 != null) {
            o00oooo03.o00oo00O(this.f5330o00ooO0O);
            this.f5331o00ooO0o = new WeakReference<>(o00oooo03);
        }
        ViewPager viewPager = this.f5322o00oo0O0;
        if (viewPager != null) {
            this.f5324o00oo0o = -1;
            this.f5326o00oo0oO = -1.0f;
            o00oOo00(viewPager.getCurrentItem(), o00oooo03);
            requestLayout();
        }
    }

    public void o00oOo00(int i, oo0OOoo.o00oOOo0 o00oooo02) {
        int o00oOo0O2 = o00oooo02 != null ? o00oooo02.o00oOo0O() : 0;
        this.f5329o00ooO00 = true;
        CharSequence charSequence = null;
        this.f5321o00oo0O.setText((i < 1 || o00oooo02 == null) ? null : o00oooo02.o00oOoO0(i - 1));
        this.f5323o00oo0Oo.setText((o00oooo02 == null || i >= o00oOo0O2) ? null : o00oooo02.o00oOoO0(i));
        int i2 = i + 1;
        if (i2 < o00oOo0O2 && o00oooo02 != null) {
            charSequence = o00oooo02.o00oOoO0(i2);
        }
        this.f5325o00oo0o0.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f5321o00oo0O.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5323o00oo0Oo.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5325o00oo0o0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5324o00oo0o = i;
        if (!this.f5328o00ooO0) {
            o00oOooO(i, this.f5326o00oo0oO, false);
        }
        this.f5329o00ooO00 = false;
    }

    public void o00oOooO(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f5324o00oo0o) {
            o00oOo00(i, this.f5322o00oo0O0.getAdapter());
        } else if (!z && f == this.f5326o00oo0oO) {
            return;
        }
        this.f5328o00ooO0 = true;
        int measuredWidth = this.f5321o00oo0O.getMeasuredWidth();
        int measuredWidth2 = this.f5323o00oo0Oo.getMeasuredWidth();
        int measuredWidth3 = this.f5325o00oo0o0.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f5321o00oo0O.getBaseline();
        int baseline2 = this.f5323o00oo0Oo.getBaseline();
        int baseline3 = this.f5325o00oo0o0.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f5321o00oo0O.getMeasuredHeight() + i11, this.f5323o00oo0Oo.getMeasuredHeight() + i12), this.f5325o00oo0o0.getMeasuredHeight() + i13);
        int i14 = this.f5320o00oo & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i14 != 80) {
            i3 = i11 + paddingTop;
            i4 = i12 + paddingTop;
            i5 = paddingTop + i13;
            TextView textView = this.f5323o00oo0Oo;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int min = Math.min(paddingLeft, (i9 - this.f5333o0O0o) - measuredWidth);
            TextView textView2 = this.f5321o00oo0O;
            textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f5333o0O0o);
            TextView textView3 = this.f5325o00oo0o0;
            textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f5326o00oo0oO = f;
            this.f5328o00ooO0 = false;
        } else {
            i2 = (height - paddingBottom) - max2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f5323o00oo0Oo;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.f5333o0O0o) - measuredWidth);
        TextView textView22 = this.f5321o00oo0O;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f5333o0O0o);
        TextView textView32 = this.f5325o00oo0o0;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f5326o00oo0oO = f;
        this.f5328o00ooO0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        oo0OOoo.o00oOOo0 adapter = viewPager.getAdapter();
        viewPager.o0O00000(this.f5330o00ooO0O);
        viewPager.o00oOOoO(this.f5330o00ooO0O);
        this.f5322o00oo0O0 = viewPager;
        WeakReference<oo0OOoo.o00oOOo0> weakReference = this.f5331o00ooO0o;
        o00oOOoO(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f5322o00oo0O0;
        if (viewPager != null) {
            o00oOOoO(viewPager.getAdapter(), null);
            this.f5322o00oo0O0.o0O00000(null);
            this.f5322o00oo0O0.o00oooO(this.f5330o00ooO0O);
            this.f5322o00oo0O0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5322o00oo0O0 != null) {
            float f = this.f5326o00oo0oO;
            if (f < 0.0f) {
                f = 0.0f;
            }
            o00oOooO(this.f5324o00oo0o, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f5321o00oo0O.measure(childMeasureSpec2, childMeasureSpec);
        this.f5323o00oo0Oo.measure(childMeasureSpec2, childMeasureSpec);
        this.f5325o00oo0o0.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), this.f5323o00oo0Oo.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.f5323o00oo0Oo.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f5329o00ooO00) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f5320o00oo = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f5327o00ooO = i;
        int i2 = (i << 24) | (this.f5332o00ooOO0 & 16777215);
        this.f5321o00oo0O.setTextColor(i2);
        this.f5325o00oo0o0.setTextColor(i2);
    }

    public void setTextColor(@o0O00O int i) {
        this.f5332o00ooOO0 = i;
        this.f5323o00oo0Oo.setTextColor(i);
        int i2 = (this.f5327o00ooO << 24) | (this.f5332o00ooOO0 & 16777215);
        this.f5321o00oo0O.setTextColor(i2);
        this.f5325o00oo0o0.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f5333o0O0o = i;
        requestLayout();
    }
}
