package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class zzboj implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbdl zzg;
    private final boolean zzi;
    private final String zzk;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzboj(@o0OO00OO Date date, int i, @o0OO00OO Set set, @o0OO00OO Location location, boolean z, int i2, zzbdl zzbdlVar, List list, boolean z2, int i3, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbdlVar;
        this.zzi = z2;
        this.zzk = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.zzj;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.zzh.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzbdl zzbdlVar = this.zzg;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbdlVar != null) {
            int i = zzbdlVar.zza;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        builder.setRequestCustomMuteThisAd(zzbdlVar.zzg);
                        builder.setMediaAspectRatio(zzbdlVar.zzh);
                    }
                    builder.setReturnUrlsForImageAssets(zzbdlVar.zzb);
                    builder.setImageOrientation(zzbdlVar.zzc);
                    builder.setRequestMultipleImages(zzbdlVar.zzd);
                }
                com.google.android.gms.ads.internal.client.zzfl zzflVar = zzbdlVar.zzf;
                if (zzflVar != null) {
                    builder.setVideoOptions(new VideoOptions(zzflVar));
                }
            }
            builder.setAdChoicesPlacement(zzbdlVar.zze);
            builder.setReturnUrlsForImageAssets(zzbdlVar.zzb);
            builder.setImageOrientation(zzbdlVar.zzc);
            builder.setRequestMultipleImages(zzbdlVar.zzd);
        }
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @oo0oO0
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbdl.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzej.zzf().zzw();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
