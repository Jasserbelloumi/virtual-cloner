package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import o00oOooO.oO0Oo;
/* loaded from: classes.dex */
abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    @oO0Oo
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e);
            }
        } finally {
            lock2 = this.zab.zab;
            lock2.unlock();
        }
    }

    @oO0Oo
    public abstract void zaa();
}
