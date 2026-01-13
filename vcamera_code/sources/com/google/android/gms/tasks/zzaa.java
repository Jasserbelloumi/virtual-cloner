package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
final class zzaa implements Continuation {
    public final /* synthetic */ Collection zza;

    public zzaa(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(@oo0oO0 Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.zza) {
            arrayList.add(task2.getResult());
        }
        return arrayList;
    }
}
