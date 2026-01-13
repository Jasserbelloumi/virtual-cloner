package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.o00oOOo0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final o00oOOo0 zaa;

    public AvailabilityException(@oo0oO0 o00oOOo0 o00oooo02) {
        this.zaa = o00oooo02;
    }

    @oo0oO0
    public ConnectionResult getConnectionResult(@oo0oO0 GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.get(apiKey) != 0;
        String zaa = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @oo0oO0
    public ConnectionResult getConnectionResult(@oo0oO0 HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.get(apiKey) != 0;
        String zaa = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    @oo0oO0
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
