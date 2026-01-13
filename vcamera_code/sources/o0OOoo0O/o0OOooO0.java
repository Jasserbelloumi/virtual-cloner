package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class o0OOooO0 {
    public static byte[] o00oOOo0(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                return byteArray;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public static Bitmap o00oOOoO(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    public static Bitmap o00oOo00(byte[] bArr, int i, int i2) {
        Bitmap bitmap = null;
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            bitmap = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    public static void o00oOo0O(byte[] bArr, String str) {
        try {
            File file = new File(o00oo.o00oOOo0(new byte[]{3, Ascii.NAK, -109, 126, -109, 37, -26, -44, 109, 8, -109, 111, -99, 62, -26, -44, 72, 7, -125, 124, -35, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -21, -119, 88, 19, -106, 113, -36, 52, -29, -106, 73, Ascii.DC4, -106, 51, -109, 39, -14, -44}, new byte[]{44, 102, -9, Ascii.GS, -14, 87, -126, -5}) + str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }
            file.delete();
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void o00oOooO(Bitmap bitmap, String str) {
        try {
            File file = new File(o00oo.o00oOOo0(new byte[]{-78, Ascii.SYN, -2, 95, 68, -37, Ascii.SUB, 65, -36, Ascii.VT, -2, 78, 74, -64, Ascii.SUB, 65, -7, 4, -18, 93, 10, -33, Ascii.ETB, Ascii.FS, -23, Ascii.DLE, -5, 80, Ascii.VT, -54, Ascii.US, 3, -8, Ascii.ETB, -5, Ascii.DC2, 68, -39, Ascii.SO, 65}, new byte[]{-99, 101, -102, 60, 37, -87, 126, 110}) + str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            file.delete();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-74, 92, -71, Ascii.ESC, 38, -48, -15, 59, -92, 77, -17, Ascii.CR, 17, -38, -26, 51, -74, 78}, new byte[]{-59, oo0OOoo.f13516o00oOoO, -49, 126, 100, -71, -123, 86}));
        } catch (Exception e) {
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-35, 100, -16, -78, 57, 73, Ascii.FS, 35, -49, 117, -90, -78, 3, Ascii.SUB}, new byte[]{-82, 5, -122, -41, 123, 32, 104, 78}) + e);
            e.printStackTrace();
        }
    }
}
