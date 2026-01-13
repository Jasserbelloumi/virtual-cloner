package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbar;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@TargetApi(30)
/* loaded from: classes.dex */
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzm(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhN)).booleanValue()) {
            return 0;
        }
        return super.zzm(context);
    }
}
