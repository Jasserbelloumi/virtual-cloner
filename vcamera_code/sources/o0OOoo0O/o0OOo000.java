package o0OOoo0O;

import java.nio.ByteBuffer;
import o0O000oo.o0O00000;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0OOo000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f15102o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f15103o00oOOoO = 255;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f15104o00oOo00 = 65280;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f15105o00oOo0O = 16711935;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f15106o00oOo0o = 65535;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f15107o00oOoO = 16777215;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f15108o00oOoO0 = 16776960;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f15109o00oOoOO = -16777216;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f15110o00oOoOo = Integer.MIN_VALUE;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f15111o00oOoo0 = 1073741824;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f15112o00oOooO = 16711680;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f15113o00oOooo = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f15114o00oo0 = 64;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f15117o00oo0O0 = 4;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f15118o00oo0OO = 6408;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int[] f15115o00oo00O = {-16776961, o0OO0o0O.o00oOOoO.f13247o00ooO00, -16711936, -65281, -1, 1073742079, 1073807104, o0OO0o0O.o00oOOoO.f13247o00ooO00, -65281, 65280, -2147483393, -16777216, o0O00000.f10519o00oo0oO, -65281, o0O00000.f10519o00oo0oO, o0.o00oOOo0.f6865o00oOo00};

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final ByteBuffer f15116o00oo0O = o00oOo00();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final ByteBuffer f15119o00oo0Oo = o00oOooO();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f15120o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f15120o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.COARSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15120o00oOOo0[o00oOOoO.FINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum o00oOOoO {
        COARSE,
        FINE
    }

    public static void o00oOOo0(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        for (int i8 = i2; i8 < i4; i8++) {
            int i9 = i8 * 64 * 4;
            for (int i10 = i; i10 < i3; i10++) {
                int i11 = (i10 * 4) + i9;
                int i12 = ((i8 & i7) ^ (i10 & i7)) == 0 ? i5 : i6;
                int i13 = i12 & 255;
                int i14 = (i12 >> 24) & 255;
                float f = i14 / 255.0f;
                bArr[i11] = (byte) (i13 * f);
                bArr[i11 + 1] = (byte) (((i12 >> 8) & 255) * f);
                bArr[i11 + 2] = (byte) (((i12 >> 16) & 255) * f);
                bArr[i11 + 3] = (byte) i14;
            }
        }
    }

    public static int o00oOOoO(o00oOOoO o00ooooo2) {
        ByteBuffer byteBuffer;
        int i = o00oOOo0.f15120o00oOOo0[o00ooooo2.ordinal()];
        if (i == 1) {
            byteBuffer = f15116o00oo0O;
        } else if (i != 2) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-27, 79, -31, -64, 32, -33, -97, -22, -7, 76, -21, -55, 42}, new byte[]{-112, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -118, -82, 79, -88, -15, -54}));
        } else {
            byteBuffer = f15119o00oo0Oo;
        }
        return o0o0000.o00oOooO(byteBuffer, 64, 64, f15118o00oo0OO);
    }

    public static ByteBuffer o00oOo00() {
        byte[] bArr = new byte[16384];
        for (int i = 0; i < 16384; i += 4) {
            int i2 = i / 4;
            int i3 = f15115o00oo00O[(((i2 / 64) / 16) * 4) + ((i2 % 64) / 16)];
            if (i == 0 || i == 16380) {
                i3 = -1;
            }
            int i4 = i3 & 255;
            int i5 = (i3 >> 24) & 255;
            float f = i5 / 255.0f;
            bArr[i] = (byte) (i4 * f);
            bArr[i + 1] = (byte) (((i3 >> 8) & 255) * f);
            bArr[i + 2] = (byte) (((i3 >> 16) & 255) * f);
            bArr[i + 3] = (byte) i5;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }

    public static ByteBuffer o00oOooO() {
        byte[] bArr = new byte[16384];
        o00oOOo0(bArr, 0, 0, 32, 32, -16776961, o0.o00oOOo0.f6865o00oOo00, 1);
        o00oOOo0(bArr, 32, 32, 64, 64, -16776961, -16711936, 2);
        o00oOOo0(bArr, 0, 32, 32, 64, o0.o00oOOo0.f6865o00oOo00, -16711936, 4);
        o00oOOo0(bArr, 32, 0, 64, 32, -1, -16777216, 8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }
}
