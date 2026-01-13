package o0ooOoOO;

import java.io.PrintWriter;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class oO00Oo00 {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f17190o00oOOo0 = 19;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f17191o00oOOoO = 60;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f17192o00oOo00 = 3600;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Object f17193o00oOo0O = new Object();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static char[] f17194o00oOo0o = new char[24];

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f17195o00oOooO = 86400;

    public static int o00oOOo0(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOOoO(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            o00oOooO(j - j2, printWriter, 0);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOo00(long j, PrintWriter printWriter) {
        o00oOooO(j, printWriter, 0);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOo0O(long j, StringBuilder sb) {
        synchronized (f17193o00oOo0O) {
            sb.append(f17194o00oOo0o, 0, o00oOo0o(j, 0));
        }
    }

    public static int o00oOo0o(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f17194o00oOo0o.length < i) {
            f17194o00oOo0o = new char[i];
        }
        char[] cArr = f17194o00oOo0o;
        int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i7 == 0) {
            int i8 = i - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i7 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / f17195o00oOooO;
            floor -= f17195o00oOooO * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / f17192o00oOo00;
            floor -= i3 * f17192o00oOo00;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int o00oOOo02 = o00oOOo0(i2, 1, false, 0);
            int o00oOOo03 = o00oOOo0(i3, 1, o00oOOo02 > 0, 2) + o00oOOo02;
            int o00oOOo04 = o00oOOo0(i5, 1, o00oOOo03 > 0, 2) + o00oOOo03;
            int o00oOOo05 = o00oOOo0(i4, 1, o00oOOo04 > 0, 2) + o00oOOo04;
            i6 = 0;
            for (int o00oOOo06 = o00oOOo0(i9, 2, true, o00oOOo05 > 0 ? 3 : 0) + 1 + o00oOOo05; o00oOOo06 < i; o00oOOo06++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i11 = i6 + 1;
        boolean z = i != 0;
        int o00oOoO02 = o00oOoO0(cArr, i2, 'd', i11, false, 0);
        int o00oOoO03 = o00oOoO0(cArr, i3, 'h', o00oOoO02, o00oOoO02 != i11, z ? 2 : 0);
        int o00oOoO04 = o00oOoO0(cArr, i5, 'm', o00oOoO03, o00oOoO03 != i11, z ? 2 : 0);
        int o00oOoO05 = o00oOoO0(cArr, i4, 's', o00oOoO04, o00oOoO04 != i11, z ? 2 : 0);
        int o00oOoO06 = o00oOoO0(cArr, i9, 'm', o00oOoO05, true, (!z || o00oOoO05 == i11) ? 0 : 3);
        cArr[o00oOoO06] = 's';
        return o00oOoO06 + 1;
    }

    public static int o00oOoO0(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((!z || i3 < 3) && i <= 99) {
                i4 = i2;
            } else {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c;
            return i7 + 1;
        }
        return i2;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOooO(long j, PrintWriter printWriter, int i) {
        synchronized (f17193o00oOo0O) {
            printWriter.print(new String(f17194o00oOo0o, 0, o00oOo0o(j, i)));
        }
    }
}
