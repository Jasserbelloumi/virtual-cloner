package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.zzcb;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzas extends DeferredLifecycleHelper {
    public OnDelegateCreatedListener zza;
    private final ViewGroup zzb;
    private final Context zzc;
    @o0OO00OO
    private final StreetViewPanoramaOptions zzd;
    private final List zze = new ArrayList();

    @VisibleForTesting
    public zzas(ViewGroup viewGroup, Context context, @o0OO00OO StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzar) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new zzar(this.zzb, zzcb.zza(this.zzc, null).zzi(ObjectWrapper.wrap(this.zzc), this.zzd)));
            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.zze) {
                ((zzar) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            }
            this.zze.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
