package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzfjm extends Exception {
    private final int zza;

    public zzfjm(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzfjm(int i, Throwable th) {
        super(th);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }
}
