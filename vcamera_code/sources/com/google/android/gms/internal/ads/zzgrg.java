package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
final class zzgrg extends zzgrk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgrg() {
        super(null);
    }

    public /* synthetic */ zzgrg(zzgrf zzgrfVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzgrd zzgrdVar;
        List list = (List) zzgtq.zzh(obj, j);
        if (list.isEmpty()) {
            List zzgrdVar2 = list instanceof zzgre ? new zzgrd(i) : ((list instanceof zzgsd) && (list instanceof zzgqv)) ? ((zzgqv) list).zzd(i) : new ArrayList(i);
            zzgtq.zzv(obj, j, zzgrdVar2);
            return zzgrdVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgrdVar = arrayList;
        } else if (!(list instanceof zzgtl)) {
            if ((list instanceof zzgsd) && (list instanceof zzgqv)) {
                zzgqv zzgqvVar = (zzgqv) list;
                if (zzgqvVar.zzc()) {
                    return list;
                }
                zzgqv zzd = zzgqvVar.zzd(list.size() + i);
                zzgtq.zzv(obj, j, zzd);
                return zzd;
            }
            return list;
        } else {
            zzgrd zzgrdVar3 = new zzgrd(list.size() + i);
            zzgrdVar3.addAll(zzgrdVar3.size(), (zzgtl) list);
            zzgrdVar = zzgrdVar3;
        }
        zzgtq.zzv(obj, j, zzgrdVar);
        return zzgrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgtq.zzh(obj, j);
        if (list instanceof zzgre) {
            unmodifiableList = ((zzgre) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgsd) && (list instanceof zzgqv)) {
                zzgqv zzgqvVar = (zzgqv) list;
                if (zzgqvVar.zzc()) {
                    zzgqvVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgtq.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgtq.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgtq.zzv(obj, j, list);
    }
}
