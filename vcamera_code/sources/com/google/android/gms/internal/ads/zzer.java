package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzer implements zzdu {
    @o0OO00OO
    private Message zza;
    @o0OO00OO
    private zzes zzb;

    private zzer() {
    }

    public /* synthetic */ zzer(zzeq zzeqVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzes.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzer zzb(Message message, zzes zzesVar) {
        this.zza = message;
        this.zzb = zzesVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
