package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @oo0oO0
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;
    @oo0oO0
    public final UnregisterListenerMethod zaa;
    @oo0oO0
    public final Runnable zab;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder<A extends Api.AnyClient, L> {
        private RemoteCall zaa;
        private RemoteCall zab;
        private ListenerHolder zad;
        private Feature[] zae;
        private int zag;
        private Runnable zac = zacj.zaa;
        private boolean zaf = true;

        private Builder() {
        }

        public /* synthetic */ Builder(zacm zacmVar) {
        }

        @oo0oO0
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            Preconditions.checkArgument(this.zaa != null, "Must set register function");
            Preconditions.checkArgument(this.zab != null, "Must set unregister function");
            Preconditions.checkArgument(this.zad != null, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null")), this.zac, null);
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@oo0oO0 Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> register(@oo0oO0 RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zaf = z;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> setFeatures(@oo0oO0 Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.zag = i;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> unregister(@oo0oO0 RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        @CanIgnoreReturnValue
        @oo0oO0
        @KeepForSdk
        public Builder<A, L> withHolder(@oo0oO0 ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @oo0oO0
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(null);
    }
}
