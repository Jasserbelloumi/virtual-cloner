package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import o00ooOO0.o0O000O;
/* loaded from: classes2.dex */
final class zzfld extends zzflo {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfld(String str, String str2, zzflc zzflcVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzflo) {
            zzflo zzfloVar = (zzflo) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfloVar.zzb()) : zzfloVar.zzb() == null) {
                String str2 = this.zzb;
                String zza = zzfloVar.zza();
                if (str2 != null ? str2.equals(zza) : zza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return o0O000O.o00oOOo0("OverlayDisplayDismissRequest{sessionToken=", this.zza, ", appId=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzflo
    @o0OO00OO
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflo
    @o0OO00OO
    public final String zzb() {
        return this.zza;
    }
}
