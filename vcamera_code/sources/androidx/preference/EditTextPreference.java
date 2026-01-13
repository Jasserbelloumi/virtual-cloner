package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.EditText;
import androidx.preference.Preference;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public String f3677o0O00Oo;
    @o0OO00OO

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public o00oOOo0 f3678o0oO0Ooo;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f3679o00oo0O0;

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
            this.f3679o00oo0O0 = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3679o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(@oo0oO0 EditText editText);
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Preference.o00oo00O<EditTextPreference> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static o00oOOoO f3680o00oOOo0;

        @oo0oO0
        public static o00oOOoO o00oOOoO() {
            if (f3680o00oOOo0 == null) {
                f3680o00oOOo0 = new o00oOOoO();
            }
            return f3680o00oOOo0;
        }

        @Override // androidx.preference.Preference.o00oo00O
        @o0OO00OO
        /* renamed from: o00oOo00 */
        public CharSequence o00oOOo0(@oo0oO0 EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.o0O0oo0()) ? editTextPreference.o00oo00O().getString(R.string.not_set) : editTextPreference.o0O0oo0();
        }
    }

    public EditTextPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public EditTextPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.editTextPreferenceStyle, 16842898), 0);
    }

    public EditTextPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextPreference, i, i2);
        int i3 = R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (o0O0o00.o00oOOoO(obtainStyledAttributes, i3, i3, false)) {
            o0O0Ooo(o00oOOoO.o00oOOoO());
        }
        obtainStyledAttributes.recycle();
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
        o0O0ooO0(savedState.f3679o00oo0O0);
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
        savedState.f3679o00oo0O0 = o0O0oo0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(Object obj) {
        o0O0ooO0(o00ooOOo((String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean o0O0o0() {
        return TextUtils.isEmpty(this.f3677o0O00Oo) || super.o0O0o0();
    }

    @o0OO00OO
    public o00oOOo0 o0O0oOoo() {
        return this.f3678o0oO0Ooo;
    }

    public void o0O0oo(@o0OO00OO o00oOOo0 o00oooo02) {
        this.f3678o0oO0Ooo = o00oooo02;
    }

    @o0OO00OO
    public String o0O0oo0() {
        return this.f3677o0O00Oo;
    }

    public void o0O0ooO0(@o0OO00OO String str) {
        boolean o0O0o02 = o0O0o0();
        this.f3677o0O00Oo = str;
        o0O00oO0(str);
        boolean o0O0o03 = o0O0o0();
        if (o0O0o03 != o0O0o02) {
            o0O000(o0O0o03);
        }
        o0O0000o();
    }
}
