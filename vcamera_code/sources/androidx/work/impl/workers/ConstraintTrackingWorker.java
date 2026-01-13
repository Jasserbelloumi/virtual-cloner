package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o00o.o00oo0;
import o0O0o00o.o00oo0OO;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o.o00ooO;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements o00oo0 {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f5724o00oo0oO = o0O00000.o00oOo0o("ConstraintTrkngWrkr");

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f5725o0O0o = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Object f5726o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public WorkerParameters f5727o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public volatile boolean f5728o00oo0Oo;
    @o0OO00OO

    /* renamed from: o00oo0o  reason: collision with root package name */
    public ListenableWorker f5729o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00ooO<ListenableWorker.o00oOOo0> f5730o00oo0o0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f5733o00oo0O0;

        public o00oOOoO(ListenableFuture listenableFuture) {
            this.f5733o00oo0O0 = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f5726o00oo0O) {
                if (ConstraintTrackingWorker.this.f5728o00oo0Oo) {
                    ConstraintTrackingWorker.this.o00oOo0O();
                } else {
                    ConstraintTrackingWorker.this.f5730o00oo0o0.o00oo0Oo(this.f5733o00oo0O0);
                }
            }
        }
    }

    public ConstraintTrackingWorker(@oo0oO0 Context context, @oo0oO0 WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5727o00oo0O0 = workerParameters;
        this.f5726o00oo0O = new Object();
        this.f5728o00oo0Oo = false;
        this.f5730o00oo0o0 = o00ooO.o00oo0oO();
    }

    @Override // androidx.work.ListenableWorker
    @oo0oO0
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public oO00O0oO getTaskExecutor() {
        return o0O00O0.o00ooOoO(getApplicationContext()).o00oooOO();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5729o00oo0o;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @o0OO00OO
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public ListenableWorker o00oOOo0() {
        return this.f5729o00oo0o;
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOOoO(@oo0oO0 List<String> list) {
        o0O00000.o00oOo00().o00oOOo0(f5724o00oo0oO, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f5726o00oo0O) {
            this.f5728o00oo0Oo = true;
        }
    }

    @oo0oO0
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public WorkDatabase o00oOo00() {
        return o0O00O0.o00ooOoO(getApplicationContext()).o00ooo0o();
    }

    public void o00oOo0O() {
        this.f5730o00oo0o0.o00oo0O0(new ListenableWorker.o00oOOo0.o00oOOoO());
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOo0o(@oo0oO0 List<String> list) {
    }

    public void o00oOoO0() {
        String o00ooO0o2 = getInputData().o00ooO0o(f5725o0O0o);
        if (TextUtils.isEmpty(o00ooO0o2)) {
            o0O00000.o00oOo00().o00oOOoO(f5724o00oo0oO, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker o00oOOoO2 = getWorkerFactory().o00oOOoO(getApplicationContext(), o00ooO0o2, this.f5727o00oo0O0);
            this.f5729o00oo0o = o00oOOoO2;
            if (o00oOOoO2 != null) {
                o0OoO00O o00oOoOO2 = o00oOo00().o00ooo0O().o00oOoOO(getId().toString());
                if (o00oOoOO2 == null) {
                    o00oOooO();
                    return;
                }
                o00oo0OO o00oo0oo = new o00oo0OO(getApplicationContext(), getTaskExecutor(), this);
                o00oo0oo.o00oOooO(Collections.singletonList(o00oOoOO2));
                if (!o00oo0oo.o00oOo00(getId().toString())) {
                    o0O00000.o00oOo00().o00oOOo0(f5724o00oo0oO, String.format("Constraints not met for delegate %s. Requesting retry.", o00ooO0o2), new Throwable[0]);
                    o00oOo0O();
                    return;
                }
                o0O00000.o00oOo00().o00oOOo0(f5724o00oo0oO, String.format("Constraints met for delegate %s", o00ooO0o2), new Throwable[0]);
                try {
                    ListenableFuture<ListenableWorker.o00oOOo0> startWork = this.f5729o00oo0o.startWork();
                    startWork.addListener(new o00oOOoO(startWork), getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    o0O00000 o00oOo002 = o0O00000.o00oOo00();
                    String str = f5724o00oo0oO;
                    o00oOo002.o00oOOo0(str, String.format("Delegated worker %s threw exception in startWork.", o00ooO0o2), th);
                    synchronized (this.f5726o00oo0O) {
                        if (this.f5728o00oo0Oo) {
                            o0O00000.o00oOo00().o00oOOo0(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            o00oOo0O();
                        } else {
                            o00oOooO();
                        }
                        return;
                    }
                }
            }
            o0O00000.o00oOo00().o00oOOo0(f5724o00oo0oO, "No worker to delegate to.", new Throwable[0]);
        }
        o00oOooO();
    }

    public void o00oOooO() {
        this.f5730o00oo0o0.o00oo0O0(new ListenableWorker.o00oOOo0.C0063o00oOOo0());
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5729o00oo0o;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f5729o00oo0o.stop();
    }

    @Override // androidx.work.ListenableWorker
    @oo0oO0
    public ListenableFuture<ListenableWorker.o00oOOo0> startWork() {
        getBackgroundExecutor().execute(new o00oOOo0());
        return this.f5730o00oo0o0;
    }
}
