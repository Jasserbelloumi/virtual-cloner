package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzdjo {
    private final Executor zza;
    private final zzdjj zzb;

    public zzdjo(Executor executor, zzdjj zzdjjVar) {
        this.zza = executor;
        this.zzb = zzdjjVar;
    }

    public final zzfut zza(JSONObject jSONObject, String str) {
        final String optString;
        zzfut zzl;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            zzdjn zzdjnVar = null;
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    zzdjnVar = new zzdjn(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    zzl = zzfuj.zzl(this.zzb.zze(optJSONObject, "image_value"), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjl
                        @Override // com.google.android.gms.internal.ads.zzfnj
                        public final Object apply(Object obj) {
                            return new zzdjn(optString, (zzbdj) obj);
                        }
                    }, this.zza);
                    arrayList.add(zzl);
                }
            }
            zzl = zzfuj.zzh(zzdjnVar);
            arrayList.add(zzl);
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdjn zzdjnVar2 : (List) obj) {
                    if (zzdjnVar2 != null) {
                        arrayList2.add(zzdjnVar2);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
