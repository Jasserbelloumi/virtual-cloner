package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(32)
/* loaded from: classes2.dex */
public final class zzvv {
    private final Spatializer zza;
    private final boolean zzb;
    @o0OO00OO
    private Handler zzc;
    @o0OO00OO
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzvv(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    @o0OO00OO
    public static zzvv zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zzvv(audioManager.getSpatializer());
    }

    public final void zzb(zzwc zzwcVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzvu(this, zzwcVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzvt
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener == null || this.zzc == null) {
            return;
        }
        this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.zzc;
        int i = zzew.zza;
        handler.removeCallbacksAndMessages(null);
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean zzd(zzk zzkVar, zzaf zzafVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzew.zzj((MimeTypes.AUDIO_E_AC3_JOC.equals(zzafVar.zzm) && zzafVar.zzz == 16) ? 12 : zzafVar.zzz));
        int i = zzafVar.zzA;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.zza.canBeSpatialized(zzkVar.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
