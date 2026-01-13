package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.support.v4.media.o00oOo0O;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.checkerframework.dataflow.qual.Pure;
@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
/* loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean zze;
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int zzf;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getModuleId", id = 8)
    private final String zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzh;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getImpersonation", id = 9)
    private final com.google.android.gms.internal.location.zzd zzi;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private int zzf;
        @o0OO00OO
        private String zzg;
        @o0OO00OO
        private WorkSource zzh;
        @o0OO00OO
        private com.google.android.gms.internal.location.zzd zzi;

        public Builder() {
            this.zza = 60000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
        }

        public Builder(@oo0oO0 CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zze();
            this.zzf = currentLocationRequest.zza();
            this.zzg = currentLocationRequest.zzd();
            this.zzh = new WorkSource(currentLocationRequest.zzb());
            this.zzi = currentLocationRequest.zzc();
        }

        @oo0oO0
        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, new WorkSource(this.zzh), this.zzi);
        }

        @oo0oO0
        public Builder setDurationMillis(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zzd = j;
            return this;
        }

        @oo0oO0
        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        @oo0oO0
        public Builder setMaxUpdateAgeMillis(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j;
            return this;
        }

        @oo0oO0
        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zzc = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) @o0OO00OO String str, @SafeParcelable.Param(id = 6) WorkSource workSource, @SafeParcelable.Param(id = 9) @o0OO00OO com.google.android.gms.internal.location.zzd zzdVar) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = i3;
        this.zzg = str;
        this.zzh = workSource;
        this.zzi = zzdVar;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof CurrentLocationRequest) {
            CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
            return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && Objects.equal(this.zzg, currentLocationRequest.zzg) && Objects.equal(this.zzh, currentLocationRequest.zzh) && Objects.equal(this.zzi, currentLocationRequest.zzi);
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zzd;
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    @Pure
    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CurrentLocationRequest[");
        o00oOOo02.append(zzae.zzb(this.zzc));
        if (this.zza != Long.MAX_VALUE) {
            o00oOOo02.append(", maxAge=");
            zzdj.zzb(this.zza, o00oOOo02);
        }
        if (this.zzd != Long.MAX_VALUE) {
            o00oOOo02.append(", duration=");
            o00oOOo02.append(this.zzd);
            o00oOOo02.append("ms");
        }
        if (this.zzb != 0) {
            o00oOOo02.append(", ");
            o00oOOo02.append(zzo.zzb(this.zzb));
        }
        if (this.zze) {
            o00oOOo02.append(", bypass");
        }
        if (this.zzf != 0) {
            o00oOOo02.append(", ");
            o00oOOo02.append(zzai.zza(this.zzf));
        }
        if (this.zzg != null) {
            o00oOOo02.append(", moduleId=");
            o00oOOo02.append(this.zzg);
        }
        if (!WorkSourceUtil.isEmpty(this.zzh)) {
            o00oOOo02.append(", workSource=");
            o00oOOo02.append(this.zzh);
        }
        if (this.zzi != null) {
            o00oOOo02.append(", impersonation=");
            o00oOOo02.append(this.zzi);
        }
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzh, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzf;
    }

    @oo0oO0
    @Pure
    public final WorkSource zzb() {
        return this.zzh;
    }

    @o0OO00OO
    @Pure
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzi;
    }

    @o0OO00OO
    @Deprecated
    @Pure
    public final String zzd() {
        return this.zzg;
    }

    @Pure
    public final boolean zze() {
        return this.zze;
    }
}
