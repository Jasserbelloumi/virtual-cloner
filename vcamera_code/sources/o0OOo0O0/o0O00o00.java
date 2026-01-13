package o0OOo0O0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0OOO0OO;
import o0OOo00O.oO00Oo0;
import o0OOo0O0.o0O00;
import o0OOo0O0.o0OooO0;
import o0OOo0o0.oO0o0o;
import o0OOo0oo.oOO0000;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 D*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0011\u0014EFB\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)JX\u00102\u001a\u00020\f\"\u0004\b\u0001\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\u0016\u001a\u00028\u00002(\u00101\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u0012\u0004\u0018\u0001000-H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lo0OOo0O0/o0O00o00;", "E", "Lo0OOo0O0/o00ooO;", "Lo0OOo0O0/o0O0OO;", "o00oo0Oo", "()Lo0OOo0O0/o0O0OO;", "", "cause", "", "o00ooo0", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lo0OO0o/oO0Ooooo;", "Lkotlinx/coroutines/channels/Handler;", "handler", "o00oOooO", "(Lo0OOOO/o00oo;)V", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Ljava/util/concurrent/CancellationException;)V", "element", "o00ooOo", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00;", "o00oo0o0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00o00$o00oOo0O;", "subscriber", "o00oOoO", "(Lo0OOo0O0/o0O00o00$o00oOo0O;)V", "", "list", "o00oOoO0", "([Lo0OOo0O0/o0O00o00$o00oOo0O;Lo0OOo0O0/o0O00o00$o00oOo0O;)[Lo0OOo0O0/o0O00o00$o00oOo0O;", "o00oo0OO", "o00oOooo", "(Ljava/lang/Throwable;)V", "Lo0OOo0O0/o0O00o00$o00oOOo0;", "o00oo00O", "(Ljava/lang/Object;)Lo0OOo0O0/o0O00o00$o00oOOo0;", "R", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "Lo0OOo0O0/o0OooO0;", "Lo0OO/o00oOo0O;", "", "block", "o00oo0", "(Lo0OOo0oo/oOO0000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "o00oOoOO", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "o00oOoo0", "valueOrNull", "o00oooO", "()Z", "isClosedForSend", "Lo0OOo0oo/oOO00000;", "o00oo0O", "()Lo0OOo0oo/oOO00000;", "onSend", "<init>", "(Ljava/lang/Object;)V", "o00oo0O0", "o00oOo00", "o00oOo0O", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@oO00Oo0
/* loaded from: classes3.dex */
public final class o0O00o00<E> implements o00ooO<E> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14290o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14292o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14294o00oo0o0;
    @Deprecated
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final oO0o0o f14295o00oo0oO;
    @Deprecated
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final o00oOo00<Object> f14296o0O0o;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull
    private volatile /* synthetic */ int _updating;
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o00oOOoO f14291o00oo0O0 = new o00oOOoO(null);
    @Deprecated
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final o00oOOo0 f14293o00oo0o = new o00oOOo0(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lo0OOo0O0/o0O00o00$o00oOOo0;", "", "", "o00oOOo0", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", o0OO000o.o00oOOoO.f12961o00oOo00, "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Throwable f14297o00oOOo0;

        public o00oOOo0(@Nullable Throwable th) {
            this.f14297o00oOOo0 = th;
        }

        @NotNull
        public final Throwable o00oOOo0() {
            Throwable th = this.f14297o00oOOo0;
            return th == null ? new o0oO0Ooo(o0O00O0.f14288o00oOOo0) : th;
        }

        @NotNull
        public final Throwable o00oOOoO() {
            Throwable th = this.f14297o00oOOo0;
            return th == null ? new IllegalStateException(o0O00O0.f14288o00oOOo0) : th;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lo0OOo0O0/o0O00o00$o00oOOoO;", "", "Lo0OOo0O0/o0O00o00$o00oOOo0;", "CLOSED", "Lo0OOo0O0/o0O00o00$o00oOOo0;", "Lo0OOo0O0/o0O00o00$o00oOo00;", "INITIAL_STATE", "Lo0OOo0O0/o0O00o00$o00oOo00;", "Lo0OOo0o0/oO0o0o;", "UNDEFINED", "Lo0OOo0o0/oO0o0o;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o0OOOOO0.o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lo0OOo0O0/o0O00o00$o00oOo00;", "E", "", "o00oOOo0", "Ljava/lang/Object;", "value", "", "Lo0OOo0O0/o0O00o00$o00oOo0O;", o0OO000o.o00oOOoO.f12961o00oOo00, "[Lo0OOo0O0/o0O00o00$o00oOo0O;", "subscribers", "<init>", "(Ljava/lang/Object;[Lo0OOo0O0/o0O00o00$o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<E> {
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f14298o00oOOo0;
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOo0O<E>[] f14299o00oOOoO;

        public o00oOo00(@Nullable Object obj, @Nullable o00oOo0O<E>[] o00ooo0oArr) {
            this.f14298o00oOOo0 = obj;
            this.f14299o00oOOoO = o00ooo0oArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lo0OOo0O0/o0O00o00$o00oOo0O;", "E", "Lo0OOo0O0/o0O00oO0;", "Lo0OOo0O0/o0O0OO;", "", "wasClosed", "Lo0OO0o/oO0Ooooo;", "o0O00O0", "element", "", "o00ooo0O", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00o00;", "o00oo0oO", "Lo0OOo0O0/o0O00o00;", "broadcastChannel", "<init>", "(Lo0OOo0O0/o0O00o00;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<E> extends o0O00oO0<E> implements o0O0OO<E> {
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public final o0O00o00<E> f14300o00oo0oO;

        public o00oOo0O(@NotNull o0O00o00<E> o0o00o00) {
            super(null);
            this.f14300o00oo0oO = o0o00o00;
        }

        @Override // o0OOo0O0.o0O00oO0, o0OOo0O0.o00oo0OO
        @NotNull
        public Object o00ooo0O(E e) {
            return super.o00ooo0O(e);
        }

        @Override // o0OOo0O0.o0O00oO0, o0OOo0O0.o00oo00O
        public void o0O00O0(boolean z) {
            if (z) {
                this.f14300o00oo0oO.o00oOoO(this);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"o0OOo0O0/o0O00o00$o00oOoO", "Lo0OOo0oo/oOO00000;", "Lo0OOo0O0/o0OooO0;", "R", "Lo0OOo0oo/oOO0000;", "select", "param", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "block", "Lo0OO0o/oO0Ooooo;", "o00ooOOo", "(Lo0OOo0oo/oOO0000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO implements oOO00000<E, o0OooO0<? super E>> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00o00<E> f14301o00oo0O0;

        public o00oOoO(o0O00o00<E> o0o00o00) {
            this.f14301o00oo0O0 = o0o00o00;
        }

        @Override // o0OOo0oo.oOO00000
        public <R> void o00ooOOo(@NotNull oOO0000<? super R> ooo0000, E e, @NotNull o0OOOO.o0O00000<? super o0OooO0<? super E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            this.f14301o00oo0O0.o00oo0(ooo0000, e, o0o00000);
        }
    }

    static {
        oO0o0o oo0o0o = new oO0o0o("UNDEFINED");
        f14295o00oo0oO = oo0o0o;
        f14296o0O0o = new o00oOo00<>(oo0o0o, null);
        f14290o00oo0O = AtomicReferenceFieldUpdater.newUpdater(o0O00o00.class, Object.class, "_state");
        f14292o00oo0Oo = AtomicIntegerFieldUpdater.newUpdater(o0O00o00.class, "_updating");
        f14294o00oo0o0 = AtomicReferenceFieldUpdater.newUpdater(o0O00o00.class, Object.class, "onCloseHandler");
    }

    public o0O00o00() {
        this._state = f14296o0O0o;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public o0O00o00(E e) {
        this();
        f14290o00oo0O.lazySet(this, new o00oOo00(e, null));
    }

    public static /* synthetic */ void o00oOoOo() {
    }

    @Override // o0OOo0O0.o00ooO
    public void o00oOOoO(@Nullable CancellationException cancellationException) {
        o00oOOo0(cancellationException);
    }

    public final void o00oOoO(o00oOo0O<E> o00ooo0o2) {
        Object obj;
        Object obj2;
        o00oOo0O<E>[] o00ooo0oArr;
        do {
            obj = this._state;
            if (obj instanceof o00oOOo0) {
                return;
            }
            if (!(obj instanceof o00oOo00)) {
                throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("Invalid state ", obj));
            }
            o00oOo00 o00ooo002 = (o00oOo00) obj;
            obj2 = o00ooo002.f14298o00oOOo0;
            o00ooo0oArr = o00ooo002.f14299o00oOOoO;
            o0OOOOO0.o0ooO.o00oo00O(o00ooo0oArr);
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14290o00oo0O, this, obj, new o00oOo00(obj2, o00oo0OO(o00ooo0oArr, o00ooo0o2))));
    }

    public final o00oOo0O<E>[] o00oOoO0(o00oOo0O<E>[] o00ooo0oArr, o00oOo0O<E> o00ooo0o2) {
        if (o00ooo0oArr == null) {
            o00oOo0O<E>[] o00ooo0oArr2 = new o00oOo0O[1];
            for (int i = 0; i < 1; i++) {
                o00ooo0oArr2[i] = o00ooo0o2;
            }
            return o00ooo0oArr2;
        }
        return (o00oOo0O[]) o0OO0oO.o0O00000.o0Oo0Oo(o00ooo0oArr, o00ooo0o2);
    }

    public final E o00oOoOO() {
        Object obj = this._state;
        if (obj instanceof o00oOOo0) {
            throw ((o00oOOo0) obj).o00oOOoO();
        }
        if (obj instanceof o00oOo00) {
            E e = (E) ((o00oOo00) obj).f14298o00oOOo0;
            if (e != f14295o00oo0oO) {
                return e;
            }
            throw new IllegalStateException("No value");
        }
        throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("Invalid state ", obj));
    }

    @Nullable
    public final E o00oOoo0() {
        Object obj = this._state;
        if (obj instanceof o00oOOo0) {
            return null;
        }
        if (obj instanceof o00oOo00) {
            oO0o0o oo0o0o = f14295o00oo0oO;
            E e = (E) ((o00oOo00) obj).f14298o00oOOo0;
            if (e == oo0o0o) {
                return null;
            }
            return e;
        }
        throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("Invalid state ", obj));
    }

    @Override // o0OOo0O0.o0OooO0
    public void o00oOooO(@NotNull o0OOOO.o00oo<? super Throwable, oO0Ooooo> o00ooVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14294o00oo0o0;
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, null, o00ooVar)) {
            Object obj = this._state;
            if ((obj instanceof o00oOOo0) && androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, o00ooVar, o00oo0.f14232o00oOoO)) {
                o00ooVar.invoke(((o00oOOo0) obj).f14297o00oOOo0);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == o00oo0.f14232o00oOoO) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj2);
    }

    public final void o00oOooo(Throwable th) {
        oO0o0o oo0o0o;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (oo0o0o = o00oo0.f14232o00oOoO) || !androidx.concurrent.futures.o00oOo00.o00oOOo0(f14294o00oo0o0, this, obj, oo0o0o)) {
            return;
        }
        ((o0OOOO.o00oo) o0OOO0OO.o00oo0O(obj, 1)).invoke(th);
    }

    public final <R> void o00oo0(oOO0000<? super R> ooo0000, E e, o0OOOO.o0O00000<? super o0OooO0<? super E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        if (ooo0000.o00oo0oO()) {
            o00oOOo0 o00oo00O2 = o00oo00O(e);
            if (o00oo00O2 != null) {
                ooo0000.o00ooO0(o00oo00O2.o00oOOo0());
            } else {
                o0OOo0o.o0O000O.o00oOooO(o0o00000, this, ooo0000.o00oo());
            }
        }
    }

    public final o00oOOo0 o00oo00O(E e) {
        Object obj;
        if (f14292o00oo0Oo.compareAndSet(this, 0, 1)) {
            do {
                try {
                    obj = this._state;
                    if (obj instanceof o00oOOo0) {
                        return (o00oOOo0) obj;
                    }
                    if (!(obj instanceof o00oOo00)) {
                        throw new IllegalStateException(("Invalid state " + obj).toString());
                    }
                } finally {
                    this._updating = 0;
                }
            } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14290o00oo0O, this, obj, new o00oOo00(e, ((o00oOo00) obj).f14299o00oOOoO)));
            o00oOo0O<E>[] o00ooo0oArr = ((o00oOo00) obj).f14299o00oOOoO;
            if (o00ooo0oArr != null) {
                for (o00oOo0O<E> o00ooo0o2 : o00ooo0oArr) {
                    o00ooo0o2.o00ooo0O(e);
                }
            }
            return null;
        }
        return null;
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public oOO00000<E, o0OooO0<E>> o00oo0O() {
        return new o00oOoO(this);
    }

    public final o00oOo0O<E>[] o00oo0OO(o00oOo0O<E>[] o00ooo0oArr, o00oOo0O<E> o00ooo0o2) {
        int length = o00ooo0oArr.length;
        int oOO0o0oo = o0OO0oO.o0O000O.oOO0o0oo(o00ooo0oArr, o00ooo0o2);
        if (length == 1) {
            return null;
        }
        o00oOo0O<E>[] o00ooo0oArr2 = new o00oOo0O[length - 1];
        o0OO0oO.o0O00000.o0O0o0o(o00ooo0oArr, o00ooo0oArr2, 0, 0, oOO0o0oo, 6, null);
        o0OO0oO.o0O00000.o0O0o0o(o00ooo0oArr, o00ooo0oArr2, oOO0o0oo, oOO0o0oo + 1, 0, 8, null);
        return o00ooo0oArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0O0.o00ooO
    @NotNull
    public o0O0OO<E> o00oo0Oo() {
        Object obj;
        o00oOo00 o00ooo002;
        o00oOo0O o00ooo0o2 = new o00oOo0O(this);
        do {
            obj = this._state;
            if (obj instanceof o00oOOo0) {
                o00ooo0o2.o00ooo0(((o00oOOo0) obj).f14297o00oOOo0);
                return o00ooo0o2;
            } else if (!(obj instanceof o00oOo00)) {
                throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("Invalid state ", obj));
            } else {
                o00ooo002 = (o00oOo00) obj;
                Object obj2 = o00ooo002.f14298o00oOOo0;
                if (obj2 != f14295o00oo0oO) {
                    o00ooo0o2.o00ooo0O(obj2);
                }
            }
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14290o00oo0O, this, obj, new o00oOo00(o00ooo002.f14298o00oOOo0, o00oOoO0(o00ooo002.f14299o00oOOoO, o00ooo0o2))));
        return o00ooo0o2;
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public Object o00oo0o0(E e) {
        o00oOOo0 o00oo00O2 = o00oo00O(e);
        if (o00oo00O2 != null) {
            return o0O00.f14268o00oOOoO.o00oOOo0(o00oo00O2.o00oOOo0());
        }
        o0O00.o00oOOoO o00ooooo2 = o0O00.f14268o00oOOoO;
        oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        o00ooooo2.getClass();
        return o0O00.o00oOo00(oo0ooooo);
    }

    @Override // o0OOo0O0.o0OooO0
    @Nullable
    public Object o00ooOo(E e, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        o00oOOo0 o00oo00O2 = o00oo00O(e);
        if (o00oo00O2 == null) {
            if (o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED == null) {
                return null;
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
        throw o00oo00O2.o00oOOo0();
    }

    @Override // o0OOo0O0.o00ooO
    /* renamed from: o00ooo0 */
    public boolean o00oOOo0(@Nullable Throwable th) {
        Object obj;
        int i;
        do {
            obj = this._state;
            if (obj instanceof o00oOOo0) {
                return false;
            }
            if (!(obj instanceof o00oOo00)) {
                throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("Invalid state ", obj));
            }
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14290o00oo0O, this, obj, th == null ? f14293o00oo0o : new o00oOOo0(th)));
        o00oOo0O<E>[] o00ooo0oArr = ((o00oOo00) obj).f14299o00oOOoO;
        if (o00ooo0oArr != null) {
            for (o00oOo0O<E> o00ooo0o2 : o00ooo0oArr) {
                o00ooo0o2.o00ooo0(th);
            }
        }
        o00oOooo(th);
        return true;
    }

    @Override // o0OOo0O0.o0OooO0
    public boolean o00oooO() {
        return this._state instanceof o00oOOo0;
    }

    @Override // o0OOo0O0.o0OooO0
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return o0OooO0.o00oOOo0.o00oOo00(this, e);
    }
}
