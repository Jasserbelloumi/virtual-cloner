package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzfhg extends zzfhc {
    public zzfhg(zzfgv zzfgvVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfgvVar, hashSet, jSONObject, j, null);
    }

    private final void zzc(String str) {
        zzffz zza = zzffz.zza();
        if (zza != null) {
            for (zzffo zzffoVar : zza.zzc()) {
                if (((zzfhc) this).zza.contains(zzffoVar.zzh())) {
                    zzffoVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhd, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhd
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
