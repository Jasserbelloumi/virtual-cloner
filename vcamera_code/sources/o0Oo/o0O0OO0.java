package o0Oo;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import o0OO0o.oO0000Oo;
/* loaded from: classes3.dex */
public final class o0O0OO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Charset f15506o00oOOo0 = Charset.forName(C.UTF8_NAME);

    public static boolean o00oOOo0(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void o00oOOoO(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static int o00oOo00(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static short o00oOo0O(short s) {
        int i = s & oO0000Oo.f13232o00oo0o0;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static void o00oOo0o(Throwable th) {
        throw th;
    }

    public static <T extends Throwable> void o00oOoO0(Throwable th) throws Throwable {
        throw th;
    }

    public static long o00oOooO(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }
}
