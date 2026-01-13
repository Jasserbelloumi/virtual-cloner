package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "PointOfInterestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzk();
    @oo0oO0
    @SafeParcelable.Field(id = 2)
    public final LatLng latLng;
    @oo0oO0
    @SafeParcelable.Field(id = 4)
    public final String name;
    @oo0oO0
    @SafeParcelable.Field(id = 3)
    public final String placeId;

    @SafeParcelable.Constructor
    public PointOfInterest(@SafeParcelable.Param(id = 2) @oo0oO0 LatLng latLng, @SafeParcelable.Param(id = 3) @oo0oO0 String str, @SafeParcelable.Param(id = 4) @oo0oO0 String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.latLng, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.placeId, false);
        SafeParcelWriter.writeString(parcel, 4, this.name, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
