package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @SafeParcelable.VersionField(id = 1000)
    public final int zzb;
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zze;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    private final ConnectionResult zzf;
    @VisibleForTesting
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);
    @VisibleForTesting
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    @ShowFirstParty
    @oo0oO0
    public static final Status zza = new Status(17);
    @oo0oO0
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    @oo0oO0
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) @o0OO00OO String str, @SafeParcelable.Param(id = 3) @o0OO00OO PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) @o0OO00OO ConnectionResult connectionResult) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public Status(int i, @o0OO00OO String str) {
        this(1, i, str, null, null);
    }

    public Status(int i, @o0OO00OO String str, @o0OO00OO PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, null);
    }

    public Status(@oo0oO0 ConnectionResult connectionResult, @oo0oO0 String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@oo0oO0 ConnectionResult connectionResult, @oo0oO0 String str, int i) {
        this(1, i, str, connectionResult.getResolution(), connectionResult);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.zzb == status.zzb && this.zzc == status.zzc && Objects.equal(this.zzd, status.zzd) && Objects.equal(this.zze, status.zze) && Objects.equal(this.zzf, status.zzf);
        }
        return false;
    }

    @o0OO00OO
    public ConnectionResult getConnectionResult() {
        return this.zzf;
    }

    @o0OO00OO
    public PendingIntent getResolution() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.api.Result
    @CanIgnoreReturnValue
    @oo0oO0
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzc;
    }

    @o0OO00OO
    public String getStatusMessage() {
        return this.zzd;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.zze != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public boolean isCanceled() {
        return this.zzc == 16;
    }

    public boolean isInterrupted() {
        return this.zzc == 14;
    }

    @CheckReturnValue
    public boolean isSuccess() {
        return this.zzc <= 0;
    }

    public void startResolutionForResult(@oo0oO0 Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zze;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @oo0oO0
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.zze);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public final String zza() {
        String str = this.zzd;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zzc);
    }
}
