package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public final o00oOOo0 f3664o0O00OOO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements CompoundButton.OnCheckedChangeListener {
        public o00oOOo0() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.o00oOooO(Boolean.valueOf(z))) {
                CheckBoxPreference.this.oooOO0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public CheckBoxPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.checkBoxPreferenceStyle, 16842895), 0);
    }

    public CheckBoxPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3664o0O00OOO = new o00oOOo0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CheckBoxPreference, i, i2);
        o0O0oOO0(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOn, R.styleable.CheckBoxPreference_android_summaryOn));
        o0O0oO0o(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOff, R.styleable.CheckBoxPreference_android_summaryOff));
        o0O0oO0(o0O0o00.o00oOOoO(obtainStyledAttributes, R.styleable.CheckBoxPreference_disableDependentsState, R.styleable.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        super.o0O000o0(o0o000oo);
        o0O0oOOO(o0o000oo.o00oOOoO(16908289));
        o0O0oo00(o0o000oo);
    }

    @Override // androidx.preference.Preference
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o0O00Ooo(@oo0oO0 View view) {
        o0O00OoO();
        o0O0oOo0(view);
    }

    public final void o0O0oOOO(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3780o0O00O0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3664o0O00OOO);
        }
    }

    public final void o0O0oOo0(@oo0oO0 View view) {
        if (((AccessibilityManager) o00oo00O().getSystemService("accessibility")).isEnabled()) {
            o0O0oOOO(view.findViewById(16908289));
            o0O0oOO(view.findViewById(16908304));
        }
    }
}
