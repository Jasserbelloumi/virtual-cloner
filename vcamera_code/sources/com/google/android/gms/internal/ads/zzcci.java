package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzcci implements zzbhp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzbyt.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Parse pixels for ", str, ", got string ", str2, ", int ");
            o00oOOo02.append(i);
            o00oOOo02.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(o00oOOo02.toString());
        }
        return i;
    }

    private static void zzc(zzcax zzcaxVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcaxVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbza.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcaxVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcaxVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcaxVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcaxVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03d9, code lost:
        if (r3 == (-1)) goto L195;
     */
    @Override // com.google.android.gms.internal.ads.zzbhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcci.zza(java.lang.Object, java.util.Map):void");
    }
}
