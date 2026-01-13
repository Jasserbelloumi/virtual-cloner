package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface FirebaseInstallationsApi {
    @oo0oO0
    Task<Void> delete();

    @oo0oO0
    Task<String> getId();

    @oo0oO0
    Task<InstallationTokenResult> getToken(boolean z);

    @DeferredApi
    FidListenerHandle registerFidListener(@oo0oO0 FidListener fidListener);
}
