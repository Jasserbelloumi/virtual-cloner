package o0OOo0O0;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOo00O.o0O0oo00;
import o0OOo0O0.o0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lo0OOo0O0/o0OooO0;", "element", "Lo0OOo0O0/o0O00;", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0O0/o0OooO0;Ljava/lang/Object;)Ljava/lang/Object;", "o00oOOo0", "(Lo0OOo0O0/o0OooO0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0OoO00O {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ E $element;
        public final /* synthetic */ o0OooO0<E> $this_sendBlocking;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OooO0<? super E> o0oooo0, E e, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_sendBlocking = o0oooo0;
            this.$element = e;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$this_sendBlocking, this.$element, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                o0OooO0<E> o0oooo0 = this.$this_sendBlocking;
                E e = this.$element;
                this.label = 1;
                if (o0oooo0.o00ooOo(e, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lo0OOo00O/o0O0oo00;", "Lo0OOo0O0/o0O00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0oo00, o00oOo0O<? super o0O00<? extends oO0Ooooo>>, Object> {
        public final /* synthetic */ E $element;
        public final /* synthetic */ o0OooO0<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0OooO0<? super E> o0oooo0, E e, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_trySendBlocking = o0oooo0;
            this.$element = e;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$this_trySendBlocking, this.$element, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, o00oOo0O<? super o0O00<? extends oO0Ooooo>> o00ooo0o2) {
            return invoke2(o0o0oo00, (o00oOo0O<? super o0O00<oO0Ooooo>>) o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super o0O00<oO0Ooooo>> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m7constructorimpl;
            Object o00oOOo02;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    oo0ooO.o00oo0(obj);
                    o0O0oo00 o0o0oo00 = (o0O0oo00) this.L$0;
                    o0OooO0<E> o0oooo0 = this.$this_trySendBlocking;
                    E e = this.$element;
                    oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                    this.label = 1;
                    if (o0oooo0.o00ooOo(e, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    oo0ooO.o00oo0(obj);
                }
                m7constructorimpl = oo0oO0.m7constructorimpl(oO0Ooooo.f13240o00oOOo0);
            } catch (Throwable th) {
                oo0oO0.o00oOOo0 o00oooo04 = oo0oO0.Companion;
                m7constructorimpl = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
            }
            if (oo0oO0.m14isSuccessimpl(m7constructorimpl)) {
                o0O00.o00oOOoO o00ooooo2 = o0O00.f14268o00oOOoO;
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                o00ooooo2.getClass();
                o00oOOo02 = o0O00.o00oOo00(oo0ooooo);
            } else {
                o00oOOo02 = o0O00.f14268o00oOOoO.o00oOOo0(oo0oO0.m10exceptionOrNullimpl(m7constructorimpl));
            }
            return o0O00.o00oOOoO(o00oOOo02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @o0OO000(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void o00oOOo0(@NotNull o0OooO0<? super E> o0oooo0, E e) {
        if (o0O00.o00oo00O(o0oooo0.o00oo0o0(e))) {
            return;
        }
        o0OOo00O.o0.o00oOOoO(null, new o00oOOo0(o0oooo0, e, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object o00oOOoO(@NotNull o0OooO0<? super E> o0oooo0, E e) {
        Object o00oo0o02 = o0oooo0.o00oo0o0(e);
        if (o00oo0o02 instanceof o0O00.o00oOo00) {
            return ((o0O00) o0OOo00O.o0.o00oOOoO(null, new o00oOOoO(o0oooo0, e, null), 1, null)).f14270o00oOOo0;
        }
        oO0Ooooo oo0ooooo = (oO0Ooooo) o00oo0o02;
        o0O00.o00oOOoO o00ooooo2 = o0O00.f14268o00oOOoO;
        oO0Ooooo oo0ooooo2 = oO0Ooooo.f13240o00oOOo0;
        o00ooooo2.getClass();
        return o0O00.o00oOo00(oo0ooooo2);
    }
}
