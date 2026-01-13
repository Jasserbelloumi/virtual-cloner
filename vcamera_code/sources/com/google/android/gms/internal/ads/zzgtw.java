package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzgtw {
    public static final zzgtw zza;
    public static final zzgtw zzb;
    public static final zzgtw zzc;
    public static final zzgtw zzd;
    public static final zzgtw zze;
    public static final zzgtw zzf;
    public static final zzgtw zzg;
    public static final zzgtw zzh;
    public static final zzgtw zzi;
    public static final zzgtw zzj;
    public static final zzgtw zzk;
    public static final zzgtw zzl;
    public static final zzgtw zzm;
    public static final zzgtw zzn;
    public static final zzgtw zzo;
    public static final zzgtw zzp;
    public static final zzgtw zzq;
    public static final zzgtw zzr;
    private static final /* synthetic */ zzgtw[] zzs;
    private final zzgtx zzt;

    static {
        zzgtw zzgtwVar = new zzgtw("DOUBLE", 0, zzgtx.DOUBLE, 1);
        zza = zzgtwVar;
        zzgtw zzgtwVar2 = new zzgtw("FLOAT", 1, zzgtx.FLOAT, 5);
        zzb = zzgtwVar2;
        zzgtx zzgtxVar = zzgtx.LONG;
        zzgtw zzgtwVar3 = new zzgtw("INT64", 2, zzgtxVar, 0);
        zzc = zzgtwVar3;
        zzgtw zzgtwVar4 = new zzgtw("UINT64", 3, zzgtxVar, 0);
        zzd = zzgtwVar4;
        zzgtx zzgtxVar2 = zzgtx.INT;
        zzgtw zzgtwVar5 = new zzgtw("INT32", 4, zzgtxVar2, 0);
        zze = zzgtwVar5;
        zzgtw zzgtwVar6 = new zzgtw("FIXED64", 5, zzgtxVar, 1);
        zzf = zzgtwVar6;
        zzgtw zzgtwVar7 = new zzgtw("FIXED32", 6, zzgtxVar2, 5);
        zzg = zzgtwVar7;
        zzgtw zzgtwVar8 = new zzgtw("BOOL", 7, zzgtx.BOOLEAN, 0);
        zzh = zzgtwVar8;
        zzgtw zzgtwVar9 = new zzgtw("STRING", 8, zzgtx.STRING, 2);
        zzi = zzgtwVar9;
        zzgtx zzgtxVar3 = zzgtx.MESSAGE;
        zzgtw zzgtwVar10 = new zzgtw("GROUP", 9, zzgtxVar3, 3);
        zzj = zzgtwVar10;
        zzgtw zzgtwVar11 = new zzgtw("MESSAGE", 10, zzgtxVar3, 2);
        zzk = zzgtwVar11;
        zzgtw zzgtwVar12 = new zzgtw("BYTES", 11, zzgtx.BYTE_STRING, 2);
        zzl = zzgtwVar12;
        zzgtw zzgtwVar13 = new zzgtw("UINT32", 12, zzgtxVar2, 0);
        zzm = zzgtwVar13;
        zzgtw zzgtwVar14 = new zzgtw("ENUM", 13, zzgtx.ENUM, 0);
        zzn = zzgtwVar14;
        zzgtw zzgtwVar15 = new zzgtw("SFIXED32", 14, zzgtxVar2, 5);
        zzo = zzgtwVar15;
        zzgtw zzgtwVar16 = new zzgtw("SFIXED64", 15, zzgtxVar, 1);
        zzp = zzgtwVar16;
        zzgtw zzgtwVar17 = new zzgtw("SINT32", 16, zzgtxVar2, 0);
        zzq = zzgtwVar17;
        zzgtw zzgtwVar18 = new zzgtw("SINT64", 17, zzgtxVar, 0);
        zzr = zzgtwVar18;
        zzs = new zzgtw[]{zzgtwVar, zzgtwVar2, zzgtwVar3, zzgtwVar4, zzgtwVar5, zzgtwVar6, zzgtwVar7, zzgtwVar8, zzgtwVar9, zzgtwVar10, zzgtwVar11, zzgtwVar12, zzgtwVar13, zzgtwVar14, zzgtwVar15, zzgtwVar16, zzgtwVar17, zzgtwVar18};
    }

    private zzgtw(String str, int i, zzgtx zzgtxVar, int i2) {
        this.zzt = zzgtxVar;
    }

    public static zzgtw[] values() {
        return (zzgtw[]) zzs.clone();
    }

    public final zzgtx zza() {
        return this.zzt;
    }
}
