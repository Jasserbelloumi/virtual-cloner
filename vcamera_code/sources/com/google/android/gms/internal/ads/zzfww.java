package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzfww {
    private final Class zza;
    private zzfwx zzc;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzggl zzd = zzggl.zza;

    public /* synthetic */ zzfww(Class cls, zzfwv zzfwvVar) {
        this.zza = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzfww zze(@javax.annotation.Nullable java.lang.Object r14, @javax.annotation.Nullable java.lang.Object r15, com.google.android.gms.internal.ads.zzglk r16, boolean r17) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfww.zze(java.lang.Object, java.lang.Object, com.google.android.gms.internal.ads.zzglk, boolean):com.google.android.gms.internal.ads.zzfww");
    }

    public final zzfww zza(@Nullable Object obj, @Nullable Object obj2, zzglk zzglkVar) throws GeneralSecurityException {
        zze(obj, obj2, zzglkVar, false);
        return this;
    }

    public final zzfww zzb(@Nullable Object obj, @Nullable Object obj2, zzglk zzglkVar) throws GeneralSecurityException {
        zze(obj, obj2, zzglkVar, true);
        return this;
    }

    public final zzfww zzc(zzggl zzgglVar) {
        if (this.zzb != null) {
            this.zzd = zzgglVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzfxb zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzfxb zzfxbVar = new zzfxb(concurrentMap, this.zzc, this.zzd, this.zza, null);
            this.zzb = null;
            return zzfxbVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
