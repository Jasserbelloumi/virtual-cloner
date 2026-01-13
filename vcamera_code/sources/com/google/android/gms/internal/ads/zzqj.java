package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzqj extends Handler {
    public final /* synthetic */ zzql zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqj(zzql zzqlVar, Looper looper) {
        super(looper);
        this.zza = zzqlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzql.zza(this.zza, message);
    }
}
