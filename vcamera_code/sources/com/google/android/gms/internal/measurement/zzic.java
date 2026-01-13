package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzic implements zzhk {
    @o0O0OOOo("SharedPreferencesLoader.class")
    private static final Map zza = new androidx.collection.o00oOOo0();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    @o0OO00OO
    public static zzic zza(Context context, String str, Runnable runnable) {
        zzic zzicVar;
        if (zzhb.zzb()) {
            throw null;
        }
        synchronized (zzic.class) {
            zzicVar = (zzic) zza.get(null);
            if (zzicVar == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return zzicVar;
    }

    public static synchronized void zzc() {
        synchronized (zzic.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzic) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    @o0OO00OO
    public final Object zzb(String str) {
        throw null;
    }
}
