package o0OOo00O;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import o0OOo00O.o0o0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\bA\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u000f\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0015R\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00106\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00109\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;¨\u0006B"}, d2 = {"Lo0OOo00O/o0OO00OO;", "Lo0OOo00O/o0o0000;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "Lo0OO0o/oO0Ooooo;", "o0OO0O0", "", "now", "Lo0OOo00O/o0o0000$o00oOo00;", "delayedTask", "o0OO00Oo", "shutdown", "timeMillis", "block", "Lo0OO/o00oo0;", "context", "Lo0OOo00O/o0OOO0OO;", "o0O000O", "run", "o0OO0oO", "()V", "timeout", o0O0oooo.o0OO.f12828o00oOOo0, "o0OO0ooo", "Ljava/lang/Thread;", o0O0oooo.o0OO0oO0.f12914o00oOOoO, "", "o0OO0ooO", "o0OO0o", "", "o00ooO00", "Ljava/lang/String;", "THREAD_NAME", "o00ooO0", "J", "DEFAULT_KEEP_ALIVE_MS", "o00ooO0O", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "o00ooO0o", "I", "FRESH", "o00ooO", "ACTIVE", "o00ooOO0", "SHUTDOWN_REQ", "o00ooOO", "SHUTDOWN_ACK", "o00ooOOo", "SHUTDOWN", "debugStatus", "o0OO00oo", "()Ljava/lang/Thread;", "thread", "o0OO0oo0", "()Z", "isThreadPresent", "o0OOoooO", "isShutDown", "o0OO0oOo", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO00OO extends o0o0000 implements Runnable {
    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @NotNull

    /* renamed from: o00oo  reason: collision with root package name */
    public static final o0OO00OO f14022o00oo;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f14023o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final long f14024o00ooO0 = 1000;
    @NotNull

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f14025o00ooO00 = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final long f14026o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f14027o00ooO0o = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f14028o00ooOO = 3;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f14029o00ooOO0 = 2;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f14030o00ooOOo = 4;

    static {
        Long l;
        o0OO00OO o0oo00oo = new o0OO00OO();
        f14022o00oo = o0oo00oo;
        o0OOo000.o0O0oooo(o0oo00oo, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f14026o00ooO0O = timeUnit.toNanos(l.longValue());
    }

    public static /* synthetic */ void o0OO0oOO() {
    }

    @Override // o0OOo00O.o0o0000, o0OOo00O.o0OO0
    @NotNull
    public o0OOO0OO o0O000O(long j, @NotNull Runnable runnable, @NotNull o0OO.o00oo0 o00oo0Var) {
        return o0OO0o0(j, runnable);
    }

    public final synchronized void o0OO(long j) {
        o0OO0o.oO0Ooooo oo0ooooo;
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (!o0OO0oOo()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
                if (o00oOOoO2 != null) {
                    o00oOOoO2.o00oOoO0(thread);
                    oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                } else {
                    oo0ooooo = null;
                }
                if (oo0ooooo == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j);
        }
        debugStatus = 0;
    }

    @Override // o0OOo00O.oO0Oo
    public void o0OO00Oo(long j, @NotNull o0o0000.o00oOo00 o00ooo002) {
        o0OO0ooo();
    }

    @Override // o0OOo00O.oO0Oo
    @NotNull
    public Thread o0OO00oo() {
        Thread thread = _thread;
        return thread == null ? o0OO0oO0() : thread;
    }

    @Override // o0OOo00O.o0o0000
    public void o0OO0O0(@NotNull Runnable runnable) {
        if (o0OOoooO()) {
            o0OO0ooo();
        }
        super.o0OO0O0(runnable);
    }

    public final synchronized void o0OO0o() {
        if (o0OO0oOo()) {
            debugStatus = 3;
            o0OOooO0();
            notifyAll();
        }
    }

    public final synchronized void o0OO0oO() {
        debugStatus = 0;
        o0OO0oO0();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final synchronized Thread o0OO0oO0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f14025o00ooO00);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean o0OO0oOo() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final boolean o0OO0oo0() {
        return _thread != null;
    }

    public final synchronized boolean o0OO0ooO() {
        if (o0OO0oOo()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void o0OO0ooo() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final boolean o0OOoooO() {
        return debugStatus == 4;
    }

    @Override // java.lang.Runnable
    public void run() {
        o0OO0o.oO0Ooooo oo0ooooo;
        boolean o0O2;
        oO0O00.f14094o00oOOo0.o00oOooO(this);
        o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.o00oOooO();
        }
        try {
            if (!o0OO0ooO()) {
                if (o0O2) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long oo0oO02 = oo0oO0();
                if (oo0oO02 == Long.MAX_VALUE) {
                    o00oo00O o00oo00o = o00oo0.f13979o00oOOo0;
                    long o00oOOoO3 = o00oo00o != null ? o00oo00o.o00oOOoO() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f14026o00ooO0O + o00oOOoO3;
                    }
                    long j2 = j - o00oOOoO3;
                    if (j2 <= 0) {
                        _thread = null;
                        o0OO0o();
                        o00oo00O o00oo00o2 = o00oo0.f13979o00oOOo0;
                        if (o00oo00o2 != null) {
                            o00oo00o2.o00oOoO();
                        }
                        if (o0O()) {
                            return;
                        }
                        o0OO00oo();
                        return;
                    } else if (oo0oO02 > j2) {
                        oo0oO02 = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (oo0oO02 > 0) {
                    if (o0OO0oOo()) {
                        _thread = null;
                        o0OO0o();
                        o00oo00O o00oo00o3 = o00oo0.f13979o00oOOo0;
                        if (o00oo00o3 != null) {
                            o00oo00o3.o00oOoO();
                        }
                        if (o0O()) {
                            return;
                        }
                        o0OO00oo();
                        return;
                    }
                    o00oo00O o00oo00o4 = o00oo0.f13979o00oOOo0;
                    if (o00oo00o4 != null) {
                        o00oo00o4.o00oOo00(this, oo0oO02);
                        oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                    } else {
                        oo0ooooo = null;
                    }
                    if (oo0ooooo == null) {
                        LockSupport.parkNanos(this, oo0oO02);
                    }
                }
            }
        } finally {
            _thread = null;
            o0OO0o();
            o00oo00O o00oo00o5 = o00oo0.f13979o00oOOo0;
            if (o00oo00o5 != null) {
                o00oo00o5.o00oOoO();
            }
            if (!o0O()) {
                o0OO00oo();
            }
        }
    }

    @Override // o0OOo00O.o0o0000, o0OOo00O.o0OOo000
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
