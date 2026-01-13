package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
abstract class zzcad {
    private final WeakReference zza;

    public zzcad(View view) {
        this.zza = new WeakReference(view);
    }

    public abstract void zza(ViewTreeObserver viewTreeObserver);

    public abstract void zzb(ViewTreeObserver viewTreeObserver);

    @o0OO00OO
    public final ViewTreeObserver zzc() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void zzd() {
        ViewTreeObserver zzc = zzc();
        if (zzc != null) {
            zza(zzc);
        }
    }

    public final void zze() {
        ViewTreeObserver zzc = zzc();
        if (zzc != null) {
            zzb(zzc);
        }
    }
}
