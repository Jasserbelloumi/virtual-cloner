package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getIntervalMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(getter = "getTriggerUpdate", id = 2)
    private final boolean zzb;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getWorkSource", id = 3)
    private final WorkSource zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getTag", id = 4)
    private final String zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getNondefaultActivities", id = 5)
    private final int[] zze;
    @SafeParcelable.Field(getter = "getRequestSensorData", id = 6)
    private final boolean zzf;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getAccountName", id = 7)
    private final String zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", id = 8)
    private final long zzh;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 9)
    private String zzi;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) @o0OO00OO WorkSource workSource, @SafeParcelable.Param(id = 4) @o0OO00OO String str, @SafeParcelable.Param(id = 5) @o0OO00OO int[] iArr, @SafeParcelable.Param(id = 6) boolean z2, @SafeParcelable.Param(id = 7) @o0OO00OO String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) @o0OO00OO String str3) {
        this.zza = j;
        this.zzb = z;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z2;
        this.zzg = str2;
        this.zzh = j2;
        this.zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzb zza(@o0OO00OO String str) {
        this.zzi = str;
        return this;
    }
}
