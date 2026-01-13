package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzfjt extends zzasw implements zzfju {
    public zzfjt() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
