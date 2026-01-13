package androidx.work.impl;

import android.content.Context;
import android.support.v4.media.o00oOo0O;
import androidx.work.impl.o00oOOo0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOo00;
import o0O0OO.o0O00O0o;
import o0O0OO.o0ooO;
import o0O0OOoO.o00oo;
import o0O0OOoO.o00ooO0;
import o0O0OOoo.o0OoOoOo;
import o0O0Ooo.o0O00;
import o0O0o0Oo.o00oo0O0;
import o0O0o0Oo.o00oo0OO;
import o0O0o0Oo.o00ooO;
import o0O0o0Oo.o0O00000;
import o0O0o0Oo.o0O0000O;
import o0O0o0Oo.o0O000O;
import o0O0o0Oo.o0O000o0;
import o0O0o0Oo.o0O00OO;
import o0O0o0Oo.o0O00OOO;
import o0O0o0Oo.o0O00o00;
import o0O0o0Oo.o0O0o;
import o0O0o0Oo.o0OoO00O;
@o00oOo00(entities = {o00oo0OO.class, o0OoO00O.class, o0O00OO.class, o0O00000.class, o0O000O.class, o0O000o0.class, o0O0o.class}, version = 12)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
@o0ooO({androidx.work.o00oOOoO.class, o0O00o00.class})
/* loaded from: classes.dex */
public abstract class WorkDatabase extends o0O00O0o {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f5562o00oo0 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final long f5563o00oo0O0 = TimeUnit.DAYS.toMillis(1);

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f5564o00oo0OO = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00ooO0.o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Context f5565o00oOOo0;

        public o00oOOo0(Context context) {
            this.f5565o00oOOo0 = context;
        }

        @Override // o0O0OOoO.o00ooO0.o00oOo00
        @oo0oO0
        public o00ooO0 o00oOOo0(@oo0oO0 o00ooO0.o00oOOoO o00ooooo2) {
            o00ooO0.o00oOOoO.o00oOOo0 o00oooo02 = new o00ooO0.o00oOOoO.o00oOOo0(this.f5565o00oOOo0);
            o00oooo02.f11525o00oOOoO = o00ooooo2.f11521o00oOOoO;
            o00oooo02.f11526o00oOo00 = o00ooooo2.f11522o00oOo00;
            o00oooo02.f11527o00oOooO = true;
            return new o0OoOoOo().o00oOOo0(o00oooo02.o00oOOo0());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O00O0o.o00oOOoO {
        @Override // o0O0OO.o0O00O0o.o00oOOoO
        public void o00oOo00(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o00oOoOo();
            try {
                o00ooVar.o00oo0O0(WorkDatabase.o00ooOo0());
                o00ooVar.o00ooo0O();
            } finally {
                o00ooVar.o0();
            }
        }
    }

    @oo0oO0
    public static WorkDatabase o00ooO(@oo0oO0 Context context, @oo0oO0 Executor executor, boolean z) {
        o0O00O0o.o00oOOo0 o00oOOo02;
        if (z) {
            o00oOOo02 = o0O0OO.o0OoO00O.o00oOo00(context, WorkDatabase.class).o00oOo00();
        } else {
            o00oOOo02 = o0O0OO.o0OoO00O.o00oOOo0(context, WorkDatabase.class, o0O00.o00oOooO());
            o00oOOo02.o00oOoo0(new o00oOOo0(context));
        }
        return (WorkDatabase) o00oOOo02.o00oo00O(executor).o00oOOo0(new o00oOOoO()).o00oOOoO(androidx.work.impl.o00oOOo0.f5704o00ooO0).o00oOOoO(new o00oOOo0.o00oo0OO(context, 2, 3)).o00oOOoO(androidx.work.impl.o00oOOo0.f5706o00ooO0O).o00oOOoO(androidx.work.impl.o00oOOo0.f5707o00ooO0o).o00oOOoO(new o00oOOo0.o00oo0OO(context, 5, 6)).o00oOOoO(androidx.work.impl.o00oOOo0.f5703o00ooO).o00oOOoO(androidx.work.impl.o00oOOo0.f5709o00ooOO0).o00oOOoO(androidx.work.impl.o00oOOo0.f5708o00ooOO).o00oOOoO(new o00oOOo0.o00oo0O0(context)).o00oOOoO(new o00oOOo0.o00oo0OO(context, 10, 11)).o00oOOoO(androidx.work.impl.o00oOOo0.f5710o00ooOOo).o00oOoO().o00oOooO();
    }

    public static o0O00O0o.o00oOOoO o00ooOO() {
        return new o00oOOoO();
    }

    public static long o00ooOOo() {
        return System.currentTimeMillis() - f5563o00oo0O0;
    }

    @oo0oO0
    public static String o00ooOo0() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(f5562o00oo0);
        o00oOOo02.append(o00ooOOo());
        o00oOOo02.append(f5564o00oo0OO);
        return o00oOOo02.toString();
    }

    @oo0oO0
    public abstract o00oo0O0 o00ooOO0();

    @oo0oO0
    public abstract o0O0o0Oo.o00oo o00ooOo();

    @oo0oO0
    public abstract o00ooO o00ooOoO();

    @oo0oO0
    public abstract o0O0000O o00ooOoo();

    @oo0oO0
    public abstract o0O0o0Oo.o0O00 o00ooo0();

    @oo0oO0
    public abstract o0O0o0Oo.o0OoOoOo o00ooo00();

    @oo0oO0
    public abstract o0O0o0Oo.o0O00O0o o00ooo0O();

    @oo0oO0
    public abstract o0O00OOO o00ooo0o();
}
