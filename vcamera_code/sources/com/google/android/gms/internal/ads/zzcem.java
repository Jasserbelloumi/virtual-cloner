package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzcem implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzbwb zza;
    public final /* synthetic */ zzcep zzb;

    public zzcem(zzcep zzcepVar, zzbwb zzbwbVar) {
        this.zzb = zzcepVar;
        this.zza = zzbwbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
