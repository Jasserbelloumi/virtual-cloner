package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzgqh implements zzgru {
    private static final zzgqh zza = new zzgqh();

    private zzgqh() {
    }

    public static zzgqh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgrt zzb(Class cls) {
        if (zzgqm.class.isAssignableFrom(cls)) {
            try {
                return (zzgrt) zzgqm.zzaC(cls.asSubclass(zzgqm.class)).zzb(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final boolean zzc(Class cls) {
        return zzgqm.class.isAssignableFrom(cls);
    }
}
