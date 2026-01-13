package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.google.android.exoplayer2.extractor.o00oOo0O;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import o0O0oOO0.o0oO0Ooo;
/* loaded from: classes3.dex */
public class ooo0Oo0 {
    public static byte[] o00oOOo0(Image image) {
        int width = image.getWidth();
        int height = image.getHeight();
        ByteBuffer o00oOooO2 = o00oOooO(image.getPlanes()[0].getBuffer(), image.getWidth(), image.getPlanes()[0].getRowStride(), image.getHeight(), false);
        ByteBuffer o00oOooO3 = o00oOooO(image.getPlanes()[2].getBuffer(), image.getWidth(), image.getPlanes()[2].getRowStride(), image.getHeight() / 2, true);
        int remaining = o00oOooO2.remaining();
        int remaining2 = o00oOooO3.remaining();
        int i = ((width * height) * 3) / 2;
        byte[] bArr = new byte[i];
        o00oOooO2.get(bArr, 0, remaining);
        o00oOooO3.get(bArr, remaining, remaining2);
        ByteBuffer buffer = image.getPlanes()[1].getBuffer();
        bArr[i - 1] = buffer.get(buffer.capacity() - 1);
        return bArr;
    }

    public static int o00oOOoO(int i, int i2, int i3, int i4) {
        return o0oO0Ooo.o00oOOo0(i, i2, i3, i4);
    }

    public static int o00oOo00(int i) {
        return i < 0 ? i + 256 : i;
    }

    public static void o00oOo0O(byte[] bArr, Image image) {
        Image.Plane[] planes = image.getPlanes();
        boolean z = true;
        if (planes[0].getRowStride() == planes[1].getRowStride() || planes[1].getPixelStride() != 1) {
            z = false;
        }
        if (image.getWidth() == planes[0].getRowStride()) {
            int width = image.getWidth();
            int height = image.getHeight();
            if (z) {
                o00oOo0o(bArr, width, height, image);
                return;
            } else {
                o00oOoO(bArr, width, height, image);
                return;
            }
        }
        int width2 = image.getWidth();
        int height2 = image.getHeight();
        if (z) {
            o00oOoO0(bArr, width2, height2, image);
        } else {
            o00oOoOO(bArr, width2, height2, image);
        }
    }

