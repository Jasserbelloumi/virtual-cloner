package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o0ooOoOO.oO0OoOO0;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgrz<T> implements zzgsp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgtq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgrw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgrk zzn;
    private final zzgtg zzo;
    private final zzgpz zzp;
    private final zzgsb zzq;
    private final zzgrr zzr;

    private zzgrz(int[] iArr, Object[] objArr, int i, int i2, zzgrw zzgrwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgsb zzgsbVar, zzgrk zzgrkVar, zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrr zzgrrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgrwVar instanceof zzgqm;
        this.zzj = z;
        boolean z3 = false;
        if (zzgpzVar != null && zzgpzVar.zzh(zzgrwVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgsbVar;
        this.zzn = zzgrkVar;
        this.zzo = zzgtgVar;
        this.zzp = zzgpzVar;
        this.zzg = zzgrwVar;
        this.zzr = zzgrrVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzgtq.zzh(obj, j)).longValue();
    }

    private final zzgqq zzB(int i) {
        int i2 = i / 3;
        return (zzgqq) this.zzd[i2 + i2 + 1];
    }

    private final zzgsp zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgsp zzgspVar = (zzgsp) this.zzd[i3];
        if (zzgspVar != null) {
            return zzgspVar;
        }
        zzgsp zzb2 = zzgse.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzgtg zzgtgVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzgtq.zzh(obj, zzz(i) & 1048575);
        if (zzh == null || zzB(i) == null) {
            return obj2;
        }
        zzgrq zzgrqVar = (zzgrq) zzh;
        zzgrp zzgrpVar = (zzgrp) zzE(i);
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzgsp zzC = zzC(i);
        int zzz = zzz(i) & 1048575;
        if (zzS(obj, i)) {
            Object object = zzb.getObject(obj, zzz);
            if (zzV(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzgsp zzC = zzC(i2);
        if (zzW(obj, i, i2)) {
            Object object = zzb.getObject(obj, zzz(i2) & 1048575);
            if (zzV(object)) {
                return object;
            }
            Object zze = zzC.zze();
            if (object != null) {
                zzC.zzg(zze, object);
            }
            return zze;
        }
        return zzC.zze();
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Field ", str, " for ", name, " not found. Known fields are ");
            o00oOOo02.append(arrays);
            throw new RuntimeException(o00oOOo02.toString());
        }
    }

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzS(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzC = zzC(i);
            if (!zzS(obj, i)) {
                if (zzV(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzW(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzz = zzz(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzz);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzC = zzC(i);
            if (!zzW(obj, i2, i)) {
                if (zzV(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, zzz, zze);
                } else {
                    unsafe.putObject(obj, zzz, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzz);
            if (!zzV(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, zzz, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzgsh zzgshVar) throws IOException {
        int i2;
        Object zzr;
        if (zzR(i)) {
            i2 = i & 1048575;
            zzr = zzgshVar.zzs();
        } else {
            i2 = i & 1048575;
            zzr = this.zzi ? zzgshVar.zzr() : zzgshVar.zzp();
        }
        zzgtq.zzv(obj, i2, zzr);
    }

    private final void zzM(Object obj, int i) {
        int zzw = zzw(i);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzgtq.zzt(obj, j, (1 << (zzw >>> 20)) | zzgtq.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgtq.zzt(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        return zzS(obj, i) == zzS(obj2, i);
    }

    private static boolean zzR(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i) {
        int zzw = zzw(i);
        long j = zzw & 1048575;
        if (j != 1048575) {
            return (zzgtq.zzd(obj, j) & (1 << (zzw >>> 20))) != 0;
        }
        int zzz = zzz(i);
        long j2 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzgtq.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgtq.zzc(obj, j2)) != 0;
            case 2:
                return zzgtq.zzf(obj, j2) != 0;
            case 3:
                return zzgtq.zzf(obj, j2) != 0;
            case 4:
                return zzgtq.zzd(obj, j2) != 0;
            case 5:
                return zzgtq.zzf(obj, j2) != 0;
            case 6:
                return zzgtq.zzd(obj, j2) != 0;
            case 7:
                return zzgtq.zzz(obj, j2);
            case 8:
                Object zzh = zzgtq.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgpe) {
                    return !zzgpe.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgtq.zzh(obj, j2) != null;
            case 10:
                return !zzgpe.zzb.equals(zzgtq.zzh(obj, j2));
            case 11:
                return zzgtq.zzd(obj, j2) != 0;
            case 12:
                return zzgtq.zzd(obj, j2) != 0;
            case 13:
                return zzgtq.zzd(obj, j2) != 0;
            case 14:
                return zzgtq.zzf(obj, j2) != 0;
            case 15:
                return zzgtq.zzd(obj, j2) != 0;
            case 16:
                return zzgtq.zzf(obj, j2) != 0;
            case 17:
                return zzgtq.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzS(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzU(Object obj, int i, zzgsp zzgspVar) {
        return zzgspVar.zzk(zzgtq.zzh(obj, i & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgqm) {
            return ((zzgqm) obj).zzaX();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i, int i2) {
        return zzgtq.zzd(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzX(Object obj, long j) {
        return ((Boolean) zzgtq.zzh(obj, j)).booleanValue();
    }

    private final void zzY(zzgpu zzgpuVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzgrp zzgrpVar = (zzgrp) zzE(i2);
        throw null;
    }

    private static final void zzZ(int i, Object obj, zzgpu zzgpuVar) throws IOException {
        if (obj instanceof String) {
            zzgpuVar.zzF(i, (String) obj);
        } else {
            zzgpuVar.zzd(i, (zzgpe) obj);
        }
    }

    public static zzgth zzd(Object obj) {
        zzgqm zzgqmVar = (zzgqm) obj;
        zzgth zzgthVar = zzgqmVar.zzc;
        if (zzgthVar == zzgth.zzc()) {
            zzgth zzf = zzgth.zzf();
            zzgqmVar.zzc = zzf;
            return zzf;
        }
        return zzgthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgrz zzl(java.lang.Class r31, com.google.android.gms.internal.ads.zzgrt r32, com.google.android.gms.internal.ads.zzgsb r33, com.google.android.gms.internal.ads.zzgrk r34, com.google.android.gms.internal.ads.zzgtg r35, com.google.android.gms.internal.ads.zzgpz r36, com.google.android.gms.internal.ads.zzgrr r37) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgsb, com.google.android.gms.internal.ads.zzgrk, com.google.android.gms.internal.ads.zzgtg, com.google.android.gms.internal.ads.zzgpz, com.google.android.gms.internal.ads.zzgrr):com.google.android.gms.internal.ads.zzgrz");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgtq.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgtq.zzh(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        int zzE;
        int i2;
        Object object;
        int i3;
        int zzE2;
        int zzE3;
        int i4;
        int zzh;
        int zzi;
        int zzE4;
        int i5;
        Object object2;
        int i6;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzc.length) {
            int zzz = zzz(i10);
            int[] iArr = this.zzc;
            int i12 = iArr[i10];
            int zzy = zzy(zzz);
            if (zzy <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i7;
                int i15 = i13 >>> 20;
                if (i14 != i11) {
                    i8 = unsafe.getInt(obj, i14);
                    i11 = i14;
                }
                i = 1 << i15;
            } else {
                i = 0;
            }
            long j = i7 & zzz;
            switch (zzy) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    int zzF = zzgpt.zzF(unsafe.getLong(obj, j));
                    zzE = zzgpt.zzE(i12 << 3);
                    i2 = zzF;
                    i9 = zzE + i2 + i9;
                    break;
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    int zzF2 = zzgpt.zzF(unsafe.getLong(obj, j));
                    zzE = zzgpt.zzE(i12 << 3);
                    i2 = zzF2;
                    i9 = zzE + i2 + i9;
                    break;
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    i3 = i12 << 3;
                    i2 = zzgpt.zzy(unsafe.getInt(obj, j));
                    zzE = zzgpt.zzE(i3);
                    i9 = zzE + i2 + i9;
                    break;
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 1;
                    i9 += zzh;
                    break;
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzgpe)) {
                            i3 = i12 << 3;
                            i2 = zzgpt.zzC((String) object);
                            zzE = zzgpt.zzE(i3);
                            i9 = zzE + i2 + i9;
                            break;
                        }
                        int i16 = zzgpt.zzf;
                        int zzd = ((zzgpe) object).zzd();
                        zzE2 = zzd + zzgpt.zzE(zzd);
                        zzE3 = zzgpt.zzE(i12 << 3);
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgsr.zzo(i12, unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        int i162 = zzgpt.zzf;
                        int zzd2 = ((zzgpe) object).zzd();
                        zzE2 = zzd2 + zzgpt.zzE(zzd2);
                        zzE3 = zzgpt.zzE(i12 << 3);
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i3 = i12 << 3;
                        i2 = zzgpt.zzE(unsafe.getInt(obj, j));
                        zzE = zzgpt.zzE(i3);
                        i9 = zzE + i2 + i9;
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    i3 = i12 << 3;
                    i2 = zzgpt.zzy(unsafe.getInt(obj, j));
                    zzE = zzgpt.zzE(i3);
                    i9 = zzE + i2 + i9;
                    break;
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i4 = unsafe.getInt(obj, j);
                        zzh = zzgpt.zzE((i4 >> 31) ^ (i4 + i4)) + zzgpt.zzE(i12 << 3);
                        i9 += zzh;
                        break;
                    }
                case 16:
                    if ((i & i8) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzE2 = zzgpt.zzE(i12 << 3);
                        zzE3 = zzgpt.zzF((j2 >> 63) ^ (j2 + j2));
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    }
                    zzh = zzgpt.zzx(i12, (zzgrw) unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
                case 18:
                case 23:
                case 32:
                    zzh = zzgsr.zzh(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 19:
                case 24:
                case 31:
                    zzh = zzgsr.zzf(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 20:
                    zzh = zzgsr.zzm(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 21:
                    zzh = zzgsr.zzx(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 22:
                    zzh = zzgsr.zzk(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 25:
                    zzh = zzgsr.zza(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 26:
                    zzh = zzgsr.zzu(i12, (List) unsafe.getObject(obj, j));
                    i9 += zzh;
                    break;
                case 27:
                    zzh = zzgsr.zzp(i12, (List) unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
                case 28:
                    zzh = zzgsr.zzc(i12, (List) unsafe.getObject(obj, j));
                    i9 += zzh;
                    break;
                case 29:
                    zzh = zzgsr.zzv(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 30:
                    zzh = zzgsr.zzd(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 33:
                    zzh = zzgsr.zzq(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 34:
                    zzh = zzgsr.zzs(i12, (List) unsafe.getObject(obj, j), false);
                    i9 += zzh;
                    break;
                case 35:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 36:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 37:
                    zzi = zzgsr.zzn((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 38:
                    zzi = zzgsr.zzy((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 39:
                    zzi = zzgsr.zzl((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 40:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 41:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 42:
                    zzi = zzgsr.zzb((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 43:
                    zzi = zzgsr.zzw((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 44:
                    zzi = zzgsr.zze((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 45:
                    zzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 46:
                    zzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 47:
                    zzi = zzgsr.zzr((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 48:
                    zzi = zzgsr.zzt((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    }
                    i9 += zzgpt.zzE(zzi) + zzgpt.zzD(i12) + zzi;
                    break;
                case 49:
                    zzh = zzgsr.zzj(i12, (List) unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
                case 50:
                    zzgrr.zza(i12, unsafe.getObject(obj, j), zzE(i10));
                    break;
                case 51:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 52:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 53:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    int zzF3 = zzgpt.zzF(zzA(obj, j));
                    zzE4 = zzgpt.zzE(i12 << 3);
                    i5 = zzF3;
                    i9 += zzE4 + i5;
                    break;
                case 54:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    int zzF32 = zzgpt.zzF(zzA(obj, j));
                    zzE4 = zzgpt.zzE(i12 << 3);
                    i5 = zzF32;
                    i9 += zzE4 + i5;
                    break;
                case 55:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    i6 = i12 << 3;
                    i5 = zzgpt.zzy(zzq(obj, j));
                    zzE4 = zzgpt.zzE(i6);
                    i9 += zzE4 + i5;
                    break;
                case 56:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 57:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 58:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 1;
                    i9 += zzh;
                    break;
                case 59:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzgpe)) {
                            i6 = i12 << 3;
                            i5 = zzgpt.zzC((String) object2);
                            zzE4 = zzgpt.zzE(i6);
                            i9 += zzE4 + i5;
                            break;
                        }
                        int i17 = zzgpt.zzf;
                        int zzd3 = ((zzgpe) object2).zzd();
                        zzE2 = zzd3 + zzgpt.zzE(zzd3);
                        zzE3 = zzgpt.zzE(i12 << 3);
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 60:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgsr.zzo(i12, unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
                case 61:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j);
                        int i172 = zzgpt.zzf;
                        int zzd32 = ((zzgpe) object2).zzd();
                        zzE2 = zzd32 + zzgpt.zzE(zzd32);
                        zzE3 = zzgpt.zzE(i12 << 3);
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 62:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    } else {
                        i6 = i12 << 3;
                        i5 = zzgpt.zzE(zzq(obj, j));
                        zzE4 = zzgpt.zzE(i6);
                        i9 += zzE4 + i5;
                        break;
                    }
                case 63:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    i6 = i12 << 3;
                    i5 = zzgpt.zzy(zzq(obj, j));
                    zzE4 = zzgpt.zzE(i6);
                    i9 += zzE4 + i5;
                    break;
                case 64:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 4;
                    i9 += zzh;
                    break;
                case 65:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzE(i12 << 3) + 8;
                    i9 += zzh;
                    break;
                case 66:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    } else {
                        i4 = zzq(obj, j);
                        zzh = zzgpt.zzE((i4 >> 31) ^ (i4 + i4)) + zzgpt.zzE(i12 << 3);
                        i9 += zzh;
                        break;
                    }
                case 67:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    } else {
                        long zzA = zzA(obj, j);
                        zzE2 = zzgpt.zzE(i12 << 3);
                        zzE3 = zzgpt.zzF((zzA >> 63) ^ (zzA + zzA));
                        zzh = zzE2 + zzE3;
                        i9 += zzh;
                        break;
                    }
                case 68:
                    if (!zzW(obj, i12, i10)) {
                        break;
                    }
                    zzh = zzgpt.zzx(i12, (zzgrw) unsafe.getObject(obj, j), zzC(i10));
                    i9 += zzh;
                    break;
            }
            i10 += 3;
            i7 = 1048575;
        }
        zzgtg zzgtgVar = this.zzo;
        int zza2 = i9 + zzgtgVar.zza(zzgtgVar.zzd(obj));
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzgtq.zzh(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzgrr.zzb(object)) {
            zzgrq zzb2 = zzgrq.zza().zzb();
            zzgrr.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzgrp zzgrpVar = (zzgrp) zzE;
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgor.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgor.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgoqVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgor.zzj(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgoqVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgor.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgor.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgoqVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgor.zzj(bArr, i, zzgoqVar);
                    int i13 = zzgoqVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzgtv.zzj(bArr, zzj2, zzj2 + i13)) {
                        throw zzgqy.zzd();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzgqw.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzG = zzG(obj, i4, i8);
                    int zzo = zzgor.zzo(zzG, zzC(i8), bArr, i, i2, zzgoqVar);
                    zzP(obj, i4, i8, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgor.zza(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, zzgoqVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgor.zzj(bArr, i, zzgoqVar);
                    int i14 = zzgoqVar.zza;
                    zzgqq zzB = zzB(i8);
                    if (zzB == null || zzB.zza(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i14));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzgor.zzj(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgpm.zzF(zzgoqVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgor.zzm(bArr, i, zzgoqVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgpm.zzG(zzgoqVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzG2 = zzG(obj, i4, i8);
                    int zzn = zzgor.zzn(zzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgoqVar);
                    zzP(obj, i4, i8, zzG2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x024e, code lost:
        if (r29.zzb != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0250, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0252, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0253, code lost:
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0256, code lost:
        if (r4 >= r19) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0258, code lost:
        r6 = com.google.android.gms.internal.ads.zzgor.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025e, code lost:
        if (r20 == r29.zza) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0261, code lost:
        r4 = com.google.android.gms.internal.ads.zzgor.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0269, code lost:
        if (r29.zzb == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026c, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.gms.internal.ads.zzgpe.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.gms.internal.ads.zzgpe.zzw(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.gms.internal.ads.zzgor.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.zza) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.gms.internal.ads.zzgor.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01dd -> B:110:0x01e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01f3 -> B:105:0x01ca). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0252 -> B:146:0x0253). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0269 -> B:144:0x0250). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0195 -> B:90:0x0199). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ab -> B:87:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgoq r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgoq):int");
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgpe) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0325, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.ads.zzgpt.zzC((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgpe) != false) goto L54;
     */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0308, code lost:
        if (r0 != r21) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r1 = r30;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r8 = r18;
        r5 = r19;
        r3 = r20;
        r2 = r21;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0326, code lost:
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035a, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0380, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0403, code lost:
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0405, code lost:
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x040b, code lost:
        r10 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0410, code lost:
        if (r10 >= r8.zzm) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0412, code lost:
        zzD(r28, r8.zzk[r10], null, r8.zzo, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0427, code lost:
        if (r9 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0429, code lost:
        if (r6 != r31) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0430, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0431, code lost:
        if (r6 > r31) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0433, code lost:
        if (r7 != r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0435, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x043a, code lost:
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzgoq r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final Object zze() {
        return ((zzgqm) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzf(Object obj) {
        if (zzV(obj)) {
            if (obj instanceof zzgqm) {
                zzgqm zzgqmVar = (zzgqm) obj;
                zzgqmVar.zzaU(Integer.MAX_VALUE);
                zzgqmVar.zza = 0;
                zzgqmVar.zzaS();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzz = zzz(i);
                int i2 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j = i2;
                if (zzy != 9) {
                    switch (zzy) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzn.zzb(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzgrq) object).zzc();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (zzS(obj, i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzgtq.zzr(obj, j, zzgtq.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i)) {
                        zzgtq.zzs(obj, j, zzgtq.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 3:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 4:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 5:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 6:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 7:
                    if (zzS(obj2, i)) {
                        zzgtq.zzp(obj, j, zzgtq.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                    zzM(obj, i);
                    break;
                case 9:
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                    zzM(obj, i);
                    break;
                case 11:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 12:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 13:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 14:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 15:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 16:
                    if (!zzS(obj2, i)) {
                        break;
                    }
                    zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgsr.zzI(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzW(obj2, i2, i)) {
                        break;
                    }
                    zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                    zzN(obj, i2, i);
                    break;
                case 60:
                case 68:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzW(obj2, i2, i)) {
                        break;
                    }
                    zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                    zzN(obj, i2, i);
                    break;
            }
        }
        zzgsr.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgsr.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05af A[Catch: all -> 0x05a4, TryCatch #3 {all -> 0x05a4, blocks: (B:171:0x057d, B:185:0x05aa, B:187:0x05af, B:188:0x05b4), top: B:211:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e7 A[LOOP:3: B:203:0x05e3->B:205:0x05e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ba A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgsh r19, com.google.android.gms.internal.ads.zzgpy r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgsh, com.google.android.gms.internal.ads.zzgpy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e5, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e7, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fa, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0326, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0347, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgoq r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgoq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzz = zzz(i);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (zzQ(obj, obj2, i) && Double.doubleToLongBits(zzgtq.zzb(obj, j)) == Double.doubleToLongBits(zzgtq.zzb(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzQ(obj, obj2, i) && Float.floatToIntBits(zzgtq.zzc(obj, j)) == Float.floatToIntBits(zzgtq.zzc(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzQ(obj, obj2, i) && zzgtq.zzz(obj, j) == zzgtq.zzz(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzQ(obj, obj2, i) && zzgtq.zzd(obj, j) == zzgtq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzQ(obj, obj2, i) && zzgtq.zzf(obj, j) == zzgtq.zzf(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzQ(obj, obj2, i) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzw = zzw(i) & 1048575;
                    if (zzgtq.zzd(obj, zzw) == zzgtq.zzd(obj2, zzw) && zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzz = zzz(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzz) != 0 && !zzT(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzW(obj, i7, i6) && !zzU(obj, zzz, zzC(i6))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzgrq) zzgtq.zzh(obj, zzz & 1048575)).isEmpty()) {
                            zzgrp zzgrpVar = (zzgrp) zzE(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgtq.zzh(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgsp zzC = zzC(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzC.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzT(obj, i6, i, i2, i10) && !zzU(obj, zzz, zzC(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzm(Object obj, zzgpu zzgpuVar) throws IOException {
        int i;
        int i2;
        int i3;
        double zzb2;
        float zzc;
        long zzf;
        long zzf2;
        int zzd;
        long zzf3;
        int zzd2;
        boolean zzz;
        int zzd3;
        int zzd4;
        int zzd5;
        long zzf4;
        int zzd6;
        long zzf5;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzj) {
            if (this.zzh) {
                this.zzp.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int zzz2 = zzz(i6);
                int i7 = this.zzc[i6];
                switch (zzy(zzz2)) {
                    case 0:
                        if (zzS(obj, i6)) {
                            zzb2 = zzgtq.zzb(obj, zzz2 & 1048575);
                            zzgpuVar.zzf(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzS(obj, i6)) {
                            zzc = zzgtq.zzc(obj, zzz2 & 1048575);
                            zzgpuVar.zzo(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzS(obj, i6)) {
                            zzf = zzgtq.zzf(obj, zzz2 & 1048575);
                            zzgpuVar.zzt(i7, zzf);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzS(obj, i6)) {
                            zzf2 = zzgtq.zzf(obj, zzz2 & 1048575);
                            zzgpuVar.zzJ(i7, zzf2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzS(obj, i6)) {
                            zzd = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzr(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzS(obj, i6)) {
                            zzf3 = zzgtq.zzf(obj, zzz2 & 1048575);
                            zzgpuVar.zzm(i7, zzf3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzS(obj, i6)) {
                            zzd2 = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzk(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzS(obj, i6)) {
                            zzz = zzgtq.zzz(obj, zzz2 & 1048575);
                            zzgpuVar.zzb(i7, zzz);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzZ(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                        break;
                    case 9:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgpuVar.zzv(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 10:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgpuVar.zzd(i7, (zzgpe) zzgtq.zzh(obj, zzz2 & 1048575));
                        break;
                    case 11:
                        if (zzS(obj, i6)) {
                            zzd3 = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzH(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzS(obj, i6)) {
                            zzd4 = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzi(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzS(obj, i6)) {
                            zzd5 = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzw(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzS(obj, i6)) {
                            zzf4 = zzgtq.zzf(obj, zzz2 & 1048575);
                            zzgpuVar.zzy(i7, zzf4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzS(obj, i6)) {
                            zzd6 = zzgtq.zzd(obj, zzz2 & 1048575);
                            zzgpuVar.zzA(i7, zzd6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzS(obj, i6)) {
                            zzf5 = zzgtq.zzf(obj, zzz2 & 1048575);
                            zzgpuVar.zzC(i7, zzf5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzS(obj, i6)) {
                            break;
                        }
                        zzgpuVar.zzq(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 18:
                        zzgsr.zzL(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 19:
                        zzgsr.zzP(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 20:
                        zzgsr.zzS(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 21:
                        zzgsr.zzaa(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 22:
                        zzgsr.zzR(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 23:
                        zzgsr.zzO(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 24:
                        zzgsr.zzN(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 25:
                        zzgsr.zzJ(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 26:
                        zzgsr.zzY(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                        break;
                    case 27:
                        zzgsr.zzT(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, zzC(i6));
                        break;
                    case 28:
                        zzgsr.zzK(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                        break;
                    case 29:
                        zzgsr.zzZ(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 30:
                        zzgsr.zzM(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 31:
                        zzgsr.zzU(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 32:
                        zzgsr.zzV(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 33:
                        zzgsr.zzW(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 34:
                        zzgsr.zzX(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, false);
                        break;
                    case 35:
                        zzgsr.zzL(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 36:
                        zzgsr.zzP(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 37:
                        zzgsr.zzS(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 38:
                        zzgsr.zzaa(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 39:
                        zzgsr.zzR(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 40:
                        zzgsr.zzO(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 41:
                        zzgsr.zzN(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 42:
                        zzgsr.zzJ(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 43:
                        zzgsr.zzZ(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 44:
                        zzgsr.zzM(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 45:
                        zzgsr.zzU(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 46:
                        zzgsr.zzV(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 47:
                        zzgsr.zzW(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 48:
                        zzgsr.zzX(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, true);
                        break;
                    case 49:
                        zzgsr.zzQ(i7, (List) zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar, zzC(i6));
                        break;
                    case 50:
                        zzY(zzgpuVar, i7, zzgtq.zzh(obj, zzz2 & 1048575), i6);
                        break;
                    case 51:
                        if (zzW(obj, i7, i6)) {
                            zzb2 = zzn(obj, zzz2 & 1048575);
                            zzgpuVar.zzf(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzW(obj, i7, i6)) {
                            zzc = zzo(obj, zzz2 & 1048575);
                            zzgpuVar.zzo(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzW(obj, i7, i6)) {
                            zzf = zzA(obj, zzz2 & 1048575);
                            zzgpuVar.zzt(i7, zzf);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzW(obj, i7, i6)) {
                            zzf2 = zzA(obj, zzz2 & 1048575);
                            zzgpuVar.zzJ(i7, zzf2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzW(obj, i7, i6)) {
                            zzd = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzr(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzW(obj, i7, i6)) {
                            zzf3 = zzA(obj, zzz2 & 1048575);
                            zzgpuVar.zzm(i7, zzf3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzW(obj, i7, i6)) {
                            zzd2 = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzk(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzW(obj, i7, i6)) {
                            zzz = zzX(obj, zzz2 & 1048575);
                            zzgpuVar.zzb(i7, zzz);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzZ(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzgpuVar);
                        break;
                    case 60:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgpuVar.zzv(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                    case 61:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgpuVar.zzd(i7, (zzgpe) zzgtq.zzh(obj, zzz2 & 1048575));
                        break;
                    case 62:
                        if (zzW(obj, i7, i6)) {
                            zzd3 = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzH(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzW(obj, i7, i6)) {
                            zzd4 = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzi(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzW(obj, i7, i6)) {
                            zzd5 = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzw(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzW(obj, i7, i6)) {
                            zzf4 = zzA(obj, zzz2 & 1048575);
                            zzgpuVar.zzy(i7, zzf4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzW(obj, i7, i6)) {
                            zzd6 = zzq(obj, zzz2 & 1048575);
                            zzgpuVar.zzA(i7, zzd6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzW(obj, i7, i6)) {
                            zzf5 = zzA(obj, zzz2 & 1048575);
                            zzgpuVar.zzC(i7, zzf5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!zzW(obj, i7, i6)) {
                            break;
                        }
                        zzgpuVar.zzq(i7, zzgtq.zzh(obj, zzz2 & 1048575), zzC(i6));
                        break;
                }
            }
        } else if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        } else {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int zzz3 = zzz(i8);
                int[] iArr = this.zzc;
                int i11 = iArr[i8];
                int zzy = zzy(zzz3);
                if (zzy <= 17) {
                    int i12 = iArr[i8 + 2];
                    int i13 = i12 & i5;
                    if (i13 != i10) {
                        i9 = unsafe.getInt(obj, i13);
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = i4;
                }
                long j = zzz3 & i5;
                switch (zzy) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzf(i11, zzgtq.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzo(i11, zzgtq.zzc(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzb(i11, zzgtq.zzz(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzZ(i11, unsafe.getObject(obj, j), zzgpuVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzd(i11, (zzgpe) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzgpuVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzgsr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzgsr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzgsr.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzgsr.zzaa(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzgsr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 23:
                        i2 = 0;
                        zzgsr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzgsr.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzgsr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        break;
                    case 26:
                        zzgsr.zzY(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzgsr.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzgsr.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzgsr.zzZ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzgsr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzgsr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzgsr.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 33:
                        i3 = 0;
                        zzgsr.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzgsr.zzX(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzgsr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzgsr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzgsr.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzgsr.zzaa(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzgsr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzgsr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzgsr.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzgsr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzgsr.zzZ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzgsr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzgsr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzgsr.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzgsr.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzgsr.zzX(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzgsr.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i8));
                        i2 = 0;
                        break;
                    case 50:
                        zzY(zzgpuVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzf(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzo(i11, zzo(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzt(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzJ(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzr(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzm(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzk(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzb(i11, zzX(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzW(obj, i11, i8)) {
                            zzZ(i11, unsafe.getObject(obj, j), zzgpuVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzv(i11, unsafe.getObject(obj, j), zzC(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzd(i11, (zzgpe) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzH(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzi(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzw(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzy(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzA(i11, zzq(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzC(i11, zzA(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzW(obj, i11, i8)) {
                            zzgpuVar.zzq(i11, unsafe.getObject(obj, j), zzC(i8));
                        }
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                i8 += 3;
                i4 = i2;
                i5 = 1048575;
            }
        }
        zzgtg zzgtgVar = this.zzo;
        zzgtgVar.zzr(zzgtgVar.zzd(obj), zzgpuVar);
    }
}
