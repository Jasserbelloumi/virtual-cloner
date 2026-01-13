package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbjz extends zzasw implements zzbka {
    public zzbjz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzb;
        zzbkd zzbkbVar;
        if (i != 3) {
            if (i == 4) {
                zzd();
            } else if (i == 5) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbkbVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbkbVar = queryLocalInterface instanceof zzbkd ? (zzbkd) queryLocalInterface : new zzbkb(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzf(asInterface, zzbkbVar);
            } else if (i == 6) {
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zze(asInterface2);
            } else if (i != 7) {
                return false;
            } else {
                zzb = zzc();
            }
            parcel2.writeNoException();
            return true;
        }
        zzb = zzb();
        parcel2.writeNoException();
        zzasx.zzg(parcel2, zzb);
        return true;
    }
}
