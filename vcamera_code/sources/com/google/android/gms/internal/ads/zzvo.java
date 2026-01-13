package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzvo extends zzct {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzvo() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public zzvo(Context context) {
        super.zzd(context);
        Point zzB = zzew.zzB(context);
        zze(zzB.x, zzB.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    public /* synthetic */ zzvo(zzvq zzvqVar, zzvn zzvnVar) {
        super(zzvqVar);
        this.zza = zzvqVar.zzG;
        this.zzb = zzvqVar.zzI;
        this.zzc = zzvqVar.zzK;
        this.zzd = zzvqVar.zzP;
        this.zze = zzvqVar.zzQ;
        this.zzf = zzvqVar.zzS;
        SparseArray zza = zzvq.zza(zzvqVar);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza.size(); i++) {
            sparseArray.put(zza.keyAt(i), new HashMap((Map) zza.valueAt(i)));
        }
        this.zzg = sparseArray;
        this.zzh = zzvq.zzb(zzvqVar).clone();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final /* synthetic */ zzct zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzvo zzo(int i, boolean z) {
        if (this.zzh.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzh.put(i, true);
        } else {
            this.zzh.delete(i);
        }
        return this;
    }
}
