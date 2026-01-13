package com.google.android.gms.common.util;

import androidx.collection.o00oOOo0;
import androidx.collection.o00oOo00;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00Oo.o0oO0Ooo;
@KeepForSdk
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@o0OO00OO Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@oo0oO0 T t) {
        return Collections.singletonList(t);
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@oo0oO0 T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : listOf(tArr[0]) : listOf();
    }

    @oo0oO0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@oo0oO0 K k, @oo0oO0 V v, @oo0oO0 K k2, @oo0oO0 V v2, @oo0oO0 K k3, @oo0oO0 V v3) {
        Map zza = zza(3, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        return Collections.unmodifiableMap(zza);
    }

    @oo0oO0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@oo0oO0 K k, @oo0oO0 V v, @oo0oO0 K k2, @oo0oO0 V v2, @oo0oO0 K k3, @oo0oO0 V v3, @oo0oO0 K k4, @oo0oO0 V v4, @oo0oO0 K k5, @oo0oO0 V v5, @oo0oO0 K k6, @oo0oO0 V v6) {
        Map zza = zza(6, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        return Collections.unmodifiableMap(zza);
    }

    @oo0oO0
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@oo0oO0 K[] kArr, @oo0oO0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map zza = zza(length, false);
                    for (int i = 0; i < kArr.length; i++) {
                        zza.put(kArr[i], vArr[i]);
                    }
                    return Collections.unmodifiableMap(zza);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException(o0oO0Ooo.o00oOOo0("Key and values array lengths not equal: ", length, " != ", length2));
    }

    @oo0oO0
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new o00oOo00() : zzb(i, true);
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@oo0oO0 T t, @oo0oO0 T t2, @oo0oO0 T t3) {
        Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return Collections.unmodifiableSet(zzb);
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@oo0oO0 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t = tArr[0];
                    T t2 = tArr[1];
                    Set zzb = zzb(2, false);
                    zzb.add(t);
                    zzb.add(t2);
                    return Collections.unmodifiableSet(zzb);
                } else if (length != 3) {
                    if (length != 4) {
                        Set zzb2 = zzb(length, false);
                        Collections.addAll(zzb2, tArr);
                        return Collections.unmodifiableSet(zzb2);
                    }
                    T t3 = tArr[0];
                    T t4 = tArr[1];
                    T t5 = tArr[2];
                    T t6 = tArr[3];
                    Set zzb3 = zzb(4, false);
                    zzb3.add(t3);
                    zzb3.add(t4);
                    zzb3.add(t5);
                    zzb3.add(t6);
                    return Collections.unmodifiableSet(zzb3);
                } else {
                    return setOf(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    private static Map zza(int i, boolean z) {
        return i <= 256 ? new o00oOOo0(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z) {
        return i <= (true != z ? 256 : 128) ? new o00oOo00(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }
}
