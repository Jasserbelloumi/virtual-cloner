package o0OOo00O;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lo0OOo00O/oO00OO;", "Lo0OOo00O/o0O0o000;", "", "toString", "", "parallelism", "o0O0oOoo", "o0O0ooO0", "o0O0oo", "()Lo0OOo00O/oO00OO;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oO00OO extends o0O0o000 {
    @Override // o0OOo00O.o0O0o000
    @NotNull
    public o0O0o000 o0O0oOoo(int i) {
        o0OOo0o0.o0OO0oO.o00oOOo0(i);
        return this;
    }

    @NotNull
    public abstract oO00OO o0O0oo();

    @oO0o0o
    @Nullable
    public final String o0O0ooO0() {
        oO00OO oo00oo;
        oO00OO o00oOo0O2 = o0OOO00.o00oOo0O();
        if (this == o00oOo0O2) {
            return "Dispatchers.Main";
        }
        try {
            oo00oo = o00oOo0O2.o0O0oo();
        } catch (UnsupportedOperationException unused) {
            oo00oo = null;
        }
        if (this == oo00oo) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        String o0O0ooO02 = o0O0ooO0();
        if (o0O0ooO02 == null) {
            return oo0ooO.o00oOOo0(this) + '@' + oo0ooO.o00oOOoO(this);
        }
        return o0O0ooO02;
    }
}
