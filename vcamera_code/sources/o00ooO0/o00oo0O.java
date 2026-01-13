package o00ooO0;

import java.util.Arrays;
import java.util.HashSet;
import o00oOoOo.o00oo;
/* loaded from: classes.dex */
public class o00oo0O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f8000o00oo = 3;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final boolean f8001o00oo0Oo = false;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f8002o00oo0o = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final boolean f8003o00oo0o0 = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f8004o00oo0oO = 1;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f8005o00ooO = 8;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f8006o00ooO0 = 5;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f8007o00ooO00 = 4;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f8008o00ooO0O = 6;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f8009o00ooO0o = 7;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static int f8010o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static int f8011o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static int f8012o00ooOOo = 1;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static int f8013o00ooOo = 1;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static int f8014o00ooOo0 = 1;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f8015o00ooOoO = 9;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f8016o0O0o = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f8017o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public String f8018o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f8019o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8020o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f8021o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float[] f8022o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f8023o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float[] f8024o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oOOoO f8025o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public o00ooO0.o00oOOoO[] f8026o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8027o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f8028o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f8029o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f8030o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public HashSet<o00ooO0.o00oOOoO> f8031o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public float f8032o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f8033o00oo0OO;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f8034o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f8034o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8034o00oOOo0[o00oOOoO.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8034o00oOOo0[o00oOOoO.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8034o00oOOo0[o00oOOoO.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8034o00oOOo0[o00oOOoO.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public o00oo0O(String str, o00oOOoO o00ooooo2) {
        this.f8019o00oOo00 = -1;
        this.f8027o00oOooO = -1;
        this.f8020o00oOo0O = 0;
        this.f8023o00oOoO0 = false;
        this.f8022o00oOoO = new float[9];
        this.f8024o00oOoOO = new float[9];
        this.f8026o00oOoo0 = new o00ooO0.o00oOOoO[16];
        this.f8028o00oOooo = 0;
        this.f8030o00oo00O = 0;
        this.f8029o00oo0 = false;
        this.f8033o00oo0OO = -1;
        this.f8032o00oo0O0 = 0.0f;
        this.f8031o00oo0O = null;
        this.f8018o00oOOoO = str;
        this.f8025o00oOoOo = o00ooooo2;
    }

    public o00oo0O(o00oOOoO o00ooooo2, String str) {
        this.f8019o00oOo00 = -1;
        this.f8027o00oOooO = -1;
        this.f8020o00oOo0O = 0;
        this.f8023o00oOoO0 = false;
        this.f8022o00oOoO = new float[9];
        this.f8024o00oOoOO = new float[9];
        this.f8026o00oOoo0 = new o00ooO0.o00oOOoO[16];
        this.f8028o00oOooo = 0;
        this.f8030o00oo00O = 0;
        this.f8029o00oo0 = false;
        this.f8033o00oo0OO = -1;
        this.f8032o00oo0O0 = 0.0f;
        this.f8031o00oo0O = null;
        this.f8025o00oOoOo = o00ooooo2;
    }

    public static void o00oOo0O() {
        f8010o00ooOO++;
    }

    public static String o00oOooO(o00oOOoO o00ooooo2, String str) {
        StringBuilder o00oOOo02;
        int i;
        if (str != null) {
            o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
            i = f8010o00ooOO;
        } else {
            int i2 = o00oOOo0.f8034o00oOOo0[o00ooooo2.ordinal()];
            if (i2 == 1) {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("U");
                i = f8012o00ooOOo + 1;
                f8012o00ooOOo = i;
            } else if (i2 == 2) {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("C");
                i = f8014o00ooOo0 + 1;
                f8014o00ooOo0 = i;
            } else if (i2 == 3) {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("S");
                i = f8011o00ooOO0 + 1;
                f8011o00ooOO0 = i;
            } else if (i2 == 4) {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("e");
                i = f8010o00ooOO + 1;
                f8010o00ooOO = i;
            } else if (i2 != 5) {
                throw new AssertionError(o00ooooo2.name());
            } else {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("V");
                i = f8013o00ooOo + 1;
                f8013o00ooOo = i;
            }
        }
        o00oOOo02.append(i);
        return o00oOOo02.toString();
    }

    public final void o00oOOo0(o00ooO0.o00oOOoO o00ooooo2) {
        int i = 0;
        while (true) {
            int i2 = this.f8028o00oOooo;
            if (i >= i2) {
                o00ooO0.o00oOOoO[] o00oooooArr = this.f8026o00oOoo0;
                if (i2 >= o00oooooArr.length) {
                    this.f8026o00oOoo0 = (o00ooO0.o00oOOoO[]) Arrays.copyOf(o00oooooArr, o00oooooArr.length * 2);
                }
                o00ooO0.o00oOOoO[] o00oooooArr2 = this.f8026o00oOoo0;
                int i3 = this.f8028o00oOooo;
                o00oooooArr2[i3] = o00ooooo2;
                this.f8028o00oOooo = i3 + 1;
                return;
            } else if (this.f8026o00oOoo0[i] == o00ooooo2) {
                return;
            } else {
                i++;
            }
        }
    }

    public void o00oOOoO() {
        for (int i = 0; i < 9; i++) {
            this.f8022o00oOoO[i] = 0.0f;
        }
    }

    public String o00oOo00() {
        return this.f8018o00oOOoO;
    }

    public final void o00oOo0o(o00ooO0.o00oOOoO o00ooooo2) {
        int i = this.f8028o00oOooo;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8026o00oOoo0[i2] == o00ooooo2) {
                while (i2 < i - 1) {
                    o00ooO0.o00oOOoO[] o00oooooArr = this.f8026o00oOoo0;
                    int i3 = i2 + 1;
                    o00oooooArr[i2] = o00oooooArr[i3];
                    i2 = i3;
                }
                this.f8028o00oOooo--;
                return;
            }
            i2++;
        }
    }

    public void o00oOoO(o00oo00O o00oo00o, float f) {
        this.f8021o00oOo0o = f;
        this.f8023o00oOoO0 = true;
        this.f8029o00oo0 = false;
        this.f8033o00oo0OO = -1;
        this.f8032o00oo0O0 = 0.0f;
        int i = this.f8028o00oOooo;
        this.f8027o00oOooO = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8026o00oOoo0[i2].o00oOo0o(o00oo00o, this, false);
        }
        this.f8028o00oOooo = 0;
    }

    public void o00oOoO0() {
        this.f8018o00oOOoO = null;
        this.f8025o00oOoOo = o00oOOoO.UNKNOWN;
        this.f8020o00oOo0O = 0;
        this.f8019o00oOo00 = -1;
        this.f8027o00oOooO = -1;
        this.f8021o00oOo0o = 0.0f;
        this.f8023o00oOoO0 = false;
        this.f8029o00oo0 = false;
        this.f8033o00oo0OO = -1;
        this.f8032o00oo0O0 = 0.0f;
        int i = this.f8028o00oOooo;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8026o00oOoo0[i2] = null;
        }
        this.f8028o00oOooo = 0;
        this.f8030o00oo00O = 0;
        this.f8017o00oOOo0 = false;
        Arrays.fill(this.f8024o00oOoOO, 0.0f);
    }

    public void o00oOoOO(String str) {
        this.f8018o00oOOoO = str;
    }

    public void o00oOoOo(o00oo00O o00oo00o, o00oo0O o00oo0o2, float f) {
        this.f8029o00oo0 = true;
        this.f8033o00oo0OO = o00oo0o2.f8019o00oOo00;
        this.f8032o00oo0O0 = f;
        int i = this.f8028o00oOooo;
        this.f8027o00oOooO = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8026o00oOoo0[i2].o00ooOo(o00oo00o, this, false);
        }
        this.f8028o00oOooo = 0;
        o00oo00o.o00ooO0O();
    }

    public void o00oOoo0(o00oOOoO o00ooooo2, String str) {
        this.f8025o00oOoOo = o00ooooo2;
    }

    public String o00oOooo() {
        StringBuilder o00oOOo02;
        String str;
        String str2 = this + "[";
        boolean z = true;
        boolean z2 = false;
        for (int i = 0; i < this.f8022o00oOoO.length; i++) {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(str2);
            o00oOOo03.append(this.f8022o00oOoO[i]);
            String sb = o00oOOo03.toString();
            float[] fArr = this.f8022o00oOoO;
            float f = fArr[i];
            if (f > 0.0f) {
                z2 = false;
            } else if (f < 0.0f) {
                z2 = true;
            }
            if (f != 0.0f) {
                z = false;
            }
            if (i < fArr.length - 1) {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(sb);
                str = ", ";
            } else {
                o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(sb);
                str = "] ";
            }
            o00oOOo02.append(str);
            str2 = o00oOOo02.toString();
        }
        if (z2) {
            str2 = o00oo.o00oOOo0(str2, " (-)");
        }
        return z ? o00oo.o00oOOo0(str2, " (*)") : str2;
    }

    public final void o00oo00O(o00oo00O o00oo00o, o00ooO0.o00oOOoO o00ooooo2) {
        int i = this.f8028o00oOooo;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8026o00oOoo0[i2].o00oOo00(o00oo00o, o00ooooo2, false);
        }
        this.f8028o00oOooo = 0;
    }

    public String toString() {
        StringBuilder o00oOOo02;
        if (this.f8018o00oOOoO != null) {
            o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(this.f8018o00oOOoO);
        } else {
            o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(this.f8019o00oOo00);
        }
        return o00oOOo02.toString();
    }
}
