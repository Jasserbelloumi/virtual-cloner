package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@oo0oO0 Status status, @oo0oO0 TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, null, taskCompletionSource);
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@oo0oO0 Status status, @o0OO00OO ResultT resultt, @oo0oO0 TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@oo0oO0 Task<Boolean> task) {
        return task.continueWith(new zacx());
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@oo0oO0 Status status, @o0OO00OO ResultT resultt, @oo0oO0 TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.isSuccess() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(ApiExceptionUtil.fromStatus(status));
    }
}
