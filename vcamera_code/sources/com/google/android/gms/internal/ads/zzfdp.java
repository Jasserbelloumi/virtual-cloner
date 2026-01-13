package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzfdp {
    private final Clock zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfdp(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    i++;
                    arrayList.add(new zzfdo(((String) entry.getKey()) + "." + i, str));
                }
            } else {
                arrayList.add(new zzfdo((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        long elapsedRealtime = this.zza.elapsedRealtime() - ((Long) this.zzc.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        zzd(str, sb.toString());
    }

    public final void zzc(String str, String str2) {
        if (this.zzc.containsKey(str)) {
            zzd(str, o0O0OO0.o00oOo0O.o00oOOo0(str2, this.zza.elapsedRealtime() - ((Long) this.zzc.remove(str)).longValue()));
        } else {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
        }
    }
}
