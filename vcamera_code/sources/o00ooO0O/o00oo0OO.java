package o00ooO0O;

import java.util.HashMap;
import java.util.Iterator;
import o00ooO.o00oo0O;
import o00ooO0o.o0;
import o00ooO0o.o00oo0O0;
import o00ooO0o.o00ooO;
import o00ooO0o.o00ooO0;
import o00ooO0o.o0O0o;
/* loaded from: classes.dex */
public class o00oo0OO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f8763o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f8764o00oOo0o = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f8765o00oOoO = 2;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f8766o00oOoO0 = 1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final Integer f8767o00oOoOO = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashMap<Object, o00oo0> f8768o00oOOo0 = new HashMap<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public HashMap<Object, o00oo00O> f8769o00oOOoO = new HashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00ooO0O.o00oOo0O f8770o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8771o00oOooO;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8772o00oOOo0;

        static {
            int[] iArr = new int[o00oOoO.values().length];
            f8772o00oOOo0 = iArr;
            try {
                iArr[o00oOoO.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8772o00oOOo0[o00oOoO.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8772o00oOOo0[o00oOoO.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8772o00oOOo0[o00oOoO.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8772o00oOOo0[o00oOoO.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* loaded from: classes.dex */
    public enum o00oOo00 {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    /* loaded from: classes.dex */
    public enum o00oOo0O {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* loaded from: classes.dex */
    public enum o00oOoO {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public o00oo0OO() {
        o00ooO0O.o00oOo0O o00ooo0o2 = new o00ooO0O.o00oOo0O(this);
        this.f8770o00oOo00 = o00ooo0o2;
        this.f8771o00oOooO = 0;
        this.f8768o00oOOo0.put(f8767o00oOoOO, o00ooo0o2);
    }

    public void o00oOOo0(o00ooO.o00oo00O o00oo00o) {
        o00oo00o.o0OO00Oo();
        this.f8770o00oOo00.o00ooO0o().o00oOoOO(this, o00oo00o, 0);
        this.f8770o00oOo00.o0O0o().o00oOoOO(this, o00oo00o, 1);
        for (Object obj : this.f8769o00oOOoO.keySet()) {
            o00oo0O o00oOo002 = this.f8769o00oOOoO.get(obj).o00oOo00();
            if (o00oOo002 != null) {
                o00oo0 o00oo0Var = this.f8768o00oOOo0.get(obj);
                if (o00oo0Var == null) {
                    o00oo0Var = o00oOo0O(obj);
                }
                o00oo0Var.o00oOOoO(o00oOo002);
            }
        }
        for (Object obj2 : this.f8768o00oOOo0.keySet()) {
            o00oo0 o00oo0Var2 = this.f8768o00oOOo0.get(obj2);
            if (o00oo0Var2 != this.f8770o00oOo00) {
                o00ooO.o00oOoO o00oOOo02 = o00oo0Var2.o00oOOo0();
                o00oOOo02.o0O0oo00(null);
                if (o00oo0Var2 instanceof o00ooO0) {
                    o00oo0Var2.apply();
                }
                o00oo00o.o00oOOo0(o00oOOo02);
            } else {
                o00oo0Var2.o00oOOoO(o00oo00o);
            }
        }
        for (Object obj3 : this.f8769o00oOOoO.keySet()) {
            o00oo00O o00oo00o2 = this.f8769o00oOOoO.get(obj3);
            if (o00oo00o2.o00oOo00() != null) {
                Iterator<Object> it = o00oo00o2.f8761o00oOo00.iterator();
                while (it.hasNext()) {
                    o00oo00o2.o00oOo00().o00oOOo0(this.f8768o00oOOo0.get(it.next()).o00oOOo0());
                }
                o00oo00o2.o00oOOoO();
            }
        }
        for (Object obj4 : this.f8768o00oOOo0.keySet()) {
            this.f8768o00oOOo0.get(obj4).apply();
        }
    }

    public o0O0o o00oOOoO(Object obj, o00oOo0O o00ooo0o2) {
        o0O0o o0o0o = (o0O0o) o00oOooo(obj, o00oOoO.BARRIER);
        o0o0o.o00oOoO(o00ooo0o2);
        return o0o0o;
    }

    public o00oo0O0 o00oOo00(Object... objArr) {
        o00oo0O0 o00oo0o02 = (o00oo0O0) o00oOooo(null, o00oOoO.ALIGN_HORIZONTALLY);
        o00oo0o02.o00oOOo0(objArr);
        return o00oo0o02;
    }

    public o00ooO0O.o00oOo0O o00oOo0O(Object obj) {
        o00oo0 o00oo0Var = this.f8768o00oOOo0.get(obj);
        if (o00oo0Var == null) {
            o00oo0Var = o00oOoO0(obj);
            this.f8768o00oOOo0.put(obj, o00oo0Var);
            o00oo0Var.o00oOo00(obj);
        }
        if (o00oo0Var instanceof o00ooO0O.o00oOo0O) {
            return (o00ooO0O.o00oOo0O) o00oo0Var;
        }
        return null;
    }

    public int o00oOo0o(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public final String o00oOoO() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("__HELPER_KEY_");
        int i = this.f8771o00oOooO;
        this.f8771o00oOooO = i + 1;
        return android.support.v4.media.o00oOo00.o00oOOo0(o00oOOo02, i, "__");
    }

    public o00ooO0O.o00oOo0O o00oOoO0(Object obj) {
        return new o00ooO0O.o00oOo0O(this);
    }

    public void o00oOoOO() {
        for (Object obj : this.f8768o00oOOo0.keySet()) {
            o00oOo0O(obj).o00oooOo(obj);
        }
    }

    public o00ooO0 o00oOoOo(Object obj, int i) {
        o00oo0 o00oo0Var = this.f8768o00oOOo0.get(obj);
        o00ooO0 o00ooo02 = o00oo0Var;
        if (o00oo0Var == null) {
            o00ooO0 o00ooo03 = new o00ooO0(this);
            o00ooo03.f8796o00oOOoO = i;
            o00ooo03.f8800o00oOoO0 = obj;
            this.f8768o00oOOo0.put(obj, o00ooo03);
            o00ooo02 = o00ooo03;
        }
        return (o00ooO0) o00ooo02;
    }

    public o00oo0OO o00oOoo0(o00ooO0O.o00oOoO o00oooo2) {
        return o00oo0Oo(o00oooo2);
    }

    public o00ooO0o.o00oo0O o00oOooO(Object... objArr) {
        o00ooO0o.o00oo0O o00oo0o2 = (o00ooO0o.o00oo0O) o00oOooo(null, o00oOoO.ALIGN_VERTICALLY);
        o00oo0o2.o00oOOo0(objArr);
        return o00oo0o2;
    }

    public o00oo00O o00oOooo(Object obj, o00oOoO o00oooo2) {
        o00oo00O o00ooo;
        if (obj == null) {
            obj = o00oOoO();
        }
        o00oo00O o00oo00o = this.f8769o00oOOoO.get(obj);
        if (o00oo00o == null) {
            int i = o00oOOo0.f8772o00oOOo0[o00oooo2.ordinal()];
            if (i == 1) {
                o00ooo = new o00ooO(this);
            } else if (i == 2) {
                o00ooo = new o0(this);
            } else if (i == 3) {
                o00ooo = new o00oo0O0(this);
            } else if (i == 4) {
                o00ooo = new o00ooO0o.o00oo0O(this);
            } else if (i != 5) {
                o00oo00o = new o00oo00O(this, o00oooo2);
                this.f8769o00oOOoO.put(obj, o00oo00o);
            } else {
                o00ooo = new o0O0o(this);
            }
            o00oo00o = o00ooo;
            this.f8769o00oOOoO.put(obj, o00oo00o);
        }
        return o00oo00o;
    }

    public o00ooO0 o00oo0(Object obj) {
        return o00oOoOo(obj, 0);
    }

    public o00ooO o00oo00O(Object... objArr) {
        o00ooO o00ooo = (o00ooO) o00oOooo(null, o00oOoO.HORIZONTAL_CHAIN);
        o00ooo.o00oOOo0(objArr);
        return o00ooo;
    }

    public void o00oo0O() {
        this.f8769o00oOOoO.clear();
    }

    public o00oo0 o00oo0O0(Object obj) {
        return this.f8768o00oOOo0.get(obj);
    }

    public void o00oo0OO(Object obj, Object obj2) {
        o00oOo0O(obj).o00oooOo(obj2);
    }

    public o00oo0OO o00oo0Oo(o00ooO0O.o00oOoO o00oooo2) {
        this.f8770o00oOo00.o00ooo0o(o00oooo2);
        return this;
    }

    public o0 o00oo0o(Object... objArr) {
        o0 o0Var = (o0) o00oOooo(null, o00oOoO.VERTICAL_CHAIN);
        o0Var.o00oOOo0(objArr);
        return o0Var;
    }

    public o00oo0OO o00oo0o0(o00ooO0O.o00oOoO o00oooo2) {
        this.f8770o00oOo00.o00oooo0(o00oooo2);
        return this;
    }

    public o00ooO0 o00oo0oO(Object obj) {
        return o00oOoOo(obj, 1);
    }

    public o00oo0OO o0O0o(o00ooO0O.o00oOoO o00oooo2) {
        return o00oo0o0(o00oooo2);
    }
}
