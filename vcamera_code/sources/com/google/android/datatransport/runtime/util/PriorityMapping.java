package com.google.android.datatransport.runtime.util;

import android.support.v4.media.o00oOOo0;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class PriorityMapping {
    private static HashMap<Priority, Integer> PRIORITY_INT_MAP;
    private static SparseArray<Priority> PRIORITY_MAP = new SparseArray<>();

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        PRIORITY_INT_MAP = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(Priority.HIGHEST, 2);
        for (Priority priority : PRIORITY_INT_MAP.keySet()) {
            PRIORITY_MAP.append(PRIORITY_INT_MAP.get(priority).intValue(), priority);
        }
    }

    public static int toInt(@oo0oO0 Priority priority) {
        Integer num = PRIORITY_INT_MAP.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @oo0oO0
    public static Priority valueOf(int i) {
        Priority priority = PRIORITY_MAP.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(o00oOOo0.o00oOOo0("Unknown Priority for value ", i));
    }
}
