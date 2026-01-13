package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.o00oOOo0;
import androidx.work.o00oOOoO;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o00oo00O;
import o0O0Ooo0.o0O000;
import o0O0Ooo0.o0O0000O;
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            o0O00O0.o00ooO0o(context.getApplicationContext(), new o00oOOo0(new o00oOOo0.o00oOOoO()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@oo0oO0 IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            o0O00O0 o00ooOoO2 = o0O00O0.o00ooOoO(context);
            o00ooOoO2.o00oOo0o("offline_ping_sender_work");
            o00oo00O.o00oOOo0 o00oooo02 = new o00oo00O.o00oOOo0();
            o00oooo02.f12158o00oOo00 = o0O0000O.CONNECTED;
            o00ooOoO2.o00oOoo0(new o0O000.o00oOOo0(OfflinePingSender.class).o00oOoOO(new o00oo00O(o00oooo02)).o00oOOo0("offline_ping_sender_work").o00oOOoO());
        } catch (IllegalStateException e) {
            zzbza.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@oo0oO0 IObjectWrapper iObjectWrapper, @oo0oO0 String str, @oo0oO0 String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        o00oo00O.o00oOOo0 o00oooo02 = new o00oo00O.o00oOOo0();
        o00oooo02.f12158o00oOo00 = o0O0000O.CONNECTED;
        o00oo00O o00oo00o = new o00oo00O(o00oooo02);
        o00oOOoO.o00oOOo0 o00oooo03 = new o00oOOoO.o00oOOo0();
        o00oooo03.f5766o00oOOo0.put("uri", str);
        o00oooo03.f5766o00oOOo0.put("gws_query_id", str2);
        try {
            o0O00O0.o00ooOoO(context).o00oOoo0(new o0O000.o00oOOo0(OfflineNotificationPoster.class).o00oOoOO(o00oo00o).o00oo0OO(o00oooo03.o00oOOo0()).o00oOOo0("offline_notification_work").o00oOOoO());
            return true;
        } catch (IllegalStateException e) {
            zzbza.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
