package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzbmc {
    private static final Charset zzc = Charset.forName(C.UTF8_NAME);
    public static final zzblz zza = new zzbmb();
    public static final zzblx zzb = new zzblx() { // from class: com.google.android.gms.internal.ads.zzbma
        @Override // com.google.android.gms.internal.ads.zzblx
        public final Object zza(JSONObject jSONObject) {
            return zzbmc.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
