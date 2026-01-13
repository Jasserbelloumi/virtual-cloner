package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import o00oOooO.o0OO00OO;
@KeepForSdk
/* loaded from: classes.dex */
public interface ConnectionCallbacks {
    @ShowFirstParty
    @KeepForSdk
    void onConnected(@o0OO00OO Bundle bundle);

    @ShowFirstParty
    @KeepForSdk
    void onConnectionSuspended(int i);
}
