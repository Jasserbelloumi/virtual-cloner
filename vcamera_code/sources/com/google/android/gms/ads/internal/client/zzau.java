package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau extends zzax {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @o0OO00OO
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsh zzbshVar;
        zzbfx zzbfxVar;
        zzbar.zzc(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzjb)).booleanValue()) {
            zzbfxVar = this.zzd.zzg;
            return zzbfxVar.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbeg.zze(((zzbek) zzbze.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzbzc() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzc
                public final Object zza(Object obj) {
                    return zzbej.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzbzd | NullPointerException e) {
            this.zzd.zzh = zzbsf.zza(this.zza.getContext());
            zzbshVar = this.zzd.zzh;
            zzbshVar.zzf(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
