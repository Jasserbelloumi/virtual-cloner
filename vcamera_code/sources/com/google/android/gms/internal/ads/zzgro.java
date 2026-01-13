package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgro implements zzgsq {
    private static final zzgru zza = new zzgrm();
    private final zzgru zzb;

    public zzgro() {
        zzgru zzgruVar;
        zzgru[] zzgruVarArr = new zzgru[2];
        zzgruVarArr[0] = zzgqh.zza();
        try {
            zzgruVar = (zzgru) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgruVar = zza;
        }
        zzgruVarArr[1] = zzgruVar;
        zzgrn zzgrnVar = new zzgrn(zzgruVarArr);
        zzgqw.zzf(zzgrnVar, "messageInfoFactory");
        this.zzb = zzgrnVar;
    }

    private static boolean zzb(zzgrt zzgrtVar) {
        return zzgrtVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsp zza(Class cls) {
        zzgsb zza2;
        zzgrk zzd;
        zzgtg zzA;
        zzgpz zzgpzVar;
        zzgrr zza3;
        zzgtg zzz;
        zzgpz zza4;
        zzgsr.zzG(cls);
        zzgrt zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgqm.class.isAssignableFrom(cls)) {
                zzz = zzgsr.zzB();
                zza4 = zzgqb.zzb();
            } else {
                zzz = zzgsr.zzz();
                zza4 = zzgqb.zza();
            }
            return zzgsa.zzc(zzz, zza4, zzb.zza());
        }
        if (zzgqm.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzgsc.zzb();
            zzd = zzgrk.zze();
            zzA = zzgsr.zzB();
            zzgpzVar = zzb2 ? zzgqb.zzb() : null;
            zza3 = zzgrs.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzgsc.zza();
            zzd = zzgrk.zzd();
            if (zzb3) {
                zzA = zzgsr.zzz();
                zzgpzVar = zzgqb.zza();
            } else {
                zzA = zzgsr.zzA();
                zzgpzVar = null;
            }
            zza3 = zzgrs.zza();
        }
        return zzgrz.zzl(cls, zzb, zza2, zzd, zzA, zzgpzVar, zza3);
    }
}
