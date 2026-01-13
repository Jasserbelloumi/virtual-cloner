package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class zzbft extends zzasw implements zzbfu {
    public zzbft() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzq;
        List zzu;
        IInterface zzk;
        boolean zzI;
        zzbfr zzbfpVar;
        switch (i) {
            case 2:
                zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                zzq = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                zzk = zzk();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 6:
                zzq = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 7:
                zzq = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzq = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 10:
                zzq = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 11:
                zzk = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 12:
                zzq = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzk = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 15:
                zzasx.zzc(parcel);
                zzz((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                zzasx.zzc(parcel);
                zzI = zzI((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzI);
                return true;
            case 17:
                zzasx.zzc(parcel);
                zzB((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                zzk = zzm();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbfpVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbfpVar = queryLocalInterface instanceof zzbfr ? (zzbfr) queryLocalInterface : new zzbfp(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzF(zzbfpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                zzu = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 24:
                zzI = zzH();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzI);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzcw zzb = com.google.android.gms.ads.internal.client.zzcv.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzy(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzcs zzb2 = com.google.android.gms.ads.internal.client.zzcr.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzD(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzk = zzj();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 30:
                zzI = zzG();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzI);
                return true;
            case 31:
                zzk = zzg();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzE(zzb3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
