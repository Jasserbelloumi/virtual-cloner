package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzdh;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;
        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @oo0oO0
        public Geofence build() {
            if (this.zza != null) {
                int i = this.zzb;
                if (i != 0) {
                    if ((i & 4) == 0 || this.zzi >= 0) {
                        if (this.zzc != Long.MIN_VALUE) {
                            if (this.zzd != -1) {
                                if (this.zzh >= 0) {
                                    return new zzdh(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
                                }
                                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                            }
                            throw new IllegalArgumentException("Geofence region not set.");
                        }
                        throw new IllegalArgumentException("Expiration not set.");
                    }
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        @oo0oO0
        public Builder setCircularRegion(@o0O0OO0(from = -90.0d, to = 90.0d) double d, @o0O0OO0(from = -180.0d, to = 180.0d) double d2, @o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
            boolean z = d >= -90.0d && d <= 90.0d;
            Preconditions.checkArgument(z, "Invalid latitude: " + d);
            boolean z2 = d2 >= -180.0d && d2 <= 180.0d;
            Preconditions.checkArgument(z2, "Invalid longitude: " + d2);
            boolean z3 = f > 0.0f;
            Preconditions.checkArgument(z3, "Invalid radius: " + f);
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f;
            return this;
        }

        @oo0oO0
        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        @oo0oO0
        public Builder setLoiteringDelay(int i) {
            this.zzi = i;
            return this;
        }

        @oo0oO0
        public Builder setNotificationResponsiveness(@o0O0o00O(from = 0) int i) {
            this.zzh = i;
            return this;
        }

        @oo0oO0
        public Builder setRequestId(@oo0oO0 String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @oo0oO0
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.zzb = i;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface GeofenceTransition {
    }

    /* loaded from: classes2.dex */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @oo0oO0
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
