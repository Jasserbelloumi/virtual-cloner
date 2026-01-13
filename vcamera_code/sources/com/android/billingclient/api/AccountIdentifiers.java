package com.android.billingclient.api;

import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class AccountIdentifiers {
    @o0OO00OO
    private final String zza;
    @o0OO00OO
    private final String zzb;

    public AccountIdentifiers(@o0OO00OO String str, @o0OO00OO String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @o0OO00OO
    public String getObfuscatedAccountId() {
        return this.zza;
    }

    @o0OO00OO
    public String getObfuscatedProfileId() {
        return this.zzb;
    }
}
