package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Date;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class AdRequest {
    @oo0oO0
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    public final zzdx zza;

    /* loaded from: classes.dex */
    public static class Builder {
        public final zzdw zza;

        public Builder() {
            zzdw zzdwVar = new zzdw();
            this.zza = zzdwVar;
            zzdwVar.zzv("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @oo0oO0
        public Builder addCustomEventExtrasBundle(@oo0oO0 Class<? extends CustomEvent> cls, @oo0oO0 Bundle bundle) {
            this.zza.zzq(cls, bundle);
            return this;
        }

        @oo0oO0
        public Builder addKeyword(@oo0oO0 String str) {
            this.zza.zzs(str);
            return this;
        }

        @oo0oO0
        public Builder addNetworkExtrasBundle(@oo0oO0 Class<? extends MediationExtrasReceiver> cls, @oo0oO0 Bundle bundle) {
            this.zza.zzt(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @oo0oO0
        public AdRequest build() {
            return new AdRequest(this);
        }

        @oo0oO0
        public Builder setAdString(@oo0oO0 String str) {
            this.zza.zzx(str);
            return this;
        }

        @oo0oO0
        public Builder setContentUrl(@oo0oO0 String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            int length = str.length();
            Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zza.zzz(str);
            return this;
        }

        @oo0oO0
        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzB(i);
            return this;
        }

        @oo0oO0
        public Builder setNeighboringContentUrls(@oo0oO0 List<String> list) {
            if (list == null) {
                zzbza.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzD(list);
            return this;
        }

        @oo0oO0
        public Builder setRequestAgent(@oo0oO0 String str) {
            this.zza.zzF(str);
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zza(@oo0oO0 String str) {
            this.zza.zzv(str);
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zzb(@oo0oO0 Date date) {
            this.zza.zzy(date);
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzA(i);
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzC(z);
            return this;
        }

        @oo0oO0
        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzG(z);
            return this;
        }
    }

    public AdRequest(@oo0oO0 Builder builder) {
        this.zza = new zzdx(builder.zza, null);
    }

    @o0OO00OO
    public String getAdString() {
        return this.zza.zzj();
    }

    @oo0oO0
    public String getContentUrl() {
        return this.zza.zzk();
    }

    @o0OO00OO
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @oo0oO0
    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    @oo0oO0
    public Set<String> getKeywords() {
        return this.zza.zzq();
    }

    @oo0oO0
    public List<String> getNeighboringContentUrls() {
        return this.zza.zzo();
    }

    @o0OO00OO
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.zzf(cls);
    }

    @oo0oO0
    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(@oo0oO0 Context context) {
        return this.zza.zzs(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}
