package o00oOOoO;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<o00oOo0O> f6874o00oOOo0 = new CopyOnWriteArraySet();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public volatile Context f6875o00oOOoO;

    public void o00oOOo0(@oo0oO0 o00oOo0O o00ooo0o2) {
        if (this.f6875o00oOOoO != null) {
            o00ooo0o2.o00oOOo0(this.f6875o00oOOoO);
        }
        this.f6874o00oOOo0.add(o00ooo0o2);
    }

    public void o00oOOoO() {
        this.f6875o00oOOoO = null;
    }

    public void o00oOo00(@oo0oO0 Context context) {
        this.f6875o00oOOoO = context;
        for (o00oOo0O o00ooo0o2 : this.f6874o00oOOo0) {
            o00ooo0o2.o00oOOo0(context);
        }
    }

    public void o00oOo0O(@oo0oO0 o00oOo0O o00ooo0o2) {
        this.f6874o00oOOo0.remove(o00ooo0o2);
    }

    @o0OO00OO
    public Context o00oOooO() {
        return this.f6875o00oOOoO;
    }
}
