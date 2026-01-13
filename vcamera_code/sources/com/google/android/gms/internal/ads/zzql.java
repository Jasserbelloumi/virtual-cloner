package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(23)
/* loaded from: classes2.dex */
public final class zzql {
    @o0O0OOOo("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdo zzg;
    private boolean zzh;

    public zzql(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdo zzdoVar = new zzdo(zzdm.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdoVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzql r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L3e
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzqi.zza(r9, r1, r0)
            goto L58
        L1c:
            com.google.android.gms.internal.ads.zzdo r9 = r9.zzg
            r9.zze()
            goto L58
        L22:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzqk r10 = (com.google.android.gms.internal.ads.zzqk) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzql.zzb     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L57
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            goto L52
        L3e:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzqk r10 = (com.google.android.gms.internal.ads.zzqk) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L51
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L51
            goto L57
        L51:
            r0 = move-exception
        L52:
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzqi.zza(r9, r1, r0)
        L57:
            r1 = r10
        L58:
            if (r1 == 0) goto L65
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzql.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            throw r10
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzql.zza(com.google.android.gms.internal.ads.zzql, android.os.Message):void");
    }

    private static zzqk zzg() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzqk();
            }
            return (zzqk) arrayDeque.removeFirst();
        }
    }

    private final void zzh() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @o0OO00OO
    private static byte[] zzi(@o0OO00OO byte[] bArr, @o0OO00OO byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @o0OO00OO
    private static int[] zzj(@o0OO00OO int[] iArr, @o0OO00OO int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc(int i, int i2, int i3, long j, int i4) {
        zzh();
        zzqk zzg = zzg();
        zzg.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzew.zza;
        handler.obtainMessage(0, zzg).sendToTarget();
    }

    public final void zzd(int i, int i2, zzgo zzgoVar, long j, int i3) {
        zzh();
        zzqk zzg = zzg();
        zzg.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzg.zzd;
        cryptoInfo.numSubSamples = zzgoVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzgoVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzgoVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzgoVar.zzb, cryptoInfo.key);
        zzi.getClass();
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzgoVar.zza, cryptoInfo.iv);
        zzi2.getClass();
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzgoVar.zzc;
        if (zzew.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzgoVar.zzg, zzgoVar.zzh));
        }
        this.zze.obtainMessage(1, zzg).sendToTarget();
    }

    public final void zze() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzf() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzqj(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
