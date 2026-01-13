package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@oo0oO0 Status status) {
        super(status);
    }

    @oo0oO0
    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(@oo0oO0 Activity activity, int i) throws IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i);
    }
}
