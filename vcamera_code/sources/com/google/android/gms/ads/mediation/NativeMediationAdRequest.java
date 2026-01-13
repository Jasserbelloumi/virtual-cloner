package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    @oo0oO0
    @Deprecated
    NativeAdOptions getNativeAdOptions();

    @oo0oO0
    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    @oo0oO0
    Map zza();

    boolean zzb();
}
