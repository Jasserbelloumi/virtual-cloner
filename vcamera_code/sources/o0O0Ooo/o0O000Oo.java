package o0O0Ooo;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.o00oOOo0;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0o00O.o00oOo00;
import o0O0o0o0.o00oo0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12074o00oOOo0 = "androidx.work.impl.background.gcm.GcmScheduler";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12075o00oOOoO = o0O0Ooo0.o0O00000.o00oOo0o("Schedulers");

    @oo0oO0
    public static o0OoOoOo o00oOOo0(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0) {
        o00oOo00 o00ooo002 = new o00oOo00(context, o0o00o0);
        o00oo0.o00oOo00(context, SystemJobService.class, true);
        o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12075o00oOOoO, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return o00ooo002;
    }

    public static void o00oOOoO(@oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 WorkDatabase workDatabase, List<o0OoOoOo> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o0O0o0Oo.o0O00O0o o00ooo0O2 = workDatabase.o00ooo0O();
        workDatabase.o00oOo00();
        try {
            List<o0O0o0Oo.o0OoO00O> o00oo0o02 = o00ooo0O2.o00oo0o0(o00oooo02.f5745o00oOoo0);
            List<o0O0o0Oo.o0OoO00O> o00oo02 = o00ooo0O2.o00oo0(200);
            if (o00oo0o02 != null && o00oo0o02.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (o0O0o0Oo.o0OoO00O o0ooo00o : o00oo0o02) {
                    o00ooo0O2.o00oo0O0(o0ooo00o.f12462o00oOOo0, currentTimeMillis);
                }
            }
            workDatabase.o00ooO0o();
            if (o00oo0o02 != null && o00oo0o02.size() > 0) {
                o0O0o0Oo.o0OoO00O[] o0ooo00oArr = (o0O0o0Oo.o0OoO00O[]) o00oo0o02.toArray(new o0O0o0Oo.o0OoO00O[o00oo0o02.size()]);
                for (o0OoOoOo o0oooooo : list) {
                    if (o0oooooo.o00oOooO()) {
                        o0oooooo.o00oOo00(o0ooo00oArr);
                    }
                }
            }
            if (o00oo02 == null || o00oo02.size() <= 0) {
                return;
            }
            o0O0o0Oo.o0OoO00O[] o0ooo00oArr2 = (o0O0o0Oo.o0OoO00O[]) o00oo02.toArray(new o0O0o0Oo.o0OoO00O[o00oo02.size()]);
            for (o0OoOoOo o0oooooo2 : list) {
                if (!o0oooooo2.o00oOooO()) {
                    o0oooooo2.o00oOo00(o0ooo00oArr2);
                }
            }
        } finally {
            workDatabase.o00oOoOO();
        }
    }

    @o0OO00OO
    public static o0OoOoOo o00oOo00(@oo0oO0 Context context) {
        try {
            o0OoOoOo o0oooooo = (o0OoOoOo) Class.forName(f12074o00oOOo0).getConstructor(Context.class).newInstance(context);
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12075o00oOOoO, String.format("Created %s", f12074o00oOOo0), new Throwable[0]);
            return o0oooooo;
        } catch (Throwable th) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12075o00oOOoO, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
