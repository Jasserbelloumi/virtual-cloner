package o0O0o0o0;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.o00oOOoO;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O000O;
import o0O0o0Oo.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOo00 implements Runnable {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f12532o00oo0Oo = o0O0Ooo0.o0O00000.o00oOo0o("EnqueueRunnable");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O0Ooo.o0O000 f12533o00oo0O = new o0O0Ooo.o0O000();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0Ooo.o0O000o0 f12534o00oo0O0;

    public o00oOo00(@oo0oO0 o0O0Ooo.o0O000o0 o0o000o0) {
        this.f12534o00oo0O0 = o0o000o0;
    }

    public static boolean o00oOOoO(@oo0oO0 o0O0Ooo.o0O000o0 o0o000o0) {
        boolean o00oOo002 = o00oOo00(o0o000o0.o00oo0(), o0o000o0.o00oo00O(), (String[]) o0O0Ooo.o0O000o0.o00oo0o0(o0o000o0).toArray(new String[0]), o0o000o0.o00oOoo0(), o0o000o0.o00oOoOO());
        o0o000o0.o00oo0Oo();
        return o00oOo002;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148  */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o00oOo00(o0O0Ooo.o0O00O0 r16, @o00oOooO.oo0oO0 java.util.List<? extends o0O0Ooo0.o0O00OO> r17, java.lang.String[] r18, java.lang.String r19, o0O0Ooo0.o00oo0O r20) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0o0o0.o00oOo00.o00oOo00(o0O0Ooo.o0O00O0, java.util.List, java.lang.String[], java.lang.String, o0O0Ooo0.o00oo0O):boolean");
    }

    public static boolean o00oOo0O(@oo0oO0 o0O0Ooo.o0O000o0 o0o000o0) {
        List<o0O0Ooo.o0O000o0> o00oOooo2 = o0o000o0.o00oOooo();
        boolean z = false;
        if (o00oOooo2 != null) {
            boolean z2 = false;
            for (o0O0Ooo.o0O000o0 o0o000o02 : o00oOooo2) {
                if (o0o000o02.o00oo0O()) {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOoO(f12532o00oo0Oo, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", o0o000o02.o00oOoOo())), new Throwable[0]);
                } else {
                    z2 |= o00oOo0O(o0o000o02);
                }
            }
            z = z2;
        }
        return o00oOOoO(o0o000o0) | z;
    }

    public static boolean o00oOoO(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (o0O0Ooo.o0OoOoOo o0oooooo : o0o00o0.o00ooo0O()) {
                if (cls.isAssignableFrom(o0oooooo.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public static void o00oOoO0(o0OoO00O o0ooo00o) {
        o0O0Ooo0.o00oo00O o00oo00o = o0ooo00o.f12470o00oOoOo;
        String str = o0ooo00o.f12464o00oOo00;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (o00oo00o.f12155o00oOooO || o00oo00o.f12151o00oOo0O) {
            o00oOOoO.o00oOOo0 o00oooo02 = new o00oOOoO.o00oOOo0();
            o00oooo02.o00oOooO(o0ooo00o.f12465o00oOo0O.f5765o00oOOo0);
            o00oooo02.o00oo0O(ConstraintTrackingWorker.f5725o0O0o, str);
            o0ooo00o.f12464o00oOo00 = ConstraintTrackingWorker.class.getName();
            o0ooo00o.f12465o00oOo0O = o00oooo02.o00oOOo0();
        }
    }

    @o0o0000
    public boolean o00oOOo0() {
        WorkDatabase o00ooo0o2 = this.f12534o00oo0O0.o00oo0().o00ooo0o();
        o00ooo0o2.o00oOo00();
        try {
            boolean o00oOo0O2 = o00oOo0O(this.f12534o00oo0O0);
            o00ooo0o2.o00ooO0o();
            return o00oOo0O2;
        } finally {
            o00ooo0o2.o00oOoOO();
        }
    }

    @o0o0000
    public void o00oOo0o() {
        o0O00O0 o00oo02 = this.f12534o00oo0O0.o00oo0();
        o0O0Ooo.o0O000Oo.o00oOOoO(o00oo02.o00ooOo0(), o00oo02.o00ooo0o(), o00oo02.o00ooo0O());
    }

    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOooO() {
        return this.f12533o00oo0O;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f12534o00oo0O0.o00oo0OO()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f12534o00oo0O0));
            }
            if (o00oOOo0()) {
                o00oo0.o00oOo00(this.f12534o00oo0O0.o00oo0().o00ooOOo(), RescheduleReceiver.class, true);
                o00oOo0o();
            }
            this.f12533o00oo0O.o00oOOo0(o0O0Ooo0.o0O000O.f12172o00oOOo0);
        } catch (Throwable th) {
            this.f12533o00oo0O.o00oOOo0(new o0O000O.o00oOOoO.o00oOOo0(th));
        }
    }
}
