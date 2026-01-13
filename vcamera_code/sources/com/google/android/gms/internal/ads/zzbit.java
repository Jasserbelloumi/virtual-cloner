package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(api = 21)
/* loaded from: classes2.dex */
public final class zzbit {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    @o0OO00OO
    private zzbip zzc;

    public zzbit(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbar.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziO)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziQ)).intValue()) {
                zzbza.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zza().zzl(this.zza, new zzbnc(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziO)).booleanValue()) {
            zzd();
            zzbip zzbipVar = this.zzc;
            if (zzbipVar != null) {
                try {
                    zzbipVar.zze();
                } catch (RemoteException e) {
                    zzbza.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (zzc(str)) {
            zzd();
            zzbip zzbipVar = this.zzc;
            if (zzbipVar != null) {
                try {
                    zzbipVar.zzf(str);
                    return true;
                } catch (RemoteException e) {
                    zzbza.zzl("#007 Could not call remote method.", e);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
