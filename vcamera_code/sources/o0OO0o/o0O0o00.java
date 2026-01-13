package o0OO0o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0O0o00<A, B> implements Serializable {
    private final A first;
    private final B second;

    public o0O0o00(A a, B b) {
        this.first = a;
        this.second = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0O0o00 copy$default(o0O0o00 o0o0o00, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = o0o0o00.first;
        }
        if ((i & 2) != 0) {
            obj2 = o0o0o00.second;
        }
        return o0o0o00.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    @NotNull
    public final o0O0o00<A, B> copy(A a, B b) {
        return new o0O0o00<>(a, b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0o00) {
            o0O0o00 o0o0o00 = (o0O0o00) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.first, o0o0o00.first) && o0OOOOO0.o0ooO.o00oOoO0(this.second, o0o0o00.second);
        }
        return false;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
