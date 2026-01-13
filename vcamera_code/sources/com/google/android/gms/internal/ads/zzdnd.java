package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import o00oOooO.o0o0000;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzdnd {
    private final zzezq zza;
    private final zzdna zzb;

    public zzdnd(zzezq zzezqVar, zzdna zzdnaVar) {
        this.zza = zzezqVar;
        this.zzb = zzdnaVar;
    }

    @o0o0000
    public final zzbnf zza() throws RemoteException {
        zzbnf zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzbza.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbpc zzb(String str) throws RemoteException {
        zzbpc zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzezs zzc(String str, JSONObject jSONObject) throws zzezc {
        zzbni zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbof(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbof(new zzbpu());
            } else {
                zzbnf zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzbza.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzezs zzezsVar = new zzezs(zzb);
            this.zzb.zzd(str, zzezsVar);
            return zzezsVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzezc(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
