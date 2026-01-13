package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes2.dex */
final class zzfoa extends zzfof {
    public final /* synthetic */ zzfob zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoa(zzfob zzfobVar, zzfoh zzfohVar, CharSequence charSequence) {
        super(zzfohVar, charSequence);
        this.zza = zzfobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzd(int i) {
        zzfng zzfngVar = this.zza.zza;
        CharSequence charSequence = ((zzfof) this).zzb;
        int length = charSequence.length();
        zzfnu.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfngVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
