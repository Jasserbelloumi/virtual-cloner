package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzcb;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzav extends DeferredLifecycleHelper {
    public OnDelegateCreatedListener zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List zzd = new ArrayList();

    @VisibleForTesting
    public zzav(Fragment fragment) {
        this.zzb = fragment;
    }

    public static /* synthetic */ void zza(zzav zzavVar, Activity activity) {
        zzavVar.zzc = activity;
        zzavVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzau) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            IMapFragmentDelegate zzf = zzcb.zza(this.zzc, null).zzf(ObjectWrapper.wrap(this.zzc));
            if (zzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new zzau(this.zzb, zzf));
            for (OnMapReadyCallback onMapReadyCallback : this.zzd) {
                ((zzau) getDelegate()).getMapAsync(onMapReadyCallback);
            }
            this.zzd.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
