package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(23)
/* loaded from: classes2.dex */
public final class zzqn extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaFormat zzh;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaFormat zzi;
    @o0O0OOOo("lock")
    @o0OO00OO
    private MediaCodec.CodecException zzj;
    @o0O0OOOo("lock")
    private long zzk;
    @o0O0OOOo("lock")
    private boolean zzl;
    @o0O0OOOo("lock")
    @o0OO00OO
    private IllegalStateException zzm;
    private final Object zza = new Object();
    @o0O0OOOo("lock")
    private final zzqr zzd = new zzqr();
    @o0O0OOOo("lock")
    private final zzqr zze = new zzqr();
    @o0O0OOOo("lock")
    private final ArrayDeque zzf = new ArrayDeque();
    @o0O0OOOo("lock")
    private final ArrayDeque zzg = new ArrayDeque();

    public zzqn(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzqn zzqnVar) {
        synchronized (zzqnVar.zza) {
            if (zzqnVar.zzl) {
                return;
            }
            long j = zzqnVar.zzk - 1;
            zzqnVar.zzk = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i >= 0) {
                zzqnVar.zzi();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (zzqnVar.zza) {
                zzqnVar.zzm = illegalStateException;
            }
        }
    }

    @o0O0OOOo("lock")
    private final void zzh(MediaFormat mediaFormat) {
        this.zze.zzb(-2);
        this.zzg.add(mediaFormat);
    }

    @o0O0OOOo("lock")
    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = null;
    }

    @o0O0OOOo("lock")
    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException;
    }

    @o0O0OOOo("lock")
    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException == null) {
            return;
        }
        this.zzj = null;
        throw codecException;
    }

    @o0O0OOOo("lock")
    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.zzb(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.zzb(i);
            this.zzf.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            int i = -1;
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (!this.zzd.zzd()) {
                i = this.zzd.zza();
            }
            return i;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (this.zze.zzd()) {
                return -1;
            }
            int zza = this.zze.zza();
            if (zza >= 0) {
                zzdl.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (zza == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                zza = -2;
            }
            return zza;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i = zzew.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                @Override // java.lang.Runnable
                public final void run() {
                    zzqn.zzd(zzqn.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdl.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}
