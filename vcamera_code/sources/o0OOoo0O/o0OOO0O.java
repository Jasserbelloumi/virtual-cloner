package o0OOoo0O;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.support.v4.media.o00oOo0O;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public final class o0OOO0O {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f15079o00oOo0O = o00oo.o00oOOo0(new byte[]{87, -79, -74, 87, -61}, new byte[]{102, -125, -123, 99, -10, -91, -83, -29});

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f15080o00oOo0o = 1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f15081o00oOoO = 12610;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f15082o00oOoO0 = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public EGLDisplay f15083o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public EGLContext f15084o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public EGLConfig f15085o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f15086o00oOooO;

    public o0OOO0O() {
        this(null, 0);
    }

    public o0OOO0O(EGLContext eGLContext, int i) {
        EGLConfig o00oOooO2;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f15083o00oOOo0 = eGLDisplay;
        this.f15084o00oOOoO = EGL14.EGL_NO_CONTEXT;
        this.f15085o00oOo00 = null;
        this.f15086o00oOooO = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{48, -92, 47, -116, -99, -64, -108, -45, Ascii.DC4, -121, Ascii.SUB, -116, -113, -55, -110, -106, 0, -109}, new byte[]{117, -29, 99, -84, -4, -84, -26, -74}));
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f15083o00oOOo0 = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{49, -101, 88, -20, -45, -37, 67, 34, 43, -43, 94, -21, -53, -98, 38, 17, 8, -60, Ascii.CR, -82, -37, -41, Ascii.DLE, 38, 40, -108, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{68, -11, 57, -114, -65, -66, 99, 86}));
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f15083o00oOOo0 = null;
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-86, -56, Ascii.US, 71, -124, 98, -65, 116, -80, -122, Ascii.ETB, 75, -127, 115, -10, 97, -77, -49, 4, SignedBytes.MAX_POWER_OF_TWO, -56, 66, -40, 76, -18, -110}, new byte[]{-33, -90, 126, 37, -24, 7, -97, 0}));
        }
        if ((i & 2) != 0 && (o00oOooO2 = o00oOooO(i, 3)) != null) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15083o00oOOo0, o00oOooO2, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f15085o00oOo00 = o00oOooO2;
                this.f15084o00oOOoO = eglCreateContext;
                this.f15086o00oOooO = 3;
            }
        }
        if (this.f15084o00oOOoO == EGL14.EGL_NO_CONTEXT) {
            EGLConfig o00oOooO3 = o00oOooO(i, 2);
            if (o00oOooO3 == null) {
                throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-14, -4, 52, 86, -82, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 60, -124, -56, -78, 51, 93, -84, 32, 60, -111, -121, -31, 32, 93, -74, 37, 126, -100, -62, -78, Ascii.DLE, 115, -114, 7, 115, -98, -63, -5, 50}, new byte[]{-89, -110, 85, 52, -62, 68, Ascii.FS, -16}));
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.f15083o00oOOo0, o00oOooO3, eGLContext, new int[]{12440, 2, 12344}, 0);
            o00oOOo0(o00oo.o00oOOo0(new byte[]{9, -20, -74, -102, -35, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 72, -39, 9, -56, -75, -73, -37, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 81, -39}, new byte[]{108, -117, -38, -39, -81, 68, 41, -83}));
            this.f15085o00oOo00 = o00oOooO3;
            this.f15084o00oOOoO = eglCreateContext2;
            this.f15086o00oOooO = 2;
        }
        EGL14.eglQueryContext(this.f15083o00oOOo0, this.f15084o00oOOoO, 12440, new int[1], 0);
    }

    public static void o00oOoO0(String str) {
        EGL14.eglGetCurrentDisplay();
        EGL14.eglGetCurrentContext();
        EGL14.eglGetCurrentSurface(12377);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f15083o00oOOo0 != EGL14.EGL_NO_DISPLAY) {
                o00oo00O();
            }
        } finally {
            super.finalize();
        }
    }

    public final void o00oOOo0(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str);
        o00oOOo02.append(o00oo.o00oOOo0(new byte[]{-117, -3, Ascii.ESC, -118, 97, -70, 76, 63, -61, -78, 44, -9, Ascii.CR, -86, 81}, new byte[]{-79, -35, 94, -51, 45, -102, 41, 77}));
        o00oOOo02.append(Integer.toHexString(eglGetError));
        throw new RuntimeException(o00oOOo02.toString());
    }

    public EGLSurface o00oOOoO(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f15083o00oOOo0, this.f15085o00oOo00, new int[]{12375, i, 12374, i2, 12344}, 0);
        o00oOOo0(o00oo.o00oOOo0(new byte[]{-36, -4, 53, 121, 63, 89, SignedBytes.MAX_POWER_OF_TWO, -87, -36, -53, 59, 79, 43, 90, 68, -81, -22, -18, 43, 92, 44, 95, 68}, new byte[]{-71, -101, 89, 58, 77, 60, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -35}));
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{44, SignedBytes.MAX_POWER_OF_TWO, 60, -107, 46, -81, -115, -69, 40, 84, oo0OOoo.f13516o00oOoO, -45, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -71, -124, -9}, new byte[]{95, 53, 78, -13, 79, -52, -24, -101}));
    }

    public EGLSurface o00oOo00(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-55, -124, -126, 126, 36, 8, 77, 2, -45, -97, -122, 121, 41, 2, 76, Ascii.CAN, Byte.MIN_VALUE}, new byte[]{-96, -22, -12, Ascii.US, 72, 97, 41, 34}) + obj);
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f15083o00oOOo0, this.f15085o00oOo00, obj, new int[]{12344}, 0);
        o00oOOo0(o00oo.o00oOOo0(new byte[]{52, -42, 52, -105, Ascii.CAN, -12, 42, -63, 52, -26, 49, -70, Ascii.SO, -2, 60, -26, 36, -61, 62, -75, 9, -12}, new byte[]{81, -79, 88, -44, 106, -111, 75, -75}));
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{103, Ascii.NAK, -127, 95, -61, -109, -51, 80, 99, 1, Byte.MIN_VALUE, Ascii.EM, -52, -123, -60, Ascii.FS}, new byte[]{Ascii.DC4, 96, -13, 57, -94, -16, -88, 112}));
    }

    public int o00oOo0O() {
        return this.f15086o00oOooO;
    }

    public boolean o00oOo0o(EGLSurface eGLSurface) {
        return this.f15084o00oOOoO.equals(EGL14.eglGetCurrentContext()) && eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
    }

    public void o00oOoO(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.f15083o00oOOo0;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f15084o00oOOoO)) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{49, 55, 52, -68, -108, -13, 56, Ascii.DLE, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 34, 42, -108, -101, -20, 125, 53, 53, 57, 52, -108, -111}, new byte[]{84, 80, 88, -15, -11, -104, 93, 83}));
        }
    }

    public void o00oOoOO(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        EGLDisplay eGLDisplay = this.f15083o00oOOo0;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface2, this.f15084o00oOOoO)) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{123, -115, -49, 63, -74, 84, 58, 51, 107, -104, -47, Ascii.ETB, -71, 75, 119, Ascii.DC4, 108, -117, -44, 94, -91, 90, 62, Ascii.DC4, 55, -54, -59, 19, -66, 83, 58, Ascii.DC4}, new byte[]{Ascii.RS, -22, -93, 114, -41, 63, 95, 112}));
        }
    }

    public void o00oOoOo() {
        EGLDisplay eGLDisplay = this.f15083o00oOOo0;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{106, 82, -64, 118, -56, 7, 55, -87, 122, 71, -34, 94, -57, Ascii.CAN, 114, -116, 110, 92, -64, 94, -51}, new byte[]{Ascii.SI, 53, -84, 59, -87, 108, 82, -22}));
        }
    }

    public String o00oOoo0(int i) {
        return EGL14.eglQueryString(this.f15083o00oOOo0, i);
    }

    public final EGLConfig o00oOooO(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f15083o00oOOo0, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public int o00oOooo(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f15083o00oOOo0, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    public void o00oo0(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.f15083o00oOOo0, eGLSurface);
    }

    public void o00oo00O() {
        EGLDisplay eGLDisplay = this.f15083o00oOOo0;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f15083o00oOOo0, this.f15084o00oOOoO);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f15083o00oOOo0);
        }
        this.f15083o00oOOo0 = EGL14.EGL_NO_DISPLAY;
        this.f15084o00oOOoO = EGL14.EGL_NO_CONTEXT;
        this.f15085o00oOo00 = null;
    }

    public boolean o00oo0O0(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.f15083o00oOOo0, eGLSurface);
    }

    public void o00oo0OO(EGLSurface eGLSurface, long j) {
        EGLExt.eglPresentationTimeANDROID(this.f15083o00oOOo0, eGLSurface, j);
    }
}
