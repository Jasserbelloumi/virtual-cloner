package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
abstract class zzfof extends zzfna {
    public final CharSequence zzb;
    public final zzfng zzc;
    public int zzd = 0;
    public int zze;

    public zzfof(zzfoh zzfohVar, CharSequence charSequence) {
        zzfng zzfngVar;
        zzfngVar = zzfohVar.zza;
        this.zzc = zzfngVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfna
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i2);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc != i) {
                if (i < zzd) {
                    this.zzb.charAt(i);
                }
                if (i < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i3 = this.zze;
                if (i3 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i3 - 1;
                }
                return this.zzb.subSequence(i, zzd).toString();
            }
            int i4 = zzc + 1;
            this.zzd = i4;
            if (i4 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
