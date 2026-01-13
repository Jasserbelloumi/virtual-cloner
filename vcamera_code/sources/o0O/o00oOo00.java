package o0O;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
/* loaded from: classes2.dex */
public class o00oOo00 implements o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final SparseArray<o00oOOoO> f9924o00oOOo0 = new SparseArray<>();

    @Override // o0O.o00oOOoO
    public Bundle o00oOOo0(Context context, int i, Bundle bundle) {
        o00oOOoO o00ooooo2;
        synchronized (this.f9924o00oOOo0) {
            o00ooooo2 = this.f9924o00oOOo0.get(i);
        }
        if (o00ooooo2 != null) {
            return o00ooooo2.o00oOOo0(context, i, bundle);
        }
        return null;
    }

    public final void o00oOOoO(int i, o00oOOoO o00ooooo2) {
        synchronized (this.f9924o00oOOo0) {
            this.f9924o00oOOo0.put(i, o00ooooo2);
        }
    }

    public final void o00oOo00(int i) {
        synchronized (this.f9924o00oOOo0) {
            this.f9924o00oOOo0.remove(i);
        }
    }
}
