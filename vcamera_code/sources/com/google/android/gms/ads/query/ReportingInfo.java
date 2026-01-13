package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.List;
import java.util.Map;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzbrz zza;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzbry zza;

        @KeepForSdk
        public Builder(@oo0oO0 View view) {
            zzbry zzbryVar = new zzbry();
            this.zza = zzbryVar;
            zzbryVar.zzb(view);
        }

        @oo0oO0
        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @oo0oO0
        @KeepForSdk
        public Builder setAssetViews(@oo0oO0 Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbrz(builder.zza);
    }

    @KeepForSdk
    public void recordClick(@oo0oO0 List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(@oo0oO0 List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(@oo0oO0 MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(@oo0oO0 Uri uri, @oo0oO0 UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(@oo0oO0 List<Uri> list, @oo0oO0 UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
