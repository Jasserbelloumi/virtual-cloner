package com.google.android.gms.maps;
/* loaded from: classes2.dex */
final class zzs extends com.google.android.gms.maps.internal.zzj {
    public final /* synthetic */ LocationSource zza;

    public zzs(GoogleMap googleMap, LocationSource locationSource) {
        this.zza = locationSource;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza.activate(new zzl(this, zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.zza.deactivate();
    }
}
