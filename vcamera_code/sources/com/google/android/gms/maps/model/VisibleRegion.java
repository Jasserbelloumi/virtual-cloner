package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "VisibleRegionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzad();
    @oo0oO0
    @SafeParcelable.Field(id = 4)
    public final LatLng farLeft;
    @oo0oO0
    @SafeParcelable.Field(id = 5)
    public final LatLng farRight;
    @oo0oO0
    @SafeParcelable.Field(id = 6)
    public final LatLngBounds latLngBounds;
    @oo0oO0
    @SafeParcelable.Field(id = 2)
    public final LatLng nearLeft;
    @oo0oO0
    @SafeParcelable.Field(id = 3)
    public final LatLng nearRight;

    @SafeParcelable.Constructor
    public VisibleRegion(@SafeParcelable.Param(id = 2) @oo0oO0 LatLng latLng, @SafeParcelable.Param(id = 3) @oo0oO0 LatLng latLng2, @SafeParcelable.Param(id = 4) @oo0oO0 LatLng latLng3, @SafeParcelable.Param(id = 5) @oo0oO0 LatLng latLng4, @SafeParcelable.Param(id = 6) @oo0oO0 LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisibleRegion) {
            VisibleRegion visibleRegion = (VisibleRegion) obj;
            return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add("nearLeft", this.nearLeft).add("nearRight", this.nearRight).add("farLeft", this.farLeft).add("farRight", this.farRight).add("latLngBounds", this.latLngBounds).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.nearLeft, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.nearRight, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.farLeft, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.farRight, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.latLngBounds, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
