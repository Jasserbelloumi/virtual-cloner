package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzxb extends Handler implements Runnable {
    public final /* synthetic */ zzxg zza;
    private final zzxc zzb;
    private final long zzc;
    @o0OO00OO
    private zzwy zzd;
    @o0OO00OO
    private IOException zze;
    private int zzf;
    @o0OO00OO
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxb(zzxg zzxgVar, Looper looper, zzxc zzxcVar, zzwy zzwyVar, int i, long j) {
        super(looper);
        this.zza = zzxgVar;
        this.zzb = zzxcVar;
        this.zzd = zzwyVar;
        this.zzc = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzxb zzxbVar;
        this.zze = null;
        zzxg zzxgVar = this.zza;
        executorService = zzxgVar.zze;
        zzxbVar = zzxgVar.zzf;
        zzxbVar.getClass();
        executorService.execute(zzxbVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            zzd();
        } else if (i4 == 3) {
            throw ((Error) message.obj);
        } else {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zzc;
            zzwy zzwyVar = this.zzd;
            zzwyVar.getClass();
            if (this.zzh) {
                zzwyVar.zzI(this.zzb, elapsedRealtime, j2, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    zzwyVar.zzJ(this.zzb, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    zzee.zzc("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zzg = new zzxf(e);
                }
            } else if (i5 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i6 = this.zzf + 1;
                this.zzf = i6;
                zzxa zzt = zzwyVar.zzt(this.zzb, elapsedRealtime, j2, iOException, i6);
                i = zzt.zza;
                if (i == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i2 = zzt.zza;
                if (i2 != 2) {
                    i3 = zzt.zza;
                    if (i3 == 1) {
                        this.zzf = 1;
                    }
                    j = zzt.zzb;
                    zzc(j != C.TIME_UNSET ? zzt.zzb : Math.min((this.zzf - 1) * 1000, 5000));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object zzxfVar;
        Message obtainMessage;
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i = zzew.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage = obtainMessage(2, e);
            obtainMessage.sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                zzee.zzc("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "Unexpected exception loading stream", e3);
            zzxfVar = new zzxf(e3);
            obtainMessage = obtainMessage(2, zzxfVar);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzee.zzc("LoadTask", "OutOfMemory error loading stream", e4);
            zzxfVar = new zzxf(e4);
            obtainMessage = obtainMessage(2, zzxfVar);
            obtainMessage.sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwy zzwyVar = this.zzd;
            zzwyVar.getClass();
            zzwyVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzxb zzxbVar;
        zzxbVar = this.zza.zzf;
        zzdl.zzf(zzxbVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
