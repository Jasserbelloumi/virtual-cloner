package o0OO0oOO;

import java.util.Arrays;
import java.util.List;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O00OO {
    @NotNull
    public static final <T> T[] o00oOo0O(@NotNull T[] tArr, int i) {
        o0ooO.o00oo0O0(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        o0ooO.o00oo0OO(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void o00oOo0o(@NotNull E[] eArr, int i) {
        o0ooO.o00oo0O0(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <T> boolean o00oOoO(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!o0ooO.o00oOoO0(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <E> void o00oOoO0(@NotNull E[] eArr, int i, int i2) {
        o0ooO.o00oo0O0(eArr, "<this>");
        while (i < i2) {
            o00oOo0o(eArr, i);
            i++;
        }
    }

    public static final <T> int o00oOoOO(T[] tArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            T t = tArr[i + i4];
            i3 = (i3 * 31) + (t != null ? t.hashCode() : 0);
        }
        return i3;
    }

    public static final <T> String o00oOoOo(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "sb.toString()");
        return sb2;
    }

    @NotNull
    public static final <E> E[] o00oOooO(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
