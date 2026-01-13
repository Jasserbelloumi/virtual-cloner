package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzftw extends zzfti {
    @CheckForNull
    private zzftv zza;

    public zzftw(zzfqf zzfqfVar, boolean z, Executor executor, Callable callable) {
        super(zzfqfVar, z, false);
        this.zza = new zzftu(this, callable, executor);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final void zzr() {
        zzftv zzftvVar = this.zza;
        if (zzftvVar != null) {
            zzftvVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzv() {
        zzftv zzftvVar = this.zza;
        if (zzftvVar != null) {
            zzftvVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
