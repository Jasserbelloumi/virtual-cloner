package com.google.android.gms.common;

import android.content.Intent;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@oo0oO0 String str, @oo0oO0 Intent intent) {
        super(str);
        this.zza = intent;
    }

    @oo0oO0
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
