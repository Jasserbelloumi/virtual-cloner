package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzz();
    @SafeParcelable.Field(getter = "getLocationRequests", id = 1)
    private final List zza;
    @SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "needBle", id = 3)
    private final boolean zzc;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final ArrayList zza = new ArrayList();
        private boolean zzb = false;
        private boolean zzc = false;

        @oo0oO0
        public Builder addAllLocationRequests(@oo0oO0 Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }

        @oo0oO0
        public Builder addLocationRequest(@oo0oO0 LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        @oo0oO0
        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zza, this.zzb, this.zzc);
        }

        @oo0oO0
        public Builder setAlwaysShow(boolean z) {
            this.zzb = z;
            return this;
        }

        @oo0oO0
        public Builder setNeedBle(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
