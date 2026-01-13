package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzdiw {
    private final zzfuu zza;
    private final zzdjj zzb;
    private final zzdjo zzc;

    public zzdiw(zzfuu zzfuuVar, zzdjj zzdjjVar, zzdjo zzdjoVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdjjVar;
        this.zzc = zzdjoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfut zza(final com.google.android.gms.internal.ads.zzeyo r16, final com.google.android.gms.internal.ads.zzeyc r17, final org.json.JSONObject r18) {
        /*
            r15 = this;
            r12 = r15
            r0 = r16
            r1 = r17
            r7 = r18
            com.google.android.gms.internal.ads.zzfuu r2 = r12.zza
            com.google.android.gms.internal.ads.zzdiu r3 = new com.google.android.gms.internal.ads.zzdiu
            r3.<init>()
            com.google.android.gms.internal.ads.zzfut r2 = r2.zzb(r3)
            com.google.android.gms.internal.ads.zzdjj r3 = r12.zzb
            java.lang.String r4 = "images"
            com.google.android.gms.internal.ads.zzfut r3 = r3.zzf(r7, r4)
            com.google.android.gms.internal.ads.zzdjj r5 = r12.zzb
            com.google.android.gms.internal.ads.zzeyn r6 = r0.zzb
            com.google.android.gms.internal.ads.zzeyf r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfut r9 = r5.zzg(r7, r4, r1, r6)
            com.google.android.gms.internal.ads.zzdjj r4 = r12.zzb
            java.lang.String r5 = "secondary_image"
            com.google.android.gms.internal.ads.zzfut r5 = r4.zze(r7, r5)
            com.google.android.gms.internal.ads.zzdjj r4 = r12.zzb
            java.lang.String r6 = "app_icon"
            com.google.android.gms.internal.ads.zzfut r4 = r4.zze(r7, r6)
            com.google.android.gms.internal.ads.zzdjj r6 = r12.zzb
            java.lang.String r8 = "attribution"
            com.google.android.gms.internal.ads.zzfut r6 = r6.zzd(r7, r8)
            com.google.android.gms.internal.ads.zzdjj r8 = r12.zzb
            com.google.android.gms.internal.ads.zzeyn r0 = r0.zzb
            com.google.android.gms.internal.ads.zzeyf r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfut r8 = r8.zzh(r7, r1, r0)
            com.google.android.gms.internal.ads.zzdjo r0 = r12.zzc
            java.lang.String r1 = "custom_assets"
            com.google.android.gms.internal.ads.zzfut r11 = r0.zza(r7, r1)
            com.google.android.gms.internal.ads.zzdjj r0 = r12.zzb
            java.lang.String r1 = "enable_omid"
            boolean r1 = r7.optBoolean(r1)
            r10 = 0
            if (r1 != 0) goto L5f
        L59:
            com.google.android.gms.internal.ads.zzfut r0 = com.google.android.gms.internal.ads.zzfuj.zzh(r10)
        L5d:
            r10 = r0
            goto L85
        L5f:
            java.lang.String r1 = "omid_settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 != 0) goto L68
            goto L59
        L68:
            java.lang.String r13 = "omid_html"
            java.lang.String r1 = r1.optString(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r1)
            if (r13 == 0) goto L75
            goto L59
        L75:
            com.google.android.gms.internal.ads.zzfut r10 = com.google.android.gms.internal.ads.zzfuj.zzh(r10)
            com.google.android.gms.internal.ads.zzdiy r13 = new com.google.android.gms.internal.ads.zzdiy
            r13.<init>()
            com.google.android.gms.internal.ads.zzfuu r0 = com.google.android.gms.internal.ads.zzbzn.zze
            com.google.android.gms.internal.ads.zzfut r0 = com.google.android.gms.internal.ads.zzfuj.zzm(r10, r13, r0)
            goto L5d
        L85:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r0.add(r3)
            r0.add(r9)
            r0.add(r5)
            r0.add(r4)
            r0.add(r6)
            r0.add(r8)
            r0.add(r11)
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzeI
            com.google.android.gms.internal.ads.zzbap r13 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r13.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb7
            r0.add(r10)
        Lb7:
            com.google.android.gms.internal.ads.zzfui r13 = com.google.android.gms.internal.ads.zzfuj.zza(r0)
            com.google.android.gms.internal.ads.zzdiv r14 = new com.google.android.gms.internal.ads.zzdiv
            r0 = r14
            r1 = r15
            r7 = r18
            r0.<init>()
            com.google.android.gms.internal.ads.zzfuu r0 = r12.zza
            com.google.android.gms.internal.ads.zzfut r0 = r13.zza(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdiw.zza(com.google.android.gms.internal.ads.zzeyo, com.google.android.gms.internal.ads.zzeyc, org.json.JSONObject):com.google.android.gms.internal.ads.zzfut");
    }
}
