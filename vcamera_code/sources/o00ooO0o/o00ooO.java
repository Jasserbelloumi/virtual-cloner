package o00ooO0o;

import java.util.Iterator;
import o00ooO0O.o00oOo0O;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o00ooO extends o00oo {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public Object f8790o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Object f8791o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public Object f8792o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public Object f8793o00oOoOo;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8794o00oOOo0;

        static {
            int[] iArr = new int[o00oo0OO.o00oOOoO.values().length];
            f8794o00oOOo0 = iArr;
            try {
                iArr[o00oo0OO.o00oOOoO.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8794o00oOOo0[o00oo0OO.o00oOOoO.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8794o00oOOo0[o00oo0OO.o00oOOoO.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o00ooO(o00oo0OO o00oo0oo) {
        super(o00oo0oo, o00oo0OO.o00oOoO.HORIZONTAL_CHAIN);
    }

    @Override // o00ooO0O.o00oo00O
    public void o00oOOoO() {
        Iterator<Object> it = this.f8761o00oOo00.iterator();
        while (it.hasNext()) {
            this.f8759o00oOOo0.o00oOo0O(it.next()).o00oo0();
        }
        Iterator<Object> it2 = this.f8761o00oOo00.iterator();
        o00oOo0O o00ooo0o2 = null;
        o00oOo0O o00ooo0o3 = null;
        while (it2.hasNext()) {
            o00oOo0O o00oOo0O2 = this.f8759o00oOOo0.o00oOo0O(it2.next());
            if (o00ooo0o3 == null) {
                Object obj = this.f8791o00oOoO0;
                if (obj == null) {
                    Object obj2 = this.f8790o00oOoO;
                    if (obj2 != null) {
                        o00oOo0O2.o00ooooO(obj2);
                        o00ooo0o3 = o00oOo0O2;
                    } else {
                        obj = o00oo0OO.f8767o00oOoOO;
                    }
                }
                o00oOo0O2.o00ooooo(obj);
                o00ooo0o3 = o00oOo0O2;
            }
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oo0o(o00oOo0O2.getKey());
                o00oOo0O2.o00ooooO(o00ooo0o2.getKey());
            }
            o00ooo0o2 = o00oOo0O2;
        }
        if (o00ooo0o2 != null) {
            Object obj3 = this.f8792o00oOoOO;
            if (obj3 != null) {
                o00ooo0o2.o00oo0o(obj3);
            } else {
                Object obj4 = this.f8793o00oOoOo;
                if (obj4 == null) {
                    obj4 = o00oo0OO.f8767o00oOoOO;
                }
                o00ooo0o2.o00oo0o0(obj4);
            }
        }
        if (o00ooo0o3 != null) {
            float f = this.f8778o00oOo0O;
            if (f != 0.5f) {
                o00ooo0o3.o00ooOO0(f);
            }
        }
        int i = o00oOOo0.f8794o00oOOo0[this.f8779o00oOo0o.ordinal()];
        if (i == 1) {
            o00ooo0o3.o00oooO(0);
        } else if (i == 2) {
            o00ooo0o3.o00oooO(1);
        } else if (i != 3) {
        } else {
            o00ooo0o3.o00oooO(2);
        }
    }

    public void o00oOoOo(Object obj) {
        this.f8793o00oOoOo = obj;
    }

    public void o00oOoo0(Object obj) {
        this.f8792o00oOoOO = obj;
    }

    public void o00oOooo(Object obj) {
        this.f8790o00oOoO = obj;
    }

    public void o00oo00O(Object obj) {
        this.f8791o00oOoO0 = obj;
    }
}
