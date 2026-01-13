package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import o00oOooO.o0OO00OO;
import o0O0OOOo.o00oo0O0;
/* loaded from: classes2.dex */
public final class zzw implements Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzv();
    public final UUID zza;
    @o0OO00OO
    public final String zzb;
    public final String zzc;
    @o0OO00OO
    public final byte[] zzd;
    private int zze;

    public zzw(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public zzw(UUID uuid, @o0OO00OO String str, String str2, @o0OO00OO byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof zzw) {
            if (obj == this) {
                return true;
            }
            zzw zzwVar = (zzw) obj;
            return zzew.zzU(this.zzb, zzwVar.zzb) && zzew.zzU(this.zzc, zzwVar.zzc) && zzew.zzU(this.zza, zzwVar.zza) && Arrays.equals(this.zzd, zzwVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = this.zza.hashCode() * 31;
            String str = this.zzb;
            int o00oOOo02 = o00oo0O0.o00oOOo0(this.zzc, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = o00oOOo02;
            return o00oOOo02;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
