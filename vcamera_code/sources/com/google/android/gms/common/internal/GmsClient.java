package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    @o0OO00OO
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set zac;
    @o0OO00OO
    private final Account zad;

    @VisibleForTesting
    @KeepForSdk
    public GmsClient(@oo0oO0 Context context, @oo0oO0 Handler handler, int i, @oo0oO0 ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, null, null);
        this.zab = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }

    @KeepForSdk
    public GmsClient(@oo0oO0 Context context, @oo0oO0 Looper looper, int i, @oo0oO0 ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, null, null);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@oo0oO0 Context context, @oo0oO0 Looper looper, int i, @oo0oO0 ClientSettings clientSettings, @oo0oO0 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @oo0oO0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(@oo0oO0 Context context, @oo0oO0 Looper looper, int i, @oo0oO0 ClientSettings clientSettings, @oo0oO0 ConnectionCallbacks connectionCallbacks, @oo0oO0 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @VisibleForTesting
    public GmsClient(@oo0oO0 Context context, @oo0oO0 Looper looper, @oo0oO0 GmsClientSupervisor gmsClientSupervisor, @oo0oO0 GoogleApiAvailability googleApiAvailability, int i, @oo0oO0 ClientSettings clientSettings, @o0OO00OO ConnectionCallbacks connectionCallbacks, @o0OO00OO OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, connectionCallbacks == null ? null : new zah(connectionCallbacks), onConnectionFailedListener == null ? null : new zai(onConnectionFailedListener), clientSettings.zac());
        this.zab = clientSettings;
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }

    private final Set zaa(@oo0oO0 Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope scope : validateScopes) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0OO00OO
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @o0OO00OO
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @oo0oO0
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @oo0oO0
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @oo0oO0
    @KeepForSdk
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @oo0oO0
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    @oo0oO0
    @KeepForSdk
    public Set<Scope> validateScopes(@oo0oO0 Set<Scope> set) {
        return set;
    }
}
