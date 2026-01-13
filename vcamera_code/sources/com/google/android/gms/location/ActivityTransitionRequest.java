package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0OoOO0;
@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();
    @oo0oO0
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzg();
    @SafeParcelable.Field(getter = "getActivityTransitions", id = 1)
    private final List zza;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getTag", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getClients", id = 3)
    private final List zzc;
    @o0OO00OO
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getContextAttributionTag", id = 4)
    private String zzd;

    public ActivityTransitionRequest(@oo0oO0 List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) @oo0oO0 List list, @SafeParcelable.Param(id = 2) @o0OO00OO String str, @SafeParcelable.Param(id = 3) @o0OO00OO List list2, @SafeParcelable.Param(id = 4) @o0OO00OO String str2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzd = str2;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.equal(this.zza, activityTransitionRequest.zza) && Objects.equal(this.zzb, activityTransitionRequest.zzb) && Objects.equal(this.zzd, activityTransitionRequest.zzd) && Objects.equal(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.zzc;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.zzd;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(@oo0oO0 Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @oo0oO0
    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        String valueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str, "', mClients=");
        o00oOOo02.append(valueOf2);
        o00oOOo02.append(", mAttributionTag=");
        o00oOOo02.append(str2);
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public final ActivityTransitionRequest zza(@o0OO00OO String str) {
        this.zzd = str;
        return this;
    }
}
