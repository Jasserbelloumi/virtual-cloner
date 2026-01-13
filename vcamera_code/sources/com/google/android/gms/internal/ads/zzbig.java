package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import o00ooOoo.oO0O0O0;
/* loaded from: classes2.dex */
public final class zzbig implements zzbhp {
    private final Context zza;

    public zzbig(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(oO0O0O0.f9045o00oOo0O)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(oO0O0O0.f9045o00oOo0O));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(this.zza, intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
