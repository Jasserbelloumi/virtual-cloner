package com.google.android.gms.tasks;

import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    @oo0oO0
    public abstract CancellationToken onCanceledRequested(@oo0oO0 OnTokenCanceledListener onTokenCanceledListener);
}
