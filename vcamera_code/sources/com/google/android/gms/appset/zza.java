package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
@SafeParcelable.Class(creator = "AppSetIdRequestParamsCreator")
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @o0OO00OO
    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final String zza;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getClientAppPackageName", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 1) @o0OO00OO String str, @SafeParcelable.Param(id = 2) @o0OO00OO String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
