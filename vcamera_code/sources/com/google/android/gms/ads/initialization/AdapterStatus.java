package com.google.android.gms.ads.initialization;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* loaded from: classes.dex */
    public enum State {
        NOT_READY,
        READY
    }

    @oo0oO0
    String getDescription();

    @oo0oO0
    State getInitializationState();

    int getLatency();
}
