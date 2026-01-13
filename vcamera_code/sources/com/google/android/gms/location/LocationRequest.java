package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.support.v4.media.o00oOo0O;
import androidx.work.impl.background.systemalarm.o00oOOo0;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import org.checkerframework.dataflow.qual.Pure;
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();
    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;
    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;
    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;
    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;
    @SafeParcelable.Field(defaultValue = SessionDescription.SUPPORTED_SDP_VERSION, getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;
    @SafeParcelable.Field(defaultValue = SessionDescription.SUPPORTED_SDP_VERSION, getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;
    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;
    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getModuleId", id = 14)
    private final String zzl;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzm;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzn;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zzd zzo;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        @o0OO00OO
        private String zzl;
        private boolean zzm;
        @o0OO00OO
        private WorkSource zzn;
        @o0OO00OO
        private com.google.android.gms.internal.location.zzd zzo;

        public Builder(int i, long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i);
            this.zza = i;
            this.zzb = j;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(@oo0oO0 LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }

        @oo0oO0
        public LocationRequest build() {
            int i = this.zza;
            long j = this.zzb;
            long j2 = this.zzc;
            if (j2 == -1) {
                j2 = j;
            } else if (i != 105) {
                j2 = Math.min(j2, j);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j3 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j4 = this.zzi;
            return new LocationRequest(i, j, j2, max, Long.MAX_VALUE, j3, i2, f, z, j4 == -1 ? this.zzb : j4, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        @oo0oO0
        public Builder setDurationMillis(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zze = j;
            return this;
        }

        @oo0oO0
        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzj = i;
            return this;
        }

        @oo0oO0
        public Builder setIntervalMillis(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            return this;
        }

        @oo0oO0
        public Builder setMaxUpdateAgeMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j;
            return this;
        }

        @oo0oO0
        public Builder setMaxUpdateDelayMillis(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j;
            return this;
        }

        @oo0oO0
        public Builder setMaxUpdates(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.zzf = i;
            return this;
        }

        @oo0oO0
        public Builder setMinUpdateDistanceMeters(float f) {
            Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f;
            return this;
        }

        @oo0oO0
        public Builder setMinUpdateIntervalMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j;
            return this;
        }

        @oo0oO0
        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zza = i;
            return this;
        }

        @oo0oO0
        public Builder setWaitForAccurateLocation(boolean z) {
            this.zzh = z;
            return this;
        }

        @o0OO0oO0(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        @oo0oO0
        public final Builder zza(boolean z) {
            this.zzm = z;
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zzb(@o0OO00OO String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        @oo0oO0
        public final Builder zzc(int i) {
            boolean z;
            int i2 = 2;
            if (i == 0 || i == 1) {
                i2 = i;
            } else if (i != 2) {
                i2 = i;
                z = false;
                Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                this.zzk = i2;
                return this;
            } else {
                i = 2;
            }
            z = true;
            Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.zzk = i2;
            return this;
        }

        @o0OO0oO0("android.permission.UPDATE_DEVICE_STATS")
        @oo0oO0
        public final Builder zzd(@o0OO00OO WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, o00oOOo0.f5594o00ooO, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j4, @SafeParcelable.Param(id = 10) long j5, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 11) long j6, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) @o0OO00OO String str, @SafeParcelable.Param(id = 15) boolean z2, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) @o0OO00OO com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = i;
        long j7 = j;
        this.zzb = j7;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j7;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = str;
        this.zzm = z2;
        this.zzn = workSource;
        this.zzo = zzdVar;
    }

    @oo0oO0
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, o00oOOo0.f5594o00ooO, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j) {
        return j == Long.MAX_VALUE ? "∞" : zzdj.zza(j);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = elapsedRealtime + j;
        if (((elapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @Deprecated
    @Pure
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @Pure
    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    @Pure
    public long getInterval() {
        return getIntervalMillis();
    }

    @Pure
    public long getIntervalMillis() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @Pure
    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @Pure
    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    @Pure
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Pure
    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @Pure
    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    @Pure
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    @Pure
    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    @Pure
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    @Pure
    public boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @Deprecated
    @Pure
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @Pure
    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setExpirationDuration(long j) {
        Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
        this.zze = j;
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = Math.max(1L, j - SystemClock.elapsedRealtime());
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setFastestInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setInterval(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setMaxWaitTime(long j) {
        Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("invalid numUpdates: ", i));
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setPriority(int i) {
        zzae.zza(i);
        this.zza = i;
        return this;
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f);
    }

    @oo0oO0
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    @oo0oO0
    public String toString() {
        long j;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Request[");
        if (!isPassive()) {
            o00oOOo02.append("@");
            if (isBatched()) {
                zzdj.zzb(this.zzb, o00oOOo02);
                o00oOOo02.append("/");
                j = this.zzd;
            } else {
                j = this.zzb;
            }
            zzdj.zzb(j, o00oOOo02);
            o00oOOo02.append(" ");
        }
        o00oOOo02.append(zzae.zzb(this.zza));
        if (isPassive() || this.zzc != this.zzb) {
            o00oOOo02.append(", minUpdateInterval=");
            o00oOOo02.append(zzf(this.zzc));
        }
        if (this.zzg > 0.0d) {
            o00oOOo02.append(", minUpdateDistance=");
            o00oOOo02.append(this.zzg);
        }
        boolean isPassive = isPassive();
        long j2 = this.zzi;
        if (!isPassive ? j2 != this.zzb : j2 != Long.MAX_VALUE) {
            o00oOOo02.append(", maxUpdateAge=");
            o00oOOo02.append(zzf(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            o00oOOo02.append(", duration=");
            zzdj.zzb(this.zze, o00oOOo02);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            o00oOOo02.append(", maxUpdates=");
            o00oOOo02.append(this.zzf);
        }
        if (this.zzk != 0) {
            o00oOOo02.append(", ");
            o00oOOo02.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            o00oOOo02.append(", ");
            o00oOOo02.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            o00oOOo02.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            o00oOOo02.append(", bypass");
        }
        if (this.zzl != null) {
            o00oOOo02.append(", moduleId=");
            o00oOOo02.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            o00oOOo02.append(", ");
            o00oOOo02.append(this.zzn);
        }
        if (this.zzo != null) {
            o00oOOo02.append(", impersonation=");
            o00oOOo02.append(this.zzo);
        }
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzk;
    }

    @oo0oO0
    @Pure
    public final WorkSource zzb() {
        return this.zzn;
    }

    @o0OO00OO
    @Pure
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzo;
    }

    @o0OO00OO
    @Deprecated
    @Pure
    public final String zzd() {
        return this.zzl;
    }

    @Pure
    public final boolean zze() {
        return this.zzm;
    }
}
