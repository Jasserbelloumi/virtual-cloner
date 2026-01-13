package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
final class zzaok implements Runnable {
    private zzaok() {
    }

    public /* synthetic */ zzaok(zzaoj zzaojVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzaol.zzc(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            zzaol.zzb.countDown();
            throw th;
        }
        zzaol.zzb.countDown();
    }
}
