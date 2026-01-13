package com.google.android.gms.common.api.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import o00oOooO.o0o0000;
/* loaded from: classes.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @o0o0000(otherwise = 2)
    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @CanIgnoreReturnValue
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zac(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
