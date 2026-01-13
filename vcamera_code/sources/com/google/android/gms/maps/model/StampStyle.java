package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StampStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class StampStyle extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<StampStyle> CREATOR = new zzo();
    @oo0oO0
    @SafeParcelable.Field(getter = "getWrappedStampBinder", id = 2, type = "android.os.IBinder")
    public final BitmapDescriptor zza;

    /* loaded from: classes2.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public BitmapDescriptor zza;

        public abstract T self();

        public T stamp(BitmapDescriptor bitmapDescriptor) {
            this.zza = bitmapDescriptor;
            return self();
        }
    }

    @SafeParcelable.Constructor
    public StampStyle(@SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
    }

    public StampStyle(@oo0oO0 BitmapDescriptor bitmapDescriptor) {
        this.zza = bitmapDescriptor;
    }

    @oo0oO0
    public BitmapDescriptor getStamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
