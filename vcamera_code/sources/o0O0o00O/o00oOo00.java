package o0O0o00O;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo.o0OoOoOo;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0O00O0o;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o0.o00oOoO;
@o0OOooO0(23)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOo00 implements o0OoOoOo {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f12332o00oo0o = o0O00000.o00oOo0o("SystemJobScheduler");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final JobScheduler f12333o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f12334o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O00O0 f12335o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOOoO f12336o00oo0o0;

    public o00oOo00(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0) {
        this(context, o0o00o0, (JobScheduler) context.getSystemService("jobscheduler"), new o00oOOoO(context));
    }

    @o0o0000
    public o00oOo00(Context context, o0O00O0 o0o00o0, JobScheduler jobScheduler, o00oOOoO o00ooooo2) {
        this.f12334o00oo0O0 = context;
        this.f12335o00oo0Oo = o0o00o0;
        this.f12333o00oo0O = jobScheduler;
        this.f12336o00oo0o0 = o00ooooo2;
    }

    public static void o00oOOoO(@oo0oO0 Context context) {
        List<JobInfo> o00oOoO02;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (o00oOoO02 = o00oOoO0(context, jobScheduler)) == null || o00oOoO02.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : o00oOoO02) {
            o00oOo0O(jobScheduler, jobInfo.getId());
        }
    }

    public static void o00oOo0O(@oo0oO0 JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            o0O00000.o00oOo00().o00oOOoO(f12332o00oo0o, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @o0OO00OO
    public static List<Integer> o00oOo0o(@oo0oO0 Context context, @oo0oO0 JobScheduler jobScheduler, @oo0oO0 String str) {
        List<JobInfo> o00oOoO02 = o00oOoO0(context, jobScheduler);
        if (o00oOoO02 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : o00oOoO02) {
            if (str.equals(o00oOoO(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @o0OO00OO
    public static String o00oOoO(@oo0oO0 JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey(o00oOOoO.f12328o00oOo00)) {
                    return extras.getString(o00oOOoO.f12328o00oOo00);
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @o0OO00OO
    public static List<JobInfo> o00oOoO0(@oo0oO0 Context context, @oo0oO0 JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o0O00000.o00oOo00().o00oOOoO(f12332o00oo0o, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static boolean o00oOoOO(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> o00oOoO02 = o00oOoO0(context, jobScheduler);
        List<String> o00oOo002 = o0o00o0.o00ooo0o().o00ooOoo().o00oOo00();
        boolean z = false;
        HashSet hashSet = new HashSet(o00oOoO02 != null ? o00oOoO02.size() : 0);
        if (o00oOoO02 != null && !o00oOoO02.isEmpty()) {
            for (JobInfo jobInfo : o00oOoO02) {
                String o00oOoO2 = o00oOoO(jobInfo);
                if (TextUtils.isEmpty(o00oOoO2)) {
                    o00oOo0O(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(o00oOoO2);
                }
            }
        }
        Iterator<String> it = o00oOo002.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    o0O00000.o00oOo00().o00oOOo0(f12332o00oo0o, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase o00ooo0o2 = o0o00o0.o00ooo0o();
            o00ooo0o2.o00oOo00();
            try {
                o0O00O0o o00ooo0O2 = o00ooo0o2.o00ooo0O();
                for (String str : o00oOo002) {
                    o00ooo0O2.o00oo0O0(str, -1L);
                }
                o00ooo0o2.o00ooO0o();
            } finally {
                o00ooo0o2.o00oOoOO();
            }
        }
        return z;
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOOo0(@oo0oO0 String str) {
        List<Integer> o00oOo0o2 = o00oOo0o(this.f12334o00oo0O0, this.f12333o00oo0O, str);
        if (o00oOo0o2 == null || o00oOo0o2.isEmpty()) {
            return;
        }
        for (Integer num : o00oOo0o2) {
            o00oOo0O(this.f12333o00oo0O, num.intValue());
        }
        this.f12335o00oo0Oo.o00ooo0o().o00ooOoo().o00oOooO(str);
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOo00(@oo0oO0 o0OoO00O... o0ooo00oArr) {
        WorkDatabase o00ooo0o2 = this.f12335o00oo0Oo.o00ooo0o();
        o00oOoO o00oooo2 = new o00oOoO(o00ooo0o2);
        for (o0OoO00O o0ooo00o : o0ooo00oArr) {
            o00ooo0o2.o00oOo00();
            try {
                o0OoO00O o00oOoOO2 = o00ooo0o2.o00ooo0O().o00oOoOO(o0ooo00o.f12462o00oOOo0);
                if (o00oOoOO2 == null) {
                    o0O00000.o00oOo00().o00oOoO(f12332o00oo0o, "Skipping scheduling " + o0ooo00o.f12462o00oOOo0 + " because it's no longer in the DB", new Throwable[0]);
                } else if (o00oOoOO2.f12463o00oOOoO != o0OoO00O.o00oOOo0.ENQUEUED) {
                    o0O00000.o00oOo00().o00oOoO(f12332o00oo0o, "Skipping scheduling " + o0ooo00o.f12462o00oOOo0 + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    o0O0o0Oo.o0O00000 o00oOOoO2 = o00ooo0o2.o00ooOoo().o00oOOoO(o0ooo00o.f12462o00oOOo0);
                    int o00oOooO2 = o00oOOoO2 != null ? o00oOOoO2.f12390o00oOOoO : o00oooo2.o00oOooO(this.f12335o00oo0Oo.o00ooOo0().f5743o00oOoOO, this.f12335o00oo0Oo.o00ooOo0().f5744o00oOoOo);
                    if (o00oOOoO2 == null) {
                        this.f12335o00oo0Oo.o00ooo0o().o00ooOoo().o00oOOo0(new o0O0o0Oo.o0O00000(o0ooo00o.f12462o00oOOo0, o00oOooO2));
                    }
                    o00oOoOo(o0ooo00o, o00oOooO2);
                }
                o00ooo0o2.o00ooO0o();
                o00ooo0o2.o00oOoOO();
            } catch (Throwable th) {
                o00ooo0o2.o00oOoOO();
                throw th;
            }
        }
    }

    @o0o0000
    public void o00oOoOo(o0O0o0Oo.o0OoO00O o0ooo00o, int i) {
        JobInfo o00oOOo02 = this.f12336o00oo0o0.o00oOOo0(o0ooo00o, i);
        o0O00000 o00oOo002 = o0O00000.o00oOo00();
        String str = f12332o00oo0o;
        o00oOo002.o00oOOo0(str, String.format("Scheduling work ID %s Job ID %s", o0ooo00o.f12462o00oOOo0, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f12333o00oo0O.schedule(o00oOOo02) == 0) {
                o0O00000.o00oOo00().o00oOoO(str, String.format("Unable to schedule work ID %s", o0ooo00o.f12462o00oOOo0), new Throwable[0]);
                if (o0ooo00o.f12476o00oo0O && o0ooo00o.f12479o00oo0Oo == o0O0Ooo0.o0OoOoOo.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    o0ooo00o.f12476o00oo0O = false;
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Scheduling a non-expedited job (work ID %s)", o0ooo00o.f12462o00oOOo0), new Throwable[0]);
                    o00oOoOo(o0ooo00o, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> o00oOoO02 = o00oOoO0(this.f12334o00oo0O0, this.f12333o00oo0O);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(o00oOoO02 != null ? o00oOoO02.size() : 0), Integer.valueOf(this.f12335o00oo0Oo.o00ooo0o().o00ooo0O().o00oOooO().size()), Integer.valueOf(this.f12335o00oo0Oo.o00ooOo0().f5745o00oOoo0));
            o0O00000.o00oOo00().o00oOOoO(f12332o00oo0o, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            o0O00000.o00oOo00().o00oOOoO(f12332o00oo0o, String.format("Unable to schedule %s", o0ooo00o), th);
        }
    }

    @Override // o0O0Ooo.o0OoOoOo
    public boolean o00oOooO() {
        return true;
    }
}
