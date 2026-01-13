package o0OO0oO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0OO0o.o0OOo000;
import o0OO0o.oO0000o0;
import o0OO0o.ooo0Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes3.dex */
public class o00ooO extends o00ooO0 {
    @NotNull
    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "contentDeepToString")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> String o00oOoO(@Nullable T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        int length = tArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        o00oOoOO(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @o0OO0o.o0O
    @o0OOOO0o.o00oo0OO(name = "contentDeepEquals")
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> boolean o00oOoO0(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if ((t instanceof Object[]) && (t2 instanceof Object[])) {
                    if (!o00oOoO0((Object[]) t, (Object[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof byte[]) && (t2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof short[]) && (t2 instanceof short[])) {
                    if (!Arrays.equals((short[]) t, (short[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof int[]) && (t2 instanceof int[])) {
                    if (!Arrays.equals((int[]) t, (int[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof long[]) && (t2 instanceof long[])) {
                    if (!Arrays.equals((long[]) t, (long[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof float[]) && (t2 instanceof float[])) {
                    if (!Arrays.equals((float[]) t, (float[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof double[]) && (t2 instanceof double[])) {
                    if (!Arrays.equals((double[]) t, (double[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof char[]) && (t2 instanceof char[])) {
                    if (!Arrays.equals((char[]) t, (char[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof boolean[]) && (t2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof o0OO0o.o0OOO0OO) && (t2 instanceof o0OO0o.o0OOO0OO)) {
                    if (!o0OO0oOo.o0O0o000.o0O0OoO0(((o0OO0o.o0OOO0OO) t).f13210o00oo0O0, ((o0OO0o.o0OOO0OO) t2).f13210o00oo0O0)) {
                        return false;
                    }
                } else if ((t instanceof oO0000o0) && (t2 instanceof oO0000o0)) {
                    if (!o0OO0oOo.o0O0o000.o0O0Oo0o(((oO0000o0) t).f13235o00oo0O0, ((oO0000o0) t2).f13235o00oo0O0)) {
                        return false;
                    }
                } else if ((t instanceof o0OOo000) && (t2 instanceof o0OOo000)) {
                    if (!o0OO0oOo.o0O0o000.o0O0Oo(((o0OOo000) t).f13219o00oo0O0, ((o0OOo000) t2).f13219o00oo0O0)) {
                        return false;
                    }
                } else if ((t instanceof ooo0Oo0) && (t2 instanceof ooo0Oo0)) {
                    if (!o0OO0oOo.o0O0o000.o0O0OoO(((ooo0Oo0) t).f13241o00oo0O0, ((ooo0Oo0) t2).f13241o00oo0O0)) {
                        return false;
                    }
                } else if (!o0OOOOO0.o0ooO.o00oOoO0(t, t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final <T> void o00oOoOO(T[] tArr, StringBuilder sb, List<Object[]> list) {
        String o0O0o0Oo2;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            T t = tArr[i];
            if (t == null) {
                o0O0o0Oo2 = "null";
            } else if (t instanceof Object[]) {
                o00oOoOO((Object[]) t, sb, list);
            } else {
                if (t instanceof byte[]) {
                    o0O0o0Oo2 = Arrays.toString((byte[]) t);
                } else if (t instanceof short[]) {
                    o0O0o0Oo2 = Arrays.toString((short[]) t);
                } else if (t instanceof int[]) {
                    o0O0o0Oo2 = Arrays.toString((int[]) t);
                } else if (t instanceof long[]) {
                    o0O0o0Oo2 = Arrays.toString((long[]) t);
                } else if (t instanceof float[]) {
                    o0O0o0Oo2 = Arrays.toString((float[]) t);
                } else if (t instanceof double[]) {
                    o0O0o0Oo2 = Arrays.toString((double[]) t);
                } else if (t instanceof char[]) {
                    o0O0o0Oo2 = Arrays.toString((char[]) t);
                } else if (t instanceof boolean[]) {
                    o0O0o0Oo2 = Arrays.toString((boolean[]) t);
                } else {
                    o0O0o0Oo2 = t instanceof o0OO0o.o0OOO0OO ? o0OO0oOo.o0O0o000.o0O0o0Oo(((o0OO0o.o0OOO0OO) t).f13210o00oo0O0) : t instanceof oO0000o0 ? o0OO0oOo.o0O0o000.o0O0o0oO(((oO0000o0) t).f13235o00oo0O0) : t instanceof o0OOo000 ? o0OO0oOo.o0O0o000.o0oOo0O0(((o0OOo000) t).f13219o00oo0O0) : t instanceof ooo0Oo0 ? o0OO0oOo.o0O0o000.o0O0oo0O(((ooo0Oo0) t).f13241o00oo0O0) : t.toString();
                }
                o0OOOOO0.o0ooO.o00oo0OO(o0O0o0Oo2, "toString(this)");
            }
            sb.append(o0O0o0Oo2);
        }
        sb.append(']');
        list.remove(o0O00O0o.o00ooOo(list));
    }

    @NotNull
    public static final <T> List<T> o00oOoOo(@NotNull T[][] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int i = 0;
        for (T[] tArr2 : tArr) {
            i += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] tArr3 : tArr) {
            o0O00o00.o0oO0Ooo(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lo0OOOO/o00oOOo0<+TR;>;)TR; */
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final Object o00oOoo0(Object[] objArr, o0OOOO.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return objArr.length == 0 ? o00oooo02.invoke() : objArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final boolean o00oOooo(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T, R> o0OO0o.o0O0o00<List<T>, List<R>> o00oo00O(@NotNull o0OO0o.o0O0o00<? extends T, ? extends R>[] o0o0o00Arr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00Arr, "<this>");
        ArrayList arrayList = new ArrayList(o0o0o00Arr.length);
        ArrayList arrayList2 = new ArrayList(o0o0o00Arr.length);
        for (o0OO0o.o0O0o00<? extends T, ? extends R> o0o0o00 : o0o0o00Arr) {
            arrayList.add(o0o0o00.getFirst());
            arrayList2.add(o0o0o00.getSecond());
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }
}
