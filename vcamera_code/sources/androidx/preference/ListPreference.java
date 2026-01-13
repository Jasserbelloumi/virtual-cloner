package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public static final String f3681o0O00o0O = "ListPreference";

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public CharSequence[] f3682o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public String f3683o0O00OoO;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public String f3684o0O00Ooo;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public boolean f3685o0O00o00;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public CharSequence[] f3686o0oO0Ooo;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f3687o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3687o00oo0O0 = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3687o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Preference.o00oo00O<ListPreference> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static o00oOOo0 f3688o00oOOo0;

        @oo0oO0
        public static o00oOOo0 o00oOOoO() {
            if (f3688o00oOOo0 == null) {
                f3688o00oOOo0 = new o00oOOo0();
            }
            return f3688o00oOOo0;
        }

        @Override // androidx.preference.Preference.o00oo00O
        @o0OO00OO
        /* renamed from: o00oOo00 */
        public CharSequence o00oOOo0(@oo0oO0 ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.o0O0oo()) ? listPreference.o00oo00O().getString(R.string.not_set) : listPreference.o0O0oo();
        }
    }

    public ListPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public ListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public ListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPreference, i, i2);
        this.f3682o0O00Oo = o0O0o00.o00oo0O(obtainStyledAttributes, R.styleable.ListPreference_entries, R.styleable.ListPreference_android_entries);
        this.f3686o0oO0Ooo = o0O0o00.o00oo0O(obtainStyledAttributes, R.styleable.ListPreference_entryValues, R.styleable.ListPreference_android_entryValues);
        int i3 = R.styleable.ListPreference_useSimpleSummaryProvider;
        if (o0O0o00.o00oOOoO(obtainStyledAttributes, i3, i3, false)) {
            o0O0Ooo(o00oOOo0.o00oOOoO());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i, i2);
        this.f3684o0O00Ooo = o0O0o00.o00oo0OO(obtainStyledAttributes2, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public CharSequence o00ooo0() {
        if (o00ooo0O() != null) {
            return o00ooo0O().o00oOOo0(this);
        }
        CharSequence o0O0oo2 = o0O0oo();
        CharSequence o00ooo02 = super.o00ooo0();
        String str = this.f3684o0O00Ooo;
        if (str == null) {
            return o00ooo02;
        }
        Object[] objArr = new Object[1];
        if (o0O0oo2 == null) {
            o0O0oo2 = "";
        }
        objArr[0] = o0O0oo2;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, o00ooo02) ? o00ooo02 : format;
    }

    public void o0O(CharSequence[] charSequenceArr) {
        this.f3686o0oO0Ooo = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    public Object o0O00(@oo0oO0 TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.o0O00O(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o0O00O(savedState.getSuperState());
        o0OO000(savedState.f3687o00oo0O0);
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public Parcelable o0O00OO() {
        this.f3735o0OoOoOO = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (o00ooooO()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f3687o00oo0O0 = o0O0ooOO();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(Object obj) {
        o0OO000(o00ooOOo((String) obj));
    }

    @Override // androidx.preference.Preference
    public void o0O0Ooo0(@o0OO00OO CharSequence charSequence) {
        super.o0O0Ooo0(charSequence);
        this.f3684o0O00Ooo = charSequence == null ? null : charSequence.toString();
    }

    public int o0O0oOoo(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3686o0oO0Ooo) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f3686o0oO0Ooo[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @o0OO00OO
    public CharSequence o0O0oo() {
        CharSequence[] charSequenceArr;
        int o0O0ooo02 = o0O0ooo0();
        if (o0O0ooo02 < 0 || (charSequenceArr = this.f3682o0O00Oo) == null) {
            return null;
        }
        return charSequenceArr[o0O0ooo02];
    }

    public CharSequence[] o0O0oo0() {
        return this.f3682o0O00Oo;
    }

    public CharSequence[] o0O0ooO0() {
        return this.f3686o0oO0Ooo;
    }

    public String o0O0ooOO() {
        return this.f3683o0O00OoO;
    }

    public void o0O0ooo(@o00oOooO.o0OoOoOo int i) {
        o0O0oooO(o00oo00O().getResources().getTextArray(i));
    }

    public final int o0O0ooo0() {
        return o0O0oOoo(this.f3683o0O00OoO);
    }

    public void o0O0oooO(CharSequence[] charSequenceArr) {
        this.f3682o0O00Oo = charSequenceArr;
    }

    public void o0O0oooo(@o00oOooO.o0OoOoOo int i) {
        o0O(o00oo00O().getResources().getTextArray(i));
    }

    public void o0OO000(String str) {
        boolean z = !TextUtils.equals(this.f3683o0O00OoO, str);
        if (z || !this.f3685o0O00o00) {
            this.f3683o0O00OoO = str;
            this.f3685o0O00o00 = true;
            o0O00oO0(str);
            if (z) {
                o0O0000o();
            }
        }
    }

    public void o0OO000o(int i) {
        CharSequence[] charSequenceArr = this.f3686o0oO0Ooo;
        if (charSequenceArr != null) {
            o0OO000(charSequenceArr[i].toString());
        }
    }
}
