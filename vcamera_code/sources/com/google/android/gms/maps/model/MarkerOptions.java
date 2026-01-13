package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng zza;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;
    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float zze;
    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float zzf;
    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;
    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean zzi;
    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float zzj;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float zzk;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float zzl;
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;
    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) @o0OO00OO IBinder iBinder, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) float f3, @SafeParcelable.Param(id = 12) float f4, @SafeParcelable.Param(id = 13) float f5, @SafeParcelable.Param(id = 14) float f6, @SafeParcelable.Param(id = 15) float f7) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
    }

    @oo0oO0
    public MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }

    @oo0oO0
    public MarkerOptions anchor(float f, float f2) {
        this.zze = f;
        this.zzf = f2;
        return this;
    }

    @oo0oO0
    public MarkerOptions draggable(boolean z) {
        this.zzg = z;
        return this;
    }

    @oo0oO0
    public MarkerOptions flat(boolean z) {
        this.zzi = z;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    @o0OO00OO
    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    @oo0oO0
    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    @o0OO00OO
    public String getSnippet() {
        return this.zzc;
    }

    @o0OO00OO
    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @oo0oO0
    public MarkerOptions icon(@o0OO00OO BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    @oo0oO0
    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzk = f;
        this.zzl = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @oo0oO0
    public MarkerOptions position(@oo0oO0 LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @oo0oO0
    public MarkerOptions rotation(float f) {
        this.zzj = f;
        return this;
    }

    @oo0oO0
    public MarkerOptions snippet(@o0OO00OO String str) {
        this.zzc = str;
        return this;
    }

    @oo0oO0
    public MarkerOptions title(@o0OO00OO String str) {
        this.zzb = str;
        return this;
    }

    @oo0oO0
    public MarkerOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }
}
