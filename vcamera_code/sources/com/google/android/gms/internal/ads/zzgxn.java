package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class zzgxn extends o00oo0O.o00oo00O {
    private final WeakReference zza;

    public zzgxn(zzbbs zzbbsVar, byte[] bArr) {
        this.zza = new WeakReference(zzbbsVar);
    }

    @Override // o00oo0O.o00oo00O
    public final void onCustomTabsServiceConnected(ComponentName componentName, o00oo0O.o00oOo00 o00ooo002) {
        zzbbs zzbbsVar = (zzbbs) this.zza.get();
        if (zzbbsVar != null) {
            zzbbsVar.zzc(o00ooo002);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbbs zzbbsVar = (zzbbs) this.zza.get();
        if (zzbbsVar != null) {
            zzbbsVar.zzd();
        }
    }
}
