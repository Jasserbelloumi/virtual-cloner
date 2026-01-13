package o0OOo00O;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OOo00O.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lo0OOo00O/oO00000o;", "Lo0OOo00O/oO00000;", "Lo0OOo00O/o0OO0;", "Lo0OO/o00oo0;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo0OO0o/oO0Ooooo;", "oo0oOOo", "", "timeMillis", "Lo0OOo00O/o0O000Oo;", "continuation", "o00oOo0O", "Lo0OOo00O/o0OOO0OO;", "o0O000O", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "o0O0ooOO", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "o0O0ooO0", "Ljava/util/concurrent/Executor;", "o00oo0o0", "Ljava/util/concurrent/Executor;", "o0O0oo", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00000o extends oO00000 implements o0OO0 {
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Executor f14064o00oo0o0;

    public oO00000o(@NotNull Executor executor) {
        this.f14064o00oo0o0 = executor;
        o0OOo0o0.o0OO000.o00oOo00(executor);
    }

    @Override // o0OOo00O.oO00000, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.f14064o00oo0o0;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof oO00000o) && ((oO00000o) obj).f14064o00oo0o0 == this.f14064o00oo0o0;
    }

    public int hashCode() {
        return System.identityHashCode(this.f14064o00oo0o0);
    }

    @Override // o0OOo00O.o0OO0
    public void o00oOo0O(long j, @NotNull o0O000Oo<? super o0OO0o.oO0Ooooo> o0o000oo) {
        Executor executor = this.f14064o00oo0o0;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> o0O0ooOO2 = scheduledExecutorService != null ? o0O0ooOO(scheduledExecutorService, new oO00o00O(this, o0o000oo), o0o000oo.getContext(), j) : null;
        if (o0O0ooOO2 != null) {
            oO0O0OoO.o00oOOo0(o0o000oo, o0O0ooOO2);
        } else {
            o0OO00OO.f14022o00oo.o00oOo0O(j, o0o000oo);
        }
    }

    @Override // o0OOo00O.o0OO0
    @NotNull
    public o0OOO0OO o0O000O(long j, @NotNull Runnable runnable, @NotNull o0OO.o00oo0 o00oo0Var) {
        Executor executor = this.f14064o00oo0o0;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> o0O0ooOO2 = scheduledExecutorService != null ? o0O0ooOO(scheduledExecutorService, runnable, o00oo0Var, j) : null;
        return o0O0ooOO2 != null ? new o0OOO0O(o0O0ooOO2) : o0OO00OO.f14022o00oo.o0OO0o0(j, runnable);
    }

    @Override // o0OOo00O.o0OO0
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object o0O0o0oO(long j, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0.o00oOOo0.o00oOOo0(this, j, o00ooo0o2);
    }

    @Override // o0OOo00O.oO00000
    @NotNull
    public Executor o0O0oo() {
        return this.f14064o00oo0o0;
    }

    public final void o0O0ooO0(o0OO.o00oo0 o00oo0Var, RejectedExecutionException rejectedExecutionException) {
        oO00O0o0.o00oOo0o(o00oo0Var, o.o00oOOo0("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> o0O0ooOO(ScheduledExecutorService scheduledExecutorService, Runnable runnable, o0OO.o00oo0 o00oo0Var, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            o0O0ooO0(o00oo0Var, e);
            return null;
        }
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = this.f14064o00oo0o0;
            o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
            if (o00oOOoO2 == null || (runnable2 = o00oOOoO2.o00oOoOO(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException e) {
            o00oo00O o00oOOoO3 = o00oo0.o00oOOoO();
            if (o00oOOoO3 != null) {
                o00oOOoO3.o00oOo0o();
            }
            o0O0ooO0(o00oo0Var, e);
            o0OOO00.o00oOo00().oo0oOOo(o00oo0Var, runnable);
        }
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        return this.f14064o00oo0o0.toString();
    }
}
