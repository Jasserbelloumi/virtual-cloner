package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0O0OOOo;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class zzdsa {
    private final zzdrk zza;
    private final zzdna zzb;
    private final Object zzc = new Object();
    @o0O0OOOo("lock")
    private final List zzd = new ArrayList();
    @o0O0OOOo("lock")
    private boolean zze;

    public zzdsa(zzdrk zzdrkVar, zzdna zzdnaVar) {
        this.zza = zzdrkVar;
        this.zzb = zzdnaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdmz zza;
        zzdmz zza2;
        zzbpq zzbpqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbjl zzbjlVar = (zzbjl) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziz)).booleanValue() && (zza2 = this.zzb.zza(zzbjlVar.zza)) != null && (zzbpqVar = zza2.zzc) != null) {
                    str = zzbpqVar.toString();
                    String str2 = str;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue() && (zza = this.zzb.zza(zzbjlVar.zza)) != null && zza.zzd) {
                        z = true;
                        List list2 = this.zzd;
                        String str3 = zzbjlVar.zza;
                        list2.add(new zzdrz(str3, str2, this.zzb.zzc(str3), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
                    }
                    z = false;
                    List list22 = this.zzd;
                    String str32 = zzbjlVar.zza;
                    list22.add(new zzdrz(str32, str2, this.zzb.zzc(str32), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
                }
                str = "";
                String str22 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue()) {
                    z = true;
                    List list222 = this.zzd;
                    String str322 = zzbjlVar.zza;
                    list222.add(new zzdrz(str322, str22, this.zzb.zzc(str322), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
                }
                z = false;
                List list2222 = this.zzd;
                String str3222 = zzbjlVar.zza;
                list2222.add(new zzdrz(str3222, str22, this.zzb.zzc(str3222), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            for (zzdrz zzdrzVar : this.zzd) {
                jSONArray.put(zzdrzVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdry(this));
    }
}
