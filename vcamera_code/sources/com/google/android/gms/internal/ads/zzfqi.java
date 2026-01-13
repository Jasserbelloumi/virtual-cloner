package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfqi extends zzfom {
    private final zzfqk zza;

    public zzfqi(zzfqk zzfqkVar, int i) {
        super(zzfqkVar.size(), i);
        this.zza = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
