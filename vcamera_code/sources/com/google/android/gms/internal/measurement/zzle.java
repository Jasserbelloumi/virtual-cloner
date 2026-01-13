package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzle implements zzly {
    private static final zzlk zza = new zzlc();
    private final zzlk zzb;

    public zzle() {
        zzlk zzlkVar;
        zzlk[] zzlkVarArr = new zzlk[2];
        zzlkVarArr[0] = zzka.zza();
        try {
            zzlkVar = (zzlk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzlkVar = zza;
        }
        zzlkVarArr[1] = zzlkVar;
        zzld zzldVar = new zzld(zzlkVarArr);
        zzkn.zzf(zzldVar, "messageInfoFactory");
        this.zzb = zzldVar;
    }

    private static boolean zzb(zzlj zzljVar) {
        return zzljVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzly
    public final zzlx zza(Class cls) {
        zzlr zza2;
        zzla zzc;
        zzmo zzA;
        zzjs zzjsVar;
        zzlh zza3;
        zzmo zzz;
        zzjs zza4;
        zzlz.zzG(cls);
        zzlj zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzkf.class.isAssignableFrom(cls)) {
                zzz = zzlz.zzB();
                zza4 = zzju.zzb();
            } else {
                zzz = zzlz.zzz();
                zza4 = zzju.zza();
            }
            return zzlq.zzc(zzz, zza4, zzb.zza());
        }
        if (zzkf.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzls.zzb();
            zzc = zzla.zzd();
            zzA = zzlz.zzB();
            zzjsVar = zzb2 ? zzju.zzb() : null;
            zza3 = zzli.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzls.zza();
            zzc = zzla.zzc();
            if (zzb3) {
                zzA = zzlz.zzz();
                zzjsVar = zzju.zza();
            } else {
                zzA = zzlz.zzA();
                zzjsVar = null;
            }
            zza3 = zzli.zza();
        }
        return zzlp.zzl(cls, zzb, zza2, zzc, zzA, zzjsVar, zza3);
    }
}
