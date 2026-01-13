package o0Oo0ooo;

import o00ooOoo.oO00O0oO;
import o0Oo.o0O0000O;
/* loaded from: classes3.dex */
public final class oO000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f16676o00oOOo0 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16677o00oOOoO = 128;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16678o00oOo00 = 64;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f16679o00oOo0O = 16;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f16680o00oOo0o = 15;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f16681o00oOoO = 128;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f16682o00oOoO0 = 8;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16683o00oOoOO = 127;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f16684o00oOoOo = 0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f16685o00oOoo0 = 1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16686o00oOooO = 32;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f16687o00oOooo = 2;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f16688o00oo = 1005;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f16689o00oo0 = 9;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f16690o00oo00O = 8;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final long f16691o00oo0O = 123;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final long f16692o00oo0O0 = 125;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f16693o00oo0OO = 10;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f16694o00oo0Oo = 126;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f16695o00oo0o = 127;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final long f16696o00oo0o0 = 65535;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f16697o00oo0oO = 1001;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f16698o00ooO00 = 1006;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f16699o0O0o = 1002;

    public oO000() {
        throw new AssertionError("No instances.");
    }

    public static String o00oOOo0(String str) {
        return o0O0000O.encodeUtf8(str + f16676o00oOOo0).sha1().base64();
    }

    public static String o00oOOoO(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code must be in range [1000,5000): ");
            sb2.append(i);
            sb = sb2;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            sb = oO00O0oO.o00oOOo0("Code ", i, " is reserved and may not be used.");
        }
        return sb.toString();
    }

    public static void o00oOo00(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (i < j) {
            bArr[i] = (byte) (bArr2[(int) (j2 % length)] ^ bArr[i]);
            i++;
            j2++;
        }
    }

    public static void o00oOooO(int i) {
        String o00oOOoO2 = o00oOOoO(i);
        if (o00oOOoO2 != null) {
            throw new IllegalArgumentException(o00oOOoO2);
        }
    }
}
