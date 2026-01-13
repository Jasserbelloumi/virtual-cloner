package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import o00oOooO.o0o0000;
/* loaded from: classes2.dex */
public final class zzalp extends zzalc {
    public zzalp() {
    }

    public zzalp(zzalo zzaloVar, SSLSocketFactory sSLSocketFactory) {
    }

    @o0o0000
    public static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new zzakg((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
