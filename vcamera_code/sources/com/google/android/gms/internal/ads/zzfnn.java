package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
public final class zzfnn {
    private final String zza;
    private final zzfnm zzb;
    private zzfnm zzc;

    public /* synthetic */ zzfnn(String str, zzfnl zzfnlVar) {
        zzfnm zzfnmVar = new zzfnm(null);
        this.zzb = zzfnmVar;
        this.zzc = zzfnmVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfnm zzfnmVar = this.zzb.zzb;
        String str = "";
        while (zzfnmVar != null) {
            Object obj = zzfnmVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfnmVar = zzfnmVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfnn zza(@CheckForNull Object obj) {
        zzfnm zzfnmVar = new zzfnm(null);
        this.zzc.zzb = zzfnmVar;
        this.zzc = zzfnmVar;
        zzfnmVar.zza = obj;
        return this;
    }
}
