package o0OOoO00;

import androidx.concurrent.futures.o00oOo00;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0O0OO;
import o0OOo00O.o0O00;
import o0OOo00O.o0O000Oo;
import o0OOo00O.o0OoO00O;
import o0OOo0o0.o0OO000o;
import o0OOo0o0.oO000O0;
import o0OOo0o0.oO000O0O;
import o0OOo0o0.oO0o0o;
import o0OOo0o0.oo0oO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lo0OOoO00/o00ooO;", "Lo0OOoO00/o00ooO0;", "", o00oOOoO.f12961o00oOo00, "()Z", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "release", "()V", "o00oOoO0", "Lo0OOo00O/o0O000Oo;", "cont", "o00oOoO", "(Lo0OOo00O/o0O000Oo;)Z", "o00oOoOo", "o00oOoOO", "", "o00oOOo0", "I", "permits", "Lkotlin/Function1;", "", "Lo0OOOO/o00oo;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00ooO implements o00ooO0 {
    @NotNull
    public volatile /* synthetic */ int _availablePermits;
    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;
    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;
    @NotNull
    private volatile /* synthetic */ Object head;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f14808o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OOOO.o00oo<Throwable, oO0Ooooo> f14809o00oOOoO;
    @NotNull
    private volatile /* synthetic */ Object tail;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14803o00oOo00 = AtomicReferenceFieldUpdater.newUpdater(o00ooO.class, Object.class, TtmlNode.TAG_HEAD);

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14807o00oOooO = AtomicLongFieldUpdater.newUpdater(o00ooO.class, "deqIdx");

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14804o00oOo0O = AtomicReferenceFieldUpdater.newUpdater(o00ooO.class, Object.class, "tail");

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14805o00oOo0o = AtomicLongFieldUpdater.newUpdater(o00ooO.class, "enqIdx");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14806o00oOoO0 = AtomicIntegerFieldUpdater.newUpdater(o00ooO.class, "_availablePermits");

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<Throwable, oO0Ooooo> {
        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            invoke2(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            o00ooO.this.release();
        }
    }

    public o00ooO(int i, int i2) {
        this.f14808o00oOOo0 = i;
        boolean z = true;
        if (!(i > 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (!((i2 < 0 || i2 > i) ? false : z)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("The number of acquired permits should be in 0..", i).toString());
        }
        o0O00000 o0o00000 = new o0O00000(0L, null, 2);
        this.head = o0o00000;
        this.tail = o0o00000;
        this._availablePermits = i - i2;
        this.f14809o00oOOoO = new o00oOOo0();
    }

    @Override // o0OOoO00.o00ooO0
    public int o00oOOo0() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // o0OOoO00.o00ooO0
    public boolean o00oOOoO() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!f14806o00oOoO0.compareAndSet(this, i, i - 1));
        return true;
    }

    @Override // o0OOoO00.o00ooO0
    @Nullable
    public Object o00oOo00(@NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOoO02;
        return (f14806o00oOoO0.getAndDecrement(this) <= 0 && (o00oOoO02 = o00oOoO0(o00ooo0o2)) == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) ? o00oOoO02 : oO0Ooooo.f13240o00oOOo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [o0OOo0o0.oo0oO0, o0OOo0o0.oO000O0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o0OOo0o0.oO0o0o] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final boolean o00oOoO(o0O000Oo<? super oO0Ooooo> o0o000oo) {
        int i;
        Object obj;
        oO0o0o oo0o0o;
        boolean z;
        o0O00000 o0o00000 = (o0O00000) this.tail;
        long andIncrement = f14805o00oOo0o.getAndIncrement(this);
        i = o0.f14792o00oOo0o;
        long j = andIncrement / i;
        do {
            obj = o0o00000;
            while (true) {
                if (obj.o00oo0OO() >= j && !obj.o00oOoO0()) {
                    break;
                }
                Object o00oOo0O2 = obj.o00oOo0O();
                oo0o0o = o0OO000o.f14577o00oOOoO;
                if (o00oOo0O2 == oo0o0o) {
                    obj = o0OO000o.f14577o00oOOoO;
                    break;
                }
                oo0oO0 oo0oo0 = (oO000O0) ((oo0oO0) o00oOo0O2);
                if (oo0oo0 == null) {
                    oo0oo0 = o0.o00oOoOo(obj.o00oo0OO() + 1, obj);
                    if (obj.o00oo00O(oo0oo0)) {
                        if (obj.o00oOoO0()) {
                            obj.o00oOooo();
                        }
                    }
                }
                obj = oo0oo0;
            }
            if (oO000O0O.o00oOoO(obj)) {
                break;
            }
            oO000O0 o00oOo0o2 = oO000O0O.o00oOo0o(obj);
            while (true) {
                oO000O0 oo000o0 = (oO000O0) this.tail;
                if (oo000o0.o00oo0OO() >= o00oOo0o2.o00oo0OO()) {
                    break;
                } else if (!o00oOo0o2.o00oo0Oo()) {
                    z = false;
                    continue;
                    break;
                } else if (o00oOo00.o00oOOo0(f14804o00oOo0O, this, oo000o0, o00oOo0o2)) {
                    if (oo000o0.o00oo0()) {
                        oo000o0.o00oOooo();
                    }
                } else if (o00oOo0o2.o00oo0()) {
                    o00oOo0o2.o00oOooo();
                }
            }
            z = true;
            continue;
        } while (!z);
        o0O00000 o0o000002 = (o0O00000) oO000O0O.o00oOo0o(obj);
        int i2 = (int) (andIncrement % o0.f14792o00oOo0o);
        if (com.google.common.util.concurrent.o00oOOo0.o00oOOo0(o0o000002.f14810o00oOo0O, i2, null, o0o000oo)) {
            o0o000oo.o00ooOoo(new o00oo0OO(o0o000002, i2));
            return true;
        }
        if (com.google.common.util.concurrent.o00oOOo0.o00oOOo0(o0o000002.f14810o00oOo0O, i2, o0.f14789o00oOOoO, o0.f14790o00oOo00)) {
            o0o000oo.o00ooOO(oO0Ooooo.f13240o00oOOo0, this.f14809o00oOOoO);
            return true;
        }
        return false;
    }

    public final Object o00oOoO0(o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        o0O00 o00oOOoO2 = o0OoO00O.o00oOOoO(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2));
        while (true) {
            if (!o00oOoO(o00oOOoO2)) {
                if (f14806o00oOoO0.getAndDecrement(this) > 0) {
                    o00oOOoO2.o00ooOO(oO0Ooooo.f13240o00oOOo0, this.f14809o00oOOoO);
                    break;
                }
            } else {
                break;
            }
        }
        Object o00ooO002 = o00oOOoO2.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo02) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo02 ? o00ooO002 : oO0Ooooo.f13240o00oOOo0;
    }

    public final boolean o00oOoOO(o0O000Oo<? super oO0Ooooo> o0o000oo) {
        Object o00oOoOo2 = o0o000oo.o00oOoOo(oO0Ooooo.f13240o00oOOo0, null, this.f14809o00oOOoO);
        if (o00oOoOo2 == null) {
            return false;
        }
        o0o000oo.o00oooOO(o00oOoOo2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [o0OOo0o0.oo0oO0, o0OOo0o0.oO000O0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o0OOo0o0.oO0o0o] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final boolean o00oOoOo() {
        int i;
        Object obj;
        oO0o0o oo0o0o;
        int i2;
        boolean z;
        o0O00000 o0o00000 = (o0O00000) this.head;
        long andIncrement = f14807o00oOooO.getAndIncrement(this);
        i = o0.f14792o00oOo0o;
        long j = andIncrement / i;
        do {
            obj = o0o00000;
            while (true) {
                if (obj.o00oo0OO() >= j && !obj.o00oOoO0()) {
                    break;
                }
                Object o00oOo0O2 = obj.o00oOo0O();
                oo0o0o = o0OO000o.f14577o00oOOoO;
                if (o00oOo0O2 == oo0o0o) {
                    obj = o0OO000o.f14577o00oOOoO;
                    break;
                }
                oo0oO0 oo0oo0 = (oO000O0) ((oo0oO0) o00oOo0O2);
                if (oo0oo0 == null) {
                    oo0oo0 = o0.o00oOoOo(obj.o00oo0OO() + 1, obj);
                    if (obj.o00oo00O(oo0oo0)) {
                        if (obj.o00oOoO0()) {
                            obj.o00oOooo();
                        }
                    }
                }
                obj = oo0oo0;
            }
            if (oO000O0O.o00oOoO(obj)) {
                break;
            }
            oO000O0 o00oOo0o2 = oO000O0O.o00oOo0o(obj);
            while (true) {
                oO000O0 oo000o0 = (oO000O0) this.head;
                if (oo000o0.o00oo0OO() >= o00oOo0o2.o00oo0OO()) {
                    break;
                } else if (!o00oOo0o2.o00oo0Oo()) {
                    z = false;
                    continue;
                    break;
                } else if (o00oOo00.o00oOOo0(f14803o00oOo00, this, oo000o0, o00oOo0o2)) {
                    if (oo000o0.o00oo0()) {
                        oo000o0.o00oOooo();
                    }
                } else if (o00oOo0o2.o00oo0()) {
                    o00oOo0o2.o00oOooo();
                }
            }
            z = true;
            continue;
        } while (!z);
        o0O00000 o0o000002 = (o0O00000) oO000O0O.o00oOo0o(obj);
        o0o000002.o00oOOoO();
        if (o0o000002.f14647o00oOo00 > j) {
            return false;
        }
        int i3 = (int) (andIncrement % o0.f14792o00oOo0o);
        Object andSet = o0o000002.f14810o00oOo0O.getAndSet(i3, o0.f14789o00oOOoO);
        if (andSet != null) {
            if (andSet == o0.f14791o00oOo0O) {
                return false;
            }
            return o00oOoOO((o0O000Oo) andSet);
        }
        int i4 = o0.f14788o00oOOo0;
        for (i2 = 0; i2 < i4; i2++) {
            if (o0o000002.f14810o00oOo0O.get(i3) == o0.f14790o00oOo00) {
                return true;
            }
        }
        return !com.google.common.util.concurrent.o00oOOo0.o00oOOo0(o0o000002.f14810o00oOo0O, i3, o0.f14789o00oOOoO, o0.f14793o00oOooO);
    }

    @Override // o0OOoO00.o00ooO0
    public void release() {
        while (true) {
            int i = this._availablePermits;
            if (!(i < this.f14808o00oOOo0)) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("The number of released permits cannot be greater than ");
                o00oOOo02.append(this.f14808o00oOOo0);
                throw new IllegalStateException(o00oOOo02.toString().toString());
            }
            if (f14806o00oOoO0.compareAndSet(this, i, i + 1) && (i >= 0 || o00oOoOo())) {
                return;
            }
        }
    }
}
