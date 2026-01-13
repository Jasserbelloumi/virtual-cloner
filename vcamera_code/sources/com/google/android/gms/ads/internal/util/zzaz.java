package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzezx;
import com.google.android.gms.internal.ads.zzfoj;
import o00oOooO.o0OO00OO;
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(id = 1) @o0OO00OO String str, @SafeParcelable.Param(id = 2) int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzaz zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zza = zzezx.zza(th);
        return new zzaz(zzfoj.zzd(th.getMessage()) ? zza.zzb : th.getMessage(), zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzay zza() {
        return new zzay(this.zza, this.zzb);
    }
}
