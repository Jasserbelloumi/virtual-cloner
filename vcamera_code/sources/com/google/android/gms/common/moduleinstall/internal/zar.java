package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class zar extends zaa {
    public final /* synthetic */ TaskCompletionSource zaa;

    public zar(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(Status status, @o0OO00OO ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.zaa);
    }
}
