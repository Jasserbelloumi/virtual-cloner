package o0OOo0oO;

import androidx.concurrent.futures.o00oOo00;
import com.google.common.util.concurrent.o00oOOo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lo0OOo0oO/oO0Oo0o0;", "", "Lo0OOo0oO/ooOOO00O;", "o00oOoO", "()Lo0OOo0oO/ooOOO00O;", "task", "", "fair", "o00oOOo0", "(Lo0OOo0oO/ooOOO00O;Z)Lo0OOo0oO/ooOOO00O;", "victim", "", "o00oOooo", "(Lo0OOo0oO/oO0Oo0o0;)J", "o00oOoo0", "Lo0OOo0oO/oO0O0OO;", "globalQueue", "Lo0OO0o/oO0Ooooo;", "o00oOoO0", "(Lo0OOo0oO/oO0O0OO;)V", "o00oOo00", "(Lo0OOo0oO/ooOOO00O;)Lo0OOo0oO/ooOOO00O;", "blockingOnly", "o00oo00O", "(Lo0OOo0oO/oO0Oo0o0;Z)J", "queue", "o00oOoOo", "(Lo0OOo0oO/oO0O0OO;)Z", "o00oOoOO", "o00oOooO", "(Lo0OOo0oO/ooOOO00O;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "o00oOo0O", "()I", "bufferSize", "o00oOo0o", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0Oo0o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14702o00oOOoO = AtomicReferenceFieldUpdater.newUpdater(oO0Oo0o0.class, Object.class, "lastScheduledTask");

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14703o00oOo00 = AtomicIntegerFieldUpdater.newUpdater(oO0Oo0o0.class, "producerIndex");

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14705o00oOooO = AtomicIntegerFieldUpdater.newUpdater(oO0Oo0o0.class, "consumerIndex");

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14704o00oOo0O = AtomicIntegerFieldUpdater.newUpdater(oO0Oo0o0.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AtomicReferenceArray<ooOOO00O> f14706o00oOOo0 = new AtomicReferenceArray<>(128);
    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ ooOOO00O o00oOOoO(oO0Oo0o0 oo0oo0o0, ooOOO00O ooooo00o, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return oo0oo0o0.o00oOOo0(ooooo00o, z);
    }

    @Nullable
    public final ooOOO00O o00oOOo0(@NotNull ooOOO00O ooooo00o, boolean z) {
        if (z) {
            return o00oOo00(ooooo00o);
        }
        ooOOO00O ooooo00o2 = (ooOOO00O) f14702o00oOOoO.getAndSet(this, ooooo00o);
        if (ooooo00o2 == null) {
            return null;
        }
        return o00oOo00(ooooo00o2);
    }

    public final ooOOO00O o00oOo00(ooOOO00O ooooo00o) {
        if (ooooo00o.f14757o00oo0O.o0O0Oo() == 1) {
            f14704o00oOo0O.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return ooooo00o;
        }
        int i = this.producerIndex & 127;
        while (this.f14706o00oOOo0.get(i) != null) {
            Thread.yield();
        }
        this.f14706o00oOOo0.lazySet(i, ooooo00o);
        f14703o00oOo00.incrementAndGet(this);
        return null;
    }

    public final int o00oOo0O() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int o00oOo0o() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    @Nullable
    public final ooOOO00O o00oOoO() {
        ooOOO00O ooooo00o = (ooOOO00O) f14702o00oOOoO.getAndSet(this, null);
        return ooooo00o == null ? o00oOoOO() : ooooo00o;
    }

    public final void o00oOoO0(@NotNull oO0O0OO oo0o0oo) {
        ooOOO00O ooooo00o = (ooOOO00O) f14702o00oOOoO.getAndSet(this, null);
        if (ooooo00o != null) {
            oo0o0oo.o00oOOo0(ooooo00o);
        }
        do {
        } while (o00oOoOo(oo0o0oo));
    }

    public final ooOOO00O o00oOoOO() {
        ooOOO00O andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f14705o00oOooO.compareAndSet(this, i, i + 1) && (andSet = this.f14706o00oOOo0.getAndSet(i2, null)) != null) {
                o00oOooO(andSet);
                return andSet;
            }
        }
    }

    public final boolean o00oOoOo(oO0O0OO oo0o0oo) {
        ooOOO00O o00oOoOO2 = o00oOoOO();
        if (o00oOoOO2 == null) {
            return false;
        }
        oo0o0oo.o00oOOo0(o00oOoOO2);
        return true;
    }

    public final long o00oOoo0(@NotNull oO0Oo0o0 oo0oo0o0) {
        int i = oo0oo0o0.consumerIndex;
        int i2 = oo0oo0o0.producerIndex;
        AtomicReferenceArray<ooOOO00O> atomicReferenceArray = oo0oo0o0.f14706o00oOOo0;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (oo0oo0o0.blockingTasksInBuffer == 0) {
                break;
            }
            ooOOO00O ooooo00o = atomicReferenceArray.get(i3);
            if (ooooo00o != null) {
                if ((ooooo00o.f14757o00oo0O.o0O0Oo() == 1) && o00oOOo0.o00oOOo0(atomicReferenceArray, i3, ooooo00o, null)) {
                    f14704o00oOo0O.decrementAndGet(oo0oo0o0);
                    o00oOOoO(this, ooooo00o, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return o00oo00O(oo0oo0o0, true);
    }

    public final void o00oOooO(ooOOO00O ooooo00o) {
        if (ooooo00o != null) {
            if (ooooo00o.f14757o00oo0O.o0O0Oo() == 1) {
                f14704o00oOo0O.decrementAndGet(this);
            }
        }
    }

    public final long o00oOooo(@NotNull oO0Oo0o0 oo0oo0o0) {
        ooOOO00O o00oOoOO2 = oo0oo0o0.o00oOoOO();
        if (o00oOoOO2 != null) {
            o00oOOoO(this, o00oOoOO2, false, 2, null);
            return -1L;
        }
        return o00oo00O(oo0oo0o0, false);
    }

    public final long o00oo00O(oO0Oo0o0 oo0oo0o0, boolean z) {
        ooOOO00O ooooo00o;
        do {
            ooooo00o = (ooOOO00O) oo0oo0o0.lastScheduledTask;
            if (ooooo00o == null) {
                return -2L;
            }
            if (z) {
                if (!(ooooo00o.f14757o00oo0O.o0O0Oo() == 1)) {
                    return -2L;
                }
            }
            long o00oOOo02 = oO0OO0O.f14695o00oOo0o.o00oOOo0() - ooooo00o.f14758o00oo0O0;
            long j = oO0OO0O.f14692o00oOOoO;
            if (o00oOOo02 < j) {
                return j - o00oOOo02;
            }
        } while (!o00oOo00.o00oOOo0(f14702o00oOOoO, oo0oo0o0, ooooo00o, null));
        o00oOOoO(this, ooooo00o, false, 2, null);
        return -1L;
    }
}
