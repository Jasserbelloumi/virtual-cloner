package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
import o0O000.o00oo0OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbsf implements zzbsh {
    @VisibleForTesting
    public static zzbsh zza;
    @VisibleForTesting
    public static zzbsh zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzg zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbsf(Context context, zzbzg zzbzgVar) {
        zzfkq.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzgVar;
    }

    public static zzbsh zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhf)).booleanValue()) {
                        zza = new zzbsf(context, zzbzg.zza());
                    }
                }
                zza = new zzbsg();
            }
        }
        return zza;
    }

    public static zzbsh zzb(Context context, zzbzg zzbzgVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbct.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhf)).booleanValue()) {
                        zzbsf zzbsfVar = new zzbsf(context, zzbzgVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbsfVar.zzd) {
                                zzbsfVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbse(zzbsfVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbsd(zzbsfVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbsfVar;
                    }
                }
                zzb = new zzbsg();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfoj.zzc(zzbyt.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzbyt.zzp(stackTraceElement.getClassName());
                    z2 |= zzbsf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzbyt.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        String zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzib)).booleanValue() ? zzd(th) : "";
        double d = f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        int i2 = i > 0 ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzbza.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbza.zzj("Cannot obtain package name, proceeding.");
                str2 = o00oo0OO.f10107o00oOOoO;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("=").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = android.support.v4.media.o00oOoO.o00oOOo0(str3, " ", str4);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzbar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "513548808").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzbct.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
            if (!TextUtils.isEmpty(zzd)) {
                appendQueryParameter2.appendQueryParameter("hash", zzd);
            }
            arrayList.add(appendQueryParameter2.toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str5 = (String) it.next();
                final zzbzf zzbzfVar = new zzbzf(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzf.this.zza(str5);
                    }
                });
            }
        }
    }
}
