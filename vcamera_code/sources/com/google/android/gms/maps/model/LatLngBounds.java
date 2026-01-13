package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzf();
    @oo0oO0
    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;
    @oo0oO0
    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        @oo0oO0
        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        @oo0oO0
        public Builder include(@oo0oO0 LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d = latLng.longitude;
            if (!Double.isNaN(this.zzc)) {
                double d2 = this.zzc;
                double d3 = this.zzd;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.zzc = d;
                    }
                }
                return this;
            }
            this.zzc = d;
            this.zzd = d;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(id = 2) @oo0oO0 LatLng latLng, @SafeParcelable.Param(id = 3) @oo0oO0 LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        Preconditions.checkArgument(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    @oo0oO0
    public static Builder builder() {
        return new Builder();
    }

    @o0OO00OO
    public static LatLngBounds createFromAttributes(@o0OO00OO Context context, @o0OO00OO AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d) {
        double d2 = this.southwest.longitude;
        double d3 = this.northeast.longitude;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        int i2 = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        return i <= 0 ? i2 <= 0 && d <= d3 : i2 <= 0 || d <= d3;
    }

    public boolean contains(@oo0oO0 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.latitude;
        return this.southwest.latitude <= d && d <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
        }
        return false;
    }

    @oo0oO0
    public LatLng getCenter() {
        LatLng latLng = this.southwest;
        double d = latLng.latitude;
        LatLng latLng2 = this.northeast;
        double d2 = (d + latLng2.latitude) / 2.0d;
        double d3 = latLng2.longitude;
        double d4 = latLng.longitude;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    @oo0oO0
    public LatLngBounds including(@oo0oO0 LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double min = Math.min(this.southwest.latitude, latLng2.latitude);
        double max = Math.max(this.northeast.latitude, latLng2.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng2.longitude;
        if (!zza(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.southwest, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
