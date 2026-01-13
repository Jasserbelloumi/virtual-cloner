package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzaas {
    public static int zza(ByteBuffer byteBuffer) {
        return (int) ((zzd(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzb(byte[] bArr) {
        return zzd(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zzc(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzf(zze(((bArr[11] & 255) << 8) | (bArr[10] & 255))));
        arrayList.add(zzf(zze(3840L)));
        return arrayList;
    }

    private static long zzd(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = b2 & 63;
        }
        int i5 = i2 >> 3;
        return i4 * (i5 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i : i5 >= 12 ? 10000 << (i & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i);
    }

    private static long zze(long j) {
        return (j * C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] zzf(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
