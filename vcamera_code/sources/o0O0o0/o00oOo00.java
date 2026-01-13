package o0O0o0;

import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0o0Oo.o0OoO00O;
/* loaded from: classes.dex */
public abstract class o00oOo00<T> implements o0O0o00o.o00oOoO<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<String> f12303o00oOOo0 = new ArrayList();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public T f12304o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O0o0O.o00oo0<T> f12305o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOOo0 f12306o00oOooO;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(@oo0oO0 List<String> list);

        void o00oOOoO(@oo0oO0 List<String> list);
    }

    public o00oOo00(o0O0o0O.o00oo0<T> o00oo0Var) {
        this.f12305o00oOo00 = o00oo0Var;
    }

    @Override // o0O0o00o.o00oOoO
    public void o00oOOo0(@o0OO00OO T t) {
        this.f12304o00oOOoO = t;
        o00oOoO(this.f12306o00oOooO, t);
    }

    public abstract boolean o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o);

    public abstract boolean o00oOo00(@oo0oO0 T t);

    public void o00oOo0O(@oo0oO0 Iterable<o0OoO00O> iterable) {
        this.f12303o00oOOo0.clear();
        for (o0OoO00O o0ooo00o : iterable) {
            if (o00oOOoO(o0ooo00o)) {
                this.f12303o00oOOo0.add(o0ooo00o.f12462o00oOOo0);
            }
        }
        if (this.f12303o00oOOo0.isEmpty()) {
            this.f12305o00oOo00.o00oOo00(this);
        } else {
            this.f12305o00oOo00.o00oOOo0(this);
        }
        o00oOoO(this.f12306o00oOooO, this.f12304o00oOOoO);
    }

    public void o00oOo0o() {
        if (this.f12303o00oOOo0.isEmpty()) {
            return;
        }
        this.f12303o00oOOo0.clear();
        this.f12305o00oOo00.o00oOo00(this);
    }

    public final void o00oOoO(@o0OO00OO o00oOOo0 o00oooo02, @o0OO00OO T t) {
        if (this.f12303o00oOOo0.isEmpty() || o00oooo02 == null) {
            return;
        }
        if (t == null || o00oOo00(t)) {
            o00oooo02.o00oOOoO(this.f12303o00oOOo0);
        } else {
            o00oooo02.o00oOOo0(this.f12303o00oOOo0);
        }
    }

    public void o00oOoO0(@o0OO00OO o00oOOo0 o00oooo02) {
        if (this.f12306o00oOooO != o00oooo02) {
            this.f12306o00oOooO = o00oooo02;
            o00oOoO(o00oooo02, this.f12304o00oOOoO);
        }
    }

    public boolean o00oOooO(@oo0oO0 String str) {
        T t = this.f12304o00oOOoO;
        return t != null && o00oOo00(t) && this.f12303o00oOOo0.contains(str);
    }
}
