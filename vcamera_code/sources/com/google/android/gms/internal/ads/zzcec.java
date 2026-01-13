package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* loaded from: classes2.dex */
final class zzcec implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult zza;

    public zzcec(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.confirm();
    }
}
