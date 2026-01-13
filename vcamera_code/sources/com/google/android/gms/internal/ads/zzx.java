package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
/* loaded from: classes2.dex */
public final class zzx implements Comparator<zzw>, Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzu();
    @o0OO00OO
    public final String zza;
    public final int zzb;
    private final zzw[] zzc;
    private int zzd;

    public zzx(Parcel parcel) {
        this.zza = parcel.readString();
        zzw[] zzwVarArr = (zzw[]) zzew.zzH((zzw[]) parcel.createTypedArray(zzw.CREATOR));
        this.zzc = zzwVarArr;
        this.zzb = zzwVarArr.length;
    }

    private zzx(@o0OO00OO String str, boolean z, zzw... zzwVarArr) {
        this.zza = str;
        zzwVarArr = z ? (zzw[]) zzwVarArr.clone() : zzwVarArr;
        this.zzc = zzwVarArr;
        this.zzb = zzwVarArr.length;
        Arrays.sort(zzwVarArr, this);
    }

    public zzx(@o0OO00OO String str, zzw... zzwVarArr) {
        this(null, true, zzwVarArr);
    }

    public zzx(List list) {
        this(null, false, (zzw[]) list.toArray(new zzw[0]));
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzw zzwVar, zzw zzwVar2) {
        zzw zzwVar3 = zzwVar;
        zzw zzwVar4 = zzwVar2;
        UUID uuid = zzo.zza;
        return uuid.equals(zzwVar3.zza) ? !uuid.equals(zzwVar4.zza) ? 1 : 0 : zzwVar3.zza.compareTo(zzwVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzx.class == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (zzew.zzU(this.zza, zzxVar.zza) && Arrays.equals(this.zzc, zzxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzw zza(int i) {
        return this.zzc[i];
    }

    @o0OoO00O
    public final zzx zzb(@o0OO00OO String str) {
        return zzew.zzU(this.zza, str) ? this : new zzx(str, false, this.zzc);
    }
}
