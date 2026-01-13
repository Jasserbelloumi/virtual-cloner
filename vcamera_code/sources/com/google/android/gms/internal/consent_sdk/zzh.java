package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import o00oOooO.o0O000O;
import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    @o0O000O
    public final Executor zza() {
        return this.zza;
    }

    @o0O000O
    public final void zzb(@o0OO00OO final String str, @o0OO00OO final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length());
                        return;
                    }
                }
                new StringBuilder(String.valueOf(lowerCase).length() + 10 + String.valueOf(jSONObject).length());
                for (final zzg zzgVar : zzgVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzg.this.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzgVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException unused2) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 33);
                    } catch (ExecutionException e) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 24);
                        e.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
