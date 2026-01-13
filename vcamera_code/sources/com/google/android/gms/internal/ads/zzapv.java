package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzapv extends zzapu {
    public zzapv(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzapv zzt(String str, Context context, boolean z) {
        zzapu.zzr(context, false);
        return new zzapv(context, str, false);
    }

    @Deprecated
    public static zzapv zzu(String str, Context context, boolean z, int i) {
        zzapu.zzr(context, z);
        return new zzapv(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final List zzp(zzaqx zzaqxVar, Context context, zzamv zzamvVar, zzamo zzamoVar) {
        if (zzaqxVar.zzk() == null || !((zzapu) this).zzu) {
            return super.zzp(zzaqxVar, context, zzamvVar, null);
        }
        int zza = zzaqxVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzaqxVar, context, zzamvVar, null));
        arrayList.add(new zzarq(zzaqxVar, "uz1YArq5cHS8AYJUDc1zzIdIMbHyJKwb7tfYne2XDSTiUe1d6tP4aZb4XhmiO5Pa", "D14sOPs9bJ6lVOYt2Sp9xUGRfFtxk1j4Rj4Ydr//Mak=", zzamvVar, zza, 24));
        return arrayList;
    }
}
