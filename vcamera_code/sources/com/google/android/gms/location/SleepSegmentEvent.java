package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.concurrent.futures.o00oOOo0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzag();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", id = 5)
    private final int zze;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3) {
        Preconditions.checkArgument(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    @oo0oO0
    public static List<SleepSegmentEvent> extractEvents(@oo0oO0 Intent intent) {
        ArrayList arrayList;
        Preconditions.checkNotNull(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) arrayList.get(i);
                Preconditions.checkNotNull(bArr);
                arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.emptyList();
    }

    public static boolean hasEvents(@o0OO00OO Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @oo0oO0
    public String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = this.zzc;
        StringBuilder o00oOOo02 = o00oOOo0.o00oOOo0("startMillis=", j, ", endMillis=");
        o00oOOo02.append(j2);
        o00oOOo02.append(", status=");
        o00oOOo02.append(i);
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
