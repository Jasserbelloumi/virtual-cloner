package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0O0OOOo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbxk {
    @o0O0OOOo("this")
    private final Map zza = new HashMap();
    @o0O0OOOo("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbwh zzd;

    public zzbxk(Context context, zzbwh zzbwhVar) {
        this.zzc = context;
        this.zzd = zzbwhVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zze();
        }
    }

    public final synchronized void zzc(String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzbxj zzbxjVar = new zzbxj(this, str);
        this.zza.put(str, zzbxjVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbxjVar);
    }

    public final synchronized void zzd(zzbxi zzbxiVar) {
        this.zzb.add(zzbxiVar);
    }
}
