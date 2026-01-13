package o0OOoo0O;

import android.opengl.GLES20;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO000OOo {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f15151o00oo0o0 = 9;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOOoO f15152o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f15153o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15154o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f15155o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f15156o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f15157o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f15158o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f15159o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f15160o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public float[] f15161o00oOoo0 = new float[9];

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f15162o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public float[] f15163o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public float f15164o00oo00O;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f15145o00oo0 = o00oo.o00oOOo0(new byte[]{99, 5, -4, Ascii.SUB}, new byte[]{53, 70, -99, 119, 76, -121, -33, -69});

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f15148o00oo0OO = o00oo.o00oOOo0(new byte[]{-103, -29, -66, 51, Ascii.ETB, 38, -8, -38, -127, -20, -93, 97, 88, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -40, -84, -68, -64, -74, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 10, oo0OOoo.f13516o00oOoO, -19, -63, -26, -8, -71, 60, Ascii.RS, 59, -25, -105, -52, -32, -74, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 76, 116, -32, -82, -119, -11, -102, 52, Ascii.FF, 38, -4, -126, -41, -121, -74, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.FF, 38, -4, -104, -103, -7, -78, 117, Ascii.SO, 49, -10, -50, -52, -20, -121, 58, Ascii.VT, oo0OOoo.f13516o00oOoO, -31, -109, -125, -29, -20, 95, Ascii.EM, 32, -31, -120, -123, -17, -94, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.GS, 116, -29, -97, -113, -71, -9, 52, 44, 49, -19, -114, -103, -1, -78, Ascii.SYN, Ascii.ETB, 59, -25, -98, -41, -121, -95, 52, 10, 45, -4, -108, -117, -83, -95, 48, Ascii.ESC, 102, -75, -116, -72, -24, -81, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.CR, 38, -16, -71, -125, -30, -91, 49, 67, 94, -29, -107, -123, -23, -9, 56, Ascii.EM, oo0OOoo.f13516o00oOoO, -5, -46, -59, -83, -84, 95, 88, 116, -75, -38, -117, -31, -120, 5, Ascii.ETB, 39, -4, -114, -123, -30, -71, 117, 69, 116, -32, -73, -70, -35, -102, 52, Ascii.FF, 38, -4, -126, -52, -89, -9, 52, 40, 59, -26, -109, -104, -28, -72, 59, 67, 94, -75, -38, -52, -83, -95, 1, Ascii.GS, 44, -31, -113, -98, -24, -108, 58, Ascii.ETB, 38, -15, -38, -47, -83, -1, 32, 44, 49, -19, -73, -115, -7, -91, 60, 0, 116, -65, -38, -115, -39, -78, 45, Ascii.FF, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -25, -97, -81, -30, -72, 39, Ascii.FS, 125, -69, -126, -107, -74, -35, 40, 114}, new byte[]{-20, -115, -41, 85, 120, 84, -107, -6});

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f15147o00oo0O0 = o00oo.o00oOOo0(new byte[]{63, 123, -50, Ascii.FF, 47, -106, -110, -15, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 41, -58, 10, 34, -116, -114, -13, 63, 41, -51, 3, 41, -124, -113, -91, 69, Byte.MAX_VALUE, -54, Ascii.GS, 63, -116, -107, -7, 111, Byte.MAX_VALUE, -50, Ascii.FF, 116, -59, -115, -54, 42, 113, -33, Ascii.SUB, 52, Byte.MIN_VALUE, -72, -15, 32, 123, -49, 84, 76, -112, -107, -9, 41, 102, -39, 2, 102, -106, -102, -13, 63, 101, -50, Ascii.GS, 116, -95, -37, -19, Ascii.ESC, 108, -45, Ascii.ESC, 51, -105, -98, -91, 69, Byte.MAX_VALUE, -60, 6, 34, -59, -106, -1, 38, 103, -125, 70, 102, -98, -15, -66, 111, 41, -117, 8, 42, -70, -67, -20, 46, 110, -24, 0, 42, -118, -119, -66, 114, 41, -33, 10, 62, -111, -114, -20, 42, 59, -17, 71, 53, -79, -98, -26, 59, 124, -39, 10, 106, -59, -115, -54, 42, 113, -33, Ascii.SUB, 52, Byte.MIN_VALUE, -72, -15, 32, 123, -49, 70, 125, -17, -122, -108}, new byte[]{79, 9, -85, 111, 70, -27, -5, -98});

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f15146o00oo0O = o00oo.o00oOOo0(new byte[]{106, -99, -15, 119, -20, 76, -98, -87, 38, -106, -87, 68, -59, 125, -94, -123, Ascii.SUB, -89, -52, 68, -59, 125, -124, -83, 40, -97, -20, 92, -20, 90, -103, -91, 59, -106, -24, 111, -87, Ascii.CAN, -51, -78, 44, -119, -4, 106, -5, 71, -25, -80, 59, -99, -22, 106, -6, 75, -126, -82, 105, -107, -20, 103, -32, 87, Byte.MIN_VALUE, -80, 105, -98, -27, 108, -24, 86, -42, -54, 63, -103, -5, 122, -32, 76, -118, -32, 63, -99, -22, 49, -87, 84, -71, -91, 49, -116, -4, 113, -20, 97, -126, -81, 59, -100, -78, 9, -4, 76, -124, -90, 38, -118, -28, 35, -6, 67, Byte.MIN_VALUE, -80, 37, -99, -5, 70, -15, 86, -120, -78, 39, -103, -27, 76, -52, 113, -51, -77, Ascii.GS, -99, -15, 119, -4, 80, -120, -5, 67, -114, -26, 106, -19, 2, Byte.MIN_VALUE, -95, 32, -106, -95, 42, -87, 89, -25, -32, 105, -40, -87, 100, -27, 125, -85, -78, 40, -97, -54, 108, -27, 77, -97, -32, 116, -40, -3, 102, -15, 86, -104, -78, 44, -54, -51, 43, -6, 118, -120, -72, oo0OOoo.f13516o00oOoO, -115, -5, 102, -91, 2, -101, -108, 44, Byte.MIN_VALUE, -3, 118, -5, 71, -82, -81, 38, -118, -19, 42, -78, 40, -112, -54}, new byte[]{73, -8, -119, 3, -119, 34, -19, -64});

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f15149o00oo0Oo = o00oo.o00oOOo0(new byte[]{37, -48, 60, 115, Ascii.GS, -17, 65, 85, 105, -37, 100, SignedBytes.MAX_POWER_OF_TWO, 52, -34, 125, 121, 85, -22, 1, SignedBytes.MAX_POWER_OF_TWO, 52, -34, 91, 81, 103, -46, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 88, Ascii.GS, -7, 70, 89, 116, -37, 37, 107, 88, -69, Ascii.DC2, 78, 99, -60, 49, 110, 10, -28, 56, 76, 116, -48, 39, 110, Ascii.VT, -24, 93, 82, 38, -40, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 99, 17, -12, 95, 76, 38, -45, 40, 104, Ascii.EM, -11, 9, 54, 112, -44, 54, 126, 17, -17, 85, Ascii.FS, 112, -48, 39, 53, 88, -9, 102, 89, 126, -63, 49, 117, Ascii.GS, -62, 93, 83, 116, -47, Byte.MAX_VALUE, Ascii.CR, Ascii.CR, -17, 91, 90, 105, -57, 41, 39, Ascii.VT, -32, 95, 76, 106, -48, 54, 66, 0, -11, 87, 78, 104, -44, 40, 72, oo0OOoo.f13516o00oOoO, -46, Ascii.DC2, 79, 82, -48, 60, 115, Ascii.CR, -13, 87, 7, Ascii.FF, -61, 43, 110, Ascii.FS, -95, 95, 93, 111, -37, 108, 46, 88, -6, 56, Ascii.FS, 38, -107, 100, 113, Ascii.GS, -30, 6, Ascii.FS, 114, -42, 100, 58, 88, -11, 87, 68, 114, -64, 54, 98, 74, -59, Ascii.SUB, 79, 82, -48, 60, 115, Ascii.CR, -13, 87, Ascii.DLE, 38, -61, Ascii.DLE, 98, 0, -11, 71, 78, 99, -10, 43, 104, 10, -27, Ascii.ESC, 7, Ascii.FF, -107, 100, 39, 88, -25, 94, 83, 103, -63, 100, 100, Ascii.ETB, -19, 93, 78, 38, -120, 100, 115, Ascii.ESC, -81, SignedBytes.MAX_POWER_OF_TWO, Ascii.FS, 44, -107, 116, 41, 75, -95, Ascii.EM, Ascii.FS, 114, -42, 106, 96, 88, -85, Ascii.DC2, Ascii.FF, 40, Byte.MIN_VALUE, 125, 39, 83, -95, 70, 95, 40, -41, 100, 45, 88, -79, Ascii.FS, Ascii.CR, 55, -114, 78, 39, 88, -95, Ascii.DC2, 91, 106, -22, 2, 117, Ascii.EM, -26, 113, 83, 106, -38, 54, 39, 69, -95, 68, 89, 101, -127, 108, 100, Ascii.ETB, -19, 93, 78, 42, -107, 39, 104, Ascii.DC4, -18, SignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, 38, -42, 43, 107, Ascii.ETB, -13, Ascii.RS, Ascii.FS, 55, -101, 116, 46, 67, -117, 79, 54}, new byte[]{6, -75, 68, 7, 120, -127, 50, 60});

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f15150o00oo0o = o00oo.o00oOOo0(new byte[]{-2, -125, -89, 105, -29, 51, -68, 9, -78, -120, -1, 90, -54, 2, Byte.MIN_VALUE, 37, -114, -71, -102, 90, -54, 2, -90, Ascii.CR, -68, -127, -70, 66, -29, 37, -69, 5, -81, -120, -66, 113, -90, 103, -17, Ascii.DC2, -72, -105, -86, 116, -12, 56, -59, 67, -71, -125, -71, 116, -24, 56, -17, 43, -104, -76, -111, 88, -54, 2, -100, 41, -121, -93, -1, 36, -116, 45, -67, 5, -66, -113, -84, 116, -23, 51, -17, 8, -76, -127, -73, 109, -90, 59, -93, Ascii.SI, -68, -110, -28, Ascii.ETB, -16, 60, -67, Ascii.EM, -76, -120, -72, oo0OOoo.f13516o00oOoO, -16, 56, -84, 82, -3, -112, -117, 120, -2, 41, -70, Ascii.DC2, -72, -91, -80, 114, -12, 57, -12, 106, -88, -120, -74, 123, -23, 47, -94, SignedBytes.MAX_POWER_OF_TWO, -82, -121, -78, 109, -22, 56, -67, 37, -91, -110, -70, 111, -24, 60, -93, 47, -104, -75, -1, 110, -46, 56, -73, Ascii.DC4, -88, -108, -70, 38, -116, 40, -95, 9, -69, -119, -83, 112, -90, 59, -93, Ascii.SI, -68, -110, -1, 104, -51, 56, -67, Ascii.SO, -72, -118, -124, 86, -61, Ascii.SI, -127, 37, -111, -71, -116, 84, -36, Ascii.CAN, -110, 91, -41, -109, -79, 116, -32, 50, -67, Ascii.CR, -3, -112, -70, 126, -76, 125, -70, 52, -72, -98, -112, 123, -32, 46, -86, Ascii.DC4, -122, -83, -102, 79, -56, Ascii.CAN, -125, 63, -114, -81, -123, 88, -37, 102, -59, Ascii.NAK, -77, -113, -71, 114, -12, 48, -17, 6, -79, -119, -66, 105, -90, 40, -116, Ascii.SI, -79, -119, -83, 92, -30, 55, -70, 19, -87, -35, -43, 107, -23, 52, -85, SignedBytes.MAX_POWER_OF_TWO, -80, -121, -74, 115, -82, 116, -17, Ascii.ESC, -41, -58, -1, oo0OOoo.f13516o00oOoO, -90, 52, -95, Ascii.DC4, -3, -113, -1, 32, -90, 109, -12, 106, -3, -58, -1, oo0OOoo.f13516o00oOoO, -16, 56, -84, 84, -3, -107, -86, 112, -90, 96, -17, Ascii.SYN, -72, -123, -21, 53, -74, 115, -1, 73, -26, -20, -1, oo0OOoo.f13516o00oOoO, -90, 125, -90, 6, -3, -50, -87, 73, -29, 37, -69, Ascii.NAK, -81, -125, -100, 114, -23, 47, -85, 78, -91, -58, -29, oo0OOoo.f13516o00oOoO, -16, 9, -86, Ascii.CAN, -87, -109, -83, 120, -59, 50, -96, Ascii.DC2, -71, -56, -90, oo0OOoo.f13516o00oOoO, -85, 125, -1, 78, -19, -42, -22, 52, -90, 38, -59, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, oo0OOoo.f13516o00oOoO, -90, 125, -17, 6, -78, -108, -1, 53, -17, 125, -14, SignedBytes.MAX_POWER_OF_TWO, -19, -35, -1, 116, -90, 97, -17, 43, -104, -76, -111, 88, -54, 2, -100, 41, -121, -93, -28, oo0OOoo.f13516o00oOoO, -17, 118, -28, 73, -3, -99, -43, oo0OOoo.f13516o00oOoO, -90, 125, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, oo0OOoo.f13516o00oOoO, -90, 125, -17, Ascii.SYN, -72, -123, -21, oo0OOoo.f13516o00oOoO, -14, 56, -73, 3, -3, -37, -1, 105, -29, 37, -69, Ascii.NAK, -81, -125, -19, 89, -82, 46, -101, 5, -91, -110, -86, 111, -29, 113, -17, Ascii.SYN, -119, -125, -89, 105, -13, 47, -86, 35, -78, -119, -83, 121, -90, 118, -17, Ascii.NAK, -119, -125, -89, 82, -32, 59, -68, 5, -87, -67, -74, SignedBytes.MAX_POWER_OF_TWO, -81, 102, -59, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, oo0OOoo.f13516o00oOoO, -90, 125, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, 110, -13, 48, -17, 75, -32, -58, -85, 120, -2, 62, -17, 74, -3, -109, -108, 120, -12, 51, -86, Ascii.FF, -122, -113, -126, 38, -116, 125, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, oo0OOoo.f13516o00oOoO, -90, 32, -59, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, 110, -13, 48, -17, 75, -32, -58, -86, 94, -23, 49, -96, Ascii.DC2, -100, -126, -75, 104, -11, 41, -12, 106, -3, -58, -1, oo0OOoo.f13516o00oOoO, -5, 125, -86, Ascii.FF, -82, -125, -1, 116, -32, 125, -25, Ascii.SYN, -119, -125, -89, 105, -13, 47, -86, 35, -78, -119, -83, 121, -88, 37, -17, 94, -3, -112, -117, 120, -2, 41, -70, Ascii.DC2, -72, -91, -80, 114, -12, 57, -31, Ascii.EM, -3, -51, -1, 45, -88, 109, -1, 85, -12, -58, -92, Ascii.ETB, -90, 125, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, oo0OOoo.f13516o00oOoO, -11, 40, -94, SignedBytes.MAX_POWER_OF_TWO, -32, -58, -85, 120, -2, 41, -70, Ascii.DC2, -72, -44, -101, 53, -11, 9, -86, Ascii.CAN, -87, -109, -83, 120, -86, 125, -71, 52, -72, -98, -85, 104, -12, 56, -116, Ascii.SI, -78, -108, -69, 52, -67, 87, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -94, oo0OOoo.f13516o00oOoO, -29, 49, -68, 5, -3, -99, -43, oo0OOoo.f13516o00oOoO, -90, 125, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -1, 110, -13, 48, -31, Ascii.DC2, -3, -37, -1, 44, -88, 109, -12, 106, -3, -58, -1, oo0OOoo.f13516o00oOoO, -5, 87, -17, SignedBytes.MAX_POWER_OF_TWO, -3, -58, -72, 113, -39, Ascii.ESC, -67, 1, -70, -91, -80, 113, -23, 47, -17, 93, -3, -107, -86, 112, -67, 87, -78, 106}, new byte[]{-35, -26, -33, Ascii.GS, -122, 93, -49, 96});

    /* loaded from: classes3.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f15165o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f15165o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15165o00oOOo0[o00oOOoO.TEXTURE_EXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15165o00oOOo0[o00oOOoO.TEXTURE_EXT_BW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15165o00oOOo0[o00oOOoO.TEXTURE_EXT_FILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum o00oOOoO {
        TEXTURE_2D,
        TEXTURE_EXT,
        TEXTURE_EXT_BW,
        TEXTURE_EXT_FILT
    }

    public oO000OOo(o00oOOoO o00ooooo2) {
        String o00oOOo02;
        String o00oOOo03;
        this.f15152o00oOOo0 = o00ooooo2;
        int i = o00oOOo0.f15165o00oOOo0[o00ooooo2.ordinal()];
        if (i == 1) {
            this.f15160o00oOoOo = 3553;
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{-22, 46, -2, Ascii.NAK, -83, -96, 94, 105, -14, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -29, 71, -30, -89, 126, Ascii.US, -49, Ascii.CR, -10, 7, -80, -69, 75, 114, -107, 53, -7, Ascii.SUB, -92, -67, 65, 36, -65, 45, -10, 7, -10, -14, 70, Ascii.GS, -6, 56, -38, Ascii.DC2, -74, -96, 90, 49, -92, 74, -10, 7, -74, -96, 90, 43, -22, 52, -14, 83, -76, -73, 80, 125, -65, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -57, Ascii.FS, -79, -69, 71, 32, -16, 46, -84, 121, -93, -90, 71, 59, -10, 34, -30, 7, -89, -14, 69, 44, -4, 116, -73, Ascii.DC2, -106, -73, 75, oo0OOoo.f13516o00oOoO, -22, 50, -14, 48, -83, -67, 65, 45, -92, 74, -31, Ascii.DC2, -80, -85, 90, 39, -8, 96, -31, Ascii.SYN, -95, -32, 19, 63, -53, 37, -17, 7, -73, -96, 86, 10, -16, 47, -27, Ascii.ETB, -7, -40, 69, 38, -10, 36, -73, Ascii.RS, -93, -69, 93, 97, -74, 96, -20, 121, -30, -14, 19, 105, -8, 44, -56, 35, -83, -95, 90, oo0OOoo.f13516o00oOoO, -10, 47, -7, 83, -1, -14, 70, 4, -55, Ascii.DLE, -38, Ascii.DC2, -74, -96, 90, 49, -65, 106, -73, Ascii.DC2, -110, -67, SignedBytes.MAX_POWER_OF_TWO, 32, -21, 41, -8, Ascii.GS, -7, -40, 19, 105, -65, 96, -31, 39, -89, -86, 71, 60, -19, 37, -44, Ascii.FS, -83, -96, 87, 105, -94, 96, -65, 6, -106, -73, 75, 4, -2, 52, -27, Ascii.SUB, -70, -14, Ascii.EM, 105, -2, Ascii.DC4, -14, Ascii.VT, -74, -89, 65, 44, -36, 47, -8, 1, -90, -5, Ascii.GS, 49, -26, 123, -99, Ascii.SO, -56}, new byte[]{-97, SignedBytes.MAX_POWER_OF_TWO, -105, 115, -62, -46, 51, 73});
            o00oOOo03 = o00oo.o00oOOo0(new byte[]{Ascii.DLE, Ascii.VT, 55, -36, -10, 53, -104, -9, Ascii.SO, 89, 63, -38, -5, 47, -124, -11, Ascii.DLE, 89, 52, -45, -16, 39, -123, -93, 106, Ascii.SI, 51, -51, -26, 47, -97, -1, SignedBytes.MAX_POWER_OF_TWO, Ascii.SI, 55, -36, -83, 102, -121, -52, 5, 1, 38, -54, -19, 35, -78, -9, Ascii.SI, Ascii.VT, 54, -124, -107, 51, -97, -15, 6, Ascii.SYN, 32, -46, -65, 53, -112, -11, Ascii.DLE, Ascii.NAK, 55, -51, -83, 2, -47, -21, 52, Ascii.FS, 42, -53, -22, 52, -108, -93, 106, Ascii.SI, oo0OOoo.f13516o00oOoO, -42, -5, 102, -100, -7, 9, Ascii.ETB, 122, -106, -65, oo0OOoo.f13516o00oOoO, -5, -72, SignedBytes.MAX_POWER_OF_TWO, 89, 114, -40, -13, Ascii.EM, -73, -22, 1, Ascii.RS, 17, -48, -13, 41, -125, -72, 93, 89, 38, -38, -25, 50, -124, -22, 5, 75, Ascii.SYN, -105, -20, Ascii.DC2, -108, -32, Ascii.DC4, Ascii.FF, 32, -38, -77, 102, -121, -52, 5, 1, 38, -54, -19, 35, -78, -9, Ascii.SI, Ascii.VT, 54, -106, -92, 76, -116, -110}, new byte[]{96, 121, 82, -65, -97, 70, -15, -104});
        } else if (i == 2) {
            this.f15160o00oOoOo = 36197;
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{-56, 109, -98, -100, -44, 38, -117, 78, -48, 98, -125, -50, -101, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -85, 56, -19, 78, -106, -114, -55, oo0OOoo.f13516o00oOoO, -98, 85, -73, 118, -103, -109, -35, 59, -108, 3, -99, 110, -106, -114, -113, 116, -109, 58, -40, 123, -70, -101, -49, 38, -113, Ascii.SYN, -122, 9, -106, -114, -49, 38, -113, Ascii.FF, -56, 119, -110, -38, -51, 49, -123, 90, -99, 98, -89, -107, -56, oo0OOoo.f13516o00oOoO, -110, 7, -46, 109, -52, -16, -38, 32, -110, Ascii.FS, -44, 97, -126, -114, -34, 116, -112, Ascii.VT, -34, 55, -41, -101, -17, 49, -98, Ascii.SUB, -56, 113, -110, -71, -44, 59, -108, 10, -122, 9, -127, -101, -55, 45, -113, 0, -38, 35, -127, -97, -40, 102, -58, Ascii.CAN, -23, 102, -113, -114, -50, 38, -125, 45, -46, 108, -123, -98, Byte.MIN_VALUE, 94, -112, 1, -44, 103, -41, -105, -38, oo0OOoo.f13516o00oOoO, -120, 70, -108, 35, -116, -16, -101, 116, -58, 78, -38, 111, -88, -86, -44, 39, -113, Ascii.SUB, -44, 108, -103, -38, -122, 116, -109, 35, -21, 83, -70, -101, -49, 38, -113, Ascii.SYN, -99, 41, -41, -101, -21, 59, -107, 7, -55, 106, -104, -108, Byte.MIN_VALUE, 94, -58, 78, -99, 35, -127, -82, -34, 44, -110, Ascii.ESC, -49, 102, -76, -107, -44, 38, -126, 78, Byte.MIN_VALUE, 35, -33, -113, -17, 49, -98, 35, -36, 119, -123, -109, -61, 116, -52, 78, -36, 87, -110, -126, -49, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -108, Ascii.VT, -2, 108, -104, -120, -33, 125, -56, Ascii.SYN, -60, 56, -3, -121, -79}, new byte[]{-67, 3, -9, -6, -69, 84, -26, 110});
            o00oOOo03 = o00oo.o00oOOo0(new byte[]{118, -103, 106, 68, 101, 119, -91, 96, 58, -110, 50, 119, 76, 70, -103, 76, 6, -93, 87, 119, 76, 70, -65, 100, 52, -101, 119, 111, 101, 97, -94, 108, 39, -110, 115, 92, 32, 35, -10, 123, 48, -115, 103, 89, 114, 124, -36, 121, 39, -103, 113, 89, 115, 112, -71, 103, 117, -111, 119, 84, 105, 108, -69, 121, 117, -102, 126, 95, 97, 109, -19, 3, 35, -99, 96, 73, 105, 119, -79, 41, 35, -103, 113, 2, 32, 111, -126, 108, 45, -120, 103, 66, 101, 90, -71, 102, 39, -104, 41, 58, 117, 119, -65, 111, 58, -114, Byte.MAX_VALUE, Ascii.DLE, 115, 120, -69, 121, 57, -103, 96, 117, 120, 109, -77, 123, 59, -99, 126, Byte.MAX_VALUE, 69, 74, -10, 122, 1, -103, 106, 68, 117, 107, -77, 50, 95, -118, 125, 89, 100, 57, -69, 104, 60, -110, 58, Ascii.EM, 32, 98, -36, 41, 117, -36, 50, 87, 108, 70, -112, 123, 52, -101, 81, 95, 108, 118, -92, 41, 104, -36, 102, 85, 120, 109, -93, 123, 48, -50, 86, Ascii.CAN, 115, 77, -77, 113, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -119, 96, 85, 44, 57, -96, 93, 48, -124, 102, 69, 114, 124, -107, 102, 58, -114, 118, Ascii.EM, 59, 19, -85, 3}, new byte[]{85, -4, Ascii.DC2, 48, 0, Ascii.EM, -42, 9});
        } else if (i == 3) {
            this.f15160o00oOoOo = 36197;
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{-46, 111, 78, -104, -65, 19, -60, -61, -54, 96, 83, -54, -16, Ascii.DC4, -28, -75, -9, 76, 70, -118, -94, 8, -47, -40, -83, 116, 73, -105, -74, Ascii.SO, -37, -114, -121, 108, 70, -118, -28, 65, -36, -73, -62, 121, 106, -97, -92, 19, -64, -101, -100, Ascii.VT, 70, -118, -92, 19, -64, -127, -46, 117, 66, -34, -90, 4, -54, -41, -121, 96, 119, -111, -93, 8, -35, -118, -56, 111, Ascii.FS, -12, -79, Ascii.NAK, -35, -111, -50, 99, 82, -118, -75, 65, -33, -122, -60, 53, 7, -97, -124, 4, -47, -105, -46, 115, 66, -67, -65, Ascii.SO, -37, -121, -100, Ascii.VT, 81, -97, -94, Ascii.CAN, -64, -115, -64, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 81, -101, -77, 83, -119, -107, -13, 100, 95, -118, -91, 19, -52, -96, -56, 110, 85, -102, -21, 107, -33, -116, -50, 101, 7, -109, -79, 8, -57, -53, -114, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 92, -12, -16, 65, -119, -61, -64, 109, 120, -82, -65, Ascii.DC2, -64, -105, -50, 110, 73, -34, -19, 65, -36, -82, -15, 81, 106, -97, -92, 19, -64, -101, -121, 43, 7, -97, Byte.MIN_VALUE, Ascii.SO, -38, -118, -45, 104, 72, -112, -21, 107, -119, -61, -121, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 81, -86, -75, Ascii.EM, -35, -106, -43, 100, 100, -111, -65, 19, -51, -61, -102, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.SI, -117, -124, 4, -47, -82, -58, 117, 85, -105, -88, 65, -125, -61, -58, 85, 66, -122, -92, Ascii.DC4, -37, -122, -28, 110, 72, -116, -76, 72, -121, -101, -34, 58, 45, -125, -38}, new byte[]{-89, 1, 39, -2, -48, 97, -87, -29});
            o00oOOo03 = o00oo.o00oOOo0(new byte[]{-59, -117, Byte.MAX_VALUE, 43, 42, oo0OOoo.f13516o00oOoO, 99, -113, -119, Byte.MIN_VALUE, 39, Ascii.CAN, 3, Ascii.FF, 95, -93, -75, -79, 66, Ascii.CAN, 3, Ascii.FF, 121, -117, -121, -119, 98, 0, 42, 43, 100, -125, -108, Byte.MIN_VALUE, 102, 51, 111, 105, 48, -108, -125, -97, 114, 54, oo0OOoo.f13516o00oOoO, 54, Ascii.SUB, -106, -108, -117, 100, 54, 60, 58, Byte.MAX_VALUE, -120, -58, -125, 98, 59, 38, 38, 125, -106, -58, -120, 107, 48, 46, 39, 43, -20, -112, -113, 117, 38, 38, oo0OOoo.f13516o00oOoO, 119, -58, -112, -117, 100, 109, 111, 37, 68, -125, -98, -102, 114, 45, 42, Ascii.DLE, Byte.MAX_VALUE, -119, -108, -118, 60, 85, 58, oo0OOoo.f13516o00oOoO, 121, Byte.MIN_VALUE, -119, -100, 106, Byte.MAX_VALUE, 60, 50, 125, -106, -118, -117, 117, Ascii.SUB, 55, 39, 117, -108, -120, -113, 107, Ascii.DLE, 10, 0, 48, -107, -78, -117, Byte.MAX_VALUE, 43, 58, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 117, -35, -20, -104, 104, 54, 43, 115, 125, -121, -113, Byte.MIN_VALUE, 47, 118, 111, 40, Ascii.SUB, -58, -58, -50, 39, 41, 42, 48, 36, -58, -110, -115, 39, 98, 111, 39, 117, -98, -110, -101, 117, 58, 125, Ascii.ETB, 56, -107, -78, -117, Byte.MAX_VALUE, 43, 58, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 117, -54, -58, -104, 83, 58, 55, 39, 101, -108, -125, -83, 104, 48, oo0OOoo.f13516o00oOoO, 55, 57, -35, -20, -50, 39, Byte.MAX_VALUE, 111, 53, 124, -119, -121, -102, 39, 60, 32, 63, Byte.MAX_VALUE, -108, -58, -45, 39, 43, 44, 125, 98, -58, -52, -50, 55, 113, 124, 115, 59, -58, -110, -115, 41, 56, 111, 121, 48, -42, -56, -37, 62, Byte.MAX_VALUE, 100, 115, 100, -123, -56, -116, 39, 117, 111, 99, 62, -41, -41, -43, Ascii.CR, Byte.MAX_VALUE, 111, 115, 48, -127, -118, -79, 65, 45, 46, 52, 83, -119, -118, -127, 117, Byte.MAX_VALUE, 114, 115, 102, -125, -123, -38, 47, 60, 32, 63, Byte.MAX_VALUE, -108, -54, -50, 100, 48, 35, 60, 98, -54, -58, -115, 104, 51, 32, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 60, -58, -41, -64, 55, 118, 116, 89, 109, -20}, new byte[]{-26, -18, 7, 95, 79, 83, Ascii.DLE, -26});
        } else if (i != 4) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-72, Byte.MAX_VALUE, 0, Ascii.FS, -1, 114, -94, 118, -119, 49, Ascii.FS, 4, -31, 115, -18}, new byte[]{-19, 17, 104, 125, -111, Ascii.SYN, -50, 19}) + o00ooooo2);
        } else {
            this.f15160o00oOoOo = 36197;
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{63, 91, -88, 4, -60, -31, Byte.MIN_VALUE, 87, 39, 84, -75, 86, -117, -26, -96, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.SUB, 120, -96, Ascii.SYN, -39, -6, -107, 76, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -81, Ascii.VT, -51, -4, -97, Ascii.SUB, 106, 88, -96, Ascii.SYN, -97, -77, -104, 35, 47, 77, -116, 3, -33, -31, -124, Ascii.SI, 113, 63, -96, Ascii.SYN, -33, -31, -124, Ascii.NAK, 63, 65, -92, 66, -35, -10, -114, 67, 106, 84, -111, Ascii.CR, -40, -6, -103, Ascii.RS, 37, 91, -6, 104, -54, -25, -103, 5, 35, 87, -76, Ascii.SYN, -50, -77, -101, Ascii.DC2, 41, 1, -31, 3, -1, -10, -107, 3, 63, 71, -92, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -60, -4, -97, 19, 113, 63, -73, 3, -39, -22, -124, Ascii.EM, 45, Ascii.NAK, -73, 7, -56, -95, -51, 1, Ascii.RS, 80, -71, Ascii.SYN, -34, -31, -120, 52, 37, 90, -77, 6, -112, -103, -101, Ascii.CAN, 35, 81, -31, Ascii.SI, -54, -6, -125, 95, 99, Ascii.NAK, -70, 104, -117, -77, -51, 87, 45, 89, -98, 50, -60, -32, -124, 3, 35, 90, -81, 66, -106, -77, -104, 58, Ascii.FS, 101, -116, 3, -33, -31, -124, Ascii.SI, 106, Ascii.US, -31, 3, -5, -4, -98, Ascii.RS, 62, 92, -82, Ascii.FF, -112, -103, -51, 87, 106, Ascii.NAK, -73, 54, -50, -21, -103, 2, 56, 80, -126, Ascii.CR, -60, -31, -119, 87, 119, Ascii.NAK, -23, Ascii.ETB, -1, -10, -107, 58, 43, 65, -77, Ascii.VT, -45, -77, -57, 87, 43, 97, -92, Ascii.SUB, -33, -26, -97, Ascii.DC2, 9, 90, -82, Ascii.DLE, -49, -70, -61, Ascii.SI, 51, Ascii.SO, -53, Ascii.US, -95}, new byte[]{74, 53, -63, 98, -85, -109, -19, 119});
            o00oOOo03 = o00oo.o00oOOo0(new byte[]{116, -37, -117, 78, 105, -15, -115, 77, 56, -48, -45, 125, SignedBytes.MAX_POWER_OF_TWO, -64, -79, 97, 4, -31, -74, 125, SignedBytes.MAX_POWER_OF_TWO, -64, -105, 73, 54, -39, -106, 101, 105, -25, -118, 65, 37, -48, -110, 86, 44, -91, -34, 86, 50, -49, -122, 83, 126, -6, -12, 7, 51, -37, -107, 83, 98, -6, -34, 111, Ascii.DC2, -20, -67, Byte.MAX_VALUE, SignedBytes.MAX_POWER_OF_TWO, -64, -83, 109, Ascii.CR, -5, -45, 3, 6, -17, -116, 65, 52, -41, Byte.MIN_VALUE, 83, 99, -15, -34, 76, 62, -39, -101, 74, 44, -7, -110, 75, 54, -54, -56, 48, 122, -2, -116, 93, 62, -48, -108, Ascii.SUB, 122, -6, -99, Ascii.SYN, 119, -56, -89, 95, 116, -21, -117, 86, 50, -3, -100, 85, 126, -5, -59, 46, 34, -48, -102, 92, 99, -19, -109, 4, 36, -33, -98, 74, 96, -6, -116, 97, 47, -54, -106, 72, 98, -2, -110, 107, Ascii.DC2, -19, -45, 73, 88, -6, -122, 80, 34, -52, -106, 1, 6, -22, -112, 77, 49, -47, -127, 87, 44, -7, -110, 75, 54, -54, -45, 79, 71, -6, -116, 74, 50, -46, -88, 113, 73, -51, -80, 97, Ascii.ESC, -31, -96, 115, 86, -38, -93, Ascii.US, 93, -53, -99, 83, 106, -16, -116, 73, 119, -56, -106, 89, 62, -65, -117, 112, 50, -58, -68, 92, 106, -20, -101, 80, Ascii.FF, -11, -74, 104, 66, -38, -78, 123, 4, -9, -87, Byte.MAX_VALUE, 81, -92, -12, 81, 57, -41, -107, 85, 126, -14, -34, 66, 59, -47, -110, 78, 44, -22, -67, 75, 59, -47, -127, 123, 104, -11, -117, 87, 35, -123, -7, 76, 99, -10, -102, 4, 58, -33, -102, 84, 36, -74, -34, 95, 93, -98, -45, Ascii.SUB, 44, -10, -112, 80, 119, -41, -45, 7, 44, -81, -59, 46, 119, -98, -45, Ascii.SUB, 122, -6, -99, Ascii.DLE, 119, -51, -122, 87, 44, -94, -34, 82, 50, -35, -57, Ascii.DC2, 60, -79, -50, Ascii.CR, 108, -76, -45, Ascii.SUB, 44, -65, -105, 66, 119, -106, -123, 110, 105, -25, -118, 81, 37, -37, -80, 85, 99, -19, -102, 10, 47, -98, -49, Ascii.SUB, 122, -53, -101, 92, 35, -53, -127, 95, 79, -16, -111, 86, 51, -112, -118, Ascii.SUB, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -65, -50, 10, 103, -114, -58, 19, 44, -28, -12, 4, 119, -98, -45, Ascii.SUB, 44, -65, -34, 66, 56, -52, -45, Ascii.DC2, 101, -65, -61, 4, 103, -123, -45, 83, 44, -93, -34, 111, Ascii.DC2, -20, -67, Byte.MAX_VALUE, SignedBytes.MAX_POWER_OF_TWO, -64, -83, 109, Ascii.CR, -5, -56, Ascii.SUB, 101, -76, -43, Ascii.CR, 119, -59, -7, Ascii.SUB, 44, -65, -34, 4, 119, -98, -45, Ascii.SUB, 44, -65, -34, 82, 50, -35, -57, Ascii.SUB, 120, -6, -122, 71, 119, -125, -45, 78, 105, -25, -118, 81, 37, -37, -63, 126, 36, -20, -86, 65, 47, -54, -122, 72, 105, -77, -34, 82, 3, -37, -117, 78, 121, -19, -101, 103, 56, -47, -127, 94, 44, -76, -34, 81, 3, -37, -117, 117, 106, -7, -115, 65, 35, -27, -102, 103, 37, -92, -12, 4, 119, -98, -45, Ascii.SUB, 44, -65, -34, 4, 119, -98, -45, 73, 121, -14, -34, Ascii.SI, 106, -98, -121, 95, 116, -4, -34, Ascii.SO, 119, -53, -72, 95, 126, -15, -101, 72, Ascii.FF, -41, -82, 1, 6, -65, -34, 4, 119, -98, -45, Ascii.SUB, 44, -30, -12, 4, 119, -98, -45, 73, 121, -14, -34, Ascii.SI, 106, -98, -122, 121, 99, -13, -111, 86, Ascii.SYN, -38, -103, 79, Byte.MAX_VALUE, -21, -59, 46, 119, -98, -45, Ascii.SUB, 113, -65, -101, 72, 36, -37, -45, 83, 106, -65, -42, 82, 3, -37, -117, 78, 121, -19, -101, 103, 56, -47, -127, 94, 34, -25, -34, Ascii.SUB, 119, -56, -89, 95, 116, -21, -117, 86, 50, -3, -100, 85, 126, -5, -48, 93, 119, -107, -45, 10, 34, -81, -50, 17, 126, -98, -120, 48, 44, -65, -34, 4, 119, -98, -45, Ascii.SUB, Byte.MAX_VALUE, -22, -109, 4, 106, -98, -121, 95, 116, -21, -117, 86, 50, -116, -73, Ascii.DC2, Byte.MAX_VALUE, -53, -101, 92, 35, -53, -127, 95, 32, -65, -120, 112, 50, -58, -121, 79, 126, -6, -67, 75, 56, -52, -105, 19, 55, -107, -34, 4, 119, -98, -114, Ascii.SUB, 105, -13, -115, 65, 119, -59, -7, Ascii.SUB, 44, -65, -34, 4, 119, -98, -45, 73, 121, -14, -48, 86, 119, -125, -45, Ascii.VT, 34, -81, -59, 46, 119, -98, -45, Ascii.SUB, 113, -107, -34, 4, 119, -98, -108, 86, 83, -39, -116, 69, 48, -3, -100, 86, 99, -19, -34, Ascii.EM, 119, -51, -122, 87, 55, -107, -125, 46}, new byte[]{87, -66, -13, 58, Ascii.FF, -97, -2, 36});
        }
        this.f15153o00oOOoO = o0o0000.o00oOo0O(o00oOOo02, o00oOOo03);
        int i2 = this.f15153o00oOOoO;
        if (i2 == 0) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-127, 43, -33, -38, 106, 107, 87, -18, -69, 101, -35, -54, 99, 111, 3, -1, -12, 53, -52, -41, 97, 124, Ascii.SYN, -9}, new byte[]{-44, 69, -66, -72, 6, Ascii.SO, 119, -102}));
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i2, o00oo.o00oOOo0(new byte[]{-7, Ascii.SYN, Byte.MIN_VALUE, 90, 53, 113, -102, -94, -10}, new byte[]{-104, 70, -17, 41, 92, 5, -13, -51}));
        this.f15157o00oOoO = glGetAttribLocation;
        o0o0000.o00oOOoO(glGetAttribLocation, o00oo.o00oOOo0(new byte[]{-119, -20, 124, -103, -106, -25, -97, -70, -122}, new byte[]{-24, -68, 19, -22, -1, -109, -10, -43}));
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{-119, -114, 75, 50, 109, -48, 105, 54, -85, -75, 65, 56, 125}, new byte[]{-24, -38, 46, 74, Ascii.EM, -91, Ascii.ESC, 83}));
        this.f15159o00oOoOO = glGetAttribLocation2;
        o0o0000.o00oOOoO(glGetAttribLocation2, o00oo.o00oOOo0(new byte[]{-73, 98, -110, -110, 50, 37, -122, -33, -107, 89, -104, -104, 34}, new byte[]{-42, 54, -9, -22, 70, 80, -12, -70}));
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{-29, -125, Ascii.SO, 80, -73, -127, -115, -110, -1, -74}, new byte[]{-106, -50, 88, 0, -6, -32, -7, -32}));
        this.f15154o00oOo00 = glGetUniformLocation;
        o0o0000.o00oOOoO(glGetUniformLocation, o00oo.o00oOOo0(new byte[]{72, -66, -3, -107, -27, -97, 32, 52, 84, -117}, new byte[]{oo0OOoo.f13516o00oOoO, -13, -85, -59, -88, -2, 84, 70}));
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{-9, -13, -17, -66, -79, -38, -35, -123, -21, -33}, new byte[]{-126, -89, -118, -58, -4, -69, -87, -9}));
        this.f15162o00oOooO = glGetUniformLocation2;
        o0o0000.o00oOOoO(glGetUniformLocation2, o00oo.o00oOOo0(new byte[]{Ascii.NAK, -116, -32, -115, -103, -5, -40, -11, 9, -96}, new byte[]{96, -40, -123, -11, -44, -102, -84, -121}));
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{105, 97, -32, Ascii.CAN, -77, -17, -41}, new byte[]{Ascii.FS, 42, -123, 106, -35, -118, -69, 76}));
        this.f15155o00oOo0O = glGetUniformLocation3;
        if (glGetUniformLocation3 < 0) {
            this.f15155o00oOo0O = -1;
            this.f15156o00oOo0o = -1;
            this.f15158o00oOoO0 = -1;
            return;
        }
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{48, Ascii.SO, 62, -70, 69, -52, Ascii.SYN, 113, 32, 46}, new byte[]{69, 90, 91, -62, 10, -86, 112, 2}));
        this.f15156o00oOo0o = glGetUniformLocation4;
        o0o0000.o00oOOoO(glGetUniformLocation4, o00oo.o00oOOo0(new byte[]{-36, 49, -91, -78, -78, 9, -43, 78, -52, 17}, new byte[]{-87, 101, -64, -54, -3, 111, -77, oo0OOoo.f13516o00oOoO}));
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.f15153o00oOOoO, o00oo.o00oOOo0(new byte[]{40, 116, -97, -126, -73, 124, -125, 2, 55, 66, -125, -102}, new byte[]{93, 55, -16, -18, -40, Ascii.SO, -62, 102}));
        this.f15158o00oOoO0 = glGetUniformLocation5;
        o0o0000.o00oOOoO(glGetUniformLocation5, o00oo.o00oOOo0(new byte[]{-73, -106, 7, -58, -11, -42, -16, 103, -88, -96, Ascii.ESC, -34}, new byte[]{-62, -43, 104, -86, -102, -92, -79, 3}));
        o00oOo0O(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0.0f);
        o00oOo0o(256, 256);
    }

    public int o00oOOo0() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        o0o0000.o00oOOo0(o00oo.o00oOOo0(new byte[]{-107, -123, -88, 51, -99, -53, -85, -40, -122, -100, -99, 51, Byte.MIN_VALUE}, new byte[]{-14, -23, -17, 86, -13, -97, -50, -96}));
        int i = iArr[0];
        GLES20.glBindTexture(this.f15160o00oOoOo, i);
        o00oo.o00oOOo0(new byte[]{110, -121, -70, -58, Ascii.DLE, -51, -32, 45, 113, -97, -115, -35, Ascii.ESC, -119}, new byte[]{9, -21, -8, -81, 126, -87, -76, 72});
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, androidx.work.o00oOOoO.f5764o00oOooO, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        o00oo.o00oOOo0(new byte[]{17, -74, 58, 47, Byte.MIN_VALUE, Ascii.RS, 39, -35, Ascii.ETB, -73, Ascii.VT, 62, -99, 60}, new byte[]{118, -38, 110, 74, -8, 78, 70, -81});
        return i;
    }

    public void o00oOOoO(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6) {
        o0o0000.o00oOOo0(o00oo.o00oOOo0(new byte[]{37, -9, 115, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -111, -123, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 51, -15}, new byte[]{65, -123, Ascii.DC2, 55, 96, -30, -15, SignedBytes.MAX_POWER_OF_TWO}));
        GLES20.glUseProgram(this.f15153o00oOOoO);
        o00oo.o00oOOo0(new byte[]{-66, 6, -1, -72, -37, 35, Ascii.CR, -45, -66, Ascii.CAN, -53, -90}, new byte[]{-39, 106, -86, -53, -66, 115, Byte.MAX_VALUE, -68});
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f15160o00oOoOo, i5);
        GLES20.glUniformMatrix4fv(this.f15154o00oOo00, 1, false, fArr, 0);
        o00oo.o00oOOo0(new byte[]{66, 68, 32, -19, -109, Ascii.DLE, 87, 54, 72, 101, Ascii.DC4, -9, -120, Ascii.US, SignedBytes.MAX_POWER_OF_TWO, 112, 67, 94}, new byte[]{37, 40, 117, -125, -6, 118, 56, 68});
        GLES20.glUniformMatrix4fv(this.f15162o00oOooO, 1, false, fArr2, 0);
        o00oo.o00oOOo0(new byte[]{Ascii.SO, 126, Ascii.ETB, -107, -72, Ascii.EM, -9, -63, 4, 95, 35, -113, -93, Ascii.SYN, -32, -121, Ascii.SI, 100}, new byte[]{105, Ascii.DC2, 66, -5, -47, Byte.MAX_VALUE, -104, -77});
        GLES20.glEnableVertexAttribArray(this.f15157o00oOoO);
        o00oo.o00oOOo0(new byte[]{-28, -87, -125, 9, Ascii.SUB, 95, 112, Ascii.SO, -43, -96, -76, 19, Ascii.RS, 69, 93, Ascii.US, -9, -73, -81, 5, 58, 79, 110, 10, -6}, new byte[]{-125, -59, -58, 103, 123, oo0OOoo.f13516o00oOoO, Ascii.FS, 107});
        GLES20.glVertexAttribPointer(this.f15157o00oOoO, i3, 5126, false, i4, (Buffer) floatBuffer);
        o00oo.o00oOOo0(new byte[]{-100, 122, 111, -89, oo0OOoo.f13516o00oOoO, Ascii.GS, -105, 55, -70, 98, 77, -80, 38, Ascii.VT, -94, 32, -110, 120, 77, -89, oo0OOoo.f13516o00oOoO}, new byte[]{-5, Ascii.SYN, 57, -62, 79, 105, -14, 79});
        GLES20.glEnableVertexAttribArray(this.f15159o00oOoOO);
        o00oo.o00oOOo0(new byte[]{Ascii.SO, 63, -79, -85, 67, -31, 70, 73, 63, 54, -122, -79, 71, -5, 107, 88, Ascii.GS, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -99, -89, 99, -15, 88, 77, Ascii.DLE}, new byte[]{105, 83, -12, -59, 34, -125, 42, 44});
        GLES20.glVertexAttribPointer(this.f15159o00oOoOO, 2, 5126, false, i6, (Buffer) floatBuffer2);
        o00oo.o00oOOo0(new byte[]{84, Byte.MIN_VALUE, 63, 42, Ascii.NAK, Ascii.GS, -126, SignedBytes.MAX_POWER_OF_TWO, 114, -104, Ascii.GS, oo0OOoo.f13516o00oOoO, Ascii.SO, Ascii.VT, -73, 87, 90, -126, Ascii.GS, 42, Ascii.NAK}, new byte[]{51, -20, 105, 79, 103, 105, -25, 56});
        int i7 = this.f15155o00oOo0O;
        if (i7 >= 0) {
            GLES20.glUniform1fv(i7, 9, this.f15161o00oOoo0, 0);
            GLES20.glUniform2fv(this.f15156o00oOo0o, 9, this.f15163o00oOooo, 0);
            GLES20.glUniform1f(this.f15158o00oOoO0, this.f15164o00oo00O);
        }
        GLES20.glDrawArrays(5, i, i2);
        o00oo.o00oOOo0(new byte[]{Ascii.EM, 75, 115, 46, Ascii.EM, Ascii.GS, -98, 103, Ascii.FF, 70, 78, 47}, new byte[]{126, 39, 55, 92, 120, 106, -33, Ascii.NAK});
        GLES20.glDisableVertexAttribArray(this.f15157o00oOoO);
        GLES20.glDisableVertexAttribArray(this.f15159o00oOoOO);
        GLES20.glBindTexture(this.f15160o00oOoOo, 0);
        GLES20.glUseProgram(0);
    }

    public o00oOOoO o00oOo00() {
        return this.f15152o00oOOo0;
    }

    public void o00oOo0O(float[] fArr, float f) {
        if (fArr.length == 9) {
            System.arraycopy(fArr, 0, this.f15161o00oOoo0, 0, 9);
            this.f15164o00oo00O = f;
            return;
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0(new byte[]{94, -7, -120, 35, 1, 0, 73, -80, 124, -26, -97, 109, Ascii.CR, Ascii.US, 73}, new byte[]{Ascii.NAK, -100, -6, 77, 100, 108, 105, -61}) + fArr.length + o00oo.o00oOOo0(new byte[]{97, -126, Ascii.ETB, 10, -41}, new byte[]{65, -12, 100, 36, -9, -123, 50, -81}) + 9);
    }

    public void o00oOo0o(int i, int i2) {
        float f = 1.0f / i;
        float f2 = 1.0f / i2;
        float f3 = -f;
        float f4 = -f2;
        this.f15163o00oOooo = new float[]{f3, f4, 0.0f, f4, f, f4, f3, 0.0f, 0.0f, 0.0f, f, 0.0f, f3, f2, 0.0f, f2, f, f2};
    }

    public void o00oOooO() {
        GLES20.glDeleteProgram(this.f15153o00oOOoO);
        this.f15153o00oOOoO = -1;
    }
}
