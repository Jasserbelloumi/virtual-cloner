package com.google.android.gms.common;

import android.content.Intent;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, @oo0oO0 String str, @oo0oO0 Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
