package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbst extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbst> CREATOR = new zzbsu();
    @SafeParcelable.Field(id = 2)
    public final boolean zza;
    @o0OO00OO
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzbst() {
        this(false, Collections.emptyList());
    }

    @SafeParcelable.Constructor
    public zzbst(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
