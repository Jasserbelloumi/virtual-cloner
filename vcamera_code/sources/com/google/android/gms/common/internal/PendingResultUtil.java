package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class PendingResultUtil {
    private static final zas zaa = new zao();

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface ResultConverter<R extends Result, T> {
        @o0OO00OO
        @KeepForSdk
        T convert(@oo0oO0 R r);
    }

    @oo0oO0
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@oo0oO0 PendingResult<R> pendingResult, @oo0oO0 T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @oo0oO0
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@oo0oO0 PendingResult<R> pendingResult, @oo0oO0 ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new zap(pendingResult, taskCompletionSource, resultConverter, zasVar));
        return taskCompletionSource.getTask();
    }

    @oo0oO0
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@oo0oO0 PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}
