package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.support.v4.media.o00oOo0O;
import androidx.annotation.Keep;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o00oOooO.o0O;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00OOO;
import o0O0Ooo0.o0O0o;
import o0O0o0o.o00ooO;
import o0oOo0O0.oO00O0oO;
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    @oo0oO0
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @oo0oO0
    private WorkerParameters mWorkerParams;

    /* loaded from: classes.dex */
    public static abstract class o00oOOo0 {

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0063o00oOOo0 extends o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final androidx.work.o00oOOoO f5545o00oOOo0;

            public C0063o00oOOo0() {
                this(androidx.work.o00oOOoO.f5763o00oOo00);
            }

            public C0063o00oOOo0(@oo0oO0 androidx.work.o00oOOoO o00ooooo2) {
                this.f5545o00oOOo0 = o00ooooo2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0063o00oOOo0.class != obj.getClass()) {
                    return false;
                }
                return this.f5545o00oOOo0.equals(((C0063o00oOOo0) obj).f5545o00oOOo0);
            }

            public int hashCode() {
                return this.f5545o00oOOo0.hashCode() + (C0063o00oOOo0.class.getName().hashCode() * 31);
            }

            @Override // androidx.work.ListenableWorker.o00oOOo0
            @oo0oO0
            public androidx.work.o00oOOoO o00oOo00() {
                return this.f5545o00oOOo0;
            }

            public String toString() {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Failure {mOutputData=");
                o00oOOo02.append(this.f5545o00oOOo0);
                o00oOOo02.append('}');
                return o00oOOo02.toString();
            }
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public static final class o00oOOoO extends o00oOOo0 {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && o00oOOoO.class == obj.getClass();
            }

            public int hashCode() {
                return o00oOOoO.class.getName().hashCode();
            }

            @Override // androidx.work.ListenableWorker.o00oOOo0
            @oo0oO0
            public androidx.work.o00oOOoO o00oOo00() {
                return androidx.work.o00oOOoO.f5763o00oOo00;
            }

            public String toString() {
                return "Retry";
            }
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public static final class o00oOo00 extends o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final androidx.work.o00oOOoO f5546o00oOOo0;

            public o00oOo00() {
                this(androidx.work.o00oOOoO.f5763o00oOo00);
            }

            public o00oOo00(@oo0oO0 androidx.work.o00oOOoO o00ooooo2) {
                this.f5546o00oOOo0 = o00ooooo2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || o00oOo00.class != obj.getClass()) {
                    return false;
                }
                return this.f5546o00oOOo0.equals(((o00oOo00) obj).f5546o00oOOo0);
            }

            public int hashCode() {
                return this.f5546o00oOOo0.hashCode() + (o00oOo00.class.getName().hashCode() * 31);
            }

            @Override // androidx.work.ListenableWorker.o00oOOo0
            @oo0oO0
            public androidx.work.o00oOOoO o00oOo00() {
                return this.f5546o00oOOo0;
            }

            public String toString() {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Success {mOutputData=");
                o00oOOo02.append(this.f5546o00oOOo0);
                o00oOOo02.append('}');
                return o00oOOo02.toString();
            }
        }

        @oo0oO0
        public static o00oOOo0 o00oOOo0() {
            return new C0063o00oOOo0();
        }

        @oo0oO0
        public static o00oOOo0 o00oOOoO(@oo0oO0 androidx.work.o00oOOoO o00ooooo2) {
            return new C0063o00oOOo0(o00ooooo2);
        }

        @oo0oO0
        public static o00oOOo0 o00oOo0O() {
            return new o00oOo00();
        }

        @oo0oO0
        public static o00oOOo0 o00oOo0o(@oo0oO0 androidx.work.o00oOOoO o00ooooo2) {
            return new o00oOo00(o00ooooo2);
        }

        @oo0oO0
        public static o00oOOo0 o00oOooO() {
            return new o00oOOoO();
        }

        @oo0oO0
        public abstract androidx.work.o00oOOoO o00oOo00();
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@oo0oO0 Context context, @oo0oO0 WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @oo0oO0
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f5553o00oOo0o;
    }

    @oo0oO0
    public ListenableFuture<o0O0o> getForegroundInfoAsync() {
        o00ooO o00oo0oO2 = o00ooO.o00oo0oO();
        o00oo0oO2.o00oo0O(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return o00oo0oO2;
    }

    @oo0oO0
    public final UUID getId() {
        return this.mWorkerParams.f5549o00oOOo0;
    }

    @oo0oO0
    public final o00oOOoO getInputData() {
        return this.mWorkerParams.f5550o00oOOoO;
    }

    @o0OOooO0(28)
    @o0OO00OO
    public final Network getNetwork() {
        return this.mWorkerParams.f5558o00oOooO.f5561o00oOo00;
    }

    @o0O0o00O(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5552o00oOo0O;
    }

    @oo0oO0
    public final Set<String> getTags() {
        return this.mWorkerParams.f5551o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public oO00O0oO getTaskExecutor() {
        return this.mWorkerParams.f5555o00oOoO0;
    }

    @o0OOooO0(24)
    @oo0oO0
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f5558o00oOooO.f5559o00oOOo0;
    }

    @o0OOooO0(24)
    @oo0oO0
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f5558o00oOooO.f5560o00oOOoO;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00OOO getWorkerFactory() {
        return this.mWorkerParams.f5554o00oOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @oo0oO0
    public final ListenableFuture<Void> setForegroundAsync(@oo0oO0 o0O0o o0o0o) {
        this.mRunInForeground = true;
        return this.mWorkerParams.f5557o00oOoOo.o00oOOo0(getApplicationContext(), getId(), o0o0o);
    }

    @oo0oO0
    public ListenableFuture<Void> setProgressAsync(@oo0oO0 o00oOOoO o00ooooo2) {
        return this.mWorkerParams.f5556o00oOoOO.o00oOOo0(getApplicationContext(), getId(), o00ooooo2);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @o0O
    @oo0oO0
    public abstract ListenableFuture<o00oOOo0> startWork();

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
