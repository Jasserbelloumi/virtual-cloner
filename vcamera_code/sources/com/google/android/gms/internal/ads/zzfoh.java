package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o0Oo0oO.oO0000o0;
/* loaded from: classes2.dex */
public final class zzfoh {
    private final zzfng zza;
    private final zzfog zzb;

    private zzfoh(zzfog zzfogVar) {
        zzfnf zzfnfVar = zzfnf.zza;
        this.zzb = zzfogVar;
        this.zza = zzfnfVar;
    }

    public static zzfoh zzb(int i) {
        return new zzfoh(new zzfod(oO0000o0.f16600o00oOoo0));
    }

    public static zzfoh zzc(zzfng zzfngVar) {
        return new zzfoh(new zzfob(zzfngVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfoe(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
