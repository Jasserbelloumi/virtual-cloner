package com.google.firebase.inject;

import com.google.firebase.annotations.DeferredApi;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface Deferred<T> {

    /* loaded from: classes2.dex */
    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> provider);
    }

    void whenAvailable(@oo0oO0 DeferredHandler<T> deferredHandler);
}
