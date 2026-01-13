package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0oO;
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f2320o00oo = "JobIntentService";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final boolean f2322o00ooO00 = false;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oo0OO f2324o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOOoO f2325o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oOOo0 f2326o00oo0Oo;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final Object f2321o00ooO0 = new Object();

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final HashMap<ComponentName, o00oo0OO> f2323o00ooO0O = new HashMap<>();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f2328o00oo0o0 = false;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f2327o00oo0o = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f2329o00oo0oO = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final ArrayList<o00oOo0O> f2330o0O0o = null;

    /* loaded from: classes.dex */
    public final class o00oOOo0 extends AsyncTask<Void, Void, Void> {
        public o00oOOo0() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOo0 */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                o00oOoO o00oOOo02 = JobIntentService.this.o00oOOo0();
                if (o00oOOo02 == null) {
                    return null;
                }
                JobIntentService.this.o00oOoO(o00oOOo02.getIntent());
                o00oOOo02.o00oOoO();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOoO */
        public void onCancelled(Void r1) {
            JobIntentService.this.o00oOoOo();
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOo00 */
        public void onPostExecute(Void r1) {
            JobIntentService.this.o00oOoOo();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        IBinder o00oOOo0();

        o00oOoO o00oOOoO();
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o00oo0OO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final PowerManager.WakeLock f2332o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final PowerManager.WakeLock f2333o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f2334o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f2335o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Context f2336o00oOooO;

        public o00oOo00(Context context, ComponentName componentName) {
            super(componentName);
            this.f2336o00oOooO = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2332o00oOo0O = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2333o00oOo0o = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.o00oo0OO
        public void o00oOOo0(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2349o00oOOo0);
            if (this.f2336o00oOooO.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f2335o00oOoO0) {
                        this.f2335o00oOoO0 = true;
                        if (!this.f2334o00oOoO) {
                            this.f2332o00oOo0O.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.o00oo0OO
        public void o00oOo00() {
            synchronized (this) {
                if (this.f2334o00oOoO) {
                    if (this.f2335o00oOoO0) {
                        this.f2332o00oOo0O.acquire(60000L);
                    }
                    this.f2334o00oOoO = false;
                    this.f2333o00oOo0o.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.o00oo0OO
        public void o00oOo0O() {
            synchronized (this) {
                this.f2335o00oOoO0 = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.o00oo0OO
        public void o00oOooO() {
            synchronized (this) {
                if (!this.f2334o00oOoO) {
                    this.f2334o00oOoO = true;
                    this.f2333o00oOo0o.acquire(androidx.work.impl.background.systemalarm.o00oOOo0.f5594o00ooO);
                    this.f2332o00oOo0O.release();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOo0O implements o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Intent f2337o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f2338o00oOOoO;

        public o00oOo0O(Intent intent, int i) {
            this.f2337o00oOOo0 = intent;
            this.f2338o00oOOoO = i;
        }

        @Override // androidx.core.app.JobIntentService.o00oOoO
        public Intent getIntent() {
            return this.f2337o00oOOo0;
        }

        @Override // androidx.core.app.JobIntentService.o00oOoO
        public void o00oOoO() {
            JobIntentService.this.stopSelf(this.f2338o00oOOoO);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        Intent getIntent();

        void o00oOoO();
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static final class o00oo0 extends o00oo0OO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final JobScheduler f2340o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final JobInfo f2341o00oOooO;

        public o00oo0(Context context, ComponentName componentName, int i) {
            super(componentName);
            o00oOOoO(i);
            this.f2341o00oOooO = new JobInfo.Builder(i, this.f2349o00oOOo0).setOverrideDeadline(0L).build();
            this.f2340o00oOo0O = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.o00oo0OO
        public void o00oOOo0(Intent intent) {
            this.f2340o00oOo0O.enqueue(this.f2341o00oOooO, new JobWorkItem(intent));
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static final class o00oo00O extends JobServiceEngine implements o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final boolean f2342o00oOo0O = false;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f2343o00oOooO = "JobServiceEngineImpl";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final JobIntentService f2344o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Object f2345o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public JobParameters f2346o00oOo00;

        /* loaded from: classes.dex */
        public final class o00oOOo0 implements o00oOoO {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final JobWorkItem f2347o00oOOo0;

            public o00oOOo0(JobWorkItem jobWorkItem) {
                this.f2347o00oOOo0 = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.o00oOoO
            public Intent getIntent() {
                return this.f2347o00oOOo0.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.o00oOoO
            public void o00oOoO() {
                synchronized (o00oo00O.this.f2345o00oOOoO) {
                    JobParameters jobParameters = o00oo00O.this.f2346o00oOo00;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2347o00oOOo0);
                    }
                }
            }
        }

        public o00oo00O(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2345o00oOOoO = new Object();
            this.f2344o00oOOo0 = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.o00oOOoO
        public IBinder o00oOOo0() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.o00oOOoO
        public o00oOoO o00oOOoO() {
            synchronized (this.f2345o00oOOoO) {
                JobParameters jobParameters = this.f2346o00oOo00;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(this.f2344o00oOOo0.getClassLoader());
                    return new o00oOOo0(dequeueWork);
                }
                return null;
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f2346o00oOo00 = jobParameters;
            this.f2344o00oOOo0.o00oOo0O(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean o00oOOoO2 = this.f2344o00oOOo0.o00oOOoO();
            synchronized (this.f2345o00oOOoO) {
                this.f2346o00oOo00 = null;
            }
            return o00oOOoO2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ComponentName f2349o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f2350o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2351o00oOo00;

        public o00oo0OO(ComponentName componentName) {
            this.f2349o00oOOo0 = componentName;
        }

        public abstract void o00oOOo0(Intent intent);

        public void o00oOOoO(int i) {
            if (!this.f2350o00oOOoO) {
                this.f2350o00oOOoO = true;
                this.f2351o00oOo00 = i;
            } else if (this.f2351o00oOo00 == i) {
            } else {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Given job ID ", i, " is different than previous ");
                o00oOOo02.append(this.f2351o00oOo00);
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
        }

        public void o00oOo00() {
        }

        public void o00oOo0O() {
        }

        public void o00oOooO() {
        }
    }

    public static void o00oOo00(@oo0oO0 Context context, @oo0oO0 ComponentName componentName, int i, @oo0oO0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f2321o00ooO0) {
            o00oo0OO o00oOo0o2 = o00oOo0o(context, componentName, true, i);
            o00oOo0o2.o00oOOoO(i);
            o00oOo0o2.o00oOOo0(intent);
        }
    }

    public static o00oo0OO o00oOo0o(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, o00oo0OO> hashMap = f2323o00ooO0O;
        o00oo0OO o00oo0oo = hashMap.get(componentName);
        if (o00oo0oo == null) {
            if (z) {
                o00oo0 o00oo0Var = new o00oo0(context, componentName, i);
                hashMap.put(componentName, o00oo0Var);
                return o00oo0Var;
            }
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        return o00oo0oo;
    }

    public static void o00oOooO(@oo0oO0 Context context, @oo0oO0 Class<?> cls, int i, @oo0oO0 Intent intent) {
        o00oOo00(context, new ComponentName(context, cls), i, intent);
    }

    public o00oOoO o00oOOo0() {
        o00oOOoO o00ooooo2 = this.f2325o00oo0O0;
        if (o00ooooo2 != null) {
            return o00ooooo2.o00oOOoO();
        }
        synchronized (this.f2330o0O0o) {
            if (this.f2330o0O0o.size() > 0) {
                return this.f2330o0O0o.remove(0);
            }
            return null;
        }
    }

    public boolean o00oOOoO() {
        o00oOOo0 o00oooo02 = this.f2326o00oo0Oo;
        if (o00oooo02 != null) {
            o00oooo02.cancel(this.f2328o00oo0o0);
        }
        this.f2327o00oo0o = true;
        return o00oOoOO();
    }

    public void o00oOo0O(boolean z) {
        if (this.f2326o00oo0Oo == null) {
            this.f2326o00oo0Oo = new o00oOOo0();
            o00oo0OO o00oo0oo = this.f2324o00oo0O;
            if (o00oo0oo != null && z) {
                o00oo0oo.o00oOooO();
            }
            this.f2326o00oo0Oo.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void o00oOoO(@oo0oO0 Intent intent);

    public boolean o00oOoO0() {
        return this.f2327o00oo0o;
    }

    public boolean o00oOoOO() {
        return true;
    }

    public void o00oOoOo() {
        ArrayList<o00oOo0O> arrayList = this.f2330o0O0o;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2326o00oo0Oo = null;
                ArrayList<o00oOo0O> arrayList2 = this.f2330o0O0o;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    o00oOo0O(false);
                } else if (!this.f2329o00oo0oO) {
                    this.f2324o00oo0O.o00oOo00();
                }
            }
        }
    }

    public void o00oOoo0(boolean z) {
        this.f2328o00oo0o0 = z;
    }

    @Override // android.app.Service
    public IBinder onBind(@oo0oO0 Intent intent) {
        o00oOOoO o00ooooo2 = this.f2325o00oo0O0;
        if (o00ooooo2 != null) {
            return o00ooooo2.o00oOOo0();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f2325o00oo0O0 = new o00oo00O(this);
        this.f2324o00oo0O = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<o00oOo0O> arrayList = this.f2330o0O0o;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2329o00oo0oO = true;
                this.f2324o00oo0O.o00oOo00();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@o0OO00OO Intent intent, int i, int i2) {
        if (this.f2330o0O0o != null) {
            this.f2324o00oo0O.o00oOo0O();
            synchronized (this.f2330o0O0o) {
                ArrayList<o00oOo0O> arrayList = this.f2330o0O0o;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new o00oOo0O(intent, i2));
                o00oOo0O(true);
            }
            return 3;
        }
        return 2;
    }
}
