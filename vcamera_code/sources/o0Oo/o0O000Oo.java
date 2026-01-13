package o0Oo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class o0O000Oo extends o0O0O0o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O0O0o0 f15457o00oOo0O;

    public o0O000Oo(o0O0O0o0 o0o0o0o0) {
        if (o0o0o0o0 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15457o00oOo0O = o0o0o0o0;
    }

    @Override // o0Oo.o0O0O0o0
    public o0O0O0o0 o00oOOo0() {
        return this.f15457o00oOo0O.o00oOOo0();
    }

    @Override // o0Oo.o0O0O0o0
    public o0O0O0o0 o00oOOoO() {
        return this.f15457o00oOo0O.o00oOOoO();
    }

    @Override // o0Oo.o0O0O0o0
    public o0O0O0o0 o00oOo0O(long j) {
        return this.f15457o00oOo0O.o00oOo0O(j);
    }

    @Override // o0Oo.o0O0O0o0
    public boolean o00oOo0o() {
        return this.f15457o00oOo0O.o00oOo0o();
    }

    @Override // o0Oo.o0O0O0o0
    public o0O0O0o0 o00oOoO(long j, TimeUnit timeUnit) {
        return this.f15457o00oOo0O.o00oOoO(j, timeUnit);
    }

    @Override // o0Oo.o0O0O0o0
    public void o00oOoO0() throws IOException {
        this.f15457o00oOo0O.o00oOoO0();
    }

    @Override // o0Oo.o0O0O0o0
    public long o00oOoOO() {
        return this.f15457o00oOo0O.o00oOoOO();
    }

    public final o0O0O0o0 o00oOoo0() {
        return this.f15457o00oOo0O;
    }

    @Override // o0Oo.o0O0O0o0
    public long o00oOooO() {
        return this.f15457o00oOo0O.o00oOooO();
    }

    public final o0O000Oo o00oOooo(o0O0O0o0 o0o0o0o0) {
        if (o0o0o0o0 != null) {
            this.f15457o00oOo0O = o0o0o0o0;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
