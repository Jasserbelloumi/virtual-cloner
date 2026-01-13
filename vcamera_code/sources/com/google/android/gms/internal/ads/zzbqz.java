package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbqz extends RemoteCreator {
    public zzbqz() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbrf ? (zzbrf) queryLocalInterface : new zzbrd(iBinder);
    }

    @o0OO00OO
    public final zzbrc zza(Activity activity) {
        try {
            IBinder zze = ((zzbrf) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbrc ? (zzbrc) queryLocalInterface : new zzbra(zze);
        } catch (RemoteException e) {
            zzbza.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzbza.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
