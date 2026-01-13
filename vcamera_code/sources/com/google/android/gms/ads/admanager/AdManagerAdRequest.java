package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* loaded from: classes.dex */
    public static final class Builder extends AdRequest.Builder {
        @oo0oO0
        public Builder addCategoryExclusion(@oo0oO0 String str) {
            this.zza.zzp(str);
            return this;
        }

        @oo0oO0
        public Builder addCustomTargeting(@oo0oO0 String str, @oo0oO0 String str2) {
            this.zza.zzr(str, str2);
            return this;
        }

        @oo0oO0
        public Builder addCustomTargeting(@oo0oO0 String str, @oo0oO0 List<String> list) {
            if (list != null) {
                this.zza.zzr(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @oo0oO0
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @oo0oO0
        public Builder setPublisherProvidedId(@oo0oO0 String str) {
            this.zza.zzE(str);
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    @oo0oO0
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @oo0oO0
    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}
