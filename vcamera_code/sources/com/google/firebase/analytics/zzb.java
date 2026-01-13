package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzef;
import java.util.concurrent.Callable;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzb implements Callable {
    public final /* synthetic */ FirebaseAnalytics zza;

    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @o0OO00OO
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzef zzefVar;
        zzefVar = this.zza.zzb;
        return zzefVar.zzl();
    }
}
