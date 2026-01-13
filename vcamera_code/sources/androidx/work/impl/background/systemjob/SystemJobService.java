package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o00O.o00oOOoO;
@o0OOooO0(23)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements o0O0000O {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f5640o00oo0Oo = o0O00000.o00oOo0o("SystemJobService");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Map<String, JobParameters> f5641o00oo0O = new HashMap();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00O0 f5642o00oo0O0;

    @o0OO00OO
    public static String o00oOOo0(@oo0oO0 JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey(o00oOOoO.f12328o00oOo00)) {
                return null;
            }
            return extras.getString(o00oOOoO.f12328o00oOo00);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        JobParameters remove;
        o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f5641o00oo0O) {
            remove = this.f5641o00oo0O.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            o0O00O0 o00ooOoO2 = o0O00O0.o00ooOoO(getApplicationContext());
            this.f5642o00oo0O0 = o00ooOoO2;
            o00ooOoO2.o00ooo00().o00oOo00(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o0O00000.o00oOo00().o00oOoO(f5640o00oo0Oo, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        o0O00O0 o0o00o0 = this.f5642o00oo0O0;
        if (o0o00o0 != null) {
            o0o00o0.o00ooo00().o00oOoOo(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@oo0oO0 JobParameters jobParameters) {
        if (this.f5642o00oo0O0 == null) {
            o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String o00oOOo02 = o00oOOo0(jobParameters);
        if (TextUtils.isEmpty(o00oOOo02)) {
            o0O00000.o00oOo00().o00oOOoO(f5640o00oo0Oo, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5641o00oo0O) {
            if (this.f5641o00oo0O.containsKey(o00oOOo02)) {
                o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, String.format("Job is already being executed by SystemJobService: %s", o00oOOo02), new Throwable[0]);
                return false;
            }
            o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, String.format("onStartJob for %s", o00oOOo02), new Throwable[0]);
            this.f5641o00oo0O.put(o00oOOo02, jobParameters);
            WorkerParameters.o00oOOo0 o00oooo02 = new WorkerParameters.o00oOOo0();
            if (jobParameters.getTriggeredContentUris() != null) {
                o00oooo02.f5560o00oOOoO = Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                o00oooo02.f5559o00oOOo0 = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            o00oooo02.f5561o00oOo00 = jobParameters.getNetwork();
            this.f5642o00oo0O0.o0O00000(o00oOOo02, o00oooo02);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@oo0oO0 JobParameters jobParameters) {
        if (this.f5642o00oo0O0 == null) {
            o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String o00oOOo02 = o00oOOo0(jobParameters);
        if (TextUtils.isEmpty(o00oOOo02)) {
            o0O00000.o00oOo00().o00oOOoO(f5640o00oo0Oo, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        o0O00000.o00oOo00().o00oOOo0(f5640o00oo0Oo, String.format("onStopJob for %s", o00oOOo02), new Throwable[0]);
        synchronized (this.f5641o00oo0O) {
            this.f5641o00oo0O.remove(o00oOOo02);
        }
        this.f5642o00oo0O0.o0O0000o(o00oOOo02);
        return !this.f5642o00oo0O0.o00ooo00().o00oOoO0(o00oOOo02);
    }
}
