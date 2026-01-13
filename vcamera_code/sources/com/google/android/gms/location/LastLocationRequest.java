package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.o00oOo0O;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzdj;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.checkerframework.dataflow.qual.Pure;
@SafeParcelable.Class(creator = "LastLocationRequestCreator")
/* loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzv();
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getModuleId", id = 4)
    private final String zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getImpersonation", id = 5)
    private final com.google.android.gms.internal.location.zzd zze;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;
        @o0OO00OO
        private String zzd;
        @o0OO00OO
        private com.google.android.gms.internal.location.zzd zze;

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
            this.zze = null;
        }

        public Builder(@oo0oO0 LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zzc();
            this.zzd = lastLocationRequest.zzb();
            this.zze = lastLocationRequest.zza();
        }

        @oo0oO0
        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @oo0oO0
        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        @oo0oO0
        public Builder setMaxUpdateAgeMillis(long j) {
            Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) @o0OO00OO String str, @SafeParcelable.Param(id = 5) @o0OO00OO com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str;
        this.zze = zzdVar;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof LastLocationRequest) {
            LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
            return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd) && Objects.equal(this.zze, lastLocationRequest.zze);
        }
        return false;
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            o00oOOo02.append("maxAge=");
            zzdj.zzb(this.zza, o00oOOo02);
        }
        if (this.zzb != 0) {
            o00oOOo02.append(", ");
            o00oOOo02.append(zzo.zzb(this.zzb));
        }
        if (this.zzc) {
            o00oOOo02.append(", bypass");
        }
        if (this.zzd != null) {
            o00oOOo02.append(", moduleId=");
            o00oOOo02.append(this.zzd);
        }
        if (this.zze != null) {
            o00oOOo02.append(", impersonation=");
            o00oOOo02.append(this.zze);
        }
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0OO00OO
    @Pure
    public final com.google.android.gms.internal.location.zzd zza() {
        return this.zze;
    }

    @o0OO00OO
    @Deprecated
    @Pure
    public final String zzb() {
        return this.zzd;
    }

    @Pure
    public final boolean zzc() {
        return this.zzc;
    }
}
