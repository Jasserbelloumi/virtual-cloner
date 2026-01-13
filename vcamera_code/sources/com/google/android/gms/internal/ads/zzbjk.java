package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbjk implements zzakh {
    private volatile zzbix zza;
    private final Context zzb;

    public zzbjk(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbjk zzbjkVar) {
        if (zzbjkVar.zza == null) {
            return;
        }
        zzbjkVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    @o0OO00OO
    public final zzakk zza(zzako zzakoVar) throws zzakx {
        Parcelable.Creator<zzbiy> creator = zzbiy.CREATOR;
        Map zzl = zzakoVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbiy zzbiyVar = new zzbiy(zzakoVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzbzs zzbzsVar = new zzbzs();
            this.zza = new zzbix(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbji(this, zzbzsVar), new zzbjj(this, zzbzsVar));
            this.zza.checkAvailabilityAndConnect();
            zzbjg zzbjgVar = new zzbjg(this, zzbiyVar);
            zzfuu zzfuuVar = zzbzn.zza;
            zzfut zzn = zzfuj.zzn(zzfuj.zzm(zzbzsVar, zzbjgVar, zzfuuVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzea)).intValue(), TimeUnit.MILLISECONDS, zzbzn.zzd);
            zzn.zzc(new zzbjh(this), zzfuuVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzn.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbja zzbjaVar = (zzbja) new zzbtl(parcelFileDescriptor).zza(zzbja.CREATOR);
            if (zzbjaVar == null) {
                return null;
            }
            if (zzbjaVar.zza) {
                throw new zzakx(zzbjaVar.zzb);
            }
            if (zzbjaVar.zze.length != zzbjaVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbjaVar.zze;
                if (i >= strArr3.length) {
                    return new zzakk(zzbjaVar.zzc, zzbjaVar.zzd, hashMap, zzbjaVar.zzg, zzbjaVar.zzh);
                }
                hashMap.put(strArr3[i], zzbjaVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
