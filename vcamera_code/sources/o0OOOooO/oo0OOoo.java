package o0OOOooO;

import o0OO0o.o0OO00o0;
import o0OOOooO.o0O0o00O;
import org.jetbrains.annotations.NotNull;
@o0O0OOO0
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class oo0OOoo implements o0O0o00O.o00oOo00 {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final oo0OOoo f13974o00oOOoO = new oo0OOoo();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final long f13975o00oOo00 = System.nanoTime();

    @Override // o0OOOooO.o0O0o00O.o00oOo00, o0OOOooO.o0O0o00O
    public o0O0O0O o00oOOo0() {
        return new o0O0o00O.o00oOOoO.o00oOOo0(o00oOo0o());
    }

    public final long o00oOOoO(long j, long j2) {
        return o0O0OOO.o00oOo00(j, j2);
    }

    public final long o00oOo00(long j, long j2) {
        return o0O0OOO.o00oOoO0(j, j2);
    }

    public long o00oOo0O() {
        return o00oOo0o();
    }

    public final long o00oOo0o() {
        return System.nanoTime() - f13975o00oOo00;
    }

    public final long o00oOooO(long j) {
        return o0O0OOO.o00oOo0O(o00oOo0o(), j);
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // o0OOOooO.o0O0o00O
    public o0O0o00 o00oOOo0() {
        return new o0O0o00O.o00oOOoO.o00oOOo0(o00oOo0o());
    }
}
