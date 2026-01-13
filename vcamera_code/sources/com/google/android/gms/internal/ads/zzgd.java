package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Map;
/* loaded from: classes2.dex */
public interface zzgd extends zzfg {
    public static final zzfnv zza = new zzfnv() { // from class: com.google.android.gms.internal.ads.zzfx
        @Override // com.google.android.gms.internal.ads.zzfnv
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzfnb.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains("text") && !zza2.contains(MimeTypes.TEXT_VTT)) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzfg
    Map zze();
}
