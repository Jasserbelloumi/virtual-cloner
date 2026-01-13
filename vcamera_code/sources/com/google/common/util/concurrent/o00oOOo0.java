package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes2.dex */
public final /* synthetic */ class o00oOOo0 {
    public static /* synthetic */ boolean o00oOOo0(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
