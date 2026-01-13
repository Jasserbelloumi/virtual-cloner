package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcen implements zzfuf {
    public final /* synthetic */ List zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Uri zzc;
    public final /* synthetic */ zzcep zzd;

    public zzcen(zzcep zzcepVar, List list, String str, Uri uri) {
        this.zzd = zzcepVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzbza.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzP((Map) obj, this.zza, this.zzb);
    }
}
