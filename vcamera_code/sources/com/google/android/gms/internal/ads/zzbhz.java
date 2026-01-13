package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.CueDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00ooOoo.oO0O0OO;
import o00oooOo.oOO0O000;
import o0O0Oooo.oooOO0;
/* loaded from: classes2.dex */
public final class zzbhz implements zzbhp {
    @o0OO00OO
    private final com.google.android.gms.ads.internal.zzb zza;
    @o0OO00OO
    private final zzdpi zzb;
    @o0OO00OO
    private final zzfdk zzc;
    @o0OO00OO
    private final zzbpz zze;
    @o0OO00OO
    private final zzeaf zzf;
    private com.google.android.gms.ads.internal.overlay.zzx zzg = null;
    private final zzbzf zzd = new zzbzf(null);

    public zzbhz(com.google.android.gms.ads.internal.zzb zzbVar, zzbpz zzbpzVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = zzbVar;
        this.zze = zzbpzVar;
        this.zzf = zzeafVar;
        this.zzb = zzdpiVar;
        this.zzc = zzfdkVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return CueDecoder.BUNDLED_CUES.equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzapw zzapwVar, Uri uri, View view, @o0OO00OO Activity activity) {
        if (zzapwVar == null) {
            return uri;
        }
        try {
            return zzapwVar.zze(uri) ? zzapwVar.zza(uri, context, view, activity) : uri;
        } catch (zzapx unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzbza.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (com.google.android.gms.internal.ads.zzbhy.zzc(r11, r5, r6, r7) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhz.zzh(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z) {
        zzbpz zzbpzVar = this.zze;
        if (zzbpzVar != null) {
            zzbpzVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        String str3;
        zzdpi zzdpiVar = this.zzb;
        if (zzdpiVar != null) {
            zzean.zzc(context, zzdpiVar, this.zzc, this.zzf, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzx(context)) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzv = com.google.android.gms.ads.internal.util.zzs.zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean o00oOOo02 = oO0O0OO.o00oo0O0(context).o00oOOo0();
        boolean zzh = com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel");
        zzcei zzceiVar = (zzcei) zzaVar;
        boolean z = zzceiVar.zzO().zzi() && zzceiVar.zzi() == null;
        if (o00oOOo02 && !zzh && zzv != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhK)).booleanValue()) {
                if (zzceiVar.zzO().zzi()) {
                    zzean.zzh(zzceiVar.zzi(), null, zzv, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcfn) zzaVar).zzaE(zzv, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdpi zzdpiVar2 = this.zzb;
                if (zzdpiVar2 != null) {
                    zzean.zzc(context, zzdpiVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            if (!o00oOOo02) {
                str3 = "notifications_disabled";
            } else if (zzh) {
                str3 = "notification_channel_disabled";
            } else if (zzv == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhK)).booleanValue()) {
                    if (z) {
                        str3 = "fullscreen_no_activity";
                    }
                    zzean.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
                } else {
                    str3 = "notification_flow_disabled";
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            zzean.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzdph zza = this.zzb.zza();
            zza.zzb("action", "cct_action");
            zza.zzb("cct_open_status", zzbbr.zza(i));
            zza.zzg();
            return;
        }
        zzfdk zzfdkVar = this.zzc;
        String zza2 = zzbbr.zza(i);
        zzfdj zzb = zzfdj.zzb("cct_action");
        zzb.zza("cct_open_status", zza2);
        zzfdkVar.zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    /* renamed from: zze */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        zzcei zzceiVar = (zzcei) zzaVar;
        String zzc = zzbxh.zzc((String) map.get("u"), zzceiVar.getContext(), true);
        String str2 = (String) map.get(oooOO0.f12266o00oOOo0);
        if (str2 == null) {
            zzbza.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzeyc zzD = zzceiVar.zzD();
        zzeyf zzP = zzceiVar.zzP();
        boolean z2 = false;
        if (zzD == null || zzP == null) {
            str = "";
            z = false;
        } else {
            z = zzD.zzaj;
            str = zzP.zzb;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjd)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(SessionDescription.SUPPORTED_SDP_VERSION)) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzceiVar.zzaA()) {
                zzbza.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzi(false);
            ((zzcfn) zzaVar).zzaF(zzf(map), zzb(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzi(false);
            if (zzc != null) {
                ((zzcfn) zzaVar).zzaG(zzf(map), zzb(map), zzc, z3);
            } else {
                ((zzcfn) zzaVar).zzaH(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzceiVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzed)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzej)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeh)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzei);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfoh.zzc(zzfng.zzc(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zzg = zzbbs.zzg(zzceiVar.getContext());
            if (z2) {
                if (zzg) {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        zzbza.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzceiVar.getContext(), zzceiVar.zzI(), Uri.parse(zzc), zzceiVar.zzF(), zzceiVar.zzi()));
                    if (z && this.zzf != null && zzj(zzaVar, zzceiVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbhw(this);
                    ((zzcfn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
                zzk(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzh(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhC)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get(TtmlNode.TAG_P);
                if (str5 == null) {
                    zzbza.zzj("Package name missing from open app action.");
                } else if (!z || this.zzf == null || !zzj(zzaVar, zzceiVar.getContext(), str5, str)) {
                    PackageManager packageManager = zzceiVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzbza.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcfn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    }
                }
            }
        } else {
            zzi(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e) {
                    zzbza.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzceiVar.getContext(), zzceiVar.zzI(), data, zzceiVar.zzF(), zzceiVar.zzi()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhD)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhO)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = TtmlNode.TAG_P;
                this.zzg = new zzbhx(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = TtmlNode.TAG_P;
            }
            if (intent2 != null) {
                if (!z || this.zzf == null || !zzj(zzaVar, zzceiVar.getContext(), intent2.getData().toString(), str)) {
                    ((zzcfn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbki) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zzd(zzc(zzceiVar.getContext(), zzceiVar.zzI(), Uri.parse(zzc), zzceiVar.zzF(), zzceiVar.zzi())).toString();
            }
            if (!z || this.zzf == null || !zzj(zzaVar, zzceiVar.getContext(), zzc, str)) {
                ((zzcfn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzc, (String) map.get(oOO0O000.f9796o00oOOoO), (String) map.get(obj), (String) map.get(CueDecoder.BUNDLED_CUES), (String) map.get("f"), (String) map.get("e"), this.zzg), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzbki) zzaVar).zzd("openIntentAsync", hashMap4);
            }
        }
    }
}
