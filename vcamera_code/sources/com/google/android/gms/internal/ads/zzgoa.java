package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgoa extends ThreadLocal {
    public final /* synthetic */ zzgob zza;

    public zzgoa(zzgob zzgobVar) {
        this.zza = zzgobVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgnn zzgnnVar = zzgnn.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgnnVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
