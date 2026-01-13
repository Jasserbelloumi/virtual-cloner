package o0OOoo0O;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import o0OOoO0.o00oo;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class oO00000 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f15124o00oOo00 = o00oo.o00oOOo0(new byte[]{-58, -96, -24, 85, 7}, new byte[]{-9, -111, -39, 100, 54, 53, -115, -44});

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o f15125o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ByteBuffer f15126o00oOOoO = ByteBuffer.allocate(201326592);

    public static oO00000 o00oOOo0() {
        return new oO00000();
    }

    public void o00oOOoO() {
        try {
            o oVar = this.f15125o00oOOo0;
            if (oVar != null) {
                oVar.close();
            }
        } catch (Throwable unused) {
        }
    }

    public o o00oOo00() {
        return this.f15125o00oOOo0;
    }

    public void o00oOooO(Image image, ImageReader imageReader, oO000Oo oo000oo) {
        try {
            int width = image.getWidth();
            int height = image.getHeight();
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-97, 4, -36, -3, -116, 8, 9, SignedBytes.MAX_POWER_OF_TWO, -116, 1, -49, -94, -108, 71, Ascii.DC4, 75, -110, Ascii.EM, -112}, new byte[]{-26, 113, -86, -59, -76, 48, 125, 47}) + width + o00oo.o00oOOo0(new byte[]{-116, -109, 6, 63, -65, -98, 76, 47}, new byte[]{-96, -5, 99, 86, -40, -10, 56, Ascii.NAK}) + height);
            if (image.getPlanes().length <= 1) {
                return;
            }
            Bitmap o00oOo002 = o0OOooO0.o00oOo00(ooo0Oo0.o00oOOo0(image), width, height);
            o0OOooO0.o00oOOo0(null);
            o00oOo002.recycle();
            throw null;
        } catch (Throwable th) {
            o00oo.o00oOOo0(new byte[]{-100, 114, -27, -114, -121, -43, -120, 19, -113, 119, -10, -47, -97, -117, -99, Ascii.NAK, -119, 98, -9, -116}, new byte[]{-27, 7, -109, -74, -65, -19, -4, 124});
            th.toString();
        }
    }
}
