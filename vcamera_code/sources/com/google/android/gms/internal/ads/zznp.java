package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.OpusUtil;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(29)
/* loaded from: classes2.dex */
public final class zznp {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @o0O0O0Oo
    public static int zza(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzew.zzj(i3)).build(), zza);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    @o0O0O0Oo
    public static int[] zzb() {
        zzfqn zzfqnVar;
        boolean isDirectPlaybackSupported;
        zzfqh zzi = zzfqk.zzi();
        zzfqnVar = zznq.zzc;
        zzfsj it = zzfqnVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), zza);
            if (isDirectPlaybackSupported) {
                zzi.zzf(Integer.valueOf(intValue));
            }
        }
        zzi.zzf((Object) 2);
        Object[] array = zzi.zzi().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
