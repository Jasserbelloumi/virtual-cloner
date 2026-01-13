package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzya implements zzxz {
    private final WindowManager zza;

    private zzya(WindowManager windowManager) {
        this.zza = windowManager;
    }

    @o0OO00OO
    public static zzxz zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzya(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzb(zzxx zzxxVar) {
        zzyd.zzb(zzxxVar.zza, this.zza.getDefaultDisplay());
    }
}
