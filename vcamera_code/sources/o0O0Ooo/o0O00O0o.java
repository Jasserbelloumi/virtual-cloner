package o0O0Ooo;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0OoO00O;
import o0O0o0OO.o00oo0;
import o0O0o0Oo.o00oo0O0;
import o0O0o0Oo.o0O00OOO;
import o0O0o0o.o00ooO;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00O0o implements Runnable {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f12107o00ooOoo = o0O0Ooo0.o0O00000.o00oOo0o("WorkerWrapper");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public String f12109o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f12110o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public List<o0OoOoOo> f12111o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o0O0o0Oo.o0OoO00O f12112o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public WorkerParameters.o00oOOo0 f12113o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public ListenableWorker f12114o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public o00oo0O0 f12115o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oo0 f12116o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public androidx.work.o00oOOo0 f12117o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public WorkDatabase f12118o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o0O0o0Oo.o0O00O0o f12119o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public List<String> f12120o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public o0O00OOO f12121o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public String f12122o00ooOOo;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public volatile boolean f12125o00ooOoO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public oO00O0oO f12126o0O0o;
    @oo0oO0

    /* renamed from: o00oo  reason: collision with root package name */
    public ListenableWorker.o00oOOo0 f12108o00oo = new ListenableWorker.o00oOOo0.C0063o00oOOo0();
    @oo0oO0

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public o00ooO<Boolean> f12124o00ooOo0 = o00ooO.o00oo0oO();
    @o0OO00OO

    /* renamed from: o00ooOo  reason: collision with root package name */
    public ListenableFuture<ListenableWorker.o00oOOo0> f12123o00ooOo = null;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00ooO f12127o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f12128o00oo0O0;

        public o00oOOo0(ListenableFuture listenableFuture, o00ooO o00ooo) {
            this.f12128o00oo0O0 = listenableFuture;
            this.f12127o00oo0O = o00ooo;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12128o00oo0O0.get();
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(o0O00O0o.f12107o00ooOoo, String.format("Starting work for %s", o0O00O0o.this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
                o0O00O0o o0o00o0o = o0O00O0o.this;
                o0o00o0o.f12123o00ooOo = o0o00o0o.f12114o00oo0oO.startWork();
                this.f12127o00oo0O.o00oo0Oo(o0O00O0o.this.f12123o00ooOo);
            } catch (Throwable th) {
                this.f12127o00oo0O.o00oo0O(th);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f12130o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00ooO f12131o00oo0O0;

        public o00oOOoO(o00ooO o00ooo, String str) {
            this.f12131o00oo0O0 = o00ooo;
            this.f12130o00oo0O = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.o00oOOo0 o00oooo02 = (ListenableWorker.o00oOOo0) this.f12131o00oo0O0.get();
                    if (o00oooo02 == null) {
                        o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(o0O00O0o.f12107o00ooOoo, String.format("%s returned a null result. Treating it as a failure.", o0O00O0o.this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
                    } else {
                        o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(o0O00O0o.f12107o00ooOoo, String.format("%s returned a %s result.", o0O00O0o.this.f12112o00oo0o.f12464o00oOo00, o00oooo02), new Throwable[0]);
                        o0O00O0o.this.f12108o00oo = o00oooo02;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(o0O00O0o.f12107o00ooOoo, String.format("%s failed because it threw an exception/error", this.f12130o00oo0O), e);
                } catch (CancellationException e2) {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(o0O00O0o.f12107o00ooOoo, String.format("%s was cancelled", this.f12130o00oo0O), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(o0O00O0o.f12107o00ooOoo, String.format("%s failed because it threw an exception/error", this.f12130o00oo0O), e);
                }
            } finally {
                o0O00O0o.this.o00oOo0o();
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Context f12133o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ListenableWorker f12134o00oOOoO;
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o00oo0 f12135o00oOo00;
        @oo0oO0

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public androidx.work.o00oOOo0 f12136o00oOo0O;
        @oo0oO0

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public WorkDatabase f12137o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public List<o0OoOoOo> f12138o00oOoO;
        @oo0oO0

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public String f12139o00oOoO0;
        @oo0oO0

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public WorkerParameters.o00oOOo0 f12140o00oOoOO = new WorkerParameters.o00oOOo0();
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oO00O0oO f12141o00oOooO;

        public o00oOo00(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 o00oo0 o00oo0Var, @oo0oO0 WorkDatabase workDatabase, @oo0oO0 String str) {
            this.f12133o00oOOo0 = context.getApplicationContext();
            this.f12141o00oOooO = oo00o0oo;
            this.f12135o00oOo00 = o00oo0Var;
            this.f12136o00oOo0O = o00oooo02;
            this.f12137o00oOo0o = workDatabase;
            this.f12139o00oOoO0 = str;
        }

        @oo0oO0
        public o0O00O0o o00oOOo0() {
            return new o0O00O0o(this);
        }

        @oo0oO0
        public o00oOo00 o00oOOoO(@o0OO00OO WorkerParameters.o00oOOo0 o00oooo02) {
            if (o00oooo02 != null) {
                this.f12140o00oOoOO = o00oooo02;
            }
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo00(@oo0oO0 List<o0OoOoOo> list) {
            this.f12138o00oOoO = list;
            return this;
        }

        @oo0oO0
        @o0o0000
        public o00oOo00 o00oOooO(@oo0oO0 ListenableWorker listenableWorker) {
            this.f12134o00oOOoO = listenableWorker;
            return this;
        }
    }

    public o0O00O0o(@oo0oO0 o00oOo00 o00ooo002) {
        this.f12110o00oo0O0 = o00ooo002.f12133o00oOOo0;
        this.f12126o0O0o = o00ooo002.f12141o00oOooO;
        this.f12116o00ooO0 = o00ooo002.f12135o00oOo00;
        this.f12109o00oo0O = o00ooo002.f12139o00oOoO0;
        this.f12111o00oo0Oo = o00ooo002.f12138o00oOoO;
        this.f12113o00oo0o0 = o00ooo002.f12140o00oOoOO;
        this.f12114o00oo0oO = o00ooo002.f12134o00oOOoO;
        this.f12117o00ooO00 = o00ooo002.f12136o00oOo0O;
        WorkDatabase workDatabase = o00ooo002.f12137o00oOo0o;
        this.f12118o00ooO0O = workDatabase;
        this.f12119o00ooO0o = workDatabase.o00ooo0O();
        this.f12115o00ooO = this.f12118o00ooO0O.o00ooOO0();
        this.f12121o00ooOO0 = this.f12118o00ooO0O.o00ooo0o();
    }

    public final String o00oOOo0(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f12109o00oo0O);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    @oo0oO0
    public ListenableFuture<Boolean> o00oOOoO() {
        return this.f12124o00ooOo0;
    }

    public final void o00oOo00(ListenableWorker.o00oOOo0 o00oooo02) {
        if (o00oooo02 instanceof ListenableWorker.o00oOOo0.o00oOo00) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(f12107o00ooOoo, String.format("Worker result SUCCESS for %s", this.f12122o00ooOOo), new Throwable[0]);
            if (!this.f12112o00oo0o.o00oOooO()) {
                o00oo00O();
                return;
            }
        } else if (o00oooo02 instanceof ListenableWorker.o00oOOo0.o00oOOoO) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(f12107o00ooOoo, String.format("Worker result RETRY for %s", this.f12122o00ooOOo), new Throwable[0]);
            o00oOoO0();
            return;
        } else {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(f12107o00ooOoo, String.format("Worker result FAILURE for %s", this.f12122o00ooOOo), new Throwable[0]);
            if (!this.f12112o00oo0o.o00oOooO()) {
                o00oOooo();
                return;
            }
        }
        o00oOoO();
    }

    public final void o00oOo0O(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f12119o00ooO0o.o00oOoO(str2) != o0OoO00O.o00oOOo0.CANCELLED) {
                this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.FAILED, str2);
            }
            linkedList.addAll(this.f12115o00ooO.o00oOOo0(str2));
        }
    }

    public void o00oOo0o() {
        if (!o00oo0()) {
            this.f12118o00ooO0O.o00oOo00();
            try {
                o0OoO00O.o00oOOo0 o00oOoO2 = this.f12119o00ooO0o.o00oOoO(this.f12109o00oo0O);
                this.f12118o00ooO0O.o00ooo0().o00oOOo0(this.f12109o00oo0O);
                if (o00oOoO2 == null) {
                    o00oOoOO(false);
                } else if (o00oOoO2 == o0OoO00O.o00oOOo0.RUNNING) {
                    o00oOo00(this.f12108o00oo);
                } else if (!o00oOoO2.isFinished()) {
                    o00oOoO0();
                }
                this.f12118o00ooO0O.o00ooO0o();
            } finally {
                this.f12118o00ooO0O.o00oOoOO();
            }
        }
        List<o0OoOoOo> list = this.f12111o00oo0Oo;
        if (list != null) {
            for (o0OoOoOo o0oooooo : list) {
                o0oooooo.o00oOOo0(this.f12109o00oo0O);
            }
            o0O000Oo.o00oOOoO(this.f12117o00ooO00, this.f12118o00ooO0O, this.f12111o00oo0Oo);
        }
    }

    public final void o00oOoO() {
        this.f12118o00ooO0O.o00oOo00();
        try {
            this.f12119o00ooO0o.o00ooOo0(this.f12109o00oo0O, System.currentTimeMillis());
            this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, this.f12109o00oo0O);
            this.f12119o00ooO0o.o00ooO(this.f12109o00oo0O);
            this.f12119o00ooO0o.o00oo0O0(this.f12109o00oo0O, -1L);
            this.f12118o00ooO0O.o00ooO0o();
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
            o00oOoOO(false);
        }
    }

    public final void o00oOoO0() {
        this.f12118o00ooO0O.o00oOo00();
        try {
            this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, this.f12109o00oo0O);
            this.f12119o00ooO0o.o00ooOo0(this.f12109o00oo0O, System.currentTimeMillis());
            this.f12119o00ooO0o.o00oo0O0(this.f12109o00oo0O, -1L);
            this.f12118o00ooO0O.o00ooO0o();
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
            o00oOoOO(true);
        }
    }

    public final void o00oOoOO(boolean z) {
        ListenableWorker listenableWorker;
        this.f12118o00ooO0O.o00oOo00();
        try {
            if (!this.f12118o00ooO0O.o00ooo0O().o00ooO0o()) {
                o0O0o0o0.o00oo0.o00oOo00(this.f12110o00oo0O0, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, this.f12109o00oo0O);
                this.f12119o00ooO0o.o00oo0O0(this.f12109o00oo0O, -1L);
            }
            if (this.f12112o00oo0o != null && (listenableWorker = this.f12114o00oo0oO) != null && listenableWorker.isRunInForeground()) {
                this.f12116o00ooO0.o00oOOo0(this.f12109o00oo0O);
            }
            this.f12118o00ooO0O.o00ooO0o();
            this.f12118o00ooO0O.o00oOoOO();
            this.f12124o00ooOo0.o00oo0O0(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f12118o00ooO0O.o00oOoOO();
            throw th;
        }
    }

    public final void o00oOoOo() {
        o0OoO00O.o00oOOo0 o00oOoO2 = this.f12119o00ooO0o.o00oOoO(this.f12109o00oo0O);
        if (o00oOoO2 == o0OoO00O.o00oOOo0.RUNNING) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f12109o00oo0O), new Throwable[0]);
            o00oOoOO(true);
            return;
        }
        o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("Status for %s is %s; not doing any work", this.f12109o00oo0O, o00oOoO2), new Throwable[0]);
        o00oOoOO(false);
    }

    public final void o00oOoo0() {
        androidx.work.o00oOOoO o00oOOoO2;
        if (o00oo0()) {
            return;
        }
        this.f12118o00ooO0O.o00oOo00();
        try {
            o0O0o0Oo.o0OoO00O o00oOoOO2 = this.f12119o00ooO0o.o00oOoOO(this.f12109o00oo0O);
            this.f12112o00oo0o = o00oOoOO2;
            if (o00oOoOO2 == null) {
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(f12107o00ooOoo, String.format("Didn't find WorkSpec for id %s", this.f12109o00oo0O), new Throwable[0]);
                o00oOoOO(false);
                this.f12118o00ooO0O.o00ooO0o();
            } else if (o00oOoOO2.f12463o00oOOoO != o0OoO00O.o00oOOo0.ENQUEUED) {
                o00oOoOo();
                this.f12118o00ooO0O.o00ooO0o();
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
            } else {
                if (o00oOoOO2.o00oOooO() || this.f12112o00oo0o.o00oOo00()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o0O0o0Oo.o0OoO00O o0ooo00o = this.f12112o00oo0o;
                    if (!(o0ooo00o.f12474o00oo0 == 0) && currentTimeMillis < o0ooo00o.o00oOOo0()) {
                        o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("Delaying execution for %s because it is being executed before schedule.", this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
                        o00oOoOO(true);
                        this.f12118o00ooO0O.o00ooO0o();
                        return;
                    }
                }
                this.f12118o00ooO0O.o00ooO0o();
                this.f12118o00ooO0O.o00oOoOO();
                if (this.f12112o00oo0o.o00oOooO()) {
                    o00oOOoO2 = this.f12112o00oo0o.f12465o00oOo0O;
                } else {
                    o0O0Ooo0.o00ooO o00oOOoO3 = this.f12117o00ooO00.f5746o00oOooO.o00oOOoO(this.f12112o00oo0o.f12472o00oOooO);
                    if (o00oOOoO3 == null) {
                        o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(f12107o00ooOoo, String.format("Could not create Input Merger %s", this.f12112o00oo0o.f12472o00oOooO), new Throwable[0]);
                        o00oOooo();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f12112o00oo0o.f12465o00oOo0O);
                    arrayList.addAll(this.f12119o00ooO0o.o00oOooo(this.f12109o00oo0O));
                    o00oOOoO2 = o00oOOoO3.o00oOOoO(arrayList);
                }
                androidx.work.o00oOOoO o00ooooo2 = o00oOOoO2;
                UUID fromString = UUID.fromString(this.f12109o00oo0O);
                List<String> list = this.f12120o00ooOO;
                WorkerParameters.o00oOOo0 o00oooo02 = this.f12113o00oo0o0;
                int i = this.f12112o00oo0o.f12471o00oOoo0;
                androidx.work.o00oOOo0 o00oooo03 = this.f12117o00ooO00;
                WorkerParameters workerParameters = new WorkerParameters(fromString, o00ooooo2, list, o00oooo02, i, o00oooo03.f5736o00oOOo0, this.f12126o0O0o, o00oooo03.f5738o00oOo00, new o0O0o0o0.o0OoOoOo(this.f12118o00ooO0O, this.f12126o0O0o), new o0O0o0o0.o0O000O(this.f12118o00ooO0O, this.f12116o00ooO0, this.f12126o0O0o));
                if (this.f12114o00oo0oO == null) {
                    this.f12114o00oo0oO = this.f12117o00ooO00.f5738o00oOo00.o00oOOoO(this.f12110o00oo0O0, this.f12112o00oo0o.f12464o00oOo00, workerParameters);
                }
                ListenableWorker listenableWorker = this.f12114o00oo0oO;
                if (listenableWorker == null) {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(f12107o00ooOoo, String.format("Could not create Worker %s", this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
                    o00oOooo();
                } else if (listenableWorker.isUsed()) {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOoO(f12107o00ooOoo, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f12112o00oo0o.f12464o00oOo00), new Throwable[0]);
                    o00oOooo();
                } else {
                    this.f12114o00oo0oO.setUsed();
                    if (!o00oo0OO()) {
                        o00oOoOo();
                    } else if (o00oo0()) {
                    } else {
                        o00ooO o00oo0oO2 = o00ooO.o00oo0oO();
                        o0O0o0o0.o0O000 o0o000 = new o0O0o0o0.o0O000(this.f12110o00oo0O0, this.f12112o00oo0o, this.f12114o00oo0oO, workerParameters.f5557o00oOoOo, this.f12126o0O0o);
                        this.f12126o0O0o.o00oOOo0().execute(o0o000);
                        o00ooO<Void> o00ooo = o0o000.f12578o00oo0O0;
                        o00ooo.addListener(new o00oOOo0(o00ooo, o00oo0oO2), this.f12126o0O0o.o00oOOo0());
                        o00oo0oO2.addListener(new o00oOOoO(o00oo0oO2, this.f12122o00ooOOo), this.f12126o0O0o.o00oOooO());
                    }
                }
            }
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOooO() {
        boolean z;
        this.f12125o00ooOoO = true;
        o00oo0();
        ListenableFuture<ListenableWorker.o00oOOo0> listenableFuture = this.f12123o00ooOo;
        if (listenableFuture != null) {
            z = listenableFuture.isDone();
            this.f12123o00ooOo.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f12114o00oo0oO;
        if (listenableWorker == null || z) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("WorkSpec %s is already done. Not interrupting.", this.f12112o00oo0o), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    @o0o0000
    public void o00oOooo() {
        this.f12118o00ooO0O.o00oOo00();
        try {
            o00oOo0O(this.f12109o00oo0O);
            this.f12119o00ooO0o.o00oo0oO(this.f12109o00oo0O, ((ListenableWorker.o00oOOo0.C0063o00oOOo0) this.f12108o00oo).f5545o00oOOo0);
            this.f12118o00ooO0O.o00ooO0o();
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
            o00oOoOO(false);
        }
    }

    public final boolean o00oo0() {
        if (this.f12125o00ooOoO) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12107o00ooOoo, String.format("Work interrupted for %s", this.f12122o00ooOOo), new Throwable[0]);
            o0OoO00O.o00oOOo0 o00oOoO2 = this.f12119o00ooO0o.o00oOoO(this.f12109o00oo0O);
            if (o00oOoO2 == null) {
                o00oOoOO(false);
            } else {
                o00oOoOO(!o00oOoO2.isFinished());
            }
            return true;
        }
        return false;
    }

    public final void o00oo00O() {
        this.f12118o00ooO0O.o00oOo00();
        try {
            this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.SUCCEEDED, this.f12109o00oo0O);
            this.f12119o00ooO0o.o00oo0oO(this.f12109o00oo0O, ((ListenableWorker.o00oOOo0.o00oOo00) this.f12108o00oo).f5546o00oOOo0);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f12115o00ooO.o00oOOo0(this.f12109o00oo0O)) {
                if (this.f12119o00ooO0o.o00oOoO(str) == o0OoO00O.o00oOOo0.BLOCKED && this.f12115o00ooO.o00oOOoO(str)) {
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(f12107o00ooOoo, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, str);
                    this.f12119o00ooO0o.o00ooOo0(str, currentTimeMillis);
                }
            }
            this.f12118o00ooO0O.o00ooO0o();
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
            o00oOoOO(false);
        }
    }

    public final boolean o00oo0OO() {
        this.f12118o00ooO0O.o00oOo00();
        try {
            boolean z = true;
            if (this.f12119o00ooO0o.o00oOoO(this.f12109o00oo0O) == o0OoO00O.o00oOOo0.ENQUEUED) {
                this.f12119o00ooO0o.o00oo0Oo(o0OoO00O.o00oOOo0.RUNNING, this.f12109o00oo0O);
                this.f12119o00ooO0o.o00ooOOo(this.f12109o00oo0O);
            } else {
                z = false;
            }
            this.f12118o00ooO0O.o00ooO0o();
            return z;
        } finally {
            this.f12118o00ooO0O.o00oOoOO();
        }
    }

    @Override // java.lang.Runnable
    @oO0Oo
    public void run() {
        List<String> o00oOOo02 = this.f12121o00ooOO0.o00oOOo0(this.f12109o00oo0O);
        this.f12120o00ooOO = o00oOOo02;
        this.f12122o00ooOOo = o00oOOo0(o00oOOo02);
        o00oOoo0();
    }
}
