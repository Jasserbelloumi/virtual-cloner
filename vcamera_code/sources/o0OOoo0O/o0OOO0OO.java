package o0OOoo0O;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.google.common.base.Ascii;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0OOO0OO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f15087o00oOo0O = o00oo.o00oOOo0(new byte[]{-15, -125, 17, -17}, new byte[]{-89, -64, 112, -126, -20, -46, -86, o0Oo0oo0.o0OO0o00.f16655o00oOoOO});

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0OOO0O f15088o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public EGLSurface f15089o00oOOoO = EGL14.EGL_NO_SURFACE;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15090o00oOo00 = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f15091o00oOooO = -1;

    public o0OOO0OO(o0OOO0O o0ooo0o) {
        this.f15088o00oOOo0 = o0ooo0o;
    }

    public void o00oOOo0(int i, int i2) {
        if (this.f15089o00oOOoO != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{-33, 17, -36, -110, -94, 8, -51, -36, -51, 8, -36, -111, -94, Ascii.SI, -47, -36, -49, Ascii.SYN, -53, -107, -73, Ascii.SO, -52}, new byte[]{-84, 100, -82, -12, -61, 107, -88, -4}));
        }
        this.f15089o00oOOoO = this.f15088o00oOOo0.o00oOOoO(i, i2);
        this.f15090o00oOo00 = i;
        this.f15091o00oOooO = i2;
    }

    public void o00oOOoO(Object obj) {
        if (this.f15089o00oOOoO != EGL14.EGL_NO_SURFACE) {
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{-102, 93, -4, -102, -79, 125, -75, 114, -120, 68, -4, -103, -79, 122, -87, 114, -118, 90, -21, -99, -92, 123, -76}, new byte[]{-23, 40, -114, -4, -48, Ascii.RS, -48, 82}));
        }
        this.f15089o00oOOoO = this.f15088o00oOOo0.o00oOo00(obj);
    }

    public int o00oOo00() {
        int i = this.f15091o00oOooO;
        return i < 0 ? this.f15088o00oOOo0.o00oOooo(this.f15089o00oOOoO, 12374) : i;
    }

    public void o00oOo0O() {
        this.f15088o00oOOo0.o00oOoO(this.f15089o00oOOoO);
    }

    public void o00oOo0o(o0OOO0OO o0ooo0oo) {
        this.f15088o00oOOo0.o00oOoOO(this.f15089o00oOOoO, o0ooo0oo.f15089o00oOOoO);
    }

    public void o00oOoO() {
        this.f15088o00oOOo0.o00oo0(this.f15089o00oOOoO);
        this.f15089o00oOOoO = EGL14.EGL_NO_SURFACE;
        this.f15091o00oOooO = -1;
        this.f15090o00oOo00 = -1;
    }

    public void o00oOoO0() {
    }

    public void o00oOoOO(File file) throws IOException {
        if (!this.f15088o00oOOo0.o00oOo0o(this.f15089o00oOOoO)) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-47, -116, Ascii.SUB, -93, -125, 19, -122, 17, -76, -79, 45, -118, -64, 4, -116, Ascii.ESC, -32, -111, Ascii.DC2, -78, -49, Ascii.DC4, -106, 7, -14, -107, 9, -93, -64, Ascii.SO, -112, 85, -6, -101, Ascii.RS, -26, -125, Ascii.DC2, -111, 7, -15, -102, Ascii.RS}, new byte[]{-108, -12, 106, -58, -32, 103, -29, 117}));
        }
        String file2 = file.toString();
        int o00oOooO2 = o00oOooO();
        int o00oOo002 = o00oOo00();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(o00oOooO2 * o00oOo002 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, o00oOooO2, o00oOo002, o0OOo000.f15118o00oo0OO, 5121, allocateDirect);
        o0o0000.o00oOOo0(o00oo.o00oOOo0(new byte[]{Ascii.SUB, -121, -58, 111, Ascii.ETB, 34, 46, -123, 5, -114, -8, 121}, new byte[]{125, -21, -108, 10, 118, 70, 126, -20}));
        allocateDirect.rewind();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                Bitmap createBitmap = Bitmap.createBitmap(o00oOooO2, o00oOo002, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 90, bufferedOutputStream2);
                createBitmap.recycle();
                bufferedOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o00oOoOo(long j) {
        this.f15088o00oOOo0.o00oo0OO(this.f15089o00oOOoO, j);
    }

    public boolean o00oOoo0() {
        return this.f15088o00oOOo0.o00oo0O0(this.f15089o00oOOoO);
    }

    public int o00oOooO() {
        int i = this.f15090o00oOo00;
        return i < 0 ? this.f15088o00oOOo0.o00oOooo(this.f15089o00oOOoO, 12375) : i;
    }
}
