package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
/* loaded from: classes.dex */
public final class zzdb extends zzasv implements zzdd {
    public zzdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() throws RemoteException {
        zzbh(1, zza());
    }
}
