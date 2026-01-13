package o0Oo0o00;

import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.util.List;
import o0Oo0Oo0.o0O0O0Oo;
import o0Oo0Oo0.o0O0o0;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.o0OOOO0o;
import o0Oo0Ooo.oO0Oo;
/* loaded from: classes3.dex */
public final class o0O0o implements o0O0o0.o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<o0O0o0> f16357o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO0Oo f16358o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo0 f16359o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f16360o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o0OO000o f16361o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f16362o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OOOO0o f16363o00oOooO;

    public o0O0o(List<o0O0o0> list, oO0Oo oo0oo, o00oo0 o00oo0Var, o0OOOO0o o0oooo0o, int i, o0OO000o o0oo000o) {
        this.f16357o00oOOo0 = list;
        this.f16363o00oOooO = o0oooo0o;
        this.f16358o00oOOoO = oo0oo;
        this.f16359o00oOo00 = o00oo0Var;
        this.f16360o00oOo0O = i;
        this.f16361o00oOo0o = o0oo000o;
    }

    @Override // o0Oo0Oo0.o0O0o0.o00oOOo0
    public o0OO000o o00oOOo0() {
        return this.f16361o00oOo0o;
    }

    @Override // o0Oo0Oo0.o0O0o0.o00oOOo0
    public o0O0O0Oo o00oOOoO() {
        return this.f16363o00oOooO;
    }

    @Override // o0Oo0Oo0.o0O0o0.o00oOOo0
    public oo0ooO o00oOo00(o0OO000o o0oo000o) throws IOException {
        return o00oOo0O(o0oo000o, this.f16358o00oOOoO, this.f16359o00oOo00, this.f16363o00oOooO);
    }

    public oo0ooO o00oOo0O(o0OO000o o0oo000o, oO0Oo oo0oo, o00oo0 o00oo0Var, o0OOOO0o o0oooo0o) throws IOException {
        if (this.f16360o00oOo0O < this.f16357o00oOOo0.size()) {
            this.f16362o00oOoO0++;
            if (this.f16359o00oOo00 != null && !this.f16363o00oOooO.o00oo0o(o0oo000o.f16086o00oOOo0)) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("network interceptor ");
                o00oOOo02.append(this.f16357o00oOOo0.get(this.f16360o00oOo0O - 1));
                o00oOOo02.append(" must retain the same host and port");
                throw new IllegalStateException(o00oOOo02.toString());
            } else if (this.f16359o00oOo00 != null && this.f16362o00oOoO0 > 1) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("network interceptor ");
                o00oOOo03.append(this.f16357o00oOOo0.get(this.f16360o00oOo0O - 1));
                o00oOOo03.append(" must call proceed() exactly once");
                throw new IllegalStateException(o00oOOo03.toString());
            } else {
                o0O0o o0o0o = new o0O0o(this.f16357o00oOOo0, oo0oo, o00oo0Var, o0oooo0o, this.f16360o00oOo0O + 1, o0oo000o);
                o0O0o0 o0o0o0 = this.f16357o00oOOo0.get(this.f16360o00oOo0O);
                oo0ooO o00oOOo04 = o0o0o0.o00oOOo0(o0o0o);
                if (o00oo0Var != null && this.f16360o00oOo0O + 1 < this.f16357o00oOOo0.size() && o0o0o.f16362o00oOoO0 != 1) {
                    throw new IllegalStateException("network interceptor " + o0o0o0 + " must call proceed() exactly once");
                } else if (o00oOOo04 != null) {
                    return o00oOOo04;
                } else {
                    throw new NullPointerException("interceptor " + o0o0o0 + " returned null");
                }
            }
        }
        throw new AssertionError();
    }

    public oO0Oo o00oOo0o() {
        return this.f16358o00oOOoO;
    }

    public o00oo0 o00oOooO() {
        return this.f16359o00oOo00;
    }
}
