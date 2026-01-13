package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.media.o00oOOo0;
import android.util.DisplayMetrics;
import androidx.fragment.app.o0O00;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    @oo0oO0
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    @oo0oO0
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    @oo0oO0
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    @oo0oO0
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    @oo0oO0
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    @oo0oO0
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    @oo0oO0
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    @oo0oO0
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    @oo0oO0
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    @oo0oO0
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    @oo0oO0
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i, int i2) {
        this(i, i2, o0O00.o00oOOo0(i == -1 ? "FULL" : String.valueOf(i), "x", i2 == -2 ? "AUTO" : String.valueOf(i2), "_as"));
    }

    @oo0oO0
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        AdSize zzc = zzbyt.zzc(context, i, 50, 0);
        zzc.zze = true;
        return zzc;
    }

    @oo0oO0
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        int zza2 = zzbyt.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @oo0oO0
    public static AdSize getCurrentOrientationInterscrollerAdSize(@oo0oO0 Context context, int i) {
        return zzj(i, zzbyt.zza(context, 0));
    }

    @oo0oO0
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            zzbza.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @oo0oO0
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        AdSize zzc = zzbyt.zzc(context, i, 50, 2);
        zzc.zze = true;
        return zzc;
    }

    @oo0oO0
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        int zza2 = zzbyt.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @oo0oO0
    public static AdSize getLandscapeInterscrollerAdSize(@oo0oO0 Context context, int i) {
        return zzj(i, zzbyt.zza(context, 2));
    }

    @oo0oO0
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        AdSize zzc = zzbyt.zzc(context, i, 50, 1);
        zzc.zze = true;
        return zzc;
    }

    @oo0oO0
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@oo0oO0 Context context, int i) {
        int zza2 = zzbyt.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @oo0oO0
    public static AdSize getPortraitInterscrollerAdSize(@oo0oO0 Context context, int i) {
        return zzj(i, zzbyt.zza(context, 1));
    }

    private static AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzi = i2;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@oo0oO0 Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzay.zzb();
            return zzbyt.zzy(context, this.zzc);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@oo0oO0 Context context) {
        int i = this.zzb;
        if (i != -3) {
            if (i != -1) {
                zzay.zzb();
                return zzbyt.zzy(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @oo0oO0
    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i) {
        this.zzg = i;
    }

    public final void zzd(int i) {
        this.zzi = i;
    }

    public final void zze(boolean z) {
        this.zzf = true;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("Invalid width for AdSize: ", i));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("Invalid height for AdSize: ", i2));
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }
}
