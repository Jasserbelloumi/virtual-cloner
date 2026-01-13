package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public final class zzbnm extends zzasv implements zzbno {
    public zzbnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final IObjectWrapper zze() throws RemoteException {
        return com.google.android.gms.ads.internal.client.o00oOOo0.o00oOOo0(zzbg(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final boolean zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
