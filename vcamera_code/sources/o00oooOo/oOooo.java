package o00oooOo;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.Build;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oOooo {

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static int o00oOOo0(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @o0OOooO0(27)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static Bitmap o00oOOo0(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = o00oOoO.o00oOOo0(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        @o0O0O0Oo
        public static Bitmap o00oOOoO(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = o00oOoO.o00oOOo0(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        @o0O0O0Oo
        public static boolean o00oOo00(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static void o00oOOo0(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @o0OOooO0(31)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static Bitmap.Config o00oOOo0(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            hardwareBuffer = bitmap.getHardwareBuffer();
            return hardwareBuffer.getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    @oo0oO0
    public static Bitmap o00oOOo0(@oo0oO0 Bitmap bitmap, int i, int i2, @o0OO00OO Rect rect, boolean z) {
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect == null || (!rect.isEmpty() && rect.left >= 0 && rect.right <= bitmap.getWidth() && rect.top >= 0 && rect.bottom <= bitmap.getHeight())) {
            int i5 = Build.VERSION.SDK_INT;
            Bitmap o00oOOo02 = o00oOo00.o00oOOo0(bitmap);
            int width = rect != null ? rect.width() : bitmap.getWidth();
            int height = rect != null ? rect.height() : bitmap.getHeight();
            float f = i / width;
            float f2 = i2 / height;
            int i6 = rect != null ? rect.left : 0;
            int i7 = rect != null ? rect.top : 0;
            if (i6 == 0 && i7 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
                return (bitmap.isMutable() && bitmap == o00oOOo02) ? bitmap.copy(bitmap.getConfig(), true) : o00oOOo02;
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (i5 >= 29) {
                o00oOo0O.o00oOOo0(paint);
            } else {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            }
            if (width == i && height == i2) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, o00oOOo02.getConfig());
                new Canvas(createBitmap).drawBitmap(o00oOOo02, -i6, -i7, paint);
                return createBitmap;
            }
            double log = Math.log(2.0d);
            int i8 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            int i9 = i6;
            double log2 = Math.log(f) / log;
            int ceil = (int) (i8 > 0 ? Math.ceil(log2) : Math.floor(log2));
            int i10 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            double log3 = Math.log(f2) / log;
            int ceil2 = (int) (i10 > 0 ? Math.ceil(log3) : Math.floor(log3));
            Bitmap bitmap2 = null;
            if (!z || o00oOo00.o00oOo00(bitmap)) {
                i3 = i9;
                i4 = 0;
            } else {
                Bitmap o00oOOoO2 = o00oOo00.o00oOOoO(ceil > 0 ? o00oOo0O(width, i, 1, ceil) : width, ceil2 > 0 ? o00oOo0O(height, i2, 1, ceil2) : height, bitmap, true);
                new Canvas(o00oOOoO2).drawBitmap(o00oOOo02, -i9, -i7, paint);
                i4 = 1;
                i7 = 0;
                i3 = 0;
                bitmap2 = o00oOOo02;
                o00oOOo02 = o00oOOoO2;
            }
            Rect rect2 = new Rect(i3, i7, width, height);
            Rect rect3 = new Rect();
            int i11 = ceil2;
            int i12 = ceil;
            while (true) {
                if (i12 == 0 && i11 == 0) {
                    break;
                }
                if (i12 < 0) {
                    i12++;
                } else if (i12 > 0) {
                    i12--;
                }
                if (i11 < 0) {
                    i11++;
                } else if (i11 > 0) {
                    i11--;
                }
                Bitmap bitmap3 = o00oOOo02;
                Paint paint2 = paint;
                rect3.set(0, 0, o00oOo0O(width, i, i12, ceil), o00oOo0O(height, i2, i11, ceil2));
                boolean z2 = i12 == 0 && i11 == 0;
                boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
                if (bitmap2 == null || bitmap2 == bitmap || ((z && !o00oOo00.o00oOo00(bitmap2)) || (z2 && !(z3 && i4 == 0)))) {
                    if (bitmap2 != bitmap && bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    o00oOOo02 = o00oOo00.o00oOOoO(o00oOo0O(width, i, i12 > 0 ? i4 : i12, ceil), o00oOo0O(height, i2, i11 > 0 ? i4 : i11, ceil2), bitmap, z && !z2);
                } else {
                    o00oOOo02 = bitmap2;
                }
                new Canvas(o00oOOo02).drawBitmap(bitmap3, rect2, rect3, paint2);
                rect2.set(rect3);
                bitmap2 = bitmap3;
                paint = paint2;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            return o00oOOo02;
        }
        throw new IllegalArgumentException("srcRect must be contained by srcBm!");
    }

    public static int o00oOOoO(@oo0oO0 Bitmap bitmap) {
        return o00oOOoO.o00oOOo0(bitmap);
    }

    public static boolean o00oOo00(@oo0oO0 Bitmap bitmap) {
        return o00oOOo0.o00oOOo0(bitmap);
    }

    @o0o0000
    public static int o00oOo0O(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }

    public static void o00oOooO(@oo0oO0 Bitmap bitmap, boolean z) {
        o00oOOo0.o00oOOoO(bitmap, z);
    }
}
