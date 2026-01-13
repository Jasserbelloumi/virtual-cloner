package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final /* synthetic */ class o00oo00O {
    public static /* synthetic */ boolean o00oOOo0(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
