package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "SleepSegmentRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    @oo0oO0
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzah();
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getUserPreferredSleepWindow", id = 1)
    private final List zza;
    @SafeParcelable.Field(defaultValue = SessionDescription.SUPPORTED_SDP_VERSION, getter = "getRequestedDataType", id = 2)
    private final int zzb;

    public SleepSegmentRequest(int i) {
        this(null, i);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentRequest(@SafeParcelable.Param(id = 1) @o0OO00OO List list, @SafeParcelable.Param(id = 2) int i) {
        this.zza = list;
        this.zzb = i;
    }

    @oo0oO0
    public static SleepSegmentRequest getDefaultSleepSegmentRequest() {
        return new SleepSegmentRequest(null, 0);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepSegmentRequest) {
            SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
            return Objects.equal(this.zza, sleepSegmentRequest.zza) && this.zzb == sleepSegmentRequest.zzb;
        }
        return false;
    }

    public int getRequestedDataType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getRequestedDataType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
