package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzeap implements zzeaq {
    @o0OO00OO
    private static zzffp zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzffp.VIDEO;
            }
            return zzffp.NATIVE_DISPLAY;
        }
        return zzffp.HTML_DISPLAY;
    }

    private static zzffr zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzffr.UNSPECIFIED : zzffr.ONE_PIXEL : zzffr.DEFINED_BY_JAVASCRIPT : zzffr.BEGIN_TO_RENDER;
    }

    private static zzffs zzh(@o0OO00OO String str) {
        return "native".equals(str) ? zzffs.NATIVE : "javascript".equals(str) ? zzffs.JAVASCRIPT : zzffs.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    @o0OO00OO
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, @o0OO00OO String str4, zzeas zzeasVar, zzear zzearVar, @o0OO00OO String str5) {
        String valueOf;
        String str6;
        String concat;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            zzfft zza = zzfft.zza("Google", str);
            zzffs zzh = zzh("javascript");
            zzffp zzf = zzf(zzearVar.toString());
            zzffs zzffsVar = zzffs.NONE;
            if (zzh == zzffsVar) {
                concat = "Omid html session error; Unable to parse impression owner: javascript";
            } else {
                if (zzf == null) {
                    valueOf = String.valueOf(zzearVar);
                    str6 = "Omid html session error; Unable to parse creative type: ";
                } else {
                    zzffs zzh2 = zzh(str4);
                    if (zzf != zzffp.VIDEO || zzh2 != zzffsVar) {
                        return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzf, zzg(zzeasVar.toString()), zzh, zzh2, true), zzffm.zzb(zza, webView, str5, "")));
                    }
                    valueOf = String.valueOf(str4);
                    str6 = "Omid html session error; Video events owner unknown for video creative: ";
                }
                concat = str6.concat(valueOf);
            }
            zzbza.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    @o0OO00OO
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, @o0OO00OO String str4, String str5, zzeas zzeasVar, zzear zzearVar, @o0OO00OO String str6) {
        String valueOf;
        String str7;
        String concat;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            zzfft zza = zzfft.zza(str5, str);
            zzffs zzh = zzh("javascript");
            zzffs zzh2 = zzh(str4);
            zzffp zzf = zzf(zzearVar.toString());
            zzffs zzffsVar = zzffs.NONE;
            if (zzh == zzffsVar) {
                concat = "Omid js session error; Unable to parse impression owner: javascript";
            } else {
                if (zzf == null) {
                    valueOf = String.valueOf(zzearVar);
                    str7 = "Omid js session error; Unable to parse creative type: ";
                } else if (zzf != zzffp.VIDEO || zzh2 != zzffsVar) {
                    return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzf, zzg(zzeasVar.toString()), zzh, zzh2, true), zzffm.zzc(zza, webView, str6, "")));
                } else {
                    valueOf = String.valueOf(str4);
                    str7 = "Omid js session error; Video events owner unknown for video creative: ";
                }
                concat = str7.concat(valueOf);
            }
            zzbza.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzffk) {
                ((zzffk) unwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzffk) {
                ((zzffk) unwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue()) {
            zzbza.zzj("Omid flag is disabled");
            return false;
        } else if (zzffi.zzb()) {
            return true;
        } else {
            zzffi.zza(context);
            return zzffi.zzb();
        }
    }
}
