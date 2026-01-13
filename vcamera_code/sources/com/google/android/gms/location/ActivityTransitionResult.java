package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getTransitionEvents", id = 1)
    private final List zza;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getExtras", id = 2)
    private Bundle zzb;

    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) @oo0oO0 List<ActivityTransitionEvent> list) {
        this.zzb = null;
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.checkArgument(list.get(i).getElapsedRealTimeNanos() >= list.get(i + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) @oo0oO0 List list, @SafeParcelable.Param(id = 2) @o0OO00OO Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }

    @o0OO00OO
    public static ActivityTransitionResult extractResult(@oo0oO0 Intent intent) {
        if (hasResult(intent)) {
            return (ActivityTransitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(@o0OO00OO Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    @oo0oO0
    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
