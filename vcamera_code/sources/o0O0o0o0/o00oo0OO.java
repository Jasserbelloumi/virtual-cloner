package o0O0o0o0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o0OoOoO;
import androidx.work.impl.WorkDatabase;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0OO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12557o00oOOoO = "androidx.work.util.preferences";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12558o00oOo00 = "last_cancel_all_time_ms";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12559o00oOooO = "reschedule_needed";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final WorkDatabase f12560o00oOOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oo0.o00oOOo0<Long, Long> {
        public o00oOOo0() {
        }

        @Override // o00oo0.o00oOOo0
        /* renamed from: o00oOOo0 */
        public Long apply(Long l) {
            return Long.valueOf(l != null ? l.longValue() : 0L);
        }
    }

    public o00oo0OO(@oo0oO0 WorkDatabase workDatabase) {
        this.f12560o00oOOo0 = workDatabase;
    }

    public static void o00oOooO(@oo0oO0 Context context, @oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f12557o00oOOoO, 0);
        if (sharedPreferences.contains(f12559o00oOooO) || sharedPreferences.contains(f12558o00oOo00)) {
            long j = sharedPreferences.getLong(f12558o00oOo00, 0L);
            long j2 = sharedPreferences.getBoolean(f12559o00oOooO, false) ? 1L : 0L;
            o00ooVar.o00oOoOo();
            try {
                o00ooVar.o00ooo0o(androidx.work.impl.o00oOOo0.f5711o0O0o, new Object[]{f12558o00oOo00, Long.valueOf(j)});
                o00ooVar.o00ooo0o(androidx.work.impl.o00oOOo0.f5711o0O0o, new Object[]{f12559o00oOooO, Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                o00ooVar.o00ooo0O();
            } finally {
                o00ooVar.o0();
            }
        }
    }

    public long o00oOOo0() {
        Long o00oOo002 = this.f12560o00oOOo0.o00ooOo().o00oOo00(f12558o00oOo00);
        if (o00oOo002 != null) {
            return o00oOo002.longValue();
        }
        return 0L;
    }

    @oo0oO0
    public LiveData<Long> o00oOOoO() {
        return o0OoOoO.o00oOOoO(this.f12560o00oOOo0.o00ooOo().o00oOOo0(f12558o00oOo00), new o00oOOo0());
    }

    public boolean o00oOo00() {
        Long o00oOo002 = this.f12560o00oOOo0.o00ooOo().o00oOo00(f12559o00oOooO);
        return o00oOo002 != null && o00oOo002.longValue() == 1;
    }

    public void o00oOo0O(long j) {
        this.f12560o00oOOo0.o00ooOo().o00oOOoO(new o0O0o0Oo.o0O0o(f12558o00oOo00, j));
    }

    public void o00oOo0o(boolean z) {
        this.f12560o00oOOo0.o00ooOo().o00oOOoO(new o0O0o0Oo.o0O0o(f12559o00oOooO, z));
    }
}
