package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oO0Oo;
/* loaded from: classes2.dex */
public final class zzeq {
    public final /* synthetic */ zzew zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzeq(zzew zzewVar, String str, boolean z) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    @oO0Oo
    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z);
        edit.apply();
        this.zze = z;
    }

    @oO0Oo
    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
