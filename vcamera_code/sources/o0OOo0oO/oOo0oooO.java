package o0OOo0oO;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OOo00O.oO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lo0OOo0oO/oOo0oooO;", "Lo0OOo00O/oO00000;", "Lo0OOo0oO/ooo0o;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "Lo0OO0o/oO0Ooooo;", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lo0OO/o00oo0;", "context", "block", "oo0oOOo", "(Lo0OO/o00oo0;Ljava/lang/Runnable;)V", "o0O0oOo", "", "toString", "()Ljava/lang/String;", "o0ooO", "", "tailDispatch", "o0O0ooO0", "(Ljava/lang/Runnable;Z)V", "Lo0OOo0oO/oO0O0O0o;", "o00oo0o0", "Lo0OOo0oO/oO0O0O0o;", "dispatcher", "", "o00oo0o", "I", "parallelism", "o00oo0oO", "Ljava/lang/String;", "name", "o0O0o", "o0O0Oo", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "o00oo", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "o0O0oo", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lo0OOo0oO/oO0O0O0o;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOo0oooO extends oO00000 implements ooo0o, Executor {

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14717o00ooO00 = AtomicIntegerFieldUpdater.newUpdater(oOo0oooO.class, "inFlightTasks");

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f14719o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final oO0O0O0o f14720o00oo0o0;
    @Nullable

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final String f14721o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f14722o0O0o;
    @NotNull

    /* renamed from: o00oo  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f14718o00oo = new ConcurrentLinkedQueue<>();
    @NotNull
    private volatile /* synthetic */ int inFlightTasks = 0;

    public oOo0oooO(@NotNull oO0O0O0o oo0o0o0o, int i, @Nullable String str, int i2) {
        this.f14720o00oo0o0 = oo0o0o0o;
        this.f14719o00oo0o = i;
        this.f14721o00oo0oO = str;
        this.f14722o0O0o = i2;
    }

    @Override // o0OOo00O.oO00000, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        o0O0ooO0(runnable, false);
    }

    @Override // o0OOo0oO.ooo0o
    public int o0O0Oo() {
        return this.f14722o0O0o;
    }

    @Override // o0OOo00O.o0O0o000
    public void o0O0oOo(@NotNull o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        o0O0ooO0(runnable, true);
    }

    @Override // o0OOo00O.oO00000
    @NotNull
    public Executor o0O0oo() {
        return this;
    }

    public final void o0O0ooO0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14717o00ooO00;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f14719o00oo0o) {
                this.f14720o00oo0o0.o0O0ooo(runnable, this, z);
                return;
            }
            this.f14718o00oo.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f14719o00oo0o) {
                return;
            }
            runnable = this.f14718o00oo.poll();
        } while (runnable != null);
    }

    @Override // o0OOo0oO.ooo0o
    public void o0ooO() {
        Runnable poll = this.f14718o00oo.poll();
        if (poll != null) {
            this.f14720o00oo0o0.o0O0ooo(poll, this, true);
            return;
        }
        f14717o00ooO00.decrementAndGet(this);
        Runnable poll2 = this.f14718o00oo.poll();
        if (poll2 == null) {
            return;
        }
        o0O0ooO0(poll2, true);
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        o0O0ooO0(runnable, false);
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        String str = this.f14721o00oo0oO;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f14720o00oo0o0 + ']';
        }
        return str;
    }
}
