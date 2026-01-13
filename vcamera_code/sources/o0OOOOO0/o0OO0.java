package o0OOOOO0;
/* loaded from: classes3.dex */
public abstract class o0OO0 extends o0O0000O implements o0OOOo.o0O0OO0 {
    private final boolean syntheticJavaProperty;

    public o0OO0() {
        this.syntheticJavaProperty = false;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OO0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0OO0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // o0OOOOO0.o0O0000O
    public o0OOOo.o0O00O compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0OO0) {
            o0OO0 o0oo0 = (o0OO0) obj;
            return getOwner().equals(o0oo0.getOwner()) && getName().equals(o0oo0.getName()) && getSignature().equals(o0oo0.getSignature()) && o0ooO.o00oOoO0(getBoundReceiver(), o0oo0.getBoundReceiver());
        } else if (obj instanceof o0OOOo.o0O0OO0) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // o0OOOOO0.o0O0000O
    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O0OO0 getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (o0OOOo.o0O0OO0) super.getReflected();
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // o0OOOo.o0O0OO0
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // o0OOOo.o0O0OO0
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        o0OOOo.o0O00O compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("property ");
        o00oOOo02.append(getName());
        o00oOOo02.append(o0OOooO0.f13633o00oOOoO);
        return o00oOOo02.toString();
    }
}
