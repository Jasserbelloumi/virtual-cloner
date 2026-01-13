package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.text.CueDecoder;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfjc implements zzfhs {
    private final Object zza;
    private final zzfjd zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;

    public zzfjc(@oo0oO0 Object obj, @oo0oO0 zzfjd zzfjdVar, @oo0oO0 zzfjo zzfjoVar, @oo0oO0 zzfhp zzfhpVar) {
        this.zza = obj;
        this.zzb = zzfjdVar;
        this.zzc = zzfjoVar;
        this.zzd = zzfhpVar;
    }

    @o0OO00OO
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaoe zza = zzaof.zza();
        zza.zzc(5);
        zza.zza(zzgpe.zzv(bArr));
        return Base64.encodeToString(((zzaof) zza.zzal()).zzax(), 11);
    }

    @o0OO00OO
    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    @o0OO00OO
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", CueDecoder.BUNDLED_CUES);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    @o0OO00OO
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    @o0OO00OO
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfjm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfjm((int) PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND, e);
        }
    }

    public final synchronized int zze() throws zzfjm {
        try {
        } catch (Exception e) {
            throw new zzfjm((int) PlaybackException.ERROR_CODE_IO_NO_PERMISSION, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfjd zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfjm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfjm(2003, e);
        }
    }

    public final synchronized boolean zzh() throws zzfjm {
        try {
        } catch (Exception e) {
            throw new zzfjm(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
