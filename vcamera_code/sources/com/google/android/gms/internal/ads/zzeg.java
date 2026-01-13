package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzeg {
    public static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(android.support.v4.media.o00oOOo0.o00oOOo0("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
