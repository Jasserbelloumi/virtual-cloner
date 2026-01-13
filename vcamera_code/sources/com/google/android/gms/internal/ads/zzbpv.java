package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpv implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbpx zza;

    public zzbpv(zzbpx zzbpxVar) {
        this.zza = zzbpxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzQ(context, zzb);
    }
}
