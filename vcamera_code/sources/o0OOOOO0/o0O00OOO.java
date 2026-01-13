package o0OOOOO0;

import java.io.Serializable;
@o0OO0o.o0OO00o0(version = "1.7")
/* loaded from: classes3.dex */
public class o0O00OOO extends o0O0O0O implements Serializable {
    private final Class funInterface;

    public o0O00OOO(Class cls) {
        super(1);
        this.funInterface = cls;
    }

    @Override // o0OOOOO0.o0O0O0O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00OOO) {
            return this.funInterface.equals(((o0O00OOO) obj).funInterface);
        }
        return false;
    }

    @Override // o0OOOOO0.o0O0O0O, o0OOOOO0.o0O0000O
    public o0OOOo.o0O0O0O getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // o0OOOOO0.o0O0O0O
    public int hashCode() {
        return this.funInterface.hashCode();
    }

    @Override // o0OOOOO0.o0O0O0O
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("fun interface ");
        o00oOOo02.append(this.funInterface.getName());
        return o00oOOo02.toString();
    }
}
