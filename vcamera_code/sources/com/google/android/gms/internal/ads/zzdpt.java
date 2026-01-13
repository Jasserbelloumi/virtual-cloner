package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import o00ooOoo.oOo000Oo;
/* loaded from: classes2.dex */
public final class zzdpt {
    private final Clock zza;

    public zzdpt(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbco.zza.zze()).booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(oOo000Oo.o00oo0OO.f9386o00oo0O0).value(currentTimeMillis);
                jsonWriter.name(FirebaseAnalytics.Param.SOURCE).value(str);
                jsonWriter.name(oOo000Oo.f9217o0O00o0o).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzbza.zzh("unable to log", e);
            }
            zzbza.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
