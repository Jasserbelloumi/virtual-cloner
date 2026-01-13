package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaku {
    @o0OO00OO
    public final Object zza;
    @o0OO00OO
    public final zzajx zzb;
    @o0OO00OO
    public final zzakx zzc;
    public boolean zzd;

    private zzaku(zzakx zzakxVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakxVar;
    }

    private zzaku(@o0OO00OO Object obj, @o0OO00OO zzajx zzajxVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajxVar;
        this.zzc = null;
    }

    public static zzaku zza(zzakx zzakxVar) {
        return new zzaku(zzakxVar);
    }

    public static zzaku zzb(@o0OO00OO Object obj, @o0OO00OO zzajx zzajxVar) {
        return new zzaku(obj, zzajxVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
