package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zza;
    private final Bundle zzb;
    private final Bundle zzc;
    private final Context zzd;
    private final boolean zze;
    private final int zzf;
    private final int zzg;
    @o0OO00OO
    private final String zzh;
    private final String zzi;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 Bundle bundle, @oo0oO0 Bundle bundle2, boolean z, @o0OO00OO Location location, int i, int i2, @o0OO00OO String str2, @oo0oO0 String str3) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = bundle2;
        this.zzd = context;
        this.zze = z;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str2;
        this.zzi = str3;
    }

    @oo0oO0
    public String getBidResponse() {
        return this.zza;
    }

    @oo0oO0
    public Context getContext() {
        return this.zzd;
    }

    @o0OO00OO
    public String getMaxAdContentRating() {
        return this.zzh;
    }

    @oo0oO0
    public Bundle getMediationExtras() {
        return this.zzc;
    }

    @oo0oO0
    public Bundle getServerParameters() {
        return this.zzb;
    }

    @oo0oO0
    public String getWatermark() {
        return this.zzi;
    }

    public boolean isTestRequest() {
        return this.zze;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzg;
    }
}
