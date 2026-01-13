package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class zzdoc implements zzcxj, zzcwc, zzcur, zzcvi, com.google.android.gms.ads.internal.client.zza, zzczv {
    private final zzawe zza;
    @GuardedBy("this")
    private boolean zzb = false;

    public zzdoc(zzawe zzaweVar, @Nullable zzevx zzevxVar) {
        this.zza = zzaweVar;
        zzaweVar.zzc(2);
        if (zzevxVar != null) {
            zzaweVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
            return;
        }
        this.zza.zzc(7);
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzawe zzaweVar;
        int i;
        switch (zzeVar.zza) {
            case 1:
                zzaweVar = this.zza;
                i = 101;
                break;
            case 2:
                zzaweVar = this.zza;
                i = 102;
                break;
            case 3:
                zzaweVar = this.zza;
                i = 5;
                break;
            case 4:
                zzaweVar = this.zza;
                i = 103;
                break;
            case 5:
                zzaweVar = this.zza;
                i = 104;
                break;
            case 6:
                zzaweVar = this.zza;
                i = 105;
                break;
            case 7:
                zzaweVar = this.zza;
                i = 106;
                break;
            default:
                zzaweVar = this.zza;
                i = 4;
                break;
        }
        zzaweVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(final zzeyo zzeyoVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzeyo zzeyoVar2 = zzeyo.this;
                zzawp zzawpVar = (zzawp) zzaxtVar.zza().zzaB();
                zzaxh zzaxhVar = (zzaxh) zzaxtVar.zza().zzd().zzaB();
                zzaxhVar.zza(zzeyoVar2.zzb.zzb.zzb);
                zzawpVar.zzb(zzaxhVar);
                zzaxtVar.zze(zzawpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zze(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdob
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawz.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzf(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawz.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzi(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdnz
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawz.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        this.zza.zzc(3);
    }
}
