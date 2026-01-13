package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class DataBufferUtils {
    @oo0oO0
    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    @oo0oO0
    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oo0oO0
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(@oo0oO0 DataBuffer<E> dataBuffer) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            for (E e : dataBuffer) {
                arrayList.add(e.freeze());
            }
            return arrayList;
        } finally {
            dataBuffer.close();
        }
    }

    public static boolean hasData(@oo0oO0 DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(@oo0oO0 DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(@oo0oO0 DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }
}
