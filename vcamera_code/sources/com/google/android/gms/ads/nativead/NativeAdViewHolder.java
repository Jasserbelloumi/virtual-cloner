package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbza;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    @oo0oO0
    public static final WeakHashMap zza = new WeakHashMap();
    @NotOnlyInitialized
    private zzbeh zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(@oo0oO0 View view, @oo0oO0 Map<String, View> map, @oo0oO0 Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzbza.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzbza.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzay.zza().zzi(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(@oo0oO0 View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbza.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public void unregisterNativeAd() {
        zzbeh zzbehVar = this.zzb;
        if (zzbehVar != null) {
            try {
                zzbehVar.zzd();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
