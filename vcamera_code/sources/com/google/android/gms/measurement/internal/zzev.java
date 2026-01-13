package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oO0Oo;
/* loaded from: classes2.dex */
public final class zzev {
    public final /* synthetic */ zzew zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;

    public zzev(zzew zzewVar, String str, String str2) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }

    @oO0Oo
    public final String zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zza.zza().getString(this.zzb, null);
        }
        return this.zzd;
    }

    @oO0Oo
    public final void zzb(String str) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putString(this.zzb, str);
        edit.apply();
        this.zzd = str;
    }
}
