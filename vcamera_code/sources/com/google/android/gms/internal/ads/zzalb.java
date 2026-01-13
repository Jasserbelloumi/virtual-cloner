package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
final class zzalb implements zzakn {
    private final Map zza = new HashMap();
    @o0OO00OO
    private final zzaka zzb;
    @o0OO00OO
    private final BlockingQueue zzc;
    private final zzakf zzd;

    public zzalb(@oo0oO0 zzaka zzakaVar, @oo0oO0 BlockingQueue blockingQueue, zzakf zzakfVar, byte[] bArr) {
        this.zzd = zzakfVar;
        this.zzb = zzakaVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final synchronized void zza(zzako zzakoVar) {
        String zzj = zzakoVar.zzj();
        List list = (List) this.zza.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzala.zzb) {
            zzala.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzako zzakoVar2 = (zzako) list.remove(0);
        this.zza.put(zzj, list);
        zzakoVar2.zzu(this);
        try {
            this.zzc.put(zzakoVar2);
        } catch (InterruptedException e) {
            zzala.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final void zzb(zzako zzakoVar, zzaku zzakuVar) {
        List<zzako> list;
        zzajx zzajxVar = zzakuVar.zzb;
        if (zzajxVar == null || zzajxVar.zza(System.currentTimeMillis())) {
            zza(zzakoVar);
            return;
        }
        String zzj = zzakoVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzala.zzb) {
                zzala.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (zzako zzakoVar2 : list) {
                this.zzd.zzb(zzakoVar2, zzakuVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzako zzakoVar) {
        String zzj = zzakoVar.zzj();
        if (!this.zza.containsKey(zzj)) {
            this.zza.put(zzj, null);
            zzakoVar.zzu(this);
            if (zzala.zzb) {
                zzala.zza("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.zza.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        zzakoVar.zzm("waiting-for-response");
        list.add(zzakoVar);
        this.zza.put(zzj, list);
        if (zzala.zzb) {
            zzala.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }
}
