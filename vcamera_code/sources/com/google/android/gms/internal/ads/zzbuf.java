package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbuf extends zzasw implements zzbug {
    public zzbuf() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zzs;
        if (i == 1) {
            zzasx.zzc(parcel);
            zzg((zzbuk) zzasx.zza(parcel, zzbuk.CREATOR));
        } else if (i != 2) {
            zzbuj zzbujVar = null;
            zzbue zzbueVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbujVar = queryLocalInterface instanceof zzbuj ? (zzbuj) queryLocalInterface : new zzbuh(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzo(zzbujVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        zzs = zzs();
                        parcel2.writeNoException();
                        zzasx.zzd(parcel2, zzs);
                        break;
                    case 6:
                        zzh();
                        break;
                    case 7:
                        zzj();
                        break;
                    case 8:
                        zze();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzasx.zzc(parcel);
                        zzi(asInterface);
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzasx.zzc(parcel);
                        zzk(asInterface2);
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzasx.zzc(parcel);
                        zzf(asInterface3);
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzasx.zzc(parcel);
                        zzp(readString);
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                        zzasx.zzc(parcel);
                        zzl(zzb);
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        zzasx.zzf(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbueVar = queryLocalInterface2 instanceof zzbue ? (zzbue) queryLocalInterface2 : new zzbue(readStrongBinder2);
                        }
                        zzasx.zzc(parcel);
                        zzu(zzbueVar);
                        break;
                    case 17:
                        parcel.readString();
                        zzasx.zzc(parcel);
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzasx.zzc(parcel);
                        zzr(asInterface4);
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzasx.zzc(parcel);
                        zzm(readString2);
                        break;
                    case 20:
                        zzs = zzt();
                        parcel2.writeNoException();
                        zzasx.zzd(parcel2, zzs);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                        parcel2.writeNoException();
                        zzasx.zzg(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzn(zzh);
            }
        } else {
            zzq();
        }
        parcel2.writeNoException();
        return true;
    }
}
