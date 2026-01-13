package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public final o00oOOo0 f3771o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public CharSequence f3772o0O00Oo;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public CharSequence f3773o0oO0Ooo;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements CompoundButton.OnCheckedChangeListener {
        public o00oOOo0() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.o00oOooO(Boolean.valueOf(z))) {
                SwitchPreference.this.oooOO0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public SwitchPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.switchPreferenceStyle, 16843629), 0);
    }

    public SwitchPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3771o0O00OOO = new o00oOOo0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreference, i, i2);
        o0O0oOO0(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOn, R.styleable.SwitchPreference_android_summaryOn));
        o0O0oO0o(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOff, R.styleable.SwitchPreference_android_summaryOff));
        o0O0oOoo(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOn, R.styleable.SwitchPreference_android_switchTextOn));
        o0O0oOo(o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOff, R.styleable.SwitchPreference_android_switchTextOff));
        o0O0oO0(o0O0o00.o00oOOoO(obtainStyledAttributes, R.styleable.SwitchPreference_disableDependentsState, R.styleable.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        super.o0O000o0(o0o000oo);
        o0O0oo0(o0o000oo.o00oOOoO(androidx.preference.o00oOOo0.f3792o00oOo00));
        o0O0oo00(o0o000oo);
    }

    @Override // androidx.preference.Preference
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o0O00Ooo(@oo0oO0 View view) {
        o0O00OoO();
        o0O0oo(view);
    }

    @o0OO00OO
    public CharSequence o0O0oOOO() {
        return this.f3773o0oO0Ooo;
    }

    public void o0O0oOo(@o0OO00OO CharSequence charSequence) {
        this.f3773o0oO0Ooo = charSequence;
        o0O0000o();
    }

    @o0OO00OO
    public CharSequence o0O0oOo0() {
        return this.f3772o0O00Oo;
    }

    public void o0O0oOoO(int i) {
        o0O0oOoo(o00oo00O().getString(i));
    }

    public void o0O0oOoo(@o0OO00OO CharSequence charSequence) {
        this.f3772o0O00Oo = charSequence;
        o0O0000o();
    }

    public final void o0O0oo(View view) {
        if (((AccessibilityManager) o00oo00O().getSystemService("accessibility")).isEnabled()) {
            o0O0oo0(view.findViewById(androidx.preference.o00oOOo0.f3792o00oOo00));
            o0O0oOO(view.findViewById(16908304));
        }
    }

    public final void o0O0oo0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3780o0O00O0);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f3772o0O00Oo);
            r4.setTextOff(this.f3773o0oO0Ooo);
            r4.setOnCheckedChangeListener(this.f3771o0O00OOO);
        }
    }

    public void oo0oOOo(int i) {
        o0O0oOo(o00oo00O().getString(i));
    }
}
