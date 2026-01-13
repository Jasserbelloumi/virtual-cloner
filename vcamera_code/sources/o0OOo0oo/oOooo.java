package o0OOo0oo;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO0o.o0O;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O000o0;
import o0OOo00O.o0O00O0;
import o0OOo00O.o0O0O0Oo;
import o0OOo00O.o0O0OOO;
import o0OOo00O.o0O0o0;
import o0OOo00O.o0OO0O0;
import o0OOo00O.oO000Oo0;
import o0OOo00O.ooOOOOoo;
import o0OOo0o.o0O000;
import o0OOo0o.o0O000O;
import o0OOo0o0.o0O0oo00;
import o0OOo0o0.o0OOO0;
import o0OOo0o0.o0OOO0OO;
import o0OOo0o0.o0oOo0O0;
import o0OOo0o0.oO00000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O
@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004[\\\u001c'B\u0015\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u000e*\u00020,2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100JG\u00104\u001a\u00020\u000e\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u0001022\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J[\u00109\u001a\u00020\u000e\"\u0004\b\u0001\u00106\"\u0004\b\u0002\u00101*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002072\u0006\u00108\u001a\u00028\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J8\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J.\u0010A\u001a\u00020\u000e2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150?2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0?H\u0082\b¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010K\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010 R(\u0010X\u001a\u0004\u0018\u00010\u001a2\b\u0010@\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lo0OOo0oo/oOooo;", "R", "Lo0OOo0o0/o0OOO0;", "Lo0OOo0oo/oO0oO000;", "Lo0OOo0oo/oOO0000;", "Lo0OO/o00oOo0O;", "Lo0OOO0/o00oOoO;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lo0OO0o/oo0oO0;", "result", "Lo0OO0o/oO0Ooooo;", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "o00ooO0", "(Ljava/lang/Throwable;)V", "", "o0oO0Ooo", "()Ljava/lang/Object;", "e", "o0O00OoO", "Lo0OOo00O/o0OOO0OO;", "handle", "o00oOo00", "(Lo0OOo00O/o0OOO0OO;)V", "", "o00oo0oO", "()Z", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "o00ooO00", "(Lo0OOo0o0/o0OOO0OO$o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0o0/o0oOo0O0;", "desc", "o00oOo0O", "(Lo0OOo0o0/o0oOo0O0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lo0OOo0oo/oOo00o00;", "Lkotlin/Function1;", "block", "o00oOooo", "(Lo0OOo0oo/oOo00o00;Lo0OOOO/o00oo;)V", "Q", "Lo0OOo0oo/oO;", "Lkotlin/Function2;", "o00oo0O", "(Lo0OOo0oo/oO;Lo0OOOO/o0O00000;)V", "P", "Lo0OOo0oo/oOO00000;", "param", "o00oo0Oo", "(Lo0OOo0oo/oOO00000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "", "timeMillis", "o00oOooO", "(JLo0OOOO/o00oo;)V", "Lkotlin/Function0;", "value", "o0O00OOO", "(Lo0OOOO/o00oOOo0;Lo0OOOO/o00oOOo0;)V", "o00ooo00", "()V", "o0O00OO", "o00oo0o0", "Lo0OO/o00oOo0O;", "uCont", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "Lo0OO/o00oo0;", "getContext", "()Lo0OO/o00oo0;", "context", "o00oo", "()Lo0OO/o00oOo0O;", "completion", "o00oo00O", "isSelected", "o0O00Oo", "()Lo0OOo00O/o0OOO0OO;", "o0O00Ooo", "parentHandle", "<init>", "(Lo0OO/o00oOo0O;)V", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOooo<R> extends o0OOO0 implements oO0oO000<R>, oOO0000<R>, o0OO.o00oOo0O<R>, o0OOO0.o00oOoO {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14767o00oo0o = AtomicReferenceFieldUpdater.newUpdater(oOooo.class, Object.class, "_state");

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14768o00oo0oO = AtomicReferenceFieldUpdater.newUpdater(oOooo.class, Object.class, "_result");
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0OO.o00oOo0O<R> f14769o00oo0o0;
    @NotNull
    public volatile /* synthetic */ Object _state = oOO000.o00oOo0o();
    @NotNull
    private volatile /* synthetic */ Object _result = oOO000.f14762o00oOo00;
    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lo0OOo0oo/oOooo$o00oOOo0;", "Lo0OOo0o0/o0O0oo00;", "", "affected", "o00oOoOO", "failure", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "", "toString", "o00oOoo0", "o00oOooo", "o00oOoOo", "Lo0OOo0oo/oOooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0oo/oOooo;", "impl", "Lo0OOo0o0/o0oOo0O0;", "o00oOo00", "Lo0OOo0o0/o0oOo0O0;", "desc", "", "J", "o00oOoO0", "()J", "opSequence", "<init>", "(Lo0OOo0oo/oOooo;Lo0OOo0o0/o0oOo0O0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0oo00<Object> {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final oOooo<?> f14770o00oOOoO;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o0oOo0O0 f14771o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final long f14772o00oOooO = oOO000.o00oOOoO().o00oOOo0();

        public o00oOOo0(@NotNull oOooo<?> ooooo, @NotNull o0oOo0O0 o0ooo0o0) {
            this.f14770o00oOOoO = ooooo;
            this.f14771o00oOo00 = o0ooo0o0;
            o0ooo0o0.o00oOooO(this);
        }

        @Override // o0OOo0o0.o0O0oo00
        public long o00oOoO0() {
            return this.f14772o00oOooO;
        }

        @Override // o0OOo0o0.o0O0oo00
        @Nullable
        public Object o00oOoOO(@Nullable Object obj) {
            Object o00oOoo02;
            if (obj != null || (o00oOoo02 = o00oOoo0()) == null) {
                try {
                    return this.f14771o00oOo00.o00oOo00(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        o00oOooo();
                    }
                    throw th;
                }
            }
            return o00oOoo02;
        }

        public final void o00oOoOo(Object obj) {
            boolean z = obj == null;
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(oOooo.f14767o00oo0o, this.f14770o00oOOoO, this, z ? null : oOO000.o00oOo0o()) && z) {
                this.f14770o00oOOoO.o0O00OO();
            }
        }

        public final Object o00oOoo0() {
            oOooo<?> ooooo = this.f14770o00oOOoO;
            while (true) {
                Object obj = ooooo._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof oO00000o) {
                    ((oO00000o) obj).o00oOo00(this.f14770o00oOOoO);
                } else if (obj != oOO000.o00oOo0o()) {
                    return oOO000.f14761o00oOOoO;
                } else {
                    if (androidx.concurrent.futures.o00oOo00.o00oOOo0(oOooo.f14767o00oo0o, this.f14770o00oOOoO, oOO000.f14760o00oOOo0, this)) {
                        return null;
                    }
                }
            }
        }

        @Override // o0OOo0o0.o0O0oo00
        public void o00oOooO(@Nullable Object obj, @Nullable Object obj2) {
            o00oOoOo(obj2);
            this.f14771o00oOo00.o00oOOo0(this, obj2);
        }

        public final void o00oOooo() {
            androidx.concurrent.futures.o00oOo00.o00oOOo0(oOooo.f14767o00oo0o, this.f14770o00oOOoO, this, oOO000.o00oOo0o());
        }

        @Override // o0OOo0o0.oO00000o
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("AtomicSelectOp(sequence=");
            o00oOOo02.append(this.f14772o00oOooO);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lo0OOo0oo/oOooo$o00oOOoO;", "Lo0OOo0o0/o0OOO0OO;", "Lo0OOo00O/o0OOO0OO;", "o00oo0o0", "Lo0OOo00O/o0OOO0OO;", "handle", "<init>", "(Lo0OOo00O/o0OOO0OO;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOO0OO {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o0OOo00O.o0OOO0OO f14773o00oo0o0;

        public o00oOOoO(@NotNull o0OOo00O.o0OOO0OO o0ooo0oo) {
            this.f14773o00oo0o0 = o0ooo0oo;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo0oo/oOooo$o00oOo00;", "Lo0OOo0o0/oO00000o;", "", "affected", "o00oOo00", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "o00oOOo0", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/o0O0oo00;", "()Lo0OOo0o0/o0O0oo00;", "atomicOp", "<init>", "(Lo0OOo0o0/o0OOO0OO$o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends oO00000o {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OOO0OO.o00oOo0O f14774o00oOOo0;

        public o00oOo00(@NotNull o0OOO0OO.o00oOo0O o00ooo0o2) {
            this.f14774o00oOOo0 = o00ooo0o2;
        }

        @Override // o0OOo0o0.oO00000o
        @NotNull
        public o0O0oo00<?> o00oOOo0() {
            return this.f14774o00oOOo0.o00oOOo0();
        }

        @Override // o0OOo0o0.oO00000o
        @Nullable
        public Object o00oOo00(@Nullable Object obj) {
            if (obj != null) {
                oOooo ooooo = (oOooo) obj;
                this.f14774o00oOOo0.o00oOooO();
                Object o00oOo0O2 = this.f14774o00oOOo0.o00oOOo0().o00oOo0O(null);
                androidx.concurrent.futures.o00oOo00.o00oOOo0(oOooo.f14767o00oo0o, ooooo, this, o00oOo0O2 == null ? this.f14774o00oOOo0.f14604o00oOo00 : oOO000.o00oOo0o());
                return o00oOo0O2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lo0OOo0oo/oOooo$o00oOo0O;", "Lo0OOo00O/oO000Oo0;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o0O00", "<init>", "(Lo0OOo0oo/oOooo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class o00oOo0O extends oO000Oo0 {
        public o00oOo0O() {
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            o0O00(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        @Override // o0OOo00O.o0ooO
        public void o0O00(@Nullable Throwable th) {
            if (oOooo.this.o00oo0oO()) {
                oOooo.this.o00ooO0(o0O00O0().o00ooOoO());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "o0OOo00O/oO00o0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo f14776o00oo0O;

        public o00oOoO(o00oo o00ooVar) {
            this.f14776o00oo0O = o00ooVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (oOooo.this.o00oo0oO()) {
                o00oo o00ooVar = this.f14776o00oo0O;
                oOooo ooooo = oOooo.this;
                ooooo.getClass();
                o0O000.o00oOooO(o00ooVar, ooooo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oOooo(@NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        this.f14769o00oo0o0 = o00ooo0o2;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o0OOO0.o00oOoO getCallerFrame() {
        o0OO.o00oOo0O<R> o00ooo0o2 = this.f14769o00oo0o0;
        if (o00ooo0o2 instanceof o0OOO0.o00oOoO) {
            return (o0OOO0.o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o00oo0 getContext() {
        return this.f14769o00oo0o0.getContext();
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o0OOo0oo.oOO0000
    public void o00oOo00(@NotNull o0OOo00O.o0OOO0OO o0ooo0oo) {
        o00oOOoO o00ooooo2 = new o00oOOoO(o0ooo0oo);
        if (!o00oo00O()) {
            o00ooOO0(o00ooooo2);
            if (!o00oo00O()) {
                return;
            }
        }
        o0ooo0oo.o00oOOoO();
    }

    @Override // o0OOo0oo.oOO0000
    @Nullable
    public Object o00oOo0O(@NotNull o0oOo0O0 o0ooo0o0) {
        return new o00oOOo0(this, o0ooo0o0).o00oOo00(null);
    }

    @Override // o0OOo0oo.oO0oO000
    public void o00oOooO(long j, @NotNull o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
        if (j > 0) {
            o00oOo00(o0OO0O0.o00oOooO(getContext()).o0O000O(j, new o00oOoO(o00ooVar), getContext()));
        } else if (o00oo0oO()) {
            o0O000O.o00oOo00(o00ooVar, this);
        }
    }

    @Override // o0OOo0oo.oO0oO000
    public void o00oOooo(@NotNull oOo00o00 ooo00o00, @NotNull o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
        ooo00o00.o0O0o(this, o00ooVar);
    }

    @Override // o0OOo0oo.oOO0000
    @NotNull
    public o0OO.o00oOo0O<R> o00oo() {
        return this;
    }

    @Override // o0OOo0oo.oOO0000
    public boolean o00oo00O() {
        while (true) {
            Object obj = this._state;
            if (obj == oOO000.o00oOo0o()) {
                return false;
            }
            if (!(obj instanceof oO00000o)) {
                return true;
            }
            ((oO00000o) obj).o00oOo00(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0oo.oO0oO000
    public <Q> void o00oo0O(@NotNull oO<? extends Q> oOVar, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        oOVar.o00oo0o(this, o0o00000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0oo.oO0oO000
    public <P, Q> void o00oo0Oo(@NotNull oOO00000<? super P, ? extends Q> ooo00000, P p, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        ooo00000.o00ooOOo(this, p, o0o00000);
    }

    @Override // o0OOo0oo.oO0oO000
    public <P, Q> void o00oo0o0(@NotNull oOO00000<? super P, ? extends Q> ooo00000, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        o00oo0Oo(ooo00000, null, o0o00000);
    }

    @Override // o0OOo0oo.oOO0000
    public boolean o00oo0oO() {
        Object o00ooO002 = o00ooO00(null);
        if (o00ooO002 == o0O00O0.f14003o00oOooO) {
            return true;
        }
        if (o00ooO002 == null) {
            return false;
        }
        throw new IllegalStateException(o0O000o0.o00oOOo0("Unexpected trySelectIdempotent result ", o00ooO002));
    }

    @Override // o0OOo0oo.oOO0000
    public void o00ooO0(@NotNull Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == oOO000.o00oOo00()) {
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, oOO000.f14762o00oOo00, new o0O0O0Oo(th, false, 2, null))) {
                    return;
                }
            } else {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (obj != o00oooo02) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, o00oooo02, oOO000.f14764o00oOooO)) {
                    o0OO.o00oOo0O o00oOooO2 = o0OOO00o.o00oOo00.o00oOooO(this.f14769o00oo0o0);
                    oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                    o00oOooO2.resumeWith(oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th)));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        o0O00OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        return o0OOo00O.o0O00O0.f14003o00oOooO;
     */
    @Override // o0OOo0oo.oOO0000
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o00ooO00(@org.jetbrains.annotations.Nullable o0OOo0o0.o0OOO0OO.o00oOo0O r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = o0OOo0oo.oOO000.o00oOo0o()
            r2 = 0
            if (r0 != r1) goto L32
            if (r4 != 0) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o0OOo0oo.oOooo.f14767o00oo0o
            java.lang.Object r1 = o0OOo0oo.oOO000.f14760o00oOOo0
            boolean r0 = androidx.concurrent.futures.o00oOo00.o00oOOo0(r0, r3, r1, r2)
            if (r0 != 0) goto L2c
            goto L0
        L16:
            o0OOo0oo.oOooo$o00oOo00 r0 = new o0OOo0oo.oOooo$o00oOo00
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o0OOo0oo.oOooo.f14767o00oo0o
            java.lang.Object r2 = o0OOo0oo.oOO000.f14760o00oOOo0
            boolean r1 = androidx.concurrent.futures.o00oOo00.o00oOOo0(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.o00oOo00(r3)
            if (r4 == 0) goto L2c
            return r4
        L2c:
            r3.o0O00OO()
            o0OOo0o0.oO0o0o r4 = o0OOo00O.o0O00O0.f14003o00oOooO
            return r4
        L32:
            boolean r1 = r0 instanceof o0OOo0o0.oO00000o
            if (r1 == 0) goto L66
            if (r4 == 0) goto L60
            o0OOo0o0.o0O0oo00 r1 = r4.o00oOOo0()
            boolean r2 = r1 instanceof o0OOo0oo.oOooo.o00oOOo0
            if (r2 == 0) goto L54
            r2 = r1
            o0OOo0oo.oOooo$o00oOOo0 r2 = (o0OOo0oo.oOooo.o00oOOo0) r2
            o0OOo0oo.oOooo<?> r2 = r2.f14770o00oOOoO
            if (r2 == r3) goto L48
            goto L54
        L48:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L54:
            r2 = r0
            o0OOo0o0.oO00000o r2 = (o0OOo0o0.oO00000o) r2
            boolean r1 = r1.o00oOOoO(r2)
            if (r1 == 0) goto L60
            java.lang.Object r4 = o0OOo0o0.oooOO0.f14679o00oOOoO
            return r4
        L60:
            o0OOo0o0.oO00000o r0 = (o0OOo0o0.oO00000o) r0
            r0.o00oOo00(r3)
            goto L0
        L66:
            if (r4 != 0) goto L69
            return r2
        L69:
            o0OOo0o0.o0OOO0OO$o00oOOo0 r4 = r4.f14604o00oOo00
            if (r0 != r4) goto L70
            o0OOo0o0.oO0o0o r4 = o0OOo00O.o0O00O0.f14003o00oOooO
            return r4
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0oo.oOooo.o00ooO00(o0OOo0o0.o0OOO0OO$o00oOo0O):java.lang.Object");
    }

    public final void o00ooo00() {
        ooOOOOoo oooooooo = (ooOOOOoo) getContext().get(ooOOOOoo.f14136o00oOoO);
        if (oooooooo == null) {
            return;
        }
        o0OOo00O.o0OOO0OO o00oOo0o2 = ooOOOOoo.o00oOOo0.o00oOo0o(oooooooo, true, false, new o00oOo0O(), 2, null);
        this._parentHandle = o00oOo0o2;
        if (o00oo00O()) {
            o00oOo0o2.o00oOOoO();
        }
    }

    public final void o0O00OO() {
        o0OOo00O.o0OOO0OO o0ooo0oo = (o0OOo00O.o0OOO0OO) this._parentHandle;
        if (o0ooo0oo != null) {
            o0ooo0oo.o00oOOoO();
        }
        for (o0OOO0OO o0ooo0oo2 = (o0OOO0OO) o00ooooO(); !o0ooO.o00oOoO0(o0ooo0oo2, this); o0ooo0oo2 = o0ooo0oo2.o00ooooo()) {
            if (o0ooo0oo2 instanceof o00oOOoO) {
                ((o00oOOoO) o0ooo0oo2).f14773o00oo0o0.o00oOOoO();
            }
        }
    }

    public final void o0O00OOO(o0OOOO.o00oOOo0<? extends Object> o00oooo02, o0OOOO.o00oOOo0<oO0Ooooo> o00oooo03) {
        while (true) {
            Object obj = this._result;
            if (obj == oOO000.o00oOo00()) {
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, oOO000.f14762o00oOo00, o00oooo02.invoke())) {
                    return;
                }
            } else {
                o0OOO00o.o00oOOo0 o00oooo04 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (obj != o00oooo04) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, o00oooo04, oOO000.f14764o00oOooO)) {
                    o00oooo03.invoke();
                    return;
                }
            }
        }
    }

    public final o0OOo00O.o0OOO0OO o0O00Oo() {
        return (o0OOo00O.o0OOO0OO) this._parentHandle;
    }

    @o0O
    public final void o0O00OoO(@NotNull Throwable th) {
        if (o00oo0oO()) {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            resumeWith(oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object o0oO0Ooo2 = o0oO0Ooo();
            if ((o0oO0Ooo2 instanceof o0O0O0Oo) && ((o0O0O0Oo) o0oO0Ooo2).f14007o00oOOo0 == th) {
                return;
            }
            o0O0o0.o00oOOoO(getContext(), th);
        }
    }

    public final void o0O00Ooo(o0OOo00O.o0OOO0OO o0ooo0oo) {
        this._parentHandle = o0ooo0oo;
    }

    @o0O
    @Nullable
    public final Object o0oO0Ooo() {
        if (!o00oo00O()) {
            o00ooo00();
        }
        Object obj = this._result;
        if (obj == oOO000.o00oOo00()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14768o00oo0oO;
            Object obj2 = oOO000.f14762o00oOo00;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, obj2, o00oooo02)) {
                return o00oooo02;
            }
            obj = this._result;
        }
        if (obj != oOO000.f14764o00oOooO) {
            if (obj instanceof o0O0O0Oo) {
                throw ((o0O0O0Oo) obj).f14007o00oOOo0;
            }
            return obj;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        o0OO.o00oOo0O<R> o00ooo0o2;
        while (true) {
            Object obj2 = this._result;
            if (obj2 == oOO000.o00oOo00()) {
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, oOO000.f14762o00oOo00, o0O0OOO.o00oOooO(obj, null, 1, null))) {
                    return;
                }
            } else {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (obj2 != o00oooo02) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14768o00oo0oO, this, o00oooo02, oOO000.f14764o00oOooO)) {
                    if (oo0oO0.m13isFailureimpl(obj)) {
                        o00ooo0o2 = this.f14769o00oo0o0;
                        Throwable m10exceptionOrNullimpl = oo0oO0.m10exceptionOrNullimpl(obj);
                        o0ooO.o00oo00O(m10exceptionOrNullimpl);
                        oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                        obj = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(m10exceptionOrNullimpl));
                    } else {
                        o00ooo0o2 = this.f14769o00oo0o0;
                    }
                    o00ooo0o2.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @Override // o0OOo0o0.o0OOO0OO
    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SelectInstance(state=");
        o00oOOo02.append(this._state);
        o00oOOo02.append(", result=");
        o00oOOo02.append(this._result);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
