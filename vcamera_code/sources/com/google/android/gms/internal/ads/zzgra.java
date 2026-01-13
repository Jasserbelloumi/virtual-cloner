package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzgra {
    public static final zzgra zza;
    public static final zzgra zzb;
    public static final zzgra zzc;
    public static final zzgra zzd;
    public static final zzgra zze;
    public static final zzgra zzf;
    public static final zzgra zzg;
    public static final zzgra zzh;
    public static final zzgra zzi;
    public static final zzgra zzj;
    private static final /* synthetic */ zzgra[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzgra zzgraVar = new zzgra("VOID", 0, Void.class, Void.class, null);
        zza = zzgraVar;
        Class cls = Integer.TYPE;
        zzgra zzgraVar2 = new zzgra("INT", 1, cls, Integer.class, 0);
        zzb = zzgraVar2;
        zzgra zzgraVar3 = new zzgra("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgraVar3;
        zzgra zzgraVar4 = new zzgra("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgraVar4;
        zzgra zzgraVar5 = new zzgra("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgraVar5;
        zzgra zzgraVar6 = new zzgra("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgraVar6;
        zzgra zzgraVar7 = new zzgra("STRING", 6, String.class, String.class, "");
        zzg = zzgraVar7;
        zzgra zzgraVar8 = new zzgra("BYTE_STRING", 7, zzgpe.class, zzgpe.class, zzgpe.zzb);
        zzh = zzgraVar8;
        zzgra zzgraVar9 = new zzgra("ENUM", 8, cls, Integer.class, null);
        zzi = zzgraVar9;
        zzgra zzgraVar10 = new zzgra("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgraVar10;
        zzk = new zzgra[]{zzgraVar, zzgraVar2, zzgraVar3, zzgraVar4, zzgraVar5, zzgraVar6, zzgraVar7, zzgraVar8, zzgraVar9, zzgraVar10};
    }

    private zzgra(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzgra[] values() {
        return (zzgra[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
