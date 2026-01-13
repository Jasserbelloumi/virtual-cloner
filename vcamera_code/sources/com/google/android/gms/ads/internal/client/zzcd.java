package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
/* loaded from: classes.dex */
public abstract class zzcd extends zzasw implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzd;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbnf zzf = zzbne.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                break;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbnf zzf2 = zzbne.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                break;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbnf zzf3 = zzbne.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzb(asInterface3, readString3, zzf3, readInt3);
                break;
            case 4:
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzd = zzi(asInterface4, asInterface5);
                break;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzf4 = zzbne.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzn(asInterface6, zzf4, readInt4);
                break;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzd = zzm(asInterface7);
                break;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzg(asInterface8, readInt5);
                break;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzasx.zza(parcel, zzq.CREATOR), readString4, readInt6);
                break;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzd = zzj(asInterface9, asInterface10, asInterface11);
                break;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbnf zzf5 = zzbne.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzo(asInterface12, readString5, zzf5, readInt7);
                break;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzasx.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbnf zzf6 = zzbne.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzc(asInterface13, zzqVar3, readString6, zzf6, readInt8);
                break;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzf7 = zzbne.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzp(asInterface14, zzf7, readInt9);
                break;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzf8 = zzbne.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzl(asInterface15, zzf8, readInt10);
                break;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzf9 = zzbne.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbim zzc = zzbil.zzc(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzd = zzk(asInterface16, zzf9, readInt11, zzc);
                break;
            case 17:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbnf zzf10 = zzbne.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzasx.zzc(parcel);
                zzd = zzh(asInterface17, zzf10, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzasx.zzg(parcel2, zzd);
        return true;
    }
}
