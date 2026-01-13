package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.o00ooO0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzdkn extends zzbeq {
    private final Context zza;
    private final zzdgi zzb;
    private zzdhi zzc;
    private zzdgd zzd;

    public zzdkn(Context context, zzdgi zzdgiVar, zzdhi zzdhiVar, zzdgd zzdgdVar) {
        this.zza = context;
        this.zzb = zzdgiVar;
        this.zzc = zzdhiVar;
        this.zzd = zzdgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdu zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdx zzg(String str) {
        return (zzbdx) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzi() {
        return this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final List zzk() {
        o00ooO0 zzh = this.zzb.zzh();
        o00ooO0 zzi = this.zzb.zzi();
        String[] strArr = new String[zzi.size() + zzh.size()];
        int i = 0;
        for (int i2 = 0; i2 < zzh.size(); i2++) {
            strArr[i] = (String) zzh.o00oOoOo(i2);
            i++;
        }
        for (int i3 = 0; i3 < zzi.size(); i3++) {
            strArr[i] = (String) zzi.o00oOoOo(i3);
            i++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzl() {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzm() {
        String zzB = this.zzb.zzB();
        if ("Google".equals(zzB)) {
            zzbza.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzB)) {
            zzbza.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdgd zzdgdVar = this.zzd;
            if (zzdgdVar != null) {
                zzdgdVar.zzt(zzB, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzn(String str) {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzo() {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdgd zzdgdVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdgdVar = this.zzd) == null) {
            return;
        }
        zzdgdVar.zzI((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzq() {
        zzdgd zzdgdVar = this.zzd;
        return (zzdgdVar == null || zzdgdVar.zzV()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdhi zzdhiVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdhiVar = this.zzc) != null && zzdhiVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzr().zzao(new zzdkm(this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzs() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu == null) {
            zzbza.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzd(zzu);
        if (this.zzb.zzq() != null) {
            this.zzb.zzq().zzd("onSdkLoaded", new androidx.collection.o00oOOo0());
            return true;
        }
        return true;
    }
}
