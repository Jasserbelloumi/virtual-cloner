package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class ActivityRecognition {
    @oo0oO0
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = com.google.android.gms.internal.location.zzag.zzb;
    @oo0oO0
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new com.google.android.gms.internal.location.zzw();

    private ActivityRecognition() {
    }

    @oo0oO0
    public static ActivityRecognitionClient getClient(@oo0oO0 Activity activity) {
        return new com.google.android.gms.internal.location.zzag(activity);
    }

    @oo0oO0
    public static ActivityRecognitionClient getClient(@oo0oO0 Context context) {
        return new com.google.android.gms.internal.location.zzag(context);
    }
}
