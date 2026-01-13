package o0OOo0OO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o00oOOoO;
import o0OO0o.o00ooO0;
import o0OO0o.o0O0o;
import o0OO0o.o0O0o000;
import o0OOOO.o00oOOo0;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOOO.o0O000O;
import o0OOOO.o0O000Oo;
import o0OOOO.o0OoOoOo;
import o0OOOO0o.o00oo0OO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.o0O0OO0;
import o0OOOooO.o0oO0O0o;
import o0OOo00O.o0O0oo00;
import o0OOo0O0.o00ooO;
import o0OOo0O0.o0O000;
import o0OOo0O0.o0O0OO;
import o0OOo0O0.o0ooO;
import o0OOo0OO.o0OO0o00;
import o0OOo0OO.o0OOO0O;
import o0OOo0OO.o0OOO0OO;
import o0OOo0OO.o0OOOO00;
import o0OOo0OO.o0OOooO0;
import o0OOo0OO.o0oo0000;
import o0OOo0OO.ooo0Oo0;
import o0OOo0Oo.oO0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"o0OOo0OO/o0OOooO0", "o0OOo0OO/o0OO0o00", "o0OOo0OO/o0OO0o", "o0OOo0OO/o0OO0oO0", "o0OOo0OO/o0OO0oO", "o0OOo0OO/o0OO", "o0OOo0OO/o0OOO00", "o0OOo0OO/o0OOO0", "o0OOo0OO/o0OOO0O", "o0OOo0OO/o0OOO0OO", "o0OOo0OO/o0OOOO00", "o0OOo0OO/o0OOOO0o", "o0OOo0OO/o0OOo000", "o0OOo0OO/o0o0000", "o0OOo0OO/oO0Oo", "o0OOo0OO/o0oo0000", "o0OOo0OO/ooo0Oo0"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO0O0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f14323o00oOOo0 = "kotlinx.coroutines.flow.defaultConcurrency";

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @o0OO0o.o0OO000(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        return o0OOo000.o00oOoO(o0oo00o, t);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOOo0(@NotNull Iterable<? extends T> iterable) {
        return new o0OOooO0.o00oOo0O(iterable);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOOoO(@NotNull Iterator<? extends T> it) {
        return new o0OOooO0.o00oOoO(it);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o00oOo00(@NotNull o00oOOo0<? extends T> o00oooo02) {
        return new o0OOooO0.o00oOOoO(o00oooo02);
    }

    @NotNull
    public static final o0OO00o<Integer> o00oOo0O(@NotNull o0O0O0Oo o0o0o0oo) {
        return new o0OOooO0.o00oo0O(o0o0o0oo);
    }

    @NotNull
    public static final o0OO00o<Long> o00oOo0o(@NotNull o0O0OO0 o0o0oo0) {
        return new o0OOooO0.o00oOOo0(o0o0oo0);
    }

    @o0O0o(level = o00ooO0.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> o0OO00o<T> o00oOoO(@NotNull o00ooO<T> o00ooo) {
        return new o0OO0o00.o00oOOo0(o00ooo);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoO0(@NotNull o0OOOoO0.oO000<? extends T> oo000) {
        return new o0OOooO0.o00oo00O(oo000);
    }

    @NotNull
    public static final o0OO00o<Integer> o00oOoOO(@NotNull int[] iArr) {
        return new o0OOooO0.o00oo0OO(iArr);
    }

    @NotNull
    public static final o0OO00o<Long> o00oOoOo(@NotNull long[] jArr) {
        return new o0OOooO0.o00oo0O0(jArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoo0(@NotNull T[] tArr) {
        return new o0OOooO0.o00oo0(tArr);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o00oOooO(@NotNull o00oo<? super o00oOo0O<? super T>, ? extends Object> o00ooVar) {
        return new o0OOooO0.o00oOo00(o00ooVar);
    }

    @NotNull
    public static final <T> oO000<T> o00oOooo(@NotNull oO00000<T> oo00000) {
        return oO0Oo.o00oOOo0(oo00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo(@o00oOOoO @NotNull o0O00000<? super o0ooO<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return o0OOooO0.o00oOooo(o0o00000);
    }

    @NotNull
    public static final <T> oO000Oo0<T> o00oo00O(@NotNull oO00000o<T> oo00000o) {
        return oO0Oo.o00oOOoO(oo00000o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0OO(@NotNull o0OO00o<? extends T> o0oo00o, int i, @NotNull o0O000 o0o000) {
        return o0OO0oO.o00oOOoO(o0oo00o, i, o0o000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0Oo(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OOo000.o00oOOo0(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0o(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OO0oO.o00oOo0O(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0o0(@o00oOOoO @NotNull o0O00000<? super o0ooO<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return o0OOooO0.o00oOoo0(o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0oO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super o0OO0<? super T>, ? super Throwable, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return new o0OOO0OO.o00oOOo0(o0oo00o, o0o0000o);
    }

    @Nullable
    public static final <T> Object o00ooO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OOOO00.o00oOOoO(o0oo00o, o0o00000, o00ooo0o2);
    }

    @Nullable
    public static final Object o00ooO00(@NotNull o0OO00o<?> o0oo00o, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0o.o00oOOo0(o0oo00o, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o00ooO0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super Integer, ? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0o.o00oOooO(o0oo00o, o0o0000o, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o00ooO0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0o.o00oOo0o(o0oo00o, o0o00000, o00ooo0o2);
    }

    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o00ooOO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0o0000o);
    }

    @NotNull
    public static final <T1, T2, T3, R> o0OO00o<R> o00ooOOo(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @o00oOOoO @NotNull o0OOOO.o0O000<? super T1, ? super T2, ? super T3, ? super o00oOo0O<? super R>, ? extends Object> o0o000) {
        return ooo0Oo0.o00oOooO(o0oo00o, o0oo00o2, o0oo00o3, o0o000);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o0OO00o<R> o00ooOo(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0OO00o<? extends T5> o0oo00o5, @NotNull o0OoOoOo<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super o00oOo0O<? super R>, ? extends Object> o0oooooo) {
        return ooo0Oo0.o00oOo0o(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0oo00o5, o0oooooo);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o0OO00o<R> o00ooOo0(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0O000O<? super T1, ? super T2, ? super T3, ? super T4, ? super o00oOo0O<? super R>, ? extends Object> o0o000o) {
        return ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0o000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o00ooOoo(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> o0OO00o<R> o00ooo0(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0O000O<? super T1, ? super T2, ? super T3, ? super T4, ? super o00oOo0O<? super R>, ? extends Object> o0o000o) {
        return ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0o000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> o0OO00o<R> o00ooo00(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OOOO.o0O000<? super T1, ? super T2, ? super T3, ? super o00oOo0O<? super R>, ? extends Object> o0o000) {
        return ooo0Oo0.o00oOooO(o0oo00o, o0oo00o2, o0oo00o3, o0o000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o0OO00o<R> o00ooo0O(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0OO00o<? extends T5> o0oo00o5, @NotNull o0OoOoOo<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super o00oOo0O<? super R>, ? extends Object> o0oooooo) {
        return ooo0Oo0.o00oOo0o(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0oo00o5, o0oooooo);
    }

    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o00oooO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @o00oOOoO @NotNull o0OOOO.o0O000<? super o0OO0<? super R>, ? super T1, ? super T2, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000) {
        return ooo0Oo0.o00oOoOO(o0oo00o, o0oo00o2, o0o000);
    }

    @NotNull
    public static final <T1, T2, T3, R> o0OO00o<R> o00oooOO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @o00oOOoO @NotNull o0O000O<? super o0OO0<? super R>, ? super T1, ? super T2, ? super T3, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000o) {
        return ooo0Oo0.o00oOoOo(o0oo00o, o0oo00o2, o0oo00o3, o0o000o);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o0OO00o<R> o00oooOo(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @o00oOOoO @NotNull o0OoOoOo<? super o0OO0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0oooooo) {
        return ooo0Oo0.o00oOoo0(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0oooooo);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o0OO00o<R> o00oooo0(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0OO00o<? extends T5> o0oo00o5, @o00oOOoO @NotNull o0O000Oo<? super o0OO0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000oo) {
        return ooo0Oo0.o00oOooo(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0oo00o5, o0o000oo);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @o0OO0o.o0OO000(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00ooooO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super o0OO00o<? extends T>, ? extends o0OO00o<? extends R>> o00ooVar) {
        return o0OOo000.o00oOo0o(o0oo00o, o00ooVar);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00ooooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super T, ? extends o0OO00o<? extends R>> o00ooVar) {
        return o0OOo000.o00oOoO0(o0oo00o, o00ooVar);
    }

    @Nullable
    public static final <T> Object o0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull o00oOo0O<? super oO000Oo0<? extends T>> o00ooo0o2) {
        return oO0Oo.o00oOoOO(o0oo00o, o0o0oo00, o00ooo0o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O00(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super T, Boolean> o0o00000) {
        return o0OOO0.o00oOOoO(o0oo00o, o0o00000);
    }

    @Nullable
    public static final <T> Object o0O000(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super Integer> o00ooo0o2) {
        return o0OO.o00oOOo0(o0oo00o, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @o0OO0o.o0OO000(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O00000(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        return o0OOo000.o00oOoOO(o0oo00o, o0oo00o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0000O(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OO0oO.o00oOoO0(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0000o(@NotNull o0O0OO<? extends T> o0o0oo) {
        return o0OO0o00.o00oOo00(o0o0oo);
    }

    @Nullable
    public static final <T> Object o0O000O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super Integer> o00ooo0o2) {
        return o0OO.o00oOOoO(o0oo00o, o0o00000, o00ooo0o2);
    }

    @o0O0o000
    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0O000Oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super T, Long> o00ooVar) {
        return o0OOO00.o00oOo0O(o0oo00o, o00ooVar);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @o0OO0o.o0OO000(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O000o(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOo000.o00oOoOo(o0oo00o, j);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    @o0O0o000
    @o00oo0OO(name = "debounceDuration")
    public static final <T> o0OO00o<T> o0O000o0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super T, o0oO0O0o> o00ooVar) {
        return o0OOO00.o00oOooO(o0oo00o, o00ooVar);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O000oo(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OOO0.o00oOOo0(o0oo00o);
    }

    @Nullable
    public static final <T> Object o0O00O(@NotNull o0OO0<? super T> o0oo0, @NotNull o0O0OO<? extends T> o0o0oo, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0o00.o00oOooO(o0oo0, o0o0oo, o00ooo0o2);
    }

    @NotNull
    public static final <T, K> o0OO00o<T> o0O00O0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super T, ? extends K> o00ooVar) {
        return o0OOO0.o00oOo00(o0oo00o, o00ooVar);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O00O0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o0OOOO00.o00oOoO(o0oo00o, o0o00000);
    }

    @Nullable
    public static final <T> Object o0O00OO(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0o.o00oOoO0(o0oo0, o0oo00o, o00ooo0o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O00OOO() {
        return o0OoOoO.f14398o00oo0O0;
    }

    public static final void o0O00Oo(@NotNull o0OO0<?> o0oo0) {
        o0OOO0O.o00oOOoO(o0oo0);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O00Ooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o0oo0000.o00oOo00(o0oo00o, o0o00000);
    }

    @Nullable
    public static final <T> Object o0O00o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOo00(o0oo00o, o00ooo0o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O00o00(@NotNull o0OO00o<? extends T> o0oo00o) {
        return new o0oo0000.o00oOo0O(o0oo00o);
    }

    @Nullable
    public static final <T> Object o0O00o0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOOo0(o0oo00o, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o0O00o0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOOoO(o0oo00o, o0o00000, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o0O00oO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOooO(o0oo00o, o0o00000, o00ooo0o2);
    }

    @NotNull
    public static final o0O0OO<o0OO0o.oO0Ooooo> o0O0O0O(@NotNull o0O0oo00 o0o0oo00, long j, long j2) {
        return o0OOO00.o00oOo0o(o0o0oo00, j, j2);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T, R> o0OO00o<R> o0O0O0Oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOOO0o.o00oOOo0(o0oo00o, o0o00000);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T, R> o0OO00o<R> o0O0O0o(@NotNull o0OO00o<? extends T> o0oo00o, int i, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOOO0o.o00oOo00(o0oo00o, i, o0o00000);
    }

    @o0OOo00O.oO0000Oo
    @NotNull
    public static final <T, R> o0OO00o<R> o0O0O0o0(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOOO0o.o00oOOoO(o0oo00o, o0o00000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0O0oo(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o) {
        return o0OOo000.o00oo00O(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0OO(@o00oOOoO @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new oO0000o0(o0o00000);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0O0OO0(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o, int i) {
        return o0OOOO0o.o00oOo0o(o0oo00o, i);
    }

    @o00oo0OO(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o0O0OOO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @o00oOOoO @NotNull o0OOOO.o0O000<? super o0OO0<? super R>, ? super T1, ? super T2, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000) {
        return ooo0Oo0.o00oo0O(o0oo00o, o0oo00o2, o0o000);
    }

    @o00oo0OO(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o0O0OOO0(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0OOOo(T t) {
        return new o0OOooO0.o00oo(t);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0OOo(@NotNull T... tArr) {
        return new o0OOooO0.o0O0o(tArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0OOoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        return o0OO0oO.o00oOoO(o0oo00o, o00oo0Var);
    }

    @Nullable
    public static final <T, R> Object o0O0OOoo(@NotNull o0OO00o<? extends T> o0oo00o, R r, @NotNull o0O0000O<? super R, ? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o, @NotNull o00oOo0O<? super R> o00ooo0o2) {
        return o0o0000.o00oOo0O(o0oo00o, r, o0o0000o, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o0O0Oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOoO(o0oo00o, o00ooo0o2);
    }

    public static final int o0O0Oo0() {
        return o0OOOO0o.o00oOoO();
    }

    @Nullable
    public static final <T> Object o0O0Oo0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOoO0(o0oo00o, o00ooo0o2);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0O0OoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return new o0oo0000.o00oo00O(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0O0OoO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return new o0oo0000.o00oOoO(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0OoOo(@NotNull Iterable<? extends o0OO00o<? extends T>> iterable) {
        return o0OOOO0o.o00oOooo(iterable);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0Ooo(@NotNull o0OO00o<? extends T>... o0oo00oArr) {
        return o0OOOO0o.o00oo00O(o0oo00oArr);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0Ooo0(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o) {
        return o0OOo000.o00oo0OO(o0oo00o);
    }

    @NotNull
    public static final Void o0O0OooO() {
        return o0OOo000.o00oo0O0();
    }

    @NotNull
    public static final <T> o0OOo00O.ooOOOOoo o0O0Oooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00) {
        return o0OO0o.o00oOoO(o0oo00o, o0o0oo00);
    }

    @Nullable
    public static final <T> Object o0O0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO0<? super T> o0oo0, @NotNull o00oOo0O<? super Throwable> o00ooo0o2) {
        return o0OOO0OO.o00oOOoO(o0oo00o, o0oo0, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0o0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        return o0OOo000.o00oo0Oo(o0oo00o, o0oo00o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0o00(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super o0OO0<? super T>, ? super Throwable, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return new o0OOO0O.o00oOOoO(o0oo00o, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> o0OO00o<T> o0O0o000(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        return o0OOo000.o00oo0O(o0oo00o, o00oo0Var);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0o00O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o0oo0000.o00oo0(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0o00o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o0OOO0O.o00oOo00(o0oo00o, o0o00000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0o0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        return o0OOo000.o00oo0o0(o0oo00o, o0oo00o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0o0OO(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        return o0OOo000.o00oo0o(o0oo00o, t);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0o0Oo(@NotNull o0OO00o<? extends T> o0oo00o, T t, @NotNull o00oo<? super Throwable, Boolean> o00ooVar) {
        return o0OOo000.o00oo0oO(o0oo00o, t, o00ooVar);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0o0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o0OOO0O.o00oOoO(o0o00000, o0oo00o);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0O0OO<T> o0O0o0oO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00) {
        return o0OO0o00.o00oOo0o(o0oo00o, o0o0oo00);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0o0oo(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OOo000.o00oo(o0oo00o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oO(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        return o0OOo000.o00ooO0o(o0oo00o, i);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0oO0(@NotNull o0O0OO<? extends T> o0o0oo) {
        return o0OO0o00.o00oOoO0(o0o0oo);
    }

    @Nullable
    public static final <S, T extends S> Object o0O0oO0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super S, ? super T, ? super o00oOo0O<? super S>, ? extends Object> o0o0000o, @NotNull o00oOo0O<? super S> o00ooo0o2) {
        return o0o0000.o00oOoOO(o0oo00o, o0o0000o, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oO0o(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0OOo000.o00ooO0O(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0oOO0(@NotNull o0OO00o<? extends T> o0oo00o, long j, @NotNull o0O00000<? super Throwable, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return o0OOO0OO.o00oOo0O(o0oo00o, j, o0o00000);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0O0oOOO(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new o0oo0000.o00oo0OO(r, o0oo00o, o0o0000o);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0O0oOo(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOO00.o00oOoOO(o0oo00o, j);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0oOo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super T, ? super T, ? super o00oOo0O<? super T>, ? extends Object> o0o0000o) {
        return new o0oo0000.o00oo0O(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0O0oOoO(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new o0oo0000.o00oo0OO(r, o0oo00o, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @o0OO0o.o0OO000(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o0O0oOoo(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return o0OOo000.o00ooO(o0oo00o, r, o0o0000o);
    }

    @NotNull
    public static final <T> oO000<T> o0O0oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull oO0OoOO0 oo0oooo0, int i) {
        return oO0Oo.o00oOoO0(o0oo00o, o0o0oo00, oo0oooo0, i);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @o0OO0o.o0OO000(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super T, ? super T, ? super o00oOo0O<? super T>, ? extends Object> o0o0000o) {
        return new o0oo0000.o00oo0O(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0O0oo00(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OOOO.o0O000<? super o0OO0<? super T>, ? super Throwable, ? super Long, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o000) {
        return new o0OOO0OO.o00oo00O(o0oo00o, o0o000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oo0O(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        return o0OOo000.o00ooO00(o0oo00o, i);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o0O0oo0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOo000.o00oOooo(o0oo00o, o0o00000);
    }

    @Nullable
    public static final <T> Object o0O0ooOO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOoOo(o0oo00o, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @o0OO0o.o0OO000(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0ooo(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        return o0OOo000.o00ooOO(o0oo00o, i);
    }

    @Nullable
    public static final <T> Object o0O0ooo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        return o0o0000.o00oOoo0(o0oo00o, o00ooo0o2);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oooO(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        return o0OOo000.o00ooOOo(o0oo00o, t);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0O0oooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        return o0OOo000.o00ooOo0(o0oo00o, o0oo00o2);
    }

    @NotNull
    public static final <T> oO000Oo0<T> o0OO000(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull oO0OoOO0 oo0oooo0, T t) {
        return oO0Oo.o00oOoOo(o0oo00o, o0o0oo00, oo0oooo0, t);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void o0OO000o(@NotNull o0OO00o<? extends T> o0oo00o) {
        o0OOo000.o00ooOo(o0oo00o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> o0OO00o<T> o0OO00OO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        return o0OOo000.o00ooo00(o0oo00o, o00oo0Var);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0OO00Oo(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        return o0OOOO00.o00oOoO0(o0oo00o, i);
    }

    @Nullable
    public static final <T> Object o0OO00o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull List<T> list, @NotNull o00oOo0O<? super List<? extends T>> o00ooo0o2) {
        return o0OO0oO0.o00oOOo0(o0oo00o, list, o00ooo0o2);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0OO00o0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o0OOOO00.o00oo0O(o0oo00o, o0o00000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @o0OO0o.o0OO000(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o0OO00oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOo000.o00ooo0(o0oo00o, o0o00000);
    }

    @Nullable
    public static final <T> Object o0OO0O0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull Set<T> set, @NotNull o00oOo0O<? super Set<? extends T>> o00ooo0o2) {
        return o0OO0oO0.o00oOOo0(o0oo00o, set, o00ooo0o2);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0OO0OoO(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O0000O<? super o0OO0<? super R>, ? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return o0OOO0O.o00oOoO0(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o0OO0Ooo(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O0000O<? super o0OO0<? super R>, ? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o0000o) {
        return o0OOOO00.o00oOoOO(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<o0OO0oO.o0O0o000<T>> o0OO0o0(@NotNull o0OO00o<? extends T> o0oo00o) {
        return new o0oo0000.o00oo(o0oo00o);
    }

    @o0OO0o.o0O
    @NotNull
    public static final <T, R> o0OO00o<R> o0OO0o00(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O0000O<? super o0OO0<? super R>, ? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return new o0OOO0O.o00oo0(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o0OO0o0O(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new oO0OOO00.o00oOOoO(o0oo00o2, o0oo00o, o0o0000o);
    }

    @o0OOo00O.oO0000Oo
    @NotNull
    public static final <T, R> o0OO00o<R> o0OOooO0(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O0000O<? super o0OO0<? super R>, ? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o0000o) {
        return o0OOOO0o.o00oo0(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0OoO00O(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        return o0OOOO00.o00oOooO(o0oo00o, i);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object o0OoOoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull C c, @NotNull o00oOo0O<? super C> o00ooo0o2) {
        return o0OO0oO0.o00oOOo0(o0oo00o, c, o00ooo0o2);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0OoOoOO(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOO00.o00oOo00(o0oo00o, j);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0OoOoOo(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOO00.o00oOOo0(o0oo00o, j);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @o0OO0o.o0OO000(expression = "collect(action)", imports = {}))
    public static final <T> void o0OooO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOo000.o00oo0(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o0oO0Ooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o0oo0000.o00oOOo0(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T> oO000<T> o0oOo0O0(@NotNull oO000<? extends T> oo000, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new oO00O0o(oo000, o0o00000);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o0ooO(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o) {
        return o0OOOO0o.o00oOo0O(o0oo00o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o0ooOoOO(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOo000.o00oOoo0(o0oo00o, j);
    }

    @o0OOo00O.oO0000Oo
    @NotNull
    public static final <T, R> o0OO00o<R> oo0OOoo(@NotNull o0OO00o<? extends T> o0oo00o, @o00oOOoO @NotNull o0O00000<? super T, ? super o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return o0OOOO0o.o00oOoo0(o0oo00o, o0o00000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void oo0oO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOo000.o00ooOoO(o0oo00o, o0o00000);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> oo0oOOo(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return o0OOO00.o00oOoO(o0oo00o, j);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void oo0ooO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000, @NotNull o0O00000<? super Throwable, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000002) {
        o0OOo000.o00ooOoo(o0oo00o, o0o00000, o0o000002);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> o0OO00o<T> oooOO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        return o0OOo000.o00ooO0(o0oo00o, o00oo0Var);
    }
}
