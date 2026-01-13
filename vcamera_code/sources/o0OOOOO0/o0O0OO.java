package o0OOOOO0;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O0OO<R> implements o0O00o00<R>, Serializable {
    private final int arity;

    public o0O0OO(int i) {
        this.arity = i;
    }

    @Override // o0OOOOO0.o0O00o00
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String o00ooO002 = o0OOooO0.o00ooO00(this);
        o0ooO.o00oo0OO(o00ooO002, "renderLambdaToString(this)");
        return o00ooO002;
    }
}
