package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0o0000;
@o0o0000
/* loaded from: classes2.dex */
final class zzalh {
    public long zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzalh(java.lang.String r14, com.google.android.gms.internal.ads.zzajx r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzakg r11 = new com.google.android.gms.internal.ads.zzakg
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalh.<init>(java.lang.String, com.google.android.gms.internal.ads.zzajx):void");
    }

    private zzalh(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    public static zzalh zza(zzali zzaliVar) throws IOException {
        if (zzalk.zze(zzaliVar) == 538247942) {
            String zzh = zzalk.zzh(zzaliVar);
            String zzh2 = zzalk.zzh(zzaliVar);
            long zzf = zzalk.zzf(zzaliVar);
            long zzf2 = zzalk.zzf(zzaliVar);
            long zzf3 = zzalk.zzf(zzaliVar);
            long zzf4 = zzalk.zzf(zzaliVar);
            int zze = zzalk.zze(zzaliVar);
            if (zze >= 0) {
                List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
                for (int i = 0; i < zze; i++) {
                    emptyList.add(new zzakg(zzalk.zzh(zzaliVar).intern(), zzalk.zzh(zzaliVar).intern()));
                }
                return new zzalh(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
            }
            throw new IOException(android.support.v4.media.o00oOOo0.o00oOOo0("readHeaderList size=", zze));
        }
        throw new IOException();
    }
}
