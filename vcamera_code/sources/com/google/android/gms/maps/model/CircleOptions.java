package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();
    @o0OO00OO
    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng zza;
    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double zzb;
    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzc;
    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int zzd;
    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int zze;
    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzf;
    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean zzh;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d, @SafeParcelable.Param(id = 4) float f, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) @o0OO00OO List list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }

    @oo0oO0
    public CircleOptions center(@oo0oO0 LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    @oo0oO0
    public CircleOptions clickable(boolean z) {
        this.zzh = z;
        return this;
    }

    @oo0oO0
    public CircleOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    @o0OO00OO
    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    @o0OO00OO
    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @oo0oO0
    public CircleOptions radius(double d) {
        this.zzb = d;
        return this;
    }

    @oo0oO0
    public CircleOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    @oo0oO0
    public CircleOptions strokePattern(@o0OO00OO List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    @oo0oO0
    public CircleOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    @oo0oO0
    public CircleOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public CircleOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }
}
