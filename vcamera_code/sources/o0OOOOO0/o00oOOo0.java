package o0OOOOO0;

import java.io.Serializable;
@o0OO0o.o0OO00o0(version = "1.4")
/* loaded from: classes3.dex */
public class o00oOOo0 implements o0O00o00, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    public o00oOOo0(int i, Class cls, String str, String str2, int i2) {
        this(i, o0O0000O.NO_RECEIVER, cls, str, str2, i2);
    }

    public o00oOOo0(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oOOo0) {
            o00oOOo0 o00oooo02 = (o00oOOo0) obj;
            return this.isTopLevel == o00oooo02.isTopLevel && this.arity == o00oooo02.arity && this.flags == o00oooo02.flags && o0ooO.o00oOoO0(this.receiver, o00oooo02.receiver) && o0ooO.o00oOoO0(this.owner, o00oooo02.owner) && this.name.equals(o00oooo02.name) && this.signature.equals(o00oooo02.signature);
        }
        return false;
    }

    @Override // o0OOOOO0.o0O00o00
    public int getArity() {
        return this.arity;
    }

    public o0OOOo.o0O00oO0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? o0OOooO0.o00oOoO0(cls) : o0OOooO0.o00oOooO(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((o0O0OOOo.o00oo0O0.o00oOOo0(this.signature, o0O0OOOo.o00oo0O0.o00oOOo0(this.name, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return o0OOooO0.o00oo(this);
    }
}
