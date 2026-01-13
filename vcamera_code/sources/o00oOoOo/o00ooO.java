package o00oOoOo;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0OO0oO;
import o0O000oo.o0OO;
import o0O000oo.o0OO0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00ooO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Interpolator f7016o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f7017o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O000oo.o0OO0oO f7019o00oOooO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f7015o00oOOoO = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o0OO f7018o00oOo0o = new o00oOOo0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ArrayList<o0OO0oO0> f7014o00oOOo0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f7020o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f7021o00oOOoO = 0;

        public o00oOOo0() {
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            int i = this.f7021o00oOOoO + 1;
            this.f7021o00oOOoO = i;
            if (i == o00ooO.this.f7014o00oOOo0.size()) {
                o0O000oo.o0OO0oO o0oo0oo = o00ooO.this.f7019o00oOooO;
                if (o0oo0oo != null) {
                    o0oo0oo.o00oOOoO(null);
                }
                o00oOooO();
            }
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOo00(View view) {
            if (this.f7020o00oOOo0) {
                return;
            }
            this.f7020o00oOOo0 = true;
            o0O000oo.o0OO0oO o0oo0oo = o00ooO.this.f7019o00oOooO;
            if (o0oo0oo != null) {
                o0oo0oo.o00oOo00(null);
            }
        }

        public void o00oOooO() {
            this.f7021o00oOOoO = 0;
            this.f7020o00oOOo0 = false;
            o00ooO.this.o00oOOoO();
        }
    }

    public void o00oOOo0() {
        if (this.f7017o00oOo0O) {
            Iterator<o0OO0oO0> it = this.f7014o00oOOo0.iterator();
            while (it.hasNext()) {
                it.next().o00oOooO();
            }
            this.f7017o00oOo0O = false;
        }
    }

    public void o00oOOoO() {
        this.f7017o00oOo0O = false;
    }

    public o00ooO o00oOo00(o0OO0oO0 o0oo0oo0) {
        if (!this.f7017o00oOo0O) {
            this.f7014o00oOOo0.add(o0oo0oo0);
        }
        return this;
    }

    public o00ooO o00oOo0O(long j) {
        if (!this.f7017o00oOo0O) {
            this.f7015o00oOOoO = j;
        }
        return this;
    }

    public o00ooO o00oOo0o(Interpolator interpolator) {
        if (!this.f7017o00oOo0O) {
            this.f7016o00oOo00 = interpolator;
        }
        return this;
    }

    public void o00oOoO() {
        if (this.f7017o00oOo0O) {
            return;
        }
        Iterator<o0OO0oO0> it = this.f7014o00oOOo0.iterator();
        while (it.hasNext()) {
            o0OO0oO0 next = it.next();
            long j = this.f7015o00oOOoO;
            if (j >= 0) {
                next.o00oo0o0(j);
            }
            Interpolator interpolator = this.f7016o00oOo00;
            if (interpolator != null) {
                next.o00oo0o(interpolator);
            }
            if (this.f7019o00oOooO != null) {
                next.o00oo0oO(this.f7018o00oOo0o);
            }
            next.o00ooO0();
        }
        this.f7017o00oOo0O = true;
    }

    public o00ooO o00oOoO0(o0O000oo.o0OO0oO o0oo0oo) {
        if (!this.f7017o00oOo0O) {
            this.f7019o00oOooO = o0oo0oo;
        }
        return this;
    }

    public o00ooO o00oOooO(o0OO0oO0 o0oo0oo0, o0OO0oO0 o0oo0oo02) {
        this.f7014o00oOOo0.add(o0oo0oo0);
        o0oo0oo02.o00oo(o0oo0oo0.o00oOo0O());
        this.f7014o00oOOo0.add(o0oo0oo02);
        return this;
    }
}
