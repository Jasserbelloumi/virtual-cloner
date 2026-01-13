package com.google.android.gms.common.data;

import java.util.ArrayList;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class FreezableUtils {
    /* JADX WARN: Multi-variable type inference failed */
    @oo0oO0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@oo0oO0 ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(arrayList.get(i).freeze());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oo0oO0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@oo0oO0 E[] eArr) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oo0oO0
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@oo0oO0 Iterable<E> iterable) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (E e : iterable) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }
}
