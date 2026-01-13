package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey zaa;

    @KeepForSdk
    public UnregisterListenerMethod(@oo0oO0 ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    @oo0oO0
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    @KeepForSdk
    public abstract void unregisterListener(@oo0oO0 A a, @oo0oO0 TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
