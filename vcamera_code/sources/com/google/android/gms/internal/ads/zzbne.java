package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzbne extends zzasw implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbnf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbnf ? (zzbnf) queryLocalInterface : new zzbnd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzb;
        boolean zze;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                zzasx.zzc(parcel);
                zze = zze(readString);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                zzb = zzc(readString2);
            } else if (i != 4) {
                return false;
            } else {
                String readString3 = parcel.readString();
                zzasx.zzc(parcel);
                zze = zzd(readString3);
            }
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zze);
            return true;
        }
        String readString4 = parcel.readString();
        zzasx.zzc(parcel);
        zzb = zzb(readString4);
        parcel2.writeNoException();
        zzasx.zzg(parcel2, zzb);
        return true;
    }
}
