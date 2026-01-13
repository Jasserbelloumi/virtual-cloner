package o0OOo0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import o0O00Oo.o0oO0Ooo;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import o0OOOo0.o00oo0;
import o0OOo00O.o00oo00O;
import o0OOo00O.oo0ooO;
import o0OOo0o0.oO0000o0;
import o0OOo0o0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0003\u0006d\u0013B+\u0012\u0006\u0010I\u001a\u00020\f\u0012\u0006\u0010K\u001a\u00020\f\u0012\b\b\u0002\u0010N\u001a\u00020\u000f\u0012\b\b\u0002\u0010Q\u001a\u00020B¢\u0006\u0004\ba\u0010bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001e\u0010[\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000X8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0015\u0010]\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0015R\u0015\u0010_\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0015R\u0011\u0010`\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b`\u0010\u001d¨\u0006e"}, d2 = {"Lo0OOo0oO/oOoo0;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lo0OOo0oO/ooOOO00O;", "task", "", "o00oOOo0", "(Lo0OOo0oO/ooOOO00O;)Z", "Lo0OOo0oO/oOoo0$o00oOo00;", "o0O000O", "()Lo0OOo0oO/oOoo0$o00oOo00;", "worker", "", "o0O000", "(Lo0OOo0oO/oOoo0$o00oOo00;)I", "", "state", "o00oOoO", "(J)I", "o00oOo0O", "o00oooOo", "()I", "o00oo0", "o00ooOoO", "()J", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "()V", "o0O0Oooo", "()Z", "o0oO0Ooo", "skipUnpark", "o0ooO", "(Z)V", "o0O0o00o", "(J)Z", "o0O0o0oO", "o00oOo0o", "tailDispatch", "o0O0Oo", "(Lo0OOo0oO/oOoo0$o00oOo00;Lo0OOo0oO/ooOOO00O;Z)Lo0OOo0oO/ooOOO00O;", "o00oOoo0", "oldIndex", "newIndex", "o0O000oo", "(Lo0OOo0oO/oOoo0$o00oOo00;II)V", "o0O000o0", "(Lo0OOo0oO/oOoo0$o00oOo00;)Z", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "o0O0O0Oo", "(J)V", "block", "Lo0OOo0oO/ooo0o;", "taskContext", "o00ooO00", "(Ljava/lang/Runnable;Lo0OOo0oO/ooo0o;Z)V", "o00oOoO0", "(Ljava/lang/Runnable;Lo0OOo0oO/ooo0o;)Lo0OOo0oO/ooOOO00O;", "o0O0OO0", "", "toString", "()Ljava/lang/String;", "o0oO0O0o", "(Lo0OOo0oO/ooOOO00O;)V", "o00oo0O0", "I", "corePoolSize", "o00oo0O", "maxPoolSize", "o00oo0Oo", "J", "idleWorkerKeepAliveNs", "o00oo0o0", "Ljava/lang/String;", "schedulerName", "Lo0OOo0oO/oO0O0OO;", "o00oo0o", "Lo0OOo0oO/oO0O0OO;", "globalCpuQueue", "o00oo0oO", "globalBlockingQueue", "Lo0OOo0o0/oO0000o0;", "o0O0o", "Lo0OOo0o0/oO0000o0;", "workers", "o00ooO0o", "createdWorkers", "o00ooO0O", "availableCpuPermits", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "o00oo", "o00oOo00", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOoo0 implements Executor, Closeable {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f14724o00ooO = -1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f14729o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f14730o00ooOO0 = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f14731o00ooOOo = 21;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final long f14732o00ooOo = 4398044413952L;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final long f14733o00ooOo0 = 2097151;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f14734o00ooOoO = 42;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final long f14735o00ooOoo = 9223367638808264704L;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f14736o00ooo0 = 2097150;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f14737o00ooo00 = 1;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final long f14738o00ooo0O = 2097151;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final long f14739o00ooo0o = -2097152;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final long f14740o00oooO = 2097152;
    @NotNull
    private volatile /* synthetic */ int _isTerminated;
    @NotNull
    public volatile /* synthetic */ long controlState;
    @o00oOoO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f14741o00oo0O;
    @o00oOoO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f14742o00oo0O0;
    @o00oOoO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final long f14743o00oo0Oo;
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final oO0O0OO f14744o00oo0o;
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final String f14745o00oo0o0;
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final oO0O0OO f14746o00oo0oO;
    @o00oOoO
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final oO0000o0<o00oOo00> f14747o0O0o;
    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;
    @NotNull

    /* renamed from: o00oo  reason: collision with root package name */
    public static final o00oOOo0 f14723o00oo = new o00oOOo0(null);
    @o00oOoO
    @NotNull

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final oO0o0o f14728o00ooO0o = new oO0o0o("NOT_IN_STACK");

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14726o00ooO00 = AtomicLongFieldUpdater.newUpdater(oOoo0.class, "parkedWorkersStack");

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14725o00ooO0 = AtomicLongFieldUpdater.newUpdater(oOoo0.class, "controlState");

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14727o00ooO0O = AtomicIntegerFieldUpdater.newUpdater(oOoo0.class, "_isTerminated");

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lo0OOo0oO/oOoo0$o00oOOo0;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lo0OOo0o0/oO0o0o;", "NOT_IN_STACK", "Lo0OOo0o0/oO0o0o;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f14748o00oOOo0;

        static {
            int[] iArr = new int[o00oOo0O.values().length];
            iArr[o00oOo0O.PARKING.ordinal()] = 1;
            iArr[o00oOo0O.BLOCKING.ordinal()] = 2;
            iArr[o00oOo0O.CPU_ACQUIRED.ordinal()] = 3;
            iArr[o00oOo0O.DORMANT.ordinal()] = 4;
            iArr[o00oOo0O.TERMINATED.ordinal()] = 5;
            f14748o00oOOo0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\bD\u0010FJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b0\u0010;R\u0016\u0010<\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0016\u0010=\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010>R\u0012\u0010C\u001a\u00020@8Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lo0OOo0oO/oOoo0$o00oOo00;", "Ljava/lang/Thread;", "Lo0OOo0oO/oOoo0$o00oOo0O;", "newState", "", "o00oo0o", "(Lo0OOo0oO/oOoo0$o00oOo0O;)Z", "Lo0OO0o/oO0Ooooo;", "run", "()V", "", "upperBound", "o00oOooo", "(I)I", "scanLocalQueue", "Lo0OOo0oO/ooOOO00O;", "o00oOo0o", "(Z)Lo0OOo0oO/ooOOO00O;", "o00oo0Oo", "()Z", "o00oo0OO", "o00oo0o0", "o00oOoo0", "task", "o00oOooO", "(Lo0OOo0oO/ooOOO00O;)V", "taskMode", "o00oOo00", "(I)V", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oo00O", "o0O0o", "mode", "o00oOoOo", "o00oOo0O", "o00oo0", "()Lo0OOo0oO/ooOOO00O;", "blockingOnly", "o00oo0oO", FirebaseAnalytics.Param.INDEX, "indexInArray", "I", "o00oOoO0", "()I", "o00oo0O0", "Lo0OOo0oO/oO0Oo0o0;", "Lo0OOo0oO/oO0Oo0o0;", "localQueue", "o00oo0O", "Lo0OOo0oO/oOoo0$o00oOo0O;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "o00oOoO", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "Lo0OOo0oO/oOoo0;", "o00oOoOO", "()Lo0OOo0oO/oOoo0;", "scheduler", "<init>", "(Lo0OOo0oO/oOoo0;)V", "(Lo0OOo0oO/oOoo0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class o00oOo00 extends Thread {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f14749o00oo = AtomicIntegerFieldUpdater.newUpdater(o00oOo00.class, "workerCtl");
        private volatile int indexInArray;
        @Nullable
        private volatile Object nextParkedWorker;
        @o00oOoO
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oOo0O f14750o00oo0O;
        @o00oOoO
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final oO0Oo0o0 f14751o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public long f14752o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f14753o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public long f14754o00oo0o0;
        @o00oOoO

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f14755o00oo0oO;
        @NotNull
        public volatile /* synthetic */ int workerCtl;

        public o00oOo00() {
            setDaemon(true);
            this.f14751o00oo0O0 = new oO0Oo0o0();
            this.f14750o00oo0O = o00oOo0O.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = oOoo0.f14728o00ooO0o;
            this.f14753o00oo0o = o00oo0.Default.nextInt();
        }

        public o00oOo00(oOoo0 oooo0, int i) {
            this();
            o00oo0O0(i);
        }

        public final void o00oOOoO(int i) {
            if (i == 0) {
                return;
            }
            oOoo0.f14725o00ooO0.addAndGet(oOoo0.this, oOoo0.f14739o00ooo0o);
            if (this.f14750o00oo0O != o00oOo0O.TERMINATED) {
                this.f14750o00oo0O = o00oOo0O.DORMANT;
            }
        }

        public final void o00oOo00(int i) {
            if (i != 0 && o00oo0o(o00oOo0O.BLOCKING)) {
                oOoo0.this.o0O0OO0();
            }
        }

        public final ooOOO00O o00oOo0O(boolean z) {
            ooOOO00O o00oo02;
            ooOOO00O o00oo03;
            if (z) {
                boolean z2 = o00oOooo(oOoo0.this.f14742o00oo0O0 * 2) == 0;
                if (z2 && (o00oo03 = o00oo0()) != null) {
                    return o00oo03;
                }
                ooOOO00O o00oOoO2 = this.f14751o00oo0O0.o00oOoO();
                if (o00oOoO2 != null) {
                    return o00oOoO2;
                }
                if (!z2 && (o00oo02 = o00oo0()) != null) {
                    return o00oo02;
                }
            } else {
                ooOOO00O o00oo04 = o00oo0();
                if (o00oo04 != null) {
                    return o00oo04;
                }
            }
            return o00oo0oO(false);
        }

        @Nullable
        public final ooOOO00O o00oOo0o(boolean z) {
            ooOOO00O o00oOoO02;
            if (o00oo0Oo()) {
                return o00oOo0O(z);
            }
            if (!z || (o00oOoO02 = this.f14751o00oo0O0.o00oOoO()) == null) {
                o00oOoO02 = oOoo0.this.f14746o00oo0oO.o00oOoO0();
            }
            return o00oOoO02 == null ? o00oo0oO(true) : o00oOoO02;
        }

        @Nullable
        public final Object o00oOoO() {
            return this.nextParkedWorker;
        }

        public final int o00oOoO0() {
            return this.indexInArray;
        }

        @NotNull
        public final oOoo0 o00oOoOO() {
            return oOoo0.this;
        }

        public final void o00oOoOo(int i) {
            this.f14752o00oo0Oo = 0L;
            if (this.f14750o00oo0O == o00oOo0O.PARKING) {
                this.f14750o00oo0O = o00oOo0O.BLOCKING;
            }
        }

        public final boolean o00oOoo0() {
            return this.nextParkedWorker != oOoo0.f14728o00ooO0o;
        }

        public final void o00oOooO(ooOOO00O ooooo00o) {
            int o0O0Oo2 = ooooo00o.f14757o00oo0O.o0O0Oo();
            o00oOoOo(o0O0Oo2);
            o00oOo00(o0O0Oo2);
            oOoo0.this.o0oO0O0o(ooooo00o);
            o00oOOoO(o0O0Oo2);
        }

        public final int o00oOooo(int i) {
            int i2 = this.f14753o00oo0o;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f14753o00oo0o = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final ooOOO00O o00oo0() {
            oO0O0OO oo0o0oo;
            if (o00oOooo(2) == 0) {
                ooOOO00O o00oOoO02 = oOoo0.this.f14744o00oo0o.o00oOoO0();
                if (o00oOoO02 != null) {
                    return o00oOoO02;
                }
                oo0o0oo = oOoo0.this.f14746o00oo0oO;
            } else {
                ooOOO00O o00oOoO03 = oOoo0.this.f14746o00oo0oO.o00oOoO0();
                if (o00oOoO03 != null) {
                    return o00oOoO03;
                }
                oo0o0oo = oOoo0.this.f14744o00oo0o;
            }
            return oo0o0oo.o00oOoO0();
        }

        public final void o00oo00O() {
            if (this.f14752o00oo0Oo == 0) {
                this.f14752o00oo0Oo = System.nanoTime() + oOoo0.this.f14743o00oo0Oo;
            }
            LockSupport.parkNanos(oOoo0.this.f14743o00oo0Oo);
            if (System.nanoTime() - this.f14752o00oo0Oo >= 0) {
                this.f14752o00oo0Oo = 0L;
                o0O0o();
            }
        }

        public final void o00oo0O(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final void o00oo0O0(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(oOoo0.this.f14745o00oo0o0);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void o00oo0OO() {
            loop0: while (true) {
                boolean z = false;
                while (!oOoo0.this.isTerminated() && this.f14750o00oo0O != o00oOo0O.TERMINATED) {
                    ooOOO00O o00oOo0o2 = o00oOo0o(this.f14755o00oo0oO);
                    if (o00oOo0o2 != null) {
                        this.f14754o00oo0o0 = 0L;
                        o00oOooO(o00oOo0o2);
                    } else {
                        this.f14755o00oo0oO = false;
                        if (this.f14754o00oo0o0 == 0) {
                            o00oo0o0();
                        } else if (z) {
                            o00oo0o(o00oOo0O.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f14754o00oo0o0);
                            this.f14754o00oo0o0 = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            o00oo0o(o00oOo0O.TERMINATED);
        }

        public final boolean o00oo0Oo() {
            boolean z;
            if (this.f14750o00oo0O != o00oOo0O.CPU_ACQUIRED) {
                oOoo0 oooo0 = oOoo0.this;
                while (true) {
                    long j = oooo0.controlState;
                    if (((int) ((oOoo0.f14735o00ooOoo & j) >> 42)) != 0) {
                        if (oOoo0.f14725o00ooO0.compareAndSet(oooo0, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f14750o00oo0O = o00oOo0O.CPU_ACQUIRED;
            }
            return true;
        }

        public final boolean o00oo0o(@NotNull o00oOo0O o00ooo0o2) {
            o00oOo0O o00ooo0o3 = this.f14750o00oo0O;
            boolean z = o00ooo0o3 == o00oOo0O.CPU_ACQUIRED;
            if (z) {
                oOoo0.f14725o00ooO0.addAndGet(oOoo0.this, 4398046511104L);
            }
            if (o00ooo0o3 != o00ooo0o2) {
                this.f14750o00oo0O = o00ooo0o2;
            }
            return z;
        }

        public final void o00oo0o0() {
            if (!o00oOoo0()) {
                oOoo0.this.o0O000o0(this);
                return;
            }
            this.workerCtl = -1;
            while (o00oOoo0() && this.workerCtl == -1 && !oOoo0.this.isTerminated() && this.f14750o00oo0O != o00oOo0O.TERMINATED) {
                o00oo0o(o00oOo0O.PARKING);
                Thread.interrupted();
                o00oo00O();
            }
        }

        public final ooOOO00O o00oo0oO(boolean z) {
            int i = (int) (oOoo0.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int o00oOooo2 = o00oOooo(i);
            oOoo0 oooo0 = oOoo0.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                o00oOooo2++;
                if (o00oOooo2 > i) {
                    o00oOooo2 = 1;
                }
                o00oOo00 o00oOOoO2 = oooo0.f14747o0O0o.o00oOOoO(o00oOooo2);
                if (o00oOOoO2 != null && o00oOOoO2 != this) {
                    oO0Oo0o0 oo0oo0o0 = this.f14751o00oo0O0;
                    oO0Oo0o0 oo0oo0o02 = o00oOOoO2.f14751o00oo0O0;
                    long o00oOoo02 = z ? oo0oo0o0.o00oOoo0(oo0oo0o02) : oo0oo0o0.o00oOooo(oo0oo0o02);
                    if (o00oOoo02 == -1) {
                        return this.f14751o00oo0O0.o00oOoO();
                    }
                    if (o00oOoo02 > 0) {
                        j = Math.min(j, o00oOoo02);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f14754o00oo0o0 = j;
            return null;
        }

        public final void o0O0o() {
            oOoo0 oooo0 = oOoo0.this;
            synchronized (oooo0.f14747o0O0o) {
                if (oooo0.isTerminated()) {
                    return;
                }
                if (((int) (oooo0.controlState & 2097151)) <= oooo0.f14742o00oo0O0) {
                    return;
                }
                if (f14749o00oo.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    o00oo0O0(0);
                    oooo0.o0O000oo(this, i, 0);
                    int andDecrement = (int) (oOoo0.f14725o00ooO0.getAndDecrement(oooo0) & 2097151);
                    if (andDecrement != i) {
                        o00oOo00 o00oOOoO2 = oooo0.f14747o0O0o.o00oOOoO(andDecrement);
                        o0ooO.o00oo00O(o00oOOoO2);
                        o00oOo00 o00ooo002 = o00oOOoO2;
                        oooo0.f14747o0O0o.o00oOo00(i, o00ooo002);
                        o00ooo002.o00oo0O0(i);
                        oooo0.o0O000oo(o00ooo002, andDecrement, i);
                    }
                    oooo0.f14747o0O0o.o00oOo00(andDecrement, null);
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                    this.f14750o00oo0O = o00oOo0O.TERMINATED;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o00oo0OO();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lo0OOo0oO/oOoo0$o00oOo0O;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public enum o00oOo0O {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public oOoo0(int i, int i2, long j, @NotNull String str) {
        this.f14742o00oo0O0 = i;
        this.f14741o00oo0O = i2;
        this.f14743o00oo0Oo = j;
        this.f14745o00oo0o0 = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Core pool size ", i, " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(o0oO0Ooo.o00oOOo0("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f14744o00oo0o = new oO0O0OO();
        this.f14746o00oo0oO = new oO0O0OO();
        this.parkedWorkersStack = 0L;
        this.f14747o0O0o = new oO0000o0<>(i + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    public /* synthetic */ oOoo0(int i, int i2, long j, String str, int i3, o0O00 o0o00) {
        this(i, i2, (i3 & 4) != 0 ? oO0OO0O.f14694o00oOo0O : j, (i3 & 8) != 0 ? oO0OO0O.f14691o00oOOo0 : str);
    }

    public static /* synthetic */ void o00ooO0(oOoo0 oooo0, Runnable runnable, ooo0o ooo0oVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            ooo0oVar = oO0OO0O.f14698o00oOoOO;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        oooo0.o00ooO00(runnable, ooo0oVar, z);
    }

    public static /* synthetic */ boolean o0O0o0O(oOoo0 oooo0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oooo0.controlState;
        }
        return oooo0.o0O0o00o(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o0O0O0Oo(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        o00ooO0(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean o00oOOo0(ooOOO00O ooooo00o) {
        return (ooooo00o.f14757o00oo0O.o0O0Oo() == 1 ? this.f14746o00oo0oO : this.f14744o00oo0o).o00oOOo0(ooooo00o);
    }

    public final int o00oOOoO(long j) {
        return (int) ((j & f14735o00ooOoo) >> 42);
    }

    public final int o00oOo0O(long j) {
        return (int) ((j & f14732o00ooOo) >> 21);
    }

    public final int o00oOo0o() {
        int i;
        synchronized (this.f14747o0O0o) {
            if (this._isTerminated != 0) {
                i = -1;
            } else {
                long j = this.controlState;
                int i2 = (int) (j & 2097151);
                int i3 = i2 - ((int) ((j & f14732o00ooOo) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f14742o00oo0O0) {
                    return 0;
                }
                if (i2 >= this.f14741o00oo0O) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i4 > 0 && this.f14747o0O0o.o00oOOoO(i4) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                o00oOo00 o00ooo002 = new o00oOo00(this, i4);
                this.f14747o0O0o.o00oOo00(i4, o00ooo002);
                if (!(i4 == ((int) (2097151 & f14725o00ooO0.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                o00ooo002.start();
                i = i3 + 1;
            }
            return i;
        }
    }

    public final int o00oOoO(long j) {
        return (int) (j & 2097151);
    }

    @NotNull
    public final ooOOO00O o00oOoO0(@NotNull Runnable runnable, @NotNull ooo0o ooo0oVar) {
        long o00oOOo02 = oO0OO0O.f14695o00oOo0o.o00oOOo0();
        if (runnable instanceof ooOOO00O) {
            ooOOO00O ooooo00o = (ooOOO00O) runnable;
            ooooo00o.f14758o00oo0O0 = o00oOOo02;
            ooooo00o.f14757o00oo0O = ooo0oVar;
            return ooooo00o;
        }
        return new oO0OO00(runnable, o00oOOo02, ooo0oVar);
    }

    public final o00oOo00 o00oOoo0() {
        Thread currentThread = Thread.currentThread();
        o00oOo00 o00ooo002 = currentThread instanceof o00oOo00 ? (o00oOo00) currentThread : null;
        if (o00ooo002 == null || !o0ooO.o00oOoO0(oOoo0.this, this)) {
            return null;
        }
        return o00ooo002;
    }

    public final void o00oOooo() {
        f14725o00ooO0.addAndGet(this, f14739o00ooo0o);
    }

    public final int o00oo0() {
        return (int) (f14725o00ooO0.getAndDecrement(this) & 2097151);
    }

    public final void o00ooO00(@NotNull Runnable runnable, @NotNull ooo0o ooo0oVar, boolean z) {
        o00oo00O o00oOOoO2 = o0OOo00O.o00oo0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.o00oOo0O();
        }
        ooOOO00O o00oOoO02 = o00oOoO0(runnable, ooo0oVar);
        o00oOo00 o00oOoo02 = o00oOoo0();
        ooOOO00O o0O0Oo2 = o0O0Oo(o00oOoo02, o00oOoO02, z);
        if (o0O0Oo2 != null && !o00oOOo0(o0O0Oo2)) {
            throw new RejectedExecutionException(android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), this.f14745o00oo0o0, " was terminated"));
        }
        boolean z2 = z && o00oOoo02 != null;
        if (o00oOoO02.f14757o00oo0O.o0O0Oo() != 0) {
            o0ooO(z2);
        } else if (z2) {
        } else {
            o0O0OO0();
        }
    }

    public final int o00ooO0O() {
        return (int) ((this.controlState & f14735o00ooOoo) >> 42);
    }

    public final int o00ooO0o() {
        return (int) (this.controlState & 2097151);
    }

    public final long o00ooOoO() {
        return f14725o00ooO0.addAndGet(this, 2097152L);
    }

    public final int o00oooOo() {
        return (int) (f14725o00ooO0.incrementAndGet(this) & 2097151);
    }

    public final int o0O000(o00oOo00 o00ooo002) {
        int o00oOoO02;
        do {
            Object o00oOoO2 = o00ooo002.o00oOoO();
            if (o00oOoO2 == f14728o00ooO0o) {
                return -1;
            }
            if (o00oOoO2 == null) {
                return 0;
            }
            o00ooo002 = (o00oOo00) o00oOoO2;
            o00oOoO02 = o00ooo002.o00oOoO0();
        } while (o00oOoO02 == 0);
        return o00oOoO02;
    }

    public final o00oOo00 o0O000O() {
        while (true) {
            long j = this.parkedWorkersStack;
            o00oOo00 o00oOOoO2 = this.f14747o0O0o.o00oOOoO((int) (2097151 & j));
            if (o00oOOoO2 == null) {
                return null;
            }
            long j2 = (2097152 + j) & f14739o00ooo0o;
            int o0O0002 = o0O000(o00oOOoO2);
            if (o0O0002 >= 0 && f14726o00ooO00.compareAndSet(this, j, o0O0002 | j2)) {
                o00oOOoO2.o00oo0O(f14728o00ooO0o);
                return o00oOOoO2;
            }
        }
    }

    public final boolean o0O000o0(@NotNull o00oOo00 o00ooo002) {
        long j;
        long j2;
        int o00oOoO02;
        if (o00ooo002.o00oOoO() != f14728o00ooO0o) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (2097152 + j) & f14739o00ooo0o;
            o00oOoO02 = o00ooo002.o00oOoO0();
            o00ooo002.o00oo0O(this.f14747o0O0o.o00oOOoO((int) (2097151 & j)));
        } while (!f14726o00ooO00.compareAndSet(this, j, j2 | o00oOoO02));
        return true;
    }

    public final void o0O000oo(@NotNull o00oOo00 o00ooo002, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & f14739o00ooo0o;
            if (i3 == i) {
                i3 = i2 == 0 ? o0O000(o00ooo002) : i2;
            }
            if (i3 >= 0 && f14726o00ooO00.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public final void o0O0O0Oo(long j) {
        int i;
        ooOOO00O o00oOoO02;
        if (f14727o00ooO0O.compareAndSet(this, 0, 1)) {
            o00oOo00 o00oOoo02 = o00oOoo0();
            synchronized (this.f14747o0O0o) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    o00oOo00 o00oOOoO2 = this.f14747o0O0o.o00oOOoO(i2);
                    o0ooO.o00oo00O(o00oOOoO2);
                    o00oOo00 o00ooo002 = o00oOOoO2;
                    if (o00ooo002 != o00oOoo02) {
                        while (o00ooo002.isAlive()) {
                            LockSupport.unpark(o00ooo002);
                            o00ooo002.join(j);
                        }
                        o00ooo002.f14751o00oo0O0.o00oOoO0(this.f14746o00oo0oO);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f14746o00oo0oO.o00oOOoO();
            this.f14744o00oo0o.o00oOOoO();
            while (true) {
                if (o00oOoo02 != null) {
                    o00oOoO02 = o00oOoo02.o00oOo0o(true);
                    if (o00oOoO02 != null) {
                        continue;
                        o0oO0O0o(o00oOoO02);
                    }
                }
                o00oOoO02 = this.f14744o00oo0o.o00oOoO0();
                if (o00oOoO02 == null && (o00oOoO02 = this.f14746o00oo0oO.o00oOoO0()) == null) {
                    break;
                }
                o0oO0O0o(o00oOoO02);
            }
            if (o00oOoo02 != null) {
                o00oOoo02.o00oo0o(o00oOo0O.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void o0O0OO0() {
        if (o0O0o0oO() || o0O0o0O(this, 0L, 1, null)) {
            return;
        }
        o0O0o0oO();
    }

    public final ooOOO00O o0O0Oo(o00oOo00 o00ooo002, ooOOO00O ooooo00o, boolean z) {
        if (o00ooo002 == null || o00ooo002.f14750o00oo0O == o00oOo0O.TERMINATED) {
            return ooooo00o;
        }
        if (ooooo00o.f14757o00oo0O.o0O0Oo() == 0 && o00ooo002.f14750o00oo0O == o00oOo0O.BLOCKING) {
            return ooooo00o;
        }
        o00ooo002.f14755o00oo0oO = true;
        return o00ooo002.f14751o00oo0O0.o00oOOo0(ooooo00o, z);
    }

    public final boolean o0O0Oooo() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((f14735o00ooOoo & j) >> 42)) == 0) {
                return false;
            }
        } while (!f14725o00ooO0.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    public final boolean o0O0o00o(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & f14732o00ooOo) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f14742o00oo0O0) {
            int o00oOo0o2 = o00oOo0o();
            if (o00oOo0o2 == 1 && this.f14742o00oo0O0 > 1) {
                o00oOo0o();
            }
            if (o00oOo0o2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o0O0o0oO() {
        o00oOo00 o0O000O2;
        do {
            o0O000O2 = o0O000O();
            if (o0O000O2 == null) {
                return false;
            }
        } while (!o00oOo00.f14749o00oo.compareAndSet(o0O000O2, -1, 0));
        LockSupport.unpark(o0O000O2);
        return true;
    }

    public final void o0oO0O0o(@NotNull ooOOO00O ooooo00o) {
        try {
            ooooo00o.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                o00oo00O o00oOOoO2 = o0OOo00O.o00oo0.o00oOOoO();
                if (o00oOOoO2 == null) {
                }
            } finally {
                o00oo00O o00oOOoO3 = o0OOo00O.o00oo0.o00oOOoO();
                if (o00oOOoO3 != null) {
                    o00oOOoO3.o00oOo0o();
                }
            }
        }
    }

    public final long o0oO0Ooo() {
        return f14725o00ooO0.addAndGet(this, 4398046511104L);
    }

    public final void o0ooO(boolean z) {
        long addAndGet = f14725o00ooO0.addAndGet(this, 2097152L);
        if (z || o0O0o0oO() || o0O0o00o(addAndGet)) {
            return;
        }
        o0O0o0oO();
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        int o00oOOo02 = this.f14747o0O0o.o00oOOo0();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < o00oOOo02; i6++) {
            o00oOo00 o00oOOoO2 = this.f14747o0O0o.o00oOOoO(i6);
            if (o00oOOoO2 != null) {
                int o00oOo0o2 = o00oOOoO2.f14751o00oo0O0.o00oOo0o();
                int i7 = o00oOOoO.f14748o00oOOo0[o00oOOoO2.f14750o00oo0O.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(o00oOo0o2);
                        c = 'b';
                    } else if (i7 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(o00oOo0o2);
                        c = 'c';
                    } else if (i7 == 4) {
                        i4++;
                        if (o00oOo0o2 > 0) {
                            sb = new StringBuilder();
                            sb.append(o00oOo0o2);
                            c = 'd';
                        }
                    } else if (i7 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        return this.f14745o00oo0o0 + '@' + oo0ooO.o00oOOoO(this) + "[Pool Size {core = " + this.f14742o00oo0O0 + ", max = " + this.f14741o00oo0O + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f14744o00oo0o.o00oOo00() + ", global blocking queue size = " + this.f14746o00oo0oO.o00oOo00() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((f14732o00ooOo & j) >> 21)) + ", CPUs acquired = " + (this.f14742o00oo0O0 - ((int) ((f14735o00ooOoo & j) >> 42))) + "}]";
    }
}
