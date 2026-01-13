package androidx.lifecycle;

import androidx.lifecycle.o00oOoO;
import androidx.lifecycle.o0O00;
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements o0O00OOO {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOoO.o00oOOo0 f3250o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Object f3251o00oo0O0;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3251o00oo0O0 = obj;
        this.f3250o00oo0O = o00oOoO.f3288o00oOo00.o00oOo00(obj.getClass());
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@o00oOooO.oo0oO0 o0O0O0O o0o0o0o, @o00oOooO.oo0oO0 o0O00.o00oOOo0 o00oooo02) {
        this.f3250o00oo0O.o00oOOo0(o0o0o0o, o00oooo02, this.f3251o00oo0O0);
    }
}
