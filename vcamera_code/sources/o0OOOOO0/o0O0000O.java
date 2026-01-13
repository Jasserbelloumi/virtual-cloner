package o0OOOOO0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class o0O0000O implements o0OOOo.o0O00O, Serializable {
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final Object NO_RECEIVER = o00oOOo0.INSTANCE;
    @o0OO0o.o0OO00o0(version = "1.4")
    private final boolean isTopLevel;
    @o0OO0o.o0OO00o0(version = "1.4")
    private final String name;
    @o0OO0o.o0OO00o0(version = "1.4")
    private final Class owner;
    @o0OO0o.o0OO00o0(version = "1.1")
    public final Object receiver;
    private transient o0OOOo.o0O00O reflected;
    @o0OO0o.o0OO00o0(version = "1.4")
    private final String signature;

    @o0OO0o.o0OO00o0(version = "1.2")
    /* loaded from: classes3.dex */
    public static class o00oOOo0 implements Serializable {
        private static final o00oOOo0 INSTANCE = new o00oOOo0();

        private o00oOOo0() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public o0O0000O() {
        this(NO_RECEIVER);
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0O0000O(Object obj) {
        this(obj, null, null, null, false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public o0O0000O(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // o0OOOo.o0O00O
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o0OOOo.o0O00O
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O00O compute() {
        o0OOOo.o0O00O o0o00o = this.reflected;
        if (o0o00o == null) {
            o0OOOo.o0O00O computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return o0o00o;
    }

    public abstract o0OOOo.o0O00O computeReflected();

    @Override // o0OOOo.o0O00O0o
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // o0OOOo.o0O00O
    public String getName() {
        return this.name;
    }

    public o0OOOo.o0O00oO0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? o0OOooO0.o00oOoO0(cls) : o0OOooO0.o00oOooO(cls);
    }

    @Override // o0OOOo.o0O00O
    public List<o0OOOo.o0ooO> getParameters() {
        return getReflected().getParameters();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O00O getReflected() {
        o0OOOo.o0O00O compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new o0OOOO0o.o0O0000O();
    }

    @Override // o0OOOo.o0O00O
    public o0OOOo.o0O0OOOo getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public List<o0OOOo.o0OooO0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public o0OOOo.o0O0o00 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // o0OOOo.o0O00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