    public static void o00oOo0o(byte[] bArr, int i, int i2, Image image) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = ((((i2 - 1) - i4) * i) + i5) * 4;
                int i7 = bArr[i6];
                if (i7 < 0) {
                    i7 += 256;
                }
                int i8 = bArr[i6 + 1];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = bArr[i6 + 2];
                if (i9 < 0) {
                    i9 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i9, 25, (i7 * 66) + (i8 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i9, 112, (i7 * (-38)) - (i8 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i9, 18, (i7 * 112) - (i8 * 94), 128) >> 8) + 128;
                int i10 = o00oOOo02 >= 16 ? o00oOOo02 > 255 ? 255 : o00oOOo02 : 16;
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    o00oOOo04 = 0;
                } else if (o00oOOo04 > 255) {
                    o00oOOo04 = 255;
                }
                bArr2[(i4 * i) + i5] = (byte) i10;
                int i11 = ((i4 >> 1) * i) / 2;
                int i12 = i5 >> 1;
                bArr2[i3 + i11 + i12] = (byte) o00oOOo03;
                bArr2[((i3 * 5) / 4) + i11 + i12] = (byte) o00oOOo04;
            }
        }
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.clear();
        buffer.put(bArr2, 0, i3);
        ByteBuffer buffer2 = planes[1].getBuffer();
        buffer2.clear();
        float f = i;
        float f2 = i2;
        int i13 = (int) (0.25f * f * f2);
        buffer2.put(bArr2, i3, i13);
        ByteBuffer buffer3 = planes[2].getBuffer();
        buffer3.clear();
        buffer3.put(bArr2, (int) (f * 1.25f * f2), i13);
    }

    public static void o00oOoO(byte[] bArr, int i, int i2, Image image) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3 * 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = ((((i2 - 1) - i4) * i) + i5) * 4;
                int i7 = bArr[i6];
                if (i7 < 0) {
                    i7 += 256;
                }
                int i8 = bArr[i6 + 1];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = bArr[i6 + 2];
                if (i9 < 0) {
                    i9 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i9, 25, (i7 * 66) + (i8 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i9, 112, (i7 * (-38)) - (i8 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i9, 18, (i7 * 112) - (i8 * 94), 128) >> 8) + 128;
                int i10 = o00oOOo02 >= 16 ? o00oOOo02 > 255 ? 255 : o00oOOo02 : 16;
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    o00oOOo04 = 0;
                } else if (o00oOOo04 > 255) {
                    o00oOOo04 = 255;
                }
                bArr2[(i4 * i) + i5] = (byte) i10;
                int i11 = (i4 >> 1) * i;
                int i12 = i5 & (-2);
                int i13 = i3 + i11 + i12;
                byte b = (byte) o00oOOo03;
                bArr2[i13 + 0] = b;
                byte b2 = (byte) o00oOOo04;
                bArr2[i13 + 1] = b2;
                int i14 = ((i3 * 3) / 2) + i11 + i12;
                bArr2[i14 + 0] = b2;
                bArr2[i14 + 1] = b;
            }
        }
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.clear();
        buffer.put(bArr2, 0, i3);
        ByteBuffer buffer2 = planes[1].getBuffer();
        buffer2.clear();
        int i15 = ((int) ((i * 0.5f) * i2)) - 1;
        buffer2.put(bArr2, i3, i15);
        ByteBuffer buffer3 = planes[2].getBuffer();
        buffer3.clear();
        buffer3.put(bArr2, (int) (i * 1.5d * i2), i15);
    }

    public static void o00oOoO0(byte[] bArr, int i, int i2, Image image) {
        int i3;
        char c;
        int i4 = i;
        int i5 = i2;
        Image.Plane[] planes = image.getPlanes();
        int i6 = 0;
        int rowStride = (planes[0].getRowStride() * i5) - (planes[0].getRowStride() - i4);
        byte[] bArr2 = new byte[rowStride];
        int rowStride2 = ((planes[1].getRowStride() * i5) / 4) - (planes[1].getRowStride() - i4);
        byte[] bArr3 = new byte[rowStride2];
        int rowStride3 = ((planes[2].getRowStride() * i5) / 4) - (planes[2].getRowStride() - i4);
        byte[] bArr4 = new byte[rowStride3];
        int i7 = 0;
        while (i6 < i5) {
            while (i7 < i4) {
                int i8 = ((((i5 - 1) - i6) * i4) + i7) * 4;
                int i9 = bArr[i8];
                if (i9 < 0) {
                    i9 += 256;
                }
                int i10 = bArr[i8 + 1];
                if (i10 < 0) {
                    i10 += 256;
                }
                int i11 = bArr[i8 + 2];
                if (i11 < 0) {
                    i11 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i11, 25, (i9 * 66) + (i10 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i11, 112, (i9 * (-38)) - (i10 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i11, 18, (i9 * 112) - (i10 * 94), 128) >> 8) + 128;
                if (o00oOOo02 < 16) {
                    o00oOOo02 = 16;
                } else if (o00oOOo02 > 255) {
                    o00oOOo02 = 255;
                }
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    c = 0;
                    i3 = 0;
                } else {
                    if (o00oOOo04 > 255) {
                        o00oOOo04 = 255;
                    }
                    i3 = o00oOOo04;
                    c = 0;
                }
                bArr2[(planes[c].getRowStride() * i6) + i7] = (byte) o00oOOo02;
                int i12 = i6 >> 1;
                int i13 = i7 >> 1;
                bArr3[((planes[1].getRowStride() * i12) / 2) + i13] = (byte) o00oOOo03;
                bArr4[((planes[1].getRowStride() * i12) / 2) + i13] = (byte) i3;
                i7++;
                i4 = i;
                i5 = i2;
            }
            i6++;
            i7 = 0;
            i4 = i;
            i5 = i2;
        }
        ByteBuffer buffer = planes[i7].getBuffer();
        buffer.clear();
        buffer.put(bArr2, i7, rowStride);
        ByteBuffer buffer2 = planes[1].getBuffer();
        buffer2.clear();
        buffer2.put(bArr3, i7, rowStride2);
        ByteBuffer buffer3 = planes[2].getBuffer();
        buffer3.clear();
        buffer3.put(bArr4, i7, rowStride3);
    }

    public static void o00oOoOO(byte[] bArr, int i, int i2, Image image) {
        int i3;
        char c;
        int i4 = i;
        int i5 = i2;
        Image.Plane[] planes = image.getPlanes();
        int i6 = 0;
        int rowStride = (planes[0].getRowStride() * i5) - (planes[0].getRowStride() - i4);
        byte[] bArr2 = new byte[rowStride];
        int rowStride2 = ((planes[1].getRowStride() * i5) / 2) - (planes[1].getRowStride() - i4);
        byte[] bArr3 = new byte[rowStride2];
        int rowStride3 = ((planes[2].getRowStride() * i5) / 2) - (planes[2].getRowStride() - i4);
        byte[] bArr4 = new byte[rowStride3];
        System.currentTimeMillis();
        int i7 = 0;
        while (i6 < i5) {
            while (i7 < i4) {
                int i8 = ((((i5 - 1) - i6) * i4) + i7) * 4;
                int i9 = bArr[i8];
                if (i9 < 0) {
                    i9 += 256;
                }
                int i10 = bArr[i8 + 1];
                if (i10 < 0) {
                    i10 += 256;
                }
                int i11 = bArr[i8 + 2];
                if (i11 < 0) {
                    i11 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i11, 25, (i9 * 66) + (i10 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i11, 112, (i9 * (-38)) - (i10 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i11, 18, (i9 * 112) - (i10 * 94), 128) >> 8) + 128;
                if (o00oOOo02 < 16) {
                    o00oOOo02 = 16;
                } else if (o00oOOo02 > 255) {
                    o00oOOo02 = 255;
                }
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    c = 0;
                    i3 = 0;
                } else {
                    if (o00oOOo04 > 255) {
                        o00oOOo04 = 255;
                    }
                    i3 = o00oOOo04;
                    c = 0;
                }
                bArr2[(planes[c].getRowStride() * i6) + i7] = (byte) o00oOOo02;
                int i12 = i6 >> 1;
                int i13 = i7 & (-2);
                byte b = (byte) o00oOOo03;
                bArr3[(planes[1].getRowStride() * i12) + i13 + 0] = b;
                byte b2 = (byte) i3;
                bArr3[(planes[1].getRowStride() * i12) + i13 + 1] = b2;
                bArr4[(planes[2].getRowStride() * i12) + i13 + 0] = b2;
                bArr4[(planes[2].getRowStride() * i12) + i13 + 1] = b;
                i7++;
                i4 = i;
                i5 = i2;
            }
            i6++;
            i7 = 0;
            i4 = i;
            i5 = i2;
        }
        ByteBuffer buffer = planes[i7].getBuffer();
        buffer.clear();
        buffer.put(bArr2, i7, rowStride);
        ByteBuffer buffer2 = planes[1].getBuffer();
        buffer2.clear();
        buffer2.put(bArr3, i7, rowStride2 - 1);
        ByteBuffer buffer3 = planes[2].getBuffer();
        buffer3.clear();
        buffer3.put(bArr4, i7, rowStride3 - 1);
    }

    public static byte[] o00oOoOo(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = ((((i2 - 1) - i4) * i) + i5) * 4;
                int i7 = bArr[i6];
                if (i7 < 0) {
                    i7 += 256;
                }
                int i8 = bArr[i6 + 1];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = bArr[i6 + 2];
                if (i9 < 0) {
                    i9 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i9, 25, (i7 * 66) + (i8 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i9, 112, (i7 * (-38)) - (i8 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i9, 18, (i7 * 112) - (i8 * 94), 128) >> 8) + 128;
                int i10 = o00oOOo02 >= 16 ? o00oOOo02 > 255 ? 255 : o00oOOo02 : 16;
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    o00oOOo04 = 0;
                } else if (o00oOOo04 > 255) {
                    o00oOOo04 = 255;
                }
                bArr2[(i4 * i) + i5] = (byte) i10;
                int i11 = ((i4 >> 1) * i) + i3 + (i5 & (-2));
                bArr2[i11 + 0] = (byte) o00oOOo04;
                bArr2[i11 + 1] = (byte) o00oOOo03;
            }
        }
        return bArr2;
    }

    public static byte[] o00oOoo0(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = ((((i2 - 1) - i4) * i) + i5) * 4;
                int i7 = bArr[i6];
                if (i7 < 0) {
                    i7 += 256;
                }
                int i8 = bArr[i6 + 1];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = bArr[i6 + 2];
                if (i9 < 0) {
                    i9 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i9, 25, (i7 * 66) + (i8 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i9, 112, (i7 * (-38)) - (i8 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i9, 18, (i7 * 112) - (i8 * 94), 128) >> 8) + 128;
                int i10 = o00oOOo02 >= 16 ? o00oOOo02 > 255 ? 255 : o00oOOo02 : 16;
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    o00oOOo04 = 0;
                } else if (o00oOOo04 > 255) {
                    o00oOOo04 = 255;
                }
                bArr2[(i4 * i) + i5] = (byte) i10;
                int i11 = ((i4 >> 1) * i) / 2;
                int i12 = i5 >> 1;
                bArr2[i3 + i11 + i12] = (byte) o00oOOo04;
                bArr2[((i3 * 5) / 4) + i11 + i12] = (byte) o00oOOo03;
            }
        }
        return bArr2;
    }

    public static ByteBuffer o00oOooO(ByteBuffer byteBuffer, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return byteBuffer;
        }
        byteBuffer.capacity();
        int i4 = i3 * i;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            byteBuffer.position(i5);
            if (z && i7 == i3 - 1) {
                i--;
            }
            try {
                byteBuffer.get(bArr, i6, i);
                i5 += i2;
                i6 += i;
            } catch (Exception e) {
                throw e;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        allocate.put(bArr);
        allocate.flip();
        return allocate;
    }

    public static byte[] o00oOooo(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3 * 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * i) + i5;
                int i7 = i6 * 4;
                int i8 = bArr[i7];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = bArr[i7 + 1];
                if (i9 < 0) {
                    i9 += 256;
                }
                int i10 = bArr[i7 + 2];
                if (i10 < 0) {
                    i10 += 256;
                }
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i10, 25, (i8 * 66) + (i9 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i10, 112, (i8 * (-38)) - (i9 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (o00oOo0O.o00oOOo0(i10, 18, (i8 * 112) - (i9 * 94), 128) >> 8) + 128;
                int i11 = o00oOOo02 >= 16 ? o00oOOo02 > 255 ? 255 : o00oOOo02 : 16;
                if (o00oOOo03 < 0) {
                    o00oOOo03 = 0;
                } else if (o00oOOo03 > 255) {
                    o00oOOo03 = 255;
                }
                if (o00oOOo04 < 0) {
                    o00oOOo04 = 0;
                } else if (o00oOOo04 > 255) {
                    o00oOOo04 = 255;
                }
                bArr2[i6] = (byte) i11;
                int i12 = (i4 >> 1) * i;
                int i13 = i5 & (-2);
                int i14 = i3 + i12 + i13;
                byte b = (byte) o00oOOo03;
                bArr2[i14 + 0] = b;
                byte b2 = (byte) o00oOOo04;
                bArr2[i14 + 1] = b2;
                int i15 = ((i3 * 3) / 2) + i12 + i13;
                bArr2[i15 + 0] = b2;
                bArr2[i15 + 1] = b;
            }
        }
        return bArr2;
    }

    public static Bitmap o00oo00O(byte[] bArr, int i, int i2) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return decodeByteArray;
    }
}
