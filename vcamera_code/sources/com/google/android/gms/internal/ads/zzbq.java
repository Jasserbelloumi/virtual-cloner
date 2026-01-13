package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbq implements Parcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbo();
    public final long zza;
    private final zzbp[] zzb;

    public zzbq(long j, zzbp... zzbpVarArr) {
        this.zza = j;
        this.zzb = zzbpVarArr;
    }

    public zzbq(Parcel parcel) {
        this.zzb = new zzbp[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbp[] zzbpVarArr = this.zzb;
            if (i >= zzbpVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbpVarArr[i] = (zzbp) parcel.readParcelable(zzbp.class.getClassLoader());
                i++;
            }
        }
    }

    public zzbq(List list) {
        this(C.TIME_UNSET, (zzbp[]) list.toArray(new zzbp[0]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbqVar = (zzbq) obj;
            if (Arrays.equals(this.zzb, zzbqVar.zzb) && this.zza == zzbqVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzb);
        long j = this.zza;
        return android.support.v4.media.o00oOoO.o00oOOo0("entries=", arrays, j == C.TIME_UNSET ? "" : o0O0OO0.o00oOo0O.o00oOOo0(", presentationTimeUs=", j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbp zzbpVar : this.zzb) {
            parcel.writeParcelable(zzbpVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbp zzb(int i) {
        return this.zzb[i];
    }

    public final zzbq zzc(zzbp... zzbpVarArr) {
        return zzbpVarArr.length == 0 ? this : new zzbq(this.zza, (zzbp[]) zzew.zzae(this.zzb, zzbpVarArr));
    }

    public final zzbq zzd(@o0OO00OO zzbq zzbqVar) {
        return zzbqVar == null ? this : zzc(zzbqVar.zzb);
    }
}
