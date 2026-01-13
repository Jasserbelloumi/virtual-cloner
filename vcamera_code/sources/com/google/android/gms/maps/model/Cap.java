package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooO0.o00oOoO;
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class Cap extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;
    private static final String zza = "Cap";
    @oo0oO0
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    public Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) @o0OO00OO IBinder iBinder, @SafeParcelable.Param(id = 4) @o0OO00OO Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, @o0OO00OO BitmapDescriptor bitmapDescriptor, @o0OO00OO Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = bitmapDescriptor != null && z2;
            i = 3;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
        this.zzb = i;
        this.zzc = bitmapDescriptor;
        this.zzd = f;
    }

    public Cap(@oo0oO0 BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cap) {
            Cap cap = (Cap) obj;
            return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @oo0oO0
    public String toString() {
        return o00oOoO.o00oOOo0("[Cap: type=", this.zzb, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Cap zza() {
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this;
                    }
                    Preconditions.checkState(this.zzc != null, "bitmapDescriptor must not be null");
                    Preconditions.checkState(this.zzd != null, "bitmapRefWidth must not be null");
                    return new CustomCap(this.zzc, this.zzd.floatValue());
                }
                return new RoundCap();
            }
            return new SquareCap();
        }
        return new ButtCap();
    }
}
