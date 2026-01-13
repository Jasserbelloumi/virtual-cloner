package com.google.android.datatransport.runtime.synchronization;

import o00oOooO.oO0Oo;
@oO0Oo
/* loaded from: classes.dex */
public interface SynchronizationGuard {

    /* loaded from: classes.dex */
    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(CriticalSection<T> criticalSection);
}
