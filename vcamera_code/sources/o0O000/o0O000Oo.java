package o0O000;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
/* loaded from: classes.dex */
public final class o0O000Oo {

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static final <T extends Parcelable> List<T> o00oOOo0(@oo0oO0 Parcel parcel, @oo0oO0 List<T> list, @o0OO00OO ClassLoader classLoader) {
            List<T> readParcelableList;
            readParcelableList = parcel.readParcelableList(list, classLoader);
            return readParcelableList;
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static final Parcelable.Creator<?> o00oOOo0(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader) {
            Parcelable.Creator<?> readParcelableCreator;
            readParcelableCreator = parcel.readParcelableCreator(classLoader);
            return readParcelableCreator;
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static <T> T[] o00oOOo0(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> ArrayList<T> o00oOOoO(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <V, K> HashMap<K, V> o00oOo00(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @o00oOooO.o0O0O0Oo
        public static <K, V> void o00oOo0O(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @o00oOooO.o0O0O0Oo
        public static <T extends Parcelable> T o00oOo0o(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> Parcelable.Creator<T> o00oOoO(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> T[] o00oOoO0(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> List<T> o00oOoOO(@oo0oO0 Parcel parcel, @oo0oO0 List<T> list, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T extends Serializable> T o00oOoOo(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> SparseArray<T> o00oOoo0(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> void o00oOooO(@oo0oO0 Parcel parcel, @oo0oO0 List<? super T> list, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> T[] o00oOOo0(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? (T[]) o00oOo00.o00oOOo0(parcel, classLoader, cls) : (T[]) parcel.readArray(classLoader);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> o00oOOoO(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<? extends T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOOoO(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean o00oOo00(@oo0oO0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T> void o00oOo0O(@oo0oO0 Parcel parcel, @oo0oO0 List<? super T> list, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOo00.o00oOooO(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <K, V> void o00oOo0o(@oo0oO0 Parcel parcel, @oo0oO0 Map<? super K, ? super V> map, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<K> cls, @oo0oO0 Class<V> cls2) {
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOo00.o00oOo0O(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> T[] o00oOoO(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? (T[]) o00oOo00.o00oOoO0(parcel, classLoader, cls) : (T[]) parcel.readParcelableArray(classLoader);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T extends Parcelable> T o00oOoO0(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? (T) o00oOo00.o00oOo0o(parcel, classLoader, cls) : (T) parcel.readParcelable(classLoader);
    }

    @o0OOooO0(30)
    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T> Parcelable.Creator<T> o00oOoOO(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOoO(parcel, classLoader, cls) : (Parcelable.Creator<T>) o00oOOoO.o00oOOo0(parcel, classLoader);
    }

    @o0OOooO0(api = 29)
    @oo0oO0
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T> List<T> o00oOoOo(@oo0oO0 Parcel parcel, @oo0oO0 List<T> list, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOoOO(parcel, list, classLoader, cls) : o00oOOo0.o00oOOo0(parcel, list, classLoader);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T extends Serializable> T o00oOoo0(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? (T) o00oOo00.o00oOoOo(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <K, V> HashMap<K, V> o00oOooO(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<? extends K> cls, @oo0oO0 Class<? extends V> cls2) {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOo00(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static <T> SparseArray<T> o00oOooo(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader, @oo0oO0 Class<? extends T> cls) {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOoo0(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void o00oo00O(@oo0oO0 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
