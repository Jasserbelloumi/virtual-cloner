package o0OOOOO0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "CollectionToArray")
@o0OOO00({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O000o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Object[] f13569o00oOOo0 = new Object[0];

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f13570o00oOOoO = 2147483645;

    @o0OOOO0o.o00oo0OO(name = "toArray")
    @NotNull
    public static final Object[] o00oOOo0(@NotNull Collection<?> collection) {
        o0ooO.o00oo0O0(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        o0ooO.o00oo0OO(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        o0ooO.o00oo0OO(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f13569o00oOOo0;
    }

    @o0OOOO0o.o00oo0OO(name = "toArray")
    @NotNull
    public static final Object[] o00oOOoO(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        o0ooO.o00oo0O0(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            o0ooO.o00oo0(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                o0ooO.o00oo0OO(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                o0ooO.o00oo0OO(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Object[] o00oOo00(Collection<?> collection, o0OOOO.o00oOOo0<Object[]> o00oooo02, o0OOOO.o00oo<? super Integer, Object[]> o00ooVar, o0OOOO.o0O00000<? super Object[], ? super Integer, Object[]> o0o00000) {
        Object[] invoke;
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                int i = 0;
                ?? r3 = o00ooVar.invoke(Integer.valueOf(size));
                while (true) {
                    int i2 = i + 1;
                    r3[i] = it.next();
                    if (i2 >= r3.length) {
                        if (!it.hasNext()) {
                            return r3;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        r3 = Arrays.copyOf((Object[]) r3, i3);
                        o0ooO.o00oo0OO(r3, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        invoke = o0o00000.invoke(r3, Integer.valueOf(i2));
                        break;
                    }
                    i = i2;
                    r3 = r3;
                }
                return invoke;
            }
        }
        invoke = o00oooo02.invoke();
        return invoke;
    }
}
