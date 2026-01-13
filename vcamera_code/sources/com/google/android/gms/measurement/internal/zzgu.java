package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzgu {
    public final Context zza;
    @o0OO00OO
    public String zzb;
    @o0OO00OO
    public String zzc;
    @o0OO00OO
    public String zzd;
    @o0OO00OO
    public Boolean zze;
    public long zzf;
    @o0OO00OO
    public com.google.android.gms.internal.measurement.zzcl zzg;
    public boolean zzh;
    @o0OO00OO
    public final Long zzi;
    @o0OO00OO
    public String zzj;

    @VisibleForTesting
    public zzgu(Context context, @o0OO00OO com.google.android.gms.internal.measurement.zzcl zzclVar, @o0OO00OO Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzclVar != null) {
            this.zzg = zzclVar;
            this.zzb = zzclVar.zzf;
            this.zzc = zzclVar.zze;
            this.zzd = zzclVar.zzd;
            this.zzh = zzclVar.zzc;
            this.zzf = zzclVar.zzb;
            this.zzj = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
