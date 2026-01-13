package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzfn implements zzfg {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfg zzc;
    @o0OO00OO
    private zzfg zzd;
    @o0OO00OO
    private zzfg zze;
    @o0OO00OO
    private zzfg zzf;
    @o0OO00OO
    private zzfg zzg;
    @o0OO00OO
    private zzfg zzh;
    @o0OO00OO
    private zzfg zzi;
    @o0OO00OO
    private zzfg zzj;
    @o0OO00OO
    private zzfg zzk;

    public zzfn(Context context, zzfg zzfgVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfgVar;
    }

    private final zzfg zzg() {
        if (this.zze == null) {
            zzez zzezVar = new zzez(this.zza);
            this.zze = zzezVar;
            zzh(zzezVar);
        }
        return this.zze;
    }

    private final void zzh(zzfg zzfgVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfgVar.zzf((zzgi) this.zzb.get(i));
        }
    }

    private static final void zzi(@o0OO00OO zzfg zzfgVar, zzgi zzgiVar) {
        if (zzfgVar != null) {
            zzfgVar.zzf(zzgiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzfg zzfgVar = this.zzk;
        zzfgVar.getClass();
        return zzfgVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        zzfg zzfgVar;
        zzdl.zzf(this.zzk == null);
        String scheme = zzflVar.zza.getScheme();
        if (zzew.zzX(zzflVar.zza)) {
            String path = zzflVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfw zzfwVar = new zzfw();
                    this.zzd = zzfwVar;
                    zzh(zzfwVar);
                }
                zzfgVar = this.zzd;
                this.zzk = zzfgVar;
                return this.zzk.zzb(zzflVar);
            }
            zzfgVar = zzg();
            this.zzk = zzfgVar;
            return this.zzk.zzb(zzflVar);
        }
        if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.zzf == null) {
                    zzfd zzfdVar = new zzfd(this.zza);
                    this.zzf = zzfdVar;
                    zzh(zzfdVar);
                }
                zzfgVar = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzfg zzfgVar2 = (zzfg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.zzg = zzfgVar2;
                        zzh(zzfgVar2);
                    } catch (ClassNotFoundException unused) {
                        zzee.zze("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                zzfgVar = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzgk zzgkVar = new zzgk(2000);
                    this.zzh = zzgkVar;
                    zzh(zzgkVar);
                }
                zzfgVar = this.zzh;
            } else if ("data".equals(scheme)) {
                if (this.zzi == null) {
                    zzfe zzfeVar = new zzfe();
                    this.zzi = zzfeVar;
                    zzh(zzfeVar);
                }
                zzfgVar = this.zzi;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgg zzggVar = new zzgg(this.zza);
                    this.zzj = zzggVar;
                    zzh(zzggVar);
                }
                zzfgVar = this.zzj;
            } else {
                zzfgVar = this.zzc;
            }
            this.zzk = zzfgVar;
            return this.zzk.zzb(zzflVar);
        }
        zzfgVar = zzg();
        this.zzk = zzfgVar;
        return this.zzk.zzb(zzflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    @o0OO00OO
    public final Uri zzc() {
        zzfg zzfgVar = this.zzk;
        if (zzfgVar == null) {
            return null;
        }
        return zzfgVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws IOException {
        zzfg zzfgVar = this.zzk;
        if (zzfgVar != null) {
            try {
                zzfgVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        zzfg zzfgVar = this.zzk;
        return zzfgVar == null ? Collections.emptyMap() : zzfgVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
        zzgiVar.getClass();
        this.zzc.zzf(zzgiVar);
        this.zzb.add(zzgiVar);
        zzi(this.zzd, zzgiVar);
        zzi(this.zze, zzgiVar);
        zzi(this.zzf, zzgiVar);
        zzi(this.zzg, zzgiVar);
        zzi(this.zzh, zzgiVar);
        zzi(this.zzi, zzgiVar);
        zzi(this.zzj, zzgiVar);
    }
}
