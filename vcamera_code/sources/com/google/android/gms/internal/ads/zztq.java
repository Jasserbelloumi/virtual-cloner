package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zztq implements zzxc, zzsh {
    public final /* synthetic */ zztv zza;
    private final Uri zzc;
    private final zzgh zzd;
    private final zztl zze;
    private final zzzx zzf;
    private final zzdo zzg;
    private volatile boolean zzi;
    private long zzk;
    @o0OO00OO
    private zzabb zzm;
    private boolean zzn;
    private final zzaau zzh = new zzaau();
    private boolean zzj = true;
    private final long zzb = zzsj.zza();
    private zzfl zzl = zzi(0);

    public zztq(zztv zztvVar, Uri uri, zzfg zzfgVar, zztl zztlVar, zzzx zzzxVar, zzdo zzdoVar) {
        this.zza = zztvVar;
        this.zzc = uri;
        this.zzd = new zzgh(zzfgVar);
        this.zze = zztlVar;
        this.zzf = zzzxVar;
        this.zzg = zzdoVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zztq zztqVar) {
        return zztqVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzc(zztq zztqVar) {
        return zztqVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzfl zzd(zztq zztqVar) {
        return zztqVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzgh zze(zztq zztqVar) {
        return zztqVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzf(zztq zztqVar, long j, long j2) {
        zztqVar.zzh.zza = j;
        zztqVar.zzk = j2;
        zztqVar.zzj = true;
        zztqVar.zzn = false;
    }

    private final zzfl zzi(long j) {
        Map map;
        zzfj zzfjVar = new zzfj();
        zzfjVar.zzd(this.zzc);
        zzfjVar.zzc(j);
        zzfjVar.zza(6);
        map = zztv.zzb;
        zzfjVar.zzb(map);
        return zzfjVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(zzen zzenVar) {
        long zzQ;
        long max;
        if (this.zzn) {
            zzQ = this.zza.zzQ(true);
            max = Math.max(zzQ, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzenVar.zza();
        zzabb zzabbVar = this.zzm;
        zzabbVar.getClass();
        zzaaz.zzb(zzabbVar, zzenVar, zza);
        zzabbVar.zzs(max, 1, zza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0082 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0098 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ae A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00c4 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00e0 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0116 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x012a A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x016a A[Catch: all -> 0x01e9, TryCatch #5 {all -> 0x01e9, blocks: (B:195:0x015f, B:197:0x016a, B:198:0x016f, B:200:0x0173), top: B:255:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0173 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #5 {all -> 0x01e9, blocks: (B:195:0x015f, B:197:0x016a, B:198:0x016f, B:200:0x0173), top: B:255:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01c7 A[EDGE_INSN: B:265:0x01c7->B:220:0x01c7 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zzh():void");
    }
}
