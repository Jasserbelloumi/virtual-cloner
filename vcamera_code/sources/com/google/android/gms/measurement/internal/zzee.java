package com.google.android.gms.measurement.internal;

import android.support.v4.media.o00oOOoO;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzee implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzeh zzf;

    public zzee(zzeh zzehVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzehVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzeh zzehVar;
        char c3;
        zzew zzm = this.zzf.zzt.zzm();
        if (!zzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeh zzehVar2 = this.zzf;
        c = zzehVar2.zza;
        if (c == 0) {
            if (zzehVar2.zzt.zzf().zzy()) {
                zzehVar = this.zzf;
                zzehVar.zzt.zzaw();
                c3 = 'C';
            } else {
                zzehVar = this.zzf;
                zzehVar.zzt.zzaw();
                c3 = 'c';
            }
            zzehVar.zza = c3;
        }
        zzeh zzehVar3 = this.zzf;
        j = zzehVar3.zzb;
        if (j < 0) {
            zzehVar3.zzt.zzf().zzh();
            zzehVar3.zzb = 74029L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        zzeh zzehVar4 = this.zzf;
        c2 = zzehVar4.zza;
        j2 = zzehVar4.zzb;
        String zzo = zzeh.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder();
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        String o00oOOo02 = o00oOOoO.o00oOOo0(sb, ":", zzo);
        if (o00oOOo02.length() > 1024) {
            o00oOOo02 = this.zzb.substring(0, 1024);
        }
        zzeu zzeuVar = zzm.zzb;
        if (zzeuVar != null) {
            zzeuVar.zzb(o00oOOo02, 1L);
        }
    }
}
