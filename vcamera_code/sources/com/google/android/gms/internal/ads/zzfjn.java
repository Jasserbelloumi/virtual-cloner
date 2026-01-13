package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Oo.o0O0o000;
import o0Oo0oO.oO0000o0;
/* loaded from: classes2.dex */
public final class zzfjn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;
    private final zzfhk zze;
    @o0OO00OO
    private zzfjc zzf;
    private final Object zzg = new Object();

    public zzfjn(@oo0oO0 Context context, @oo0oO0 zzfjo zzfjoVar, @oo0oO0 zzfhp zzfhpVar, @oo0oO0 zzfhk zzfhkVar) {
        this.zzb = context;
        this.zzc = zzfjoVar;
        this.zzd = zzfhpVar;
        this.zze = zzfhkVar;
    }

    private final synchronized Class zzd(@oo0oO0 zzfjd zzfjdVar) throws zzfjm {
        String zzk = zzfjdVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfjdVar.zzc())) {
                throw new zzfjm(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfjdVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zzfjdVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfjm(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfjm(2026, e2);
        }
    }

    @o0OO00OO
    public final zzfhs zza() {
        zzfjc zzfjcVar;
        synchronized (this.zzg) {
            zzfjcVar = this.zzf;
        }
        return zzfjcVar;
    }

    @o0OO00OO
    public final zzfjd zzb() {
        synchronized (this.zzg) {
            zzfjc zzfjcVar = this.zzf;
            if (zzfjcVar != null) {
                return zzfjcVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(@oo0oO0 zzfjd zzfjdVar) {
        int i;
        zzfjm zzfjmVar;
        zzfhp zzfhpVar;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfjc zzfjcVar = new zzfjc(zzd(zzfjdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfjdVar.zze(), null, new Bundle(), 2), zzfjdVar, this.zzc, this.zzd);
                if (zzfjcVar.zzh()) {
                    int zze = zzfjcVar.zze();
                    if (zze != 0) {
                        throw new zzfjm((int) PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, "ci: " + zze);
                    }
                    synchronized (this.zzg) {
                        zzfjc zzfjcVar2 = this.zzf;
                        if (zzfjcVar2 != null) {
                            try {
                                zzfjcVar2.zzg();
                            } catch (zzfjm e) {
                                this.zzd.zzc(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfjcVar;
                    }
                    this.zzd.zzd(o0O0o000.f11662o00oOooO, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfjm((int) oO0000o0.f16600o00oOoo0, "init failed");
            } catch (Exception e2) {
                throw new zzfjm(2004, e2);
            }
        } catch (zzfjm e3) {
            zzfhp zzfhpVar2 = this.zzd;
            i = e3.zza();
            zzfhpVar = zzfhpVar2;
            zzfjmVar = e3;
            zzfhpVar.zzc(i, System.currentTimeMillis() - currentTimeMillis, zzfjmVar);
            return false;
        } catch (Exception e4) {
            i = 4010;
            zzfhpVar = this.zzd;
            zzfjmVar = e4;
            zzfhpVar.zzc(i, System.currentTimeMillis() - currentTimeMillis, zzfjmVar);
            return false;
        }
    }
}
