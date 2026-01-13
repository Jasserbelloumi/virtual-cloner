package com.google.android.gms.internal.measurement;

import java.util.List;
import o00ooOoo.oOo000Oo;
/* loaded from: classes2.dex */
public final class zzt extends zzai {
    private final zzr zza;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.zza = zzrVar;
        this.zze.put("log", new zzs(this, false, true));
        this.zze.put(oOo000Oo.f9235o0O0Oo0, new zzp(this, oOo000Oo.f9235o0O0Oo0));
        ((zzai) this.zze.get(oOo000Oo.f9235o0O0Oo0)).zzr("log", new zzs(this, true, true));
        this.zze.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzr("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
