package o0OOoo0O;

import android.opengl.GLES20;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0OOOO0o {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f15095o00oOo0O = o00oo.o00oOOo0(new byte[]{0, -123, -113, -38}, new byte[]{86, -58, -18, -73, -28, 82, Ascii.GS, 99});

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f15096o00oOo0o = o00oo.o00oOOo0(new byte[]{32, -48, 48, 42, 6, -65, Ascii.SI, 47, 56, -33, 45, 120, 73, -72, 47, 89, 5, -13, 56, 56, Ascii.ESC, -92, Ascii.SUB, 52, 52, -54, 45, 62, 0, -81, Ascii.ETB, 123, 48, -98, 47, 41, 10, -7, 66, 110, 5, -47, 42, 37, Ascii.GS, -92, Ascii.CR, 97, 110, -56, 54, 37, Ascii.CR, -19, Ascii.SI, 110, 60, -48, 113, 101, 73, -74, 66, 47, 117, -98, 62, 32, 54, -99, Ascii.CR, 124, 60, -54, 48, 35, 7, -19, 95, 47, 32, -13, Ascii.SI, Ascii.FS, 36, -84, Ascii.SYN, 125, 60, -58, 121, 102, 73, -84, 50, 96, 38, -41, 45, 37, 6, -93, 89, 114}, new byte[]{85, -66, 89, 76, 105, -51, 98, Ascii.SI});

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f15097o00oOoO0 = o00oo.o00oOOo0(new byte[]{67, 3, 108, 114, -95, 63, 114, 2, 93, 81, 100, 116, -84, 37, 110, 0, 67, 81, 111, 125, -89, 45, 111, 86, 70, Ascii.US, 96, 119, -89, 62, 118, 77, 69, Ascii.DC4, 106, 37, -24, 57, 88, 2, 95, Ascii.RS, 123, 42, -66, 35, 114, 9, 19, Ascii.FS, 104, 120, -90, 100, 50, 77, 72, 81, 41, 49, -24, 43, 119, 50, 117, 3, 104, 118, -117, 35, 119, 2, 65, 81, 52, 49, -67, Ascii.SI, 116, 1, 92, 3, 50, 108}, new byte[]{51, 113, 9, 17, -56, 76, Ascii.ESC, 109});

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f15098o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f15099o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15100o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f15101o00oOooO;

    public o0OOOO0o() {
        this.f15098o00oOOo0 = -1;
        this.f15099o00oOOoO = -1;
        this.f15100o00oOo00 = -1;
        this.f15101o00oOooO = -1;
        int o00oOo0O2 = o0o0000.o00oOo0O(o00oo.o00oOOo0(new byte[]{Ascii.DLE, 126, -54, 73, -47, 123, 123, -25, 8, 113, -41, Ascii.ESC, -98, 124, 91, -111, 53, 93, -62, 91, -52, 96, 110, -4, 4, 100, -41, 93, -41, 107, 99, -77, 0, 48, -43, 74, -35, oo0OOoo.f13516o00oOoO, 54, -90, 53, Byte.MAX_VALUE, -48, 70, -54, 96, 121, -87, 94, 102, -52, 70, -38, 41, 123, -90, Ascii.FF, 126, -117, 6, -98, 114, 54, -25, 69, 48, -60, 67, -31, 89, 121, -76, Ascii.FF, 100, -54, SignedBytes.MAX_POWER_OF_TWO, -48, 41, 43, -25, Ascii.DLE, 93, -11, Byte.MAX_VALUE, -13, 104, 98, -75, Ascii.FF, 104, -125, 5, -98, 104, 70, -88, Ascii.SYN, 121, -41, 70, -47, 103, 45, -70}, new byte[]{101, Ascii.DLE, -93, 47, -66, 9, Ascii.SYN, -57}), o00oo.o00oOOo0(new byte[]{-31, -73, -104, 46, 98, -15, 104, -44, -1, -27, -112, 40, 111, -21, 116, -42, -31, -27, -101, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 100, -29, 117, Byte.MIN_VALUE, -28, -85, -108, 43, 100, -16, 108, -101, -25, -96, -98, 121, 43, -9, 66, -44, -3, -86, -113, 118, 125, -19, 104, -33, -79, -88, -100, 36, 101, -86, 40, -101, -22, -27, -35, 109, 43, -27, 109, -28, -41, -73, -100, 42, 72, -19, 109, -44, -29, -27, -64, 109, 126, -63, 110, -41, -2, -73, -58, 48}, new byte[]{-111, -59, -3, 77, Ascii.VT, -126, 1, -69}));
        this.f15098o00oOOo0 = o00oOo0O2;
        if (o00oOo0O2 == 0) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-9, -33, -115, 122, -4, -66, -78, 74, -51, -111, -113, 106, -11, -70, -26, 91, -126, -63, -98, 119, -9, -87, -13, 83}, new byte[]{-94, -79, -20, Ascii.CAN, -112, -37, -110, 62}));
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(o00oOo0O2, o00oo.o00oOOo0(new byte[]{82, 10, -18, 50, 84, -99, -79, -19, 93}, new byte[]{51, 90, -127, 65, oo0OOoo.f13516o00oOoO, -23, -40, -126}));
        this.f15101o00oOooO = glGetAttribLocation;
        o0o0000.o00oOOoO(glGetAttribLocation, o00oo.o00oOOo0(new byte[]{85, -65, -46, -107, -57, 43, -98, -120, 90}, new byte[]{52, -17, -67, -26, -82, 95, -9, -25}));
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f15098o00oOOo0, o00oo.o00oOOo0(new byte[]{-57, 110, 5, 5, -19, Ascii.VT, 81, Byte.MIN_VALUE, -37, 91}, new byte[]{-78, 35, 83, 85, -96, 106, 37, -14}));
        this.f15100o00oOo00 = glGetUniformLocation;
        o0o0000.o00oOOoO(glGetUniformLocation, o00oo.o00oOOo0(new byte[]{-13, -95, 80, 123, -3, 81, 60, -122, -17, -108}, new byte[]{-122, -20, 6, 43, -80, 48, 72, -12}));
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f15098o00oOOo0, o00oo.o00oOOo0(new byte[]{71, -27, 115, 55, 90, -55}, new byte[]{50, -90, Ascii.FS, 91, 53, -69, -65, -116}));
        this.f15099o00oOOoO = glGetUniformLocation2;
        o0o0000.o00oOOoO(glGetUniformLocation2, o00oo.o00oOOo0(new byte[]{1, 109, -43, -21, 73, 19}, new byte[]{116, 46, -70, -121, 38, 97, -64, -126}));
    }

    public void o00oOOo0(float[] fArr, float[] fArr2, FloatBuffer floatBuffer, int i, int i2, int i3, int i4) {
        o0o0000.o00oOOo0(o00oo.o00oOOo0(new byte[]{-70, 17, -77, -115, 5, 42, Ascii.FS, Ascii.DC4, -84, Ascii.ETB}, new byte[]{-34, 99, -46, -6, 37, 89, 104, 117}));
        GLES20.glUseProgram(this.f15098o00oOOo0);
        o00oo.o00oOOo0(new byte[]{93, -83, 8, Ascii.CAN, -64, -125, -81, -51, 93, -77, 60, 6}, new byte[]{58, -63, 93, 107, -91, -45, -35, -94});
        GLES20.glUniformMatrix4fv(this.f15100o00oOo00, 1, false, fArr, 0);
        o00oo.o00oOOo0(new byte[]{34, 75, -34, -2, -44, Ascii.DLE, 87, 118, 40, 106, -22, -28, -49, Ascii.US, SignedBytes.MAX_POWER_OF_TWO, 48, 35, 81}, new byte[]{69, 39, -117, -112, -67, 118, 56, 4});
        GLES20.glUniform4fv(this.f15099o00oOOoO, 1, fArr2, 0);
        o00oo.o00oOOo0(new byte[]{-86, -78, Byte.MIN_VALUE, 95, 87, -92, -108, 96, -96, -22, -77, 71, Ascii.RS}, new byte[]{-51, -34, -43, 49, 62, -62, -5, Ascii.DC2});
        GLES20.glEnableVertexAttribArray(this.f15101o00oOooO);
        o00oo.o00oOOo0(new byte[]{-35, -12, 41, -56, 35, -30, Ascii.CAN, 48, -20, -3, Ascii.RS, -46, 39, -8, 53, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -50, -22, 5, -60, 3, -14, 6, 52, -61}, new byte[]{-70, -104, 108, -90, 66, Byte.MIN_VALUE, 116, 85});
        GLES20.glVertexAttribPointer(this.f15101o00oOooO, i3, 5126, false, i4, (Buffer) floatBuffer);
        o00oo.o00oOOo0(new byte[]{-42, -109, 42, -2, -36, -88, 70, -91, -16, -117, 8, -23, -57, -66, 115, -78, -40, -111, 8, -2, -36}, new byte[]{-79, -1, 124, -101, -82, -36, 35, -35});
        GLES20.glDrawArrays(5, i, i2);
        o00oo.o00oOOo0(new byte[]{19, 79, -5, -67, SignedBytes.MAX_POWER_OF_TWO, 58, 2, -114, 6, 66, -58, -68}, new byte[]{116, 35, -65, -49, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 77, 67, -4});
        GLES20.glDisableVertexAttribArray(this.f15101o00oOooO);
        GLES20.glUseProgram(0);
    }

    public void o00oOOoO() {
        GLES20.glDeleteProgram(this.f15098o00oOOo0);
        this.f15098o00oOOo0 = -1;
    }
}
