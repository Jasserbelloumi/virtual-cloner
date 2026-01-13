package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j) {
        this.zza = j;
    }

    @KeepForSdk
    public static void createAndAddCallback(@oo0oO0 Task<Object> task, long j) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j, @o0OO00OO Object obj, boolean z, boolean z2, @o0OO00OO String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@oo0oO0 Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
