package androidx.work;

import android.annotation.SuppressLint;
import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00000;
import o0O0Ooo0.o0;
import o0O0Ooo0.o00ooO0;
import o0O0Ooo0.o0O00;
import o0O0Ooo0.o0O00OOO;
/* loaded from: classes.dex */
public final class o00oOOo0 {
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f5735o00oo00O = 20;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Executor f5736o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Executor f5737o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O00OOO f5738o00oOo00;
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0O00 f5739o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o00ooO0 f5740o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final int f5741o00oOoO;
    @o0OO00OO

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final String f5742o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int f5743o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final int f5744o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final int f5745o00oOoo0;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0 f5746o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final boolean f5747o00oOooo;

    /* renamed from: androidx.work.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0067o00oOOo0 implements ThreadFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AtomicInteger f5748o00oOOo0 = new AtomicInteger(0);

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ boolean f5749o00oOOoO;

        public ThreadFactoryC0067o00oOOo0(boolean z) {
            this.f5749o00oOOoO = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(this.f5749o00oOOoO ? "WM.task-" : "androidx.work-");
            o00oOOo02.append(this.f5748o00oOOo0.incrementAndGet());
            return new Thread(runnable, o00oOOo02.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Executor f5751o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0O00OOO f5752o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0 f5753o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o0O00 f5754o00oOo0O;
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public o00ooO0 f5755o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f5756o00oOoO;
        @o0OO00OO

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public String f5757o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f5758o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f5759o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f5760o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Executor f5761o00oOooO;

        public o00oOOoO() {
            this.f5756o00oOoO = 4;
            this.f5758o00oOoOO = 0;
            this.f5759o00oOoOo = Integer.MAX_VALUE;
            this.f5760o00oOoo0 = 20;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public o00oOOoO(@oo0oO0 o00oOOo0 o00oooo02) {
            this.f5751o00oOOo0 = o00oooo02.f5736o00oOOo0;
            this.f5752o00oOOoO = o00oooo02.f5738o00oOo00;
            this.f5753o00oOo00 = o00oooo02.f5746o00oOooO;
            this.f5761o00oOooO = o00oooo02.f5737o00oOOoO;
            this.f5756o00oOoO = o00oooo02.f5741o00oOoO;
            this.f5758o00oOoOO = o00oooo02.f5743o00oOoOO;
            this.f5759o00oOoOo = o00oooo02.f5744o00oOoOo;
            this.f5760o00oOoo0 = o00oooo02.f5745o00oOoo0;
            this.f5754o00oOo0O = o00oooo02.f5739o00oOo0O;
            this.f5755o00oOo0o = o00oooo02.f5740o00oOo0o;
            this.f5757o00oOoO0 = o00oooo02.f5742o00oOoO0;
        }

        @oo0oO0
        public o00oOOo0 o00oOOo0() {
            return new o00oOOo0(this);
        }

        @oo0oO0
        public o00oOOoO o00oOOoO(@oo0oO0 String str) {
            this.f5757o00oOoO0 = str;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo00(@oo0oO0 Executor executor) {
            this.f5751o00oOOo0 = executor;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo0O(@oo0oO0 o0 o0Var) {
            this.f5753o00oOo00 = o0Var;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOo0o(int i, int i2) {
            if (i2 - i >= 1000) {
                this.f5758o00oOoOO = i;
                this.f5759o00oOoOo = i2;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        @oo0oO0
        public o00oOOoO o00oOoO(int i) {
            this.f5756o00oOoO = i;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOoO0(int i) {
            if (i >= 20) {
                this.f5760o00oOoo0 = Math.min(i, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }

        @oo0oO0
        public o00oOOoO o00oOoOO(@oo0oO0 o0O00 o0o00) {
            this.f5754o00oOo0O = o0o00;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOoOo(@oo0oO0 Executor executor) {
            this.f5761o00oOooO = executor;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOoo0(@oo0oO0 o0O00OOO o0o00ooo) {
            this.f5752o00oOOoO = o0o00ooo;
            return this;
        }

        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public o00oOOoO o00oOooO(@oo0oO0 o00ooO0 o00ooo02) {
            this.f5755o00oOo0o = o00ooo02;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        @oo0oO0
        o00oOOo0 o00oOOo0();
    }

    public o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2) {
        Executor executor = o00ooooo2.f5751o00oOOo0;
        this.f5736o00oOOo0 = executor == null ? o00oOOo0(false) : executor;
        Executor executor2 = o00ooooo2.f5761o00oOooO;
        if (executor2 == null) {
            this.f5747o00oOooo = true;
            executor2 = o00oOOo0(true);
        } else {
            this.f5747o00oOooo = false;
        }
        this.f5737o00oOOoO = executor2;
        o0O00OOO o0o00ooo = o00ooooo2.f5752o00oOOoO;
        this.f5738o00oOo00 = o0o00ooo == null ? o0O00OOO.o00oOo00() : o0o00ooo;
        o0 o0Var = o00ooooo2.f5753o00oOo00;
        this.f5746o00oOooO = o0Var == null ? new o0.o00oOOo0() : o0Var;
        o0O00 o0o00 = o00ooooo2.f5754o00oOo0O;
        this.f5739o00oOo0O = o0o00 == null ? new o0O00000() : o0o00;
        this.f5741o00oOoO = o00ooooo2.f5756o00oOoO;
        this.f5743o00oOoOO = o00ooooo2.f5758o00oOoOO;
        this.f5744o00oOoOo = o00ooooo2.f5759o00oOoOo;
        this.f5745o00oOoo0 = o00ooooo2.f5760o00oOoo0;
        this.f5740o00oOo0o = o00ooooo2.f5755o00oOo0o;
        this.f5742o00oOoO0 = o00ooooo2.f5757o00oOoO0;
    }

    @oo0oO0
    public final Executor o00oOOo0(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0067o00oOOo0(z));
    }

    @oo0oO0
    public final ThreadFactory o00oOOoO(boolean z) {
        return new ThreadFactoryC0067o00oOOo0(z);
    }

    @o0OO00OO
    public String o00oOo00() {
        return this.f5742o00oOoO0;
    }

    @oo0oO0
    public Executor o00oOo0O() {
        return this.f5736o00oOOo0;
    }

    @oo0oO0
    public o0 o00oOo0o() {
        return this.f5746o00oOooO;
    }

    @o0O0o00O(from = DefaultLivePlaybackSpeedControl.DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED, to = 50)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public int o00oOoO() {
        return this.f5745o00oOoo0;
    }

    public int o00oOoO0() {
        return this.f5744o00oOoOo;
    }

    public int o00oOoOO() {
        return this.f5743o00oOoOO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public int o00oOoOo() {
        return this.f5741o00oOoO;
    }

    @oo0oO0
    public o0O00 o00oOoo0() {
        return this.f5739o00oOo0O;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00ooO0 o00oOooO() {
        return this.f5740o00oOo0o;
    }

    @oo0oO0
    public Executor o00oOooo() {
        return this.f5737o00oOOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean o00oo0() {
        return this.f5747o00oOooo;
    }

    @oo0oO0
    public o0O00OOO o00oo00O() {
        return this.f5738o00oOo00;
    }
}
