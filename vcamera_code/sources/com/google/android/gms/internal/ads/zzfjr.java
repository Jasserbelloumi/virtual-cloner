package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes2.dex */
public final class zzfjr {
    @VisibleForTesting
    public final zzfju zza;
    @VisibleForTesting
    public final boolean zzb;

    private zzfjr(zzfju zzfjuVar) {
        this.zza = zzfjuVar;
        this.zzb = zzfjuVar != null;
    }

    public static zzfjr zzb(Context context, String str, String str2) {
        zzfju zzfjsVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfjsVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfjsVar = queryLocalInterface instanceof zzfju ? (zzfju) queryLocalInterface : new zzfjs(instantiate);
                    }
                    zzfjsVar.zze(ObjectWrapper.wrap(context), str, null);
                    return new zzfjr(zzfjsVar);
                } catch (Exception e) {
                    throw new zzfit(e);
                }
            } catch (RemoteException | zzfit | NullPointerException | SecurityException unused) {
                return new zzfjr(new zzfjv());
            }
        } catch (Exception e2) {
            throw new zzfit(e2);
        }
    }

    public static zzfjr zzc() {
        return new zzfjr(new zzfjv());
    }

    public final zzfjq zza(byte[] bArr) {
        return new zzfjq(this, bArr, null);
    }
}
