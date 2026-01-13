package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class zzbqb implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbqc zza;

    public zzbqb(zzbqc zzbqcVar) {
        this.zza = zzbqcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
