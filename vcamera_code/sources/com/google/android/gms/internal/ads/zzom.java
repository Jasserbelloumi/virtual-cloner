package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedInts;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzom {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzol zza;
    private final long[] zzb;
    @o0OO00OO
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    @o0OO00OO
    private zzok zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    @o0OO00OO
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzom(zzol zzolVar) {
        this.zza = zzolVar;
        int i = zzew.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (this.zzx != C.TIME_UNSET) {
            return Math.min(this.zzA, ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000) + this.zzz);
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
        boolean z = this.zzh;
        long j2 = playbackHeadPosition & UnsignedInts.INT_MASK;
        if (z) {
            if (playState == 2) {
                if (j2 == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            j2 += this.zzu;
        }
        if (zzew.zza <= 29) {
            if (j2 != 0) {
                j = j2;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == C.TIME_UNSET) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = C.TIME_UNSET;
            j2 = j;
        }
        if (this.zzs > j2) {
            this.zzt++;
        }
        this.zzs = j2;
        return j2 + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzl;
        zzof zzofVar;
        zzof zzofVar2;
        zzob zzobVar;
        Method method;
        zzok zzokVar;
        long zzF;
        long zzG;
        String str;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzl2 = zzl(zzm());
            if (zzl2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzm >= 30000) {
                    long[] jArr = this.zzb;
                    int i = this.zzv;
                    jArr[i] = zzl2 - nanoTime;
                    this.zzv = (i + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzm = nanoTime;
                    this.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzl = (this.zzb[i3] / i4) + this.zzl;
                        i3++;
                    }
                }
                if (!this.zzh) {
                    zzok zzokVar2 = this.zzf;
                    zzokVar2.getClass();
                    if (zzokVar2.zzg(nanoTime)) {
                        long zzb = zzokVar2.zzb();
                        long zza = zzokVar2.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzpa zzpaVar = (zzpa) this.zza;
                            zzF = zzpaVar.zza.zzF();
                            zzG = zzpaVar.zza.zzG();
                            zzokVar = zzokVar2;
                            str = "Spurious audio timestamp (system clock mismatch): ";
                        } else {
                            zzokVar = zzokVar2;
                            if (Math.abs(zzl(zza) - zzl2) > 5000000) {
                                zzpa zzpaVar2 = (zzpa) this.zza;
                                zzF = zzpaVar2.zza.zzF();
                                zzG = zzpaVar2.zza.zzG();
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            } else {
                                zzokVar.zzc();
                            }
                        }
                        StringBuilder o00oOOo02 = androidx.concurrent.futures.o00oOOo0.o00oOOo0(str, zza, ", ");
                        o00oOOo02.append(zzb);
                        o00oOOo02.append(", ");
                        o00oOOo02.append(nanoTime);
                        o00oOOo02.append(", ");
                        o00oOOo02.append(zzl2);
                        o00oOOo02.append(", ");
                        o00oOOo02.append(zzF);
                        o00oOOo02.append(", ");
                        o00oOOo02.append(zzG);
                        zzee.zze("DefaultAudioSink", o00oOOo02.toString());
                        zzokVar.zzd();
                    }
                    if (this.zzq && (method = this.zzn) != null && nanoTime - this.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.zzc;
                            audioTrack2.getClass();
                            int i5 = zzew.zza;
                            long intValue = (((Integer) method.invoke(audioTrack2, new Object[0])).intValue() * 1000) - this.zzi;
                            this.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzo = max;
                            if (max > 5000000) {
                                zzee.zze("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                this.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzn = null;
                        }
                        this.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzok zzokVar3 = this.zzf;
        zzokVar3.getClass();
        boolean zzf = zzokVar3.zzf();
        if (zzf) {
            zzl = zzew.zzs(nanoTime2 - zzokVar3.zzb(), this.zzj) + zzl(zzokVar3.zza());
        } else {
            zzl = this.zzw == 0 ? zzl(zzm()) : this.zzl + nanoTime2;
            if (!z) {
                zzl = Math.max(0L, zzl - this.zzo);
            }
        }
        if (this.zzD != zzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j = nanoTime2 - this.zzF;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            zzl = (((1000 - j2) * (zzew.zzs(j, this.zzj) + this.zzE)) + (zzl * j2)) / 1000;
        }
        if (!this.zzk) {
            long j3 = this.zzB;
            if (zzl > j3) {
                this.zzk = true;
                int i6 = zzew.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzew.zzz(zzew.zzu(zzew.zzz(zzl - j3), this.zzj));
                zzpf zzpfVar = ((zzpa) this.zza).zza;
                zzofVar = zzpfVar.zzq;
                if (zzofVar != null) {
                    zzofVar2 = zzpfVar.zzq;
                    zzobVar = ((zzpk) zzofVar2).zza.zzc;
                    zzobVar.zzr(currentTimeMillis);
                }
            }
        }
        this.zzC = nanoTime2;
        this.zzB = zzl;
        this.zzD = zzf;
        return zzl;
    }

    public final void zzc(long j) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zzok r0 = new com.google.android.gms.internal.ads.zzok
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzew.zzW(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzl(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf() {
        zzok zzokVar = this.zzf;
        zzokVar.getClass();
        zzokVar.zze();
    }

    public final boolean zzg(long j) {
        if (j <= zzm()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                return audioTrack.getPlayState() == 2 && zzm() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != C.TIME_UNSET && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        zzof zzofVar;
        long j2;
        zzof zzofVar2;
        zzob zzobVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzg = zzg(j);
        this.zzp = zzg;
        if (z && !zzg && playState != 1) {
            zzol zzolVar = this.zza;
            int i = this.zze;
            long zzz = zzew.zzz(this.zzi);
            zzpa zzpaVar = (zzpa) zzolVar;
            zzofVar = zzpaVar.zza.zzq;
            if (zzofVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzpf zzpfVar = zzpaVar.zza;
                j2 = zzpfVar.zzU;
                zzofVar2 = zzpfVar.zzq;
                zzobVar = ((zzpk) zzofVar2).zza.zzc;
                zzobVar.zzt(i, zzz, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == C.TIME_UNSET) {
            zzok zzokVar = this.zzf;
            zzokVar.getClass();
            zzokVar.zze();
            return true;
        }
        return false;
    }
}
