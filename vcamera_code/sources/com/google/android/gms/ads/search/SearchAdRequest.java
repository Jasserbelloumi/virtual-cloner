package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
@Deprecated
/* loaded from: classes.dex */
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    @oo0oO0
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    @NotOnlyInitialized
    private final zzdx zza;
    private final String zzb;

    public /* synthetic */ SearchAdRequest(zzb zzbVar, zzc zzcVar) {
        String str;
        zzdw zzdwVar;
        str = zzbVar.zzb;
        this.zzb = str;
        zzdwVar = zzbVar.zza;
        this.zza = new zzdx(zzdwVar, this);
    }

    @Deprecated
    public int getAnchorTextColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientBottom() {
        return 0;
    }

    @Deprecated
    public int getBackgroundGradientTop() {
        return 0;
    }

    @Deprecated
    public int getBorderColor() {
        return 0;
    }

    @Deprecated
    public int getBorderThickness() {
        return 0;
    }

    @Deprecated
    public int getBorderType() {
        return 0;
    }

    @Deprecated
    public int getCallButtonColor() {
        return 0;
    }

    @o0OO00OO
    @Deprecated
    public String getCustomChannels() {
        return null;
    }

    @o0OO00OO
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @o0OO00OO
    @Deprecated
    public String getFontFace() {
        return null;
    }

    @Deprecated
    public int getHeaderTextColor() {
        return 0;
    }

    @Deprecated
    public int getHeaderTextSize() {
        return 0;
    }

    @oo0oO0
    public Location getLocation() {
        return null;
    }

    @o0OO00OO
    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(@oo0oO0 Class<T> cls) {
        return (T) this.zza.zzh(cls);
    }

    @o0OO00OO
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@oo0oO0 Class<T> cls) {
        return this.zza.zzf(cls);
    }

    @oo0oO0
    public String getQuery() {
        return this.zzb;
    }

    public boolean isTestDevice(@oo0oO0 Context context) {
        return this.zza.zzs(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}
