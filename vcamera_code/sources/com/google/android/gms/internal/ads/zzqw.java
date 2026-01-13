package com.google.android.gms.internal.ads;

import android.annotation.NonNull;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import java.util.List;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
@o0OOooO0(29)
/* loaded from: classes2.dex */
final class zzqw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint] */
    @o0O0O0Oo
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, final int i, final int i2, double d) {
        List<MediaCodecInfo$VideoCapabilities$PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        final int i3 = (int) d;
        ?? r6 = new Object(i, i2, i3) { // from class: android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ boolean covers(@NonNull MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint);
        };
        for (int i4 = 0; i4 < supportedPerformancePoints.size(); i4++) {
            if (supportedPerformancePoints.get(i4).covers(r6)) {
                return 2;
            }
        }
        return 1;
    }
}
