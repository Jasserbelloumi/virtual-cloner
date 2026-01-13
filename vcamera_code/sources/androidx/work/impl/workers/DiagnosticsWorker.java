package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o0Oo.o0O0000O;
import o0O0o0Oo.o0O00O0o;
import o0O0o0Oo.o0O00OOO;
import o0O0o0Oo.o0OoO00O;
import o0O0o0Oo.o0OoOoOo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f5734o00oo0O0 = o0O00000.o00oOo0o("DiagnosticsWrkr");

    public DiagnosticsWorker(@oo0oO0 Context context, @oo0oO0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @oo0oO0
    public static String o00oOOo0(@oo0oO0 o0OoO00O o0ooo00o, @o0OO00OO String str, @o0OO00OO Integer num, @oo0oO0 String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", o0ooo00o.f12462o00oOOo0, o0ooo00o.f12464o00oOo00, num, o0ooo00o.f12463o00oOOoO.name(), str, str2);
    }

    @oo0oO0
    public static String o00oOo00(@oo0oO0 o0OoOoOo o0oooooo, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o0O0000O o0o0000o, @oo0oO0 List<o0OoO00O> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (o0OoO00O o0ooo00o : list) {
            Integer num = null;
            o0O0o0Oo.o0O00000 o00oOOoO2 = o0o0000o.o00oOOoO(o0ooo00o.f12462o00oOOo0);
            if (o00oOOoO2 != null) {
                num = Integer.valueOf(o00oOOoO2.f12390o00oOOoO);
            }
            sb.append(o00oOOo0(o0ooo00o, TextUtils.join(",", o0oooooo.o00oOOoO(o0ooo00o.f12462o00oOOo0)), num, TextUtils.join(",", o0o00ooo.o00oOOo0(o0ooo00o.f12462o00oOOo0))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @oo0oO0
    public ListenableWorker.o00oOOo0 doWork() {
        WorkDatabase o00ooo0o2 = o0O00O0.o00ooOoO(getApplicationContext()).o00ooo0o();
        o0O00O0o o00ooo0O2 = o00ooo0o2.o00ooo0O();
        o0OoOoOo o00ooo002 = o00ooo0o2.o00ooo00();
        o0O00OOO o00ooo0o3 = o00ooo0o2.o00ooo0o();
        o0O0000O o00ooOoo2 = o00ooo0o2.o00ooOoo();
        List<o0OoO00O> o00oOo002 = o00ooo0O2.o00oOo00(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<o0OoO00O> o00ooO002 = o00ooo0O2.o00ooO00();
        List<o0OoO00O> o00oo02 = o00ooo0O2.o00oo0(200);
        if (o00oOo002 != null && !o00oOo002.isEmpty()) {
            o0O00000 o00oOo003 = o0O00000.o00oOo00();
            String str = f5734o00oo0O0;
            o00oOo003.o00oOooO(str, "Recently completed work:\n\n", new Throwable[0]);
            o0O00000.o00oOo00().o00oOooO(str, o00oOo00(o00ooo002, o00ooo0o3, o00ooOoo2, o00oOo002), new Throwable[0]);
        }
        if (o00ooO002 != null && !o00ooO002.isEmpty()) {
            o0O00000 o00oOo004 = o0O00000.o00oOo00();
            String str2 = f5734o00oo0O0;
            o00oOo004.o00oOooO(str2, "Running work:\n\n", new Throwable[0]);
            o0O00000.o00oOo00().o00oOooO(str2, o00oOo00(o00ooo002, o00ooo0o3, o00ooOoo2, o00ooO002), new Throwable[0]);
        }
        if (o00oo02 != null && !o00oo02.isEmpty()) {
            o0O00000 o00oOo005 = o0O00000.o00oOo00();
            String str3 = f5734o00oo0O0;
            o00oOo005.o00oOooO(str3, "Enqueued work:\n\n", new Throwable[0]);
            o0O00000.o00oOo00().o00oOooO(str3, o00oOo00(o00ooo002, o00ooo0o3, o00ooOoo2, o00oo02), new Throwable[0]);
        }
        return new ListenableWorker.o00oOOo0.o00oOo00();
    }
}
