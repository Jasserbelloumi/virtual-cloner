package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
/* loaded from: classes2.dex */
final class zzpc extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ zzpf zza;
    public final /* synthetic */ zzpd zzb;

    public zzpc(zzpd zzpdVar, zzpf zzpfVar) {
        this.zzb = zzpdVar;
        this.zza = zzpfVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzof zzofVar;
        boolean z;
        zzof zzofVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzpf zzpfVar = this.zzb.zza;
            zzofVar = zzpfVar.zzq;
            if (zzofVar != null) {
                z = zzpfVar.zzP;
                if (z) {
                    zzofVar2 = zzpfVar.zzq;
                    zzofVar2.zzb();
                }
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzof zzofVar;
        boolean z;
        zzof zzofVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzpf zzpfVar = this.zzb.zza;
            zzofVar = zzpfVar.zzq;
            if (zzofVar != null) {
                z = zzpfVar.zzP;
                if (z) {
                    zzofVar2 = zzpfVar.zzq;
                    zzofVar2.zzb();
                }
            }
        }
    }
}
