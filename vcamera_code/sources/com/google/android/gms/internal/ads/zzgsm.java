package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class zzgsm implements Iterator {
    private final ArrayDeque zza;
    private zzgoz zzb;

    public /* synthetic */ zzgsm(zzgpe zzgpeVar, zzgsl zzgslVar) {
        zzgoz zzgozVar;
        zzgpe zzgpeVar2;
        if (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgsoVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgsoVar);
            zzgpeVar2 = zzgsoVar.zzd;
            zzgozVar = zzb(zzgpeVar2);
        } else {
            this.zza = null;
            zzgozVar = (zzgoz) zzgpeVar;
        }
        this.zzb = zzgozVar;
    }

    private final zzgoz zzb(zzgpe zzgpeVar) {
        while (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            this.zza.push(zzgsoVar);
            zzgpeVar = zzgsoVar.zzd;
        }
        return (zzgoz) zzgpeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgoz next() {
        zzgoz zzgozVar;
        zzgpe zzgpeVar;
        zzgoz zzgozVar2 = this.zzb;
        if (zzgozVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgozVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgpeVar = ((zzgso) this.zza.pop()).zze;
                zzgozVar = zzb(zzgpeVar);
            } while (zzgozVar.zzD());
            this.zzb = zzgozVar;
            return zzgozVar2;
        }
        throw new NoSuchElementException();
    }
}
