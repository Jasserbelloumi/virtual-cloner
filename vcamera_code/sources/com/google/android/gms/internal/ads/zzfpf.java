package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfpf extends zzfpi implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfpf(Map map) {
        zzfnu.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* synthetic */ int zzd(zzfpf zzfpfVar) {
        int i = zzfpfVar.zzb;
        zzfpfVar.zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zze(zzfpf zzfpfVar) {
        int i = zzfpfVar.zzb;
        zzfpfVar.zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzf(zzfpf zzfpfVar, int i) {
        int i2 = zzfpfVar.zzb + i;
        zzfpfVar.zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzg(zzfpf zzfpfVar, int i) {
        int i2 = zzfpfVar.zzb - i;
        zzfpfVar.zzb = i2;
        return i2;
    }

    public static /* synthetic */ void zzq(zzfpf zzfpfVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfpfVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfpfVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final Collection zzi() {
        return new zzfph(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final Iterator zzj() {
        return new zzfop(this);
    }

    public final List zzk(Object obj, List list, @CheckForNull zzfpc zzfpcVar) {
        return list instanceof RandomAccess ? new zzfoy(this, obj, list, zzfpcVar) : new zzfpe(this, obj, list, zzfpcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Map zzm() {
        throw null;
    }

    public final Map zzn() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfow(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfoz(this, (SortedMap) map) : new zzfos(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Set zzo() {
        throw null;
    }

    public final Set zzp() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfox(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfpa(this, (SortedMap) map) : new zzfov(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final void zzr() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi, com.google.android.gms.internal.ads.zzfrg
    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.zzb++;
                return true;
            }
            return false;
        }
        Collection zza = zza();
        if (zza.add(obj2)) {
            this.zzb++;
            this.zza.put(obj, zza);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }
}
