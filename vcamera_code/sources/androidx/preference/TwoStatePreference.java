package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: o0O00O  reason: collision with root package name */
    public boolean f3779o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public boolean f3780o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public CharSequence f3781o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public boolean f3782o0O00OO;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public CharSequence f3783o0OoO00O;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f3784o00oo0O0;

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
            this.f3784o00oo0O0 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3784o00oo0O0 ? 1 : 0);
        }
    }

    public TwoStatePreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public TwoStatePreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public Object o0O00(@oo0oO0 TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public void o0O000o() {
        boolean z = !o0O0oo0O();
        if (o00oOooO(Boolean.valueOf(z))) {
            oooOO0(z);
        }
    }

    @Override // androidx.preference.Preference
    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.o0O00O(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o0O00O(savedState.getSuperState());
        oooOO0(savedState.f3784o00oo0O0);
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
        savedState.f3784o00oo0O0 = o0O0oo0O();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        oooOO0(o00ooO0o(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public boolean o0O0o0() {
        return (this.f3782o0O00OO ? this.f3780o0O00O0 : !this.f3780o0O00O0) || super.o0O0o0();
    }

    @o0OO00OO
    public CharSequence o0O0o0oO() {
        return this.f3781o0O00O0o;
    }

    @o0OO00OO
    public CharSequence o0O0o0oo() {
        return this.f3783o0OoO00O;
    }

    public void o0O0oO(int i) {
        o0O0oOO0(o00oo00O().getString(i));
    }

    public void o0O0oO0(boolean z) {
        this.f3782o0O00OO = z;
    }

    public void o0O0oO0O(int i) {
        o0O0oO0o(o00oo00O().getString(i));
    }

    public void o0O0oO0o(@o0OO00OO CharSequence charSequence) {
        this.f3781o0O00O0o = charSequence;
        if (o0O0oo0O()) {
            return;
        }
        o0O0000o();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @o00oOooO.o0OO0oO({o00oOooO.o0OO0oO.o00oOOo0.LIBRARY})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0O0oOO(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3780o0O00O0
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.f3783o0OoO00O
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.f3783o0OoO00O
        L17:
            r5.setText(r0)
            r0 = r2
            goto L2b
        L1c:
            boolean r1 = r4.f3780o0O00O0
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.f3781o0O00O0o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.f3781o0O00O0o
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.o00ooo0()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = r2
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L41
        L40:
            r2 = r1
        L41:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4a
            r5.setVisibility(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.o0O0oOO(android.view.View):void");
    }

    public void o0O0oOO0(@o0OO00OO CharSequence charSequence) {
        this.f3783o0OoO00O = charSequence;
        if (o0O0oo0O()) {
            o0O0000o();
        }
    }

    public void o0O0oo00(@oo0oO0 o0O000Oo o0o000oo) {
        o0O0oOO(o0o000oo.o00oOOoO(16908304));
    }

    public boolean o0O0oo0O() {
        return this.f3780o0O00O0;
    }

    public boolean o0oOo0O0() {
        return this.f3782o0O00OO;
    }

    public void oooOO0(boolean z) {
        boolean z2 = this.f3780o0O00O0 != z;
        if (z2 || !this.f3779o0O00O) {
            this.f3780o0O00O0 = z;
            this.f3779o0O00O = true;
            o0O00o00(z);
            if (z2) {
                o0O000(o0O0o0());
                o0O0000o();
            }
        }
    }

    public TwoStatePreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
