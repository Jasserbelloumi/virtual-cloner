package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuf;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzy implements zzfuf {
    public final /* synthetic */ zzbrr zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzac zzc;

    public zzy(zzac zzacVar, zzbrr zzbrrVar, boolean z) {
        this.zzc = zzacVar;
        this.zza = zzbrrVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        try {
            zzbrr zzbrrVar = this.zza;
            String message = th.getMessage();
            zzbrrVar.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzX;
        zzfff zzfffVar;
        String uri;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzt;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri2 = (Uri) it.next();
                    if (this.zzc.zzP(uri2)) {
                        str = this.zzc.zzC;
                        zzX = zzac.zzX(uri2, str, "1");
                        zzfffVar = this.zzc.zzs;
                        uri = zzX.toString();
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbar.zzgZ)).booleanValue()) {
                            zzfffVar = this.zzc.zzs;
                            uri = uri2.toString();
                        }
                    }
                    zzfffVar.zzc(uri, null);
                }
            }
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }
}
