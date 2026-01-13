package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import o00oOooO.o0O;
/* JADX INFO: Access modifiers changed from: package-private */
@o0O
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzhw implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzhx zza;

    public /* synthetic */ zzhw(zzhx zzhxVar, zzhv zzhvVar) {
        this.zza = zzhxVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.zza.zzt.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.zza.zzt.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    this.zza.zzt.zzaz().zzp(new zzhu(this, z, data, str, queryParameter));
                }
            } catch (RuntimeException e) {
                this.zza.zzt.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.zza.zzt.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @o0O
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkc zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaz().zzp(new zzjv(zzu, zzu.zzt.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @o0O
    public final void onActivityResumed(Activity activity) {
        zzkc zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaz().zzp(new zzju(zzu, zzu.zzt.zzav().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
