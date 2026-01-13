package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.FormError;
/* loaded from: classes2.dex */
public final class zzj extends Exception {
    private final int zza;

    public zzj(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzj(int i, String str, Throwable th) {
        super(str, th);
        this.zza = i;
    }

    public final FormError zza() {
        Throwable cause = getCause();
        getMessage();
        if (cause != null) {
            getCause();
        }
        return new FormError(this.zza, getMessage());
    }
}
