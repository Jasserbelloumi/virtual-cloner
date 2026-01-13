package com.google.android.gms.tasks;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @o0OO00OO Throwable th) {
        super(str, th);
    }

    @oo0oO0
    public static IllegalStateException of(@oo0oO0 Task<?> task) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            return new DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
