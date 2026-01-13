package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.o0O;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(o0O.f3318o00oOoO);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                String valueOf = String.valueOf(jSONObject.toString());
                if (valueOf.length() != 0) {
                    "Action[clear]: wrong args.".concat(valueOf);
                }
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
                zzca.zzb(this.zza, hashSet);
            }
            return true;
        }
        zzbz zzbzVar = new zzbz(this.zza);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            new StringBuilder(String.valueOf(next).length() + 23 + String.valueOf(opt).length());
            if (zzbzVar.zzc(next, opt)) {
                this.zzb.zzc().add(next);
            } else {
                String valueOf2 = String.valueOf(next);
                if (valueOf2.length() != 0) {
                    "Failed writing key: ".concat(valueOf2);
                }
            }
        }
        this.zzb.zze();
        zzbzVar.zzb();
        return true;
    }
}
