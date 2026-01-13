package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzwc extends zzwh {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfrs zzc = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwc.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfrs zzd = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwc.zzb;
            return 0;
        }
    });
    @o0OO00OO
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    @o0O0OOOo("lock")
    private zzvq zzg;
    @o0O0OOOo("lock")
    @o0OO00OO
    private zzvv zzh;
    @o0O0OOOo("lock")
    private zzk zzi;
    private final zzux zzj;

    @Deprecated
    public zzwc() {
        zzvq zzvqVar = zzvq.zzD;
        throw null;
    }

    public zzwc(Context context) {
        zzux zzuxVar = new zzux();
        zzvq zzd2 = zzvq.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzuxVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzew.zzY(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzew.zza >= 32) {
            this.zzh = zzvv.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int zza(zzaf zzafVar, @o0OO00OO String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzafVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzafVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                return zzew.zzai(zzf2, "-")[0].equals(zzew.zzai(zzf, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    @o0OO00OO
    public static String zzf(@o0OO00OO String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzwc zzwcVar) {
        zzwcVar.zzt();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
        if (r8.zzh.zzd(r8.zzi, r9) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0053, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzwc r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzvq r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzP     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r4
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = r3
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.zzk(com.google.android.gms.internal.ads.zzwc, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    public static boolean zzm(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzs(zzur zzurVar, zzcu zzcuVar, Map map) {
        for (int i = 0; i < zzurVar.zzc; i++) {
            if (((zzcr) zzcuVar.zzB.get(zzurVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    public final void zzt() {
        boolean z;
        zzvv zzvvVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzP && !this.zzf && zzew.zza >= 32 && (zzvvVar = this.zzh) != null && zzvvVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzr();
        }
    }

    @o0OO00OO
    private static final Pair zzu(int i, zzwg zzwgVar, int[][][] iArr, zzvx zzvxVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 2; i4++) {
            if (i == zzwgVar.zzc(i4)) {
                zzur zzd2 = zzwgVar.zzd(i4);
                for (int i5 = 0; i5 < zzd2.zzc; i5++) {
                    zzcp zzb2 = zzd2.zzb(i5);
                    List zza = zzvxVar.zza(i4, zzb2, iArr[i4][i5]);
                    int i6 = zzb2.zzb;
                    int i7 = 1;
                    boolean[] zArr = new boolean[1];
                    int i8 = 0;
                    while (i8 <= 0) {
                        zzvy zzvyVar = (zzvy) zza.get(i8);
                        int zzb3 = zzvyVar.zzb();
                        if (zArr[i8] || zzb3 == 0) {
                            i2 = i7;
                        } else {
                            if (zzb3 == i7) {
                                randomAccess = zzfqk.zzp(zzvyVar);
                                i2 = i7;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvyVar);
                                int i9 = i8 + 1;
                                while (i9 <= 0) {
                                    zzvy zzvyVar2 = (zzvy) zza.get(i9);
                                    if (zzvyVar2.zzb() == 2 && zzvyVar.zzc(zzvyVar2)) {
                                        arrayList2.add(zzvyVar2);
                                        i3 = 1;
                                        zArr[i9] = true;
                                    } else {
                                        i3 = 1;
                                    }
                                    i9++;
                                    i7 = i3;
                                }
                                i2 = i7;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i8++;
                        i7 = i2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzvy) list.get(i10)).zzc;
        }
        zzvy zzvyVar3 = (zzvy) list.get(0);
        return Pair.create(new zzwd(zzvyVar3.zzb, iArr2, 0), Integer.valueOf(zzvyVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final Pair zzb(zzwg zzwgVar, int[][][] iArr, final int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        final zzvq zzvqVar;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        zzvv zzvvVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
            if (zzvqVar.zzP && zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdl.zzb(myLooper);
                zzvvVar.zzb(this, myLooper);
            }
        }
        int i2 = 2;
        zzwd[] zzwdVarArr = new zzwd[2];
        Pair zzu = zzu(2, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzve
            /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
            @Override // com.google.android.gms.internal.ads.zzvx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List zza(int r17, com.google.android.gms.internal.ads.zzcp r18, int[] r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r9 = r18
                    com.google.android.gms.internal.ads.zzvq r10 = com.google.android.gms.internal.ads.zzvq.this
                    int[] r1 = r2
                    int r2 = com.google.android.gms.internal.ads.zzwc.zzb
                    r11 = r1[r17]
                    int r1 = r10.zzl
                    int r2 = r10.zzm
                    boolean r3 = r10.zzn
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    if (r1 == r14) goto L7c
                    if (r2 != r14) goto L1b
                    goto L7f
                L1b:
                    r5 = r14
                    r4 = 0
                L1d:
                    int r6 = r9.zzb
                    if (r4 > 0) goto L7a
                    com.google.android.gms.internal.ads.zzaf r6 = r9.zzb(r4)
                    int r7 = r6.zzr
                    if (r7 <= 0) goto L74
                    int r8 = r6.zzs
                    if (r8 <= 0) goto L74
                    if (r3 == 0) goto L3e
                    if (r7 > r8) goto L33
                    r15 = 0
                    goto L34
                L33:
                    r15 = 1
                L34:
                    if (r1 > r2) goto L38
                    r12 = 0
                    goto L39
                L38:
                    r12 = 1
                L39:
                    if (r15 == r12) goto L3e
                    r12 = r1
                    r15 = r2
                    goto L40
                L3e:
                    r15 = r1
                    r12 = r2
                L40:
                    int r13 = r7 * r12
                    int r14 = r8 * r15
                    if (r13 < r14) goto L50
                    android.graphics.Point r8 = new android.graphics.Point
                    int r7 = com.google.android.gms.internal.ads.zzew.zze(r14, r7)
                    r8.<init>(r15, r7)
                    goto L5a
                L50:
                    android.graphics.Point r7 = new android.graphics.Point
                    int r8 = com.google.android.gms.internal.ads.zzew.zze(r13, r8)
                    r7.<init>(r8, r12)
                    r8 = r7
                L5a:
                    int r7 = r6.zzr
                    int r6 = r6.zzs
                    int r12 = r7 * r6
                    int r13 = r8.x
                    float r13 = (float) r13
                    r14 = 1065017672(0x3f7ae148, float:0.98)
                    float r13 = r13 * r14
                    int r13 = (int) r13
                    if (r7 < r13) goto L74
                    int r7 = r8.y
                    float r7 = (float) r7
                    float r7 = r7 * r14
                    int r7 = (int) r7
                    if (r6 < r7) goto L74
                    if (r12 >= r5) goto L74
                    r5 = r12
                L74:
                    int r4 = r4 + 1
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    goto L1d
                L7a:
                    r14 = r5
                    goto L7f
                L7c:
                    r14 = 2147483647(0x7fffffff, float:NaN)
                L7f:
                    com.google.android.gms.internal.ads.zzfqh r12 = com.google.android.gms.internal.ads.zzfqk.zzi()
                    r13 = 0
                L84:
                    int r1 = r9.zzb
                    if (r13 > 0) goto Lb4
                    com.google.android.gms.internal.ads.zzaf r1 = r9.zzb(r13)
                    int r1 = r1.zza()
                    r15 = 2147483647(0x7fffffff, float:NaN)
                    if (r14 == r15) goto L9d
                    r2 = -1
                    if (r1 == r2) goto L9b
                    if (r1 > r14) goto L9b
                    goto L9d
                L9b:
                    r8 = 0
                    goto L9e
                L9d:
                    r8 = 1
                L9e:
                    com.google.android.gms.internal.ads.zzwb r7 = new com.google.android.gms.internal.ads.zzwb
                    r6 = r19[r13]
                    r1 = r7
                    r2 = r17
                    r3 = r18
                    r4 = r13
                    r5 = r10
                    r15 = r7
                    r7 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r12.zzf(r15)
                    int r13 = r13 + 1
                    goto L84
                Lb4:
                    com.google.android.gms.internal.ads.zzfqk r1 = r12.zzi()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zza(int, com.google.android.gms.internal.ads.zzcp, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfpz zzj = zzfpz.zzj();
                zzvz zzvzVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                };
                zzfpz zzb2 = zzj.zzc((zzwb) Collections.max(list, zzvzVar), (zzwb) Collections.max(list2, zzvzVar), zzvzVar).zzb(list.size(), list2.size());
                zzwa zzwaVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                };
                return zzb2.zzc((zzwb) Collections.max(list, zzwaVar), (zzwb) Collections.max(list2, zzwaVar), zzwaVar).zza();
            }
        });
        if (zzu != null) {
            zzwdVarArr[((Integer) zzu.second).intValue()] = (zzwd) zzu.first;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            } else if (zzwgVar.zzc(i4) == 2 && zzwgVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        Pair zzu2 = zzu(1, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i5, zzcp zzcpVar, int[] iArr5) {
                final zzwc zzwcVar = zzwc.this;
                zzvq zzvqVar2 = zzvqVar;
                boolean z2 = z;
                zzfnv zzfnvVar = new zzfnv() { // from class: com.google.android.gms.internal.ads.zzvb
                    @Override // com.google.android.gms.internal.ads.zzfnv
                    public final boolean zza(Object obj) {
                        return zzwc.zzk(zzwc.this, (zzaf) obj);
                    }
                };
                zzfqh zzi = zzfqk.zzi();
                int i6 = 0;
                while (true) {
                    int i7 = zzcpVar.zzb;
                    if (i6 > 0) {
                        return zzi.zzi();
                    }
                    zzi.zzf(new zzvk(i5, zzcpVar, i6, zzvqVar2, iArr5[i6], z2, zzfnvVar));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvk) Collections.max((List) obj)).zza((zzvk) Collections.max((List) obj2));
            }
        });
        if (zzu2 != null) {
            zzwdVarArr[((Integer) zzu2.second).intValue()] = (zzwd) zzu2.first;
        }
        if (zzu2 == null) {
            str = null;
        } else {
            Object obj = zzu2.first;
            str = ((zzwd) obj).zza.zzb(((zzwd) obj).zzb[0]).zzd;
        }
        int i5 = 3;
        Pair zzu3 = zzu(3, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvg
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i6, zzcp zzcpVar, int[] iArr5) {
                zzvq zzvqVar2 = zzvq.this;
                String str2 = str;
                int i7 = zzwc.zzb;
                zzfqh zzi = zzfqk.zzi();
                int i8 = 0;
                while (true) {
                    int i9 = zzcpVar.zzb;
                    if (i8 > 0) {
                        return zzi.zzi();
                    }
                    zzi.zzf(new zzvw(i6, zzcpVar, i8, zzvqVar2, iArr5[i8], str2));
                    i8++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvh
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzvw) ((List) obj2).get(0)).zza((zzvw) ((List) obj3).get(0));
            }
        });
        if (zzu3 != null) {
            zzwdVarArr[((Integer) zzu3.second).intValue()] = (zzwd) zzu3.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int zzc2 = zzwgVar.zzc(i6);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i5) {
                zzur zzd2 = zzwgVar.zzd(i6);
                int[][] iArr5 = iArr4[i6];
                int i7 = i3;
                int i8 = i7;
                zzcp zzcpVar = null;
                zzvl zzvlVar = null;
                while (i7 < zzd2.zzc) {
                    zzcp zzb2 = zzd2.zzb(i7);
                    int[] iArr6 = iArr5[i7];
                    int i9 = i3;
                    zzvl zzvlVar2 = zzvlVar;
                    while (true) {
                        int i10 = zzb2.zzb;
                        if (i9 <= 0) {
                            if (zzm(iArr6[i9], zzvqVar.zzQ)) {
                                zzvl zzvlVar3 = new zzvl(zzb2.zzb(i9), iArr6[i9]);
                                if (zzvlVar2 == null || zzvlVar3.compareTo(zzvlVar2) > 0) {
                                    i8 = i9;
                                    zzvlVar2 = zzvlVar3;
                                    zzcpVar = zzb2;
                                }
                            }
                            i9++;
                        }
                    }
                    i7++;
                    zzvlVar = zzvlVar2;
                    i3 = 0;
                }
                zzwdVarArr[i6] = zzcpVar == null ? null : new zzwd(zzcpVar, new int[]{i8}, 0);
            }
            i6++;
            iArr4 = iArr;
            i2 = 2;
            i3 = 0;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        int i11 = 2;
        for (int i12 = 0; i12 < 2; i12++) {
            zzs(zzwgVar.zzd(i12), zzvqVar, hashMap);
        }
        zzs(zzwgVar.zze(), zzvqVar, hashMap);
        for (int i13 = 0; i13 < 2; i13++) {
            if (((zzcr) hashMap.get(Integer.valueOf(zzwgVar.zzc(i13)))) != null) {
                throw null;
            }
        }
        int i14 = 0;
        while (i14 < i11) {
            zzur zzd3 = zzwgVar.zzd(i14);
            if (zzvqVar.zzg(i14, zzd3)) {
                if (zzvqVar.zze(i14, zzd3) != null) {
                    throw null;
                }
                zzwdVarArr[i14] = null;
            }
            i14++;
            i11 = 2;
        }
        int i15 = 0;
        for (int i16 = i11; i15 < i16; i16 = 2) {
            int zzc3 = zzwgVar.zzc(i15);
            if (zzvqVar.zzf(i15) || zzvqVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzwdVarArr[i15] = null;
            }
            i15++;
        }
        zzux zzuxVar = this.zzj;
        zzws zzp = zzp();
        zzfqk zzf = zzuy.zzf(zzwdVarArr);
        int i17 = 2;
        zzwe[] zzweVarArr = new zzwe[2];
        int i18 = 0;
        while (i18 < i17) {
            zzwd zzwdVar = zzwdVarArr[i18];
            if (zzwdVar != null && (length = (iArr3 = zzwdVar.zzb).length) != 0) {
                zzweVarArr[i18] = length == 1 ? new zzwf(zzwdVar.zza, iArr3[0], 0, 0, null) : zzuxVar.zza(zzwdVar.zza, iArr3, 0, zzp, (zzfqk) zzf.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzkp[] zzkpVarArr = new zzkp[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzkpVarArr[i19] = (zzvqVar.zzf(i19) || zzvqVar.zzC.contains(Integer.valueOf(zzwgVar.zzc(i19))) || (zzwgVar.zzc(i19) != -2 && zzweVarArr[i19] == null)) ? null : zzkp.zza;
        }
        return Pair.create(zzkpVarArr, zzweVarArr);
    }

    public final zzvq zzc() {
        zzvq zzvqVar;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
        }
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzh() {
        zzvv zzvvVar;
        synchronized (this.zze) {
            if (zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                zzvvVar.zzc();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzi(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzt();
        }
    }

    public final void zzj(zzvo zzvoVar) {
        boolean z;
        zzvq zzvqVar = new zzvq(zzvoVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzvqVar);
            this.zzg = zzvqVar;
        }
        if (z) {
            if (zzvqVar.zzP && this.zza == null) {
                zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zzl() {
        return true;
    }
}
