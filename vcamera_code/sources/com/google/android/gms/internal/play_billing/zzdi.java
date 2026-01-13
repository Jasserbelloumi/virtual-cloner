package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o0ooOoOO.oO0OoOO0;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzct zzm;
    private final zzeg zzn;
    private final zzbo zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i, int i2, zzdf zzdfVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzdkVar;
        this.zzm = zzctVar;
        this.zzn = zzegVar;
        this.zzo = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i) {
        int i2 = i / 3;
        return (zzce) this.zzd[i2 + i2 + 1];
    }

    private final zzdp zzB(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzdp zzdpVar = (zzdp) this.zzd[i3];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzb2 = zzdn.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzD(Object obj, int i) {
        zzdp zzB = zzB(i);
        int zzy = zzy(i) & 1048575;
        if (zzP(obj, i)) {
            Object object = zzb.getObject(obj, zzy);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private final Object zzE(Object obj, int i, int i2) {
        zzdp zzB = zzB(i2);
        if (zzT(obj, i, i2)) {
            Object object = zzb.getObject(obj, zzy(i2) & 1048575);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzdp zzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                } else {
                    unsafe.putObject(obj, zzy, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzT(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzdp zzB = zzB(i);
            if (!zzT(obj, i2, i)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                } else {
                    unsafe.putObject(obj, zzy, object);
                }
                zzK(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzv = zzv(i);
        long j = 1048575 & zzv;
        if (j == 1048575) {
            return;
        }
        zzeq.zzq(obj, j, (1 << (zzv >>> 20)) | zzeq.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzeq.zzq(obj, zzv(i2) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzK(obj, i, i2);
    }

    private final void zzN(zzey zzeyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzcy zzcyVar = (zzcy) zzC(i2);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int zzv = zzv(i);
        long j = zzv & 1048575;
        if (j != 1048575) {
            return (zzeq.zzc(obj, j) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i);
        long j2 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zzeq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzeq.zzb(obj, j2)) != 0;
            case 2:
                return zzeq.zzd(obj, j2) != 0;
            case 3:
                return zzeq.zzd(obj, j2) != 0;
            case 4:
                return zzeq.zzc(obj, j2) != 0;
            case 5:
                return zzeq.zzd(obj, j2) != 0;
            case 6:
                return zzeq.zzc(obj, j2) != 0;
            case 7:
                return zzeq.zzw(obj, j2);
            case 8:
                Object zzf = zzeq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzba) {
                    return !zzba.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzeq.zzf(obj, j2) != null;
            case 10:
                return !zzba.zzb.equals(zzeq.zzf(obj, j2));
            case 11:
                return zzeq.zzc(obj, j2) != 0;
            case 12:
                return zzeq.zzc(obj, j2) != 0;
            case 13:
                return zzeq.zzc(obj, j2) != 0;
            case 14:
                return zzeq.zzd(obj, j2) != 0;
            case 15:
                return zzeq.zzc(obj, j2) != 0;
            case 16:
                return zzeq.zzd(obj, j2) != 0;
            case 17:
                return zzeq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzP(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzR(Object obj, int i, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzeq.zzc(obj, (long) (zzv(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzeq.zzf(obj, j)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i, (String) obj);
        } else {
            zzeyVar.zzd(i, (zzba) obj);
        }
    }

    public static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar == zzeh.zzc()) {
            zzeh zzf = zzeh.zzf();
            zzcbVar.zzc = zzf;
            return zzf;
        }
        return zzehVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.zzdi zzl(java.lang.Class r31, com.google.android.gms.internal.play_billing.zzdc r32, com.google.android.gms.internal.play_billing.zzdk r33, com.google.android.gms.internal.play_billing.zzct r34, com.google.android.gms.internal.play_billing.zzeg r35, com.google.android.gms.internal.play_billing.zzbo r36, com.google.android.gms.internal.play_billing.zzda r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdc, com.google.android.gms.internal.play_billing.zzdk, com.google.android.gms.internal.play_billing.zzct, com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzbo, com.google.android.gms.internal.play_billing.zzda):com.google.android.gms.internal.play_billing.zzdi");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzeq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzeq.zzf(obj, j)).floatValue();
    }

    private final int zzo(Object obj) {
        int i;
        int zzx;
        int i2;
        Object object;
        int i3;
        int zzx2;
        int zzx3;
        int i4;
        int zzg;
        int zzh;
        int zzx4;
        Object object2;
        int i5;
        Unsafe unsafe = zzb;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i9 < this.zzc.length) {
            int zzy = zzy(i9);
            int[] iArr = this.zzc;
            int i11 = iArr[i9];
            int zzx5 = zzx(zzy);
            if (zzx5 <= 17) {
                int i12 = iArr[i9 + 2];
                int i13 = i12 & i6;
                int i14 = i12 >>> 20;
                if (i13 != i10) {
                    i7 = unsafe.getInt(obj, i13);
                    i10 = i13;
                }
                i = 1 << i14;
            } else {
                i = 0;
            }
            long j = i6 & zzy;
            switch (zzx5) {
                case 0:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 1:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 2:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzy2 = zzbi.zzy(unsafe.getLong(obj, j));
                    zzx = zzbi.zzx(i11 << 3);
                    i2 = zzy2;
                    i8 = zzx + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 3:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzy22 = zzbi.zzy(unsafe.getLong(obj, j));
                    zzx = zzbi.zzx(i11 << 3);
                    i2 = zzy22;
                    i8 = zzx + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 4:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i3 = i11 << 3;
                    i2 = zzbi.zzu(unsafe.getInt(obj, j));
                    zzx = zzbi.zzx(i3);
                    i8 = zzx + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 5:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 6:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 7:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 1;
                    break;
                case 8:
                    if ((i7 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzba)) {
                            i3 = i11 << 3;
                            i2 = zzbi.zzw((String) object);
                            zzx = zzbi.zzx(i3);
                            i8 = zzx + i2 + i8;
                            i9 += 3;
                            i6 = 1048575;
                        }
                        int i15 = zzbi.zzb;
                        int zzd = ((zzba) object).zzd();
                        zzx2 = zzd + zzbi.zzx(zzd);
                        zzx3 = zzbi.zzx(i11 << 3);
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzdr.zzn(i11, unsafe.getObject(obj, j), zzB(i9));
                    break;
                case 10:
                    if ((i7 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        int i152 = zzbi.zzb;
                        int zzd2 = ((zzba) object).zzd();
                        zzx2 = zzd2 + zzbi.zzx(zzd2);
                        zzx3 = zzbi.zzx(i11 << 3);
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 11:
                    if ((i7 & i) != 0) {
                        i3 = i11 << 3;
                        i2 = zzbi.zzx(unsafe.getInt(obj, j));
                        zzx = zzbi.zzx(i3);
                        i8 = zzx + i2 + i8;
                        i9 += 3;
                        i6 = 1048575;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i3 = i11 << 3;
                    i2 = zzbi.zzu(unsafe.getInt(obj, j));
                    zzx = zzbi.zzx(i3);
                    i8 = zzx + i2 + i8;
                    i9 += 3;
                    i6 = 1048575;
                case 13:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 14:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 15:
                    if ((i7 & i) != 0) {
                        i4 = unsafe.getInt(obj, j);
                        zzg = zzbi.zzx((i4 >> 31) ^ (i4 + i4)) + zzbi.zzx(i11 << 3);
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 16:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        zzx2 = zzbi.zzx(i11 << 3);
                        zzx3 = zzbi.zzy((j2 >> 63) ^ (j2 + j2));
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzt(i11, (zzdf) unsafe.getObject(obj, j), zzB(i9));
                    break;
                case 18:
                case 23:
                case 32:
                    zzg = zzdr.zzg(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 19:
                case 24:
                case 31:
                    zzg = zzdr.zze(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 20:
                    zzg = zzdr.zzl(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 21:
                    zzg = zzdr.zzw(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 22:
                    zzg = zzdr.zzj(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 25:
                    zzg = zzdr.zza(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 26:
                    zzg = zzdr.zzt(i11, (List) unsafe.getObject(obj, j));
                    break;
                case 27:
                    zzg = zzdr.zzo(i11, (List) unsafe.getObject(obj, j), zzB(i9));
                    break;
                case 28:
                    zzg = zzdr.zzb(i11, (List) unsafe.getObject(obj, j));
                    break;
                case 29:
                    zzg = zzdr.zzu(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 30:
                    zzg = zzdr.zzc(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 33:
                    zzg = zzdr.zzp(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 34:
                    zzg = zzdr.zzr(i11, (List) unsafe.getObject(obj, j), false);
                    break;
                case 35:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 36:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 37:
                    zzh = zzdr.zzm((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 38:
                    zzh = zzdr.zzx((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 39:
                    zzh = zzdr.zzk((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 40:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 41:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 42:
                    int i16 = zzdr.zza;
                    zzh = ((List) unsafe.getObject(obj, j)).size();
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 43:
                    zzh = zzdr.zzv((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 44:
                    zzh = zzdr.zzd((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 45:
                    zzh = zzdr.zzf((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 46:
                    zzh = zzdr.zzh((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 47:
                    zzh = zzdr.zzq((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 48:
                    zzh = zzdr.zzs((List) unsafe.getObject(obj, j));
                    if (zzh <= 0) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzx4 = zzbi.zzx(i11 << 3) + zzbi.zzx(zzh);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 49:
                    zzg = zzdr.zzi(i11, (List) unsafe.getObject(obj, j), zzB(i9));
                    break;
                case 50:
                    zzda.zza(i11, unsafe.getObject(obj, j), zzC(i9));
                    continue;
                    i9 += 3;
                    i6 = 1048575;
                case 51:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 52:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 53:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzy3 = zzbi.zzy(zzz(obj, j));
                    zzx4 = zzbi.zzx(i11 << 3);
                    zzh = zzy3;
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 54:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    int zzy32 = zzbi.zzy(zzz(obj, j));
                    zzx4 = zzbi.zzx(i11 << 3);
                    zzh = zzy32;
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 55:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i5 = i11 << 3;
                    zzh = zzbi.zzu(zzp(obj, j));
                    zzx4 = zzbi.zzx(i5);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 56:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 57:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 58:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 1;
                    break;
                case 59:
                    if (zzT(obj, i11, i9)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof zzba)) {
                            i5 = i11 << 3;
                            zzh = zzbi.zzw((String) object2);
                            zzx4 = zzbi.zzx(i5);
                            i8 += zzx4 + zzh;
                            i9 += 3;
                            i6 = 1048575;
                        }
                        int i17 = zzbi.zzb;
                        int zzd3 = ((zzba) object2).zzd();
                        zzx2 = zzd3 + zzbi.zzx(zzd3);
                        zzx3 = zzbi.zzx(i11 << 3);
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 60:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzdr.zzn(i11, unsafe.getObject(obj, j), zzB(i9));
                    break;
                case 61:
                    if (zzT(obj, i11, i9)) {
                        object2 = unsafe.getObject(obj, j);
                        int i172 = zzbi.zzb;
                        int zzd32 = ((zzba) object2).zzd();
                        zzx2 = zzd32 + zzbi.zzx(zzd32);
                        zzx3 = zzbi.zzx(i11 << 3);
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 62:
                    if (zzT(obj, i11, i9)) {
                        i5 = i11 << 3;
                        zzh = zzbi.zzx(zzp(obj, j));
                        zzx4 = zzbi.zzx(i5);
                        i8 += zzx4 + zzh;
                        i9 += 3;
                        i6 = 1048575;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 63:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    i5 = i11 << 3;
                    zzh = zzbi.zzu(zzp(obj, j));
                    zzx4 = zzbi.zzx(i5);
                    i8 += zzx4 + zzh;
                    i9 += 3;
                    i6 = 1048575;
                case 64:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 4;
                    break;
                case 65:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzx(i11 << 3) + 8;
                    break;
                case 66:
                    if (zzT(obj, i11, i9)) {
                        i4 = zzp(obj, j);
                        zzg = zzbi.zzx((i4 >> 31) ^ (i4 + i4)) + zzbi.zzx(i11 << 3);
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 67:
                    if (zzT(obj, i11, i9)) {
                        long zzz = zzz(obj, j);
                        zzx2 = zzbi.zzx(i11 << 3);
                        zzx3 = zzbi.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzg = zzx2 + zzx3;
                        break;
                    } else {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                case 68:
                    if (!zzT(obj, i11, i9)) {
                        continue;
                        i9 += 3;
                        i6 = 1048575;
                    }
                    zzg = zzbi.zzt(i11, (zzdf) unsafe.getObject(obj, j), zzB(i9));
                    break;
                default:
                    i9 += 3;
                    i6 = 1048575;
            }
            i8 += zzg;
            i9 += 3;
            i6 = 1048575;
        }
        zzeg zzegVar = this.zzn;
        int zza2 = i8 + zzegVar.zza(zzegVar.zzd(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzeq.zzf(obj, j)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzcz) object).zze()) {
            zzcz zzb2 = zzcz.zza().zzb();
            zzda.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzcy zzcyVar = (zzcy) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzanVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzanVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzao.zzp(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzao.zzb(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzanVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzao.zzj(bArr, i, zzanVar);
                    int i13 = zzanVar.zza;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzev.zze(bArr, zzj2, zzj2 + i13)) {
                        throw zzci.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i13, zzcg.zzb));
                        zzj2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzE = zzE(obj, i4, i8);
                    int zzo = zzao.zzo(zzE, zzB(i8), bArr, i, i2, zzanVar);
                    zzM(obj, i4, i8, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzao.zza(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, zzanVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzao.zzj(bArr, i, zzanVar);
                    int i14 = zzanVar.zza;
                    zzce zzA = zzA(i8);
                    if (zzA == null || zzA.zza(i14)) {
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
                    int zzj4 = zzao.zzj(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzao.zzm(bArr, i, zzanVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzE2 = zzE(obj, i4, i8);
                    int zzn = zzao.zzn(zzE2, zzB(i8), bArr, i, i2, (i3 & (-8)) | 4, zzanVar);
                    zzM(obj, i4, i8, zzE2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02a0, code lost:
        if (r30.zzb != 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02a2, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02a4, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02a5, code lost:
        r13.zze(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a8, code lost:
        if (r1 >= r20) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02aa, code lost:
        r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b0, code lost:
        if (r21 == r30.zza) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b3, code lost:
        r1 = com.google.android.gms.internal.play_billing.zzao.zzm(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02bb, code lost:
        if (r30.zzb == 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02be, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016e, code lost:
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0170, code lost:
        r13.add(com.google.android.gms.internal.play_billing.zzba.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        r13.add(com.google.android.gms.internal.play_billing.zzba.zzl(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017e, code lost:
        if (r1 >= r20) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
        r4 = com.google.android.gms.internal.play_billing.zzao.zzj(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        if (r21 == r30.zza) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
        r1 = com.google.android.gms.internal.play_billing.zzao.zzj(r18, r4, r30);
        r4 = r30.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
        if (r4 < 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
        if (r4 > (r18.length - r1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
        if (r4 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a2, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01e8 -> B:111:0x01ec). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01fe -> B:108:0x01dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0230 -> B:131:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0246 -> B:126:0x021d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x02a4 -> B:166:0x02a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x02bb -> B:164:0x02a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0176 -> B:80:0x017e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0195 -> B:78:0x0170). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.play_billing.zzan r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.play_billing.zzan):int");
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i2);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i2) {
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

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j) {
        return ((Long) zzeq.zzf(obj, j)).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0310, code lost:
        if ((r4 instanceof com.google.android.gms.internal.play_billing.zzba) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0327, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.play_billing.zzbi.zzw((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.play_billing.zzba) != false) goto L54;
     */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
        if (r0 != r22) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x030c, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0328, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x035c, code lost:
        if (r0 != r15) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0382, code lost:
        if (r0 != r15) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03fd, code lost:
        if (r6 == 1048575) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ff, code lost:
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0405, code lost:
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0409, code lost:
        if (r2 >= r8.zzl) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x040b, code lost:
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.play_billing.zzeq.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x041d, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0424, code lost:
        if (r8.zzA(r4) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0426, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0429, code lost:
        r5 = (com.google.android.gms.internal.play_billing.zzcz) r5;
        r0 = (com.google.android.gms.internal.play_billing.zzcy) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0431, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0434, code lost:
        if (r9 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0436, code lost:
        if (r0 != r32) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x043d, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x043e, code lost:
        if (r0 > r32) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0440, code lost:
        if (r3 != r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0442, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0447, code lost:
        throw com.google.android.gms.internal.play_billing.zzci.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.zzan r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzan):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        int i;
        if (zzS(obj)) {
            if (obj instanceof zzcb) {
                zzcb zzcbVar = (zzcb) obj;
                zzcbVar.zzq(Integer.MAX_VALUE);
                zzcbVar.zza = 0;
                zzcbVar.zzo();
            }
            int length = this.zzc.length;
            while (i < length) {
                int zzy = zzy(i);
                int i2 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j = i2;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
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
                                this.zzm.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object == null) {
                                    break;
                                } else {
                                    ((zzcz) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                }
                        }
                    } else {
                        if (!zzT(obj, this.zzc[i], i)) {
                        }
                        zzB(i).zzf(zzb.getObject(obj, j));
                    }
                }
                i = zzP(obj, i) ? 0 : i + 3;
                zzB(i).zzf(zzb.getObject(obj, j));
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzy = zzy(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zzeq.zzo(obj, j, zzeq.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i)) {
                        zzeq.zzp(obj, j, zzeq.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                    zzJ(obj, i);
                    break;
                case 3:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                    zzJ(obj, i);
                    break;
                case 4:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 5:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                    zzJ(obj, i);
                    break;
                case 6:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 7:
                    if (zzP(obj2, i)) {
                        zzeq.zzm(obj, j, zzeq.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                    zzJ(obj, i);
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                    zzJ(obj, i);
                    break;
                case 11:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 12:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 13:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 14:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                    zzJ(obj, i);
                    break;
                case 15:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzq(obj, j, zzeq.zzc(obj2, j));
                    zzJ(obj, i);
                    break;
                case 16:
                    if (!zzP(obj2, i)) {
                        break;
                    }
                    zzeq.zzr(obj, j, zzeq.zzd(obj2, j));
                    zzJ(obj, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzdr.zza;
                    zzeq.zzs(obj, j, zzda.zzb(zzeq.zzf(obj, j), zzeq.zzf(obj2, j)));
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
                    if (!zzT(obj2, i2, i)) {
                        break;
                    }
                    zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                    zzK(obj, i2, i);
                    break;
                case 60:
                case 68:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzT(obj2, i2, i)) {
                        break;
                    }
                    zzeq.zzs(obj, j, zzeq.zzf(obj2, j));
                    zzK(obj, i2, i);
                    break;
            }
        }
        zzdr.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
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
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.play_billing.zzan r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.zzan):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i;
        int i2;
        int i3;
        double zza2;
        float zzb2;
        long zzd;
        long zzd2;
        int zzc;
        long zzd3;
        int zzc2;
        boolean zzw;
        int zzc3;
        int zzc4;
        int zzc5;
        long zzd4;
        int zzc6;
        long zzd5;
        int i4 = 0;
        int i5 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int zzy = zzy(i6);
                int i7 = this.zzc[i6];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i6)) {
                            zza2 = zzeq.zza(obj, zzy & 1048575);
                            zzeyVar.zzf(i7, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i6)) {
                            zzb2 = zzeq.zzb(obj, zzy & 1048575);
                            zzeyVar.zzo(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i6)) {
                            zzd = zzeq.zzd(obj, zzy & 1048575);
                            zzeyVar.zzt(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i6)) {
                            zzd2 = zzeq.zzd(obj, zzy & 1048575);
                            zzeyVar.zzJ(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i6)) {
                            zzc = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzr(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i6)) {
                            zzd3 = zzeq.zzd(obj, zzy & 1048575);
                            zzeyVar.zzm(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i6)) {
                            zzc2 = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzk(i7, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i6)) {
                            zzw = zzeq.zzw(obj, zzy & 1048575);
                            zzeyVar.zzb(i7, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzP(obj, i6)) {
                            break;
                        }
                        zzV(i7, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                        break;
                    case 9:
                        if (!zzP(obj, i6)) {
                            break;
                        }
                        zzeyVar.zzv(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                        break;
                    case 10:
                        if (!zzP(obj, i6)) {
                            break;
                        }
                        zzeyVar.zzd(i7, (zzba) zzeq.zzf(obj, zzy & 1048575));
                        break;
                    case 11:
                        if (zzP(obj, i6)) {
                            zzc3 = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzH(i7, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i6)) {
                            zzc4 = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzi(i7, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i6)) {
                            zzc5 = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzw(i7, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i6)) {
                            zzd4 = zzeq.zzd(obj, zzy & 1048575);
                            zzeyVar.zzy(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i6)) {
                            zzc6 = zzeq.zzc(obj, zzy & 1048575);
                            zzeyVar.zzA(i7, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i6)) {
                            zzd5 = zzeq.zzd(obj, zzy & 1048575);
                            zzeyVar.zzC(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzP(obj, i6)) {
                            break;
                        }
                        zzeyVar.zzq(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                        break;
                    case 18:
                        zzdr.zzF(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 19:
                        zzdr.zzJ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 20:
                        zzdr.zzM(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 21:
                        zzdr.zzU(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 22:
                        zzdr.zzL(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 23:
                        zzdr.zzI(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 24:
                        zzdr.zzH(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 25:
                        zzdr.zzD(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 26:
                        zzdr.zzS(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                        break;
                    case 27:
                        zzdr.zzN(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i6));
                        break;
                    case 28:
                        zzdr.zzE(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                        break;
                    case 29:
                        zzdr.zzT(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 30:
                        zzdr.zzG(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 31:
                        zzdr.zzO(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 32:
                        zzdr.zzP(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 33:
                        zzdr.zzQ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 34:
                        zzdr.zzR(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, false);
                        break;
                    case 35:
                        zzdr.zzF(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 36:
                        zzdr.zzJ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 37:
                        zzdr.zzM(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 38:
                        zzdr.zzU(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 39:
                        zzdr.zzL(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 40:
                        zzdr.zzI(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 41:
                        zzdr.zzH(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 42:
                        zzdr.zzD(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 43:
                        zzdr.zzT(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 44:
                        zzdr.zzG(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 45:
                        zzdr.zzO(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 46:
                        zzdr.zzP(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 47:
                        zzdr.zzQ(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 48:
                        zzdr.zzR(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, true);
                        break;
                    case 49:
                        zzdr.zzK(i7, (List) zzeq.zzf(obj, zzy & 1048575), zzeyVar, zzB(i6));
                        break;
                    case 50:
                        zzN(zzeyVar, i7, zzeq.zzf(obj, zzy & 1048575), i6);
                        break;
                    case 51:
                        if (zzT(obj, i7, i6)) {
                            zza2 = zzm(obj, zzy & 1048575);
                            zzeyVar.zzf(i7, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i7, i6)) {
                            zzb2 = zzn(obj, zzy & 1048575);
                            zzeyVar.zzo(i7, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i7, i6)) {
                            zzd = zzz(obj, zzy & 1048575);
                            zzeyVar.zzt(i7, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i7, i6)) {
                            zzd2 = zzz(obj, zzy & 1048575);
                            zzeyVar.zzJ(i7, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i7, i6)) {
                            zzc = zzp(obj, zzy & 1048575);
                            zzeyVar.zzr(i7, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i7, i6)) {
                            zzd3 = zzz(obj, zzy & 1048575);
                            zzeyVar.zzm(i7, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i7, i6)) {
                            zzc2 = zzp(obj, zzy & 1048575);
                            zzeyVar.zzk(i7, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i7, i6)) {
                            zzw = zzU(obj, zzy & 1048575);
                            zzeyVar.zzb(i7, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzT(obj, i7, i6)) {
                            break;
                        }
                        zzV(i7, zzeq.zzf(obj, zzy & 1048575), zzeyVar);
                        break;
                    case 60:
                        if (!zzT(obj, i7, i6)) {
                            break;
                        }
                        zzeyVar.zzv(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                        break;
                    case 61:
                        if (!zzT(obj, i7, i6)) {
                            break;
                        }
                        zzeyVar.zzd(i7, (zzba) zzeq.zzf(obj, zzy & 1048575));
                        break;
                    case 62:
                        if (zzT(obj, i7, i6)) {
                            zzc3 = zzp(obj, zzy & 1048575);
                            zzeyVar.zzH(i7, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i7, i6)) {
                            zzc4 = zzp(obj, zzy & 1048575);
                            zzeyVar.zzi(i7, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i7, i6)) {
                            zzc5 = zzp(obj, zzy & 1048575);
                            zzeyVar.zzw(i7, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i7, i6)) {
                            zzd4 = zzz(obj, zzy & 1048575);
                            zzeyVar.zzy(i7, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i7, i6)) {
                            zzc6 = zzp(obj, zzy & 1048575);
                            zzeyVar.zzA(i7, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i7, i6)) {
                            zzd5 = zzz(obj, zzy & 1048575);
                            zzeyVar.zzC(i7, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!zzT(obj, i7, i6)) {
                            break;
                        }
                        zzeyVar.zzq(i7, zzeq.zzf(obj, zzy & 1048575), zzB(i6));
                        break;
                }
            }
        } else if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        } else {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int zzy2 = zzy(i8);
                int[] iArr = this.zzc;
                int i11 = iArr[i8];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
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
                long j = zzy2 & i5;
                switch (zzx) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzf(i11, zzeq.zza(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzo(i11, zzeq.zzb(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzt(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzJ(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzr(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzm(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzk(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzb(i11, zzeq.zzw(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzV(i11, unsafe.getObject(obj, j), zzeyVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzd(i11, (zzba) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzH(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzi(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzw(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzy(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzA(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzC(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            zzeyVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        zzdr.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 19:
                        i2 = 0;
                        zzdr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 20:
                        i2 = 0;
                        zzdr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 21:
                        i2 = 0;
                        zzdr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 22:
                        i2 = 0;
                        zzdr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 23:
                        i2 = 0;
                        zzdr.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 24:
                        i2 = 0;
                        zzdr.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 25:
                        i2 = 0;
                        zzdr.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        break;
                    case 26:
                        zzdr.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar);
                        i2 = 0;
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i8));
                        i2 = 0;
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        zzdr.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        zzdr.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        zzdr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        zzdr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 33:
                        i3 = 0;
                        zzdr.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        zzdr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, false);
                        i2 = i3;
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, true);
                        i2 = 0;
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j), zzeyVar, zzB(i8));
                        i2 = 0;
                        break;
                    case 50:
                        zzN(zzeyVar, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzf(i11, zzm(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzo(i11, zzn(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzt(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzJ(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzr(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzm(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzk(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzb(i11, zzU(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i11, i8)) {
                            zzV(i11, unsafe.getObject(obj, j), zzeyVar);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzv(i11, unsafe.getObject(obj, j), zzB(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzd(i11, (zzba) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzH(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzi(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzw(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzy(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzA(i11, zzp(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzC(i11, zzz(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i11, i8)) {
                            zzeyVar.zzq(i11, unsafe.getObject(obj, j), zzB(i8));
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
        zzeg zzegVar = this.zzn;
        zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzy = zzy(i);
            long j = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzeq.zza(obj, j)) == Double.doubleToLongBits(zzeq.zza(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzeq.zzb(obj, j)) == Float.floatToIntBits(zzeq.zzb(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzeq.zzw(obj, j) == zzeq.zzw(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzeq.zzc(obj, j) == zzeq.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzeq.zzd(obj, j) == zzeq.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
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
                    if (zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
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
                    long zzv = zzv(i) & 1048575;
                    if (zzeq.zzc(obj, zzv) == zzeq.zzc(obj2, zzv) && zzdr.zzV(zzeq.zzf(obj, j), zzeq.zzf(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzy = zzy(i6);
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
            if ((268435456 & zzy) != 0 && !zzQ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i7, i6) && !zzR(obj, zzy, zzB(i6))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzcz) zzeq.zzf(obj, zzy & 1048575)).isEmpty()) {
                            zzcy zzcyVar = (zzcy) zzC(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzeq.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdp zzB = zzB(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzB.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzQ(obj, i6, i, i2, i10) && !zzR(obj, zzy, zzB(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
