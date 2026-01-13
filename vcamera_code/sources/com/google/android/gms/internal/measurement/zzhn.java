package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import javax.annotation.Nullable;
import o00oOooO.o0O0OOOo;
import o00ooo0.o0O0o00;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhn implements zzhk {
    @o0O0OOOo("GservicesLoader.class")
    private static zzhn zza;
    @Nullable
    private final Context zzb;
    @Nullable
    private final ContentObserver zzc;

    private zzhn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhn(Context context) {
        this.zzb = context;
        zzhm zzhmVar = new zzhm(this, null);
        this.zzc = zzhmVar;
        context.getContentResolver().registerContentObserver(zzha.zza, true, zzhmVar);
    }

    public static zzhn zza(Context context) {
        zzhn zzhnVar;
        synchronized (zzhn.class) {
            if (zza == null) {
                zza = o0O0o00.o00oOooO(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhn(context) : new zzhn();
            }
            zzhnVar = zza;
        }
        return zzhnVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzhn.class) {
            zzhn zzhnVar = zza;
            if (zzhnVar != null && (context = zzhnVar.zzb) != null && zzhnVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    @Nullable
    /* renamed from: zzc */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzhb.zza(context)) {
            try {
                return (String) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhl
                    @Override // com.google.android.gms.internal.measurement.zzhj
                    public final Object zza() {
                        return zzhn.this.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzha.zza(this.zzb.getContentResolver(), str, null);
    }
}
