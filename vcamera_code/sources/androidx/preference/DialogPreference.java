package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: o0O00O  reason: collision with root package name */
    public CharSequence f3666o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public CharSequence f3667o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public Drawable f3668o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public CharSequence f3669o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public int f3670o0O00OOO;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public CharSequence f3671o0OoO00O;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        @o0OO00OO
        <T extends Preference> T o00oOOoO(@oo0oO0 CharSequence charSequence);
    }

    public DialogPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public DialogPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public DialogPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialogPreference, i, i2);
        String o00oo0OO2 = o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.DialogPreference_dialogTitle, R.styleable.DialogPreference_android_dialogTitle);
        this.f3667o0O00O0 = o00oo0OO2;
        if (o00oo0OO2 == null) {
            this.f3667o0O00O0 = o00ooo0o();
        }
        this.f3671o0OoO00O = o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.DialogPreference_dialogMessage, R.styleable.DialogPreference_android_dialogMessage);
        this.f3668o0O00O0o = o0O0o00.o00oOo00(obtainStyledAttributes, R.styleable.DialogPreference_dialogIcon, R.styleable.DialogPreference_android_dialogIcon);
        this.f3666o0O00O = o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.DialogPreference_positiveButtonText, R.styleable.DialogPreference_android_positiveButtonText);
        this.f3669o0O00OO = o0O0o00.o00oo0OO(obtainStyledAttributes, R.styleable.DialogPreference_negativeButtonText, R.styleable.DialogPreference_android_negativeButtonText);
        this.f3670o0O00OOO = o0O0o00.o00oo0(obtainStyledAttributes, R.styleable.DialogPreference_dialogLayout, R.styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o0O000o() {
        o00ooOoO().o00ooOoo(this);
    }

    public int o0O0o0oO() {
        return this.f3670o0O00OOO;
    }

    @o0OO00OO
    public CharSequence o0O0o0oo() {
        return this.f3671o0OoO00O;
    }

    public void o0O0oO(int i) {
        this.f3670o0O00OOO = i;
    }

    @o0OO00OO
    public CharSequence o0O0oO0() {
        return this.f3666o0O00O;
    }

    public void o0O0oO0O(int i) {
        this.f3668o0O00O0o = o00oOo0o.o00oOo00.o00oOOoO(o00oo00O(), i);
    }

    public void o0O0oO0o(@o0OO00OO Drawable drawable) {
        this.f3668o0O00O0o = drawable;
    }

    public void o0O0oOO(@o0OO00OO CharSequence charSequence) {
        this.f3671o0OoO00O = charSequence;
    }

    public void o0O0oOO0(int i) {
        o0O0oOO(o00oo00O().getString(i));
    }

    public void o0O0oOOO(@o0OO00OO CharSequence charSequence) {
        this.f3667o0O00O0 = charSequence;
    }

    public void o0O0oOo(int i) {
        o0O0oOoO(o00oo00O().getString(i));
    }

    public void o0O0oOo0(int i) {
        oo0oOOo(o00oo00O().getString(i));
    }

    public void o0O0oOoO(@o0OO00OO CharSequence charSequence) {
        this.f3666o0O00O = charSequence;
    }

    public void o0O0oo00(int i) {
        o0O0oOOO(o00oo00O().getString(i));
    }

    @o0OO00OO
    public CharSequence o0O0oo0O() {
        return this.f3667o0O00O0;
    }

    @o0OO00OO
    public Drawable o0oOo0O0() {
        return this.f3668o0O00O0o;
    }

    public void oo0oOOo(@o0OO00OO CharSequence charSequence) {
        this.f3669o0O00OO = charSequence;
    }

    @o0OO00OO
    public CharSequence oooOO0() {
        return this.f3669o0O00OO;
    }
}
