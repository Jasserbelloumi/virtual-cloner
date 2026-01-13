package o0OOo00O;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OOO00o.o00oOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0o0o
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lo0OOo00O/o0OO0;", "", "", "time", "Lo0OO0o/oO0Ooooo;", "o0O0o0oO", "(JLo0OO/o00oOo0O;)Ljava/lang/Object;", "timeMillis", "Lo0OOo00O/o0O000Oo;", "continuation", "o00oOo0O", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo0OO/o00oo0;", "context", "Lo0OOo00O/o0OOO0OO;", "o0O000O", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0OO0 {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object o00oOOo0(@NotNull o0OO0 o0oo0, long j, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            if (j <= 0) {
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
            o0O00 o0o00 = new o0O00(o00oOo00.o00oOooO(o00ooo0o2), 1);
            o0o00.o00ooo00();
            o0oo0.o00oOo0O(j, o0o00);
            Object o00ooO002 = o0o00.o00ooO00();
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (o00ooO002 == o00oooo02) {
                o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
            }
            return o00ooO002 == o00oooo02 ? o00ooO002 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @NotNull
        public static o0OOO0OO o00oOOoO(@NotNull o0OO0 o0oo0, long j, @NotNull Runnable runnable, @NotNull o0OO.o00oo0 o00oo0Var) {
            return o0OO00o0.o00oOOo0().o0O000O(j, runnable, o00oo0Var);
        }
    }

    void o00oOo0O(long j, @NotNull o0O000Oo<? super o0OO0o.oO0Ooooo> o0o000oo);

    @NotNull
    o0OOO0OO o0O000O(long j, @NotNull Runnable runnable, @NotNull o0OO.o00oo0 o00oo0Var);

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object o0O0o0oO(long j, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2);
}
