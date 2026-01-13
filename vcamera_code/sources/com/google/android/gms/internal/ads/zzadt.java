package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzadt extends zzadp {
    public static final Parcelable.Creator<zzadt> CREATOR = new zzads();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzadt(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public zzadt(Parcel parcel) {
        super(MlltFrame.ID);
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzew.zzH(parcel.createIntArray());
        this.zze = (int[]) zzew.zzH(parcel.createIntArray());
    }

    @Override // com.google.android.gms.internal.ads.zzadp, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.zza == zzadtVar.zza && this.zzb == zzadtVar.zzb && this.zzc == zzadtVar.zzc && Arrays.equals(this.zzd, zzadtVar.zzd) && Arrays.equals(this.zze, zzadtVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }
}
