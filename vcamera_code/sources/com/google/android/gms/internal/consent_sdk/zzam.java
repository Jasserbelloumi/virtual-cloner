package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class zzam {
    private final Application zza;
    private final SharedPreferences zzb;
    private final Set<String> zzc;

    public zzam(Application application) {
        this.zza = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzb = sharedPreferences;
        this.zzc = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzb.getInt("consent_status", 0);
    }

    public final Map<String, String> zzb() {
        String valueOf;
        String str;
        String str2;
        Application application = this.zza;
        Set<String> stringSet = this.zzb.getStringSet("stored_info", Collections.emptySet());
        HashMap hashMap = new HashMap();
        for (String str3 : stringSet) {
            zzby zza = zzca.zza(application, str3);
            if (zza == null) {
                valueOf = String.valueOf(str3);
                if (valueOf.length() != 0) {
                    str = "Fetching request info: failed for key: ";
                    str.concat(valueOf);
                }
            } else {
                Object obj = application.getSharedPreferences(zza.zza, 0).getAll().get(zza.zzb);
                if (obj == null) {
                    valueOf = String.valueOf(str3);
                    if (valueOf.length() != 0) {
                        str = "Stored info not exists: ";
                        str.concat(valueOf);
                    }
                } else {
                    if (obj instanceof Boolean) {
                        str2 = true != ((Boolean) obj).booleanValue() ? SessionDescription.SUPPORTED_SDP_VERSION : "1";
                    } else if (obj instanceof Number) {
                        str2 = obj.toString();
                    } else if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        valueOf = String.valueOf(str3);
                        if (valueOf.length() != 0) {
                            str = "Failed to fetch stored info: ";
                            str.concat(valueOf);
                        }
                    }
                    hashMap.put(str3, str2);
                }
            }
        }
        return hashMap;
    }

    public final Set<String> zzc() {
        return this.zzc;
    }

    public final void zzd() {
        zzca.zzb(this.zza, this.zzc);
        this.zzc.clear();
        this.zzb.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.zzb.edit().putStringSet("written_values", this.zzc).apply();
    }

    public final void zzf(int i) {
        this.zzb.edit().putInt("consent_status", i).apply();
    }

    public final void zzg(Set<String> set) {
        this.zzb.edit().putStringSet("stored_info", set).apply();
    }
}
