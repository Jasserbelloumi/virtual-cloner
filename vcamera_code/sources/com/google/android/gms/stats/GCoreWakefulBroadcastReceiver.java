package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00o0o.o00oo00O;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GCoreWakefulBroadcastReceiver extends o00oo00O {
    @KeepForSdk
    public static boolean completeWakefulIntent(@oo0oO0 Context context, @o0OO00OO Intent intent) {
        if (intent == null) {
            return false;
        }
        return o00oo00O.completeWakefulIntent(intent);
    }
}
