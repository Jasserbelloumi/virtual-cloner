package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes2.dex */
final class zzex implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    public final /* synthetic */ ServiceConnection zzb;
    public final /* synthetic */ zzey zzc;

    public zzex(zzey zzeyVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzeyVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzef zzd;
        String str2;
        zzey zzeyVar = this.zzc;
        zzez zzezVar = zzeyVar.zza;
        str = zzeyVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzezVar.zza.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zzd2 = zzbrVar.zzd(bundle);
            if (zzd2 == null) {
                zzezVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd2;
            }
        } catch (Exception e) {
            zzezVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzezVar.zza.zzaz().zzg();
        zzfr.zzO();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzd = zzezVar.zza.zzay().zzk();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzd = zzezVar.zza.zzay().zzd();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    zzezVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle zzs = zzezVar.zza.zzv().zzs(Uri.parse("?".concat(string)));
                    if (zzs == null) {
                        zzd = zzezVar.zza.zzay().zzd();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = zzs.getString(FirebaseAnalytics.Param.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzd = zzezVar.zza.zzay().zzd();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                zzs.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzezVar.zza.zzm().zzd.zza()) {
                            zzezVar.zza.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzezVar.zza.zzJ()) {
                            zzezVar.zza.zzm().zzd.zzb(j);
                            zzezVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzezVar.zza.zzq().zzF("auto", "_cmp", zzs, str);
                        }
                    }
                }
            }
            zzd.zza(str2);
        }
        ConnectionTracker.getInstance().unbindService(zzezVar.zza.zzau(), serviceConnection);
    }
}
