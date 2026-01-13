package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzal;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzab extends zzal {
    public final /* synthetic */ TileProvider zza;

    public zzab(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    @o0OO00OO
    public final Tile zzb(int i, int i2, int i3) {
        return this.zza.getTile(i, i2, i3);
    }
}
