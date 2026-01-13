package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes2.dex */
public interface zzqu {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @o0OO00OO
    ByteBuffer zzf(int i);

    @o0OO00OO
    ByteBuffer zzg(int i);

    void zzi();

    void zzj(int i, int i2, int i3, long j, int i4);

    void zzk(int i, int i2, zzgo zzgoVar, long j, int i3);

    void zzl();

    @o0OOooO0(21)
    void zzm(int i, long j);

    void zzn(int i, boolean z);

    @o0OOooO0(23)
    void zzo(Surface surface);

    @o0OOooO0(19)
    void zzp(Bundle bundle);

    void zzq(int i);

    boolean zzr();
}
