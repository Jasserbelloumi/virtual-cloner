package o0OOo0o0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import o0.o00oOOo0;
import o0OOo0o0.oO000O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, d2 = {"Lo0OOo0o0/oO000O0;", "S", "Lo0OOo0o0/oo0oO0;", "", "o00oo0Oo", "()Z", "o00oo0", "Lo0OO0o/oO0Ooooo;", "o00oo0O", "()V", "", "o00oOo00", "J", "o00oo0OO", "()J", "id", "", "o00oo0O0", "()I", "maxSlots", "o00oOoO0", "removed", "prev", "pointers", "<init>", "(JLo0OOo0o0/oO000O0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oO000O0<S extends oO000O0<S>> extends oo0oO0<S> {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14646o00oOooO = AtomicIntegerFieldUpdater.newUpdater(oO000O0.class, "cleanedAndPointers");
    @NotNull
    private volatile /* synthetic */ int cleanedAndPointers;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final long f14647o00oOo00;

    public oO000O0(long j, @Nullable S s, int i) {
        super(s);
        this.f14647o00oOo00 = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // o0OOo0o0.oo0oO0
    public boolean o00oOoO0() {
        return this.cleanedAndPointers == o00oo0O0() && !o00oOoOO();
    }

    public final boolean o00oo0() {
        return f14646o00oOooO.addAndGet(this, o00oOOo0.f6865o00oOo00) == o00oo0O0() && !o00oOoOO();
    }

    public final void o00oo0O() {
        if (f14646o00oOooO.incrementAndGet(this) != o00oo0O0() || o00oOoOO()) {
            return;
        }
        o00oOooo();
    }

    public abstract int o00oo0O0();

    public final long o00oo0OO() {
        return this.f14647o00oOo00;
    }

    public final boolean o00oo0Oo() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != o00oo0O0() || o00oOoOO())) {
                return false;
            }
        } while (!f14646o00oOooO.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
