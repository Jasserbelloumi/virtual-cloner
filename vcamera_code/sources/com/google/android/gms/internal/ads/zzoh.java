package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzoh extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zzoh(int i, zzaf zzafVar, boolean z) {
        super(android.support.v4.media.o00oOOo0.o00oOOo0("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzafVar;
    }
}
