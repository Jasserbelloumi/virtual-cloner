package o0OOoo0O;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.work.o00oOOoO;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0o0000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f15121o00oOOo0 = o00oo.o00oOOo0(new byte[]{62, 55, oo0OOoo.f13516o00oOoO, 84}, new byte[]{104, 116, 92, 57, -68, 99, -120, Ascii.SUB});

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final float[] f15122o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f15123o00oOo00 = 4;

    static {
        float[] fArr = new float[16];
        f15122o00oOOoO = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void o00oOOo0(String str) {
    }

    public static void o00oOOoO(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-28, -86, 96, 103, -107, -73, Byte.MIN_VALUE, 37, -34, -28, 109, 106, -102, -77, -44, 52, -111, -29}, new byte[]{-79, -60, 1, 5, -7, -46, -96, 81}) + str + o00oo.o00oOOo0(new byte[]{-116, Ascii.FF, 53, -101, -21, 87, -94, 95, -52, 94, oo0OOoo.f13516o00oOoO, -104}, new byte[]{-85, 44, 92, -11, -53, 39, -48, 48}));
    }

    public static FloatBuffer o00oOo00(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int o00oOo0O(String str, String str2) {
        int o00oOo0o2;
        int o00oOo0o3 = o00oOo0o(35633, str);
        if (o00oOo0o3 == 0 || (o00oOo0o2 = o00oOo0o(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        o00oo.o00oOOo0(new byte[]{-108, 124, -120, -108, -76, 43, 72, 68, -93, 98, -92, -127, -93, 43, 81}, new byte[]{-13, Ascii.DLE, -53, -26, -47, 74, 60, o0Oo0oo0.o0OO0o00.f16655o00oOoOO});
        GLES20.glAttachShader(glCreateProgram, o00oOo0o3);
        o00oo.o00oOOo0(new byte[]{107, -2, Ascii.CAN, 32, 3, 46, Ascii.NAK, 62, 95, -6, 56, 48, Ascii.DC2, oo0OOoo.f13516o00oOoO}, new byte[]{Ascii.FF, -110, 89, 84, 119, 79, 118, 86});
        GLES20.glAttachShader(glCreateProgram, o00oOo0o2);
        o00oo.o00oOOo0(new byte[]{92, 1, 9, -109, 89, -8, -103, -70, 104, 5, 41, -125, 72, -21}, new byte[]{59, 109, 72, -25, 45, -103, -6, -46});
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    public static int o00oOo0o(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        o00oo.o00oOOo0(new byte[]{58, -102, 93, -72, 58, 2, 115, Ascii.FF, Ascii.SO, -98, Byte.MAX_VALUE, -82, 58, 17, 39, Ascii.GS, 36, -122, 123, -9}, new byte[]{93, -10, Ascii.RS, -54, 95, 99, 7, 105});
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            o00oo.o00oOOo0(new byte[]{108, 40, 96, -117, -65, -101, -121, -64, 91, 103, 118, -120, -74, -53, Byte.MIN_VALUE, -61, 74, 103, 102, -113, -70, -33, -116, -35, Ascii.SI}, new byte[]{47, 71, Ascii.NAK, -25, -37, -69, -23, -81});
            o00oo.o00oOOo0(new byte[]{-78}, new byte[]{-120, -90, 117, Ascii.FS, Ascii.GS, -92, -23, -58});
            GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static int o00oOooO(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        o00oo.o00oOOo0(new byte[]{-83, 84, -47, -27, 34, -23, 101, -37, -66, 77, -28, -27, 63}, new byte[]{-54, 56, -106, Byte.MIN_VALUE, 76, -67, 0, -93});
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, o00oOOoO.f5764o00oOooO, 9729);
        o00oo.o00oOOo0(new byte[]{32, Ascii.SO, Ascii.FS, -87, 45, 90, -119, -40, 41, 53, Ascii.CAN, -75, Ascii.DLE, 66, -102, -38}, new byte[]{76, 97, 125, -51, 100, 55, -24, -65});
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, byteBuffer);
        o00oo.o00oOOo0(new byte[]{58, -63, 82, 87, 113, -76, 92, -26, 51, -6, 86, 75, 76, -84, 79, -28}, new byte[]{86, -82, 51, 51, 56, -39, oo0OOoo.f13516o00oOoO, -127});
        return i4;
    }
}
