package o0OOo00O;

import kotlin.Metadata;
import o00oOoO0.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010%\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010'\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006*"}, d2 = {"Lo0OOo00O/o0OOo000;", "Lo0OOo00O/o0O0o000;", "", "oo0oO0", "", "oo0ooO", "o0OO00OO", "Lo0OOo00O/o0OO0oO0;", "task", "Lo0OO0o/oO0Ooooo;", "o0O0ooo0", "unconfined", "o0O0oooO", "o0O0oo", "", "parallelism", "o0O0oOoo", "shutdown", "o0O0ooOO", "o00oo0Oo", "J", "useCount", "o00oo0o0", "Z", "shared", "Lo0OOo0o0/o0O0o0;", "o00oo0o", "Lo0OOo0o0/o0O0o0;", "unconfinedQueue", "o0O", "()Z", "isEmpty", "o0O0ooo", "()J", "nextTime", "isActive", "o0OO000", "isUnconfinedLoopActive", "o0OO000o", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0OOo000 extends o0O0o000 {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public long f14049o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o0OOo0o0.o0O0o0<o0OO0oO0<?>> f14050o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f14051o00oo0o0;

    public static /* synthetic */ void o0O0ooO0(o0OOo000 o0ooo000, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        o0ooo000.o0O0oo(z);
    }

    public static /* synthetic */ void o0O0oooo(o0OOo000 o0ooo000, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        o0ooo000.o0O0oooO(z);
    }

    public final boolean isActive() {
        return this.f14049o00oo0Oo > 0;
    }

    public boolean o0O() {
        return o0OO000o();
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public final o0O0o000 o0O0oOoo(int i) {
        o0OOo0o0.o0OO0oO.o00oOOo0(i);
        return this;
    }

    public final void o0O0oo(boolean z) {
        long o0O0ooOO2 = this.f14049o00oo0Oo - o0O0ooOO(z);
        this.f14049o00oo0Oo = o0O0ooOO2;
        if (o0O0ooOO2 <= 0 && this.f14051o00oo0o0) {
            shutdown();
        }
    }

    public final long o0O0ooOO(boolean z) {
        if (z) {
            return o00oOOoO.o00oOo00.f6911o00ooo0o;
        }
        return 1L;
    }

    public long o0O0ooo() {
        o0OOo0o0.o0O0o0<o0OO0oO0<?>> o0o0o0 = this.f14050o00oo0o;
        return (o0o0o0 == null || o0o0o0.o00oOooO()) ? Long.MAX_VALUE : 0L;
    }

    public final void o0O0ooo0(@NotNull o0OO0oO0<?> o0oo0oo0) {
        o0OOo0o0.o0O0o0<o0OO0oO0<?>> o0o0o0 = this.f14050o00oo0o;
        if (o0o0o0 == null) {
            o0o0o0 = new o0OOo0o0.o0O0o0<>();
            this.f14050o00oo0o = o0o0o0;
        }
        o0o0o0.o00oOOo0(o0oo0oo0);
    }

    public final void o0O0oooO(boolean z) {
        this.f14049o00oo0Oo = o0O0ooOO(z) + this.f14049o00oo0Oo;
        if (z) {
            return;
        }
        this.f14051o00oo0o0 = true;
    }

    public final boolean o0OO000() {
        return this.f14049o00oo0Oo >= o0O0ooOO(true);
    }

    public final boolean o0OO000o() {
        o0OOo0o0.o0O0o0<o0OO0oO0<?>> o0o0o0 = this.f14050o00oo0o;
        if (o0o0o0 != null) {
            return o0o0o0.o00oOooO();
        }
        return true;
    }

    public boolean o0OO00OO() {
        return false;
    }

    public long oo0oO0() {
        return !oo0ooO() ? Long.MAX_VALUE : 0L;
    }

    public final boolean oo0ooO() {
        o0OO0oO0<?> o00oOo0O2;
        o0OOo0o0.o0O0o0<o0OO0oO0<?>> o0o0o0 = this.f14050o00oo0o;
        if (o0o0o0 == null || (o00oOo0O2 = o0o0o0.o00oOo0O()) == null) {
            return false;
        }
        o00oOo0O2.run();
        return true;
    }

    public void shutdown() {
    }
}
