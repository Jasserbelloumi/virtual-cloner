package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgx implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ zzgz zza;
    private final Handler zzb;

    public zzgx(zzgz zzgzVar, Handler handler) {
        this.zza = zzgzVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgw
            @Override // java.lang.Runnable
            public final void run() {
                zzgx zzgxVar = zzgx.this;
                zzgz.zzc(zzgxVar.zza, i);
            }
        });
    }
}
