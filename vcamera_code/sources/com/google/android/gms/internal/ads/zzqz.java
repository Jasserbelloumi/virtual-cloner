package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.fragment.app.o0O00;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzqz extends Exception {
    public final String zza;
    public final boolean zzb;
    @o0OO00OO
    public final zzqx zzc;
    @o0OO00OO
    public final String zzd;
    @o0OO00OO
    public final zzqz zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzqz(com.google.android.gms.internal.ads.zzaf r11, @o00oOooO.o0OO00OO java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r11.zzm
            int r11 = java.lang.Math.abs(r14)
            java.lang.String r13 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            java.lang.String r8 = android.support.v4.media.o00oOOo0.o00oOOo0(r13, r11)
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqz.<init>(com.google.android.gms.internal.ads.zzaf, java.lang.Throwable, boolean, int):void");
    }

    private zzqz(String str, @o0OO00OO Throwable th, String str2, boolean z, @o0OO00OO zzqx zzqxVar, @o0OO00OO String str3, @o0OO00OO zzqz zzqzVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqxVar;
        this.zzd = str3;
        this.zze = zzqzVar;
    }

    public static /* bridge */ /* synthetic */ zzqz zza(zzqz zzqzVar, zzqz zzqzVar2) {
        return new zzqz(zzqzVar.getMessage(), zzqzVar.getCause(), zzqzVar.zza, false, zzqzVar.zzc, zzqzVar.zzd, zzqzVar2);
    }

    public zzqz(zzaf zzafVar, @o0OO00OO Throwable th, boolean z, zzqx zzqxVar) {
        this(o0O00.o00oOOo0("Decoder init failed: ", zzqxVar.zza, ", ", String.valueOf(zzafVar)), th, zzafVar.zzm, false, zzqxVar, (zzew.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }
}
