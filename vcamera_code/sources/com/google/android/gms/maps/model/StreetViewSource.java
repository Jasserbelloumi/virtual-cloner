package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    private static final String zza = "StreetViewSource";
    @oo0oO0
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzt();
    @oo0oO0
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    @oo0oO0
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(id = 2) int i) {
        this.zzb = i;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb));
    }

    @oo0oO0
    public String toString() {
        int i = this.zzb;
        return String.format("StreetViewSource:%s", i != 0 ? i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
