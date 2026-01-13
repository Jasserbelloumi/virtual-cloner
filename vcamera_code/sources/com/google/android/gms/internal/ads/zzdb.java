package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdb {
    private final zzfqk zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdc zzd;
    private zzdc zze;
    private boolean zzf;

    public zzdb(zzfqk zzfqkVar) {
        this.zza = zzfqkVar;
        zzdc zzdcVar = zzdc.zza;
        this.zzd = zzdcVar;
        this.zze = zzdcVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                if (!this.zzc[i].hasRemaining()) {
                    zzde zzdeVar = (zzde) this.zzb.get(i);
                    if (!zzdeVar.zzh()) {
                        zzdeVar.zze(i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzde.zza);
                        this.zzc[i] = zzdeVar.zzb();
                        int i2 = ((byteBuffer2.remaining() - byteBuffer2.remaining()) > 0L ? 1 : ((byteBuffer2.remaining() - byteBuffer2.remaining()) == 0L ? 0 : -1));
                        boolean z2 = true;
                        if (i2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzde) this.zzb.get(i + 1)).zzd();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj;
            if (this.zza.size() == zzdbVar.zza.size()) {
                for (int i = 0; i < this.zza.size(); i++) {
                    if (this.zza.get(i) != zzdbVar.zza.get(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.equals(zzdc.zza)) {
            throw new zzdd(zzdcVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzde zzdeVar = (zzde) this.zza.get(i);
            zzdc zza = zzdeVar.zza(zzdcVar);
            if (zzdeVar.zzg()) {
                zzdl.zzf(!zza.equals(zzdc.zza));
                zzdcVar = zza;
            }
        }
        this.zze = zzdcVar;
        return zzdcVar;
    }

    public final ByteBuffer zzb() {
        if (zzh()) {
            ByteBuffer byteBuffer = this.zzc[zzi()];
            if (!byteBuffer.hasRemaining()) {
                zzj(zzde.zza);
            }
            return byteBuffer;
        }
        return zzde.zza;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzde zzdeVar = (zzde) this.zza.get(i);
            zzdeVar.zzc();
            if (zzdeVar.zzg()) {
                this.zzb.add(zzdeVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzde) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzde) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzde zzdeVar = (zzde) this.zza.get(i);
            zzdeVar.zzc();
            zzdeVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdc zzdcVar = zzdc.zza;
        this.zzd = zzdcVar;
        this.zze = zzdcVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzde) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
