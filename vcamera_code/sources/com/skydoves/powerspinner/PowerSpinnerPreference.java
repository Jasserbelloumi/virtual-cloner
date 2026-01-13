package com.skydoves.powerspinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.o0O000Oo;
import o0O0Oooo.oooOO0;
import o0OO0Ooo.o00oo0OO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O000;
import o0OOOO0o.o00oo0O0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public final class PowerSpinnerPreference extends Preference {
    @NotNull

    /* renamed from: o0O00O0  reason: collision with root package name */
    public final PowerSpinnerView f6569o0O00O0;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public int f6570o0OoO00O;

    /* loaded from: classes2.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0O000<Integer, Object, Integer, Object, oO0Ooooo> {
        public o00oOOo0() {
            super(4);
        }

        @Override // o0OOOO.o0O000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Integer num, Object obj, Integer num2, Object obj2) {
            invoke(num.intValue(), obj, num2.intValue(), obj2);
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(int i, @Nullable Object obj, int i2, @NotNull Object obj2) {
            o0ooO.o00oo0O0(obj2, "<anonymous parameter 3>");
            PowerSpinnerPreference.this.o0O00o0o(i2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class o00oOOoO<T> extends o0O0OO implements o0O000<Integer, T, Integer, T, oO0Ooooo> {
        public final /* synthetic */ o00oo0OO<T> $onSpinnerItemSelectedListener;
        public final /* synthetic */ PowerSpinnerPreference this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o00oo0OO<T> o00oo0oo, PowerSpinnerPreference powerSpinnerPreference) {
            super(4);
            this.$onSpinnerItemSelectedListener = o00oo0oo;
            this.this$0 = powerSpinnerPreference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Integer num, Object obj, Integer num2, Object obj2) {
            invoke(num.intValue(), (int) obj, num2.intValue(), (int) obj2);
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(int i, @Nullable T t, int i2, T t2) {
            this.$onSpinnerItemSelectedListener.o00oOOo0(i, t, i2, t2);
            this.this$0.o0O00o0o(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O000<Integer, Object, Integer, Object, oO0Ooooo> {
        public final /* synthetic */ o0O000<Integer, Object, Integer, Object, oO0Ooooo> $block;
        public final /* synthetic */ PowerSpinnerPreference this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0O000<? super Integer, Object, ? super Integer, Object, oO0Ooooo> o0o000, PowerSpinnerPreference powerSpinnerPreference) {
            super(4);
            this.$block = o0o000;
            this.this$0 = powerSpinnerPreference;
        }

        @Override // o0OOOO.o0O000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Integer num, Object obj, Integer num2, Object obj2) {
            invoke(num.intValue(), obj, num2.intValue(), obj2);
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(int i, @Nullable Object obj, int i2, Object obj2) {
            this.$block.invoke(Integer.valueOf(i), obj, Integer.valueOf(i2), obj2);
            this.this$0.o0O00o0o(i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public PowerSpinnerPreference(@NotNull Context context) {
        this(context, null, 0, 6, null);
        o0ooO.o00oo0O0(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public PowerSpinnerPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o0ooO.o00oo0O0(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public PowerSpinnerPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        o0ooO.o00oo0O0(context, "context");
        this.f6569o0O00O0 = new PowerSpinnerView(context);
        this.f3728o0O0000O = R.layout.powerspinner_layout_preference;
        if (attributeSet != null && i != androidx.preference.R.attr.preferenceStyle) {
            o0O0o0oo(attributeSet, i);
        } else if (attributeSet != null) {
            o0O0o0oO(attributeSet);
        }
    }

    public /* synthetic */ PowerSpinnerPreference(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? androidx.preference.R.attr.preferenceStyle : i);
    }

    @Override // androidx.preference.Preference
    @NotNull
    public Object o0O00(@NotNull TypedArray typedArray, int i) {
        o0ooO.o00oo0O0(typedArray, oooOO0.f12266o00oOOo0);
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@NotNull o0O000Oo o0o000oo) {
        o0ooO.o00oo0O0(o0o000oo, "holder");
        PowerSpinnerView powerSpinnerView = this.f6569o0O00O0;
        powerSpinnerView.o00ooOo(o00ooOO0(this.f6570o0OoO00O));
        if (powerSpinnerView.getSpinnerAdapter().o0O0o() == null) {
            powerSpinnerView.setOnSpinnerItemSelectedListener(new o00oOOo0());
        }
        View o00oOOoO2 = o0o000oo.o00oOOoO(R.id.powerSpinner_preference);
        o0ooO.o00oo0(o00oOOoO2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) o00oOOoO2).addView(this.f6569o0O00O0, -1, -2);
        View o00oOOoO3 = o0o000oo.o00oOOoO(R.id.preference_title);
        o0ooO.o00oo0(o00oOOoO3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) o00oOOoO3;
        textView.setText(this.f3704o00ooO0);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        o0ooO.o00oo0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        PowerSpinnerView powerSpinnerView2 = this.f6569o0O00O0;
        int marginStart = marginLayoutParams.getMarginStart();
        Context context = this.f3698o00oo0O0;
        o0ooO.o00oo0OO(context, "context");
        int o00oOo002 = o0OO0o0.o00oOOoO.o00oOo00(context, 10);
        int marginEnd = marginLayoutParams.getMarginEnd();
        Context context2 = this.f3698o00oo0O0;
        o0ooO.o00oo0OO(context2, "context");
        powerSpinnerView2.setPadding(marginStart, o00oOo002, marginEnd, o0OO0o0.o00oOOoO.o00oOo00(context2, 10));
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(@Nullable Object obj) {
        if (obj instanceof Integer) {
            this.f6570o0OoO00O = ((Number) obj).intValue();
        }
    }

    public final void o0O0o0oO(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f3698o00oo0O0.obtainStyledAttributes(attributeSet, R.styleable.PowerSpinnerView);
        o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…yleable.PowerSpinnerView)");
        try {
            o0O0oO0O(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void o0O0o0oo(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3698o00oo0O0.obtainStyledAttributes(attributeSet, R.styleable.PowerSpinnerView, i, 0);
        o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…fStyleAttr,\n      0\n    )");
        try {
            o0O0oO0O(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final /* synthetic */ void o0O0oO0(o0O000 o0o000) {
        o0ooO.o00oo0O0(o0o000, "block");
        this.f6569o0O00O0.setOnSpinnerItemSelectedListener(new o00oOo00(o0o000, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r0 == r1.getValue()) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dc, code lost:
        if (r0 == r1.getValue()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0O0oO0O(android.content.res.TypedArray r5) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.powerspinner.PowerSpinnerPreference.o0O0oO0O(android.content.res.TypedArray):void");
    }

    @NotNull
    public final PowerSpinnerView o0O0oo0O() {
        return this.f6569o0O00O0;
    }

    public final <T> void oooOO0(@NotNull o00oo0OO<T> o00oo0oo) {
        o0ooO.o00oo0O0(o00oo0oo, "onSpinnerItemSelectedListener");
        this.f6569o0O00O0.setOnSpinnerItemSelectedListener(new o00oOOoO(o00oo0oo, this));
    }
}
