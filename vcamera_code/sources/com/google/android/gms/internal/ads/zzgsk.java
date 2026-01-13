package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzgsk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgsk() {
    }

    public /* synthetic */ zzgsk(zzgsj zzgsjVar) {
    }

    public static /* bridge */ /* synthetic */ zzgpe zza(zzgsk zzgskVar, zzgpe zzgpeVar, zzgpe zzgpeVar2) {
        zzgskVar.zzb(zzgpeVar);
        zzgskVar.zzb(zzgpeVar2);
        zzgpe zzgpeVar3 = (zzgpe) zzgskVar.zza.pop();
        while (!zzgskVar.zza.isEmpty()) {
            zzgpeVar3 = new zzgso((zzgpe) zzgskVar.zza.pop(), zzgpeVar3);
        }
        return zzgpeVar3;
    }

    private final void zzb(zzgpe zzgpeVar) {
        zzgpe zzgpeVar2;
        zzgpe zzgpeVar3;
        if (!zzgpeVar.zzh()) {
            if (!(zzgpeVar instanceof zzgso)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgpeVar.getClass())));
            }
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            zzgpeVar2 = zzgsoVar.zzd;
            zzb(zzgpeVar2);
            zzgpeVar3 = zzgsoVar.zze;
            zzb(zzgpeVar3);
            return;
        }
        int zzc = zzc(zzgpeVar.zzd());
        int zzc2 = zzgso.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzgpe) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgpeVar);
            return;
        }
        int zzc3 = zzgso.zzc(zzc);
        zzgpe zzgpeVar4 = (zzgpe) this.zza.pop();
        while (!this.zza.isEmpty() && ((zzgpe) this.zza.peek()).zzd() < zzc3) {
            zzgpeVar4 = new zzgso((zzgpe) this.zza.pop(), zzgpeVar4);
        }
        zzgso zzgsoVar2 = new zzgso(zzgpeVar4, zzgpeVar);
        while (!this.zza.isEmpty()) {
            if (((zzgpe) this.zza.peek()).zzd() >= zzgso.zzc(zzc(zzgsoVar2.zzd()) + 1)) {
                break;
            }
            zzgsoVar2 = new zzgso((zzgpe) this.zza.pop(), zzgsoVar2);
        }
        this.zza.push(zzgsoVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgso.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
