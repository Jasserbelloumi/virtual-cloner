package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O;
import o00oOooO.o0o0000;
@o0o0000(otherwise = 2)
/* loaded from: classes.dex */
final class zaa extends LifecycleCallback {
    private List zaa;

    private zaa(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zaa = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ zaa zaa(Activity activity) {
        zaa zaaVar;
        synchronized (activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            zaaVar = (zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
            if (zaaVar == null) {
                zaaVar = new zaa(fragment);
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zac(Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @o0O
    public final void onStop() {
        List<Runnable> list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new ArrayList();
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}
