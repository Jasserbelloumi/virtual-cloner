package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbs {
    @o0OO00OO
    private o00oo0O.o00oo0 zza;
    @o0OO00OO
    private o00oo0O.o00oOo00 zzb;
    @o0OO00OO
    private o00oo0O.o00oo00O zzc;
    @o0OO00OO
    private zzbbq zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgxm.zza(context));
                }
            }
        }
        return false;
    }

    @o0OO00OO
    public final o00oo0O.o00oo0 zza() {
        o00oo0O.o00oOo00 o00ooo002 = this.zzb;
        if (o00ooo002 == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = o00ooo002.o00oOoo0(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzgxm.zza(activity)) != null) {
            zzgxn zzgxnVar = new zzgxn(this, null);
            this.zzc = zzgxnVar;
            o00oo0O.o00oOo00.o00oOOoO(activity, zza, zzgxnVar);
        }
    }

    public final void zzc(o00oo0O.o00oOo00 o00ooo002) {
        this.zzb = o00ooo002;
        o00ooo002.o00oo0(0L);
        zzbbq zzbbqVar = this.zzd;
        if (zzbbqVar != null) {
            zzbbqVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbbq zzbbqVar) {
        this.zzd = zzbbqVar;
    }

    public final void zzf(Activity activity) {
        o00oo0O.o00oo00O o00oo00o = this.zzc;
        if (o00oo00o == null) {
            return;
        }
        activity.unbindService(o00oo00o);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
