package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzcmi implements zzcls {
    private final CookieManager zza;

    public zzcmi(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaH), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaH);
        String cookie = this.zza.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List zzf = zzfoh.zzc(zzfng.zzc(';')).zzf(cookie);
        for (int i = 0; i < zzf.size(); i++) {
            CookieManager cookieManager = this.zza;
            Iterator it = zzfoh.zzc(zzfng.zzc('=')).zzd((String) zzf.get(i)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException(o00ooO0.o00oOoO.o00oOOo0("position (0) must be less than the number of elements that remained (", 0, ")"));
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzau))));
        }
    }
}
