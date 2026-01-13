package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
final class zzads implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzadt(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzadt[i];
    }
}
