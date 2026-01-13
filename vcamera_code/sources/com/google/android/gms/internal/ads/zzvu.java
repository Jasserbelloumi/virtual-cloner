package com.google.android.gms.internal.ads;

import android.media.Spatializer;
/* loaded from: classes2.dex */
final class zzvu implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ zzwc zza;

    public zzvu(zzvv zzvvVar, zzwc zzwcVar) {
        this.zza = zzwcVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zzwc.zzg(this.zza);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zzwc.zzg(this.zza);
    }
}
