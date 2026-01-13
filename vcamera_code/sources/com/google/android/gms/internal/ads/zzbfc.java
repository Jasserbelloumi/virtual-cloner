package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzbfc extends zzasv implements zzbfe {
    public zzbfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzberVar);
        zzbh(1, zza);
    }
}
