package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class zzbpw implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbpx zza;

    public zzbpw(zzbpx zzbpxVar) {
        this.zza = zzbpxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
