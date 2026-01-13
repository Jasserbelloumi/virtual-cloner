package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
/* loaded from: classes.dex */
final class zzau implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzav zza;

    public zzau(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzR(this.zza.zza, Uri.parse("="));
    }
}
