package o0OOo0O0;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o00ooO0.o00oOoO;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOo0o0.o0OO000;
import o0OOo0oo.oOO000;
import o0OOo0oo.oOO0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\u000f\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\bR\u0010PJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0082\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R6\u0010<\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d07j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d`88\u0002X\u0082\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010\u001cR\u0014\u0010?\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010E\u001a\u00020B8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR$\u0010J\u001a\u00020\"2\u0006\u0010F\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010$\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\"2\u0006\u0010F\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bK\u0010$\"\u0004\bL\u0010IR$\u0010Q\u001a\u00020(2\u0006\u0010F\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bN\u0010,\"\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lo0OOo0O0/o00oo;", "E", "Lo0OOo0O0/o00oo0OO;", "Lo0OOo0O0/o00ooO;", "Lo0OOo0O0/o0O0OO;", "o00oo0Oo", "()Lo0OOo0O0/o0O0OO;", "", "cause", "", "o00ooo0", "(Ljava/lang/Throwable;)Z", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "(Ljava/util/concurrent/CancellationException;)V", "element", "", "o00ooo0O", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo0oo/oOO0000;", "select", "o00oooOO", "(Ljava/lang/Object;Lo0OOo0oo/oOO0000;)Ljava/lang/Object;", "o0O0000o", "o0O000", "()V", "Lo0OOo0O0/o00oo$o00oOOo0;", "addSub", "removeSub", "o0OoO00O", "(Lo0OOo0O0/o00oo$o00oOOo0;Lo0OOo0O0/o00oo$o00oOOo0;)V", "", "o0O000O", "()J", FirebaseAnalytics.Param.INDEX, "o0OoOoOo", "(J)Ljava/lang/Object;", "", "o00oo0o0", "I", "o0O000Oo", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o00oo0o", "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "o00oo0oO", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "o0O0o", "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "o00ooOoO", "()Z", "isBufferAlwaysFull", "o00ooOoo", "isBufferFull", "", "o00oo0OO", "()Ljava/lang/String;", "bufferDebugString", "value", "o0OoOoOO", "o0O000oo", "(J)V", TtmlNode.TAG_HEAD, "o0ooOoOO", "o0O00O0", "tail", "o0O000o0", "o0O00", "(I)V", "size", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00oo<E> extends o00oo0OO<E> implements o00ooO<E> {
    @NotNull
    private volatile /* synthetic */ long _head;
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    private volatile /* synthetic */ long _tail;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final ReentrantLock f14221o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f14222o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Object[] f14223o00oo0oO;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final List<o00oOOo0<E>> f14224o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0014\u0010'\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0014\u0010)\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\n¨\u0006."}, d2 = {"Lo0OOo0O0/o00oo$o00oOOo0;", "E", "Lo0OOo0O0/o00oo00O;", "Lo0OOo0O0/o0O0OO;", "", "cause", "", "o00ooo0", "(Ljava/lang/Throwable;)Z", "o0O00o00", "()Z", "", "o0O00OO", "()Ljava/lang/Object;", "Lo0OOo0oo/oOO0000;", "select", "o0O00OOO", "(Lo0OOo0oo/oOO0000;)Ljava/lang/Object;", "o0O00o0o", "o0O00o", "Lo0OOo0O0/o00oo;", "o00oo0o0", "Lo0OOo0O0/o00oo;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o00oo0o", "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "o0O00o0O", "()J", "o0O00oO0", "(J)V", "subHead", "o0ooOoOO", "isBufferAlwaysEmpty", "o0O000oo", "isBufferEmpty", "o00ooOoO", "isBufferAlwaysFull", "o00ooOoo", "isBufferFull", "<init>", "(Lo0OOo0O0/o00oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> extends o00oo00O<E> implements o0O0OO<E> {
        @NotNull
        private volatile /* synthetic */ long _subHead;
        @NotNull

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final ReentrantLock f14225o00oo0o;
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o00oo<E> f14226o00oo0o0;

        public o00oOOo0(@NotNull o00oo<E> o00ooVar) {
            super(null);
            this.f14226o00oo0o0 = o00ooVar;
            this.f14225o00oo0o = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // o0OOo0O0.o00oo0OO
        public boolean o00ooOoO() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // o0OOo0O0.o00oo0OO
        public boolean o00ooOoo() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // o0OOo0O0.o00oo0OO, o0OOo0O0.o0OooO0
        public boolean o00ooo0(@Nullable Throwable th) {
            boolean o00ooo02 = super.o00ooo0(th);
            if (o00ooo02) {
                o00oo.o0O00O0o(this.f14226o00oo0o0, null, this, 1, null);
                ReentrantLock reentrantLock = this.f14225o00oo0o;
                reentrantLock.lock();
                try {
                    this._subHead = o00oo.o0O0000O(this.f14226o00oo0o0);
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return o00ooo02;
        }

        @Override // o0OOo0O0.o00oo00O
        public boolean o0O000oo() {
            return this._subHead >= o00oo.o0O0000O(this.f14226o00oo0o0);
        }

        @Override // o0OOo0O0.o00oo00O
        @Nullable
        public Object o0O00OO() {
            boolean z;
            ReentrantLock reentrantLock = this.f14225o00oo0o;
            reentrantLock.lock();
            try {
                Object o0O00o2 = o0O00o();
                if ((o0O00o2 instanceof o0O00OO) || o0O00o2 == o00oo0.f14231o00oOo0o) {
                    z = false;
                } else {
                    this._subHead++;
                    z = true;
                }
                reentrantLock.unlock();
                o0O00OO o0o00oo = o0O00o2 instanceof o0O00OO ? (o0O00OO) o0O00o2 : null;
                if (o0o00oo != null) {
                    o00ooo0(o0o00oo.f14289o00oo0o0);
                }
                if (o0O00o00() ? true : z) {
                    o00oo.o0O00O0o(this.f14226o00oo0o0, null, null, 3, null);
                }
                return o0O00o2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // o0OOo0O0.o00oo00O
        @Nullable
        public Object o0O00OOO(@NotNull oOO0000<?> ooo0000) {
            ReentrantLock reentrantLock = this.f14225o00oo0o;
            reentrantLock.lock();
            try {
                Object o0O00o2 = o0O00o();
                boolean z = false;
                if (!(o0O00o2 instanceof o0O00OO) && o0O00o2 != o00oo0.f14231o00oOo0o) {
                    if (ooo0000.o00oo0oO()) {
                        this._subHead++;
                        z = true;
                    } else {
                        o0O00o2 = oOO000.o00oOooO();
                    }
                }
                reentrantLock.unlock();
                o0O00OO o0o00oo = o0O00o2 instanceof o0O00OO ? (o0O00OO) o0O00o2 : null;
                if (o0o00oo != null) {
                    o00ooo0(o0o00oo.f14289o00oo0o0);
                }
                if (o0O00o00() ? true : z) {
                    o00oo.o0O00O0o(this.f14226o00oo0o0, null, null, 3, null);
                }
                return o0O00o2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final Object o0O00o() {
            long j = this._subHead;
            o0O00OO<?> o00oo0O02 = this.f14226o00oo0o0.o00oo0O0();
            if (j < o00oo.o0O0000O(this.f14226o00oo0o0)) {
                E o0OoOoOo2 = this.f14226o00oo0o0.o0OoOoOo(j);
                o0O00OO<?> o00oo0O03 = o00oo0O0();
                return o00oo0O03 != null ? o00oo0O03 : o0OoOoOo2;
            } else if (o00oo0O02 == null) {
                o0O00OO<?> o00oo0O04 = o00oo0O0();
                return o00oo0O04 == null ? o00oo0.f14231o00oOo0o : o00oo0O04;
            } else {
                return o00oo0O02;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            r2 = (o0OOo0O0.o0O00OO) r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean o0O00o00() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.o0O00o0o()
                r2 = 0
                if (r1 == 0) goto L56
                java.util.concurrent.locks.ReentrantLock r1 = r8.f14225o00oo0o
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r8.o0O00o()     // Catch: java.lang.Throwable -> L4f
                o0OOo0o0.oO0o0o r3 = o0OOo0O0.o00oo0.f14231o00oOo0o     // Catch: java.lang.Throwable -> L4f
                if (r1 != r3) goto L19
                goto L38
            L19:
                boolean r3 = r1 instanceof o0OOo0O0.o0O00OO     // Catch: java.lang.Throwable -> L4f
                if (r3 == 0) goto L21
                o0OOo0O0.o0O00OO r1 = (o0OOo0O0.o0O00OO) r1     // Catch: java.lang.Throwable -> L4f
                r2 = r1
                goto L2c
            L21:
                o0OOo0O0.o0O0OOO0 r3 = r8.o00ooooo()     // Catch: java.lang.Throwable -> L4f
                if (r3 != 0) goto L28
                goto L2c
            L28:
                boolean r4 = r3 instanceof o0OOo0O0.o0O00OO     // Catch: java.lang.Throwable -> L4f
                if (r4 == 0) goto L32
            L2c:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f14225o00oo0o
                r1.unlock()
                goto L56
            L32:
                o0OOo0o0.oO0o0o r2 = r3.o0O0o(r1, r2)     // Catch: java.lang.Throwable -> L4f
                if (r2 != 0) goto L3e
            L38:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f14225o00oo0o
                r1.unlock()
                goto L1
            L3e:
                long r4 = r8._subHead     // Catch: java.lang.Throwable -> L4f
                r6 = 1
                long r4 = r4 + r6
                r8._subHead = r4     // Catch: java.lang.Throwable -> L4f
                r0 = 1
                java.util.concurrent.locks.ReentrantLock r2 = r8.f14225o00oo0o
                r2.unlock()
                r3.o00oo0(r1)
                goto L1
            L4f:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.f14225o00oo0o
                r1.unlock()
                throw r0
            L56:
                if (r2 == 0) goto L5d
                java.lang.Throwable r1 = r2.f14289o00oo0o0
                r8.o00ooo0(r1)
            L5d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o00oo.o00oOOo0.o0O00o00():boolean");
        }

        public final long o0O00o0O() {
            return this._subHead;
        }

        public final boolean o0O00o0o() {
            if (o00oo0O0() != null) {
                return false;
            }
            return (o0O000oo() && this.f14226o00oo0o0.o00oo0O0() == null) ? false : true;
        }

        public final void o0O00oO0(long j) {
            this._subHead = j;
        }

        @Override // o0OOo0O0.o00oo00O
        public boolean o0ooOoOO() {
            return false;
        }
    }

    public o00oo(int i) {
        super(null);
        this.f14222o00oo0o0 = i;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(o00oOoO.o00oOOo0("ArrayBroadcastChannel capacity must be at least 1, but ", i, " was specified").toString());
        }
        this.f14221o00oo0o = new ReentrantLock();
        this.f14223o00oo0oO = new Object[i];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f14224o0O0o = o0OO000.o00oOooO();
    }

    public static final long o0O0000O(o00oo o00ooVar) {
        return o00ooVar._tail;
    }

    public static /* synthetic */ void o0O000o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o0O00O0o(o00oo o00ooVar, o00oOOo0 o00oooo02, o00oOOo0 o00oooo03, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oooo02 = null;
        }
        if ((i & 2) != 0) {
            o00oooo03 = null;
        }
        o00ooVar.o0OoO00O(o00oooo02, o00oooo03);
    }

    @Override // o0OOo0O0.o00ooO
    public void o00oOOoO(@Nullable CancellationException cancellationException) {
        o00oOOo0(cancellationException);
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public String o00oo0OO() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("(buffer:capacity=");
        o00oOOo02.append(this.f14223o00oo0oO.length);
        o00oOOo02.append(",size=");
        o00oOOo02.append(this._size);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // o0OOo0O0.o00ooO
    @NotNull
    public o0O0OO<E> o00oo0Oo() {
        o00oOOo0 o00oooo02 = new o00oOOo0(this);
        o0O00O0o(this, o00oooo02, null, 2, null);
        return o00oooo02;
    }

    @Override // o0OOo0O0.o00oo0OO
    public boolean o00ooOoO() {
        return false;
    }

    @Override // o0OOo0O0.o00oo0OO
    public boolean o00ooOoo() {
        return this._size >= this.f14222o00oo0o0;
    }

    @Override // o0OOo0O0.o00oo0OO, o0OOo0O0.o0OooO0
    public boolean o00ooo0(@Nullable Throwable th) {
        if (super.o00ooo0(th)) {
            o0O000();
            return true;
        }
        return false;
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public Object o00ooo0O(E e) {
        ReentrantLock reentrantLock = this.f14221o00oo0o;
        reentrantLock.lock();
        try {
            o0O00OO<?> o00oo0o2 = o00oo0o();
            if (o00oo0o2 != null) {
                return o00oo0o2;
            }
            int i = this._size;
            if (i >= this.f14222o00oo0o0) {
                return o00oo0.f14230o00oOo0O;
            }
            long j = this._tail;
            this.f14223o00oo0oO[(int) (j % this.f14222o00oo0o0)] = e;
            this._size = i + 1;
            this._tail = j + 1;
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            reentrantLock.unlock();
            o0O000();
            return o00oo0.f14234o00oOooO;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0OOo0O0.o00oo0OO
    @NotNull
    public Object o00oooOO(E e, @NotNull oOO0000<?> ooo0000) {
        ReentrantLock reentrantLock = this.f14221o00oo0o;
        reentrantLock.lock();
        try {
            o0O00OO<?> o00oo0o2 = o00oo0o();
            if (o00oo0o2 != null) {
                return o00oo0o2;
            }
            int i = this._size;
            if (i >= this.f14222o00oo0o0) {
                return o00oo0.f14230o00oOo0O;
            }
            if (ooo0000.o00oo0oO()) {
                long j = this._tail;
                this.f14223o00oo0oO[(int) (j % this.f14222o00oo0o0)] = e;
                this._size = i + 1;
                this._tail = j + 1;
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                reentrantLock.unlock();
                o0O000();
                return o00oo0.f14234o00oOooO;
            }
            return oOO000.o00oOooO();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void o0O00(int i) {
        this._size = i;
    }

    public final void o0O000() {
        boolean z;
        boolean z2 = false;
        loop0: while (true) {
            z = z2;
            for (o00oOOo0<E> o00oooo02 : this.f14224o0O0o) {
                if (o00oooo02.o0O00o00()) {
                    break;
                }
                z = true;
            }
            z2 = true;
        }
        if (z2 || !z) {
            o0O00O0o(this, null, null, 3, null);
        }
    }

    @Override // o0OOo0O0.o00ooO
    /* renamed from: o0O0000o */
    public final boolean o00oOOo0(Throwable th) {
        boolean o00ooo02 = o00ooo0(th);
        for (o00oOOo0<E> o00oooo02 : this.f14224o0O0o) {
            o00oooo02.o00oOOo0(th);
        }
        return o00ooo02;
    }

    public final long o0O000O() {
        long j = Long.MAX_VALUE;
        for (o00oOOo0<E> o00oooo02 : this.f14224o0O0o) {
            long o0O00o0O2 = o00oooo02.o0O00o0O();
            if (j > o0O00o0O2) {
                j = o0O00o0O2;
            }
        }
        return j;
    }

    public final int o0O000Oo() {
        return this.f14222o00oo0o0;
    }

    public final int o0O000o0() {
        return this._size;
    }

    public final void o0O000oo(long j) {
        this._head = j;
    }

    public final void o0O00O0(long j) {
        this._tail = j;
    }

    public final void o0OoO00O(o00oOOo0<E> o00oooo02, o00oOOo0<E> o00oooo03) {
        o0O0OOOo o02;
        while (true) {
            ReentrantLock reentrantLock = this.f14221o00oo0o;
            reentrantLock.lock();
            if (o00oooo02 != null) {
                try {
                    o00oooo02.o0O00oO0(this._tail);
                    boolean isEmpty = this.f14224o0O0o.isEmpty();
                    this.f14224o0O0o.add(o00oooo02);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (o00oooo03 != null) {
                this.f14224o0O0o.remove(o00oooo03);
                if (this._head != o00oooo03.o0O00o0O()) {
                    return;
                }
            }
            long o0O000O2 = o0O000O();
            long j = this._tail;
            long j2 = this._head;
            if (o0O000O2 > j) {
                o0O000O2 = j;
            }
            if (o0O000O2 <= j2) {
                return;
            }
            int i = this._size;
            while (j2 < o0O000O2) {
                Object[] objArr = this.f14223o00oo0oO;
                int i2 = this.f14222o00oo0o0;
                objArr[(int) (j2 % i2)] = null;
                boolean z = i >= i2;
                j2++;
                this._head = j2;
                i--;
                this._size = i;
                if (z) {
                    do {
                        o02 = o0();
                        if (o02 != null && !(o02 instanceof o0O00OO)) {
                            o0OOOOO0.o0ooO.o00oo00O(o02);
                        }
                    } while (o02.o0O00O0o(null) == null);
                    this.f14223o00oo0oO[(int) (j % this.f14222o00oo0o0)] = o02.o0O00O0();
                    this._size = i + 1;
                    this._tail = j + 1;
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                    reentrantLock.unlock();
                    o02.o0O00();
                    o0O000();
                    o00oooo02 = null;
                    o00oooo03 = null;
                }
            }
            return;
        }
    }

    public final long o0OoOoOO() {
        return this._head;
    }

    public final E o0OoOoOo(long j) {
        return (E) this.f14223o00oo0oO[(int) (j % this.f14222o00oo0o0)];
    }

    public final long o0ooOoOO() {
        return this._tail;
    }
}
