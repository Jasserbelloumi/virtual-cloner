package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(29)
/* loaded from: classes2.dex */
public final class zzpd {
    public final /* synthetic */ zzpf zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack$StreamEventCallback zzc;

    public zzpd(zzpf zzpfVar) {
        this.zza = zzpfVar;
        this.zzc = new zzpc(this, zzpfVar);
    }

    public final void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzpb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
