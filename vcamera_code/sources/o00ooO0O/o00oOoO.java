package o00ooO0O;

import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final Object f8746o00oOoOO = new Object();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Object f8747o00oOoOo = new Object();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final Object f8748o00oOoo0 = new Object();

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Object f8749o00oOooo = new Object();

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final Object f8750o00oo00O = new Object();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f8751o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8752o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f8753o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8754o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f8755o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f8756o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Object f8757o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f8758o00oOooO;

    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public o00oOoO() {
        this.f8751o00oOOo0 = -2;
        this.f8752o00oOOoO = 0;
        this.f8753o00oOo00 = Integer.MAX_VALUE;
        this.f8758o00oOooO = 1.0f;
        this.f8754o00oOo0O = 0;
        this.f8755o00oOo0o = 1.0f;
        this.f8757o00oOoO0 = f8747o00oOoOo;
        this.f8756o00oOoO = false;
    }

    public o00oOoO(Object obj) {
        this.f8751o00oOOo0 = -2;
        this.f8752o00oOOoO = 0;
        this.f8753o00oOo00 = Integer.MAX_VALUE;
        this.f8758o00oOooO = 1.0f;
        this.f8754o00oOo0O = 0;
        this.f8755o00oOo0o = 1.0f;
        this.f8756o00oOoO = false;
        this.f8757o00oOoO0 = obj;
    }

    public static o00oOoO o00oOOo0(int i) {
        o00oOoO o00oooo2 = new o00oOoO(f8746o00oOoOO);
        o00oooo2.o00oOoOo(i);
        return o00oooo2;
    }

    public static o00oOoO o00oOOoO(Object obj) {
        o00oOoO o00oooo2 = new o00oOoO(f8746o00oOoOO);
        o00oooo2.o00oOoo0(obj);
        return o00oooo2;
    }

    public static o00oOoO o00oOo00() {
        return new o00oOoO(f8749o00oOooo);
    }

    public static o00oOoO o00oOo0O() {
        return new o00oOoO(f8748o00oOoo0);
    }

    public static o00oOoO o00oOo0o(int i) {
        o00oOoO o00oooo2 = new o00oOoO();
        o00oooo2.f8756o00oOoO = true;
        return o00oooo2;
    }

    public static o00oOoO o00oOoO() {
        return new o00oOoO(f8747o00oOoOo);
    }

    public static o00oOoO o00oOoO0(Object obj) {
        o00oOoO o00oooo2 = new o00oOoO();
        o00oooo2.o00oo(obj);
        return o00oooo2;
    }

    public static o00oOoO o00oOooO(Object obj, float f) {
        o00oOoO o00oooo2 = new o00oOoO(f8750o00oo00O);
        o00oooo2.f8758o00oOooO = f;
        return o00oooo2;
    }

    public void o00oOoOO(o00oo0OO o00oo0oo, o00ooO.o00oOoO o00oooo2, int i) {
        o00oOoO.o00oOOoO o00ooooo2;
        o00oOoO.o00oOOoO o00ooooo3;
        int i2 = 2;
        if (i == 0) {
            if (this.f8756o00oOoO) {
                o00oooo2.o0O0o0OO(o00oOoO.o00oOOoO.MATCH_CONSTRAINT);
                Object obj = this.f8757o00oOoO0;
                if (obj == f8747o00oOoOo) {
                    i2 = 1;
                } else if (obj != f8750o00oo00O) {
                    i2 = 0;
                }
                o00oooo2.o0O0o0Oo(i2, this.f8752o00oOOoO, this.f8753o00oOo00, this.f8758o00oOooO);
                return;
            }
            int i3 = this.f8752o00oOOoO;
            if (i3 > 0) {
                o00oooo2.o0O0oO(i3);
            }
            int i4 = this.f8753o00oOo00;
            if (i4 < Integer.MAX_VALUE) {
                o00oooo2.o0O0oO0(i4);
            }
            Object obj2 = this.f8757o00oOoO0;
            if (obj2 == f8747o00oOoOo) {
                o00ooooo3 = o00oOoO.o00oOOoO.WRAP_CONTENT;
            } else if (obj2 != f8749o00oOooo) {
                if (obj2 == null) {
                    o00oooo2.o0O0o0OO(o00oOoO.o00oOOoO.FIXED);
                    o00oooo2.o0O0ooOO(this.f8754o00oOo0O);
                    return;
                }
                return;
            } else {
                o00ooooo3 = o00oOoO.o00oOOoO.MATCH_PARENT;
            }
            o00oooo2.o0O0o0OO(o00ooooo3);
        } else if (this.f8756o00oOoO) {
            o00oooo2.o0O0oOoo(o00oOoO.o00oOOoO.MATCH_CONSTRAINT);
            Object obj3 = this.f8757o00oOoO0;
            if (obj3 == f8747o00oOoOo) {
                i2 = 1;
            } else if (obj3 != f8750o00oo00O) {
                i2 = 0;
            }
            o00oooo2.o0O0oo0(i2, this.f8752o00oOOoO, this.f8753o00oOo00, this.f8758o00oOooO);
        } else {
            int i5 = this.f8752o00oOOoO;
            if (i5 > 0) {
                o00oooo2.o0O0oO0o(i5);
            }
            int i6 = this.f8753o00oOo00;
            if (i6 < Integer.MAX_VALUE) {
                o00oooo2.oooOO0(i6);
            }
            Object obj4 = this.f8757o00oOoO0;
            if (obj4 == f8747o00oOoOo) {
                o00ooooo2 = o00oOoO.o00oOOoO.WRAP_CONTENT;
            } else if (obj4 != f8749o00oOooo) {
                if (obj4 == null) {
                    o00oooo2.o0O0oOoo(o00oOoO.o00oOOoO.FIXED);
                    o00oooo2.o0O0o00(this.f8754o00oOo0O);
                    return;
                }
                return;
            } else {
                o00ooooo2 = o00oOoO.o00oOOoO.MATCH_PARENT;
            }
            o00oooo2.o0O0oOoo(o00ooooo2);
        }
    }

    public o00oOoO o00oOoOo(int i) {
        this.f8757o00oOoO0 = null;
        this.f8754o00oOo0O = i;
        return this;
    }

    public o00oOoO o00oOoo0(Object obj) {
        this.f8757o00oOoO0 = obj;
        if (obj instanceof Integer) {
            this.f8754o00oOo0O = ((Integer) obj).intValue();
            this.f8757o00oOoO0 = null;
        }
        return this;
    }

    public float o00oOooo() {
        return this.f8755o00oOo0o;
    }

    public o00oOoO o00oo(Object obj) {
        this.f8757o00oOoO0 = obj;
        this.f8756o00oOoO = true;
        return this;
    }

    public o00oOoO o00oo0(int i) {
        if (this.f8753o00oOo00 >= 0) {
            this.f8753o00oOo00 = i;
        }
        return this;
    }

    public int o00oo00O() {
        return this.f8754o00oOo0O;
    }

    public o00oOoO o00oo0O(Object obj) {
        if (obj == f8747o00oOoOo) {
            this.f8752o00oOOoO = -2;
        }
        return this;
    }

    public o00oOoO o00oo0O0(int i) {
        if (i >= 0) {
            this.f8752o00oOOoO = i;
        }
        return this;
    }

    public o00oOoO o00oo0OO(Object obj) {
        Object obj2 = f8747o00oOoOo;
        if (obj == obj2 && this.f8756o00oOoO) {
            this.f8757o00oOoO0 = obj2;
            this.f8753o00oOo00 = Integer.MAX_VALUE;
        }
        return this;
    }

    public o00oOoO o00oo0Oo(Object obj, float f) {
        this.f8758o00oOooO = f;
        return this;
    }

    public void o00oo0o(float f) {
        this.f8755o00oOo0o = f;
    }

    public o00oOoO o00oo0o0(float f) {
        return this;
    }

    public void o00oo0oO(int i) {
        this.f8756o00oOoO = false;
        this.f8757o00oOoO0 = null;
        this.f8754o00oOo0O = i;
    }

    public o00oOoO o0O0o(int i) {
        this.f8756o00oOoO = true;
        return this;
    }
}
