package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzapn implements zzfjk {
    public final /* synthetic */ zzfhk zza;

    public zzapn(zzapp zzappVar, zzfhk zzfhkVar) {
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
