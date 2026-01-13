package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes2.dex */
public final class zzcum extends zzczy implements com.google.android.gms.ads.internal.client.zza {
    public zzcum(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcul
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
            }
        });
    }
}
