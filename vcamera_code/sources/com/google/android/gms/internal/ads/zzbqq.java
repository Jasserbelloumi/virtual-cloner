package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbqq implements NativeCustomFormatAd {
    private final zzber zza;
    private NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    @VisibleForTesting
    public zzbqq(zzber zzberVar) {
        this.zza = zzberVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @o0OO00OO
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @o0OO00OO
    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbqi(this.zza);
            }
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @o0OO00OO
    public final NativeAd.Image getImage(String str) {
        try {
            zzbdx zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbqj(zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @o0OO00OO
    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new com.google.android.gms.ads.internal.client.zzep(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    @o0OO00OO
    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }
}
