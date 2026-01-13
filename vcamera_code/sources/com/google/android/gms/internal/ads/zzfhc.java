package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class zzfhc extends zzfhd {
    public final HashSet zza;
    public final JSONObject zzb;
    public final long zzc;

    public zzfhc(zzfgv zzfgvVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfgvVar, null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
