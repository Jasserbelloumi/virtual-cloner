package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
/* loaded from: classes.dex */
public abstract class zzbm extends zzasw implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zze;
        if (i != 1) {
            if (i == 2) {
                zze = zze();
            } else if (i == 3) {
                boolean zzi = zzi();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzi);
                return true;
            } else if (i == 4) {
                zze = zzf();
            } else if (i != 5) {
                return false;
            } else {
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                zzh((zzl) zzasx.zza(parcel, zzl.CREATOR), readInt);
            }
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        zzasx.zzc(parcel);
        zzg((zzl) zzasx.zza(parcel, zzl.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
