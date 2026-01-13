package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    @o0OO00OO
    public final MediaCodecInfo codecInfo;
    @o0OO00OO
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaCodecDecoderException(java.lang.Throwable r4, @o00oOooO.o0OO00OO com.google.android.exoplayer2.mediacodec.MediaCodecInfo r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Decoder failed: "
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            java.lang.String r2 = r5.name
        Ld:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.codecInfo = r5
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 21
            if (r5 < r0) goto L23
            java.lang.String r1 = getDiagnosticInfoV21(r4)
        L23:
            r3.diagnosticInfo = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, com.google.android.exoplayer2.mediacodec.MediaCodecInfo):void");
    }

    @o0OOooO0(21)
    @o0OO00OO
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
