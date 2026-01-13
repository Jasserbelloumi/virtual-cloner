package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class zzasl {
    public static final String zza = "zzasl";
    private final zzaqx zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzasl(zzaqx zzaqxVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaqxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaqxVar.zzk().submit(new zzask(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzasl zzaslVar) {
        try {
            zzaqx zzaqxVar = zzaslVar.zzb;
            Class<?> loadClass = zzaqxVar.zzi().loadClass(zzaslVar.zzc(zzaqxVar.zzu(), zzaslVar.zzc));
            if (loadClass != null) {
                zzaslVar.zze = loadClass.getMethod(zzaslVar.zzc(zzaslVar.zzb.zzu(), zzaslVar.zzd), zzaslVar.zzf);
                Method method = zzaslVar.zze;
            }
        } catch (zzaqb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzaslVar.zzg.countDown();
            throw th;
        }
        zzaslVar.zzg.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaqb, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
