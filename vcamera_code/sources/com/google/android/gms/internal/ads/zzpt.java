package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
/* loaded from: classes2.dex */
public final class zzpt {
    public final int zza;
    @o0OO00OO
    public final zzss zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzpt(CopyOnWriteArrayList copyOnWriteArrayList, int i, @o0OO00OO zzss zzssVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzssVar;
    }

    @o0OoO00O
    public final zzpt zza(int i, @o0OO00OO zzss zzssVar) {
        return new zzpt(this.zzc, 0, zzssVar);
    }

    public final void zzb(Handler handler, zzpu zzpuVar) {
        this.zzc.add(new zzps(handler, zzpuVar));
    }

    public final void zzc(zzpu zzpuVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzps zzpsVar = (zzps) it.next();
            if (zzpsVar.zzb == zzpuVar) {
                this.zzc.remove(zzpsVar);
            }
        }
    }
}
