package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    @o0OO00OO
    private final String zzb;
    @o0OO00OO
    private final ConsentDebugSettings zzc;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean zza;
        @o0OO00OO
        private String zzb;
        @o0OO00OO
        private ConsentDebugSettings zzc;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@o0OO00OO String str) {
            this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@o0OO00OO ConsentDebugSettings consentDebugSettings) {
            this.zzc = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    @RecentlyNullable
    public final String zza() {
        return this.zzb;
    }
}
