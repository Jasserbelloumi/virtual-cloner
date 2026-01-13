package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IObjectWrapper zzc;
        if (i == 1) {
            com.google.android.gms.internal.maps.zzaa zzb = com.google.android.gms.internal.maps.zzz.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzc(parcel);
            zzc = zzc(zzb);
        } else if (i != 2) {
            return false;
        } else {
            com.google.android.gms.internal.maps.zzaa zzb2 = com.google.android.gms.internal.maps.zzz.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzc(parcel);
            zzc = zzb(zzb2);
        }
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzg(parcel2, zzc);
        return true;
    }
}
