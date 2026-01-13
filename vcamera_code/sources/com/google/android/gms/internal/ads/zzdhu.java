package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzdhu {
    private final zzdmq zza;
    private final zzdlf zzb;
    private final zzcnq zzc;
    private final zzdgq zzd;

    public zzdhu(zzdmq zzdmqVar, zzdlf zzdlfVar, zzcnq zzcnqVar, zzdgq zzdgqVar) {
        this.zza = zzdmqVar;
        this.zzb = zzdlfVar;
        this.zzc = zzcnqVar;
        this.zzd = zzdgqVar;
    }

    public final View zza() throws zzcet {
        zzcei zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzad("/sendMessageToSdk", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdho
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdhu.this.zzb((zzcei) obj, map);
            }
        });
        zza.zzad("/adMuted", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhp
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdhu.this.zzc((zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhq
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, final Map map) {
                final zzdhu zzdhuVar = zzdhu.this;
                ((zzcei) obj).zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdht
                    @Override // com.google.android.gms.internal.ads.zzcft
                    public final void zza(boolean z) {
                        zzdhu.this.zzd(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                if (TextUtils.isEmpty((String) map.get("baseUrl"))) {
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhr
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdhu.this.zze((zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhs
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdhu.this.zzf((zzcei) obj, map);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcei zzceiVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(zzcei zzceiVar, Map map) {
        zzbza.zzi("Showing native ads overlay.");
        zzceiVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcei zzceiVar, Map map) {
        zzbza.zzi("Hiding native ads overlay.");
        zzceiVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
