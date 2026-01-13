package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
final class zaba implements GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ StatusPendingResult zaa;

    public zaba(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@oo0oO0 ConnectionResult connectionResult) {
        this.zaa.setResult(new Status(8));
    }
}
