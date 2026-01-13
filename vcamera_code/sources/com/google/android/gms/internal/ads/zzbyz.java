package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00ooOoo.oOo000Oo;
import o0Oo0oO.oO0000o0;
/* loaded from: classes2.dex */
public final class zzbyz {
    public static final /* synthetic */ int zza = 0;
    @o0O0OOOo("lock")
    private static boolean zzc;
    @o0O0OOOo("lock")
    private static boolean zzd;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzbyz() {
        this(null);
    }

    public zzbyz(@o0OO00OO String str) {
        this.zzg = !zzl() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzbza.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk(Context context) {
        if (((Boolean) zzbcg.zza.zze()).booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e) {
                zzbza.zzk("Fail to determine debug setting.", e);
                return false;
            }
        }
        return false;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzm() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzn(String str) {
        synchronized (zzbyz.class) {
            zzbza.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + oO0000o0.f16600o00oOoo0;
                zzbza.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            zzbza.zzi("GMA Debug FINISH");
        }
    }

    private final void zzo(String str, zzbyy zzbyyVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(oOo000Oo.o00oo0OO.f9386o00oo0O0).value(zze.currentTimeMillis());
            jsonWriter.name(oOo000Oo.f9217o0O00o0o).value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzbyyVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzbza.zzh("unable to log", e);
        }
        zzn(stringWriter.toString());
    }

    private final void zzp(@o0OO00OO final String str) {
        zzo("onNetworkRequestError", new zzbyy() { // from class: com.google.android.gms.internal.ads.zzbyv
            @Override // com.google.android.gms.internal.ads.zzbyy
            public final void zza(JsonWriter jsonWriter) {
                String str2 = str;
                int i = zzbyz.zza;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzq(final String str, final String str2, @o0OO00OO final Map map, @o0OO00OO final byte[] bArr) {
        zzo("onNetworkRequest", new zzbyy() { // from class: com.google.android.gms.internal.ads.zzbyw
            @Override // com.google.android.gms.internal.ads.zzbyy
            public final void zza(JsonWriter jsonWriter) {
                zzbyz.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzr(@o0OO00OO final Map map, final int i) {
        zzo("onNetworkResponse", new zzbyy() { // from class: com.google.android.gms.internal.ads.zzbyu
            @Override // com.google.android.gms.internal.ads.zzbyy
            public final void zza(JsonWriter jsonWriter) {
                zzbyz.zzb(i, map, jsonWriter);
            }
        });
    }

    private static void zzs(JsonWriter jsonWriter, @o0OO00OO Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzbza.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, @o0OO00OO byte[] bArr) {
        if (zzl()) {
            zzq(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, @o0OO00OO Map map, @o0OO00OO byte[] bArr) {
        if (zzl()) {
            zzq(str, o00oo0o0.o00oo0.f7537o00oOoOO, map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i) {
        if (zzl()) {
            String str = null;
            zzr(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzbza.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                zzp(str);
            }
        }
    }

    public final void zzf(@o0OO00OO Map map, int i) {
        if (zzl()) {
            zzr(map, i);
            if (i < 200 || i >= 300) {
                zzp(null);
            }
        }
    }

    public final void zzg(@o0OO00OO String str) {
        if (zzl() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzo("onNetworkResponseBody", new zzbyy() { // from class: com.google.android.gms.internal.ads.zzbyx
            @Override // com.google.android.gms.internal.ads.zzbyy
            public final void zza(JsonWriter jsonWriter) {
                String str;
                byte[] bArr2 = bArr;
                int i = zzbyz.zza;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length >= 10000) {
                    encode = zzbyt.zze(encode);
                    str = encode != null ? "bodydigest" : "bodydigest";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                str = "body";
                jsonWriter.name(str).value(encode);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
