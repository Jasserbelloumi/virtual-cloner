package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbdw extends zzasw implements zzbdx {
    public zzbdw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbdx zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbdx ? (zzbdx) queryLocalInterface : new zzbdv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int zzd;
        if (i == 1) {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzf);
        } else if (i == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zze);
        } else if (i != 3) {
            if (i == 4) {
                zzd = zzd();
            } else if (i != 5) {
                return false;
            } else {
                zzd = zzc();
            }
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        }
        return true;
    }
}
