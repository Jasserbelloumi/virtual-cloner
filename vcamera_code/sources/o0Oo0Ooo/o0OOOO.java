package o0Oo0Ooo;

import java.util.LinkedHashSet;
import java.util.Set;
import o0Oo0Oo0.o0OO00o0;
/* loaded from: classes3.dex */
public final class o0OOOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<o0OO00o0> f16290o00oOOo0 = new LinkedHashSet();

    public synchronized void o00oOOo0(o0OO00o0 o0oo00o0) {
        this.f16290o00oOOo0.remove(o0oo00o0);
    }

    public synchronized void o00oOOoO(o0OO00o0 o0oo00o0) {
        this.f16290o00oOOo0.add(o0oo00o0);
    }

    public synchronized boolean o00oOo00(o0OO00o0 o0oo00o0) {
        return this.f16290o00oOOo0.contains(o0oo00o0);
    }
}
