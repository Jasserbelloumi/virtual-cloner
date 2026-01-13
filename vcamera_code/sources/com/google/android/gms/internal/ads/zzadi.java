package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import o00oOooO.o0OO00OO;
import o00ooOO0.o0O000O;
/* loaded from: classes2.dex */
public final class zzadi extends zzadp {
    public static final Parcelable.Creator<zzadi> CREATOR = new zzadh();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzadi(Parcel parcel) {
        super(CommentFrame.ID);
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public zzadi(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadi.class == obj.getClass()) {
            zzadi zzadiVar = (zzadi) obj;
            if (zzew.zzU(this.zzb, zzadiVar.zzb) && zzew.zzU(this.zza, zzadiVar.zza) && zzew.zzU(this.zzc, zzadiVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode + 527;
        String str3 = this.zzc;
        return (((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        return o0O000O.o00oOOo0(this.zzf, ": language=", this.zza, ", description=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }
}
