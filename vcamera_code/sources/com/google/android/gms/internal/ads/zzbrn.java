package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public final class zzbrn extends zzasw implements zzbro {
    public static zzbro zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof zzbro ? (zzbro) queryLocalInterface : new zzbrm(iBinder);
    }
}
