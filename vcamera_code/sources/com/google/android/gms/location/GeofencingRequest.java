package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.o00oOOoO;
import android.support.v4.media.o00oOo0O;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzn();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    @SafeParcelable.Field(getter = "getParcelableGeofences", id = 1)
    private final List zza;
    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", id = 2)
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", id = 3)
    private final String zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 4)
    private final String zzd;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List zza = new ArrayList();
        @InitialTrigger
        private int zzb = 5;
        private String zzc = "";

        @oo0oO0
        public Builder addGeofence(@oo0oO0 Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.zza.add((zzdh) geofence);
            return this;
        }

        @oo0oO0
        public Builder addGeofences(@oo0oO0 List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        @oo0oO0
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        @oo0oO0
        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) @InitialTrigger int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) @o0OO00OO String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    @oo0oO0
    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("GeofencingRequest[geofences=");
        o00oOOo02.append(this.zza);
        o00oOOo02.append(", initialTrigger=");
        o00oOOo02.append(this.zzb);
        o00oOOo02.append(", tag=");
        o00oOOo02.append(this.zzc);
        o00oOOo02.append(", attributionTag=");
        return o00oOOoO.o00oOOo0(o00oOOo02, this.zzd, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public final GeofencingRequest zza(@o0OO00OO String str) {
        return new GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }
}
