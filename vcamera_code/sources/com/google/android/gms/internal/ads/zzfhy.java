package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzfhy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    public final zzfiw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfhp zzf;
    private final long zzg;
    private final int zzh;

    public zzfhy(Context context, int i, int i2, String str, String str2, String str3, zzfhp zzfhpVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfhpVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfiw zzfiwVar = new zzfiw(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfiwVar;
        this.zzd = new LinkedBlockingQueue();
        zzfiwVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzfji zza() {
        return new zzfji(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfjb zzd = zzd();
        if (zzd != null) {
            try {
                zzfji zzf = zzd.zzf(new zzfjg(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfji zzb(int i) {
        zzfji zzfjiVar;
        try {
            zzfjiVar = (zzfji) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzg, e);
            zzfjiVar = null;
        }
        zze(PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED, this.zzg, null);
        if (zzfjiVar != null) {
            zzfhp.zzg(zzfjiVar.zzc == 7 ? 3 : 2);
        }
        return zzfjiVar == null ? zza() : zzfjiVar;
    }

    public final void zzc() {
        zzfiw zzfiwVar = this.zza;
        if (zzfiwVar != null) {
            if (zzfiwVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfjb zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
