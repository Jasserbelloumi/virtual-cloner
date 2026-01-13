package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.o0O000O;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: o0O00  reason: collision with root package name */
    public static final String f3693o0O00 = "Preference";

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f3694o0O000oo = Integer.MAX_VALUE;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3695o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f3696o00oo;
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O000O f3697o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f3698o00oo0O0;
    @o0OO00OO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oo0O0 f3699o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f3700o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public long f3701o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oOo00 f3702o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public Drawable f3703o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public CharSequence f3704o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f3705o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public CharSequence f3706o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f3707o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public Intent f3708o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public String f3709o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public String f3710o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f3711o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public Bundle f3712o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f3713o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f3714o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public String f3715o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f3716o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public Object f3717o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public boolean f3718o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public boolean f3719o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public boolean f3720o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f3721o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public boolean f3722o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public boolean f3723o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public boolean f3724o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public boolean f3725o00ooooo;

    /* renamed from: o0O000  reason: collision with root package name */
    public o00oOOoO f3726o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public boolean f3727o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public int f3728o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public int f3729o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public List<Preference> f3730o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public boolean f3731o0O000Oo;

    /* renamed from: o0O000o  reason: collision with root package name */
    public o00oo00O f3732o0O000o;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public o00oOoO f3733o0O000o0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOo0O f3734o0O0o;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public boolean f3735o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public PreferenceGroup f3736o0OoOoOo;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public final View.OnClickListener f3737o0ooOoOO;

    /* loaded from: classes.dex */
    public static class BaseSavedState extends AbsSavedState {
        @oo0oO0
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new o00oOOo0();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.o0O00Ooo(view);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOoO0(@oo0oO0 Preference preference);

        void o00oOooO(@oo0oO0 Preference preference);

        void o00oOooo(@oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        boolean o00oOOo0(@oo0oO0 Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        boolean o00oOOo0(@oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public static class o00oOoO implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Preference f3739o00oo0O0;

        public o00oOoO(@oo0oO0 Preference preference) {
            this.f3739o00oo0O0 = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence o00ooo02 = this.f3739o00oo0O0.o00ooo0();
            if (!this.f3739o00oo0O0.o00oooOo() || TextUtils.isEmpty(o00ooo02)) {
                return;
            }
            contextMenu.setHeaderTitle(o00ooo02);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence o00ooo02 = this.f3739o00oo0O0.o00ooo0();
            ((ClipboardManager) this.f3739o00oo0O0.o00oo00O().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(Preference.f3693o0O00, o00ooo02));
            Toast.makeText(this.f3739o00oo0O0.o00oo00O(), this.f3739o00oo0O0.o00oo00O().getString(R.string.preference_copied, o00ooo02), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo00O<T extends Preference> {
        @o0OO00OO
        CharSequence o00oOOo0(@oo0oO0 T t);
    }

    public Preference(@oo0oO0 Context context) {
        this(context, null);
    }

    public Preference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.preferenceStyle, 16842894), 0);
    }

    public Preference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d4, code lost:
        if (r6.hasValue(r7) != false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Preference(@o00oOooO.oo0oO0 android.content.Context r6, @o00oOooO.o0OO00OO android.util.AttributeSet r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final boolean o0() {
        if (o0O0000O() && o00ooOoO() != null) {
            if (this == o00ooOoO().o00oo0()) {
                return true;
            }
            PreferenceGroup o00ooO0O2 = o00ooO0O();
            if (o00ooO0O2 == null) {
                return false;
            }
            return o00ooO0O2.o0();
        }
        return false;
    }

    public void o00oOOoO(@o0OO00OO PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f3736o0OoOoOo != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f3736o0OoOoOo = preferenceGroup;
    }

    public final void o00oOo0O() {
        this.f3731o0O000Oo = false;
    }

    @Override // java.lang.Comparable
    /* renamed from: o00oOo0o */
    public int compareTo(@oo0oO0 Preference preference) {
        int i = this.f3696o00oo;
        int i2 = preference.f3696o00oo;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f3704o00ooO0;
        CharSequence charSequence2 = preference.f3704o00ooO0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3704o00ooO0.toString());
    }

    public void o00oOoO(@oo0oO0 Bundle bundle) {
        Parcelable parcelable;
        if (!o00oooOO() || (parcelable = bundle.getParcelable(this.f3709o00ooOO0)) == null) {
            return;
        }
        this.f3735o0OoOoOO = false;
        o0O00O(parcelable);
        if (!this.f3735o0OoOoOO) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void o00oOoOo(@oo0oO0 Bundle bundle) {
        if (o00oooOO()) {
            this.f3735o0OoOoOO = false;
            Parcelable o0O00OO2 = o0O00OO();
            if (!this.f3735o0OoOoOO) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (o0O00OO2 != null) {
                bundle.putParcelable(this.f3709o00ooOO0, o0O00OO2);
            }
        }
    }

    public final void o00oOoo0() {
        Object obj;
        boolean z = true;
        if (o00ooOo() != null) {
            o0O00Oo(true, this.f3717o00ooo0O);
            return;
        }
        if (o0O0o0O() && o00ooOoo().contains(this.f3709o00ooOO0)) {
            obj = null;
        } else {
            obj = this.f3717o00ooo0O;
            if (obj == null) {
                return;
            }
            z = false;
        }
        o0O00Oo(z, obj);
    }

    public boolean o00oOooO(Object obj) {
        o00oOo00 o00ooo002 = this.f3702o00oo0oO;
        return o00ooo002 == null || o00ooo002.o00oOOo0(this, obj);
    }

    @o0OO00OO
    public <T extends Preference> T o00oOooo(@oo0oO0 String str) {
        o0O000O o0o000o = this.f3697o00oo0O;
        if (o0o000o == null) {
            return null;
        }
        return (T) o0o000o.o00oOOoO(str);
    }

    @o0OO00OO
    public o00oOo00 o00oo() {
        return this.f3702o00oo0oO;
    }

    @o0OO00OO
    public String o00oo0() {
        return this.f3715o00ooo0;
    }

    @oo0oO0
    public Context o00oo00O() {
        return this.f3698o00oo0O0;
    }

    @o0OO00OO
    public String o00oo0O() {
        return this.f3710o00ooOOo;
    }

    @oo0oO0
    public StringBuilder o00oo0O0() {
        StringBuilder sb = new StringBuilder();
        CharSequence o00ooo0o2 = o00ooo0o();
        if (!TextUtils.isEmpty(o00ooo0o2)) {
            sb.append(o00ooo0o2);
            sb.append(' ');
        }
        CharSequence o00ooo02 = o00ooo0();
        if (!TextUtils.isEmpty(o00ooo02)) {
            sb.append(o00ooo02);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    @oo0oO0
    public Bundle o00oo0OO() {
        if (this.f3712o00ooOo0 == null) {
            this.f3712o00ooOo0 = new Bundle();
        }
        return this.f3712o00ooOo0;
    }

    @o0OO00OO
    public Drawable o00oo0Oo() {
        int i;
        if (this.f3703o00ooO == null && (i = this.f3707o00ooO0o) != 0) {
            this.f3703o00ooO = o00oOo0o.o00oOo00.o00oOOoO(this.f3698o00oo0O0, i);
        }
        return this.f3703o00ooO;
    }

    @o0OO00OO
    public Intent o00oo0o() {
        return this.f3708o00ooOO;
    }

    public long o00oo0o0() {
        return this.f3701o00oo0o0;
    }

    public String o00oo0oO() {
        return this.f3709o00ooOO0;
    }

    public float o00ooO(float f) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOOoO(this.f3709o00ooOO0, f) : this.f3697o00oo0O.o00oo0OO().getFloat(this.f3709o00ooOO0, f);
        }
        return f;
    }

    public int o00ooO0() {
        return this.f3696o00oo;
    }

    @o0OO00OO
    public o00oOo0O o00ooO00() {
        return this.f3734o0O0o;
    }

    @o0OO00OO
    public PreferenceGroup o00ooO0O() {
        return this.f3736o0OoOoOo;
    }

    public boolean o00ooO0o(boolean z) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOOo0(this.f3709o00ooOO0, z) : this.f3697o00oo0O.o00oo0OO().getBoolean(this.f3709o00ooOO0, z);
        }
        return z;
    }

    public long o00ooOO(long j) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOooO(this.f3709o00ooOO0, j) : this.f3697o00oo0O.o00oo0OO().getLong(this.f3709o00ooOO0, j);
        }
        return j;
    }

    public int o00ooOO0(int i) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOo00(this.f3709o00ooOO0, i) : this.f3697o00oo0O.o00oo0OO().getInt(this.f3709o00ooOO0, i);
        }
        return i;
    }

    public String o00ooOOo(String str) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOo0O(this.f3709o00ooOO0, str) : this.f3697o00oo0O.o00oo0OO().getString(this.f3709o00ooOO0, str);
        }
        return str;
    }

    @o0OO00OO
    public o00oo0O0 o00ooOo() {
        o00oo0O0 o00oo0o02 = this.f3699o00oo0Oo;
        if (o00oo0o02 != null) {
            return o00oo0o02;
        }
        o0O000O o0o000o = this.f3697o00oo0O;
        if (o0o000o != null) {
            return o0o000o.o00oo00O();
        }
        return null;
    }

    public Set<String> o00ooOo0(Set<String> set) {
        if (o0O0o0O()) {
            o00oo0O0 o00ooOo2 = o00ooOo();
            return o00ooOo2 != null ? o00ooOo2.o00oOo0o(this.f3709o00ooOO0, set) : this.f3697o00oo0O.o00oo0OO().getStringSet(this.f3709o00ooOO0, set);
        }
        return set;
    }

    public o0O000O o00ooOoO() {
        return this.f3697o00oo0O;
    }

    @o0OO00OO
    public SharedPreferences o00ooOoo() {
        if (this.f3697o00oo0O == null || o00ooOo() != null) {
            return null;
        }
        return this.f3697o00oo0O.o00oo0OO();
    }

    @o0OO00OO
    public CharSequence o00ooo0() {
        return o00ooo0O() != null ? o00ooo0O().o00oOOo0(this) : this.f3706o00ooO0O;
    }

    public boolean o00ooo00() {
        return this.f3727o0O00000;
    }

    @o0OO00OO
    public final o00oo00O o00ooo0O() {
        return this.f3732o0O000o;
    }

    @o0OO00OO
    public CharSequence o00ooo0o() {
        return this.f3704o00ooO0;
    }

    public final int o00oooO() {
        return this.f3729o0O0000o;
    }

    public boolean o00oooOO() {
        return !TextUtils.isEmpty(this.f3709o00ooOO0);
    }

    public boolean o00oooOo() {
        return this.f3695o0;
    }

    public boolean o00oooo() {
        return this.f3725o00ooooo;
    }

    public boolean o00oooo0() {
        return this.f3711o00ooOo && this.f3718o00ooo0o && this.f3719o00oooO;
    }

    public boolean o00ooooO() {
        return this.f3716o00ooo00;
    }

    public boolean o00ooooo() {
        return this.f3713o00ooOoO;
    }

    @o0OO00OO
    public Object o0O00(@oo0oO0 TypedArray typedArray, int i) {
        return null;
    }

    public void o0O000(boolean z) {
        List<Preference> list = this.f3730o0O000O;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).o0ooOoOO(this, z);
        }
    }

    public boolean o0O00000() {
        return this.f3724o00ooooO;
    }

    public final boolean o0O0000O() {
        return this.f3720o00oooOO;
    }

    public void o0O0000o() {
        o00oOOoO o00ooooo2 = this.f3726o0O000;
        if (o00ooooo2 != null) {
            o00ooooo2.o00oOoO0(this);
        }
    }

    public void o0O000O() {
        o00oOOoO o00ooooo2 = this.f3726o0O000;
        if (o00ooooo2 != null) {
            o00ooooo2.o00oOooo(this);
        }
    }

    public void o0O000Oo(@oo0oO0 o0O000O o0o000o) {
        this.f3697o00oo0O = o0o000o;
        if (!this.f3700o00oo0o) {
            this.f3701o00oo0o0 = o0o000o.o00oOoO();
        }
        o00oOoo0();
    }

    public void o0O000o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0O000o0(@o00oOooO.oo0oO0 androidx.preference.o0O000Oo r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.o0O000o0(androidx.preference.o0O000Oo):void");
    }

    public void o0O000oo() {
        o0O0o0Oo();
        this.f3731o0O000Oo = true;
    }

    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        this.f3735o0OoOoOO = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @o0O00O0
    @Deprecated
    public void o0O00O0(o0O00.o00oo0O o00oo0o2) {
    }

    public void o0O00O0o() {
        o0O0o0Oo();
    }

    @o0OO00OO
    public Parcelable o0O00OO() {
        this.f3735o0OoOoOO = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void o0O00OOO(@o0OO00OO Object obj) {
    }

    @Deprecated
    public void o0O00Oo(boolean z, Object obj) {
        o0O00OOO(obj);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O00OoO() {
        o0O000O.o00oOo00 o00oOoo02;
        if (o00oooo0() && o00ooooo()) {
            o0O000o();
            o00oOo0O o00ooo0o2 = this.f3734o0O0o;
            if (o00ooo0o2 == null || !o00ooo0o2.o00oOOo0(this)) {
                o0O000O o00ooOoO2 = o00ooOoO();
                if ((o00ooOoO2 == null || (o00oOoo02 = o00ooOoO2.o00oOoo0()) == null || !o00oOoo02.o00oOo0O(this)) && this.f3708o00ooOO != null) {
                    o00oo00O().startActivity(this.f3708o00ooOO);
                }
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O00Ooo(@oo0oO0 View view) {
        o0O00OoO();
    }

    public boolean o0O00o(long j) {
        if (o0O0o0O()) {
            if (j == o00ooOO(~j)) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOoOo(this.f3709o00ooOO0, j);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putLong(this.f3709o00ooOO0, j);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public boolean o0O00o00(boolean z) {
        if (o0O0o0O()) {
            if (z == o00ooO0o(!z)) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOoO0(this.f3709o00ooOO0, z);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putBoolean(this.f3709o00ooOO0, z);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public boolean o0O00o0O(float f) {
        if (o0O0o0O()) {
            if (f == o00ooO(Float.NaN)) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOoO(this.f3709o00ooOO0, f);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putFloat(this.f3709o00ooOO0, f);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public boolean o0O00o0o(int i) {
        if (o0O0o0O()) {
            if (i == o00ooOO0(~i)) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOoOO(this.f3709o00ooOO0, i);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putInt(this.f3709o00ooOO0, i);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public boolean o0O00oO0(String str) {
        if (o0O0o0O()) {
            if (TextUtils.equals(str, o00ooOOo(null))) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOoo0(this.f3709o00ooOO0, str);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putString(this.f3709o00ooOO0, str);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public boolean o0O0O0O(Set<String> set) {
        if (o0O0o0O()) {
            if (set.equals(o00ooOo0(null))) {
                return true;
            }
            o00oo0O0 o00ooOo2 = o00ooOo();
            if (o00ooOo2 != null) {
                o00ooOo2.o00oOooo(this.f3709o00ooOO0, set);
            } else {
                SharedPreferences.Editor o00oOoO02 = this.f3697o00oo0O.o00oOoO0();
                o00oOoO02.putStringSet(this.f3709o00ooOO0, set);
                o0O0o0OO(o00oOoO02);
            }
            return true;
        }
        return false;
    }

    public void o0O0O0Oo() {
        if (TextUtils.isEmpty(this.f3709o00ooOO0)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f3714o00ooOoo = true;
    }

    public void o0O0O0o(@oo0oO0 Bundle bundle) {
        o00oOoOo(bundle);
    }

    public void o0O0O0o0(@oo0oO0 Bundle bundle) {
        o00oOoO(bundle);
    }

    public void o0O0O0oO(boolean z) {
        if (this.f3695o0 != z) {
            this.f3695o0 = z;
            o0O0000o();
        }
    }

    public void o0O0O0oo(Object obj) {
        this.f3717o00ooo0O = obj;
    }

    public void o0O0OO(@o0OO00OO String str) {
        this.f3710o00ooOOo = str;
    }

    public void o0O0OO0(boolean z) {
        if (this.f3711o00ooOo != z) {
            this.f3711o00ooOo = z;
            o0O000(o0O0o0());
            o0O0000o();
        }
    }

    public final void o0O0OO0O(@oo0oO0 View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                o0O0OO0O(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void o0O0OOO(@o0OO00OO Drawable drawable) {
        if (this.f3703o00ooO != drawable) {
            this.f3703o00ooO = drawable;
            this.f3707o00ooO0o = 0;
            o0O0000o();
        }
    }

    public void o0O0OOO0(int i) {
        o0O0OOO(o00oOo0o.o00oOo00.o00oOOoO(this.f3698o00oo0O0, i));
        this.f3707o00ooO0o = i;
    }

    public void o0O0OOOo(boolean z) {
        if (this.f3725o00ooooo != z) {
            this.f3725o00ooooo = z;
            o0O0000o();
        }
    }

    public void o0O0OOo(@o0OO00OO Intent intent) {
        this.f3708o00ooOO = intent;
    }

    public void o0O0OOoO(String str) {
        this.f3709o00ooOO0 = str;
        if (!this.f3714o00ooOoo || o00oooOO()) {
            return;
        }
        o0O0O0Oo();
    }

    public void o0O0OOoo(int i) {
        this.f3728o0O0000O = i;
    }

    public void o0O0Oo(boolean z) {
        this.f3716o00ooo00 = z;
    }

    public void o0O0Oo0(@o0OO00OO o00oOo00 o00ooo002) {
        this.f3702o00oo0oO = o00ooo002;
    }

    public void o0O0Oo0O(@o0OO00OO o00oOo0O o00ooo0o2) {
        this.f3734o0O0o = o00ooo0o2;
    }

    public void o0O0Oo0o(int i) {
        if (i != this.f3696o00oo) {
            this.f3696o00oo = i;
            o0O000O();
        }
    }

    public void o0O0OoO(boolean z) {
        this.f3722o00oooo = true;
        this.f3724o00ooooO = z;
    }

    public void o0O0OoO0(boolean z) {
        if (this.f3713o00ooOoO != z) {
            this.f3713o00ooOoO = z;
            o0O0000o();
        }
    }

    public void o0O0OoOo(int i) {
        o0O0Ooo0(this.f3698o00oo0O0.getString(i));
    }

    public final void o0O0Ooo(@o0OO00OO o00oo00O o00oo00o) {
        this.f3732o0O000o = o00oo00o;
        o0O0000o();
    }

    public void o0O0Ooo0(@o0OO00OO CharSequence charSequence) {
        if (o00ooo0O() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f3706o00ooO0O, charSequence)) {
            return;
        }
        this.f3706o00ooO0O = charSequence;
        o0O0000o();
    }

    public void o0O0OooO(int i) {
        o0O0o000(this.f3698o00oo0O0.getString(i));
    }

    public void o0O0Oooo(@o0OO00OO o00oo0O0 o00oo0o02) {
        this.f3699o00oo0Oo = o00oo0o02;
    }

    public final int o0O0o() {
        return this.f3728o0O0000O;
    }

    public boolean o0O0o0() {
        return !o00oooo0();
    }

    public void o0O0o00(int i) {
        this.f3705o00ooO00 = i;
    }

    public void o0O0o000(@o0OO00OO CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3704o00ooO0)) {
            return;
        }
        this.f3704o00ooO0 = charSequence;
        o0O0000o();
    }

    public final void o0O0o00O(boolean z) {
        if (this.f3720o00oooOO != z) {
            this.f3720o00oooOO = z;
            o00oOOoO o00ooooo2 = this.f3726o0O000;
            if (o00ooooo2 != null) {
                o00ooooo2.o00oOooO(this);
            }
        }
    }

    public void o0O0o00o(int i) {
        this.f3729o0O0000o = i;
    }

    public boolean o0O0o0O() {
        return this.f3697o00oo0O != null && o00ooooO() && o00oooOO();
    }

    public final void o0O0o0OO(@oo0oO0 SharedPreferences.Editor editor) {
        if (this.f3697o00oo0O.o00ooOoO()) {
            editor.apply();
        }
    }

    public final void o0O0o0Oo() {
        Preference o00oOooo2;
        String str = this.f3715o00ooo0;
        if (str == null || (o00oOooo2 = o00oOooo(str)) == null) {
            return;
        }
        o00oOooo2.o0O0o0o0(this);
    }

    public final boolean o0O0o0o() {
        return this.f3731o0O000Oo;
    }

    public final void o0O0o0o0(Preference preference) {
        List<Preference> list = this.f3730o0O000O;
        if (list != null) {
            list.remove(preference);
        }
    }

    public final void o0O0oo0o(Preference preference) {
        if (this.f3730o0O000O == null) {
            this.f3730o0O000O = new ArrayList();
        }
        this.f3730o0O000O.add(preference);
        preference.o0ooOoOO(this, o0O0o0());
    }

    public void o0OoO00O(@oo0oO0 Preference preference, boolean z) {
        if (this.f3719o00oooO == z) {
            this.f3719o00oooO = !z;
            o0O000(o0O0o0());
            o0O0000o();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0OoOoOO(@oo0oO0 o0O000O o0o000o, long j) {
        this.f3701o00oo0o0 = j;
        this.f3700o00oo0o = true;
        try {
            o0O000Oo(o0o000o);
        } finally {
            this.f3700o00oo0o = false;
        }
    }

    public void o0OoOoOo() {
        o0oO0O0o();
    }

    public final void o0OooO0(@o0OO00OO o00oOOoO o00ooooo2) {
        this.f3726o0O000 = o00ooooo2;
    }

    public final void o0oO0O0o() {
        if (TextUtils.isEmpty(this.f3715o00ooo0)) {
            return;
        }
        Preference o00oOooo2 = o00oOooo(this.f3715o00ooo0);
        if (o00oOooo2 != null) {
            o00oOooo2.o0O0oo0o(this);
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Dependency \"");
        o00oOOo02.append(this.f3715o00ooo0);
        o00oOOo02.append("\" not found for preference \"");
        o00oOOo02.append(this.f3709o00ooOO0);
        o00oOOo02.append("\" (title: \"");
        o00oOOo02.append((Object) this.f3704o00ooO0);
        o00oOOo02.append("\"");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @o0OO00OO
    public Bundle o0oO0Ooo() {
        return this.f3712o00ooOo0;
    }

    public void o0ooO(@o0OO00OO String str) {
        o0O0o0Oo();
        this.f3715o00ooo0 = str;
        o0oO0O0o();
    }

    public void o0ooOoOO(@oo0oO0 Preference preference, boolean z) {
        if (this.f3718o00ooo0o == z) {
            this.f3718o00ooo0o = !z;
            o0O000(o0O0o0());
            o0O0000o();
        }
    }

    public void oo0OOoo(boolean z) {
        if (this.f3727o0O00000 != z) {
            this.f3727o0O00000 = z;
            o0O0000o();
        }
    }

    @oo0oO0
    public String toString() {
        return o00oo0O0().toString();
    }
}
