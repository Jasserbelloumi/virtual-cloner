package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdfc implements zzbhp {
    private final WeakReference zza;

    public /* synthetic */ zzdfc(zzdff zzdffVar, zzdfb zzdfbVar) {
        this.zza = new WeakReference(zzdffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        zzdca zzdcaVar;
        zzdca zzdcaVar2;
        zzcum unused;
        zzdff zzdffVar = (zzdff) this.zza.get();
        if (zzdffVar == null) {
            return;
        }
        unused = zzdffVar.zzh;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
            zzdcaVar = zzdffVar.zzi;
            zzdcaVar.zzr();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdcaVar2 = zzdffVar.zzi;
            zzdcaVar2.zzs();
        }
    }
}
