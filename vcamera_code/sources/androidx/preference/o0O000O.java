package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O000O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f3934o00oo0O = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f3935o00oo0O0 = 0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f3936o00oo0OO = "_has_set_default_values";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f3937o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public SharedPreferences f3939o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public SharedPreferences.Editor f3940o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f3941o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f3942o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public String f3943o00oOoO0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public PreferenceScreen f3945o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public o00oOo0O f3946o00oOoo0;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oo0O0 f3947o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public o00oOo00 f3948o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public o00oOOoO f3949o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oOOo0 f3950o00oo00O;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f3938o00oOOoO = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f3944o00oOoOO = 0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOooO(@oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(@oo0oO0 PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        boolean o00oOo0O(@oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O {
        public abstract boolean o00oOOo0(@oo0oO0 Preference preference, @oo0oO0 Preference preference2);

        public abstract boolean o00oOOoO(@oo0oO0 Preference preference, @oo0oO0 Preference preference2);
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo0O {
        @Override // androidx.preference.o0O000O.o00oOo0O
        public boolean o00oOOo0(@oo0oO0 Preference preference, @oo0oO0 Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if (!(preference == preference2 && preference.o0O0o0o()) && TextUtils.equals(preference.o00ooo0o(), preference2.o00ooo0o()) && TextUtils.equals(preference.o00ooo0(), preference2.o00ooo0())) {
                Drawable o00oo0Oo2 = preference.o00oo0Oo();
                Drawable o00oo0Oo3 = preference2.o00oo0Oo();
                if ((o00oo0Oo2 == o00oo0Oo3 || (o00oo0Oo2 != null && o00oo0Oo2.equals(o00oo0Oo3))) && preference.o00oooo0() == preference2.o00oooo0() && preference.o00ooooo() == preference2.o00ooooo()) {
                    if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).o0O0oo0O() == ((TwoStatePreference) preference2).o0O0oo0O()) {
                        return !(preference instanceof DropDownPreference) || preference == preference2;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.preference.o0O000O.o00oOo0O
        public boolean o00oOOoO(@oo0oO0 Preference preference, @oo0oO0 Preference preference2) {
            return preference.o00oo0o0() == preference2.o00oo0o0();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o0O000O(@oo0oO0 Context context) {
        this.f3937o00oOOo0 = context;
        o00ooOOo(o00oOo0o(context));
    }

    public static int o00oOo0O() {
        return 0;
    }

    public static String o00oOo0o(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static SharedPreferences o00oOooO(@oo0oO0 Context context) {
        return context.getSharedPreferences(o00oOo0o(context), 0);
    }

    public static void o00oo0oO(@oo0oO0 Context context, int i, boolean z) {
        o0O0o(context, o00oOo0o(context), 0, i, z);
    }

    public static void o0O0o(@oo0oO0 Context context, String str, int i, int i2, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f3936o00oo0OO, 0);
        if (z || !sharedPreferences.getBoolean(f3936o00oo0OO, false)) {
            o0O000O o0o000o = new o0O000O(context);
            o0o000o.o00ooOOo(str);
            o0o000o.o00ooOO(i);
            o0o000o.o00oo0Oo(context, i2, null);
            sharedPreferences.edit().putBoolean(f3936o00oo0OO, true).apply();
        }
    }

    @oo0oO0
    public PreferenceScreen o00oOOo0(@oo0oO0 Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.o0O000Oo(this);
        return preferenceScreen;
    }

    @o0OO00OO
    public <T extends Preference> T o00oOOoO(@oo0oO0 CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f3945o00oOoOo;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.o0O0o0oo(charSequence);
    }

    @oo0oO0
    public Context o00oOo00() {
        return this.f3937o00oOOo0;
    }

    public long o00oOoO() {
        long j;
        synchronized (this) {
            j = this.f3938o00oOOoO;
            this.f3938o00oOOoO = 1 + j;
        }
        return j;
    }

    @o0OO00OO
    public SharedPreferences.Editor o00oOoO0() {
        if (this.f3947o00oOooO != null) {
            return null;
        }
        if (this.f3941o00oOo0o) {
            if (this.f3940o00oOo0O == null) {
                this.f3940o00oOo0O = o00oo0OO().edit();
            }
            return this.f3940o00oOo0O;
        }
        return o00oo0OO().edit();
    }

    @o0OO00OO
    public o00oOOo0 o00oOoOO() {
        return this.f3950o00oo00O;
    }

    @o0OO00OO
    public o00oOOoO o00oOoOo() {
        return this.f3949o00oo0;
    }

    @o0OO00OO
    public o00oOo00 o00oOoo0() {
        return this.f3948o00oOooo;
    }

    @o0OO00OO
    public o00oOo0O o00oOooo() {
        return this.f3946o00oOoo0;
    }

    public final void o00oo(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f3940o00oOo0O) != null) {
            editor.apply();
        }
        this.f3941o00oOo0o = z;
    }

    public PreferenceScreen o00oo0() {
        return this.f3945o00oOoOo;
    }

    @o0OO00OO
    public o00oo0O0 o00oo00O() {
        return this.f3947o00oOooO;
    }

    public String o00oo0O() {
        return this.f3943o00oOoO0;
    }

    public int o00oo0O0() {
        return this.f3942o00oOoO;
    }

    @o0OO00OO
    public SharedPreferences o00oo0OO() {
        if (o00oo00O() != null) {
            return null;
        }
        if (this.f3939o00oOo00 == null) {
            this.f3939o00oOo00 = (this.f3944o00oOoOO != 1 ? this.f3937o00oOOo0 : o00ooo0.o0.createDeviceProtectedStorageContext(this.f3937o00oOOo0)).getSharedPreferences(this.f3943o00oOoO0, this.f3942o00oOoO);
        }
        return this.f3939o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen o00oo0Oo(@oo0oO0 Context context, int i, @o0OO00OO PreferenceScreen preferenceScreen) {
        o00oo(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new o0O000(context, this).o00oOo0O(i, preferenceScreen);
        preferenceScreen2.o0O000Oo(this);
        o00oo(false);
        return preferenceScreen2;
    }

    public boolean o00oo0o() {
        return this.f3944o00oOoOO == 1;
    }

    public boolean o00oo0o0() {
        return this.f3944o00oOoOO == 0;
    }

    public void o00ooO(@o0OO00OO o00oo0O0 o00oo0o02) {
        this.f3947o00oOooO = o00oo0o02;
    }

    public void o00ooO0(@o0OO00OO o00oOOoO o00ooooo2) {
        this.f3949o00oo0 = o00ooooo2;
    }

    public void o00ooO00(@o0OO00OO o00oOOo0 o00oooo02) {
        this.f3950o00oo00O = o00oooo02;
    }

    public void o00ooO0O(@o0OO00OO o00oOo00 o00ooo002) {
        this.f3948o00oOooo = o00ooo002;
    }

    public void o00ooO0o(@o0OO00OO o00oOo0O o00ooo0o2) {
        this.f3946o00oOoo0 = o00ooo0o2;
    }

    public void o00ooOO(int i) {
        this.f3942o00oOoO = i;
        this.f3939o00oOo00 = null;
    }

    public boolean o00ooOO0(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f3945o00oOoOo;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.o0O000oo();
            }
            this.f3945o00oOoOo = preferenceScreen;
            return true;
        }
        return false;
    }

    public void o00ooOOo(String str) {
        this.f3943o00oOoO0 = str;
        this.f3939o00oOo00 = null;
    }

    public void o00ooOo() {
        this.f3944o00oOoOO = 1;
        this.f3939o00oOo00 = null;
    }

    public void o00ooOo0() {
        this.f3944o00oOoOO = 0;
        this.f3939o00oOo00 = null;
    }

    public boolean o00ooOoO() {
        return !this.f3941o00oOo0o;
    }

    public void o00ooOoo(@oo0oO0 Preference preference) {
        o00oOOo0 o00oooo02 = this.f3950o00oo00O;
        if (o00oooo02 != null) {
            o00oooo02.o00oOooO(preference);
        }
    }
}
