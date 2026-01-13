package o0OOo0O0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OOo00O.oo0ooO;
import o0OOo0O0.o0O00;
import o0OOo0O0.o0OooO0;
import o0OOo0o0.o0OO0o00;
import o0OOo0o0.o0OOO0;
import o0OOo0o0.o0OOO0O;
import o0OOo0o0.o0OOO0OO;
import o0OOo0o0.o0OOOO00;
import o0OOo0o0.oO00000;
import o0OOo0o0.oO00O0o;
import o0OOo0o0.oO0o0o;
import o0OOo0o0.oooOO0;
import o0OOo0oo.oOO000;
import o0OOo0oo.oOO0000;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004ijklB)\u0012 \u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J¢\u0006\u0004\bh\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR.\u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0014\u0010Z\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0014\u0010\\\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u001a\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010^R\u0011\u0010b\u001a\u0002008F¢\u0006\u0006\u001a\u0004\ba\u0010UR#\u0010e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020c8F¢\u0006\u0006\u001a\u0004\bO\u0010dR\u0014\u0010g\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bf\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"Lo0OOo0O0/o00oo0OO;", "E", "Lo0OOo0O0/o0OooO0;", "Lo0OOo0O0/o0O00OO;", "closed", "", "o00ooO0o", "(Lo0OOo0O0/o0O00OO;)Ljava/lang/Throwable;", "element", "o00ooO0O", "(Ljava/lang/Object;Lo0OOo0O0/o0O00OO;)Ljava/lang/Throwable;", "Lo0OO0o/oO0Ooooo;", "o00ooooO", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OO/o00oOo0O;", "o00ooOO", "(Lo0OO/o00oOo0O;Ljava/lang/Object;Lo0OOo0O0/o0O00OO;)V", "cause", "o00ooOOo", "(Ljava/lang/Throwable;)V", "o00ooO0", "(Lo0OOo0O0/o0O00OO;)V", "R", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "", "block", "o00oooo0", "(Lo0OOo0oo/oOO0000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "", "o00oOoOo", "()I", "o00ooo0O", "(Ljava/lang/Object;)Ljava/lang/Object;", "o00oooOO", "(Ljava/lang/Object;Lo0OOo0oo/oOO0000;)Ljava/lang/Object;", "Lo0OOo0O0/o0O0OOOo;", "o0", "()Lo0OOo0O0/o0O0OOOo;", "Lo0OOo0O0/o0O0OOO0;", "o00oooo", "(Ljava/lang/Object;)Lo0OOo0O0/o0O0OOO0;", "Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "Lkotlinx/coroutines/internal/AddLastDesc;", "o00oOoo0", "(Ljava/lang/Object;)Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "o00ooOo", "", "offer", "(Ljava/lang/Object;)Z", "Lo0OOo0O0/o0O00;", "o00oo0o0", "send", "o00oo0", "(Lo0OOo0O0/o0O0OOOo;)Ljava/lang/Object;", "o00ooo0", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "o00oOooO", "(Lo0OOOO/o00oo;)V", "Lo0OOo0o0/o0OOO0OO;", "o00oooOo", "(Lo0OOo0o0/o0OOO0OO;)V", "o00ooooo", "()Lo0OOo0O0/o0O0OOO0;", "Lo0OOo0O0/o00oo0OO$o00oOo0O;", "o00oOooo", "(Ljava/lang/Object;)Lo0OOo0O0/o00oo0OO$o00oOo0O;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o00oo0O0", "Lo0OOOO/o00oo;", "onUndeliveredElement", "Lo0OOo0o0/o0OOO0;", "o00oo0O", "Lo0OOo0o0/o0OOO0;", "o0O0o", "()Lo0OOo0o0/o0OOO0;", "queue", "o00ooo00", "()Z", "isFullImpl", "o00ooO00", "queueDebugStateString", "o00ooOoO", "isBufferAlwaysFull", "o00ooOoo", "isBufferFull", "o00oo0o", "()Lo0OOo0O0/o0O00OO;", "closedForSend", "closedForReceive", "o00oooO", "isClosedForSend", "Lo0OOo0oo/oOO00000;", "()Lo0OOo0oo/oOO00000;", "onSend", "o00oo0OO", "bufferDebugString", "<init>", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "o00oOo0O", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o00oo0OO<E> implements o0OooO0<E> {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14251o00oo0Oo = AtomicReferenceFieldUpdater.newUpdater(o00oo0OO.class, Object.class, "onCloseHandler");
    @o0OOOO0o.o00oOoO
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOOO.o00oo<E, oO0Ooooo> f14253o00oo0O0;
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OOO0 f14252o00oo0O = new o0OOO0();
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0OOo0O0/o00oo0OO$o00oOOo0;", "E", "Lo0OOo0O0/o0O0OOOo;", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/oO0o0o;", "o0O00O0o", "Lo0OO0o/oO0Ooooo;", "o0O00", "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", "", "toString", "o00oo0o0", "Ljava/lang/Object;", "element", "", "o0O00O0", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> extends o0O0OOOo {
        @o0OOOO0o.o00oOoO

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final E f14254o00oo0o0;

        public o00oOOo0(E e) {
            this.f14254o00oo0o0 = e;
        }

        @Override // o0OOo0O0.o0O0OOOo
        public void o0O00() {
        }

        @Override // o0OOo0O0.o0O0OOOo
        @Nullable
        public Object o0O00O0() {
            return this.f14254o00oo0o0;
        }

        @Override // o0OOo0O0.o0O0OOOo
        @Nullable
        public oO0o0o o0O00O0o(@Nullable o0OOO0OO.o00oOo0O o00ooo0o2) {
            oO0o0o oo0o0o = o0OOo00O.o0O00O0.f14003o00oOooO;
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOooO();
            }
            return oo0o0o;
        }

        @Override // o0OOo0O0.o0O0OOOo
        public void o0OoO00O(@NotNull o0O00OO<?> o0o00oo) {
        }

        @Override // o0OOo0o0.o0OOO0OO
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SendBuffered@");
            o00oOOo02.append(oo0ooO.o00oOOoO(this));
            o00oOOo02.append('(');
            o00oOOo02.append(this.f14254o00oo0o0);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lo0OOo0O0/o00oo0OO$o00oOOoO;", "E", "Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "Lo0OOo0O0/o00oo0OO$o00oOOo0;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lo0OOo0o0/o0OOO0OO;", "affected", "", "o00oOo0O", "Lo0OOo0o0/o0OOO0;", "queue", "element", "<init>", "(Lo0OOo0o0/o0OOO0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o00oOOoO<E> extends o0OOO0OO.o00oOOoO<o00oOOo0<? extends E>> {
        public o00oOOoO(@NotNull o0OOO0 o0ooo0, E e) {
            super(o0ooo0, new o00oOOo0(e));
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOo0O(@NotNull o0OOO0OO o0ooo0oo) {
            if (o0ooo0oo instanceof o0O00OO) {
                return o0ooo0oo;
            }
            if (o0ooo0oo instanceof o0O0OOO0) {
                return o00oo0.f14230o00oOo0O;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0016\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lo0OOo0O0/o00oo0OO$o00oOo00;", "E", "R", "Lo0OOo0O0/o0O0OOOo;", "Lo0OOo00O/o0OOO0OO;", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/oO0o0o;", "o0O00O0o", "Lo0OO0o/oO0Ooooo;", "o0O00", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", "o0O00O", "", "toString", "o00oo0o0", "Ljava/lang/Object;", "o0O00O0", "()Ljava/lang/Object;", "pollResult", "Lo0OOo0O0/o00oo0OO;", "o00oo0o", "Lo0OOo0O0/o00oo0OO;", "channel", "Lo0OOo0oo/oOO0000;", "o00oo0oO", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "Lo0OOo0O0/o0OooO0;", "Lo0OO/o00oOo0O;", "", "o0O0o", "Lo0OOOO/o0O00000;", "block", "<init>", "(Ljava/lang/Object;Lo0OOo0O0/o00oo0OO;Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<E, R> extends o0O0OOOo implements o0OOo00O.o0OOO0OO {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final o00oo0OO<E> f14255o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final E f14256o00oo0o0;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public final oOO0000<R> f14257o00oo0oO;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o0O0o  reason: collision with root package name */
        public final o0OOOO.o0O00000<o0OooO0<? super E>, o0OO.o00oOo0O<? super R>, Object> f14258o0O0o;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(E e, @NotNull o00oo0OO<E> o00oo0oo, @NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<? super o0OooO0<? super E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            this.f14256o00oo0o0 = e;
            this.f14255o00oo0o = o00oo0oo;
            this.f14257o00oo0oO = ooo0000;
            this.f14258o0O0o = o0o00000;
        }

        @Override // o0OOo00O.o0OOO0OO
        public void o00oOOoO() {
            if (o0OoOoOo()) {
                o0O00O();
            }
        }

        @Override // o0OOo0O0.o0O0OOOo
        public void o0O00() {
            o0OOo0o.o0O000.o00oOo0o(this.f14258o0O0o, this.f14255o00oo0o, this.f14257o00oo0oO.o00oo(), null, 4, null);
        }

        @Override // o0OOo0O0.o0O0OOOo
        public void o0O00O() {
            o0OOOO.o00oo<E, oO0Ooooo> o00ooVar = this.f14255o00oo0o.f14253o00oo0O0;
            if (o00ooVar != null) {
                oO00000.o00oOOoO(o00ooVar, this.f14256o00oo0o0, this.f14257o00oo0oO.o00oo().getContext());
            }
        }

        @Override // o0OOo0O0.o0O0OOOo
        public E o0O00O0() {
            return this.f14256o00oo0o0;
        }

        @Override // o0OOo0O0.o0O0OOOo
        @Nullable
        public oO0o0o o0O00O0o(@Nullable o0OOO0OO.o00oOo0O o00ooo0o2) {
            return (oO0o0o) this.f14257o00oo0oO.o00ooO00(o00ooo0o2);
        }

        @Override // o0OOo0O0.o0O0OOOo
        public void o0OoO00O(@NotNull o0O00OO<?> o0o00oo) {
            if (this.f14257o00oo0oO.o00oo0oO()) {
                this.f14257o00oo0oO.o00ooO0(o0o00oo.o0oO0Ooo());
            }
        }

        @Override // o0OOo0o0.o0OOO0OO
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SendSelect@");
            o00oOOo02.append(oo0ooO.o00oOOoO(this));
            o00oOOo02.append('(');
            o00oOOo02.append(this.f14256o00oo0o0);
            o00oOOo02.append(")[");
            o00oOOo02.append(this.f14255o00oo0o);
            o00oOOo02.append(", ");
            o00oOOo02.append(this.f14257o00oo0oO);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Lo0OOo0O0/o00oo0OO$o00oOo0O;", "E", "Lo0OOo0o0/o0OOO0OO$o00oOoO;", "Lo0OOo0O0/o0O0OOO0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lo0OOo0o0/o0OOO0OO;", "affected", "", "o00oOo0O", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "o00oOoOo", "Ljava/lang/Object;", "element", "Lo0OOo0o0/o0OOO0;", "queue", "<init>", "(Ljava/lang/Object;Lo0OOo0o0/o0OOO0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<E> extends o0OOO0OO.o00oOoO<o0O0OOO0<? super E>> {
        @o0OOOO0o.o00oOoO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final E f14259o00oOo0O;

        public o00oOo0O(E e, @NotNull o0OOO0 o0ooo0) {
            super(o0ooo0);
            this.f14259o00oOo0O = e;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOoO, o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOo0O(@NotNull o0OOO0OO o0ooo0oo) {
            if (o0ooo0oo instanceof o0O00OO) {
                return o0ooo0oo;
            }
            if (o0ooo0oo instanceof o0O0OOO0) {
                return null;
            }
            return o00oo0.f14230o00oOo0O;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOoOo(@NotNull o0OOO0OO.o00oOo0O o00ooo0o2) {
            oO0o0o o0O0o2 = ((o0O0OOO0) o00ooo0o2.f14602o00oOOo0).o0O0o(this.f14259o00oOo0O, o00ooo0o2);
            if (o0O0o2 == null) {
                return o0OOOO00.f14633o00oOOo0;
            }
            Object obj = oooOO0.f14679o00oOOoO;
            if (o0O0o2 == obj) {
                return obj;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0o0/o0OOO0OO$o00oo00O", "Lo0OOo0o0/o0OOO0OO$o00oOo00;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "o00oOoo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0OOO0OO.o00oOo00 {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO f14260o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(o0OOO0OO o0ooo0oo, o00oo0OO o00oo0oo) {
            super(o0ooo0oo);
            this.f14260o00oOooO = o00oo0oo;
        }

        @Override // o0OOo0o0.o0O0oo00
        @Nullable
        /* renamed from: o00oOoo0 */
        public Object o00oOoOO(@NotNull o0OOO0OO o0ooo0oo) {
            if (this.f14260o00oOooO.o00ooOoo()) {
                return null;
            }
            return o0OOO0O.o00oOOo0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"o0OOo0O0/o00oo0OO$o00oo00O", "Lo0OOo0oo/oOO00000;", "Lo0OOo0O0/o0OooO0;", "R", "Lo0OOo0oo/oOO0000;", "select", "param", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "block", "Lo0OO0o/oO0Ooooo;", "o00ooOOo", "(Lo0OOo0oo/oOO0000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo00O implements oOO00000<E, o0OooO0<? super E>> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO<E> f14261o00oo0O0;

        public o00oo00O(o00oo0OO<E> o00oo0oo) {
            this.f14261o00oo0O0 = o00oo0oo;
        }

        @Override // o0OOo0oo.oOO00000
        public <R> void o00ooOOo(@NotNull oOO0000<? super R> ooo0000, E e, @NotNull o0OOOO.o0O00000<? super o0OooO0<? super E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            this.f14261o00oo0O0.o00oooo0(ooo0000, e, o0o00000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00oo0OO(@Nullable o0OOOO.o00oo<? super E, oO0Ooooo> o00ooVar) {
        this.f14253o00oo0O0 = o00ooVar;
    }

    @Nullable
    public final o0O0OOOo o0() {
        o0OOO0OO o0ooo0oo;
        o0OOO0OO o0O000o02;
        o0OOO0 o0ooo0 = this.f14252o00oo0O;
        while (true) {
            o0ooo0oo = (o0OOO0OO) o0ooo0.o00ooooO();
            if (o0ooo0oo != o0ooo0 && (o0ooo0oo instanceof o0O0OOOo)) {
                if (((((o0O0OOOo) o0ooo0oo) instanceof o0O00OO) && !o0ooo0oo.o0O0000o()) || (o0O000o02 = o0ooo0oo.o0O000o0()) == null) {
                    break;
                }
                o0O000o02.o0O0000O();
            }
        }
        o0ooo0oo = null;
        return (o0O0OOOo) o0ooo0oo;
    }

    public final int o00oOoOo() {
        o0OOO0 o0ooo0 = this.f14252o00oo0O;
        int i = 0;
        for (o0OOO0OO o0ooo0oo = (o0OOO0OO) o0ooo0.o00ooooO(); !o0OOOOO0.o0ooO.o00oOoO0(o0ooo0oo, o0ooo0); o0ooo0oo = o0ooo0oo.o00ooooo()) {
            if (o0ooo0oo instanceof o0OOO0OO) {
                i++;
            }
        }
        return i;
    }

    @NotNull
    public final o0OOO0OO.o00oOOoO<?> o00oOoo0(E e) {
        return new o00oOOoO(this.f14252o00oo0O, e);
    }

    @Override // o0OOo0O0.o0OooO0
    public void o00oOooO(@NotNull o0OOOO.o00oo<? super Throwable, oO0Ooooo> o00ooVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14251o00oo0Oo;
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, null, o00ooVar)) {
            o0O00OO<?> o00oo0o2 = o00oo0o();
            if (o00oo0o2 == null || !androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, o00ooVar, o00oo0.f14232o00oOoO)) {
                return;
            }
            o00ooVar.invoke(o00oo0o2.f14289o00oo0o0);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == o00oo0.f14232o00oOoO) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj);
    }

    @NotNull
    public final o00oOo0O<E> o00oOooo(E e) {
        return new o00oOo0O<>(e, this.f14252o00oo0O);
    }

    @Nullable
    public Object o00oo0(@NotNull o0O0OOOo o0o0oooo) {
        boolean z;
        o0OOO0OO o02;
        if (o00ooOoO()) {
            o0OOO0OO o0ooo0oo = this.f14252o00oo0O;
            do {
                o02 = o0ooo0oo.o0();
                if (o02 instanceof o0O0OOO0) {
                    return o02;
                }
            } while (!o02.o00ooOoO(o0o0oooo, o0ooo0oo));
            return null;
        }
        o0OOO0OO o0ooo0oo2 = this.f14252o00oo0O;
        o00oOoO o00oooo2 = new o00oOoO(o0o0oooo, this);
        while (true) {
            o0OOO0OO o03 = o0ooo0oo2.o0();
            if (!(o03 instanceof o0O0OOO0)) {
                int o0ooOoOO2 = o03.o0ooOoOO(o0o0oooo, o0ooo0oo2, o00oooo2);
                z = true;
                if (o0ooOoOO2 != 1) {
                    if (o0ooOoOO2 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return o03;
            }
        }
        if (z) {
            return null;
        }
        return o00oo0.f14233o00oOoO0;
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public final oOO00000<E, o0OooO0<E>> o00oo0O() {
        return new o00oo00O(this);
    }

    @Nullable
    public final o0O00OO<?> o00oo0O0() {
        o0OOO0OO o00ooooo2 = this.f14252o00oo0O.o00ooooo();
        o0O00OO<?> o0o00oo = o00ooooo2 instanceof o0O00OO ? (o0O00OO) o00ooooo2 : null;
        if (o0o00oo != null) {
            o00ooO0(o0o00oo);
            return o0o00oo;
        }
        return null;
    }

    @NotNull
    public String o00oo0OO() {
        return "";
    }

    @Nullable
    public final o0O00OO<?> o00oo0o() {
        o0OOO0OO o02 = this.f14252o00oo0O.o0();
        o0O00OO<?> o0o00oo = o02 instanceof o0O00OO ? (o0O00OO) o02 : null;
        if (o0o00oo != null) {
            o00ooO0(o0o00oo);
            return o0o00oo;
        }
        return null;
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public final Object o00oo0o0(E e) {
        o0O00.o00oOOoO o00ooooo2;
        o0O00OO<?> o0o00oo;
        Object o00ooo0O2 = o00ooo0O(e);
        if (o00ooo0O2 == o00oo0.f14234o00oOooO) {
            o0O00.o00oOOoO o00ooooo3 = o0O00.f14268o00oOOoO;
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o00ooooo3.getClass();
            return o0O00.o00oOo00(oo0ooooo);
        }
        if (o00ooo0O2 == o00oo0.f14230o00oOo0O) {
            o0o00oo = o00oo0o();
            if (o0o00oo == null) {
                o0O00.f14268o00oOOoO.getClass();
                return o0O00.f14269o00oOo00;
            }
            o00ooooo2 = o0O00.f14268o00oOOoO;
        } else if (!(o00ooo0O2 instanceof o0O00OO)) {
            throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("trySend returned ", o00ooo0O2));
        } else {
            o00ooooo2 = o0O00.f14268o00oOOoO;
            o0o00oo = (o0O00OO) o00ooo0O2;
        }
        return o00ooooo2.o00oOOo0(o00ooO0o(o0o00oo));
    }

    public final void o00ooO0(o0O00OO<?> o0o00oo) {
        Object obj = null;
        while (true) {
            o0OOO0OO o02 = o0o00oo.o0();
            o0O0OO0 o0o0oo0 = o02 instanceof o0O0OO0 ? (o0O0OO0) o02 : null;
            if (o0o0oo0 == null) {
                break;
            } else if (o0o0oo0.o0OoOoOo()) {
                obj = o0OO0o00.o00oOoO(obj, o0o0oo0);
            } else {
                o0o0oo0.o0O00000();
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    ((o0O0OO0) arrayList.get(size)).o0OoO00O(o0o00oo);
                }
            } else {
                ((o0O0OO0) obj).o0OoO00O(o0o00oo);
            }
        }
        o00oooOo(o0o00oo);
    }

    public final String o00ooO00() {
        String str;
        o0OOO0OO o00ooooo2 = this.f14252o00oo0O.o00ooooo();
        if (o00ooooo2 == this.f14252o00oo0O) {
            return "EmptyQueue";
        }
        if (o00ooooo2 instanceof o0O00OO) {
            str = o00ooooo2.toString();
        } else if (o00ooooo2 instanceof o0O0OO0) {
            str = "ReceiveQueued";
        } else if (o00ooooo2 instanceof o0O0OOOo) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + o00ooooo2;
        }
        o0OOO0OO o02 = this.f14252o00oo0O.o0();
        if (o02 != o00ooooo2) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, ",queueSize=");
            o00oOOo02.append(o00oOoOo());
            String sb = o00oOOo02.toString();
            if (o02 instanceof o0O00OO) {
                return sb + ",closedForSend=" + o02;
            }
            return sb;
        }
        return str;
    }

    public final Throwable o00ooO0O(E e, o0O00OO<?> o0o00oo) {
        oO00O0o o00oOooO2;
        o00ooO0(o0o00oo);
        o0OOOO.o00oo<E, oO0Ooooo> o00ooVar = this.f14253o00oo0O0;
        if (o00ooVar == null || (o00oOooO2 = oO00000.o00oOooO(o00ooVar, e, null, 2, null)) == null) {
            return o0o00oo.o0oO0Ooo();
        }
        o0OO0o.o0O00000.o00oOOo0(o00oOooO2, o0o00oo.o0oO0Ooo());
        throw o00oOooO2;
    }

    public final Throwable o00ooO0o(o0O00OO<?> o0o00oo) {
        o00ooO0(o0o00oo);
        return o0o00oo.o0oO0Ooo();
    }

    public final void o00ooOO(o0OO.o00oOo0O<?> o00ooo0o2, E e, o0O00OO<?> o0o00oo) {
        Object o00oOOo02;
        oO00O0o o00oOooO2;
        o00ooO0(o0o00oo);
        Throwable o0oO0Ooo2 = o0o00oo.o0oO0Ooo();
        o0OOOO.o00oo<E, oO0Ooooo> o00ooVar = this.f14253o00oo0O0;
        if (o00ooVar == null || (o00oOooO2 = oO00000.o00oOooO(o00ooVar, e, null, 2, null)) == null) {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00oOOo02 = o0OO0o.oo0ooO.o00oOOo0(o0oO0Ooo2);
        } else {
            o0OO0o.o0O00000.o00oOOo0(o00oOooO2, o0oO0Ooo2);
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            o00oOOo02 = o0OO0o.oo0ooO.o00oOOo0(o00oOooO2);
        }
        o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(o00oOOo02));
    }

    public final void o00ooOOo(Throwable th) {
        oO0o0o oo0o0o;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (oo0o0o = o00oo0.f14232o00oOoO) || !androidx.concurrent.futures.o00oOo00.o00oOOo0(f14251o00oo0Oo, this, obj, oo0o0o)) {
            return;
        }
        ((o0OOOO.o00oo) o0OOOOO0.o0OOO0OO.o00oo0O(obj, 1)).invoke(th);
    }

    @Override // o0OOo0O0.o0OooO0
    @Nullable
    public final Object o00ooOo(E e, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00ooooO2;
        return (o00ooo0O(e) != o00oo0.f14234o00oOooO && (o00ooooO2 = o00ooooO(e, o00ooo0o2)) == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) ? o00ooooO2 : oO0Ooooo.f13240o00oOOo0;
    }

    public abstract boolean o00ooOoO();

    public abstract boolean o00ooOoo();

    @Override // o0OOo0O0.o0OooO0
    public boolean o00ooo0(@Nullable Throwable th) {
        boolean z;
        o0O00OO<?> o0o00oo = new o0O00OO<>(th);
        o0OOO0OO o0ooo0oo = this.f14252o00oo0O;
        while (true) {
            o0OOO0OO o02 = o0ooo0oo.o0();
            z = true;
            if (!(!(o02 instanceof o0O00OO))) {
                z = false;
                break;
            } else if (o02.o00ooOoO(o0o00oo, o0ooo0oo)) {
                break;
            }
        }
        if (!z) {
            o0o00oo = (o0O00OO) this.f14252o00oo0O.o0();
        }
        o00ooO0(o0o00oo);
        if (z) {
            o00ooOOo(th);
        }
        return z;
    }

    public final boolean o00ooo00() {
        return !(this.f14252o00oo0O.o00ooooo() instanceof o0O0OOO0) && o00ooOoo();
    }

    @NotNull
    public Object o00ooo0O(E e) {
        o0O0OOO0<E> o00ooooo2;
        do {
            o00ooooo2 = o00ooooo();
            if (o00ooooo2 == null) {
                return o00oo0.f14230o00oOo0O;
            }
        } while (o00ooooo2.o0O0o(e, null) == null);
        o00ooooo2.o00oo0(e);
        return o00ooooo2.o00oOo0o();
    }

    @Override // o0OOo0O0.o0OooO0
    public final boolean o00oooO() {
        return o00oo0o() != null;
    }

    @NotNull
    public Object o00oooOO(E e, @NotNull oOO0000<?> ooo0000) {
        o00oOo0O<E> o00oOooo2 = o00oOooo(e);
        Object o00oOo0O2 = ooo0000.o00oOo0O(o00oOooo2);
        if (o00oOo0O2 != null) {
            return o00oOo0O2;
        }
        o0O0OOO0<? super E> o00oo0OO2 = o00oOooo2.o00oo0OO();
        o00oo0OO2.o00oo0(e);
        return o00oo0OO2.o00oOo0o();
    }

    public void o00oooOo(@NotNull o0OOO0OO o0ooo0oo) {
    }

    @Nullable
    public final o0O0OOO0<?> o00oooo(E e) {
        o0OOO0OO o02;
        o0OOO0OO o0ooo0oo = this.f14252o00oo0O;
        o00oOOo0 o00oooo02 = new o00oOOo0(e);
        do {
            o02 = o0ooo0oo.o0();
            if (o02 instanceof o0O0OOO0) {
                return (o0O0OOO0) o02;
            }
        } while (!o02.o00ooOoO(o00oooo02, o0ooo0oo));
        return null;
    }

    public final <R> void o00oooo0(oOO0000<? super R> ooo0000, E e, o0OOOO.o0O00000<? super o0OooO0<? super E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        while (!ooo0000.o00oo00O()) {
            if (o00ooo00()) {
                o00oOo00 o00ooo002 = new o00oOo00(e, this, ooo0000, o0o00000);
                Object o00oo02 = o00oo0(o00ooo002);
                if (o00oo02 == null) {
                    ooo0000.o00oOo00(o00ooo002);
                    return;
                } else if (o00oo02 instanceof o0O00OO) {
                    throw o0OOo0o0.oO0Ooooo.o00oo0O0(o00ooO0O(e, (o0O00OO) o00oo02));
                } else {
                    if (o00oo02 != o00oo0.f14233o00oOoO0 && !(o00oo02 instanceof o0O0OO0)) {
                        throw new IllegalStateException(("enqueueSend returned " + o00oo02 + ' ').toString());
                    }
                }
            }
            Object o00oooOO2 = o00oooOO(e, ooo0000);
            if (o00oooOO2 == oOO000.o00oOooO()) {
                return;
            }
            if (o00oooOO2 != o00oo0.f14230o00oOo0O && o00oooOO2 != oooOO0.f14679o00oOOoO) {
                if (o00oooOO2 == o00oo0.f14234o00oOooO) {
                    o0OOo0o.o0O000O.o00oOooO(o0o00000, this, ooo0000.o00oo());
                    return;
                } else if (!(o00oooOO2 instanceof o0O00OO)) {
                    throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("offerSelectInternal returned ", o00oooOO2));
                } else {
                    throw o0OOo0o0.oO0Ooooo.o00oo0O0(o00ooO0O(e, (o0O00OO) o00oooOO2));
                }
            }
        }
    }

    public final Object o00ooooO(E e, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        o0OOo00O.o0O00 o00oOOoO2 = o0OOo00O.o0OoO00O.o00oOOoO(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2));
        while (true) {
            if (o00ooo00()) {
                o0O0OOOo oo0oooo = this.f14253o00oo0O0 == null ? new oo0OOoo(e, o00oOOoO2) : new o0O0o000(e, o00oOOoO2, this.f14253o00oo0O0);
                Object o00oo02 = o00oo0(oo0oooo);
                if (o00oo02 == null) {
                    o0OOo00O.o0OoO00O.o00oOo00(o00oOOoO2, oo0oooo);
                    break;
                } else if (o00oo02 instanceof o0O00OO) {
                    o00ooOO(o00oOOoO2, e, (o0O00OO) o00oo02);
                    break;
                } else if (o00oo02 != o00oo0.f14233o00oOoO0 && !(o00oo02 instanceof o0O0OO0)) {
                    throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("enqueueSend returned ", o00oo02));
                }
            }
            Object o00ooo0O2 = o00ooo0O(e);
            if (o00ooo0O2 == o00oo0.f14234o00oOooO) {
                oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
                o00oOOoO2.resumeWith(oo0oO0.m7constructorimpl(oO0Ooooo.f13240o00oOOo0));
                break;
            } else if (o00ooo0O2 != o00oo0.f14230o00oOo0O) {
                if (!(o00ooo0O2 instanceof o0O00OO)) {
                    throw new IllegalStateException(o0OOo00O.o0O000o0.o00oOOo0("offerInternal returned ", o00ooo0O2));
                }
                o00ooOO(o00oOOoO2, e, (o0O00OO) o00ooo0O2);
            }
        }
        Object o00ooO002 = o00oOOoO2.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo03 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo03) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo03 ? o00ooO002 : oO0Ooooo.f13240o00oOOo0;
    }

    @Nullable
    public o0O0OOO0<E> o00ooooo() {
        o0OOO0OO o0ooo0oo;
        o0OOO0OO o0O000o02;
        o0OOO0 o0ooo0 = this.f14252o00oo0O;
        while (true) {
            o0ooo0oo = (o0OOO0OO) o0ooo0.o00ooooO();
            if (o0ooo0oo != o0ooo0 && (o0ooo0oo instanceof o0O0OOO0)) {
                if (((((o0O0OOO0) o0ooo0oo) instanceof o0O00OO) && !o0ooo0oo.o0O0000o()) || (o0O000o02 = o0ooo0oo.o0O000o0()) == null) {
                    break;
                }
                o0O000o02.o0O0000O();
            }
        }
        o0ooo0oo = null;
        return (o0O0OOO0) o0ooo0oo;
    }

    @NotNull
    public final o0OOO0 o0O0o() {
        return this.f14252o00oo0O;
    }

    @Override // o0OOo0O0.o0OooO0
    public boolean offer(E e) {
        oO00O0o o00oOooO2;
        try {
            return o0OooO0.o00oOOo0.o00oOo00(this, e);
        } catch (Throwable th) {
            o0OOOO.o00oo<E, oO0Ooooo> o00ooVar = this.f14253o00oo0O0;
            if (o00ooVar == null || (o00oOooO2 = oO00000.o00oOooO(o00ooVar, e, null, 2, null)) == null) {
                throw th;
            }
            o0OO0o.o0O00000.o00oOOo0(o00oOooO2, th);
            throw o00oOooO2;
        }
    }

    @NotNull
    public String toString() {
        return oo0ooO.o00oOOo0(this) + '@' + oo0ooO.o00oOOoO(this) + '{' + o00ooO00() + '}' + o00oo0OO();
    }
}
