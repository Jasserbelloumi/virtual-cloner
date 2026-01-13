package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcei;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcei zzceiVar) throws zzf {
        this.zzb = zzceiVar.getLayoutParams();
        ViewParent parent = zzceiVar.getParent();
        this.zzd = zzceiVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzceiVar.zzF());
        viewGroup.removeView(zzceiVar.zzF());
        zzceiVar.zzan(true);
    }
}
