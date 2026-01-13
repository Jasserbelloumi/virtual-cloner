package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class zzasz extends zzasw implements zzata {
    public static zzata zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzata ? (zzata) queryLocalInterface : new zzasy(iBinder);
    }
}
