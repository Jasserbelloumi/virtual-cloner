package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    @oo0oO0
    public final GoogleApiManager zaa;
    private final Context zab;
    @o0OO00OO
    private final String zac;
    private final Api zad;
    private final Api.ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;
    @NotOnlyInitialized
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Settings {
        @oo0oO0
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        @oo0oO0
        public final StatusExceptionMapper zaa;
        @oo0oO0
        public final Looper zab;

        @KeepForSdk
        /* loaded from: classes.dex */
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @oo0oO0
            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, this.zab);
            }

            @CanIgnoreReturnValue
            @oo0oO0
            @KeepForSdk
            public Builder setLooper(@oo0oO0 Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @CanIgnoreReturnValue
            @oo0oO0
            @KeepForSdk
            public Builder setMapper(@oo0oO0 StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    @o0O
    @KeepForSdk
    public GoogleApi(@oo0oO0 Activity activity, @oo0oO0 Api<O> api, @oo0oO0 O o, @oo0oO0 Settings settings) {
        this(activity, activity, api, o, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@o00oOooO.oo0oO0 android.app.Activity r2, @o00oOooO.oo0oO0 com.google.android.gms.common.api.Api<O> r3, @o00oOooO.oo0oO0 O r4, @o00oOooO.oo0oO0 com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    private GoogleApi(@oo0oO0 Context context, @o0OO00OO Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.isAtLeastR()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = api;
        this.zae = apiOptions;
        this.zag = settings.zab;
        ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, str);
        this.zaf = sharedApiKey;
        this.zai = new zabv(this);
        GoogleApiManager zam = GoogleApiManager.zam(this.zab);
        this.zaa = zam;
        this.zah = zam.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, zam, sharedApiKey);
        }
        zam.zaB(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@o00oOooO.oo0oO0 android.content.Context r2, @o00oOooO.oo0oO0 com.google.android.gms.common.api.Api<O> r3, @o00oOooO.oo0oO0 O r4, @o00oOooO.oo0oO0 android.os.Looper r5, @o00oOooO.oo0oO0 com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public GoogleApi(@oo0oO0 Context context, @oo0oO0 Api<O> api, @oo0oO0 O o, @oo0oO0 Settings settings) {
        this(context, (Activity) null, api, o, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@o00oOooO.oo0oO0 android.content.Context r2, @o00oOooO.oo0oO0 com.google.android.gms.common.api.Api<O> r3, @o00oOooO.oo0oO0 O r4, @o00oOooO.oo0oO0 com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    private final BaseImplementation.ApiMethodImpl zad(int i, @oo0oO0 BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zaw(this, i, apiMethodImpl);
        return apiMethodImpl;
    }

    private final Task zae(int i, @oo0oO0 TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zax(this, i, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @oo0oO0
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @oo0oO0
    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zae;
        if (!(apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            Api.ApiOptions apiOptions2 = this.zae;
            account = apiOptions2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions2).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        builder.zab(account);
        Api.ApiOptions apiOptions3 = this.zae;
        builder.zaa((!(apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.getRequestedScopes());
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    @oo0oO0
    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaa.zap(this);
    }

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@oo0oO0 T t) {
        zad(2, t);
        return t;
    }

    @oo0oO0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(@oo0oO0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@oo0oO0 T t) {
        zad(0, t);
        return t;
    }

    @oo0oO0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(@oo0oO0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@oo0oO0 T t, @oo0oO0 U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zaq(this, t, u, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@oo0oO0 RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zaq(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    @oo0oO0
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@oo0oO0 ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @oo0oO0
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@oo0oO0 ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zar(this, listenerKey, i);
    }

    @oo0oO0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@oo0oO0 T t) {
        zad(1, t);
        return t;
    }

    @oo0oO0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(@oo0oO0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @oo0oO0
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @oo0oO0
    @KeepForSdk
    public O getApiOptions() {
        return (O) this.zae;
    }

    @oo0oO0
    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @o0OO00OO
    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @o0OO00OO
    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @oo0oO0
    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @oo0oO0
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@oo0oO0 L l, @oo0oO0 String str) {
        return ListenerHolders.createListenerHolder(l, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    @oO0Oo
    public final Api.Client zab(Looper looper, zabq zabqVar) {
        Api.Client buildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, createClientSettingsBuilder().build(), (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) buildClient).zac(contextAttributionTag);
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().build());
    }
}
