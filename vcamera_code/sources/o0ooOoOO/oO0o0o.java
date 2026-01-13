package o0ooOoOO;

import android.support.v4.media.o00oOo0O;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public class oO0o0o<F, S> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final F f17227o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final S f17228o00oOOoO;

    public oO0o0o(F f, S s) {
        this.f17227o00oOOo0 = f;
        this.f17228o00oOOoO = s;
    }

    @oo0oO0
    public static <A, B> oO0o0o<A, B> o00oOOo0(A a, B b) {
        return new oO0o0o<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof oO0o0o) {
            oO0o0o oo0o0o = (oO0o0o) obj;
            return oO0Ooooo.o00oOOo0.o00oOOo0(oo0o0o.f17227o00oOOo0, this.f17227o00oOOo0) && oO0Ooooo.o00oOOo0.o00oOOo0(oo0o0o.f17228o00oOOoO, this.f17228o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f17227o00oOOo0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f17228o00oOOoO;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Pair{");
        o00oOOo02.append(this.f17227o00oOOo0);
        o00oOOo02.append(" ");
        o00oOOo02.append(this.f17228o00oOOoO);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
