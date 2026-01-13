package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(@oo0oO0 Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzbnf getAdapterCreator() {
        return new zzbnc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "22.0.0");
    }
}
