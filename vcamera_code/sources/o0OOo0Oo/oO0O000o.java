package o0OOo0Oo;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o0O;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O00000;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0O0OO;
import o0OOo00O.ooOOOOoo;
import o0OOo0OO.o0OO0;
import o0OOo0OO.o0OO00o;
import o0OOo0o0.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lo0OOo0Oo/oO0;", "Lo0OO/o00oo0;", "currentContext", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0OOo00O/ooOOOOoo;", "collectJob", o0OO000o.o00oOOoO.f12961o00oOo00, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lo0OOo0OO/o0OO0;", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "block", "Lo0OOo0OO/o0OO00o;", "o00oOo00", "(Lo0OOOO/o0O00000;)Lo0OOo0OO/o0OO00o;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O000o {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lo0OO/o00oo0$o00oOOoO;", "element", "invoke", "(ILo0OO/o00oo0$o00oOOoO;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0O00000<Integer, o00oo0.o00oOOoO, Integer> {
        public final /* synthetic */ oO0<?> $this_checkContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(oO0<?> oo0) {
            super(2);
            this.$this_checkContext = oo0;
        }

        @NotNull
        public final Integer invoke(int i, @NotNull o00oo0.o00oOOoO o00ooooo2) {
            o00oo0.o00oOo00<?> key = o00ooooo2.getKey();
            o00oo0.o00oOOoO o00ooooo3 = this.$this_checkContext.collectContext.get(key);
            if (key != ooOOOOoo.f14136o00oOoO) {
                return Integer.valueOf(o00ooooo2 != o00ooooo3 ? Integer.MIN_VALUE : i + 1);
            }
            ooOOOOoo oooooooo = (ooOOOOoo) o00ooooo3;
            ooOOOOoo o00oOOoO2 = oO0O000o.o00oOOoO((ooOOOOoo) o00ooooo2, oooooooo);
            if (o00oOOoO2 == oooooooo) {
                if (oooooooo != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + o00oOOoO2 + ", expected child of " + oooooooo + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, o00oo0.o00oOOoO o00ooooo2) {
            return invoke(num.intValue(), o00ooooo2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00000<o0OO0<? super T>, o00oOo0O<? super oO0Ooooo>, Object> f14537o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o00oOo0O<? super o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOOoO.this.o00oOOo0(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
            this.f14537o00oo0O0 = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            Object invoke = this.f14537o00oo0O0.invoke(o0oo0, o00ooo0o2);
            return invoke == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? invoke : oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0<? super T> o0oo0, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            new o00oOOo0(o00ooo0o2);
            this.f14537o00oo0O0.invoke(o0oo0, o00ooo0o2);
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o00oo0OO(name = "checkContext")
    public static final void o00oOOo0(@NotNull oO0<?> oo0, @NotNull o00oo0 o00oo0Var) {
        if (((Number) o00oo0Var.fold(0, new o00oOOo0(oo0))).intValue() == oo0.collectContextSize) {
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Flow invariant is violated:\n\t\tFlow was collected in ");
        o00oOOo02.append(oo0.collectContext);
        o00oOOo02.append(",\n\t\tbut emission happened in ");
        o00oOOo02.append(o00oo0Var);
        o00oOOo02.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(o00oOOo02.toString().toString());
    }

    @Nullable
    public static final ooOOOOoo o00oOOoO(@Nullable ooOOOOoo oooooooo, @Nullable ooOOOOoo oooooooo2) {
        while (oooooooo != null) {
            if (oooooooo == oooooooo2 || !(oooooooo instanceof oO000)) {
                return oooooooo;
            }
            oooooooo = ((oO000) oooooooo).o0O0oOo();
        }
        return null;
    }

    @o0O
    @NotNull
    public static final <T> o0OO00o<T> o00oOo00(@o0OO0o.o00oOOoO @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        return new o00oOOoO(o0o00000);
    }
}
