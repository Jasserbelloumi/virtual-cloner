package o0OOO0;

import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00o00;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o0O0o extends o00oo0O implements o0O00o00<Object>, o00ooO {
    private final int arity;

    public o0O0o(int i) {
        this(i, null);
    }

    public o0O0o(int i, @Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
        super(o00ooo0o2);
        this.arity = i;
    }

    @Override // o0OOOOO0.o0O00o00
    public int getArity() {
        return this.arity;
    }

    @Override // o0OOO0.o00oOOo0
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            String o00oo2 = o0OOooO0.o00oo(this);
            o0ooO.o00oo0OO(o00oo2, "renderLambdaToString(this)");
            return o00oo2;
        }
        return super.toString();
    }
}
