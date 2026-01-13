package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zza;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzb zza = new zzb();
        private final Bundle zzb = new Bundle();

        @oo0oO0
        public Builder addCustomEventExtrasBundle(@oo0oO0 Class<? extends CustomEvent> cls, @oo0oO0 Bundle bundle) {
            this.zza.zzb(cls, bundle);
            return this;
        }

        @oo0oO0
        public Builder addNetworkExtras(@oo0oO0 NetworkExtras networkExtras) {
            this.zza.zzc(networkExtras);
            return this;
        }

        @oo0oO0
        public Builder addNetworkExtrasBundle(@oo0oO0 Class<? extends MediationAdapter> cls, @oo0oO0 Bundle bundle) {
            this.zza.zzd(cls, bundle);
            return this;
        }

        @oo0oO0
        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        @oo0oO0
        public Builder setAdBorderSelectors(@oo0oO0 String str) {
            this.zzb.putString("csa_adBorderSelectors", str);
            return this;
        }

        @oo0oO0
        public Builder setAdTest(boolean z) {
            this.zzb.putString("csa_adtest", true != z ? o0OOo00O.oo0oO0.f14130o00oOo0O : o0OOo00O.oo0oO0.f14135o00oOooO);
            return this;
        }

        @oo0oO0
        public Builder setAdjustableLineHeight(int i) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setAdvancedOptionValue(@oo0oO0 String str, @oo0oO0 String str2) {
            this.zzb.putString(str, str2);
            return this;
        }

        @oo0oO0
        public Builder setAttributionSpacingBelow(int i) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setBorderSelections(@oo0oO0 String str) {
            this.zzb.putString("csa_borderSelections", str);
            return this;
        }

        @oo0oO0
        public Builder setChannel(@oo0oO0 String str) {
            this.zzb.putString("csa_channel", str);
            return this;
        }

        @oo0oO0
        public Builder setColorAdBorder(@oo0oO0 String str) {
            this.zzb.putString("csa_colorAdBorder", str);
            return this;
        }

        @oo0oO0
        public Builder setColorAdSeparator(@oo0oO0 String str) {
            this.zzb.putString("csa_colorAdSeparator", str);
            return this;
        }

        @oo0oO0
        public Builder setColorAnnotation(@oo0oO0 String str) {
            this.zzb.putString("csa_colorAnnotation", str);
            return this;
        }

        @oo0oO0
        public Builder setColorAttribution(@oo0oO0 String str) {
            this.zzb.putString("csa_colorAttribution", str);
            return this;
        }

        @oo0oO0
        public Builder setColorBackground(@oo0oO0 String str) {
            this.zzb.putString("csa_colorBackground", str);
            return this;
        }

        @oo0oO0
        public Builder setColorBorder(@oo0oO0 String str) {
            this.zzb.putString("csa_colorBorder", str);
            return this;
        }

        @oo0oO0
        public Builder setColorDomainLink(@oo0oO0 String str) {
            this.zzb.putString("csa_colorDomainLink", str);
            return this;
        }

        @oo0oO0
        public Builder setColorText(@oo0oO0 String str) {
            this.zzb.putString("csa_colorText", str);
            return this;
        }

        @oo0oO0
        public Builder setColorTitleLink(@oo0oO0 String str) {
            this.zzb.putString("csa_colorTitleLink", str);
            return this;
        }

        @oo0oO0
        public Builder setCssWidth(int i) {
            this.zzb.putString("csa_width", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setDetailedAttribution(boolean z) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setFontFamily(@oo0oO0 String str) {
            this.zzb.putString("csa_fontFamily", str);
            return this;
        }

        @oo0oO0
        public Builder setFontFamilyAttribution(@oo0oO0 String str) {
            this.zzb.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        @oo0oO0
        public Builder setFontSizeAnnotation(int i) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setFontSizeAttribution(int i) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setFontSizeDescription(int i) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setFontSizeDomainLink(int i) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setFontSizeTitle(int i) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setHostLanguage(@oo0oO0 String str) {
            this.zzb.putString("csa_hl", str);
            return this;
        }

        @oo0oO0
        public Builder setIsClickToCallEnabled(boolean z) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsLocationEnabled(boolean z) {
            this.zzb.putString("csa_location", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsPlusOnesEnabled(boolean z) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsSiteLinksEnabled(boolean z) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsTitleBold(boolean z) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setIsTitleUnderlined(boolean z) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        @oo0oO0
        public Builder setLocationColor(@oo0oO0 String str) {
            this.zzb.putString("csa_colorLocation", str);
            return this;
        }

        @oo0oO0
        public Builder setLocationFontSize(int i) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setLongerHeadlines(boolean z) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        @oo0oO0
        public Builder setNumber(int i) {
            this.zzb.putString("csa_number", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setPage(int i) {
            this.zzb.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        @oo0oO0
        public Builder setQuery(@oo0oO0 String str) {
            this.zza.zze(str);
            return this;
        }

        @oo0oO0
        public Builder setStyleId(@oo0oO0 String str) {
            this.zzb.putString("csa_styleId", str);
            return this;
        }

        @oo0oO0
        public Builder setVerticalSpacing(int i) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }
    }

    public /* synthetic */ DynamicHeightSearchAdRequest(Builder builder, zza zzaVar) {
        this.zza = new SearchAdRequest(builder.zza, null);
    }

    @o0OO00OO
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.getCustomEventExtrasBundle(cls);
    }

    @o0OO00OO
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.getNetworkExtrasBundle(cls);
    }

    @oo0oO0
    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(@oo0oO0 Context context) {
        return this.zza.isTestDevice(context);
    }

    public final zzdx zza() {
        return this.zza.zza();
    }
}
