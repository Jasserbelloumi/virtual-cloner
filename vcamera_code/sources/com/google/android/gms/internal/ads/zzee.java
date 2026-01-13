package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.o0O00;
import java.net.UnknownHostException;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO00;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes2.dex */
public final class zzee {
    private static final Object zza = new Object();
    @o0O0OOOo("lock")
    private static final zzed zzb = zzed.zza;

    @Pure
    public static void zza(@o0OOO00(max = 23) String str, String str2) {
        synchronized (zza) {
        }
    }

    @Pure
    public static void zzb(@o0OOO00(max = 23) String str, String str2) {
        synchronized (zza) {
        }
    }

    @Pure
    public static void zzc(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        zzb(str, zzg(str2, th));
    }

    @Pure
    public static void zzd(@o0OOO00(max = 23) String str, String str2) {
        synchronized (zza) {
        }
    }

    @Pure
    public static void zze(@o0OOO00(max = 23) String str, String str2) {
        synchronized (zza) {
        }
    }

    @Pure
    public static void zzf(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        zze(str, zzg(str2, th));
    }

    @Pure
    private static String zzg(String str, @o0OO00OO Throwable th) {
        String replace;
        synchronized (zza) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        } else if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        return !TextUtils.isEmpty(replace) ? o0O00.o00oOOo0(str, "\n  ", replace.replace("\n", "\n  "), "\n") : str;
    }
}
