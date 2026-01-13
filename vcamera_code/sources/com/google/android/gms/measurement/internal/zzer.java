package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oO0Oo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzer {
    public final /* synthetic */ zzew zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzer(zzew zzewVar, String str, Bundle bundle) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    @oO0Oo
    public final Bundle zza() {
        char c;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c != 2) {
                                this.zza.zzt.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzt.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    o00oOOo0.o00oOOo0(this.zza.zzt, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    @oO0Oo
    public final void zzb(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str2 = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
                        } else {
                            this.zza.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.zza.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle;
    }
}
