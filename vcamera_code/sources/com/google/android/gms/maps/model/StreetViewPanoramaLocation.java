package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzr();
    @oo0oO0
    @SafeParcelable.Field(id = 2)
    public final StreetViewPanoramaLink[] links;
    @oo0oO0
    @SafeParcelable.Field(id = 4)
    public final String panoId;
    @oo0oO0
    @SafeParcelable.Field(id = 3)
    public final LatLng position;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@SafeParcelable.Param(id = 2) @oo0oO0 StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.Param(id = 3) @oo0oO0 LatLng latLng, @SafeParcelable.Param(id = 4) @oo0oO0 String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaLocation) {
            StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
            return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.position, this.panoId);
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add("position", this.position.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.links, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.position, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.panoId, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
