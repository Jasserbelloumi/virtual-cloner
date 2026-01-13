package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzafx implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzaft
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzafx.zza;
            return new zzzu[]{new zzafx(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzx zzD;
    private zzabb[] zzE;
    private zzabb[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzen zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final byte[] zzi;
    private final zzen zzj;
    private final zzacs zzk;
    private final zzen zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    @o0OO00OO
    private zzen zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    @o0OO00OO
    private zzafw zzy;
    private int zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS(MimeTypes.APPLICATION_EMSG);
        zzc = zzadVar.zzY();
    }

    public zzafx() {
        this(0, null);
    }

    public zzafx(int i, @o0OO00OO zzeu zzeuVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacs();
        this.zzl = new zzen(16);
        this.zzf = new zzen(zzaar.zza);
        this.zzg = new zzen(5);
        this.zzh = new zzen();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzen(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = C.TIME_UNSET;
        this.zzv = C.TIME_UNSET;
        this.zzx = C.TIME_UNSET;
        this.zzD = zzzx.zza;
        this.zzE = new zzabb[0];
        this.zzF = new zzabb[0];
    }

    private static int zze(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzx zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzafi r5 = (com.google.android.gms.internal.ads.zzafi) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzen r5 = r5.zza
            byte[] r5 = r5.zzH()
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L32
            goto L8d
        L32:
            r6.zzF(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L42
            goto L8d
        L42:
            int r8 = r6.zze()
            if (r8 == r7) goto L49
            goto L8d
        L49:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzafj.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzee.zze(r7, r6)
            goto L8d
        L6b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzr()
            long r12 = r6.zzr()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L83
            int r8 = r6.zzn()
            int r8 = r8 * 16
            r6.zzG(r8)
        L83:
            int r8 = r6.zzn()
            int r10 = r6.zza()
            if (r8 == r10) goto L8f
        L8d:
            r6 = r2
            goto L99
        L8f:
            byte[] r10 = new byte[r8]
            r6.zzB(r10, r1, r8)
            com.google.android.gms.internal.ads.zzagd r6 = new com.google.android.gms.internal.ads.zzagd
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzagd.zza(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzee.zze(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzw r7 = new com.google.android.gms.internal.ads.zzw
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzx r14 = new com.google.android.gms.internal.ads.zzx
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zzf(java.util.List):com.google.android.gms.internal.ads.zzx");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzen zzenVar, int i, zzagi zzagiVar) throws zzbu {
        zzenVar.zzF(i + 8);
        int zze = zzenVar.zze() & 16777215;
        if ((zze & 1) != 0) {
            throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzn = zzenVar.zzn();
        if (zzn == 0) {
            Arrays.fill(zzagiVar.zzl, 0, zzagiVar.zze, false);
            return;
        }
        int i2 = zzagiVar.zze;
        if (zzn != i2) {
            throw zzbu.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzagiVar.zzl, 0, zzn, z);
        zzagiVar.zza(zzenVar.zza());
        zzen zzenVar2 = zzagiVar.zzn;
        zzenVar.zzB(zzenVar2.zzH(), 0, zzenVar2.zzd());
        zzagiVar.zzn.zzF(0);
        zzagiVar.zzo = false;
    }

    private final void zzi(long j) throws zzbu {
        zzafx zzafxVar;
        SparseArray sparseArray;
        zzafh zzafhVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzafh zzafhVar2;
        byte[] bArr4;
        zzagi zzagiVar;
        List list;
        int i7;
        int i8;
        int i9;
        zzafh zzafhVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzafs zzafsVar;
        long j2;
        final zzafx zzafxVar2 = this;
        while (!zzafxVar2.zzm.isEmpty() && ((zzafh) zzafxVar2.zzm.peek()).zza == j) {
            zzafh zzafhVar4 = (zzafh) zzafxVar2.zzm.pop();
            int i19 = zzafhVar4.zzd;
            int i20 = 12;
            int i21 = 8;
            if (i19 == 1836019574) {
                zzx zzf = zzf(zzafhVar4.zzb);
                zzafh zza2 = zzafhVar4.zza(Atom.TYPE_mvex);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = C.TIME_UNSET;
                int i22 = 0;
                while (i22 < size) {
                    zzafi zzafiVar = (zzafi) zza2.zzb.get(i22);
                    int i23 = zzafiVar.zzd;
                    if (i23 == 1953654136) {
                        zzen zzenVar = zzafiVar.zza;
                        zzenVar.zzF(i20);
                        Pair create = Pair.create(Integer.valueOf(zzenVar.zze()), new zzafs(zzenVar.zze() - 1, zzenVar.zze(), zzenVar.zze(), zzenVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafs) create.second);
                    } else if (i23 == 1835362404) {
                        zzen zzenVar2 = zzafiVar.zza;
                        zzenVar2.zzF(8);
                        j3 = zzafj.zze(zzenVar2.zze()) == 0 ? zzenVar2.zzs() : zzenVar2.zzt();
                    }
                    i22++;
                    i20 = 12;
                }
                List zzc2 = zzafr.zzc(zzafhVar4, new zzaaj(), j3, zzf, false, false, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzafu
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        return (zzagg) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzafxVar2.zze.size() == 0) {
                    for (int i24 = 0; i24 < size2; i24++) {
                        zzagj zzagjVar = (zzagj) zzc2.get(i24);
                        zzagg zzaggVar = zzagjVar.zza;
                        zzafxVar2.zze.put(zzaggVar.zza, new zzafw(zzafxVar2.zzD.zzv(i24, zzaggVar.zzb), zzagjVar, zzj(sparseArray2, zzaggVar.zza)));
                        zzafxVar2.zzw = Math.max(zzafxVar2.zzw, zzaggVar.zze);
                    }
                    zzafxVar2.zzD.zzC();
                } else {
                    zzdl.zzf(zzafxVar2.zze.size() == size2);
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzagj zzagjVar2 = (zzagj) zzc2.get(i25);
                        zzagg zzaggVar2 = zzagjVar2.zza;
                        ((zzafw) zzafxVar2.zze.get(zzaggVar2.zza)).zzh(zzagjVar2, zzj(sparseArray2, zzaggVar2.zza));
                    }
                }
            } else {
                if (i19 == 1836019558) {
                    SparseArray sparseArray3 = zzafxVar2.zze;
                    byte[] bArr5 = zzafxVar2.zzi;
                    int size3 = zzafhVar4.zzc.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        zzafh zzafhVar5 = (zzafh) zzafhVar4.zzc.get(i26);
                        if (zzafhVar5.zzd == 1953653094) {
                            zzafi zzb2 = zzafhVar5.zzb(Atom.TYPE_tfhd);
                            zzb2.getClass();
                            zzen zzenVar3 = zzb2.zza;
                            zzenVar3.zzF(i21);
                            int zze = zzenVar3.zze() & 16777215;
                            zzafw zzafwVar = (zzafw) sparseArray3.get(zzenVar3.zze());
                            if (zzafwVar == null) {
                                zzafwVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzenVar3.zzt();
                                    zzagi zzagiVar2 = zzafwVar.zzb;
                                    zzagiVar2.zzb = zzt;
                                    zzagiVar2.zzc = zzt;
                                }
                                zzafs zzafsVar2 = zzafwVar.zze;
                                zzafwVar.zzb.zza = new zzafs((zze & 2) != 0 ? zzenVar3.zze() - 1 : zzafsVar2.zza, (zze & 8) != 0 ? zzenVar3.zze() : zzafsVar2.zzb, (zze & 16) != 0 ? zzenVar3.zze() : zzafsVar2.zzc, (zze & 32) != 0 ? zzenVar3.zze() : zzafsVar2.zzd);
                            }
                            if (zzafwVar != null) {
                                zzagi zzagiVar3 = zzafwVar.zzb;
                                long j4 = zzagiVar3.zzp;
                                boolean z3 = zzagiVar3.zzq;
                                zzafwVar.zzi();
                                zzafwVar.zzl = true;
                                zzafi zzb3 = zzafhVar5.zzb(Atom.TYPE_tfdt);
                                if (zzb3 != null) {
                                    zzen zzenVar4 = zzb3.zza;
                                    zzenVar4.zzF(i21);
                                    zzagiVar3.zzp = zzafj.zze(zzenVar4.zze()) == 1 ? zzenVar4.zzt() : zzenVar4.zzs();
                                    zzagiVar3.zzq = true;
                                } else {
                                    zzagiVar3.zzp = j4;
                                    zzagiVar3.zzq = z3;
                                }
                                List list2 = zzafhVar5.zzb;
                                int size4 = list2.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i4 = Atom.TYPE_trun;
                                    if (i27 >= size4) {
                                        break;
                                    }
                                    zzafi zzafiVar2 = (zzafi) list2.get(i27);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzafiVar2.zzd == 1953658222) {
                                        zzen zzenVar5 = zzafiVar2.zza;
                                        zzenVar5.zzF(12);
                                        int zzn = zzenVar5.zzn();
                                        if (zzn > 0) {
                                            i29 += zzn;
                                            i28++;
                                        }
                                    }
                                    i27++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafwVar.zzh = 0;
                                zzafwVar.zzg = 0;
                                zzafwVar.zzf = 0;
                                zzagi zzagiVar4 = zzafwVar.zzb;
                                zzagiVar4.zzd = i28;
                                zzagiVar4.zze = i29;
                                if (zzagiVar4.zzg.length < i28) {
                                    zzagiVar4.zzf = new long[i28];
                                    zzagiVar4.zzg = new int[i28];
                                }
                                if (zzagiVar4.zzh.length < i29) {
                                    int i30 = (i29 * 125) / 100;
                                    zzagiVar4.zzh = new int[i30];
                                    zzagiVar4.zzi = new long[i30];
                                    zzagiVar4.zzj = new boolean[i30];
                                    zzagiVar4.zzl = new boolean[i30];
                                }
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    zzafi zzafiVar3 = (zzafi) list2.get(i31);
                                    if (zzafiVar3.zzd == i4) {
                                        int i34 = i32 + 1;
                                        zzen zzenVar6 = zzafiVar3.zza;
                                        zzenVar6.zzF(8);
                                        int zze2 = zzenVar6.zze() & 16777215;
                                        list = list2;
                                        zzagg zzaggVar3 = zzafwVar.zzd.zza;
                                        i7 = size3;
                                        zzagi zzagiVar5 = zzafwVar.zzb;
                                        i9 = size4;
                                        zzafs zzafsVar3 = zzagiVar5.zza;
                                        int i35 = zzew.zza;
                                        zzagiVar5.zzg[i32] = zzenVar6.zzn();
                                        long[] jArr = zzagiVar5.zzf;
                                        zzafhVar2 = zzafhVar4;
                                        bArr4 = bArr5;
                                        long j6 = zzagiVar5.zzb;
                                        jArr[i32] = j6;
                                        if ((zze2 & 1) != 0) {
                                            i6 = i31;
                                            jArr[i32] = j6 + zzenVar6.zze();
                                        } else {
                                            i6 = i31;
                                        }
                                        boolean z4 = (zze2 & 4) != 0;
                                        int i36 = zzafsVar3.zzd;
                                        if (z4) {
                                            i36 = zzenVar6.zze();
                                        }
                                        int i37 = zze2 & 256;
                                        int i38 = zze2 & 512;
                                        int i39 = zze2 & 1024;
                                        int i40 = zze2 & 2048;
                                        int i41 = i36;
                                        long[] jArr2 = zzaggVar3.zzh;
                                        i8 = i26;
                                        if (jArr2 != null) {
                                            zzafhVar3 = zzafhVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzew.zzH(zzaggVar3.zzi))[0];
                                            }
                                        } else {
                                            zzafhVar3 = zzafhVar5;
                                        }
                                        int[] iArr = zzagiVar5.zzh;
                                        long[] jArr3 = zzagiVar5.zzi;
                                        boolean[] zArr = zzagiVar5.zzj;
                                        zzagiVar = zzagiVar3;
                                        int i42 = zzagiVar5.zzg[i32] + i33;
                                        long j7 = zzaggVar3.zzc;
                                        long j8 = zzagiVar5.zzp;
                                        int i43 = i33;
                                        while (i43 < i42) {
                                            if (i37 != 0) {
                                                i10 = i37;
                                                i11 = zzenVar6.zze();
                                            } else {
                                                i10 = i37;
                                                i11 = zzafsVar3.zzb;
                                            }
                                            zze(i11);
                                            if (i38 != 0) {
                                                i12 = i38;
                                                i13 = zzenVar6.zze();
                                            } else {
                                                i12 = i38;
                                                i13 = zzafsVar3.zzc;
                                            }
                                            zze(i13);
                                            if (i39 != 0) {
                                                z2 = z4;
                                                i14 = zzenVar6.zze();
                                            } else {
                                                z2 = z4;
                                                if (i43 == 0) {
                                                    if (z4) {
                                                        i14 = i41;
                                                        i43 = 0;
                                                    } else {
                                                        i43 = 0;
                                                    }
                                                }
                                                i14 = zzafsVar3.zzd;
                                            }
                                            if (i40 != 0) {
                                                i15 = i42;
                                                i16 = i39;
                                                i17 = i40;
                                                i18 = zzenVar6.zze();
                                            } else {
                                                i15 = i42;
                                                i16 = i39;
                                                i17 = i40;
                                                i18 = 0;
                                            }
                                            long zzw = zzew.zzw((i18 + j8) - j5, 1000000L, j7);
                                            jArr3[i43] = zzw;
                                            if (zzagiVar5.zzq) {
                                                zzafsVar = zzafsVar3;
                                                j2 = j7;
                                            } else {
                                                zzafsVar = zzafsVar3;
                                                j2 = j7;
                                                jArr3[i43] = zzw + zzafwVar.zzd.zzh;
                                            }
                                            iArr[i43] = i13;
                                            zArr[i43] = 1 == (((i14 >> 16) & 1) ^ 1);
                                            j8 += i11;
                                            i43++;
                                            zzafsVar3 = zzafsVar;
                                            j7 = j2;
                                            i37 = i10;
                                            i38 = i12;
                                            z4 = z2;
                                            i42 = i15;
                                            i39 = i16;
                                            i40 = i17;
                                        }
                                        zzagiVar5.zzp = j8;
                                        i32 = i34;
                                        i33 = i42;
                                    } else {
                                        i6 = i31;
                                        zzafhVar2 = zzafhVar4;
                                        bArr4 = bArr5;
                                        zzagiVar = zzagiVar3;
                                        list = list2;
                                        i7 = size3;
                                        i8 = i26;
                                        i9 = size4;
                                        zzafhVar3 = zzafhVar5;
                                    }
                                    i31 = i6 + 1;
                                    list2 = list;
                                    size3 = i7;
                                    size4 = i9;
                                    zzafhVar4 = zzafhVar2;
                                    bArr5 = bArr4;
                                    i26 = i8;
                                    zzafhVar5 = zzafhVar3;
                                    zzagiVar3 = zzagiVar;
                                    i4 = Atom.TYPE_trun;
                                }
                                zzafhVar = zzafhVar4;
                                byte[] bArr6 = bArr5;
                                zzagi zzagiVar6 = zzagiVar3;
                                i = size3;
                                i3 = i26;
                                zzafh zzafhVar6 = zzafhVar5;
                                zzagg zzaggVar4 = zzafwVar.zzd.zza;
                                zzafs zzafsVar4 = zzagiVar6.zza;
                                zzafsVar4.getClass();
                                zzagh zza3 = zzaggVar4.zza(zzafsVar4.zza);
                                zzafi zzb4 = zzafhVar6.zzb(Atom.TYPE_saiz);
                                if (zzb4 != null) {
                                    zza3.getClass();
                                    zzen zzenVar7 = zzb4.zza;
                                    int i44 = zza3.zzd;
                                    zzenVar7.zzF(8);
                                    if ((zzenVar7.zze() & 1) == 1) {
                                        zzenVar7.zzG(8);
                                    }
                                    int zzk = zzenVar7.zzk();
                                    int zzn2 = zzenVar7.zzn();
                                    int i45 = zzagiVar6.zze;
                                    if (zzn2 > i45) {
                                        throw zzbu.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i45, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzagiVar6.zzl;
                                        i5 = 0;
                                        for (int i46 = 0; i46 < zzn2; i46++) {
                                            int zzk2 = zzenVar7.zzk();
                                            i5 += zzk2;
                                            zArr2[i46] = zzk2 > i44;
                                        }
                                        z = false;
                                    } else {
                                        boolean z5 = zzk > i44;
                                        i5 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzagiVar6.zzl, 0, zzn2, z5);
                                    }
                                    Arrays.fill(zzagiVar6.zzl, zzn2, zzagiVar6.zze, z);
                                    if (i5 > 0) {
                                        zzagiVar6.zza(i5);
                                    }
                                }
                                zzafi zzb5 = zzafhVar6.zzb(Atom.TYPE_saio);
                                if (zzb5 != null) {
                                    zzen zzenVar8 = zzb5.zza;
                                    zzenVar8.zzF(8);
                                    int zze3 = zzenVar8.zze();
                                    if ((zze3 & 1) == 1) {
                                        zzenVar8.zzG(8);
                                    }
                                    int zzn3 = zzenVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbu.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzagiVar6.zzc += zzafj.zze(zze3) == 0 ? zzenVar8.zzs() : zzenVar8.zzt();
                                }
                                zzafi zzb6 = zzafhVar6.zzb(Atom.TYPE_senc);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzagiVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzen zzenVar9 = null;
                                zzen zzenVar10 = null;
                                for (int i47 = 0; i47 < zzafhVar6.zzb.size(); i47++) {
                                    zzafi zzafiVar4 = (zzafi) zzafhVar6.zzb.get(i47);
                                    zzen zzenVar11 = zzafiVar4.zza;
                                    int i48 = zzafiVar4.zzd;
                                    if (i48 == 1935828848) {
                                        zzenVar11.zzF(12);
                                        if (zzenVar11.zze() == 1936025959) {
                                            zzenVar9 = zzenVar11;
                                        }
                                    } else if (i48 == 1936158820) {
                                        zzenVar11.zzF(12);
                                        if (zzenVar11.zze() == 1936025959) {
                                            zzenVar10 = zzenVar11;
                                        }
                                    }
                                }
                                if (zzenVar9 != null && zzenVar10 != null) {
                                    zzenVar9.zzF(8);
                                    int zze4 = zzafj.zze(zzenVar9.zze());
                                    zzenVar9.zzG(4);
                                    if (zze4 == 1) {
                                        zzenVar9.zzG(4);
                                    }
                                    if (zzenVar9.zze() != 1) {
                                        throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzenVar10.zzF(8);
                                    int zze5 = zzafj.zze(zzenVar10.zze());
                                    zzenVar10.zzG(4);
                                    if (zze5 == 1) {
                                        if (zzenVar10.zzs() == 0) {
                                            throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze5 >= 2) {
                                        zzenVar10.zzG(4);
                                    }
                                    if (zzenVar10.zzs() != 1) {
                                        throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzenVar10.zzG(1);
                                    int zzk3 = zzenVar10.zzk();
                                    int i49 = (zzk3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i50 = zzk3 & 15;
                                    if (zzenVar10.zzk() == 1) {
                                        int zzk4 = zzenVar10.zzk();
                                        byte[] bArr7 = new byte[16];
                                        zzenVar10.zzB(bArr7, 0, 16);
                                        if (zzk4 == 0) {
                                            int zzk5 = zzenVar10.zzk();
                                            byte[] bArr8 = new byte[zzk5];
                                            zzenVar10.zzB(bArr8, 0, zzk5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzagiVar6.zzk = true;
                                        zzagiVar6.zzm = new zzagh(true, str, zzk4, bArr7, i49, i50, bArr3);
                                    }
                                }
                                int size5 = zzafhVar6.zzb.size();
                                int i51 = 0;
                                while (i51 < size5) {
                                    zzafi zzafiVar5 = (zzafi) zzafhVar6.zzb.get(i51);
                                    if (zzafiVar5.zzd == 1970628964) {
                                        zzen zzenVar12 = zzafiVar5.zza;
                                        zzenVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzenVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzenVar12, 16, zzagiVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i51++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i2 = 8;
                                i21 = i2;
                                bArr5 = bArr;
                                size3 = i;
                                zzafhVar4 = zzafhVar;
                                i26 = i3 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzafhVar = zzafhVar4;
                        i = size3;
                        i2 = i21;
                        i3 = i26;
                        bArr = bArr5;
                        i21 = i2;
                        bArr5 = bArr;
                        size3 = i;
                        zzafhVar4 = zzafhVar;
                        i26 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx zzf2 = zzf(zzafhVar4.zzb);
                    zzafxVar = this;
                    if (zzf2 != null) {
                        int size6 = zzafxVar.zze.size();
                        for (int i52 = 0; i52 < size6; i52++) {
                            zzafw zzafwVar2 = (zzafw) zzafxVar.zze.valueAt(i52);
                            zzagg zzaggVar5 = zzafwVar2.zzd.zza;
                            zzafs zzafsVar5 = zzafwVar2.zzb.zza;
                            int i53 = zzew.zza;
                            zzagh zza4 = zzaggVar5.zza(zzafsVar5.zza);
                            zzx zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzafwVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzafwVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzafxVar.zzv != C.TIME_UNSET) {
                        int size7 = zzafxVar.zze.size();
                        for (int i54 = 0; i54 < size7; i54++) {
                            zzafw zzafwVar3 = (zzafw) zzafxVar.zze.valueAt(i54);
                            long j9 = zzafxVar.zzv;
                            int i55 = zzafwVar3.zzf;
                            while (true) {
                                zzagi zzagiVar7 = zzafwVar3.zzb;
                                if (i55 < zzagiVar7.zze && zzagiVar7.zzi[i55] < j9) {
                                    if (zzagiVar7.zzj[i55]) {
                                        zzafwVar3.zzi = i55;
                                    }
                                    i55++;
                                }
                            }
                        }
                        zzafxVar.zzv = C.TIME_UNSET;
                    }
                } else {
                    zzafxVar = zzafxVar2;
                    if (!zzafxVar.zzm.isEmpty()) {
                        ((zzafh) zzafxVar.zzm.peek()).zzc(zzafhVar4);
                    }
                }
                zzafxVar2 = zzafxVar;
            }
        }
        zzg();
    }

    private static final zzafs zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafs) sparseArray.valueAt(0);
        }
        zzafs zzafsVar = (zzafs) sparseArray.get(i);
        zzafsVar.getClass();
        return zzafsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
        if (r0.zzn.isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024c, code lost:
        r1 = (com.google.android.gms.internal.ads.zzafv) r0.zzn.removeFirst();
        r0.zzu -= r1.zzc;
        r6 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025f, code lost:
        if (r1.zzb == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0261, code lost:
        r6 = r6 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0262, code lost:
        r3 = r0.zzE;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0267, code lost:
        if (r14 >= r15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0269, code lost:
        r3[r14].zzs(r6, 1, r1.zzc, r0.zzu, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0281, code lost:
        if (r2.zzk() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0283, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0286, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028a, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x072a, code lost:
        if (r5.zzq == r5.zzr) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r0.zzo != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        r3 = r2.zzb();
        r0.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r2.zzf >= r2.zzi) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r1 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r2.zzk() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        r0.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
        r0.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r2.zzd.zza.zzg != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r0.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.AUDIO_AC4.equals(r2.zzd.zza.zzf.zzm) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r0.zzA = r2.zzc(r0.zzz, 7);
        com.google.android.gms.internal.ads.zzyy.zzb(r0.zzz, r0.zzj);
        r2.zza.zzq(r0.zzj, 7);
        r3 = r0.zzA + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        r3 = r2.zzc(r0.zzz, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
        r0.zzA = r3;
        r0.zzz += r3;
        r0.zzo = 4;
        r0.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r14 = r2.zze();
        r5 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r5 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
        r3 = r0.zzA;
        r4 = r0.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
        if (r3 >= r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
        r0.zzA += r9.zze(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
        r10 = r0.zzg.zzH();
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r11 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
        if (r0.zzA >= r0.zzz) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
        r12 = r0.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
        if (r12 != 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r10, r5, r11, r8);
        r0.zzg.zzF(r8);
        r12 = r0.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
        if (r12 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017a, code lost:
        r0.zzB = r12 - 1;
        r0.zzf.zzF(r8);
        r9.zzq(r0.zzf, 4);
        r9.zzq(r0.zzg, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
        if (r0.zzF.length <= 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
        r8 = r3.zzf.zzm;
        r12 = r10[4];
        r16 = com.google.android.gms.internal.ads.zzaar.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a1, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.VIDEO_H264.equals(r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
        if ((r12 & com.google.common.base.Ascii.US) == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r8) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
        if (((r12 & 126) >> r7) != 39) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
        r0.zzC = r6;
        r0.zzA += 5;
        r0.zzz += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cc, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cf, code lost:
        if (r0.zzC == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
        r0.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r0.zzh.zzH(), 0, r0.zzB, false);
        r9.zzq(r0.zzh, r0.zzB);
        r4 = r0.zzB;
        r6 = r0.zzh;
        r6 = com.google.android.gms.internal.ads.zzaar.zzb(r6.zzH(), r6.zzd());
        r0.zzh.zzF(com.google.android.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r3.zzf.zzm) ? 1 : 0);
        r0.zzh.zzE(r6);
        com.google.android.gms.internal.ads.zzzh.zza(r14, r0.zzh, r0.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0216, code lost:
        r4 = r9.zze(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021b, code lost:
        r0.zzA += r4;
        r0.zzB -= r4;
        r4 = 6;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022c, code lost:
        r12 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0234, code lost:
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0236, code lost:
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0239, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023a, code lost:
        r9.zzs(r14, r12, r0.zzz, 0, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r29, com.google.android.gms.internal.ads.zzaau r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzD = zzzxVar;
        zzg();
        zzabb[] zzabbVarArr = new zzabb[2];
        this.zzE = zzabbVarArr;
        int i = 0;
        zzabb[] zzabbVarArr2 = (zzabb[]) zzew.zzaf(zzabbVarArr, 0);
        this.zzE = zzabbVarArr2;
        for (zzabb zzabbVar : zzabbVarArr2) {
            zzabbVar.zzk(zzc);
        }
        this.zzF = new zzabb[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzabb zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzaf) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzafw) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzagf.zza(zzzvVar);
    }
}
