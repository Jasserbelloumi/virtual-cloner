package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o00oOooO.o0OO00OO;
import o00ooo0.o0;
/* loaded from: classes2.dex */
public final class zao extends o0 {
    @o0OO00OO
    @Deprecated
    public static Intent zaa(Context context, @o0OO00OO BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
