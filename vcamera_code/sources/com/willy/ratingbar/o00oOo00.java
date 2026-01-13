package com.willy.ratingbar;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import o00oOooO.o0O0o00O;
import o00oOooO.oo0oO0;
import o0O000oo.o0;
/* loaded from: classes2.dex */
public class o00oOo00 extends RelativeLayout {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ImageView f6653o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ImageView f6654o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f6655o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f6656o00oo0o0;

    public o00oOo00(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.f6655o00oo0Oo = i2;
        this.f6656o00oo0o0 = i3;
        setTag(Integer.valueOf(i));
        setPadding(i4, i4, i4, i4);
        o00oOOo0();
    }

    public o00oOo00(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6655o00oo0Oo = 0;
        this.f6656o00oo0o0 = 0;
        o00oOOo0();
    }

    public o00oOo00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6655o00oo0Oo = 0;
        this.f6656o00oo0o0 = 0;
        o00oOOo0();
    }

    public final void o00oOOo0() {
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        int i = this.f6655o00oo0Oo;
        if (i == 0) {
            i = -2;
        }
        int i2 = this.f6656o00oo0o0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2 != 0 ? i2 : -2);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(getContext());
        this.f6654o00oo0O0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f6654o00oo0O0, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.f6653o00oo0O = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f6653o00oo0O, layoutParams);
        o00oOOoO();
    }

    public void o00oOOoO() {
        this.f6654o00oo0O0.setImageLevel(0);
        this.f6653o00oo0O.setImageLevel(10000);
    }

    public void o00oOo00(@oo0oO0 Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.f6653o00oo0O.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388613, 1));
    }

    public void o00oOo0O(@oo0oO0 Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }
        this.f6654o00oo0O0.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), o0.f10418o00oOOoO, 1));
    }

    public void o00oOo0o(float f) {
        int i = (int) ((f % 1.0f) * 10000.0f);
        if (i == 0) {
            i = 10000;
        }
        this.f6654o00oo0O0.setImageLevel(i);
        this.f6653o00oo0O.setImageLevel(10000 - i);
    }

    public void o00oOoO(@o0O0o00O(from = 0) int i) {
        this.f6655o00oo0Oo = i;
        ViewGroup.LayoutParams layoutParams = this.f6654o00oo0O0.getLayoutParams();
        layoutParams.width = this.f6655o00oo0Oo;
        this.f6654o00oo0O0.setLayoutParams(layoutParams);
        this.f6653o00oo0O.setLayoutParams(layoutParams);
    }

    public void o00oOoO0(@o0O0o00O(from = 0) int i) {
        this.f6656o00oo0o0 = i;
        ViewGroup.LayoutParams layoutParams = this.f6654o00oo0O0.getLayoutParams();
        layoutParams.height = this.f6656o00oo0o0;
        this.f6654o00oo0O0.setLayoutParams(layoutParams);
        this.f6653o00oo0O.setLayoutParams(layoutParams);
    }

    public void o00oOooO() {
        this.f6654o00oo0O0.setImageLevel(10000);
        this.f6653o00oo0O.setImageLevel(0);
    }
}
