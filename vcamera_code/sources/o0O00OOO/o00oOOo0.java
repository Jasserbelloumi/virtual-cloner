package o0O00OOO;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.o00ooO0;
import java.util.ArrayList;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final ThreadLocal<o00oOOo0> f10911o00oOoO = new ThreadLocal<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final long f10912o00oOoO0 = 10;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00ooO0<o00oOOoO, Long> f10913o00oOOo0 = new o00ooO0<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f10914o00oOOoO = new ArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final C0139o00oOOo0 f10915o00oOo00 = new C0139o00oOOo0();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public long f10916o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f10917o00oOo0o = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOo00 f10918o00oOooO;

    /* renamed from: o0O00OOO.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0139o00oOOo0 {
        public C0139o00oOOo0() {
        }

        public void o00oOOo0() {
            o00oOOo0.this.f10916o00oOo0O = SystemClock.uptimeMillis();
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.o00oOo00(o00oooo02.f10916o00oOo0O);
            if (o00oOOo0.this.f10914o00oOOoO.size() > 0) {
                o00oOOo0.this.o00oOo0o().o00oOOo0();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        boolean o00oOOo0(long j);
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final C0139o00oOOo0 f10920o00oOOo0;

        public o00oOo00(C0139o00oOOo0 c0139o00oOOo0) {
            this.f10920o00oOOo0 = c0139o00oOOo0;
        }

        public abstract void o00oOOo0();
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Runnable f10921o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Handler f10922o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public long f10923o00oOooO;

        /* renamed from: o0O00OOO.o00oOOo0$o00oOo0O$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0140o00oOOo0 implements Runnable {
            public RunnableC0140o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOo0O.this.f10923o00oOooO = SystemClock.uptimeMillis();
                o00oOo0O.this.f10920o00oOOo0.o00oOOo0();
            }
        }

        public o00oOo0O(C0139o00oOOo0 c0139o00oOOo0) {
            super(c0139o00oOOo0);
            this.f10923o00oOooO = -1L;
            this.f10921o00oOOoO = new RunnableC0140o00oOOo0();
            this.f10922o00oOo00 = new Handler(Looper.myLooper());
        }

        @Override // o0O00OOO.o00oOOo0.o00oOo00
        public void o00oOOo0() {
            this.f10922o00oOo00.postDelayed(this.f10921o00oOOoO, Math.max(10 - (SystemClock.uptimeMillis() - this.f10923o00oOooO), 0L));
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Choreographer f10925o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Choreographer.FrameCallback f10926o00oOo00;

        /* renamed from: o0O00OOO.o00oOOo0$o00oOoO$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0141o00oOOo0 implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0141o00oOOo0() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                o00oOoO.this.f10920o00oOOo0.o00oOOo0();
            }
        }

        public o00oOoO(C0139o00oOOo0 c0139o00oOOo0) {
            super(c0139o00oOOo0);
            this.f10925o00oOOoO = Choreographer.getInstance();
            this.f10926o00oOo00 = new Choreographer$FrameCallbackC0141o00oOOo0();
        }

        @Override // o0O00OOO.o00oOOo0.o00oOo00
        public void o00oOOo0() {
            this.f10925o00oOOoO.postFrameCallback(this.f10926o00oOo00);
        }
    }

    public static o00oOOo0 o00oOo0O() {
        ThreadLocal<o00oOOo0> threadLocal = f10911o00oOoO;
        if (threadLocal.get() == null) {
            threadLocal.set(new o00oOOo0());
        }
        return threadLocal.get();
    }

    public static long o00oOooO() {
        ThreadLocal<o00oOOo0> threadLocal = f10911o00oOoO;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f10916o00oOo0O;
    }

    public void o00oOOo0(o00oOOoO o00ooooo2, long j) {
        if (this.f10914o00oOOoO.size() == 0) {
            o00oOo0o().o00oOOo0();
        }
        if (!this.f10914o00oOOoO.contains(o00ooooo2)) {
            this.f10914o00oOOoO.add(o00ooooo2);
        }
        if (j > 0) {
            this.f10913o00oOOo0.put(o00ooooo2, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public final void o00oOOoO() {
        if (this.f10917o00oOo0o) {
            for (int size = this.f10914o00oOOoO.size() - 1; size >= 0; size--) {
                if (this.f10914o00oOOoO.get(size) == null) {
                    this.f10914o00oOOoO.remove(size);
                }
            }
            this.f10917o00oOo0o = false;
        }
    }

    public void o00oOo00(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f10914o00oOOoO.size(); i++) {
            o00oOOoO o00ooooo2 = this.f10914o00oOOoO.get(i);
            if (o00ooooo2 != null && o00oOoO0(o00ooooo2, uptimeMillis)) {
                o00ooooo2.o00oOOo0(j);
            }
        }
        o00oOOoO();
    }

    public o00oOo00 o00oOo0o() {
        if (this.f10918o00oOooO == null) {
            this.f10918o00oOooO = new o00oOoO(this.f10915o00oOo00);
        }
        return this.f10918o00oOooO;
    }

    public void o00oOoO(o00oOOoO o00ooooo2) {
        this.f10913o00oOOo0.remove(o00ooooo2);
        int indexOf = this.f10914o00oOOoO.indexOf(o00ooooo2);
        if (indexOf >= 0) {
            this.f10914o00oOOoO.set(indexOf, null);
            this.f10917o00oOo0o = true;
        }
    }

    public final boolean o00oOoO0(o00oOOoO o00ooooo2, long j) {
        Long l = this.f10913o00oOOo0.get(o00ooooo2);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f10913o00oOOo0.remove(o00ooooo2);
            return true;
        }
        return false;
    }

    public void o00oOoOO(o00oOo00 o00ooo002) {
        this.f10918o00oOooO = o00ooo002;
    }
}
