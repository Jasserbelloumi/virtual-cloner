package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.o00oOoO;
import android.view.View;
import androidx.collection.o00oOOo0;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    @oo0oO0
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    @GuardedBy("sAllClients")
    private static final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        @o0OO00OO
        private Account zaa;
        private final Set zab;
        private final Set zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map zah;
        private final Context zai;
        private final Map zaj;
        private LifecycleActivity zak;
        private int zal;
        @o0OO00OO
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder zap;
        private final ArrayList zaq;
        private final ArrayList zar;

        public Builder(@oo0oO0 Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new o00oOOo0();
            this.zaj = new o00oOOo0();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList();
            this.zar = new ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        public Builder(@oo0oO0 Context context, @oo0oO0 ConnectionCallbacks connectionCallbacks, @oo0oO0 OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }

        private final void zab(Api api, @o0OO00OO Api.ApiOptions apiOptions, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(apiOptions));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder addApi(@oo0oO0 Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@oo0oO0 Api<O> api, @oo0oO0 O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@oo0oO0 Api<O> api, @oo0oO0 O o, @oo0oO0 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            zab(api, o, scopeArr);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@oo0oO0 Api<? extends Api.ApiOptions.NotRequiredOptions> api, @oo0oO0 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder addConnectionCallbacks(@oo0oO0 ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder addOnConnectionFailedListener(@oo0oO0 OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder addScope(@oo0oO0 Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        @oo0oO0
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings zaa = zaa();
            Map zad = zaa.zad();
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oOOo0 o00oooo03 = new o00oOOo0();
            ArrayList arrayList = new ArrayList();
            Api api = null;
            boolean z = false;
            for (Api api2 : this.zaj.keySet()) {
                Object obj = this.zaj.get(api2);
                boolean z2 = zad.get(api2) != null;
                o00oooo02.put(api2, Boolean.valueOf(z2));
                zat zatVar = new zat(api2, z2);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (ClientSettings) obj, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                o00oooo03.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = obj != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api != null) {
                        throw new IllegalStateException(o00oOoO.o00oOOo0(api2.zad(), " cannot be used with ", api.zad()));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    throw new IllegalStateException(o00oOoO.o00oOOo0("With using ", api.zad(), ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
                Preconditions.checkState(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, zaa, this.zao, this.zap, o00oooo02, this.zaq, this.zar, o00oooo03, this.zal, zabe.zad(o00oooo03.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        @oo0oO0
        public Builder enableAutoManage(@oo0oO0 FragmentActivity fragmentActivity, int i, @o0OO00OO OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zal = i;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @oo0oO0
        public Builder enableAutoManage(@oo0oO0 FragmentActivity fragmentActivity, @o0OO00OO OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder setAccountName(@oo0oO0 String str) {
            this.zaa = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder setGravityForPopups(int i) {
            this.zad = i;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder setHandler(@oo0oO0 Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder setViewForPopups(@oo0oO0 View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @oo0oO0
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @VisibleForTesting
        @oo0oO0
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map map = this.zaj;
            Api api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@oo0oO0 String str, @oo0oO0 FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @oo0oO0 String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            String str2 = str + "  ";
            int i = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(str2, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @oo0oO0
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @oo0oO0
    public abstract ConnectionResult blockingConnect();

    @oo0oO0
    public abstract ConnectionResult blockingConnect(long j, @oo0oO0 TimeUnit timeUnit);

    @oo0oO0
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@oo0oO0 String str, @oo0oO0 FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @oo0oO0 String[] strArr);

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@oo0oO0 T t) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@oo0oO0 T t) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    @KeepForSdk
    public <C extends Api.Client> C getClient(@oo0oO0 Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    public abstract ConnectionResult getConnectionResult(@oo0oO0 Api<?> api);

    @oo0oO0
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@oo0oO0 Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@oo0oO0 Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@oo0oO0 ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@oo0oO0 OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@oo0oO0 SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@oo0oO0 ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@oo0oO0 OnConnectionFailedListener onConnectionFailedListener);

    @oo0oO0
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@oo0oO0 L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@oo0oO0 FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@oo0oO0 ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@oo0oO0 OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }
}
