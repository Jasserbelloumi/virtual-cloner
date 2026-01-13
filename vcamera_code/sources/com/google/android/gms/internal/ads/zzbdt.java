package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbdt extends zzasw implements zzbdu {
    public zzbdt() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        float zze;
        IInterface zzi;
        zzbff zzbffVar;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                zzi = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzi);
                return true;
            case 5:
                zze = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 6:
                zze = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 7:
                zzi = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzi);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzk);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbffVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbffVar = queryLocalInterface instanceof zzbff ? (zzbff) queryLocalInterface : new zzbff(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzl(zzbffVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
