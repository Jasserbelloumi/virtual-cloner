package o00ooO0o;

import java.util.Iterator;
import o00ooO0O.o00oOo0O;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o0 extends o00oo {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public Object f8773o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Object f8774o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public Object f8775o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public Object f8776o00oOoOo;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8777o00oOOo0;

        static {
            int[] iArr = new int[o00oo0OO.o00oOOoO.values().length];
            f8777o00oOOo0 = iArr;
            try {
                iArr[o00oo0OO.o00oOOoO.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8777o00oOOo0[o00oo0OO.o00oOOoO.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8777o00oOOo0[o00oo0OO.o00oOOoO.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0(o00oo0OO o00oo0oo) {
        super(o00oo0oo, o00oo0OO.o00oOoO.VERTICAL_CHAIN);
    }

    @Override // o00ooO0O.o00oo00O
    public void o00oOOoO() {
        Iterator<Object> it = this.f8761o00oOo00.iterator();
        while (it.hasNext()) {
            this.f8759o00oOOo0.o00oOo0O(it.next()).o00oo0OO();
        }
        Iterator<Object> it2 = this.f8761o00oOo00.iterator();
        o00oOo0O o00ooo0o2 = null;
        o00oOo0O o00ooo0o3 = null;
        while (it2.hasNext()) {
            o00oOo0O o00oOo0O2 = this.f8759o00oOOo0.o00oOo0O(it2.next());
            if (o00ooo0o3 == null) {
                Object obj = this.f8774o00oOoO0;
                if (obj == null) {
                    Object obj2 = this.f8773o00oOoO;
                    if (obj2 != null) {
                        o00oOo0O2.o0O00000(obj2);
                        o00ooo0o3 = o00oOo0O2;
                    } else {
                        obj = o00oo0OO.f8767o00oOoOO;
                    }
                }
                o00oOo0O2.o0O0000O(obj);
                o00ooo0o3 = o00oOo0O2;
            }
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOoOo(o00oOo0O2.getKey());
                o00oOo0O2.o0O00000(o00ooo0o2.getKey());
            }
            o00ooo0o2 = o00oOo0O2;
        }
        if (o00ooo0o2 != null) {
            Object obj3 = this.f8775o00oOoOO;
            if (obj3 != null) {
                o00ooo0o2.o00oOoOo(obj3);
            } else {
                Object obj4 = this.f8776o00oOoOo;
                if (obj4 == null) {
                    obj4 = o00oo0OO.f8767o00oOoOO;
                }
                o00ooo0o2.o00oOoOO(obj4);
            }
        }
        if (o00ooo0o3 != null) {
            float f = this.f8778o00oOo0O;
            if (f != 0.5f) {
                o00ooo0o3.o0O000(f);
            }
        }
        int i = o00oOOo0.f8777o00oOOo0[this.f8779o00oOo0o.ordinal()];
        if (i == 1) {
            o00ooo0o3.o00oooOO(0);
        } else if (i == 2) {
            o00ooo0o3.o00oooOO(1);
        } else if (i != 3) {
        } else {
            o00ooo0o3.o00oooOO(2);
        }
    }

    public void o00oOoOo(Object obj) {
        this.f8776o00oOoOo = obj;
    }

    public void o00oOoo0(Object obj) {
        this.f8775o00oOoOO = obj;
    }

    public void o00oOooo(Object obj) {
        this.f8773o00oOoO = obj;
    }

    public void o00oo00O(Object obj) {
        this.f8774o00oOoO0 = obj;
    }
}
