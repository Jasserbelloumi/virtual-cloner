package o0OOOOO0;
/* loaded from: classes3.dex */
public class o0O0O0O extends o0O0000O implements o0O00o00, o0OOOo.o0O0O0O {
    private final int arity;
    @o0OO0o.o0OO00o0(version = "1.4")
    private final int flags;

    public o0O0O0O(int i) {
        this(i, o0O0000O.NO_RECEIVER, null, null, null, 0);
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0O0O0O(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0O0O(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // o0OOOOO0.o0O0000O
    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O00O computeReflected() {
        return o0OOooO0.o00oOo00(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0O0O) {
            o0O0O0O o0o0o0o = (o0O0O0O) obj;
            return getName().equals(o0o0o0o.getName()) && getSignature().equals(o0o0o0o.getSignature()) && this.flags == o0o0o0o.flags && this.arity == o0o0o0o.arity && o0ooO.o00oOoO0(getBoundReceiver(), o0o0o0o.getBoundReceiver()) && o0ooO.o00oOoO0(getOwner(), o0o0o0o.getOwner());
        } else if (obj instanceof o0OOOo.o0O0O0O) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // o0OOOOO0.o0O00o00
    public int getArity() {
        return this.arity;
    }

    @Override // o0OOOOO0.o0O0000O
    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O0O0O getReflected() {
        return (o0OOOo.o0O0O0O) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // o0OOOo.o0O0O0O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o0OOOo.o0O0O0O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // o0OOOo.o0O0O0O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o0OOOo.o0O0O0O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // o0OOOOO0.o0O0000O, o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        o0OOOo.o0O00O compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("function ");
        o00oOOo02.append(getName());
        o00oOOo02.append(o0OOooO0.f13633o00oOOoO);
        return o00oOOo02.toString();
    }
}
