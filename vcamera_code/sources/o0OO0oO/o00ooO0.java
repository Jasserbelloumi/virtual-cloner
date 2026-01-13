package o0OO0oO;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
/* loaded from: classes3.dex */
public class o00ooO0 {
    @NotNull
    public static final <T> T[] o00oOOo0(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        o0OOOOO0.o0ooO.o00oo0(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "contentDeepHashCode")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> int o00oOOoO(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final void o00oOo00(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    @o0OOO0OO.o00oo00O
    public static final String o00oOo0O(byte[] bArr, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new String(bArr, charset);
    }

    public static final <T> T[] o00oOo0o(Collection<? extends T> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        o0OOOOO0.o0ooO.o00oooOo();
        return (T[]) collection.toArray(new Object[0]);
    }

    public static final <T> T[] o00oOooO(T[] tArr) {
        if (tArr == null) {
            o0OOOOO0.o0ooO.o00oooOo();
            return (T[]) new Object[0];
        }
        return tArr;
    }
}
