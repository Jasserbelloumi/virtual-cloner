package com.google.android.gms.common.data;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface DataBufferObserver {

    /* loaded from: classes.dex */
    public interface Observable {
        void addObserver(@oo0oO0 DataBufferObserver dataBufferObserver);

        void removeObserver(@oo0oO0 DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}
