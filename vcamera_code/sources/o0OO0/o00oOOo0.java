package o0OO0;

import com.google.common.base.Ascii;
/* loaded from: classes2.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int[] f12933o00oOOo0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final byte[] f12934o00oOOoO = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final char[] f12935o00oOo00 = "0123456789ABCDEF".toCharArray();

    public static byte[] o00oOOo0(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "");
        }
        if ((str.length() & 1) != 1) {
            char[] charArray = str.toCharArray();
            int length = str.length() >> 1;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int o00oOOoO2 = o00oOOoO(charArray[i2]);
                int o00oOOoO3 = o00oOOoO(charArray[i2 + 1]);
                if (o00oOOoO2 < 0 || o00oOOoO3 < 0) {
                    throw new IllegalArgumentException("hexUtils.fromHex.nonHex");
                }
                bArr[i] = (byte) ((o00oOOoO2 << 4) + o00oOOoO3);
            }
            return bArr;
        }
        throw new IllegalArgumentException("hexUtils.fromHex.oddDigits");
    }

    public static int o00oOOoO(int i) {
        try {
            return f12933o00oOOo0[i - 48];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    public static byte o00oOo00(int i) {
        return f12934o00oOOoO[i];
    }

    public static String o00oOo0O(String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = str == null ? 0 : str.length();
        StringBuilder sb = new StringBuilder(bArr.length << ((bArr.length - 1) + 2));
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = f12935o00oOo00;
            sb.append(cArr[(bArr[i] & 240) >> 4]);
            sb.append(cArr[bArr[i] & Ascii.SI]);
            if (length > 0) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String o00oOo0o(byte[] bArr) {
        return o00oOo0O(null, bArr);
    }

    public static String o00oOooO(byte b) {
        return o00oOo0O(null, new byte[]{b});
    }
}
