package o0OO0o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0OO0oO<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public o0OO0oO(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0OO0oO copy$default(o0OO0oO o0oo0oo, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = o0oo0oo.first;
        }
        if ((i & 2) != 0) {
            obj2 = o0oo0oo.second;
        }
        if ((i & 4) != 0) {
            obj3 = o0oo0oo.third;
        }
        return o0oo0oo.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @NotNull
    public final o0OO0oO<A, B, C> copy(A a, B b, C c) {
        return new o0OO0oO<>(a, b, c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OO0oO) {
            o0OO0oO o0oo0oo = (o0OO0oO) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.first, o0oo0oo.first) && o0OOOOO0.o0ooO.o00oOoO0(this.second, o0oo0oo.second) && o0OOOOO0.o0ooO.o00oOoO0(this.third, o0oo0oo.third);
        }
        return false;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
