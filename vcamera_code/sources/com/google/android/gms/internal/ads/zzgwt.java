package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
/* loaded from: classes2.dex */
public class zzgwt {
    public final LinkedHashMap zza;

    public zzgwt(int i) {
        this.zza = zzgwv.zzb(i);
    }

    public final zzgwt zza(Object obj, zzgxl zzgxlVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgxg.zza(obj, "key");
        zzgxg.zza(zzgxlVar, DatabaseFileArchive.COLUMN_PROVIDER);
        linkedHashMap.put(obj, zzgxlVar);
        return this;
    }
}
