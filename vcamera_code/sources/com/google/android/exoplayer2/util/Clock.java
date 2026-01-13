package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface Clock {
    public static final Clock DEFAULT = new SystemClock();

    HandlerWrapper createHandler(Looper looper, @o0OO00OO Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    void onThreadBlocked();

    long uptimeMillis();
}
