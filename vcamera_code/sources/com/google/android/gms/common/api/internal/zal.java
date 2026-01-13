package com.google.android.gms.common.api.internal;

import androidx.collection.o00oOOo0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class zal {
    private int zad;
    private final o00oOOo0 zab = new o00oOOo0();
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final o00oOOo0 zaa = new o00oOOo0();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final Task zaa() {
        return this.zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @o0OO00OO String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
                return;
            }
            this.zac.setException(new AvailabilityException(this.zaa));
        }
    }
}
