package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o00ooO0;
import o0OO0o.o0O0o;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o0O000;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOo0OO.o0OOO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b+\u0010'\"\"\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\"\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/oO000;", "Lo0OOo0OO/o0OO00o;", "o00oOo00", "Lo0OO/o00oo0;", "context", "o00oOoO", "Lo0OOo0OO/oO000Oo0;", "o00oOo0O", "o00oOoO0", "Lo0OOo0OO/o0OO0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lkotlin/Function3;", "", "Lo0OO0o/o0O0o00O;", "name", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "action", "o00oOooO", "(Lo0OOo0OO/oO000;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "", "retries", "Lkotlin/Function2;", "", "predicate", "o00oo00O", "(Lo0OOo0OO/oO000;JLo0OOOO/o0O00000;)Lo0OOo0OO/o0OO00o;", "Lkotlin/Function4;", "attempt", "o00oo0OO", "(Lo0OOo0OO/oO000;Lo0OOOO/o0O000;)Lo0OOo0OO/o0OO00o;", "", "o00oo0O0", "(Lo0OOo0OO/oO000;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "o00oo0O", "", "o00oOo0o", "o00oOoo0", "(Lo0OOo0OO/o0OO0;)Z", "isActive$annotations", "(Lo0OOo0OO/o0OO0;)V", "isActive", "o00oOoOO", "(Lo0OOo0OO/o0OO0;)Lo0OO/o00oo0;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0O00000<Throwable, o00oOo0O<? super Boolean>, Object> {
        public int label;

        public o00oOOo0(o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull Throwable th, @Nullable o00oOo0O<? super Boolean> o00ooo0o2) {
            return ((o00oOOo0) create(th, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                return Boolean.TRUE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @o0O0o(level = o00ooO0.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @o0OO0o.o0OO000(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void o00oOOo0(@NotNull o0OO0<?> o0oo0, @Nullable CancellationException cancellationException) {
        throw o0OOOO.o00oOOo0();
    }

    public static /* synthetic */ void o00oOOoO(o0OO0 o0oo0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        o00oOOo0(o0oo0, cancellationException);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOo00(@NotNull oO000<? extends T> oo000) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOo0O(@NotNull oO000Oo0<? extends T> oo000oo0) {
        throw o0OOOO.o00oOOo0();
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object o00oOo0o(oO000<? extends T> oo000, o00oOo0O<? super Integer> o00ooo0o2) {
        return o0OO.o00oOOo0(oo000, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoO(@NotNull oO000<? extends T> oo000, @NotNull o00oo0 o00oo0Var) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoO0(@NotNull oO000Oo0<? extends T> oo000oo0) {
        throw o0OOOO.o00oOOo0();
    }

    @NotNull
    public static final o00oo0 o00oOoOO(@NotNull o0OO0<?> o0oo0) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @o0OO0o.o0OO000(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void o00oOoOo(o0OO0 o0oo0) {
    }

    public static final boolean o00oOoo0(@NotNull o0OO0<?> o0oo0) {
        throw o0OOOO.o00oOOo0();
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    public static final <T> o0OO00o<T> o00oOooO(oO000<? extends T> oo000, o0O0000O<? super o0OO0<? super T>, ? super Throwable, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return new o0OOO0OO.o00oOOo0(oo000, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @o0OO0o.o0OO000(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void o00oOooo(o0OO0 o0oo0) {
    }

    public static o0OO00o o00oo0(oO000 oo000, long j, o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            o0o00000 = new o00oOOo0(null);
        }
        return o0OOO0OO.o00oOo0O(oo000, j, o0o00000);
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    public static final <T> o0OO00o<T> o00oo00O(oO000<? extends T> oo000, long j, o0O00000<? super Throwable, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return o0OOO0OO.o00oOo0O(oo000, j, o0o00000);
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object o00oo0O(oO000<? extends T> oo000, o00oOo0O<? super Set<? extends T>> o00ooo0o2) {
        return o0OO0oO0.o00oOo0O(oo000, null, o00ooo0o2, 1, null);
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object o00oo0O0(oO000<? extends T> oo000, o00oOo0O<? super List<? extends T>> o00ooo0o2) {
        return o0OO0oO0.o00oOo00(oo000, null, o00ooo0o2, 1, null);
    }

    @o0OOO0OO.o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @o0OO0o.o0OO000(expression = "this", imports = {}))
    public static final <T> o0OO00o<T> o00oo0OO(oO000<? extends T> oo000, o0O000<? super o0OO0<? super T>, ? super Throwable, ? super Long, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o000) {
        return new o0OOO0OO.o00oo00O(oo000, o0o000);
    }
}
