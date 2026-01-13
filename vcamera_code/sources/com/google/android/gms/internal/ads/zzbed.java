package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class zzbed extends zzasw implements zzbee {
    public static zzbee zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbee ? (zzbee) queryLocalInterface : new zzbec(iBinder);
    }
}
