package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzdih implements zzdgq {
    @o0OO00OO
    private final zzbnu zza;
    private final zzcvg zzb;
    private final zzcum zzc;
    private final zzdca zzd;
    private final Context zze;
    private final zzeyc zzf;
    private final zzbzg zzg;
    private final zzeyx zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    @o0OO00OO
    private final zzbnq zzl;
    @o0OO00OO
    private final zzbnr zzm;

    public zzdih(@o0OO00OO zzbnq zzbnqVar, @o0OO00OO zzbnr zzbnrVar, @o0OO00OO zzbnu zzbnuVar, zzcvg zzcvgVar, zzcum zzcumVar, zzdca zzdcaVar, Context context, zzeyc zzeycVar, zzbzg zzbzgVar, zzeyx zzeyxVar, byte[] bArr) {
        this.zzl = zzbnqVar;
        this.zzm = zzbnrVar;
        this.zza = zzbnuVar;
        this.zzb = zzcvgVar;
        this.zzc = zzcumVar;
        this.zzd = zzdcaVar;
        this.zze = context;
        this.zzf = zzeycVar;
        this.zzg = zzbzgVar;
        this.zzh = zzeyxVar;
    }

    private final void zzb(View view) {
        try {
            zzbnu zzbnuVar = this.zza;
            if (zzbnuVar != null && !zzbnuVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                zzcum zzcumVar = this.zzc;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzbnq zzbnqVar = this.zzl;
            if (zzbnqVar != null && !zzbnqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                zzcum zzcumVar2 = this.zzc;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzbnr zzbnrVar = this.zzm;
            if (zzbnrVar == null || zzbnrVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            zzcum zzcumVar3 = this.zzc;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                this.zzd.zzr();
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    @o0OO00OO
    public final JSONObject zze(View view, Map map, Map map2, @o0OO00OO ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    @o0OO00OO
    public final JSONObject zzf(View view, Map map, Map map2, @o0OO00OO ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzj(@o0OO00OO com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzbza.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzk(View view, @o0OO00OO View view2, @o0OO00OO Map map, @o0OO00OO Map map2, boolean z, @o0OO00OO ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, @o0OO00OO ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.zzj) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.zzf.zzM) {
            zzb(view2);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        zzbza.zzj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzq(@o0OO00OO View view, @o0OO00OO Map map, @o0OO00OO Map map2, @o0OO00OO ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbnu zzbnuVar = this.zza;
                if (zzbnuVar != null && !zzbnuVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbnq zzbnqVar = this.zzl;
                if (zzbnqVar != null && !zzbnqVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbnr zzbnrVar = this.zzm;
                if (zzbnrVar == null || zzbnrVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzs(View view, MotionEvent motionEvent, @o0OO00OO View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzbza.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzx(zzbfr zzbfrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzy(View view, @o0OO00OO Map map, @o0OO00OO Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbq)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbr)).booleanValue() && next.equals("3010")) {
                                zzbnu zzbnuVar = this.zza;
                                Object obj2 = null;
                                if (zzbnuVar != null) {
                                    try {
                                        zzn = zzbnuVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbnq zzbnqVar = this.zzl;
                                    if (zzbnqVar != null) {
                                        zzn = zzbnqVar.zzk();
                                    } else {
                                        zzbnr zzbnrVar = this.zzm;
                                        zzn = zzbnrVar != null ? zzbnrVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbnu zzbnuVar2 = this.zza;
            if (zzbnuVar2 != null) {
                zzbnuVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbnq zzbnqVar2 = this.zzl;
            if (zzbnqVar2 != null) {
                zzbnqVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbnr zzbnrVar2 = this.zzm;
            if (zzbnrVar2 != null) {
                zzbnrVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzz(View view, @o0OO00OO Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbnu zzbnuVar = this.zza;
            if (zzbnuVar != null) {
                zzbnuVar.zzz(wrap);
                return;
            }
            zzbnq zzbnqVar = this.zzl;
            if (zzbnqVar != null) {
                zzbnqVar.zzw(wrap);
                return;
            }
            zzbnr zzbnrVar = this.zzm;
            if (zzbnrVar != null) {
                zzbnrVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call untrackView", e);
        }
    }
}
