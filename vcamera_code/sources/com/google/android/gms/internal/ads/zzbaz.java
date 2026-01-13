package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbaz {
    @VisibleForTesting
    public String zzd;
    @VisibleForTesting
    public Context zze;
    @VisibleForTesting
    public String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    @VisibleForTesting
    public final BlockingQueue zza = new ArrayBlockingQueue(100);
    @VisibleForTesting
    public final LinkedHashMap zzb = new LinkedHashMap();
    @VisibleForTesting
    public final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbaz zzbazVar) {
        while (true) {
            try {
                zzbbj zzbbjVar = (zzbbj) zzbazVar.zza.take();
                zzbbi zza = zzbbjVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbazVar.zzg(zzbazVar.zzb(zzbazVar.zzb, zzbbjVar.zzb()), zza);
                }
            } catch (InterruptedException e) {
                zzbza.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbbi zzbbiVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbbiVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbbiVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbbiVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbbiVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbbiVar.zza());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzH(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            zzbza.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            zzbza.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    zzbza.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    public final zzbbf zza(String str) {
        zzbbf zzbbfVar = (zzbbf) this.zzc.get(str);
        return zzbbfVar != null ? zzbbfVar : zzbbf.zza;
    }

    public final Map zzb(Map map, @o0OO00OO Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbcf.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbay
            @Override // java.lang.Runnable
            public final void run() {
                zzbaz.zzc(zzbaz.this);
            }
        });
        Map map2 = this.zzc;
        zzbbf zzbbfVar = zzbbf.zzb;
        map2.put("action", zzbbfVar);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbbfVar);
        this.zzc.put("e", zzbbf.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbbj zzbbjVar) {
        return this.zza.offer(zzbbjVar);
    }
}
