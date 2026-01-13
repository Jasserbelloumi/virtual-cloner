package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class ListenerHolders {
    private final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @oo0oO0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@oo0oO0 L l, @oo0oO0 Looper looper, @oo0oO0 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    @oo0oO0
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@oo0oO0 L l, @oo0oO0 Executor executor, @oo0oO0 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l, str);
    }

    @oo0oO0
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@oo0oO0 L l, @oo0oO0 String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l, str);
    }

    @oo0oO0
    public final ListenerHolder zaa(@oo0oO0 Object obj, @oo0oO0 Looper looper, @oo0oO0 String str) {
        ListenerHolder createListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        for (ListenerHolder listenerHolder : this.zaa) {
            listenerHolder.clear();
        }
        this.zaa.clear();
    }
}
