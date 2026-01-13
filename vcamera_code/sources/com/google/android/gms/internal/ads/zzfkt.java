package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
class zzfkt {
    public static final String zza = new UUID(0, 0).toString();
    public final zzfku zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfkt(Context context, String str, String str2, String str3) {
        this.zzb = zzfku.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 == null || str3 == null) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
            o00oOOo02.append(str2 == null ? "null" : "not null");
            o00oOOo02.append(", hashKey is ");
            o00oOOo02.append(str3 != null ? "not null" : "null");
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        return UUID.nameUUIDFromBytes(android.support.v4.media.o00oOoO.o00oOOo0(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
    }

    public final long zza(boolean z) {
        return this.zzb.zza(z ? this.zzf : this.zze, -1L);
    }

    public final zzfks zzb(@o0OO00OO String str, @o0OO00OO String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfks();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z2);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    this.zzb.zzd(z2 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z2);
            return (zze2 != null || z) ? new zzfks(zze2, zza(z2)) : zzc(str, str2);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfks zzc(String str, String str2) throws IOException {
        String zzh;
        boolean z;
        if (str == null) {
            zzh = UUID.randomUUID().toString();
            z = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.zzb.zzd("paid_3p_hash_key", uuid);
            zzh = zzh(str, str2, uuid);
            z = true;
        }
        return zzd(zzh, z);
    }

    public final zzfks zzd(String str, boolean z) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.zzb.zzd(z ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
            this.zzb.zzd(z ? this.zzd : this.zzc, str);
            return new zzfks(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zzd : this.zzc, null);
    }

    public final void zzf(boolean z) throws IOException {
        this.zzb.zze(z ? this.zzf : this.zze);
        this.zzb.zze(z ? this.zzd : this.zzc);
    }

    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzc);
    }
}
