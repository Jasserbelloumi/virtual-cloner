package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
final class zzq extends AsyncTask {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.zza;
        if (zzs.zze(zzsVar) == null || str == null) {
            return;
        }
        zzs.zze(zzsVar).loadUrl(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzv(zzsVar, (zzapw) zzs.zzu(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzk("", e);
        }
        return this.zza.zzp();
    }
}
