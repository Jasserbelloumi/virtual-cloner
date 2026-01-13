package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import o0Oo0o00.o0;
import org.videolan.libvlc.RendererDiscoverer;
/* loaded from: classes2.dex */
final class zzaje implements zzajf {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, o0.f16335o00oOooO, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, RendererDiscoverer.Event.ItemAdded, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzzx zzc;
    private final zzabb zzd;
    private final zzaji zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaje(zzzx zzzxVar, zzabb zzabbVar, zzaji zzajiVar) throws zzbu {
        this.zzc = zzzxVar;
        this.zzd = zzabbVar;
        this.zze = zzajiVar;
        int max = Math.max(1, zzajiVar.zzc / 10);
        this.zzi = max;
        zzen zzenVar = new zzen(zzajiVar.zzf);
        zzenVar.zzi();
        int zzi = zzenVar.zzi();
        this.zzf = zzi;
        int i = zzajiVar.zzb;
        int o00oOOo02 = com.github.megatronking.stringfog.o00oOOo0.o00oOOo0(zzajiVar.zzd - (i * 4), 8, zzajiVar.zze * i, 1);
        if (zzi != o00oOOo02) {
            throw zzbu.zza("Expected frames per block: " + o00oOOo02 + "; got: " + zzi, null);
        }
        int zze = zzew.zze(max, zzi);
        this.zzg = new byte[zzajiVar.zzd * zze];
        this.zzh = new zzen((zzi + zzi) * i * zze);
        int i2 = ((zzajiVar.zzc * zzajiVar.zzd) * 8) / zzi;
        zzad zzadVar = new zzad();
        zzadVar.zzS(MimeTypes.AUDIO_RAW);
        zzadVar.zzv(i2);
        zzadVar.zzO(i2);
        zzadVar.zzL((max + max) * i);
        zzadVar.zzw(zzajiVar.zzb);
        zzadVar.zzT(zzajiVar.zzc);
        zzadVar.zzN(2);
        this.zzj = zzadVar.zzY();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzw = this.zzl + zzew.zzw(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i);
        this.zzd.zzs(zzw, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(int i, long j) {
        this.zzc.zzN(new zzajl(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:4:0x001e). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzajf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaje.zzc(com.google.android.gms.internal.ads.zzzv, long):boolean");
    }
}
