package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    public final /* synthetic */ GoogleApiManager zaa;
    private final Api.Client zab;
    private final ApiKey zac;
    @o0OO00OO
    private IAccountAccessor zad = null;
    @o0OO00OO
    private Set zae = null;
    private boolean zaf = false;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @oO0Oo
    public final void zag() {
        IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@oo0oO0 ConnectionResult connectionResult) {
        Handler handler;
        handler = this.zaa.zat;
        handler.post(new zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @oO0Oo
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.zaa.zap;
        zabq zabqVar = (zabq) map.get(this.zac);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @oO0Oo
    public final void zaf(@o0OO00OO IAccountAccessor iAccountAccessor, @o0OO00OO Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new ConnectionResult(4));
            return;
        }
        this.zad = iAccountAccessor;
        this.zae = set;
        zag();
    }
}
