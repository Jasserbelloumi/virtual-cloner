package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzbvg implements RewardItem {
    private final zzbut zza;

    public zzbvg(zzbut zzbutVar) {
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbut zzbutVar = this.zza;
        if (zzbutVar != null) {
            try {
                return zzbutVar.zze();
            } catch (RemoteException e) {
                zzbza.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @o0OO00OO
    public final String getType() {
        zzbut zzbutVar = this.zza;
        if (zzbutVar != null) {
            try {
                return zzbutVar.zzf();
            } catch (RemoteException e) {
                zzbza.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
