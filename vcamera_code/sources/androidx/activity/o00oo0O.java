package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public abstract class o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f58o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public CopyOnWriteArrayList<o00oOo0O> f59o00oOOoO = new CopyOnWriteArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o<Boolean> f60o00oOo00;

    public o00oo0O(boolean z) {
        this.f58o00oOOo0 = z;
    }

    @o0O
    public abstract void o00oOo0O();

    @o0O
    public final boolean o00oOo0o() {
        return this.f58o00oOOo0;
    }

    public void o00oOoO(@oo0oO0 o00oOo0O o00ooo0o2) {
        this.f59o00oOOoO.remove(o00ooo0o2);
    }

    @o0O
    public final void o00oOoO0() {
        Iterator<o00oOo0O> it = this.f59o00oOOoO.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @o0O
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public final void o00oOoOO(boolean z) {
        this.f58o00oOOo0 = z;
        o<Boolean> oVar = this.f60o00oOo00;
        if (oVar != null) {
            oVar.accept(Boolean.valueOf(z));
        }
    }

    public void o00oOoOo(@o0OO00OO o<Boolean> oVar) {
        this.f60o00oOo00 = oVar;
    }

    public void o00oOooO(@oo0oO0 o00oOo0O o00ooo0o2) {
        this.f59o00oOOoO.add(o00ooo0o2);
    }
}
