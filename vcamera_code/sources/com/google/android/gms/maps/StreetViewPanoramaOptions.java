package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzap();
    @o0OO00OO
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", id = 2)
    private StreetViewPanoramaCamera zza;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPanoramaId", id = 3)
    private String zzb;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPosition", id = 4)
    private LatLng zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getRadius", id = 5)
    private Integer zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", id = 6, type = "byte")
    private Boolean zze;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", id = 7, type = "byte")
    private Boolean zzf;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzg;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzh;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", id = 10, type = "byte")
    private Boolean zzi;
    @SafeParcelable.Field(getter = "getSource", id = 11)
    private StreetViewSource zzj;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(id = 2) @o0OO00OO StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(id = 3) @o0OO00OO String str, @SafeParcelable.Param(id = 4) @o0OO00OO LatLng latLng, @SafeParcelable.Param(id = 5) @o0OO00OO Integer num, @SafeParcelable.Param(id = 6) byte b, @SafeParcelable.Param(id = 7) byte b2, @SafeParcelable.Param(id = 8) byte b3, @SafeParcelable.Param(id = 9) byte b4, @SafeParcelable.Param(id = 10) byte b5, @SafeParcelable.Param(id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzj = streetViewSource;
    }

    @o0OO00OO
    public Boolean getPanningGesturesEnabled() {
        return this.zzg;
    }

    @o0OO00OO
    public String getPanoramaId() {
        return this.zzb;
    }

    @o0OO00OO
    public LatLng getPosition() {
        return this.zzc;
    }

    @o0OO00OO
    public Integer getRadius() {
        return this.zzd;
    }

    @oo0oO0
    public StreetViewSource getSource() {
        return this.zzj;
    }

    @o0OO00OO
    public Boolean getStreetNamesEnabled() {
        return this.zzh;
    }

    @o0OO00OO
    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zza;
    }

    @o0OO00OO
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzi;
    }

    @o0OO00OO
    public Boolean getUserNavigationEnabled() {
        return this.zze;
    }

    @o0OO00OO
    public Boolean getZoomGesturesEnabled() {
        return this.zzf;
    }

    @oo0oO0
    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions panoramaCamera(@o0OO00OO StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza = streetViewPanoramaCamera;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions panoramaId(@o0OO00OO String str) {
        this.zzb = str;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions position(@o0OO00OO LatLng latLng) {
        this.zzc = latLng;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions position(@o0OO00OO LatLng latLng, @oo0oO0 StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzj = streetViewSource;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions position(@o0OO00OO LatLng latLng, @o0OO00OO Integer num) {
        this.zzc = latLng;
        this.zzd = num;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions position(@o0OO00OO LatLng latLng, @o0OO00OO Integer num, @oo0oO0 StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzd = num;
        this.zzj = streetViewSource;
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.zzb).add("Position", this.zzc).add("Radius", this.zzd).add("Source", this.zzj).add("StreetViewPanoramaCamera", this.zza).add("UserNavigationEnabled", this.zze).add("ZoomGesturesEnabled", this.zzf).add("PanningGesturesEnabled", this.zzg).add("StreetNamesEnabled", this.zzh).add("UseViewLifecycleInFragment", this.zzi).toString();
    }

    @oo0oO0
    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zze = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }
}
