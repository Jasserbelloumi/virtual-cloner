package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface zaca {
    ConnectionResult zab();

    ConnectionResult zac(long j, TimeUnit timeUnit);

    @o0OO00OO
    ConnectionResult zad(@oo0oO0 Api api);

    BaseImplementation.ApiMethodImpl zae(@oo0oO0 BaseImplementation.ApiMethodImpl apiMethodImpl);

    BaseImplementation.ApiMethodImpl zaf(@oo0oO0 BaseImplementation.ApiMethodImpl apiMethodImpl);

    void zaq();

    void zar();

    void zas(String str, @o0OO00OO FileDescriptor fileDescriptor, PrintWriter printWriter, @o0OO00OO String[] strArr);

    void zat();

    void zau();

    boolean zaw();

    boolean zax();

    boolean zay(SignInConnectionListener signInConnectionListener);
}
