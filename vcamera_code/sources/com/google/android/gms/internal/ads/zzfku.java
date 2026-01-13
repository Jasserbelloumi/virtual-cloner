package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.o0O00;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
final class zzfku {
    private static zzfku zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfku(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfku zzb(Context context) {
        if (zza == null) {
            zza = new zzfku(context);
        }
        return zza;
    }

    public final long zza(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    @Nullable
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final void zzd(String str, Object obj) throws IOException {
        SharedPreferences.Editor putBoolean;
        if (obj instanceof String) {
            putBoolean = this.zzc.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            putBoolean = this.zzc.edit().putLong(str, ((Long) obj).longValue());
        } else if (!(obj instanceof Boolean)) {
            throw new IllegalArgumentException(o0O00.o00oOOo0("Unexpected object class ", String.valueOf(obj.getClass()), " for app ", this.zzb));
        } else {
            putBoolean = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (!putBoolean.commit()) {
            throw new IOException(o0O00.o00oOOo0("Failed to store ", str, " for app ", this.zzb));
        }
    }

    public final void zze(String str) throws IOException {
        if (!this.zzc.edit().remove(str).commit()) {
            throw new IOException(o0O00.o00oOOo0("Failed to remove ", str, " for app ", this.zzb));
        }
    }

    public final boolean zzf(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
