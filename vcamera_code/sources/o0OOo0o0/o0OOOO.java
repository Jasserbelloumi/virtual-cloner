package o0OOo0o0;

import androidx.concurrent.futures.o00oOo00;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b#B\u0017\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0005J3\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lo0OOo0o0/o0OOOO;", "", "E", "", "o00oOooO", "()Z", "element", "", "o00oOOo0", "(Ljava/lang/Object;)I", "o00oOooo", "()Ljava/lang/Object;", "o00oOoo0", "()Lo0OOo0o0/o0OOOO;", "R", "Lkotlin/Function1;", "transform", "", "o00oOoOO", "(Lo0OOOO/o00oo;)Ljava/util/List;", "o00oOoO0", FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/internal/Core;", "o00oOo0O", "(ILjava/lang/Object;)Lo0OOo0o0/o0OOOO;", "oldHead", "newHead", "o00oo00O", "(II)Lo0OOo0o0/o0OOOO;", "", "o00oOoOo", "()J", "state", "o00oOo00", "(J)Lo0OOo0o0/o0OOOO;", o0OO000o.o00oOOoO.f12961o00oOo00, "I", "capacity", "Z", "singleConsumer", "mask", "o00oOoO", "isEmpty", "o00oOo0o", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OOOO<E> {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f14611o00oOoO = 8;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f14613o00oOoOO = 30;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f14614o00oOoOo = 1073741823;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f14615o00oOoo0 = 0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final long f14616o00oOooo = 1073741823;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f14617o00oo = 2;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final long f14618o00oo0 = 1152921503533105152L;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f14619o00oo00O = 30;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f14620o00oo0O = 61;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final long f14621o00oo0O0 = 1152921504606846976L;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f14622o00oo0OO = 60;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final long f14623o00oo0Oo = 2305843009213693952L;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f14625o00oo0o0 = 1024;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f14626o00oo0oO = 0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f14627o0O0o = 1;
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f14628o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f14629o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f14630o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f14631o00oOooO;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o00oOOo0 f14609o00oOo0O = new o00oOOo0(null);
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final oO0o0o f14624o00oo0o = new oO0o0o("REMOVE_FROZEN");

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14610o00oOo0o = AtomicReferenceFieldUpdater.newUpdater(o0OOOO.class, Object.class, "_next");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14612o00oOoO0 = AtomicLongFieldUpdater.newUpdater(o0OOOO.class, "_state");

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lo0OOo0o0/o0OOOO$o00oOOo0;", "", "", "other", "o00oOo0O", "", "newHead", o0OO000o.o00oOOoO.f12961o00oOo00, "newTail", "o00oOo00", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", TtmlNode.TAG_HEAD, "tail", "block", "o00oOooO", "(JLo0OOOO/o0O00000;)Ljava/lang/Object;", "o00oOOo0", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lo0OOo0o0/oO0o0o;", "REMOVE_FROZEN", "Lo0OOo0o0/oO0o0o;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final int o00oOOo0(long j) {
            return (j & o0OOOO.f14623o00oo0Oo) != 0 ? 2 : 1;
        }

        public final long o00oOOoO(long j, int i) {
            return (j & (-1073741824)) | (i << 0);
        }

        public final long o00oOo00(long j, int i) {
            return (j & (-1152921503533105153L)) | (i << 30);
        }

        public final long o00oOo0O(long j, long j2) {
            return j & (~j2);
        }

        public final <T> T o00oOooO(long j, @NotNull o0O00000<? super Integer, ? super Integer, ? extends T> o0o00000) {
            return o0o00000.invoke(Integer.valueOf((int) ((o0OOOO.f14616o00oOooo & j) >> 0)), Integer.valueOf((int) ((j & o0OOOO.f14618o00oo0) >> 30)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lo0OOo0o0/o0OOOO$o00oOOoO;", "", "", "o00oOOo0", "I", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO {
        @o00oOoO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f14632o00oOOo0;

        public o00oOOoO(int i) {
            this.f14632o00oOOo0 = i;
        }
    }

    public o0OOOO(int i, boolean z) {
        this.f14628o00oOOo0 = i;
        this.f14629o00oOOoO = z;
        int i2 = i - 1;
        this.f14630o00oOo00 = i2;
        this.f14631o00oOooO = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o00oOOo0(@org.jetbrains.annotations.NotNull E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            o0OOo0o0.o0OOOO$o00oOOo0 r13 = o0OOo0o0.o0OOOO.f14609o00oOo0O
            int r13 = r13.o00oOOo0(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f14630o00oOo00
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L2e
            return r5
        L2e:
            boolean r1 = r12.f14629o00oOOoO
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f14631o00oOooO
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4d
            int r1 = r12.f14628o00oOOo0
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o0OOo0o0.o0OOOO.f14612o00oOoO0
            o0OOo0o0.o0OOOO$o00oOOo0 r4 = o0OOo0o0.o0OOOO.f14609o00oOo0O
            long r4 = r4.o00oOo00(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f14631o00oOooO
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L7b
            o0OOo0o0.o0OOOO r0 = r0.o00oOoo0()
            o0OOo0o0.o0OOOO r0 = r0.o00oOo0O(r9, r13)
            if (r0 != 0) goto L68
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0o0.o0OOOO.o00oOOo0(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0OOOO<E> o00oOOoO(long j) {
        o0OOOO<E> o0oooo = new o0OOOO<>(this.f14628o00oOOo0 * 2, this.f14629o00oOOoO);
        int i = (int) ((f14616o00oOooo & j) >> 0);
        int i2 = (int) ((f14618o00oo0 & j) >> 30);
        while (true) {
            int i3 = this.f14630o00oOo00;
            if ((i & i3) == (i2 & i3)) {
                f14609o00oOo0O.getClass();
                o0oooo._state = j & (-1152921504606846977L);
                return o0oooo;
            }
            Object obj = this.f14631o00oOooO.get(i3 & i);
            if (obj == null) {
                obj = new o00oOOoO(i);
            }
            o0oooo.f14631o00oOooO.set(o0oooo.f14630o00oOo00 & i, obj);
            i++;
        }
    }

    public final o0OOOO<E> o00oOo00(long j) {
        while (true) {
            o0OOOO<E> o0oooo = (o0OOOO) this._next;
            if (o0oooo != null) {
                return o0oooo;
            }
            o00oOo00.o00oOOo0(f14610o00oOo0o, this, null, o00oOOoO(j));
        }
    }

    public final o0OOOO<E> o00oOo0O(int i, E e) {
        Object obj = this.f14631o00oOooO.get(this.f14630o00oOo00 & i);
        if ((obj instanceof o00oOOoO) && ((o00oOOoO) obj).f14632o00oOOo0 == i) {
            this.f14631o00oOooO.set(i & this.f14630o00oOo00, e);
            return this;
        }
        return null;
    }

    public final int o00oOo0o() {
        long j = this._state;
        return (((int) ((j & f14618o00oo0) >> 30)) - ((int) ((f14616o00oOooo & j) >> 0))) & 1073741823;
    }

    public final boolean o00oOoO() {
        long j = this._state;
        return ((int) ((f14616o00oOooo & j) >> 0)) == ((int) ((j & f14618o00oo0) >> 30));
    }

    public final boolean o00oOoO0() {
        return (this._state & f14623o00oo0Oo) != 0;
    }

    @NotNull
    public final <R> List<R> o00oOoOO(@NotNull o00oo<? super E, ? extends R> o00ooVar) {
        ArrayList arrayList = new ArrayList(this.f14628o00oOOo0);
        long j = this._state;
        int i = (int) ((f14616o00oOooo & j) >> 0);
        int i2 = (int) ((j & f14618o00oo0) >> 30);
        while (true) {
            int i3 = this.f14630o00oOo00;
            if ((i & i3) == (i2 & i3)) {
                return arrayList;
            }
            Object obj = (Object) this.f14631o00oOooO.get(i3 & i);
            if (obj != 0 && !(obj instanceof o00oOOoO)) {
                arrayList.add(o00ooVar.invoke(obj));
            }
            i++;
        }
    }

    public final long o00oOoOo() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & f14621o00oo0O0) != 0) {
                return j;
            }
            j2 = j | f14621o00oo0O0;
        } while (!f14612o00oOoO0.compareAndSet(this, j, j2));
        return j2;
    }

    @NotNull
    public final o0OOOO<E> o00oOoo0() {
        return o00oOo00(o00oOoOo());
    }

    public final boolean o00oOooO() {
        long j;
        do {
            j = this._state;
            if ((j & f14623o00oo0Oo) != 0) {
                return true;
            }
            if ((f14621o00oo0O0 & j) != 0) {
                return false;
            }
        } while (!f14612o00oOoO0.compareAndSet(this, j, j | f14623o00oo0Oo));
        return true;
    }

    @Nullable
    public final Object o00oOooo() {
        while (true) {
            long j = this._state;
            if ((f14621o00oo0O0 & j) != 0) {
                return f14624o00oo0o;
            }
            int i = (int) ((f14616o00oOooo & j) >> 0);
            int i2 = this.f14630o00oOo00;
            if ((((int) ((f14618o00oo0 & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f14631o00oOooO.get(i2 & i);
            if (obj == null) {
                if (this.f14629o00oOOoO) {
                    return null;
                }
            } else if (obj instanceof o00oOOoO) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f14612o00oOoO0.compareAndSet(this, j, f14609o00oOo0O.o00oOOoO(j, i3))) {
                    this.f14631o00oOooO.set(this.f14630o00oOo00 & i, null);
                    return obj;
                } else if (this.f14629o00oOOoO) {
                    o0OOOO<E> o0oooo = this;
                    do {
                        o0oooo = o0oooo.o00oo00O(i, i3);
                    } while (o0oooo != null);
                    return obj;
                }
            }
        }
    }

    public final o0OOOO<E> o00oo00O(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((f14616o00oOooo & j) >> 0);
            if ((f14621o00oo0O0 & j) != 0) {
                return o00oOoo0();
            }
        } while (!f14612o00oOoO0.compareAndSet(this, j, f14609o00oOo0O.o00oOOoO(j, i2)));
        this.f14631o00oOooO.set(i3 & this.f14630o00oOo00, null);
        return null;
    }
}
