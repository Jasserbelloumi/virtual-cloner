package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzatv {
    @VisibleForTesting
    public int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    @o0OO00OO
    public final zzatu zza(boolean z) {
        synchronized (this.zzb) {
            zzatu zzatuVar = null;
            if (this.zzc.isEmpty()) {
                zzbza.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzatu zzatuVar2 = (zzatu) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzatuVar2.zzi();
                }
                return zzatuVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzatu zzatuVar3 : this.zzc) {
                int zzb = zzatuVar3.zzb();
                if (zzb > i2) {
                    i = i3;
                }
                int i4 = zzb > i2 ? zzb : i2;
                if (zzb > i2) {
                    zzatuVar = zzatuVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzatuVar;
        }
    }

    public final void zzb(zzatu zzatuVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzbza.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzatuVar.zzj(i);
            zzatuVar.zzn();
            this.zzc.add(zzatuVar);
        }
    }

    public final boolean zzc(zzatu zzatuVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzatu zzatuVar2 = (zzatu) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && !zzatuVar.equals(zzatuVar2) && zzatuVar2.zzf().equals(zzatuVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzatuVar.equals(zzatuVar2) && zzatuVar2.zzd().equals(zzatuVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzatu zzatuVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzatuVar);
        }
    }
}
