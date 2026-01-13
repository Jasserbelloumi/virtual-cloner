package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class zzay {
    public final Uri zza;
    public final List zze;
    public final zzfqk zzg;
    @Deprecated
    public final List zzh;
    @o0OO00OO
    public final Object zzi;
    @o0OO00OO
    public final String zzb = null;
    @o0OO00OO
    public final zzas zzc = null;
    @o0OO00OO
    public final zzai zzd = null;
    @o0OO00OO
    public final String zzf = null;

    public /* synthetic */ zzay(Uri uri, String str, zzas zzasVar, zzai zzaiVar, List list, String str2, zzfqk zzfqkVar, Object obj, zzax zzaxVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfqkVar;
        zzfqh zzi = zzfqk.zzi();
        if (zzfqkVar.size() > 0) {
            zzbe zzbeVar = (zzbe) zzfqkVar.get(0);
            throw null;
        }
        this.zzh = zzi.zzi();
        this.zzi = null;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzay) {
            zzay zzayVar = (zzay) obj;
            return this.zza.equals(zzayVar.zza) && zzew.zzU(null, null) && zzew.zzU(null, null) && zzew.zzU(null, null) && this.zze.equals(zzayVar.zze) && zzew.zzU(null, null) && this.zzg.equals(zzayVar.zzg) && zzew.zzU(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zze.hashCode() + (this.zza.hashCode() * 923521)) * 961) + this.zzg.hashCode()) * 31;
    }
}
