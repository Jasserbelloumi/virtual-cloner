package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public static final String f3740o0O00Ooo = "PreferenceGroup";

    /* renamed from: o0O00O  reason: collision with root package name */
    public boolean f3741o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public final androidx.collection.o00ooO0<String, Long> f3742o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public final List<Preference> f3743o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public int f3744o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public boolean f3745o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public int f3746o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public final Runnable f3747o0O00OoO;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public final Handler f3748o0OoO00O;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public o00oOOoO f3749o0oO0Ooo;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f3750o00oo0O0;

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
            this.f3750o00oo0O0 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f3750o00oo0O0 = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3750o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f3742o0O00O0.clear();
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0();
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        int o00oOo0O(@oo0oO0 Preference preference);

        int o00oo0o0(@oo0oO0 String str);
    }

    public PreferenceGroup(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public PreferenceGroup(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3742o0O00O0 = new androidx.collection.o00ooO0<>();
        this.f3748o0OoO00O = new Handler(Looper.getMainLooper());
        this.f3741o0O00O = true;
        this.f3744o0O00OO = 0;
        this.f3745o0O00OOO = false;
        this.f3746o0O00Oo = Integer.MAX_VALUE;
        this.f3749o0oO0Ooo = null;
        this.f3747o0O00OoO = new o00oOOo0();
        this.f3743o0O00O0o = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceGroup, i, i2);
        int i3 = R.styleable.PreferenceGroup_orderingFromXml;
        this.f3741o0O00O = o0O0o00.o00oOOoO(obtainStyledAttributes, i3, i3, true);
        int i4 = R.styleable.PreferenceGroup_initialExpandedChildrenCount;
        if (obtainStyledAttributes.hasValue(i4)) {
            o0O0oOo(o0O0o00.o00oOooO(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void o00oOoO(@oo0oO0 Bundle bundle) {
        super.o00oOoO(bundle);
        int o0O0oO0O2 = o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0O0oO0(i).o00oOoO(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void o00oOoOo(@oo0oO0 Bundle bundle) {
        super.o00oOoOo(bundle);
        int o0O0oO0O2 = o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0O0oO0(i).o00oOoOo(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void o0O000(boolean z) {
        super.o0O000(z);
        int o0O0oO0O2 = o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0O0oO0(i).o0OoO00O(this, z);
        }
    }

    @Override // androidx.preference.Preference
    public void o0O000oo() {
        super.o0O000oo();
        this.f3745o0O00OOO = false;
        int o0O0oO0O2 = o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0O0oO0(i).o0O000oo();
        }
    }

    @Override // androidx.preference.Preference
    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.o0O00O(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3746o0O00Oo = savedState.f3750o00oo0O0;
        super.o0O00O(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @oo0oO0
    public Parcelable o0O00OO() {
        this.f3735o0OoOoOO = true;
        return new SavedState(AbsSavedState.EMPTY_STATE, this.f3746o0O00Oo);
    }

    public boolean o0O0o0oO(@oo0oO0 Preference preference) {
        long o00oOoO2;
        if (this.f3743o0O00O0o.contains(preference)) {
            return true;
        }
        if (preference.o00oo0oO() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.o00ooO0O() != null) {
                preferenceGroup = preferenceGroup.o00ooO0O();
            }
            preferenceGroup.o0O0o0oo(preference.o00oo0oO());
        }
        if (preference.o00ooO0() == Integer.MAX_VALUE) {
            if (this.f3741o0O00O) {
                int i = this.f3744o0O00OO;
                this.f3744o0O00OO = i + 1;
                preference.o0O0Oo0o(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).o0O0oOoo(this.f3741o0O00O);
            }
        }
        int binarySearch = Collections.binarySearch(this.f3743o0O00O0o, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (o0O0oOO(preference)) {
            synchronized (this) {
                this.f3743o0O00O0o.add(binarySearch, preference);
            }
            o0O000O o00ooOoO2 = o00ooOoO();
            String o00oo0oO2 = preference.o00oo0oO();
            if (o00oo0oO2 == null || !this.f3742o0O00O0.containsKey(o00oo0oO2)) {
                o00oOoO2 = o00ooOoO2.o00oOoO();
            } else {
                o00oOoO2 = this.f3742o0O00O0.get(o00oo0oO2).longValue();
                this.f3742o0O00O0.remove(o00oo0oO2);
            }
            preference.o0OoOoOO(o00ooOoO2, o00oOoO2);
            preference.o00oOOoO(this);
            if (this.f3745o0O00OOO) {
                preference.o0OoOoOo();
            }
            o0O000O();
            return true;
        }
        return false;
    }

    @o0OO00OO
    public <T extends Preference> T o0O0o0oo(@oo0oO0 CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(o00oo0oO(), charSequence)) {
                return this;
            }
            int o0O0oO0O2 = o0O0oO0O();
            for (int i = 0; i < o0O0oO0O2; i++) {
                T t2 = (T) o0O0oO0(i);
                if (TextUtils.equals(t2.o00oo0oO(), charSequence)) {
                    return t2;
                }
                if ((t2 instanceof PreferenceGroup) && (t = (T) ((PreferenceGroup) t2).o0O0o0oo(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public boolean o0O0oO() {
        return true;
    }

    @oo0oO0
    public Preference o0O0oO0(int i) {
        return this.f3743o0O00O0o.get(i);
    }

    public int o0O0oO0O() {
        return this.f3743o0O00O0o.size();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o0O0oO0o() {
        return this.f3745o0O00OOO;
    }

    public boolean o0O0oOO(@oo0oO0 Preference preference) {
        preference.o0OoO00O(this, o0O0o0());
        return true;
    }

    public boolean o0O0oOO0() {
        return this.f3741o0O00O;
    }

    public boolean o0O0oOOO(@oo0oO0 Preference preference) {
        boolean o0O0oOo02 = o0O0oOo0(preference);
        o0O000O();
        return o0O0oOo02;
    }

    public void o0O0oOo(int i) {
        if (i != Integer.MAX_VALUE) {
            o00oooOO();
        }
        this.f3746o0O00Oo = i;
    }

    public final boolean o0O0oOo0(@oo0oO0 Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.o0O00O0o();
            if (preference.o00ooO0O() == this) {
                preference.o00oOOoO(null);
            }
            remove = this.f3743o0O00O0o.remove(preference);
            if (remove) {
                String o00oo0oO2 = preference.o00oo0oO();
                if (o00oo0oO2 != null) {
                    this.f3742o0O00O0.put(o00oo0oO2, Long.valueOf(preference.o00oo0o0()));
                    this.f3748o0OoO00O.removeCallbacks(this.f3747o0O00OoO);
                    this.f3748o0OoO00O.post(this.f3747o0O00OoO);
                }
                if (this.f3745o0O00OOO) {
                    preference.o0O000oo();
                }
            }
        }
        return remove;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O0oOoO(@o0OO00OO o00oOOoO o00ooooo2) {
        this.f3749o0oO0Ooo = o00ooooo2;
    }

    public void o0O0oOoo(boolean z) {
        this.f3741o0O00O = z;
    }

    public void o0O0oo0() {
        synchronized (this) {
            Collections.sort(this.f3743o0O00O0o);
        }
    }

    public void o0O0oo00() {
        synchronized (this) {
            List<Preference> list = this.f3743o0O00O0o;
            for (int size = list.size() - 1; size >= 0; size--) {
                o0O0oOo0(list.get(0));
            }
        }
        o0O000O();
    }

    public int o0O0oo0O() {
        return this.f3746o0O00Oo;
    }

    @Override // androidx.preference.Preference
    public void o0OoOoOo() {
        o0oO0O0o();
        this.f3745o0O00OOO = true;
        int o0O0oO0O2 = o0O0oO0O();
        for (int i = 0; i < o0O0oO0O2; i++) {
            o0O0oO0(i).o0OoOoOo();
        }
    }

    public void o0oOo0O0(@oo0oO0 Preference preference) {
        o0O0o0oO(preference);
    }

    public boolean oo0oOOo(@oo0oO0 CharSequence charSequence) {
        Preference o0O0o0oo2 = o0O0o0oo(charSequence);
        if (o0O0o0oo2 == null) {
            return false;
        }
        return o0O0o0oo2.o00ooO0O().o0O0oOOO(o0O0o0oo2);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOOoO oooOO0() {
        return this.f3749o0oO0Ooo;
    }
}
