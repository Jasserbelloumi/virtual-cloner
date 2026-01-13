package o00ooO0o;

import o00ooO0O.o00oo00O;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o0O0o extends o00oo00O {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oo0OO.o00oOo0O f8802o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8803o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00ooO.o00oOOo0 f8804o00oOoO0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8805o00oOOo0;

        static {
            int[] iArr = new int[o00oo0OO.o00oOo0O.values().length];
            f8805o00oOOo0 = iArr;
            try {
                iArr[o00oo0OO.o00oOo0O.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8805o00oOOo0[o00oo0OO.o00oOo0O.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8805o00oOOo0[o00oo0OO.o00oOo0O.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8805o00oOOo0[o00oo0OO.o00oOo0O.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8805o00oOOo0[o00oo0OO.o00oOo0O.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8805o00oOOo0[o00oo0OO.o00oOo0O.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public o0O0o(o00oo0OO o00oo0oo) {
        super(o00oo0oo, o00oo0OO.o00oOoO.BARRIER);
    }

    @Override // o00ooO0O.o00oo00O
    public void o00oOOoO() {
        o00oOo00();
        int i = 0;
        switch (o00oOOo0.f8805o00oOOo0[this.f8802o00oOo0O.ordinal()]) {
            case 3:
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
        }
        this.f8804o00oOoO0.o0OO0(i);
        this.f8804o00oOoO0.o0OO0O0(this.f8803o00oOo0o);
    }

    @Override // o00ooO0O.o00oo00O
    public o00ooO.o00oo0O o00oOo00() {
        if (this.f8804o00oOoO0 == null) {
            this.f8804o00oOoO0 = new o00ooO.o00oOOo0();
        }
        return this.f8804o00oOoO0;
    }

    public void o00oOo0o(int i) {
        this.f8803o00oOo0o = i;
    }

    public void o00oOoO(o00oo0OO.o00oOo0O o00ooo0o2) {
        this.f8802o00oOo0O = o00ooo0o2;
    }

    public void o00oOoO0(Object obj) {
        o00oOo0o(this.f8759o00oOOo0.o00oOo0o(obj));
    }
}
