package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.moduleinstall.internal.zay;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class ModuleInstall {
    private ModuleInstall() {
    }

    @oo0oO0
    public static ModuleInstallClient getClient(@oo0oO0 Activity activity) {
        return new zay(activity);
    }

    @oo0oO0
    public static ModuleInstallClient getClient(@oo0oO0 Context context) {
        return new zay(context);
    }
}
