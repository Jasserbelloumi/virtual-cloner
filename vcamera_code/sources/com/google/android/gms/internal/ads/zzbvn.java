package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbvn extends zzbus {
    private final String zza;
    private final int zzb;

    public zzbvn(@o0OO00OO RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzbvn(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public final String zzf() throws RemoteException {
        return this.zza;
    }
}
