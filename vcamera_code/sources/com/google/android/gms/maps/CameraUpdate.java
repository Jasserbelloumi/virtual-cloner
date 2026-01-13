package com.google.android.gms.maps;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class CameraUpdate {
    private final IObjectWrapper zza;

    public CameraUpdate(IObjectWrapper iObjectWrapper) {
        this.zza = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    @oo0oO0
    public final IObjectWrapper zza() {
        return this.zza;
    }
}
