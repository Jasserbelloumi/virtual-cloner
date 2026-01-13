package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzzp implements zzaab {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzo zzc = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzzo zzd = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzm
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzzu.class).getConstructor(new Class[0]);
        }
    });
    @o0OO00OO
    private zzfqk zze;

    private final void zzc(int i, List list) {
        zzzu zzahcVar;
        switch (i) {
            case 0:
                zzahcVar = new zzahc();
                break;
            case 1:
                zzahcVar = new zzahf();
                break;
            case 2:
                zzahcVar = new zzahi(0);
                break;
            case 3:
                zzahcVar = new zzabj(0);
                break;
            case 4:
                zzzu zza2 = zzc.zza(0);
                if (zza2 == null) {
                    zzahcVar = new zzaca(0);
                    break;
                } else {
                    list.add(zza2);
                    return;
                }
            case 5:
                zzahcVar = new zzacd();
                break;
            case 6:
                zzahcVar = new zzaeu(0);
                break;
            case 7:
                zzahcVar = new zzafc(0);
                break;
            case 8:
                list.add(new zzafx(0, null));
                zzahcVar = new zzagc(0);
                break;
            case 9:
                zzahcVar = new zzagq();
                break;
            case 10:
                zzahcVar = new zzail();
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfqk.zzo();
                }
                zzahcVar = new zzaiv(1, new zzeu(0L), new zzahk(0, this.zze), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
                break;
            case 12:
                zzahcVar = new zzajh();
                break;
            case 13:
            default:
                return;
            case 14:
                zzahcVar = new zzaci();
                break;
            case 15:
                zzzu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                zzahcVar = new zzabo();
                break;
        }
        list.add(zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized zzzu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x030f, code lost:
        if (r10 == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0311, code lost:
        zzc(r10, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:114:0x019c, B:115:0x019f, B:213:0x0311, B:214:0x0314, B:216:0x0319, B:219:0x031f, B:220:0x0322, B:221:0x0325, B:118:0x01a8, B:120:0x01b0, B:123:0x01ba, B:126:0x01c6, B:128:0x01ce, B:131:0x01d8, B:134:0x01e3, B:137:0x01ee, B:140:0x01f9, B:142:0x0201, B:144:0x0209, B:147:0x0213, B:149:0x0221, B:152:0x022b, B:155:0x0236, B:157:0x023e, B:159:0x024c, B:161:0x025a, B:164:0x026a, B:166:0x0278, B:169:0x0282, B:171:0x028a, B:173:0x0292, B:175:0x029a, B:178:0x02a3, B:180:0x02ab, B:183:0x02ba, B:185:0x02c2, B:188:0x02cb, B:190:0x02d3, B:193:0x02dc, B:195:0x02e4, B:198:0x02ed, B:13:0x0042, B:14:0x004a, B:95:0x0172, B:16:0x004f, B:19:0x005b, B:22:0x0066, B:25:0x0072, B:28:0x007d, B:31:0x0088, B:34:0x0094, B:37:0x009f, B:40:0x00aa, B:43:0x00b6, B:46:0x00c2, B:49:0x00ce, B:52:0x00d9, B:55:0x00e4, B:58:0x00ef, B:61:0x00fb, B:64:0x0106, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0151, B:88:0x015c, B:91:0x0167), top: B:227:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a8 A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:114:0x019c, B:115:0x019f, B:213:0x0311, B:214:0x0314, B:216:0x0319, B:219:0x031f, B:220:0x0322, B:221:0x0325, B:118:0x01a8, B:120:0x01b0, B:123:0x01ba, B:126:0x01c6, B:128:0x01ce, B:131:0x01d8, B:134:0x01e3, B:137:0x01ee, B:140:0x01f9, B:142:0x0201, B:144:0x0209, B:147:0x0213, B:149:0x0221, B:152:0x022b, B:155:0x0236, B:157:0x023e, B:159:0x024c, B:161:0x025a, B:164:0x026a, B:166:0x0278, B:169:0x0282, B:171:0x028a, B:173:0x0292, B:175:0x029a, B:178:0x02a3, B:180:0x02ab, B:183:0x02ba, B:185:0x02c2, B:188:0x02cb, B:190:0x02d3, B:193:0x02dc, B:195:0x02e4, B:198:0x02ed, B:13:0x0042, B:14:0x004a, B:95:0x0172, B:16:0x004f, B:19:0x005b, B:22:0x0066, B:25:0x0072, B:28:0x007d, B:31:0x0088, B:34:0x0094, B:37:0x009f, B:40:0x00aa, B:43:0x00b6, B:46:0x00c2, B:49:0x00ce, B:52:0x00d9, B:55:0x00e4, B:58:0x00ef, B:61:0x00fb, B:64:0x0106, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0151, B:88:0x015c, B:91:0x0167), top: B:227:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0319 A[Catch: all -> 0x0333, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:114:0x019c, B:115:0x019f, B:213:0x0311, B:214:0x0314, B:216:0x0319, B:219:0x031f, B:220:0x0322, B:221:0x0325, B:118:0x01a8, B:120:0x01b0, B:123:0x01ba, B:126:0x01c6, B:128:0x01ce, B:131:0x01d8, B:134:0x01e3, B:137:0x01ee, B:140:0x01f9, B:142:0x0201, B:144:0x0209, B:147:0x0213, B:149:0x0221, B:152:0x022b, B:155:0x0236, B:157:0x023e, B:159:0x024c, B:161:0x025a, B:164:0x026a, B:166:0x0278, B:169:0x0282, B:171:0x028a, B:173:0x0292, B:175:0x029a, B:178:0x02a3, B:180:0x02ab, B:183:0x02ba, B:185:0x02c2, B:188:0x02cb, B:190:0x02d3, B:193:0x02dc, B:195:0x02e4, B:198:0x02ed, B:13:0x0042, B:14:0x004a, B:95:0x0172, B:16:0x004f, B:19:0x005b, B:22:0x0066, B:25:0x0072, B:28:0x007d, B:31:0x0088, B:34:0x0094, B:37:0x009f, B:40:0x00aa, B:43:0x00b6, B:46:0x00c2, B:49:0x00ce, B:52:0x00d9, B:55:0x00e4, B:58:0x00ef, B:61:0x00fb, B:64:0x0106, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0151, B:88:0x015c, B:91:0x0167), top: B:227:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzaab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzzu[] zzb(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzzu[]");
    }
}
