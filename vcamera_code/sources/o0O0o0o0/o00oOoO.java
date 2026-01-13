package o0O0o0o0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.o00oOOo0;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f12535o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12536o00oOo00 = "androidx.work.util.id";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f12537o00oOo0O = "next_alarm_manager_id";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12538o00oOooO = "next_job_scheduler_id";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final WorkDatabase f12539o00oOOo0;

    public o00oOoO(@oo0oO0 WorkDatabase workDatabase) {
        this.f12539o00oOOo0 = workDatabase;
    }

    public static void o00oOOo0(@oo0oO0 Context context, @oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f12536o00oOo00, 0);
        if (sharedPreferences.contains(f12538o00oOooO) || sharedPreferences.contains(f12538o00oOooO)) {
            int i = sharedPreferences.getInt(f12538o00oOooO, 0);
            int i2 = sharedPreferences.getInt(f12537o00oOo0O, 0);
            o00ooVar.o00oOoOo();
            try {
                o00ooVar.o00ooo0o(o00oOOo0.f5711o0O0o, new Object[]{f12538o00oOooO, Integer.valueOf(i)});
                o00ooVar.o00ooo0o(o00oOOo0.f5711o0O0o, new Object[]{f12537o00oOo0O, Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                o00ooVar.o00ooo0O();
            } finally {
                o00ooVar.o0();
            }
        }
    }

    public int o00oOOoO() {
        int o00oOo002;
        synchronized (o00oOoO.class) {
            o00oOo002 = o00oOo00(f12537o00oOo0O);
        }
        return o00oOo002;
    }

    public final int o00oOo00(String str) {
        this.f12539o00oOOo0.o00oOo00();
        try {
            Long o00oOo002 = this.f12539o00oOOo0.o00ooOo().o00oOo00(str);
            int i = 0;
            int intValue = o00oOo002 != null ? o00oOo002.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            o00oOo0O(str, i);
            this.f12539o00oOOo0.o00ooO0o();
            return intValue;
        } finally {
            this.f12539o00oOOo0.o00oOoOO();
        }
    }

    public final void o00oOo0O(String str, int i) {
        this.f12539o00oOOo0.o00ooOo().o00oOOoO(new o0O0o0Oo.o0O0o(str, i));
    }

    public int o00oOooO(int i, int i2) {
        synchronized (o00oOoO.class) {
            int o00oOo002 = o00oOo00(f12538o00oOooO);
            if (o00oOo002 >= i && o00oOo002 <= i2) {
                i = o00oOo002;
            }
            o00oOo0O(f12538o00oOooO, i + 1);
        }
        return i;
    }
}
