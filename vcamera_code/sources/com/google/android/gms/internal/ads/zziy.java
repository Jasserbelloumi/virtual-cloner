package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyp, zzoc, zzuu, zzrs, zzgy, zzgu, zzku, zzhk {
    public static final /* synthetic */ int zzb = 0;
    public final /* synthetic */ zzjc zza;

    public /* synthetic */ zziy(zzjc zzjcVar, zzix zzixVar) {
        this.zza = zzjcVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjc.zzW(this.zza, surfaceTexture);
        zzjc.zzU(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjc.zzX(this.zza, null);
        zzjc.zzU(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjc.zzU(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzjc.zzU(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjc.zzU(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(boolean z) {
        zzjc.zzZ(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzb(Exception exc) {
        zzjc.zzL(this.zza).zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzc(String str, long j, long j2) {
        zzjc.zzL(this.zza).zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzd(String str) {
        zzjc.zzL(this.zza).zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zze(zzhb zzhbVar) {
        zzjc.zzL(this.zza).zzB(zzhbVar);
        zzjc.zzO(this.zza, null);
        zzjc.zzN(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzf(zzhb zzhbVar) {
        zzjc.zzN(this.zza, zzhbVar);
        zzjc.zzL(this.zza).zzC(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzg(zzaf zzafVar, @o0OO00OO zzhc zzhcVar) {
        zzjc.zzO(this.zza, zzafVar);
        zzjc.zzL(this.zza).zzD(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzh(long j) {
        zzjc.zzL(this.zza).zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzi(Exception exc) {
        zzjc.zzL(this.zza).zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzj(int i, long j, long j2) {
        zzjc.zzL(this.zza).zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzk(int i, long j) {
        zzjc.zzL(this.zza).zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzl(Object obj, long j) {
        zzjc.zzL(this.zza).zzI(obj, j);
        zzjc zzjcVar = this.zza;
        if (zzjc.zzM(zzjcVar) == obj) {
            zzeb zzI = zzjc.zzI(zzjcVar);
            zzI.zzd(26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzdy
                public final void zza(Object obj2) {
                    zzcd zzcdVar = (zzcd) obj2;
                }
            });
            zzI.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzm(final boolean z) {
        zzjc zzjcVar = this.zza;
        if (zzjc.zzae(zzjcVar) == z) {
            return;
        }
        zzjc.zzQ(zzjcVar, z);
        zzeb zzI = zzjc.zzI(this.zza);
        zzI.zzd(23, new zzdy() { // from class: com.google.android.gms.internal.ads.zziv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzcd) obj).zzq(z);
            }
        });
        zzI.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzn(Exception exc) {
        zzjc.zzL(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzo(String str, long j, long j2) {
        zzjc.zzL(this.zza).zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzp(String str) {
        zzjc.zzL(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzq(zzhb zzhbVar) {
        zzjc.zzL(this.zza).zzM(zzhbVar);
        zzjc.zzS(this.zza, null);
        zzjc.zzR(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzr(zzhb zzhbVar) {
        zzjc.zzR(this.zza, zzhbVar);
        zzjc.zzL(this.zza).zzN(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzs(long j, int i) {
        zzjc.zzL(this.zza).zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzt(zzaf zzafVar, @o0OO00OO zzhc zzhcVar) {
        zzjc.zzS(this.zza, zzafVar);
        zzjc.zzL(this.zza).zzP(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzu(final zzda zzdaVar) {
        zzjc.zzT(this.zza, zzdaVar);
        zzeb zzI = zzjc.zzI(this.zza);
        zzI.zzd(25, new zzdy() { // from class: com.google.android.gms.internal.ads.zziw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzcd) obj).zzu(zzda.this);
            }
        });
        zzI.zzc();
    }
}
