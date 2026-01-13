package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o00oOooO.o0O00O0;
/* loaded from: classes2.dex */
public abstract class zzdf implements zzde {
    public zzdc zzb;
    public zzdc zzc;
    private zzdc zzd;
    private zzdc zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdf() {
        ByteBuffer byteBuffer = zzde.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdc zzdcVar = zzdc.zza;
        this.zzd = zzdcVar;
        this.zze = zzdcVar;
        this.zzb = zzdcVar;
        this.zzc = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        this.zzd = zzdcVar;
        this.zze = zzi(zzdcVar);
        return zzg() ? this.zze : zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    @o0O00O0
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzde.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc() {
        this.zzg = zzde.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzf() {
        zzc();
        this.zzf = zzde.zza;
        zzdc zzdcVar = zzdc.zza;
        this.zzd = zzdcVar;
        this.zze = zzdcVar;
        this.zzb = zzdcVar;
        this.zzc = zzdcVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public boolean zzg() {
        return this.zze != zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    @o0O00O0
    public boolean zzh() {
        return this.zzh && this.zzg == zzde.zza;
    }

    public zzdc zzi(zzdc zzdcVar) throws zzdd {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
