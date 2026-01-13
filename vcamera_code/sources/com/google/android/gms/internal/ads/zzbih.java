package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import org.osmdroid.tileprovider.modules.SqlTileWriter;
/* loaded from: classes2.dex */
public final class zzbih implements zzbhp {
    private final zzdsf zza;

    public zzbih(zzdsf zzdsfVar) {
        Preconditions.checkNotNull(zzdsfVar, "The Inspector Manager must not be null");
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey(SqlTileWriter.COLUMN_EXPIRES)) {
            try {
                j = Long.parseLong((String) map.get(SqlTileWriter.COLUMN_EXPIRES));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
