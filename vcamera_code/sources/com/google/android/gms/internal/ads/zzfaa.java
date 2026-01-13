package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzfaa {
    @VisibleForTesting
    @GuardedBy("lock")
    @o0OO00OO
    public static Task zza;
    @VisibleForTesting
    @GuardedBy("lock")
    @o0OO00OO
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    @o0OO00OO
    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = AppSet.getClient(context);
            }
            Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z && zza.isComplete()))) {
                zza = ((AppSetIdClient) Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
            }
        }
    }
}
