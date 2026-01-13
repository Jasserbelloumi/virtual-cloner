package o0OOo0O0;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o00ooO0.o00oOoO;
import o0OO0o.oO0Ooooo;
import o0OOo0O0.o00oo0OO;
import o0OOo0o0.oO00000;
import o0OOo0o0.oO00O0o;
import o0OOo0o0.oO0o0o;
import o0OOo0o0.oooOO0;
import o0OOo0oo.oOO000;
import o0OOo0oo.oOO0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010'\u001a\u00020\u001c\u0012\u0006\u0010+\u001a\u00020(\u0012 \u0010I\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u00010Gj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010&R\u0014\u00109\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0014\u0010?\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b>\u00108R\u0014\u0010@\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u0014\u0010B\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00108R\u0014\u0010F\u001a\u00020C8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lo0OOo0O0/o00ooO0;", "E", "Lo0OOo0O0/o00oo00O;", "element", "", "o00ooo0O", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo0oo/oOO0000;", "select", "o00oooOO", "(Ljava/lang/Object;Lo0OOo0oo/oOO0000;)Ljava/lang/Object;", "Lo0OOo0O0/o0O0OOOo;", "send", "o00oo0", "(Lo0OOo0O0/o0O0OOOo;)Ljava/lang/Object;", "o0O00OO", "()Ljava/lang/Object;", "o0O00OOO", "(Lo0OOo0oo/oOO0000;)Ljava/lang/Object;", "Lo0OOo0O0/o0O0OO0;", "receive", "", "o0OoOoOO", "(Lo0OOo0O0/o0O0OO0;)Z", "wasClosed", "Lo0OO0o/oO0Ooooo;", "o0O00O0", "(Z)V", "", "currentSize", "Lo0OOo0o0/oO0o0o;", "o0O00o0o", "(I)Lo0OOo0o0/oO0o0o;", "o0O00o00", "(ILjava/lang/Object;)V", "o0O00o0O", "(I)V", "o00oo0o0", "I", "capacity", "Lo0OOo0O0/o0O000;", "o00oo0o", "Lo0OOo0O0/o0O000;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o00oo0oO", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "o0O0o", "[Ljava/lang/Object;", "buffer", "o00oo", TtmlNode.TAG_HEAD, "o0ooOoOO", "()Z", "isBufferAlwaysEmpty", "o0O000oo", "isBufferEmpty", "o00ooOoO", "isBufferAlwaysFull", "o00ooOoo", "isBufferFull", "isEmpty", "o00oOo00", "isClosedForReceive", "", "o00oo0OO", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILo0OOo0O0/o0O000;Lo0OOOO/o00oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o00ooO0<E> extends o00oo00O<E> {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f14262o00oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O000 f14263o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f14264o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final ReentrantLock f14265o00oo0oO;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public Object[] f14266o0O0o;
    @NotNull
    private volatile /* synthetic */ int size;

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f14267o00oOOo0;

        static {
            int[] iArr = new int[o0O000.values().length];
            iArr[o0O000.SUSPEND.ordinal()] = 1;
            iArr[o0O000.DROP_LATEST.ordinal()] = 2;
            iArr[o0O000.DROP_OLDEST.ordinal()] = 3;
            f14267o00oOOo0 = iArr;
        }
    }

    public o00ooO0(int i, @NotNull o0O000 o0o000, @Nullable o0OOOO.o00oo<? super E, oO0Ooooo> o00ooVar) {
        super(o00ooVar);
        this.f14264o00oo0o0 = i;
        this.f14263o00oo0o = o0o000;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(o00oOoO.o00oOOo0("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
        }
        this.f14265o00oo0oO = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i, 8)];
        o0OO0oO.o0O00000.o0OOO0OO(objArr, o00oo0.f14229o00oOo00, 0, 0, 6, null);
        this.f14266o0O0o = objArr;
        this.size = 0;
    }

    @Override // o0OOo0O0.o00oo00O, o0OOo0O0.o0O0OO
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            return o0O00();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo00O, o0OOo0O0.o0O0OO
    public boolean o00oOo00() {
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            return super.o00oOo00();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo0OO
    @Nullable
    public Object o00oo0(@NotNull o0O0OOOo o0o0oooo) {
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            return super.o00oo0(o0o0oooo);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public String o00oo0OO() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("(buffer:capacity=");
        o00oOOo02.append(this.f14264o00oo0o0);
        o00oOOo02.append(",size=");
        o00oOOo02.append(this.size);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // o0OOo0O0.o00oo0OO
    public final boolean o00ooOoO() {
        return false;
    }

    @Override // o0OOo0O0.o00oo0OO
    public final boolean o00ooOoo() {
        return this.size == this.f14264o00oo0o0 && this.f14263o00oo0o == o0O000.SUSPEND;
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public Object o00ooo0O(E e) {
        o0O0OOO0<E> o00ooooo2;
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            int i = this.size;
            o0O00OO<?> o00oo0o2 = o00oo0o();
            if (o00oo0o2 != null) {
                return o00oo0o2;
            }
            oO0o0o o0O00o0o2 = o0O00o0o(i);
            if (o0O00o0o2 != null) {
                return o0O00o0o2;
            }
            if (i == 0) {
                do {
                    o00ooooo2 = o00ooooo();
                    if (o00ooooo2 != null) {
                        if (o00ooooo2 instanceof o0O00OO) {
                            this.size = i;
                            return o00ooooo2;
                        }
                        o0OOOOO0.o0ooO.o00oo00O(o00ooooo2);
                    }
                } while (o00ooooo2.o0O0o(e, null) == null);
                this.size = i;
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                reentrantLock.unlock();
                o00ooooo2.o00oo0(e);
                return o00ooooo2.o00oOo0o();
            }
            o0O00o00(i, e);
            return o00oo0.f14234o00oOooO;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public Object o00oooOO(E e, @NotNull oOO0000<?> ooo0000) {
        Object o00oOo0O2;
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            int i = this.size;
            o0O00OO<?> o00oo0o2 = o00oo0o();
            if (o00oo0o2 != null) {
                return o00oo0o2;
            }
            oO0o0o o0O00o0o2 = o0O00o0o(i);
            if (o0O00o0o2 != null) {
                return o0O00o0o2;
            }
            if (i == 0) {
                do {
                    o00oo0OO.o00oOo0O<E> o00oOooo2 = o00oOooo(e);
                    o00oOo0O2 = ooo0000.o00oOo0O(o00oOooo2);
                    if (o00oOo0O2 == null) {
                        this.size = i;
                        o0O0OOO0<? super E> o00oo0OO2 = o00oOooo2.o00oo0OO();
                        oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                        reentrantLock.unlock();
                        o0OOOOO0.o0ooO.o00oo00O(o00oo0OO2);
                        o0O0OOO0<? super E> o0o0ooo0 = o00oo0OO2;
                        o0o0ooo0.o00oo0(e);
                        return o0o0ooo0.o00oOo0o();
                    } else if (o00oOo0O2 != o00oo0.f14230o00oOo0O) {
                    }
                } while (o00oOo0O2 == oooOO0.f14679o00oOOoO);
                if (o00oOo0O2 != oOO000.o00oOooO() && !(o00oOo0O2 instanceof o0O00OO)) {
                    throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + o00oOo0O2).toString());
                }
                this.size = i;
                return o00oOo0O2;
            }
            if (ooo0000.o00oo0oO()) {
                o0O00o00(i, e);
                return o00oo0.f14234o00oOooO;
            }
            this.size = i;
            return oOO000.o00oOooO();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo00O
    public final boolean o0O000oo() {
        return this.size == 0;
    }

    @Override // o0OOo0O0.o00oo00O
    public void o0O00O0(boolean z) {
        o0OOOO.o00oo<E, oO0Ooooo> o00ooVar = this.f14253o00oo0O0;
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            int i = this.size;
            oO00O0o oo00o0o = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f14266o0O0o[this.f14262o00oo];
                if (o00ooVar != null && obj != o00oo0.f14229o00oOo00) {
                    oo00o0o = oO00000.o00oOo00(o00ooVar, obj, oo00o0o);
                }
                Object[] objArr = this.f14266o0O0o;
                int i3 = this.f14262o00oo;
                objArr[i3] = o00oo0.f14229o00oOo00;
                this.f14262o00oo = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            reentrantLock.unlock();
            super.o0O00O0(z);
            if (oo00o0o != null) {
                throw oo00o0o;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // o0OOo0O0.o00oo00O
    @Nullable
    public Object o0O00OO() {
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object o00oo0o2 = o00oo0o();
                if (o00oo0o2 == null) {
                    o00oo0o2 = o00oo0.f14231o00oOo0o;
                }
                return o00oo0o2;
            }
            Object[] objArr = this.f14266o0O0o;
            int i2 = this.f14262o00oo;
            Object obj = objArr[i2];
            o0O0OOOo o0o0oooo = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = o00oo0.f14231o00oOo0o;
            boolean z = false;
            if (i == this.f14264o00oo0o0) {
                o0O0OOOo o0o0oooo2 = null;
                while (true) {
                    o0O0OOOo o02 = o0();
                    if (o02 == null) {
                        o0o0oooo = o0o0oooo2;
                        break;
                    }
                    o0OOOOO0.o0ooO.o00oo00O(o02);
                    if (o02.o0O00O0o(null) != null) {
                        obj2 = o02.o0O00O0();
                        z = true;
                        o0o0oooo = o02;
                        break;
                    }
                    o02.o0O00O();
                    o0o0oooo2 = o02;
                }
            }
            if (obj2 != o00oo0.f14231o00oOo0o && !(obj2 instanceof o0O00OO)) {
                this.size = i;
                Object[] objArr2 = this.f14266o0O0o;
                objArr2[(this.f14262o00oo + i) % objArr2.length] = obj2;
            }
            this.f14262o00oo = (this.f14262o00oo + 1) % this.f14266o0O0o.length;
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            if (z) {
                o0OOOOO0.o0ooO.o00oo00O(o0o0oooo);
                o0o0oooo.o0O00();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:30:0x0081, B:32:0x0085, B:34:0x0089, B:40:0x00ab, B:35:0x0095, B:37:0x009b, B:15:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x0051, B:24:0x005d, B:27:0x0065, B:28:0x007f), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // o0OOo0O0.o00oo00O
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o0O00OOO(@org.jetbrains.annotations.NotNull o0OOo0oo.oOO0000<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f14265o00oo0oO
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L15
            o0OOo0O0.o0O00OO r9 = r8.o00oo0o()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto L11
            o0OOo0o0.oO0o0o r9 = o0OOo0O0.o00oo0.f14231o00oOo0o     // Catch: java.lang.Throwable -> Lc4
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f14266o0O0o     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f14262o00oo     // Catch: java.lang.Throwable -> Lc4
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc4
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc4
            o0OOo0o0.oO0o0o r2 = o0OOo0O0.o00oo0.f14231o00oOo0o     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f14264o00oo0o0     // Catch: java.lang.Throwable -> Lc4
            r6 = 1
            if (r1 != r3) goto L80
        L29:
            o0OOo0O0.o00oo00O$o00oo0 r3 = r8.o0OoOoOo()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r7 = r9.o00oOo0O(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o00oo0OO()     // Catch: java.lang.Throwable -> Lc4
            o0OOOOO0.o0ooO.o00oo00O(r5)     // Catch: java.lang.Throwable -> Lc4
            r2 = r5
            o0OOo0O0.o0O0OOOo r2 = (o0OOo0O0.o0O0OOOo) r2     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.o0O00O0()     // Catch: java.lang.Throwable -> Lc4
            r3 = r6
            goto L81
        L43:
            o0OOo0o0.oO0o0o r3 = o0OOo0O0.o00oo0.f14231o00oOo0o     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L80
            java.lang.Object r3 = o0OOo0o0.oooOO0.f14679o00oOOoO     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L29
            java.lang.Object r2 = o0OOo0oo.oOO000.o00oOooO()     // Catch: java.lang.Throwable -> Lc4
            if (r7 != r2) goto L5d
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f14266o0O0o     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f14262o00oo     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r7
        L5d:
            boolean r2 = r7 instanceof o0OOo0O0.o0O00OO     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L65
            r3 = r6
            r2 = r7
            r5 = r2
            goto L81
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r9     // Catch: java.lang.Throwable -> Lc4
        L80:
            r3 = 0
        L81:
            o0OOo0o0.oO0o0o r7 = o0OOo0O0.o00oo0.f14231o00oOo0o     // Catch: java.lang.Throwable -> Lc4
            if (r2 == r7) goto L95
            boolean r7 = r2 instanceof o0OOo0O0.o0O00OO     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L95
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f14266o0O0o     // Catch: java.lang.Throwable -> Lc4
            int r7 = r8.f14262o00oo     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc4
            goto Lab
        L95:
            boolean r9 = r9.o00oo0oO()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto Lab
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f14266o0O0o     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f14262o00oo     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r9 = o0OOo0oo.oOO000.o00oOooO()     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r9
        Lab:
            int r9 = r8.f14262o00oo     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f14266o0O0o     // Catch: java.lang.Throwable -> Lc4
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 % r1
            r8.f14262o00oo = r9     // Catch: java.lang.Throwable -> Lc4
            o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            if (r3 == 0) goto Lc3
            o0OOOOO0.o0ooO.o00oo00O(r5)
            o0OOo0O0.o0O0OOOo r5 = (o0OOo0O0.o0O0OOOo) r5
            r5.o0O00()
        Lc3:
            return r4
        Lc4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o00ooO0.o0O00OOO(o0OOo0oo.oOO0000):java.lang.Object");
    }

    public final void o0O00o00(int i, E e) {
        if (i < this.f14264o00oo0o0) {
            o0O00o0O(i);
            Object[] objArr = this.f14266o0O0o;
            objArr[(this.f14262o00oo + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f14266o0O0o;
        int i2 = this.f14262o00oo;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f14262o00oo = (i2 + 1) % objArr2.length;
    }

    public final void o0O00o0O(int i) {
        Object[] objArr = this.f14266o0O0o;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f14264o00oo0o0);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f14266o0O0o;
                objArr2[i2] = objArr3[(this.f14262o00oo + i2) % objArr3.length];
            }
            o0OO0oO.o0O00000.o0OO0oo0(objArr2, o00oo0.f14229o00oOo00, i, min);
            this.f14266o0O0o = objArr2;
            this.f14262o00oo = 0;
        }
    }

    public final oO0o0o o0O00o0o(int i) {
        if (i < this.f14264o00oo0o0) {
            this.size = i + 1;
            return null;
        }
        int i2 = o00oOOo0.f14267o00oOOo0[this.f14263o00oo0o.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new o0OO0o.o0O0O0Oo();
            }
            return o00oo0.f14234o00oOooO;
        }
        return o00oo0.f14230o00oOo0O;
    }

    @Override // o0OOo0O0.o00oo00O
    public boolean o0OoOoOO(@NotNull o0O0OO0<? super E> o0o0oo0) {
        ReentrantLock reentrantLock = this.f14265o00oo0oO;
        reentrantLock.lock();
        try {
            return super.o0OoOoOO(o0o0oo0);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo00O
    public final boolean o0ooOoOO() {
        return false;
    }
}
