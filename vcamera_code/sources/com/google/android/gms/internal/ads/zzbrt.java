package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbrt {
    @GuardedBy("InternalQueryInfoGenerator.class")
    private static zzbxr zza;
    private final Context zzb;
    private final AdFormat zzc;
    @o0OO00OO
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    public zzbrt(Context context, AdFormat adFormat, @o0OO00OO com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
    }

    @o0OO00OO
    public static zzbxr zza(Context context) {
        zzbxr zzbxrVar;
        synchronized (zzbrt.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbnc());
            }
            zzbxrVar = zza;
        }
        return zzbxrVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        String str;
        zzbxr zza2 = zza(this.zzb);
        if (zza2 == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
            try {
                zza2.zze(wrap, new zzbxv(null, this.zzc.name(), null, zzdxVar == null ? new com.google.android.gms.ads.internal.client.zzm().zza() : com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar)), new zzbrs(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}
