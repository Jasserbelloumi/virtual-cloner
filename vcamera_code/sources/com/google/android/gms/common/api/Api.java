package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder zaa;
    private final ClientKey zab;
    private final String zac;

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes.dex */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @oo0oO0
        @KeepForSdk
        @Deprecated
        public T buildClient(@oo0oO0 Context context, @oo0oO0 Looper looper, @oo0oO0 ClientSettings clientSettings, @oo0oO0 O o, @oo0oO0 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @oo0oO0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, (ClientSettings) o, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        @oo0oO0
        @KeepForSdk
        public T buildClient(@oo0oO0 Context context, @oo0oO0 Looper looper, @oo0oO0 ClientSettings clientSettings, @oo0oO0 O o, @oo0oO0 ConnectionCallbacks connectionCallbacks, @oo0oO0 OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface AnyClient {
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* loaded from: classes.dex */
    public interface ApiOptions {
        @oo0oO0
        public static final NoOptions NO_OPTIONS = new NoOptions(null);

        /* loaded from: classes.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @oo0oO0
            Account getAccount();
        }

        /* loaded from: classes.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @o0OO00OO
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* loaded from: classes.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* loaded from: classes.dex */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            public /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* loaded from: classes.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* loaded from: classes.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes.dex */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;
        @KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        @KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        @oo0oO0
        @KeepForSdk
        public List<Scope> getImpliedScopes(@o0OO00OO O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(@oo0oO0 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@oo0oO0 String str);

        @KeepForSdk
        void dump(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr);

        @oo0oO0
        @KeepForSdk
        Feature[] getAvailableFeatures();

        @oo0oO0
        @KeepForSdk
        String getEndpointPackageName();

        @o0OO00OO
        @KeepForSdk
        String getLastDisconnectMessage();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(@o0OO00OO IAccountAccessor iAccountAccessor, @o0OO00OO Set<Scope> set);

        @oo0oO0
        @KeepForSdk
        Feature[] getRequiredFeatures();

        @oo0oO0
        @KeepForSdk
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @o0OO00OO
        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @oo0oO0
        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(@oo0oO0 BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresAccount();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    @KeepForSdk
    public <C extends Client> Api(@oo0oO0 String str, @oo0oO0 AbstractClientBuilder<C, O> abstractClientBuilder, @oo0oO0 ClientKey<C> clientKey) {
        Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    @oo0oO0
    public final AbstractClientBuilder zaa() {
        return this.zaa;
    }

    @oo0oO0
    public final AnyClientKey zab() {
        return this.zab;
    }

    @oo0oO0
    public final BaseClientBuilder zac() {
        return this.zaa;
    }

    @oo0oO0
    public final String zad() {
        return this.zac;
    }
}
