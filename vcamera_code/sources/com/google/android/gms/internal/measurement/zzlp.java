package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o0ooOoOO.oO0OoOO0;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzb2 = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzE = zzE(i);
        long zzB = zzB(i) & 1048575;
        if (zzT(obj, i)) {
            Object object = zzb.getObject(obj, zzB);
            if (zzW(object)) {
                return object;
            }
            Object zze = zzE.zze();
            if (object != null) {
                zzE.zzg(zze, object);
            }
            return zze;
        }
        return zzE.zze();
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzE = zzE(i2);
        if (zzX(obj, i, i2)) {
            Object object = zzb.getObject(obj, zzB(i2) & 1048575);
            if (zzW(object)) {
                return object;
            }
            Object zze = zzE.zze();
            if (object != null) {
                zzE.zzg(zze, object);
            }
            return zze;
        }
        return zzE.zze();
    }

    private static Field zzI(Class cls, String str) {
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

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (zzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzQ(Object obj, zzng zzngVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzB & i2;
            switch (zzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 28:
                    zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 29:
                    z = false;
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    z = false;
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 31:
                    z = false;
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 32:
                    z = false;
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    z = false;
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 34:
                    z = false;
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 50:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i4)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzlf zzlfVar = (zzlf) zzF(i2);
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmy.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object zzf = zzmy.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzje) {
                    return !zzje.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case 12:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzT(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) throws IOException {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar == zzmp.zzc()) {
            zzmp zzf = zzmp.zzf();
            zzkfVar.zzc = zzf;
            return zzf;
        }
        return zzmpVar;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
        }
        zzml zzmlVar = (zzml) zzljVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzlp zzm(com.google.android.gms.internal.measurement.zzlw r33, com.google.android.gms.internal.measurement.zzlr r34, com.google.android.gms.internal.measurement.zzla r35, com.google.android.gms.internal.measurement.zzmo r36, com.google.android.gms.internal.measurement.zzjs r37, com.google.android.gms.internal.measurement.zzlh r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzm(com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzjs, com.google.android.gms.internal.measurement.zzlh):com.google.android.gms.internal.measurement.zzlp");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        long j;
        Object object;
        int zzA;
        int zzy;
        int i2;
        long j2;
        int zzh;
        int zzi;
        int zzA2;
        Object object2;
        int zzr;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.zzc.length) {
            int zzB = zzB(i6);
            int[] iArr = this.zzc;
            int i8 = iArr[i6];
            int zzA3 = zzA(zzB);
            if (zzA3 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i4 = unsafe.getInt(obj, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j3 = i3 & zzB;
            switch (zzA3) {
                case 0:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 1:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 2:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    j = unsafe.getLong(obj, j3);
                    zzh = zzjm.zzA(i8 << 3) + zzjm.zzB(j);
                    i5 += zzh;
                    break;
                case 3:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    j = unsafe.getLong(obj, j3);
                    zzh = zzjm.zzA(i8 << 3) + zzjm.zzB(j);
                    i5 += zzh;
                    break;
                case 4:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    int i11 = unsafe.getInt(obj, j3);
                    zzA = zzjm.zzA(i8 << 3);
                    zzy = zzjm.zzv(i11);
                    zzh = zzy + zzA;
                    i5 += zzh;
                    break;
                case 5:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 6:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 7:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 1;
                    i5 += zzh;
                    break;
                case 8:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j3);
                        if (!(object instanceof zzje)) {
                            zzA = zzjm.zzA(i8 << 3);
                            zzy = zzjm.zzy((String) object);
                            zzh = zzy + zzA;
                            i5 += zzh;
                            break;
                        }
                        int zzA4 = zzjm.zzA(i8 << 3);
                        int zzd = ((zzje) object).zzd();
                        i5 = zzjm.zzA(zzd) + zzd + zzA4 + i5;
                        break;
                    }
                case 9:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzlz.zzo(i8, unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
                case 10:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j3);
                        int zzA42 = zzjm.zzA(i8 << 3);
                        int zzd2 = ((zzje) object).zzd();
                        i5 = zzjm.zzA(zzd2) + zzd2 + zzA42 + i5;
                        break;
                    }
                case 11:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        i2 = unsafe.getInt(obj, j3);
                        zzA = zzjm.zzA(i8 << 3);
                        zzy = zzjm.zzA(i2);
                        zzh = zzy + zzA;
                        i5 += zzh;
                        break;
                    }
                case 12:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    int i112 = unsafe.getInt(obj, j3);
                    zzA = zzjm.zzA(i8 << 3);
                    zzy = zzjm.zzv(i112);
                    zzh = zzy + zzA;
                    i5 += zzh;
                    break;
                case 13:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 14:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 15:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j3);
                        zzA = zzjm.zzA(i8 << 3);
                        i2 = (i12 >> 31) ^ (i12 + i12);
                        zzy = zzjm.zzA(i2);
                        zzh = zzy + zzA;
                        i5 += zzh;
                        break;
                    }
                case 16:
                    if ((i & i4) == 0) {
                        break;
                    } else {
                        j2 = unsafe.getLong(obj, j3);
                        zzh = zzjm.zzB((j2 >> 63) ^ (j2 + j2)) + zzjm.zzA(i8 << 3);
                        i5 += zzh;
                        break;
                    }
                case 17:
                    if ((i4 & i) == 0) {
                        break;
                    }
                    zzh = zzjm.zzu(i8, (zzlm) unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
                case 18:
                case 23:
                case 32:
                    zzh = zzlz.zzh(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 19:
                case 24:
                case 31:
                    zzh = zzlz.zzf(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 20:
                    zzh = zzlz.zzm(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 21:
                    zzh = zzlz.zzx(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 22:
                    zzh = zzlz.zzk(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 25:
                    zzh = zzlz.zza(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 26:
                    zzh = zzlz.zzu(i8, (List) unsafe.getObject(obj, j3));
                    i5 += zzh;
                    break;
                case 27:
                    zzh = zzlz.zzp(i8, (List) unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
                case 28:
                    zzh = zzlz.zzc(i8, (List) unsafe.getObject(obj, j3));
                    i5 += zzh;
                    break;
                case 29:
                    zzh = zzlz.zzv(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 30:
                    zzh = zzlz.zzd(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 33:
                    zzh = zzlz.zzq(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 34:
                    zzh = zzlz.zzs(i8, (List) unsafe.getObject(obj, j3), false);
                    i5 += zzh;
                    break;
                case 35:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 36:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 37:
                    zzi = zzlz.zzn((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 38:
                    zzi = zzlz.zzy((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 39:
                    zzi = zzlz.zzl((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 40:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 41:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 42:
                    zzi = zzlz.zzb((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 43:
                    zzi = zzlz.zzw((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 44:
                    zzi = zzlz.zze((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 45:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 46:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 47:
                    zzi = zzlz.zzr((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 48:
                    zzi = zzlz.zzt((List) unsafe.getObject(obj, j3));
                    if (zzi <= 0) {
                        break;
                    }
                    zzA2 = zzjm.zzA(zzi) + zzjm.zzz(i8) + zzi;
                    i5 += zzA2;
                    break;
                case 49:
                    zzh = zzlz.zzj(i8, (List) unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
                case 50:
                    zzlh.zza(i8, unsafe.getObject(obj, j3), zzF(i6));
                    break;
                case 51:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 52:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 53:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    j = zzC(obj, j3);
                    zzh = zzjm.zzA(i8 << 3) + zzjm.zzB(j);
                    i5 += zzh;
                    break;
                case 54:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    j = zzC(obj, j3);
                    zzh = zzjm.zzA(i8 << 3) + zzjm.zzB(j);
                    i5 += zzh;
                    break;
                case 55:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    int zzr2 = zzr(obj, j3);
                    zzA = zzjm.zzA(i8 << 3);
                    zzy = zzjm.zzv(zzr2);
                    zzh = zzy + zzA;
                    i5 += zzh;
                    break;
                case 56:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 57:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 58:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 1;
                    i5 += zzh;
                    break;
                case 59:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j3);
                        if (!(object2 instanceof zzje)) {
                            zzA = zzjm.zzA(i8 << 3);
                            zzy = zzjm.zzy((String) object2);
                            zzh = zzy + zzA;
                            i5 += zzh;
                            break;
                        }
                        int zzA5 = zzjm.zzA(i8 << 3);
                        int zzd3 = ((zzje) object2).zzd();
                        zzA2 = zzjm.zzA(zzd3) + zzd3 + zzA5;
                        i5 += zzA2;
                        break;
                    }
                case 60:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzlz.zzo(i8, unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
                case 61:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    } else {
                        object2 = unsafe.getObject(obj, j3);
                        int zzA52 = zzjm.zzA(i8 << 3);
                        int zzd32 = ((zzje) object2).zzd();
                        zzA2 = zzjm.zzA(zzd32) + zzd32 + zzA52;
                        i5 += zzA2;
                        break;
                    }
                case 62:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    } else {
                        zzr = zzr(obj, j3);
                        zzA = zzjm.zzA(i8 << 3);
                        zzy = zzjm.zzA(zzr);
                        zzh = zzy + zzA;
                        i5 += zzh;
                        break;
                    }
                case 63:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    int zzr22 = zzr(obj, j3);
                    zzA = zzjm.zzA(i8 << 3);
                    zzy = zzjm.zzv(zzr22);
                    zzh = zzy + zzA;
                    i5 += zzh;
                    break;
                case 64:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 4;
                    i5 += zzh;
                    break;
                case 65:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzA(i8 << 3) + 8;
                    i5 += zzh;
                    break;
                case 66:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    } else {
                        int zzr3 = zzr(obj, j3);
                        zzA = zzjm.zzA(i8 << 3);
                        zzr = (zzr3 >> 31) ^ (zzr3 + zzr3);
                        zzy = zzjm.zzA(zzr);
                        zzh = zzy + zzA;
                        i5 += zzh;
                        break;
                    }
                case 67:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    } else {
                        j2 = zzC(obj, j3);
                        zzh = zzjm.zzB((j2 >> 63) ^ (j2 + j2)) + zzjm.zzA(i8 << 3);
                        i5 += zzh;
                        break;
                    }
                case 68:
                    if (!zzX(obj, i8, i6)) {
                        break;
                    }
                    zzh = zzjm.zzu(i8, (zzlm) unsafe.getObject(obj, j3), zzE(i6));
                    i5 += zzh;
                    break;
            }
            i6 += 3;
            i3 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int zza2 = i5 + zzmoVar.zza(zzmoVar.zzd(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0307, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzje) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031e, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjm.zzA(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.zzjm.zzy((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzje) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzq(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzq(java.lang.Object):int");
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzb2 = zzlg.zza().zzb();
            zzlh.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzlf zzlfVar = (zzlf) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzis.zzj(bArr, i, zzirVar);
                    int i9 = zzirVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zznd.zzf(bArr, zzj2, zzj2 + i9)) {
                        throw zzkp.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkn.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzH = zzH(obj, i4, i8);
                    int zzo = zzis.zzo(zzH, zzE(i8), bArr, i, i2, zzirVar);
                    zzP(obj, i4, i8, zzH);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzis.zza(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, zzirVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzis.zzj(bArr, i, zzirVar);
                    int i10 = zzirVar.zza;
                    zzkj zzD = zzD(i8);
                    if (zzD == null || zzD.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzH2 = zzH(obj, i4, i8);
                    int zzn = zzis.zzn(zzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    zzP(obj, i4, i8, zzH2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e0, code lost:
        if (r0 != r24) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e2, code lost:
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
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f5, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0321, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0342, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzu(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0250, code lost:
        if (r29.zzb != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0252, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0254, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0255, code lost:
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0258, code lost:
        if (r4 >= r19) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025a, code lost:
        r6 = com.google.android.gms.internal.measurement.zzis.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r20 == r29.zza) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0263, code lost:
        r4 = com.google.android.gms.internal.measurement.zzis.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x026b, code lost:
        if (r29.zzb == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026e, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.gms.internal.measurement.zzje.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.gms.internal.measurement.zzje.zzl(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.gms.internal.measurement.zzis.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.zza) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.gms.internal.measurement.zzis.zzj(r17, r4, r29);
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
        throw com.google.android.gms.internal.measurement.zzkp.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01df -> B:111:0x01e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01f5 -> B:106:0x01cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0254 -> B:147:0x0255). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x026b -> B:145:0x0252). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0197 -> B:91:0x019b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ad -> B:88:0x018c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzir r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzir):int");
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.measurement.zzlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x041b, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x041d, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0427, code lost:
        if (r3 >= r9.zzl) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0429, code lost:
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmy.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x043b, code lost:
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0442, code lost:
        if (r9.zzD(r4) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0444, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0447, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzlg) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlf) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0452, code lost:
        if (r7 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0454, code lost:
        if (r0 != r33) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045b, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045c, code lost:
        if (r0 > r33) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x045e, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0460, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0465, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Integer.MAX_VALUE);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                long j = 1048575 & zzB;
                int zzA = zzA(zzB);
                if (zzA != 9) {
                    switch (zzA) {
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
                            this.zzm.zza(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (zzT(obj, i)) {
                    zzE(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 3:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 4:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 5:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 6:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 9:
                case 17:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                    zzM(obj, i);
                    break;
                case 11:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 12:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 13:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 14:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                    zzM(obj, i);
                    break;
                case 15:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                    zzM(obj, i);
                    break;
                case 16:
                    if (!zzT(obj2, i)) {
                        break;
                    }
                    zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
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
                    if (!zzX(obj2, i2, i)) {
                        break;
                    }
                    zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                    zzN(obj, i2, i);
                    break;
                case 60:
                case 68:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzX(obj2, i2, i)) {
                        break;
                    }
                    zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                    zzN(obj, i2, i);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) throws IOException {
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
        if (!this.zzi) {
            zzQ(obj, zzngVar);
        } else if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        } else {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                int i2 = this.zzc[i];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzT(obj, i)) {
                            zza2 = zzmy.zza(obj, zzB & 1048575);
                            zzngVar.zzf(i2, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i)) {
                            zzb2 = zzmy.zzb(obj, zzB & 1048575);
                            zzngVar.zzo(i2, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i)) {
                            zzd = zzmy.zzd(obj, zzB & 1048575);
                            zzngVar.zzt(i2, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i)) {
                            zzd2 = zzmy.zzd(obj, zzB & 1048575);
                            zzngVar.zzJ(i2, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i)) {
                            zzc = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzr(i2, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i)) {
                            zzd3 = zzmy.zzd(obj, zzB & 1048575);
                            zzngVar.zzm(i2, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i)) {
                            zzc2 = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzk(i2, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i)) {
                            zzw = zzmy.zzw(obj, zzB & 1048575);
                            zzngVar.zzb(i2, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzT(obj, i)) {
                            break;
                        }
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 9:
                        if (!zzT(obj, i)) {
                            break;
                        }
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    case 10:
                        if (!zzT(obj, i)) {
                            break;
                        }
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    case 11:
                        if (zzT(obj, i)) {
                            zzc3 = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzH(i2, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i)) {
                            zzc4 = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzi(i2, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i)) {
                            zzc5 = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzw(i2, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i)) {
                            zzd4 = zzmy.zzd(obj, zzB & 1048575);
                            zzngVar.zzy(i2, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i)) {
                            zzc6 = zzmy.zzc(obj, zzB & 1048575);
                            zzngVar.zzA(i2, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i)) {
                            zzd5 = zzmy.zzd(obj, zzB & 1048575);
                            zzngVar.zzC(i2, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzT(obj, i)) {
                            break;
                        }
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    case 18:
                        zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 19:
                        zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 20:
                        zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 21:
                        zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 22:
                        zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 23:
                        zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 24:
                        zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 25:
                        zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 26:
                        zzlz.zzW(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 27:
                        zzlz.zzR(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                        break;
                    case 28:
                        zzlz.zzI(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 29:
                        zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 30:
                        zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 31:
                        zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 32:
                        zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 33:
                        zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 34:
                        zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 35:
                        zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 36:
                        zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 37:
                        zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 38:
                        zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 39:
                        zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 40:
                        zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 41:
                        zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 42:
                        zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 43:
                        zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 44:
                        zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 45:
                        zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 46:
                        zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 47:
                        zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 48:
                        zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 49:
                        zzlz.zzO(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                        break;
                    case 50:
                        zzR(zzngVar, i2, zzmy.zzf(obj, zzB & 1048575), i);
                        break;
                    case 51:
                        if (zzX(obj, i2, i)) {
                            zza2 = zzn(obj, zzB & 1048575);
                            zzngVar.zzf(i2, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i2, i)) {
                            zzb2 = zzo(obj, zzB & 1048575);
                            zzngVar.zzo(i2, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzX(obj, i2, i)) {
                            zzd = zzC(obj, zzB & 1048575);
                            zzngVar.zzt(i2, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i2, i)) {
                            zzd2 = zzC(obj, zzB & 1048575);
                            zzngVar.zzJ(i2, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i2, i)) {
                            zzc = zzr(obj, zzB & 1048575);
                            zzngVar.zzr(i2, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i2, i)) {
                            zzd3 = zzC(obj, zzB & 1048575);
                            zzngVar.zzm(i2, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i2, i)) {
                            zzc2 = zzr(obj, zzB & 1048575);
                            zzngVar.zzk(i2, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i2, i)) {
                            zzw = zzY(obj, zzB & 1048575);
                            zzngVar.zzb(i2, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzX(obj, i2, i)) {
                            break;
                        }
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 60:
                        if (!zzX(obj, i2, i)) {
                            break;
                        }
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    case 61:
                        if (!zzX(obj, i2, i)) {
                            break;
                        }
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    case 62:
                        if (zzX(obj, i2, i)) {
                            zzc3 = zzr(obj, zzB & 1048575);
                            zzngVar.zzH(i2, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i2, i)) {
                            zzc4 = zzr(obj, zzB & 1048575);
                            zzngVar.zzi(i2, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i2, i)) {
                            zzc5 = zzr(obj, zzB & 1048575);
                            zzngVar.zzw(i2, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i2, i)) {
                            zzd4 = zzC(obj, zzB & 1048575);
                            zzngVar.zzy(i2, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i2, i)) {
                            zzc6 = zzr(obj, zzB & 1048575);
                            zzngVar.zzA(i2, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzX(obj, i2, i)) {
                            zzd5 = zzC(obj, zzB & 1048575);
                            zzngVar.zzC(i2, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!zzX(obj, i2, i)) {
                            break;
                        }
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                }
            }
            zzmo zzmoVar = this.zzn;
            zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzS(obj, obj2, i) && Double.doubleToLongBits(zzmy.zza(obj, j)) == Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzS(obj, obj2, i) && Float.floatToIntBits(zzmy.zzb(obj, j)) == Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzS(obj, obj2, i) && zzmy.zzw(obj, j) == zzmy.zzw(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    if (zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, zzy) == zzmy.zzc(obj2, zzy) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzB = zzB(i6);
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
            if ((268435456 & zzB) != 0 && !zzU(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzX(obj, i7, i6) && !zzV(obj, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlg) zzmy.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzlf zzlfVar = (zzlf) zzF(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmy.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlx zzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzU(obj, i6, i, i2, i10) && !zzV(obj, zzB, zzE(i6))) {
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
