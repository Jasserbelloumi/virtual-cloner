package com.google.android.gms.internal.ads;

import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
/* loaded from: classes2.dex */
public final class zzhj extends zzbw {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzhi
    };
    private static final String zzl = zzew.zzP(1001);
    private static final String zzm = zzew.zzP(1002);
    private static final String zzn = zzew.zzP(1003);
    private static final String zzo = zzew.zzP(1004);
    private static final String zzp = zzew.zzP(1005);
    private static final String zzq = zzew.zzP(1006);
    public final int zze;
    @o0OO00OO
    public final String zzf;
    public final int zzg;
    @o0OO00OO
    public final zzaf zzh;
    public final int zzi;
    @o0OO00OO
    public final zzbn zzj;
    public final boolean zzk;

    private zzhj(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzhj(int r14, @o00oOooO.o0OO00OO java.lang.Throwable r15, @o00oOooO.o0OO00OO java.lang.String r16, int r17, @o00oOooO.o0OO00OO java.lang.String r18, int r19, @o00oOooO.o0OO00OO com.google.android.gms.internal.ads.zzaf r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L38
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L3e
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzew.zzM(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            java.lang.String r0 = android.support.v4.media.o00oOOoO.o00oOOo0(r2, r0, r1)
            goto L3e
        L38:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L3e:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L4b:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhj.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzaf, int, boolean):void");
    }

    private zzhj(String str, @o0OO00OO Throwable th, int i, int i2, @o0OO00OO String str2, int i3, @o0OO00OO zzaf zzafVar, int i4, @o0OO00OO zzbn zzbnVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5 = i2;
        if (!z) {
            z2 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzdl.zzd(z2);
        zzdl.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzafVar;
        this.zzi = i4;
        this.zzj = zzbnVar;
        this.zzk = z;
    }

    public static zzhj zzb(Throwable th, String str, int i, @o0OO00OO zzaf zzafVar, int i2, boolean z, int i3) {
        return new zzhj(1, th, null, i3, str, i, zzafVar, zzafVar == null ? 4 : i2, z);
    }

    public static zzhj zzc(IOException iOException, int i) {
        return new zzhj(0, iOException, i);
    }

    public static zzhj zzd(RuntimeException runtimeException, int i) {
        return new zzhj(2, runtimeException, i);
    }

    @o0OoO00O
    public final zzhj zza(@o0OO00OO zzbn zzbnVar) {
        String message = getMessage();
        int i = zzew.zza;
        return new zzhj(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbnVar, this.zzc, this.zzk);
    }
}
