package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class zzcda extends zzccu implements zzgi {
    private String zzd;
    private final zzcbi zze;
    private boolean zzf;
    private final zzccz zzg;
    private final zzccf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcda(zzcbj zzcbjVar, zzcbi zzcbiVar) {
        super(zzcbjVar);
        this.zze = zzcbiVar;
        this.zzg = new zzccz();
        this.zzh = new zzccf();
        this.zzk = new Object();
        this.zzl = (String) zzfnq.zzd(zzcbjVar != null ? zzcbjVar.zzbl() : null).zzb("");
        this.zzm = zzcbjVar != null ? zzcbjVar.zzf() : 0;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbyt.zze(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcba.zzs();
        int zzu = zzcba.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzfgVar instanceof zzft) {
            this.zzg.zzb((zzft) zzfgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzt(String str) {
        String str2;
        String str3;
        zzcda zzcdaVar;
        String str4;
        String str5 = str;
        this.zzd = str5;
        String zzm = zzm(str);
        int i = 0;
        try {
            zzfo zzfoVar = new zzfo();
            zzfoVar.zzf(this.zzb);
            zzfoVar.zzc(this.zze.zzd);
            zzfoVar.zzd(this.zze.zzf);
            zzfoVar.zzb(true);
            zzfoVar.zze(this);
            zzfg zza = zzfoVar.zza();
            if (this.zze.zzj) {
                zza = new zzccd(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzfl(Uri.parse(str)));
            zzcbj zzcbjVar = (zzcbj) this.zzc.get();
            if (zzcbjVar != null) {
                zzcbjVar.zzt(zzm, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzv)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            str2 = "error";
            long j = currentTimeMillis;
            while (true) {
                try {
                    int zza2 = zza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzj(str5, zzm, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    synchronized (this.zzk) {
                        try {
                            if (!this.zzf) {
                                str5 = null;
                                this.zzi.put(bArr, 0, zza2);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            zzcdaVar = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e = e;
                                        str4 = str2;
                                        String o00oOOo02 = android.support.v4.media.o00oOoO.o00oOOo0(e.getClass().getCanonicalName(), ":", e.getMessage());
                                        zzbza.zzj("Failed to preload url " + str3 + " Exception: " + o00oOOo02);
                                        zzcdaVar.zzg(str3, zzm, str4, o00oOOo02);
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzv();
                        return true;
                    }
                    try {
                        if (this.zzf) {
                            int limit = this.zzi.limit();
                            throw new IOException("Precache abort at " + limit + " bytes");
                        }
                        long currentTimeMillis2 = zzB.currentTimeMillis();
                        if (currentTimeMillis2 - j >= longValue) {
                            zzv();
                            j = currentTimeMillis2;
                        }
                        if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                            throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                        }
                        i = 0;
                        i2 = 8192;
                        str5 = str;
                    } catch (Exception e2) {
                        e = e2;
                        zzcdaVar = this;
                        str4 = str5;
                        str3 = str;
                        String o00oOOo022 = android.support.v4.media.o00oOoO.o00oOOo0(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzbza.zzj("Failed to preload url " + str3 + " Exception: " + o00oOOo022);
                        zzcdaVar.zzg(str3, zzm, str4, o00oOOo022);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str2;
                    String o00oOOo0222 = android.support.v4.media.o00oOoO.o00oOOo0(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzbza.zzj("Failed to preload url " + str3 + " Exception: " + o00oOOo0222);
                    zzcdaVar.zzg(str3, zzm, str4, o00oOOo0222);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "error";
        }
    }
}
