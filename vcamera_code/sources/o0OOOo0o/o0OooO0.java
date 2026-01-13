package o0OOOo0o;

import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0OooO0 {
    public static final void o00oOOo0(boolean z, @NotNull Number number) {
        o0OOOOO0.o0ooO.o00oo0O0(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo0OOOo0o/o0O00o00<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final boolean o00oOOoO(o0O00o00 o0o00o00, Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return obj != null && o0o00o00.contains((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo0OOOo0o/o0O0OOO<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @o00oo00O
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o00oOo00(o0O0OOO o0o0ooo, Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return obj != null && o0o0ooo.contains((Comparable) obj);
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final o0oO0Ooo<Float> o00oOo0O(float f, float f2) {
        return new o0O00OOO(f, f2);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> o0O00o00<T> o00oOo0o(@NotNull T t, @NotNull T t2) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(t2, "that");
        return new o0O0O0O(t, t2);
    }

    @o0O000
    @o0OO00o0(version = "1.7")
    @NotNull
    public static final o0O0OOO<Float> o00oOoO(float f, float f2) {
        return new o0O0OOO0(f, f2);
    }

    @o0O000
    @o0OO00o0(version = "1.7")
    @NotNull
    public static final o0O0OOO<Double> o00oOoO0(double d, double d2) {
        return new o0O0OO(d, d2);
    }

    @o0O000
    @o0OO00o0(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> o0O0OOO<T> o00oOoOO(@NotNull T t, @NotNull T t2) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(t2, "that");
        return new o0O00oO0(t, t2);
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final o0oO0Ooo<Double> o00oOooO(double d, double d2) {
        return new o0O00OO(d, d2);
    }
}
