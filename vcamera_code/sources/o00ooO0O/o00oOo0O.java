package o00ooO0O;

import java.util.ArrayList;
import o00ooO.o00oOo0O;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o00oOo0O implements o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Object f8709o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo0OO f8710o00oOOoO;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public o00oOoO f8739o00ooOo;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public o00oOoO f8741o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public Object f8742o00ooOoo;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public o00ooO.o00oOoO f8743o00ooo00;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f8711o00oOo00 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8719o00oOooO = 0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f8712o00oOo0O = 0.5f;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f8713o00oOo0o = 0.5f;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f8715o00oOoO0 = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f8714o00oOoO = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f8716o00oOoOO = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f8717o00oOoOo = 0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f8718o00oOoo0 = 0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f8720o00oOooo = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f8723o00oo00O = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f8722o00oo0 = 0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f8726o00oo0OO = 0;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f8725o00oo0O0 = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f8724o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f8727o00oo0Oo = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Object f8729o00oo0o0 = null;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Object f8728o00oo0o = null;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Object f8730o00oo0oO = null;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Object f8744o0O0o = null;

    /* renamed from: o00oo  reason: collision with root package name */
    public Object f8721o00oo = null;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Object f8733o00ooO00 = null;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Object f8732o00ooO0 = null;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public Object f8734o00ooO0O = null;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Object f8735o00ooO0o = null;

    /* renamed from: o00ooO  reason: collision with root package name */
    public Object f8731o00ooO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public Object f8737o00ooOO0 = null;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public Object f8736o00ooOO = null;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public Object f8738o00ooOOo = null;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public o00oo0OO.o00oOo00 f8740o00ooOo0 = null;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8745o00oOOo0;

        static {
            int[] iArr = new int[o00oo0OO.o00oOo00.values().length];
            f8745o00oOOo0 = iArr;
            try {
                iArr[o00oo0OO.o00oOo00.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.BASELINE_TO_BASELINE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.CENTER_HORIZONTALLY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8745o00oOOo0[o00oo0OO.o00oOo00.CENTER_VERTICALLY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        o00oOo0O o00oOOo0(o00oo0OO o00oo0oo);
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends Exception {
        private final ArrayList<String> mErrors;

        public o00oOo00(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("IncorrectConstraintException: ");
            o00oOOo02.append(this.mErrors.toString());
            return o00oOOo02.toString();
        }
    }

    public o00oOo0O(o00oo0OO o00oo0oo) {
        Object obj = o00oOoO.f8747o00oOoOo;
        this.f8739o00ooOo = o00oOoO.o00oOOoO(obj);
        this.f8741o00ooOoO = o00oOoO.o00oOOoO(obj);
        this.f8710o00oOOoO = o00oo0oo;
    }

    @Override // o00ooO0O.o00oo0
    public void apply() {
        o00ooO.o00oOoO o00oooo2 = this.f8743o00ooo00;
        if (o00oooo2 == null) {
            return;
        }
        this.f8739o00ooOo.o00oOoOO(this.f8710o00oOOoO, o00oooo2, 0);
        this.f8741o00ooOoO.o00oOoOO(this.f8710o00oOOoO, this.f8743o00ooo00, 1);
        o00oo0O();
        o00oOooO(this.f8743o00ooo00, this.f8729o00oo0o0, o00oo0OO.o00oOo00.LEFT_TO_LEFT);
        o00oOooO(this.f8743o00ooo00, this.f8728o00oo0o, o00oo0OO.o00oOo00.LEFT_TO_RIGHT);
        o00oOooO(this.f8743o00ooo00, this.f8730o00oo0oO, o00oo0OO.o00oOo00.RIGHT_TO_LEFT);
        o00oOooO(this.f8743o00ooo00, this.f8744o0O0o, o00oo0OO.o00oOo00.RIGHT_TO_RIGHT);
        o00oOooO(this.f8743o00ooo00, this.f8721o00oo, o00oo0OO.o00oOo00.START_TO_START);
        o00oOooO(this.f8743o00ooo00, this.f8733o00ooO00, o00oo0OO.o00oOo00.START_TO_END);
        o00oOooO(this.f8743o00ooo00, this.f8732o00ooO0, o00oo0OO.o00oOo00.END_TO_START);
        o00oOooO(this.f8743o00ooo00, this.f8734o00ooO0O, o00oo0OO.o00oOo00.END_TO_END);
        o00oOooO(this.f8743o00ooo00, this.f8735o00ooO0o, o00oo0OO.o00oOo00.TOP_TO_TOP);
        o00oOooO(this.f8743o00ooo00, this.f8731o00ooO, o00oo0OO.o00oOo00.TOP_TO_BOTTOM);
        o00oOooO(this.f8743o00ooo00, this.f8737o00ooOO0, o00oo0OO.o00oOo00.BOTTOM_TO_TOP);
        o00oOooO(this.f8743o00ooo00, this.f8736o00ooOO, o00oo0OO.o00oOo00.BOTTOM_TO_BOTTOM);
        o00oOooO(this.f8743o00ooo00, this.f8738o00ooOOo, o00oo0OO.o00oOo00.BASELINE_TO_BASELINE);
        int i = this.f8711o00oOo00;
        if (i != 0) {
            this.f8743o00ooo00.o0O0o0(i);
        }
        int i2 = this.f8719o00oOooO;
        if (i2 != 0) {
            this.f8743o00ooo00.o0O0oOo(i2);
        }
        this.f8743o00ooo00.o0O0o00o(this.f8712o00oOo0O);
        this.f8743o00ooo00.oo0oOOo(this.f8713o00oOo0o);
    }

    @Override // o00ooO0O.o00oo0
    public Object getKey() {
        return this.f8709o00oOOo0;
    }

    public o00oOo0O o0() {
        this.f8740o00ooOo0 = this.f8735o00ooO0o != null ? o00oo0OO.o00oOo00.TOP_TO_TOP : o00oo0OO.o00oOo00.TOP_TO_BOTTOM;
        return this;
    }

    @Override // o00ooO0O.o00oo0
    public o00ooO.o00oOoO o00oOOo0() {
        if (this.f8743o00ooo00 == null) {
            o00ooO.o00oOoO o00oo0O02 = o00oo0O0();
            this.f8743o00ooo00 = o00oo0O02;
            o00oo0O02.o0O0OOo(this.f8742o00ooOoo);
        }
        return this.f8743o00ooo00;
    }

    @Override // o00ooO0O.o00oo0
    public void o00oOOoO(o00ooO.o00oOoO o00oooo2) {
        if (o00oooo2 == null) {
            return;
        }
        this.f8743o00ooo00 = o00oooo2;
        o00oooo2.o0O0OOo(this.f8742o00ooOoo);
    }

    @Override // o00ooO0O.o00oo0
    public void o00oOo00(Object obj) {
        this.f8709o00oOOo0 = obj;
    }

    public o00oOo0O o00oOo0O() {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.BASELINE_TO_BASELINE;
        return this;
    }

    public o00oOo0O o00oOo0o(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.BASELINE_TO_BASELINE;
        this.f8738o00ooOOo = obj;
        return this;
    }

    public o00oOo0O o00oOoO() {
        this.f8740o00ooOo0 = this.f8737o00ooOO0 != null ? o00oo0OO.o00oOo00.BOTTOM_TO_TOP : o00oo0OO.o00oOo00.BOTTOM_TO_BOTTOM;
        return this;
    }

    public o00oOo0O o00oOoO0(float f) {
        o00oo0OO.o00oOo00 o00ooo002 = this.f8740o00ooOo0;
        if (o00ooo002 == null) {
            return this;
        }
        switch (o00oOOo0.f8745o00oOOo0[o00ooo002.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 14:
                this.f8712o00oOo0O = f;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
                this.f8713o00oOo0o = f;
                break;
        }
        return this;
    }

    public o00oOo0O o00oOoOO(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.BOTTOM_TO_BOTTOM;
        this.f8736o00ooOO = obj;
        return this;
    }

    public o00oOo0O o00oOoOo(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.BOTTOM_TO_TOP;
        this.f8737o00ooOO0 = obj;
        return this;
    }

    public o00oOo0O o00oOoo0(Object obj) {
        Object o00oo0oO2 = o00oo0oO(obj);
        this.f8721o00oo = o00oo0oO2;
        this.f8734o00ooO0O = o00oo0oO2;
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.CENTER_HORIZONTALLY;
        this.f8712o00oOo0O = 0.5f;
        return this;
    }

    public final void o00oOooO(o00ooO.o00oOoO o00oooo2, Object obj, o00oo0OO.o00oOo00 o00ooo002) {
        o00oOo0O.o00oOOoO o00ooooo2;
        o00ooO.o00oOo0O o00oo0Oo2;
        o00ooO.o00oOo0O o00oo0Oo3;
        int i;
        int i2;
        o00oOo0O.o00oOOoO o00ooooo3;
        o00oOo0O.o00oOOoO o00ooooo4;
        o00oOo0O.o00oOOoO o00ooooo5;
        o00oOo0O.o00oOOoO o00ooooo6;
        o00oOo0O.o00oOOoO o00ooooo7;
        o00ooO.o00oOoO o00ooO002 = o00ooO00(obj);
        if (o00ooO002 == null) {
            return;
        }
        int[] iArr = o00oOOo0.f8745o00oOOo0;
        int i3 = iArr[o00ooo002.ordinal()];
        switch (iArr[o00ooo002.ordinal()]) {
            case 1:
                o00ooooo2 = o00oOo0O.o00oOOoO.LEFT;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo2);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo2);
                i = this.f8715o00oOoO0;
                i2 = this.f8723o00oo00O;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 2:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.LEFT);
                o00ooooo2 = o00oOo0O.o00oOOoO.RIGHT;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo2);
                i = this.f8715o00oOoO0;
                i2 = this.f8723o00oo00O;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 3:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT);
                o00ooooo3 = o00oOo0O.o00oOOoO.LEFT;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo3);
                i = this.f8714o00oOoO;
                i2 = this.f8722o00oo0;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 4:
                o00ooooo3 = o00oOo0O.o00oOOoO.RIGHT;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo3);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo3);
                i = this.f8714o00oOoO;
                i2 = this.f8722o00oo0;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 5:
                o00ooooo4 = o00oOo0O.o00oOOoO.LEFT;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo4);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo4);
                i = this.f8716o00oOoOO;
                i2 = this.f8726o00oo0OO;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 6:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.LEFT);
                o00ooooo4 = o00oOo0O.o00oOOoO.RIGHT;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo4);
                i = this.f8716o00oOoOO;
                i2 = this.f8726o00oo0OO;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 7:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT);
                o00ooooo5 = o00oOo0O.o00oOOoO.LEFT;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo5);
                i = this.f8717o00oOoOo;
                i2 = this.f8725o00oo0O0;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 8:
                o00ooooo5 = o00oOo0O.o00oOOoO.RIGHT;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo5);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo5);
                i = this.f8717o00oOoOo;
                i2 = this.f8725o00oo0O0;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 9:
                o00ooooo6 = o00oOo0O.o00oOOoO.TOP;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo6);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo6);
                i = this.f8718o00oOoo0;
                i2 = this.f8724o00oo0O;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 10:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.TOP);
                o00ooooo6 = o00oOo0O.o00oOOoO.BOTTOM;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo6);
                i = this.f8718o00oOoo0;
                i2 = this.f8724o00oo0O;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 11:
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.BOTTOM);
                o00ooooo7 = o00oOo0O.o00oOOoO.TOP;
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo7);
                i = this.f8720o00oOooo;
                i2 = this.f8727o00oo0Oo;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 12:
                o00ooooo7 = o00oOo0O.o00oOOoO.BOTTOM;
                o00oo0Oo2 = o00oooo2.o00oo0Oo(o00ooooo7);
                o00oo0Oo3 = o00ooO002.o00oo0Oo(o00ooooo7);
                i = this.f8720o00oOooo;
                i2 = this.f8727o00oo0Oo;
                o00oo0Oo2.o00oOOoO(o00oo0Oo3, i, i2, false);
                return;
            case 13:
                o00oOo0O.o00oOOoO o00ooooo8 = o00oOo0O.o00oOOoO.BASELINE;
                o00oooo2.o0oO0Ooo(o00ooooo8, o00ooO002, o00ooooo8, 0, 0);
                return;
            default:
                return;
        }
    }

    public o00oOo0O o00oOooo(Object obj) {
        Object o00oo0oO2 = o00oo0oO(obj);
        this.f8735o00ooO0o = o00oo0oO2;
        this.f8736o00ooOO = o00oo0oO2;
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.CENTER_VERTICALLY;
        this.f8713o00oOo0o = 0.5f;
        return this;
    }

    public int o00oo() {
        return this.f8711o00oOo00;
    }

    public o00oOo0O o00oo0() {
        o00oooo().o00oo00O();
        o00oo0Oo().o00oo00O();
        o00ooOO().o00oo00O();
        o00ooo00().o00oo00O();
        return this;
    }

    public o00oOo0O o00oo00O() {
        o00oo0OO.o00oOo00 o00ooo002 = this.f8740o00ooOo0;
        if (o00ooo002 != null) {
            switch (o00oOOo0.f8745o00oOOo0[o00ooo002.ordinal()]) {
                case 1:
                case 2:
                    this.f8729o00oo0o0 = null;
                    this.f8728o00oo0o = null;
                    this.f8715o00oOoO0 = 0;
                    this.f8723o00oo00O = 0;
                    break;
                case 3:
                case 4:
                    this.f8730o00oo0oO = null;
                    this.f8744o0O0o = null;
                    this.f8714o00oOoO = 0;
                    this.f8722o00oo0 = 0;
                    break;
                case 5:
                case 6:
                    this.f8721o00oo = null;
                    this.f8733o00ooO00 = null;
                    this.f8716o00oOoOO = 0;
                    this.f8726o00oo0OO = 0;
                    break;
                case 7:
                case 8:
                    this.f8732o00ooO0 = null;
                    this.f8734o00ooO0O = null;
                    this.f8717o00oOoOo = 0;
                    this.f8725o00oo0O0 = 0;
                    break;
                case 9:
                case 10:
                    this.f8735o00ooO0o = null;
                    this.f8731o00ooO = null;
                    this.f8718o00oOoo0 = 0;
                    this.f8724o00oo0O = 0;
                    break;
                case 11:
                case 12:
                    this.f8737o00ooOO0 = null;
                    this.f8736o00ooOO = null;
                    this.f8720o00oOooo = 0;
                    break;
                case 13:
                    this.f8738o00ooOOo = null;
                    break;
            }
            return this;
        }
        this.f8729o00oo0o0 = null;
        this.f8728o00oo0o = null;
        this.f8715o00oOoO0 = 0;
        this.f8730o00oo0oO = null;
        this.f8744o0O0o = null;
        this.f8714o00oOoO = 0;
        this.f8721o00oo = null;
        this.f8733o00ooO00 = null;
        this.f8716o00oOoOO = 0;
        this.f8732o00ooO0 = null;
        this.f8734o00ooO0O = null;
        this.f8717o00oOoOo = 0;
        this.f8735o00ooO0o = null;
        this.f8731o00ooO = null;
        this.f8718o00oOoo0 = 0;
        this.f8737o00ooOO0 = null;
        this.f8736o00ooOO = null;
        this.f8720o00oOooo = 0;
        this.f8738o00ooOOo = null;
        this.f8712o00oOo0O = 0.5f;
        this.f8713o00oOo0o = 0.5f;
        this.f8723o00oo00O = 0;
        this.f8722o00oo0 = 0;
        this.f8726o00oo0OO = 0;
        this.f8725o00oo0O0 = 0;
        this.f8724o00oo0O = 0;
        this.f8727o00oo0Oo = 0;
        return this;
    }

    public final void o00oo0O() {
        this.f8729o00oo0o0 = o00oo0oO(this.f8729o00oo0o0);
        this.f8728o00oo0o = o00oo0oO(this.f8728o00oo0o);
        this.f8730o00oo0oO = o00oo0oO(this.f8730o00oo0oO);
        this.f8744o0O0o = o00oo0oO(this.f8744o0O0o);
        this.f8721o00oo = o00oo0oO(this.f8721o00oo);
        this.f8733o00ooO00 = o00oo0oO(this.f8733o00ooO00);
        this.f8732o00ooO0 = o00oo0oO(this.f8732o00ooO0);
        this.f8734o00ooO0O = o00oo0oO(this.f8734o00ooO0O);
        this.f8735o00ooO0o = o00oo0oO(this.f8735o00ooO0o);
        this.f8731o00ooO = o00oo0oO(this.f8731o00ooO);
        this.f8737o00ooOO0 = o00oo0oO(this.f8737o00ooOO0);
        this.f8736o00ooOO = o00oo0oO(this.f8736o00ooOO);
        this.f8738o00ooOOo = o00oo0oO(this.f8738o00ooOOo);
    }

    public o00ooO.o00oOoO o00oo0O0() {
        return new o00ooO.o00oOoO(0, 0, o00ooO0o().o00oo00O(), o0O0o().o00oo00O());
    }

    public o00oOo0O o00oo0OO() {
        o0().o00oo00O();
        o00oOo0O().o00oo00O();
        o00oOoO().o00oo00O();
        return this;
    }

    public o00oOo0O o00oo0Oo() {
        this.f8740o00ooOo0 = this.f8732o00ooO0 != null ? o00oo0OO.o00oOo00.END_TO_START : o00oo0OO.o00oOo00.END_TO_END;
        return this;
    }

    public o00oOo0O o00oo0o(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.END_TO_START;
        this.f8732o00ooO0 = obj;
        return this;
    }

    public o00oOo0O o00oo0o0(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.END_TO_END;
        this.f8734o00ooO0O = obj;
        return this;
    }

    public final Object o00oo0oO(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof o00oOo0O) ? this.f8710o00oOOoO.o00oo0O0(obj) : obj;
    }

    public o00oOo0O o00ooO(o00oOoO o00oooo2) {
        return o00ooo0o(o00oooo2);
    }

    public int o00ooO0(int i) {
        return this.f8719o00oOooO;
    }

    public final o00ooO.o00oOoO o00ooO00(Object obj) {
        if (obj instanceof o00oo0) {
            return ((o00oo0) obj).o00oOOo0();
        }
        return null;
    }

    public Object o00ooO0O() {
        return this.f8742o00ooOoo;
    }

    public o00oOoO o00ooO0o() {
        return this.f8739o00ooOo;
    }

    public o00oOo0O o00ooOO() {
        this.f8740o00ooOo0 = this.f8729o00oo0o0 != null ? o00oo0OO.o00oOo00.LEFT_TO_LEFT : o00oo0OO.o00oOo00.LEFT_TO_RIGHT;
        return this;
    }

    public o00oOo0O o00ooOO0(float f) {
        this.f8712o00oOo0O = f;
        return this;
    }

    public o00oOo0O o00ooOOo(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.LEFT_TO_LEFT;
        this.f8729o00oo0o0 = obj;
        return this;
    }

    public o00oOo0O o00ooOo(int i) {
        o00oo0OO.o00oOo00 o00ooo002 = this.f8740o00ooOo0;
        if (o00ooo002 != null) {
            switch (o00oOOo0.f8745o00oOOo0[o00ooo002.ordinal()]) {
                case 1:
                case 2:
                    this.f8715o00oOoO0 = i;
                    break;
                case 3:
                case 4:
                    this.f8714o00oOoO = i;
                    break;
                case 5:
                case 6:
                    this.f8716o00oOoOO = i;
                    break;
                case 7:
                case 8:
                    this.f8717o00oOoOo = i;
                    break;
                case 9:
                case 10:
                    this.f8718o00oOoo0 = i;
                    break;
            }
            return this;
        }
        this.f8715o00oOoO0 = i;
        this.f8714o00oOoO = i;
        this.f8716o00oOoOO = i;
        this.f8717o00oOoOo = i;
        this.f8718o00oOoo0 = i;
        this.f8720o00oOooo = i;
        return this;
    }

    public o00oOo0O o00ooOo0(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.LEFT_TO_RIGHT;
        this.f8728o00oo0o = obj;
        return this;
    }

    public o00oOo0O o00ooOoO(Object obj) {
        return o00ooOo(this.f8710o00oOOoO.o00oOo0o(obj));
    }

    public o00oOo0O o00ooOoo(int i) {
        o00oo0OO.o00oOo00 o00ooo002 = this.f8740o00ooOo0;
        if (o00ooo002 != null) {
            switch (o00oOOo0.f8745o00oOOo0[o00ooo002.ordinal()]) {
                case 1:
                case 2:
                    this.f8723o00oo00O = i;
                    break;
                case 3:
                case 4:
                    this.f8722o00oo0 = i;
                    break;
                case 5:
                case 6:
                    this.f8726o00oo0OO = i;
                    break;
                case 7:
                case 8:
                    this.f8725o00oo0O0 = i;
                    break;
                case 9:
                case 10:
                    this.f8724o00oo0O = i;
                    break;
            }
            return this;
        }
        this.f8723o00oo00O = i;
        this.f8722o00oo0 = i;
        this.f8726o00oo0OO = i;
        this.f8725o00oo0O0 = i;
        this.f8724o00oo0O = i;
        this.f8727o00oo0Oo = i;
        return this;
    }

    public o00oOo0O o00ooo0(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.RIGHT_TO_LEFT;
        this.f8730o00oo0oO = obj;
        return this;
    }

    public o00oOo0O o00ooo00() {
        this.f8740o00ooOo0 = this.f8730o00oo0oO != null ? o00oo0OO.o00oOo00.RIGHT_TO_LEFT : o00oo0OO.o00oOo00.RIGHT_TO_RIGHT;
        return this;
    }

    public o00oOo0O o00ooo0O(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.RIGHT_TO_RIGHT;
        this.f8744o0O0o = obj;
        return this;
    }

    public o00oOo0O o00ooo0o(o00oOoO o00oooo2) {
        this.f8741o00ooOoO = o00oooo2;
        return this;
    }

    public void o00oooO(int i) {
        this.f8711o00oOo00 = i;
    }

    public void o00oooOO(int i) {
        this.f8719o00oOooO = i;
    }

    public void o00oooOo(Object obj) {
        this.f8742o00ooOoo = obj;
        o00ooO.o00oOoO o00oooo2 = this.f8743o00ooo00;
        if (o00oooo2 != null) {
            o00oooo2.o0O0OOo(obj);
        }
    }

    public o00oOo0O o00oooo() {
        this.f8740o00ooOo0 = this.f8721o00oo != null ? o00oo0OO.o00oOo00.START_TO_START : o00oo0OO.o00oOo00.START_TO_END;
        return this;
    }

    public o00oOo0O o00oooo0(o00oOoO o00oooo2) {
        this.f8739o00ooOo = o00oooo2;
        return this;
    }

    public o00oOo0O o00ooooO(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.START_TO_END;
        this.f8733o00ooO00 = obj;
        return this;
    }

    public o00oOo0O o00ooooo(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.START_TO_START;
        this.f8721o00oo = obj;
        return this;
    }

    public o00oOo0O o0O000(float f) {
        this.f8713o00oOo0o = f;
        return this;
    }

    public o00oOo0O o0O00000(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.TOP_TO_BOTTOM;
        this.f8731o00ooO = obj;
        return this;
    }

    public o00oOo0O o0O0000O(Object obj) {
        this.f8740o00ooOo0 = o00oo0OO.o00oOo00.TOP_TO_TOP;
        this.f8735o00ooO0o = obj;
        return this;
    }

    public void o0O0000o() throws o00oOo00 {
        ArrayList arrayList = new ArrayList();
        if (this.f8729o00oo0o0 != null && this.f8728o00oo0o != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f8730o00oo0oO != null && this.f8744o0O0o != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f8721o00oo != null && this.f8733o00ooO00 != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f8732o00ooO0 != null && this.f8734o00ooO0O != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f8729o00oo0o0 != null || this.f8728o00oo0o != null || this.f8730o00oo0oO != null || this.f8744o0O0o != null) && (this.f8721o00oo != null || this.f8733o00ooO00 != null || this.f8732o00ooO0 != null || this.f8734o00ooO0O != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new o00oOo00(arrayList);
        }
    }

    public o00oOo0O o0O000O(o00oOoO o00oooo2) {
        return o00oooo0(o00oooo2);
    }

    public o00oOoO o0O0o() {
        return this.f8741o00ooOoO;
    }
}
