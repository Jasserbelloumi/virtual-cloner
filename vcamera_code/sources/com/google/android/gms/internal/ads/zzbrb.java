package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbrb extends zzasw implements zzbrc {
    public zzbrb() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbrc zzF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbrc ? (zzbrc) queryLocalInterface : new zzbra(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzasx.zzc(parcel);
                zzk((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                zzr();
                break;
            case 4:
                zzp();
                break;
            case 5:
                zzn();
                break;
            case 6:
                Bundle bundle = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
                zzasx.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                zzasx.zzf(parcel2, bundle);
                return true;
            case 7:
                zzs();
                break;
            case 8:
                zzl();
                break;
            case 9:
                zzv();
                break;
            case 10:
                zzh();
                break;
            case 11:
                boolean zzE = zzE();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzE);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) zzasx.zza(parcel, Intent.CREATOR);
                zzasx.zzc(parcel);
                break;
            case 13:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(asInterface);
                break;
            case 14:
                zzt();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
