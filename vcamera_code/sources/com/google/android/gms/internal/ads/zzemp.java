package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzemp implements zzepn {
    private final zzfuu zza;
    @o0OO00OO
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzemp(zzfuu zzfuuVar, @o0OO00OO ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfuuVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemp.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzemq zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfv)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzemq(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfw)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzemq(bool);
            }
        }
        return new zzemq(null);
    }
}
