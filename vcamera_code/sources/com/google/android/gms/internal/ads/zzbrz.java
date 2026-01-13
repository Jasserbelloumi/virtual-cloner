package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbrz {
    @Nonnull
    private final View zza;
    @o0OO00OO
    private final Map zzb;
    @o0OO00OO
    private final zzbxr zzc;

    public zzbrz(zzbry zzbryVar) {
        View view;
        Map map;
        View view2;
        view = zzbryVar.zza;
        this.zza = view;
        map = zzbryVar.zzb;
        this.zzb = map;
        view2 = zzbryVar.zza;
        zzbxr zza = zzbrt.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzf(new zzbsa(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzbza.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzbza.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzbza.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbrx(this, list));
        } catch (RemoteException e) {
            zzbza.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzbza.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbxr zzbxrVar = this.zzc;
        if (zzbxrVar == null) {
            zzbza.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbxrVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbrw(this, list));
        } catch (RemoteException e) {
            zzbza.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbxr zzbxrVar = this.zzc;
        if (zzbxrVar == null) {
            zzbza.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbxrVar.zzj(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzbza.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbrv(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbru(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
