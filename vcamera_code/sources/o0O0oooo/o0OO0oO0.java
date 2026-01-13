package o0O0oooo;

import o0OO000o.o00oOoO;
import o0OO000o.o00oo00O;
/* loaded from: classes2.dex */
public class o0OO0oO0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12914o00oOOoO = "o0OO0oO0";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f12915o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static o00oo00O<o0OO0oO0> f12916o00oOo0O = new o00oOOo0();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12917o00oOooO = "com.core.Cmd";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOoO.o00oOOoO f12918o00oOOo0;

    /* loaded from: classes2.dex */
    public class o00oOOo0 extends o00oo00O<o0OO0oO0> {
        @Override // o0OO000o.o00oo00O
        /* renamed from: o00oOo00 */
        public o0OO0oO0 o00oOOo0() {
            return new o0OO0oO0();
        }
    }

    public o0OO0oO0() {
        Class<?> cls;
        try {
            cls = Class.forName(f12917o00oOooO);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                cls = o0OOO00.f12922o00oOooO.loadClass(f12917o00oOooO);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        this.f12918o00oOOo0 = new o00oOoO.o00oOOoO((Class) cls, true, "exec", new Class[]{Integer.TYPE, Object[].class});
    }

    public /* synthetic */ o0OO0oO0(o00oOOo0 o00oooo02) {
        this();
    }

    public static o0OO0oO0 o00oOOo0() {
        return f12916o00oOo0O.o00oOOoO();
    }

    public Object o00oOOoO(int i, Object... objArr) {
        return this.f12918o00oOOo0.o00oOOo0(null, Integer.valueOf(i), objArr);
    }
}
