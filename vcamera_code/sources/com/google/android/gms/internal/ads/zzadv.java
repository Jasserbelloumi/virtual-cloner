package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzadv extends zzadp {
    public static final Parcelable.Creator<zzadv> CREATOR = new zzadu();
    public final String zza;
    public final byte[] zzb;

    public zzadv(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public zzadv(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadv.class == obj.getClass()) {
            zzadv zzadvVar = (zzadv) obj;
            if (zzew.zzU(this.zza, zzadvVar.zza) && Arrays.equals(this.zzb, zzadvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        return android.support.v4.media.o00oOoO.o00oOOo0(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }
}
