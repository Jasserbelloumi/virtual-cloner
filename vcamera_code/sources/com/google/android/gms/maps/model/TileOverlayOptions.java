package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzal;
import com.google.android.gms.internal.maps.zzam;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzac();
    @o0OO00OO
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzam zza;
    @o0OO00OO
    private TileProvider zzb;
    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;
    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) float f2) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzam zzc = zzal.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzaa(this);
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }

    @oo0oO0
    public TileOverlayOptions fadeIn(boolean z) {
        this.zze = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @o0OO00OO
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @oo0oO0
    public TileOverlayOptions tileProvider(@oo0oO0 TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzab(this, tileProvider);
        return this;
    }

    @oo0oO0
    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.zzf = f;
        return this;
    }

    @oo0oO0
    public TileOverlayOptions visible(boolean z) {
        this.zzc = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzam zzamVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzamVar == null ? null : zzamVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public TileOverlayOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }
}
