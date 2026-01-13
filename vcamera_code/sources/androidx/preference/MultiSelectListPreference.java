package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public CharSequence[] f3689o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public Set<String> f3690o0O00OoO;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public CharSequence[] f3691o0oO0Ooo;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Set<String> f3692o00oo0O0;

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
            int readInt = parcel.readInt();
            this.f3692o00oo0O0 = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f3692o00oo0O0, strArr);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3692o00oo0O0.size());
            Set<String> set = this.f3692o00oo0O0;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public MultiSelectListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    public MultiSelectListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3690o0O00OoO = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MultiSelectListPreference, i, i2);
        this.f3689o0O00Oo = o0O0o00.o00oo0O(obtainStyledAttributes, R.styleable.MultiSelectListPreference_entries, R.styleable.MultiSelectListPreference_android_entries);
        this.f3691o0oO0Ooo = o0O0o00.o00oo0O(obtainStyledAttributes, R.styleable.MultiSelectListPreference_entryValues, R.styleable.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    public void o0O(Set<String> set) {
        this.f3690o0O00OoO.clear();
        this.f3690o0O00OoO.addAll(set);
        o0O0O0O(set);
        o0O0000o();
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public Object o0O00(@oo0oO0 TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.o0O00O(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o0O00O(savedState.getSuperState());
        o0O(savedState.f3692o00oo0O0);
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
        savedState.f3692o00oo0O0 = o0O0ooOO();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(Object obj) {
        o0O(o00ooOo0((Set) obj));
    }

    public int o0O0oOoo(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3691o0oO0Ooo) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f3691o0oO0Ooo[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] o0O0oo() {
        return this.f3691o0oO0Ooo;
    }

    public CharSequence[] o0O0oo0() {
        return this.f3689o0O00Oo;
    }

    public boolean[] o0O0ooO0() {
        CharSequence[] charSequenceArr = this.f3691o0oO0Ooo;
        int length = charSequenceArr.length;
        Set<String> set = this.f3690o0O00OoO;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = set.contains(charSequenceArr[i].toString());
        }
        return zArr;
    }

    public Set<String> o0O0ooOO() {
        return this.f3690o0O00OoO;
    }

    public void o0O0ooo(CharSequence[] charSequenceArr) {
        this.f3689o0O00Oo = charSequenceArr;
    }

    public void o0O0ooo0(@o00oOooO.o0OoOoOo int i) {
        o0O0ooo(o00oo00O().getResources().getTextArray(i));
    }

    public void o0O0oooO(@o00oOooO.o0OoOoOo int i) {
        o0O0oooo(o00oo00O().getResources().getTextArray(i));
    }

    public void o0O0oooo(CharSequence[] charSequenceArr) {
        this.f3691o0oO0Ooo = charSequenceArr;
    }
}
