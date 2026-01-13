package com.google.android.gms.measurement.internal;

import androidx.collection.o00oo0O;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzff extends o00oo0O {
    public final /* synthetic */ zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfi zzfiVar, int i) {
        super(20);
        this.zza = zzfiVar;
    }

    @Override // androidx.collection.o00oo0O
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfi.zzd(this.zza, str);
    }
}
