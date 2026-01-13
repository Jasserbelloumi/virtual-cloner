package o0Oo0o0o;

import android.support.v4.media.o00oOOoO;
import java.io.IOException;
import o0Oo.o0O0000O;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class o0O00 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16396o00oOOoO = 16384;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final byte f16397o00oOo00 = 0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final byte f16398o00oOo0O = 2;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final byte f16399o00oOo0o = 3;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final byte f16400o00oOoO = 5;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final byte f16401o00oOoO0 = 4;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final byte f16402o00oOoOO = 6;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final byte f16403o00oOoOo = 7;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final byte f16404o00oOoo0 = 8;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final byte f16405o00oOooO = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final byte f16406o00oOooo = 9;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final byte f16408o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final byte f16409o00oo00O = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final byte f16410o00oo0O = 4;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final byte f16411o00oo0O0 = 4;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final byte f16412o00oo0OO = 1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final byte f16413o00oo0Oo = 8;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final byte f16414o00oo0o = 32;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final byte f16415o00oo0o0 = 32;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0000O f16395o00oOOo0 = o0O0000O.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String[] f16416o00oo0oO = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String[] f16417o0O0o = new String[64];

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String[] f16407o00oo = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f16407o00oo;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = oO0000O.o00oo00O("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f16417o0O0o;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f16417o0O0o;
            strArr3[i4 | 8] = o00oOOoO.o00oOOo0(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f16417o0O0o;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f16417o0O0o;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = o00oOOoO.o00oOOo0(sb, strArr5[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f16417o0O0o;
            if (i >= strArr6.length) {
                return;
            }
            if (strArr6[i] == null) {
                strArr6[i] = f16407o00oo[i];
            }
            i++;
        }
    }

    public static String o00oOOo0(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f16407o00oo[b2];
            } else if (b != 7 && b != 8) {
                String[] strArr = f16417o0O0o;
                String str = b2 < strArr.length ? strArr[b2] : f16407o00oo[b2];
                return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f16407o00oo[b2];
    }

    public static String o00oOOoO(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f16416o00oo0oO;
        String o00oo00O2 = b < strArr.length ? strArr[b] : oO0000O.o00oo00O("0x%02x", Byte.valueOf(b));
        String o00oOOo02 = o00oOOo0(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = o00oo00O2;
        objArr[4] = o00oOOo02;
        return oO0000O.o00oo00O("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException o00oOo00(String str, Object... objArr) {
        throw new IllegalArgumentException(oO0000O.o00oo00O(str, objArr));
    }

    public static IOException o00oOooO(String str, Object... objArr) throws IOException {
        throw new IOException(oO0000O.o00oo00O(str, objArr));
    }
}
