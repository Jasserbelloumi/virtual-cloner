package o0OOo0O0;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO0o.o0OO000;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOo00O.o0O000Oo;
import o0OOo0O0.o0O00;
import o0OOo0O0.o0O000Oo;
import o0OOo0O0.o0O0OO;
import o0OOo0o0.o0OO0o00;
import o0OOo0o0.o0OOO0;
import o0OOo0o0.o0OOO0O;
import o0OOo0o0.o0OOO0OO;
import o0OOo0o0.o0OOOO00;
import o0OOo0o0.oO00000;
import o0OOo0o0.oO0Ooooo;
import o0OOo0o0.oO0o0o;
import o0OOo0o0.oooOO0;
import o0OOo0oo.oO;
import o0OOo0oo.oOO000;
import o0OOo0oo.oOO0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007),GWX YB)\u0012 \u0010T\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`S¢\u0006\u0004\bU\u0010VJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007J\u0016\u0010,\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000bH\u0014J/\u00106\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0004J\u0010\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014J\b\u0010?\u001a\u00020\u0013H\u0014R\u0014\u0010B\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010AR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0L8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bP\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Lo0OOo0O0/o00oo00O;", "E", "Lo0OOo0O0/o00oo0OO;", "Lo0OOo0O0/o0O000O;", "R", "", "receiveMode", "o0O00Oo", "(ILo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0O0OO0;", "receive", "", "o0O000Oo", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "", "Lo0OO/o00oOo0O;", "block", "Lo0OO0o/oO0Ooooo;", "o0oO0Ooo", "(Lo0OOo0oo/oOO0000;ILo0OOOO/o0O00000;)V", "value", "o0O00Ooo", "(Lo0OOOO/o0O00000;Lo0OOo0oo/oOO0000;ILjava/lang/Object;)V", "o0O000o0", "(Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;I)Z", "Lo0OOo00O/o0O000Oo;", "cont", "o0O00OoO", "o0O00OO", "o0O00OOO", "o00oo00O", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OoOoOO", "Lo0OOo0O0/o0O00;", "o00ooo0o", "o00ooOo0", "()Ljava/lang/Object;", "", "cause", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", o0OO000o.o00oOOoO.f12961o00oOo00, "o0O000O", "(Ljava/lang/Throwable;)Z", "wasClosed", "o0O00O0", "Lo0OOo0o0/o0OO0o00;", "Lo0OOo0O0/o0O0OOOo;", "list", "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", "(Ljava/lang/Object;Lo0OOo0O0/o0O00OO;)V", "Lo0OOo0O0/o0O000Oo;", "iterator", "Lo0OOo0O0/o00oo00O$o00oo0;", "o0OoOoOo", "Lo0OOo0O0/o0O0OOO0;", "o00ooooo", "o0O00O", "o0O00O0o", "o0ooOoOO", "()Z", "isBufferAlwaysEmpty", "o0O000oo", "isBufferEmpty", "o0O000o", "hasReceiveOrClosed", "o00oOo00", "isClosedForReceive", "isEmpty", "o0O00", "isEmptyImpl", "Lo0OOo0oo/oO;", "o00oo", "()Lo0OOo0oo/oO;", "onReceive", "o00ooO", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lo0OOOO/o00oo;)V", "o00oOo0O", "o00oOoO", "o00oo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o00oo00O<E> extends o0OOo0O0.o00oo0OO<E> implements o0O000O<E> {

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oOOo0;", "E", "Lo0OOo0O0/o0O000Oo;", "", "o00oOOo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "result", "o00oOo0O", "o00oOo0o", "Lo0OOo0O0/o00oo00O;", "Lo0OOo0O0/o00oo00O;", "channel", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/lang/Object;", "o00oOooO", "o00oOoO0", "(Ljava/lang/Object;)V", "<init>", "(Lo0OOo0O0/o00oo00O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> implements o0O000Oo<E> {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo00O<E> f14235o00oOOo0;
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Object f14236o00oOOoO = o0OOo0O0.o00oo0.f14231o00oOo0o;

        public o00oOOo0(@NotNull o00oo00O<E> o00oo00o) {
            this.f14235o00oOOo0 = o00oo00o;
        }

        @Override // o0OOo0O0.o0O000Oo
        public E next() {
            E e = (E) this.f14236o00oOOoO;
            if (e instanceof o0O00OO) {
                throw oO0Ooooo.o00oo0O0(((o0O00OO) e).o0O00Oo());
            }
            oO0o0o oo0o0o = o0OOo0O0.o00oo0.f14231o00oOo0o;
            if (e != oo0o0o) {
                this.f14236o00oOOoO = oo0o0o;
                return e;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }

        @Override // o0OOo0O0.o0O000Oo
        @Nullable
        public Object o00oOOo0(@NotNull o0OO.o00oOo0O<? super Boolean> o00ooo0o2) {
            Object obj = this.f14236o00oOOoO;
            oO0o0o oo0o0o = o0OOo0O0.o00oo0.f14231o00oOo0o;
            if (obj != oo0o0o) {
                return Boolean.valueOf(o00oOo0O(obj));
            }
            Object o0O00OO2 = this.f14235o00oOOo0.o0O00OO();
            this.f14236o00oOOoO = o0O00OO2;
            return o0O00OO2 != oo0o0o ? Boolean.valueOf(o00oOo0O(o0O00OO2)) : o00oOo0o(o00ooo0o2);
        }

        @Override // o0OOo0O0.o0O000Oo
        @o0OOOO0o.o00oo0OO(name = "next")
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object o00oOOoO(o0OO.o00oOo0O o00ooo0o2) {
            return o0O000Oo.o00oOOo0.o00oOOo0(this, o00ooo0o2);
        }

        public final boolean o00oOo0O(Object obj) {
            if (obj instanceof o0O00OO) {
                o0O00OO o0o00oo = (o0O00OO) obj;
                if (o0o00oo.f14289o00oo0o0 == null) {
                    return false;
                }
                throw oO0Ooooo.o00oo0O0(o0o00oo.o0O00Oo());
            }
            return true;
        }

        public final Object o00oOo0o(o0OO.o00oOo0O<? super Boolean> o00ooo0o2) {
            Object o00oOOo02;
            o0OOo00O.o0O00 o00oOOoO2 = o0OOo00O.o0OoO00O.o00oOOoO(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2));
            o00oOo0O o00ooo0o3 = new o00oOo0O(this, o00oOOoO2);
            while (true) {
                if (this.f14235o00oOOo0.o0O000Oo(o00ooo0o3)) {
                    this.f14235o00oOOo0.o0O00OoO(o00oOOoO2, o00ooo0o3);
                    break;
                }
                Object o0O00OO2 = this.f14235o00oOOo0.o0O00OO();
                this.f14236o00oOOoO = o0O00OO2;
                if (o0O00OO2 instanceof o0O00OO) {
                    o0O00OO o0o00oo = (o0O00OO) o0O00OO2;
                    if (o0o00oo.f14289o00oo0o0 == null) {
                        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
                        o00oOOo02 = Boolean.FALSE;
                    } else {
                        oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                        o00oOOo02 = oo0ooO.o00oOOo0(o0o00oo.o0O00Oo());
                    }
                    o00oOOoO2.resumeWith(oo0oO0.m7constructorimpl(o00oOOo02));
                } else if (o0O00OO2 != o0OOo0O0.o00oo0.f14231o00oOo0o) {
                    Boolean bool = Boolean.TRUE;
                    o0OOOO.o00oo<E, o0OO0o.oO0Ooooo> o00ooVar = this.f14235o00oOOo0.f14253o00oo0O0;
                    o00oOOoO2.o00ooOO(bool, o00ooVar != null ? new oO00000.o00oOOo0(o00ooVar, o0O00OO2, o00oOOoO2.getContext()) : null);
                }
            }
            Object o00ooO002 = o00oOOoO2.o00ooO00();
            if (o00ooO002 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
                o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
            }
            return o00ooO002;
        }

        public final void o00oOoO0(@Nullable Object obj) {
            this.f14236o00oOOoO = obj;
        }

        @Nullable
        public final Object o00oOooO() {
            return this.f14236o00oOOoO;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oOOoO;", "E", "Lo0OOo0O0/o0O0OO0;", "value", "", "o0O00O0o", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/oO0o0o;", "o0O0o", "(Ljava/lang/Object;Lo0OOo0o0/o0OOO0OO$o00oOo0O;)Lo0OOo0o0/oO0o0o;", "Lo0OO0o/oO0Ooooo;", "o00oo0", "(Ljava/lang/Object;)V", "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", "", "toString", "Lo0OOo00O/o0O000Oo;", "o00oo0o0", "Lo0OOo00O/o0O000Oo;", "cont", "", "o00oo0o", "I", "receiveMode", "<init>", "(Lo0OOo00O/o0O000Oo;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o00oOOoO<E> extends o0O0OO0<E> {
        @o0OOOO0o.o00oOoO

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final int f14237o00oo0o;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o0OOo00O.o0O000Oo<Object> f14238o00oo0o0;

        public o00oOOoO(@NotNull o0OOo00O.o0O000Oo<Object> o0o000oo, int i) {
            this.f14238o00oo0o0 = o0o000oo;
            this.f14237o00oo0o = i;
        }

        @Override // o0OOo0O0.o0O0OOO0
        public void o00oo0(E e) {
            this.f14238o00oo0o0.o00oooOO(o0OOo00O.o0O00O0.f14003o00oOooO);
        }

        @Nullable
        public final Object o0O00O0o(E e) {
            if (this.f14237o00oo0o == 1) {
                o0O00.f14268o00oOOoO.getClass();
                return new o0O00(o0O00.o00oOo00(e));
            }
            return e;
        }

        @Override // o0OOo0O0.o0O0OOO0
        @Nullable
        public oO0o0o o0O0o(E e, @Nullable o0OOO0OO.o00oOo0O o00ooo0o2) {
            if (this.f14238o00oo0o0.o00oOoOo(o0O00O0o(e), o00ooo0o2 != null ? o00ooo0o2.f14604o00oOo00 : null, o0O00O0(e)) == null) {
                return null;
            }
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOooO();
            }
            return o0OOo00O.o0O00O0.f14003o00oOooO;
        }

        @Override // o0OOo0O0.o0O0OO0
        public void o0OoO00O(@NotNull o0O00OO<?> o0o00oo) {
            o0OOo00O.o0O000Oo<Object> o0o000oo;
            Object m7constructorimpl;
            if (this.f14237o00oo0o == 1) {
                o0o000oo = this.f14238o00oo0o0;
                o0O00 o0o00 = new o0O00(o0O00.f14268o00oOOoO.o00oOOo0(o0o00oo.f14289o00oo0o0));
                oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
                m7constructorimpl = oo0oO0.m7constructorimpl(o0o00);
            } else {
                o0o000oo = this.f14238o00oo0o0;
                oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                m7constructorimpl = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(o0o00oo.o0O00Oo()));
            }
            o0o000oo.resumeWith(m7constructorimpl);
        }

        @Override // o0OOo0o0.o0OOO0OO
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ReceiveElement@");
            o00oOOo02.append(o0OOo00O.oo0ooO.o00oOOoO(this));
            o00oOOo02.append("[receiveMode=");
            o00oOOo02.append(this.f14237o00oo0o);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oOo00;", "E", "Lo0OOo0O0/o00oo00O$o00oOOoO;", "value", "Lkotlin/Function1;", "", "Lo0OO0o/oO0Ooooo;", "o0O00O0", "(Ljava/lang/Object;)Lo0OOOO/o00oo;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o00oo0oO", "Lo0OOOO/o00oo;", "onUndeliveredElement", "Lo0OOo00O/o0O000Oo;", "", "cont", "", "receiveMode", "<init>", "(Lo0OOo00O/o0O000Oo;ILo0OOOO/o00oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<E> extends o00oOOoO<E> {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public final o0OOOO.o00oo<E, o0OO0o.oO0Ooooo> f14239o00oo0oO;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(@NotNull o0OOo00O.o0O000Oo<Object> o0o000oo, int i, @NotNull o0OOOO.o00oo<? super E, o0OO0o.oO0Ooooo> o00ooVar) {
            super(o0o000oo, i);
            this.f14239o00oo0oO = o00ooVar;
        }

        @Override // o0OOo0O0.o0O0OO0
        @Nullable
        public o0OOOO.o00oo<Throwable, o0OO0o.oO0Ooooo> o0O00O0(E e) {
            return new oO00000.o00oOOo0(this.f14239o00oo0oO, e, this.f14238o00oo0o0.getContext());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lo0OOo0O0/o00oo00O$o00oOo0O;", "E", "Lo0OOo0O0/o0O0OO0;", "value", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/oO0o0o;", "o0O0o", "(Ljava/lang/Object;Lo0OOo0o0/o0OOO0OO$o00oOo0O;)Lo0OOo0o0/oO0o0o;", "Lo0OO0o/oO0Ooooo;", "o00oo0", "(Ljava/lang/Object;)V", "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", "Lkotlin/Function1;", "", "o0O00O0", "(Ljava/lang/Object;)Lo0OOOO/o00oo;", "", "toString", "Lo0OOo0O0/o00oo00O$o00oOOo0;", "o00oo0o0", "Lo0OOo0O0/o00oo00O$o00oOOo0;", "iterator", "Lo0OOo00O/o0O000Oo;", "", "o00oo0o", "Lo0OOo00O/o0O000Oo;", "cont", "<init>", "(Lo0OOo0O0/o00oo00O$o00oOOo0;Lo0OOo00O/o0O000Oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o00oOo0O<E> extends o0O0OO0<E> {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final o0OOo00O.o0O000Oo<Boolean> f14240o00oo0o;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o00oOOo0<E> f14241o00oo0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(@NotNull o00oOOo0<E> o00oooo02, @NotNull o0OOo00O.o0O000Oo<? super Boolean> o0o000oo) {
            this.f14241o00oo0o0 = o00oooo02;
            this.f14240o00oo0o = o0o000oo;
        }

        @Override // o0OOo0O0.o0O0OOO0
        public void o00oo0(E e) {
            this.f14241o00oo0o0.f14236o00oOOoO = e;
            this.f14240o00oo0o.o00oooOO(o0OOo00O.o0O00O0.f14003o00oOooO);
        }

        @Override // o0OOo0O0.o0O0OO0
        @Nullable
        public o0OOOO.o00oo<Throwable, o0OO0o.oO0Ooooo> o0O00O0(E e) {
            o0OOOO.o00oo<E, o0OO0o.oO0Ooooo> o00ooVar = this.f14241o00oo0o0.f14235o00oOOo0.f14253o00oo0O0;
            if (o00ooVar != null) {
                return new oO00000.o00oOOo0(o00ooVar, e, this.f14240o00oo0o.getContext());
            }
            return null;
        }

        @Override // o0OOo0O0.o0O0OOO0
        @Nullable
        public oO0o0o o0O0o(E e, @Nullable o0OOO0OO.o00oOo0O o00ooo0o2) {
            if (this.f14240o00oo0o.o00oOoOo(Boolean.TRUE, o00ooo0o2 != null ? o00ooo0o2.f14604o00oOo00 : null, o0O00O0(e)) == null) {
                return null;
            }
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOooO();
            }
            return o0OOo00O.o0O00O0.f14003o00oOooO;
        }

        @Override // o0OOo0O0.o0O0OO0
        public void o0OoO00O(@NotNull o0O00OO<?> o0o00oo) {
            Object o00oOOoO2 = o0o00oo.f14289o00oo0o0 == null ? o0O000Oo.o00oOOo0.o00oOOoO(this.f14240o00oo0o, Boolean.FALSE, null, 2, null) : this.f14240o00oo0o.o00oo0OO(o0o00oo.o0O00Oo());
            if (o00oOOoO2 != null) {
                this.f14241o00oo0o0.f14236o00oOOoO = o0o00oo;
                this.f14240o00oo0o.o00oooOO(o00oOOoO2);
            }
        }

        @Override // o0OOo0o0.o0OOO0OO
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ReceiveHasNext@");
            o00oOOo02.append(o0OOo00O.oo0ooO.o00oOOoO(this));
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010(\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oOoO;", "R", "E", "Lo0OOo0O0/o0O0OO0;", "Lo0OOo00O/o0OOO0OO;", "value", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "otherOp", "Lo0OOo0o0/oO0o0o;", "o0O0o", "(Ljava/lang/Object;Lo0OOo0o0/o0OOO0OO$o00oOo0O;)Lo0OOo0o0/oO0o0o;", "Lo0OO0o/oO0Ooooo;", "o00oo0", "(Ljava/lang/Object;)V", "Lo0OOo0O0/o0O00OO;", "closed", "o0OoO00O", o0OO000o.o00oOOoO.f12961o00oOo00, "Lkotlin/Function1;", "", "o0O00O0", "(Ljava/lang/Object;)Lo0OOOO/o00oo;", "", "toString", "Lo0OOo0O0/o00oo00O;", "o00oo0o0", "Lo0OOo0O0/o00oo00O;", "channel", "Lo0OOo0oo/oOO0000;", "o00oo0o", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "", "Lo0OO/o00oOo0O;", "o00oo0oO", "Lo0OOOO/o0O00000;", "block", "", "I", "receiveMode", "<init>", "(Lo0OOo0O0/o00oo00O;Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO<R, E> extends o0O0OO0<E> implements o0OOo00O.o0OOO0OO {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final oOO0000<R> f14242o00oo0o;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o00oo00O<E> f14243o00oo0o0;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public final o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super R>, Object> f14244o00oo0oO;
        @o0OOOO0o.o00oOoO

        /* renamed from: o0O0o  reason: collision with root package name */
        public final int f14245o0O0o;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOoO(@NotNull o00oo00O<E> o00oo00o, @NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000, int i) {
            this.f14243o00oo0o0 = o00oo00o;
            this.f14242o00oo0o = ooo0000;
            this.f14244o00oo0oO = o0o00000;
            this.f14245o0O0o = i;
        }

        @Override // o0OOo00O.o0OOO0OO
        public void o00oOOoO() {
            if (o0OoOoOo()) {
                this.f14243o00oo0o0.o0O00O0o();
            }
        }

        @Override // o0OOo0O0.o0O0OOO0
        public void o00oo0(E e) {
            Object obj;
            o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super R>, Object> o0o00000 = this.f14244o00oo0oO;
            if (this.f14245o0O0o == 1) {
                o0O00.f14268o00oOOoO.getClass();
                obj = new o0O00(o0O00.o00oOo00(e));
            } else {
                obj = e;
            }
            o0OOo0o.o0O000.o00oOo0O(o0o00000, obj, this.f14242o00oo0o.o00oo(), o0O00O0(e));
        }

        @Override // o0OOo0O0.o0O0OO0
        @Nullable
        public o0OOOO.o00oo<Throwable, o0OO0o.oO0Ooooo> o0O00O0(E e) {
            o0OOOO.o00oo<E, o0OO0o.oO0Ooooo> o00ooVar = this.f14243o00oo0o0.f14253o00oo0O0;
            if (o00ooVar != null) {
                return new oO00000.o00oOOo0(o00ooVar, e, this.f14242o00oo0o.o00oo().getContext());
            }
            return null;
        }

        @Override // o0OOo0O0.o0O0OOO0
        @Nullable
        public oO0o0o o0O0o(E e, @Nullable o0OOO0OO.o00oOo0O o00ooo0o2) {
            return (oO0o0o) this.f14242o00oo0o.o00ooO00(o00ooo0o2);
        }

        @Override // o0OOo0O0.o0O0OO0
        public void o0OoO00O(@NotNull o0O00OO<?> o0o00oo) {
            if (this.f14242o00oo0o.o00oo0oO()) {
                int i = this.f14245o0O0o;
                if (i == 0) {
                    this.f14242o00oo0o.o00ooO0(o0o00oo.o0O00Oo());
                } else if (i != 1) {
                } else {
                    o0OOo0o.o0O000.o00oOo0o(this.f14244o00oo0oO, new o0O00(o0O00.f14268o00oOOoO.o00oOOo0(o0o00oo.f14289o00oo0o0)), this.f14242o00oo0o.o00oo(), null, 4, null);
                }
            }
        }

        @Override // o0OOo0o0.o0OOO0OO
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ReceiveSelect@");
            o00oOOo02.append(o0OOo00O.oo0ooO.o00oOOoO(this));
            o00oOOo02.append('[');
            o00oOOo02.append(this.f14242o00oo0o);
            o00oOOo02.append(",receiveMode=");
            o00oOOo02.append(this.f14245o0O0o);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oo0;", "E", "Lo0OOo0o0/o0OOO0OO$o00oOoO;", "Lo0OOo0O0/o0O0OOOo;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lo0OOo0o0/o0OOO0OO;", "affected", "", "o00oOo0O", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "o00oOoOo", "Lo0OO0o/oO0Ooooo;", "o00oOoo0", "Lo0OOo0o0/o0OOO0;", "queue", "<init>", "(Lo0OOo0o0/o0OOO0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0<E> extends o0OOO0OO.o00oOoO<o0O0OOOo> {
        public o00oo0(@NotNull o0OOO0 o0ooo0) {
            super(o0ooo0);
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOoO, o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOo0O(@NotNull o0OOO0OO o0ooo0oo) {
            if (o0ooo0oo instanceof o0O00OO) {
                return o0ooo0oo;
            }
            if (o0ooo0oo instanceof o0O0OOOo) {
                return null;
            }
            return o0OOo0O0.o00oo0.f14231o00oOo0o;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOoOo(@NotNull o0OOO0OO.o00oOo0O o00ooo0o2) {
            oO0o0o o0O00O0o2 = ((o0O0OOOo) o00ooo0o2.f14602o00oOOo0).o0O00O0o(o00ooo0o2);
            if (o0O00O0o2 == null) {
                return o0OOOO00.f14633o00oOOo0;
            }
            Object obj = oooOO0.f14679o00oOOoO;
            if (o0O00O0o2 == obj) {
                return obj;
            }
            return null;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public void o00oOoo0(@NotNull o0OOO0OO o0ooo0oo) {
            ((o0O0OOOo) o0ooo0oo).o0O00O();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo0O0/o00oo00O$o00oo00O;", "Lo0OOo00O/o0O0o;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "", "toString", "Lo0OOo0O0/o0O0OO0;", "o00oo0O0", "Lo0OOo0O0/o0O0OO0;", "receive", "<init>", "(Lo0OOo0O0/o00oo00O;Lo0OOo0O0/o0O0OO0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: o0OOo0O0.o00oo00O$o00oo00O  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0178o00oo00O extends o0OOo00O.o0O0o {
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O0OO0<?> f14247o00oo0O0;

        public C0178o00oo00O(@NotNull o0O0OO0<?> o0o0oo0) {
            this.f14247o00oo0O0 = o0o0oo0;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke(Throwable th) {
            o00oOOo0(th);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Override // o0OOo00O.o0OoOoOo
        public void o00oOOo0(@Nullable Throwable th) {
            if (this.f14247o00oo0O0.o0OoOoOo()) {
                o00oo00O.this.o0O00O0o();
            }
        }

        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("RemoveReceiveOnCancel[");
            o00oOOo02.append(this.f14247o00oo0O0);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"o0OOo0O0/o00oo00O$o00oo0O", "Lo0OOo0oo/oO;", "Lo0OOo0O0/o0O00;", "R", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "block", "Lo0OO0o/oO0Ooooo;", "o00oo0o", "(Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O implements oO<o0O00<? extends E>> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo00O<E> f14248o00oo0O0;

        public o00oo0O(o00oo00O<E> o00oo00o) {
            this.f14248o00oo0O0 = o00oo00o;
        }

        @Override // o0OOo0oo.oO
        public <R> void o00oo0o(@NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<? super o0O00<? extends E>, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            this.f14248o00oo0O0.o0oO0Ooo(ooo0000, 1, o0o00000);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"o0OOo0O0/o00oo00O$o00oo0O0", "Lo0OOo0oo/oO;", "R", "Lo0OOo0oo/oOO0000;", "select", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "block", "Lo0OO0o/oO0Ooooo;", "o00oo0o", "(Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0 implements oO<E> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo00O<E> f14249o00oo0O0;

        public o00oo0O0(o00oo00O<E> o00oo00o) {
            this.f14249o00oo0O0 = o00oo00o;
        }

        @Override // o0OOo0oo.oO
        public <R> void o00oo0o(@NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            this.f14249o00oo0O0.o0oO0Ooo(ooo0000, 0, o0o00000);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0o0/o0OOO0OO$o00oo00O", "Lo0OOo0o0/o0OOO0OO$o00oOo00;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "o00oOoo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO extends o0OOO0OO.o00oOo00 {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f14250o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0OO(o0OOO0OO o0ooo0oo, o00oo00O o00oo00o) {
            super(o0ooo0oo);
            this.f14250o00oOooO = o00oo00o;
        }

        @Override // o0OOo0o0.o0O0oo00
        @Nullable
        /* renamed from: o00oOoo0 */
        public Object o00oOoOO(@NotNull o0OOO0OO o0ooo0oo) {
            if (this.f14250o00oOooO.o0O000oo()) {
                return null;
            }
            return o0OOO0O.o00oOOo0();
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o0O0o extends o0OOO0.o00oOo0O {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ o00oo00O<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0o(o00oo00O<E> o00oo00o, o0OO.o00oOo0O<? super o0O0o> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = o00oo00o;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object o00ooo0o2 = this.this$0.o00ooo0o(this);
            return o00ooo0o2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00ooo0o2 : o0O00.o00oOOoO(o00ooo0o2);
        }
    }

    public o00oo00O(@Nullable o0OOOO.o00oo<? super E, o0OO0o.oO0Ooooo> o00ooVar) {
        super(o00ooVar);
    }

    @Override // o0OOo0O0.o0O0OO
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        o00oOOoO(null);
    }

    @Override // o0OOo0O0.o0O0OO
    public boolean isEmpty() {
        return o0O00();
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public final o0O000Oo<E> iterator() {
        return new o00oOOo0(this);
    }

    @Override // o0OOo0O0.o0O0OO
    public final void o00oOOoO(@Nullable CancellationException cancellationException) {
        if (o00oOo00()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(o0OOo00O.oo0ooO.o00oOOo0(this) + " was cancelled");
        }
        o00oOOo0(cancellationException);
    }

    @Override // o0OOo0O0.o0O0OO
    public boolean o00oOo00() {
        return o00oo0O0() != null && o0O000oo();
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public final oO<E> o00oo() {
        return new o00oo0O0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo0O0.o0O0OO
    @Nullable
    public final Object o00oo00O(@NotNull o0OO.o00oOo0O<? super E> o00ooo0o2) {
        Object o0O00OO2 = o0O00OO();
        return (o0O00OO2 == o0OOo0O0.o00oo0.f14231o00oOo0o || (o0O00OO2 instanceof o0O00OO)) ? o0O00Oo(0, o00ooo0o2) : o0O00OO2;
    }

    @Override // o0OOo0O0.o0O0OO
    @o0OOO0OO.o00oo0OO
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @o0OO000(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object o00oo0oO(@NotNull o0OO.o00oOo0O<? super E> o00ooo0o2) {
        return o0O0OO.o00oOOo0.o00oOoOO(this, o00ooo0o2);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public final oO<o0O00<E>> o00ooO() {
        return new o00oo0O(this);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public oO<E> o00ooOO0() {
        return new o0O0OO.o00oOOo0.C0181o00oOOo0(this);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public final Object o00ooOo0() {
        Object o0O00OO2 = o0O00OO();
        if (o0O00OO2 == o0OOo0O0.o00oo0.f14231o00oOo0o) {
            o0O00.f14268o00oOOoO.getClass();
            return o0O00.f14269o00oOo00;
        } else if (o0O00OO2 instanceof o0O00OO) {
            return o0O00.f14268o00oOOoO.o00oOOo0(((o0O00OO) o0O00OO2).f14289o00oo0o0);
        } else {
            o0O00.f14268o00oOOoO.getClass();
            return o0O00.o00oOo00(o0O00OO2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // o0OOo0O0.o0O0OO
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o00ooo0o(@org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OOo0O0.o0O00<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o0OOo0O0.o00oo00O.o0O0o
            if (r0 == 0) goto L13
            r0 = r5
            o0OOo0O0.o00oo00O$o0O0o r0 = (o0OOo0O0.o00oo00O.o0O0o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o00oo00O$o0O0o r0 = new o0OOo0O0.o00oo00O$o0O0o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o0OO0o.oo0ooO.o00oo0(r5)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            o0OO0o.oo0ooO.o00oo0(r5)
            java.lang.Object r5 = r4.o0O00OO()
            o0OOo0o0.oO0o0o r2 = o0OOo0O0.o00oo0.f14231o00oOo0o
            if (r5 == r2) goto L53
            boolean r0 = r5 instanceof o0OOo0O0.o0O00OO
            if (r0 == 0) goto L49
            o0OOo0O0.o0O00$o00oOOoO r0 = o0OOo0O0.o0O00.f14268o00oOOoO
            o0OOo0O0.o0O00OO r5 = (o0OOo0O0.o0O00OO) r5
            java.lang.Throwable r5 = r5.f14289o00oo0o0
            java.lang.Object r5 = r0.o00oOOo0(r5)
            goto L52
        L49:
            o0OOo0O0.o0O00$o00oOOoO r0 = o0OOo0O0.o0O00.f14268o00oOOoO
            r0.getClass()
            java.lang.Object r5 = o0OOo0O0.o0O00.o00oOo00(r5)
        L52:
            return r5
        L53:
            r0.label = r3
            java.lang.Object r5 = r4.o0O00Oo(r3, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            o0OOo0O0.o0O00 r5 = (o0OOo0O0.o0O00) r5
            java.lang.Object r5 = r5.f14270o00oOOo0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o00oo00O.o00ooo0o(o0OO.o00oOo0O):java.lang.Object");
    }

    @Override // o0OOo0O0.o00oo0OO
    @Nullable
    public o0O0OOO0<E> o00ooooo() {
        o0O0OOO0<E> o00ooooo2 = super.o00ooooo();
        if (o00ooooo2 != null && !(o00ooooo2 instanceof o0O00OO)) {
            o0O00O0o();
        }
        return o00ooooo2;
    }

    public final boolean o0O00() {
        return !(o0O0o().o00ooooo() instanceof o0O0OOOo) && o0O000oo();
    }

    @Override // o0OOo0O0.o0O0OO
    /* renamed from: o0O000O */
    public final boolean o00oOOo0(@Nullable Throwable th) {
        boolean o00ooo02 = o00ooo0(th);
        o0O00O0(o00ooo02);
        return o00ooo02;
    }

    public final boolean o0O000Oo(o0O0OO0<? super E> o0o0oo0) {
        boolean o0OoOoOO2 = o0OoOoOO(o0o0oo0);
        if (o0OoOoOO2) {
            o0O00O();
        }
        return o0OoOoOO2;
    }

    public final boolean o0O000o() {
        return o0O0o().o00ooooo() instanceof o0O0OOO0;
    }

    public final <R> boolean o0O000o0(oOO0000<? super R> ooo0000, o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000, int i) {
        o00oOoO o00oooo2 = new o00oOoO(this, ooo0000, o0o00000, i);
        boolean o0O000Oo2 = o0O000Oo(o00oooo2);
        if (o0O000Oo2) {
            ooo0000.o00oOo00(o00oooo2);
        }
        return o0O000Oo2;
    }

    public abstract boolean o0O000oo();

    public void o0O00O() {
    }

    public void o0O00O0(boolean z) {
        o0O00OO<?> o00oo0o2 = o00oo0o();
        if (o00oo0o2 == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object obj = null;
        while (true) {
            o0OOO0OO o02 = o00oo0o2.o0();
            if (o02 instanceof o0OOO0) {
                o0OoO00O(obj, o00oo0o2);
                return;
            } else if (o02.o0OoOoOo()) {
                obj = o0OO0o00.o00oOoO(obj, (o0O0OOOo) o02);
            } else {
                o02.o0O00000();
            }
        }
    }

    public void o0O00O0o() {
    }

    @Nullable
    public Object o0O00OO() {
        while (true) {
            o0O0OOOo o02 = o0();
            if (o02 == null) {
                return o0OOo0O0.o00oo0.f14231o00oOo0o;
            }
            if (o02.o0O00O0o(null) != null) {
                o02.o0O00();
                return o02.o0O00O0();
            }
            o02.o0O00O();
        }
    }

    @Nullable
    public Object o0O00OOO(@NotNull oOO0000<?> ooo0000) {
        o00oo0<E> o0OoOoOo2 = o0OoOoOo();
        Object o00oOo0O2 = ooo0000.o00oOo0O(o0OoOoOo2);
        if (o00oOo0O2 != null) {
            return o00oOo0O2;
        }
        o0OoOoOo2.o00oo0OO().o0O00();
        return o0OoOoOo2.o00oo0OO().o0O00O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o0OOo0O0.o00oo00O$o00oOOoO] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o0OOo0O0.o00oo00O<E>, o0OOo0O0.o00oo00O, o0OOo0O0.o00oo0OO] */
    public final <R> Object o0O00Oo(int i, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0OOo00O.o0O00 o00oOOoO2 = o0OOo00O.o0OoO00O.o00oOOoO(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2));
        o00oOo00 o00ooooo2 = this.f14253o00oo0O0 == null ? new o00oOOoO(o00oOOoO2, i) : new o00oOo00(o00oOOoO2, i, this.f14253o00oo0O0);
        while (true) {
            if (!o0O000Oo(o00ooooo2)) {
                Object o0O00OO2 = o0O00OO();
                if (!(o0O00OO2 instanceof o0O00OO)) {
                    if (o0O00OO2 != o0OOo0O0.o00oo0.f14231o00oOo0o) {
                        o00oOOoO2.o00ooOO(o00ooooo2.o0O00O0o(o0O00OO2), o00ooooo2.o0O00O0(o0O00OO2));
                        break;
                    }
                } else {
                    o00ooooo2.o0OoO00O((o0O00OO) o0O00OO2);
                    break;
                }
            } else {
                o0O00OoO(o00oOOoO2, o00ooooo2);
                break;
            }
        }
        Object o00ooO002 = o00oOOoO2.o00ooO00();
        if (o00ooO002 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002;
    }

    public final void o0O00OoO(o0OOo00O.o0O000Oo<?> o0o000oo, o0O0OO0<?> o0o0oo0) {
        o0o000oo.o00ooOoo(new C0178o00oo00O(o0o0oo0));
    }

    public final <R> void o0O00Ooo(o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000, oOO0000<? super R> ooo0000, int i, Object obj) {
        Object o00oOo002;
        boolean z = obj instanceof o0O00OO;
        if (z) {
            if (i == 0) {
                throw oO0Ooooo.o00oo0O0(((o0O00OO) obj).o0O00Oo());
            }
            if (i != 1 || !ooo0000.o00oo0oO()) {
                return;
            }
            obj = new o0O00(o0O00.f14268o00oOOoO.o00oOOo0(((o0O00OO) obj).f14289o00oo0o0));
        } else if (i == 1) {
            o0O00.o00oOOoO o00ooooo2 = o0O00.f14268o00oOOoO;
            if (z) {
                o00oOo002 = o00ooooo2.o00oOOo0(((o0O00OO) obj).f14289o00oo0o0);
            } else {
                o00ooooo2.getClass();
                o00oOo002 = o0O00.o00oOo00(obj);
            }
            o0OOo0o.o0O000O.o00oOooO(o0o00000, o0O00.o00oOOoO(o00oOo002), ooo0000.o00oo());
            return;
        }
        o0OOo0o.o0O000O.o00oOooO(o0o00000, obj, ooo0000.o00oo());
    }

    public void o0OoO00O(@NotNull Object obj, @NotNull o0O00OO<?> o0o00oo) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((o0O0OOOo) obj).o0OoO00O(o0o00oo);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            ((o0O0OOOo) arrayList.get(size)).o0OoO00O(o0o00oo);
        }
    }

    public boolean o0OoOoOO(@NotNull o0O0OO0<? super E> o0o0oo0) {
        int o0ooOoOO2;
        o0OOO0OO o02;
        if (!o0ooOoOO()) {
            o0OOO0OO o0O0o2 = o0O0o();
            o00oo0OO o00oo0oo = new o00oo0OO(o0o0oo0, this);
            do {
                o0OOO0OO o03 = o0O0o2.o0();
                if (!(!(o03 instanceof o0O0OOOo))) {
                    return false;
                }
                o0ooOoOO2 = o03.o0ooOoOO(o0o0oo0, o0O0o2, o00oo0oo);
                if (o0ooOoOO2 != 1) {
                }
            } while (o0ooOoOO2 != 2);
            return false;
        }
        o0OOO0OO o0O0o3 = o0O0o();
        do {
            o02 = o0O0o3.o0();
            if (!(!(o02 instanceof o0O0OOOo))) {
                return false;
            }
        } while (!o02.o00ooOoO(o0o0oo0, o0O0o3));
        return true;
    }

    @NotNull
    public final o00oo0<E> o0OoOoOo() {
        return new o00oo0<>(o0O0o());
    }

    public final <R> void o0oO0Ooo(oOO0000<? super R> ooo0000, int i, o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        while (!ooo0000.o00oo00O()) {
            if (!o0O00()) {
                Object o0O00OOO2 = o0O00OOO(ooo0000);
                if (o0O00OOO2 == oOO000.o00oOooO()) {
                    return;
                }
                if (o0O00OOO2 != o0OOo0O0.o00oo0.f14231o00oOo0o && o0O00OOO2 != oooOO0.f14679o00oOOoO) {
                    o0O00Ooo(o0o00000, ooo0000, i, o0O00OOO2);
                }
            } else if (o0O000o0(ooo0000, o0o00000, i)) {
                return;
            }
        }
    }

    public abstract boolean o0ooOoOO();

    @Override // o0OOo0O0.o0O0OO
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @o0OO000(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) o0O0OO.o00oOOo0.o00oOoO(this);
    }
}
