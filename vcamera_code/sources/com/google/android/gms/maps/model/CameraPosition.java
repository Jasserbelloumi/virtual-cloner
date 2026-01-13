package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Oo.o0O0OOO;
@SafeParcelable.Class(creator = "CameraPositionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();
    @SafeParcelable.Field(id = 5)
    public final float bearing;
    @oo0oO0
    @SafeParcelable.Field(id = 2)
    public final LatLng target;
    @SafeParcelable.Field(id = 4)
    public final float tilt;
    @SafeParcelable.Field(id = 3)
    public final float zoom;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private LatLng zza;
        private float zzb;
        private float zzc;
        private float zzd;

        public Builder() {
        }

        public Builder(@oo0oO0 CameraPosition cameraPosition) {
            CameraPosition cameraPosition2 = (CameraPosition) Preconditions.checkNotNull(cameraPosition, "previous must not be null.");
            this.zza = cameraPosition2.target;
            this.zzb = cameraPosition2.zoom;
            this.zzc = cameraPosition2.tilt;
            this.zzd = cameraPosition2.bearing;
        }

        @oo0oO0
        public Builder bearing(float f) {
            this.zzd = f;
            return this;
        }

        @oo0oO0
        public CameraPosition build() {
            return new CameraPosition(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @oo0oO0
        public Builder target(@oo0oO0 LatLng latLng) {
            this.zza = (LatLng) Preconditions.checkNotNull(latLng, "location must not be null.");
            return this;
        }

        @oo0oO0
        public Builder tilt(float f) {
            this.zzc = f;
            return this;
        }

        @oo0oO0
        public Builder zoom(float f) {
            this.zzb = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CameraPosition(@SafeParcelable.Param(id = 2) @oo0oO0 LatLng latLng, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) float f2, @SafeParcelable.Param(id = 5) float f3) {
        Preconditions.checkNotNull(latLng, "camera target must not be null.");
        Preconditions.checkArgument(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @oo0oO0
    public static Builder builder() {
        return new Builder();
    }

    @oo0oO0
    public static Builder builder(@oo0oO0 CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    @o0OO00OO
    public static CameraPosition createFromAttributes(@o0OO00OO Context context, @o0OO00OO AttributeSet attributeSet) {
        return GoogleMapOptions.zza(context, attributeSet);
    }

    @oo0oO0
    public static final CameraPosition fromLatLngZoom(@oo0oO0 LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add(o0O0OOO.f11641o00ooO0O, this.target).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.target, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
