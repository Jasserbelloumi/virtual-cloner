package o0Oo00oo;

import android.content.Context;
import android.content.SharedPreferences;
import multispace.multiapp.clone.app.App;
/* loaded from: classes3.dex */
public class o0O000o0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static o0O000o0 f15690o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0O00 f15691o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public SharedPreferences.Editor f15692o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f15693o00oOo00 = false;

    public static o0O000o0 o00oOo00() {
        if (f15690o00oOooO == null) {
            synchronized (o0O000o0.class) {
                if (f15690o00oOooO == null) {
                    f15690o00oOooO = new o0O000o0();
                }
            }
        }
        o0O000o0 o0o000o0 = f15690o00oOooO;
        if (!o0o000o0.f15693o00oOo00) {
            o0o000o0.o00oOoO0(App.o00oOOoO());
        }
        return f15690o00oOooO;
    }

    public synchronized boolean o00oOOo0(String str) {
        o0O00 o0o00 = this.f15691o00oOOo0;
        if (o0o00 == null) {
            return false;
        }
        return o0o00.contains(str);
    }

    public synchronized boolean o00oOOoO(String str, boolean z) {
        return this.f15691o00oOOo0.getBoolean(str, z);
    }

    public synchronized long o00oOo0O(String str, long j) {
        return this.f15691o00oOOo0.getLong(str, j);
    }

    public synchronized String o00oOo0o(String str) {
        o0O00 o0o00 = this.f15691o00oOOo0;
        if (o0o00 == null) {
            return "";
        }
        return o0o00.getString(str, "");
    }

    public synchronized void o00oOoO(String str) {
        if (this.f15691o00oOOo0.contains(str)) {
            this.f15692o00oOOoO.remove(str);
            this.f15692o00oOOoO.commit();
        }
    }

    public synchronized void o00oOoO0(Context context) {
        if (this.f15693o00oOo00) {
            return;
        }
        this.f15693o00oOo00 = true;
        o0O00 o0o00 = new o0O00(context);
        this.f15691o00oOOo0 = o0o00;
        this.f15692o00oOOoO = o0o00.edit();
    }

    public synchronized void o00oOoOO(String str, int i) {
        this.f15692o00oOOoO.putInt(str, i);
        this.f15692o00oOOoO.commit();
    }

    public synchronized void o00oOoOo(String str, long j) {
        this.f15692o00oOOoO.putLong(str, j);
        this.f15692o00oOOoO.commit();
    }

    public synchronized void o00oOoo0(String str, Boolean bool) {
        this.f15692o00oOOoO.putBoolean(str, bool.booleanValue());
        this.f15692o00oOOoO.commit();
    }

    public synchronized int o00oOooO(String str, int i) {
        return this.f15691o00oOOo0.getInt(str, i);
    }

    public synchronized void o00oOooo(String str, String str2) {
        if (str2 == null) {
            return;
        }
        this.f15692o00oOOoO.putString(str, str2);
        this.f15692o00oOOoO.commit();
    }
}
