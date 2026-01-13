package o0OOo0o0;

import androidx.concurrent.futures.o00oOo00;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OoO00O;
import o0OOOO.o00oOOo0;
import o0OOOOO0.o0ooO;
import o0OOo0o0.oo0oO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Lo0OOo0o0/oo0oO0;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "o00oOoo0", "(Lo0OOOO/o00oOOo0;)Lo0OOo0o0/oo0oO0;", "value", "", "o00oo00O", "(Lo0OOo0o0/oo0oO0;)Z", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "()V", "o00oOoOo", "()Z", "o00oOooo", "o00oOooO", "()Lo0OOo0o0/oo0oO0;", "next", "o00oOoOO", "isTail", "o00oOo0o", "prev", "o00oOoO0", "removed", "o00oOo0O", "()Ljava/lang/Object;", "nextOrClosed", "o00oOo00", "leftmostAliveNode", "o00oOoO", "rightmostAliveNode", "<init>", "(Lo0OOo0o0/oo0oO0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oo0oO0<N extends oo0oO0<N>> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14670o00oOOo0 = AtomicReferenceFieldUpdater.newUpdater(oo0oO0.class, Object.class, "_next");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14671o00oOOoO = AtomicReferenceFieldUpdater.newUpdater(oo0oO0.class, Object.class, "_prev");
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ Object _prev;

    public oo0oO0(@Nullable N n) {
        this._prev = n;
    }

    public final void o00oOOoO() {
        f14671o00oOOoO.lazySet(this, null);
    }

    public final N o00oOo00() {
        N o00oOo0o2 = o00oOo0o();
        while (o00oOo0o2 != null && o00oOo0o2.o00oOoO0()) {
            o00oOo0o2 = (N) o00oOo0o2._prev;
        }
        return o00oOo0o2;
    }

    public final Object o00oOo0O() {
        return this._next;
    }

    @Nullable
    public final N o00oOo0o() {
        return (N) this._prev;
    }

    public final N o00oOoO() {
        N o00oOooO2 = o00oOooO();
        while (true) {
            o0ooO.o00oo00O(o00oOooO2);
            if (!o00oOooO2.o00oOoO0()) {
                return o00oOooO2;
            }
            o00oOooO2 = (N) o00oOooO2.o00oOooO();
        }
    }

    public abstract boolean o00oOoO0();

    public final boolean o00oOoOO() {
        return o00oOooO() == null;
    }

    public final boolean o00oOoOo() {
        return o00oOo00.o00oOOo0(f14670o00oOOo0, this, null, o0OO000o.o00oOOo0());
    }

    @Nullable
    public final N o00oOoo0(@NotNull o00oOOo0 o00oooo02) {
        Object o00oOo0O2 = o00oOo0O();
        if (o00oOo0O2 != o0OO000o.o00oOOo0()) {
            return (N) o00oOo0O2;
        }
        o00oooo02.invoke();
        throw new o0OoO00O();
    }

    @Nullable
    public final N o00oOooO() {
        Object o00oOo0O2 = o00oOo0O();
        if (o00oOo0O2 == o0OO000o.o00oOOo0()) {
            return null;
        }
        return (N) o00oOo0O2;
    }

    public final void o00oOooo() {
        while (true) {
            N o00oOo002 = o00oOo00();
            N o00oOoO2 = o00oOoO();
            o00oOoO2._prev = o00oOo002;
            if (o00oOo002 != null) {
                o00oOo002._next = o00oOoO2;
            }
            if (!o00oOoO2.o00oOoO0() && (o00oOo002 == null || !o00oOo002.o00oOoO0())) {
                return;
            }
        }
    }

    public final boolean o00oo00O(@NotNull N n) {
        return o00oOo00.o00oOOo0(f14670o00oOOo0, this, null, n);
    }
}
