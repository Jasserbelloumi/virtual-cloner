package o0OOoo0O;

import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.GLES20;
import com.google.android.exoplayer2.extractor.o00oOo0O;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o0O0oOO0.o0oO0Ooo;
/* loaded from: classes3.dex */
public class oO000 {
    public static void o00oOOo0(byte[] bArr, Image image) {
        int i;
        int i2;
        int i3;
        int i4;
        Image.Plane[] planes = image.getPlanes();
        int i5 = 0;
        boolean z = planes[0].getRowStride() != planes[1].getRowStride() && planes[1].getPixelStride() == 1;
        if (image.getWidth() == planes[0].getRowStride()) {
            int width = image.getWidth();
            if (z) {
                int height = image.getHeight();
                int i6 = width * height;
                byte[] bArr2 = new byte[(i6 * 3) / 2];
                int i7 = 0;
                while (i7 < height) {
                    for (int i8 = i5; i8 < width; i8++) {
                        int i9 = ((((height - 1) - i7) * width) + i8) * 4;
                        int i10 = bArr[i9];
                        if (i10 < 0) {
                            i10 += 256;
                        }
                        int i11 = bArr[i9 + 1];
                        if (i11 < 0) {
                            i11 += 256;
                        }
                        int i12 = bArr[i9 + 2];
                        if (i12 < 0) {
                            i12 += 256;
                        }
                        int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i12, 25, (i10 * 66) + (i11 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                        int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i12, 112, (i10 * (-38)) - (i11 * 74), 128) >> 8) + 128;
                        int o00oOOo04 = (o00oOo0O.o00oOOo0(i12, 18, (i10 * 112) - (i11 * 94), 128) >> 8) + 128;
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
                            o00oOOo04 = 0;
                        } else if (o00oOOo04 > 255) {
                            o00oOOo04 = 255;
                        }
                        bArr2[(i7 * width) + i8] = (byte) o00oOOo02;
                        int i13 = ((i7 >> 1) * width) / 2;
                        int i14 = i8 >> 1;
                        bArr2[i6 + i13 + i14] = (byte) o00oOOo03;
                        bArr2[((i6 * 5) / 4) + i13 + i14] = (byte) o00oOOo04;
                    }
                    i7++;
                    i5 = 0;
                }
                Image.Plane[] planes2 = image.getPlanes();
                ByteBuffer buffer = planes2[0].getBuffer();
                buffer.clear();
                buffer.put(bArr2, 0, i6);
                ByteBuffer buffer2 = planes2[1].getBuffer();
                buffer2.clear();
                float f = width;
                float f2 = height;
                int i15 = (int) (0.25f * f * f2);
                buffer2.put(bArr2, i6, i15);
                ByteBuffer buffer3 = planes2[2].getBuffer();
                buffer3.clear();
                buffer3.put(bArr2, (int) (f * 1.25f * f2), i15);
                return;
            }
            int height2 = image.getHeight();
            int i16 = width * height2;
            byte[] bArr3 = new byte[i16 * 2];
            for (int i17 = 0; i17 < height2; i17++) {
                for (int i18 = 0; i18 < width; i18++) {
                    int i19 = ((((height2 - 1) - i17) * width) + i18) * 4;
                    int i20 = bArr[i19];
                    if (i20 < 0) {
                        i20 += 256;
                    }
                    int i21 = bArr[i19 + 1];
                    if (i21 < 0) {
                        i21 += 256;
                    }
                    int i22 = bArr[i19 + 2];
                    if (i22 < 0) {
                        i22 += 256;
                    }
                    int o00oOOo05 = (o0oO0Ooo.o00oOOo0(i22, 25, (i20 * 66) + (i21 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                    int o00oOOo06 = (o0oO0Ooo.o00oOOo0(i22, 112, (i20 * (-38)) - (i21 * 74), 128) >> 8) + 128;
                    int o00oOOo07 = (o00oOo0O.o00oOOo0(i22, 18, (i20 * 112) - (i21 * 94), 128) >> 8) + 128;
                    if (o00oOOo05 < 16) {
                        o00oOOo05 = 16;
                    } else if (o00oOOo05 > 255) {
                        o00oOOo05 = 255;
                    }
                    if (o00oOOo06 < 0) {
                        o00oOOo06 = 0;
                    } else if (o00oOOo06 > 255) {
                        o00oOOo06 = 255;
                    }
                    if (o00oOOo07 < 0) {
                        o00oOOo07 = 0;
                    } else if (o00oOOo07 > 255) {
                        o00oOOo07 = 255;
                    }
                    bArr3[(i17 * width) + i18] = (byte) o00oOOo05;
                    int i23 = (i17 >> 1) * width;
                    int i24 = i18 & (-2);
                    int i25 = i16 + i23 + i24;
                    byte b = (byte) o00oOOo06;
                    bArr3[i25 + 0] = b;
                    byte b2 = (byte) o00oOOo07;
                    bArr3[i25 + 1] = b2;
                    int i26 = ((i16 * 3) / 2) + i23 + i24;
                    bArr3[i26 + 0] = b2;
                    bArr3[i26 + 1] = b;
                }
            }
            Image.Plane[] planes3 = image.getPlanes();
            ByteBuffer buffer4 = planes3[0].getBuffer();
            buffer4.clear();
            buffer4.put(bArr3, 0, i16);
            ByteBuffer buffer5 = planes3[1].getBuffer();
            buffer5.clear();
            int i27 = ((int) ((width * 0.5f) * height2)) - 1;
            buffer5.put(bArr3, i16, i27);
            ByteBuffer buffer6 = planes3[2].getBuffer();
            buffer6.clear();
            buffer6.put(bArr3, (int) (width * 1.5d * height2), i27);
            return;
        }
        int width2 = image.getWidth();
        if (z) {
            int height3 = image.getHeight();
            Image.Plane[] planes4 = image.getPlanes();
            int rowStride = (planes4[0].getRowStride() * height3) - (planes4[0].getRowStride() - width2);
            byte[] bArr4 = new byte[rowStride];
            int rowStride2 = ((planes4[1].getRowStride() * height3) / 4) - (planes4[1].getRowStride() - width2);
            byte[] bArr5 = new byte[rowStride2];
            int rowStride3 = ((planes4[2].getRowStride() * height3) / 4) - (planes4[2].getRowStride() - width2);
            byte[] bArr6 = new byte[rowStride3];
            int i28 = 16;
            int i29 = 0;
            int i30 = 0;
            while (i29 < height3) {
                while (i30 < width2) {
                    int i31 = ((((height3 - 1) - i29) * width2) + i30) * 4;
                    int i32 = bArr[i31];
                    if (i32 < 0) {
                        i32 += 256;
                    }
                    int i33 = bArr[i31 + 1];
                    if (i33 < 0) {
                        i33 += 256;
                    }
                    int i34 = bArr[i31 + 2];
                    if (i34 < 0) {
                        i34 += 256;
                    }
                    int i35 = height3;
                    int i36 = width2;
                    int o00oOOo08 = (o0oO0Ooo.o00oOOo0(i34, 25, (i32 * 66) + (i33 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + i28;
                    int o00oOOo09 = (o0oO0Ooo.o00oOOo0(i34, 112, (i32 * (-38)) - (i33 * 74), 128) >> 8) + 128;
                    int o00oOOo010 = (o00oOo0O.o00oOOo0(i34, 18, (i32 * 112) - (i33 * 94), 128) >> 8) + 128;
                    if (o00oOOo08 < 16) {
                        i4 = 255;
                        i3 = 16;
                    } else {
                        i3 = 255;
                        if (o00oOOo08 > 255) {
                            i4 = 255;
                        } else {
                            i3 = o00oOOo08;
                            i4 = 255;
                        }
                    }
                    if (o00oOOo09 < 0) {
                        o00oOOo09 = 0;
                    } else if (o00oOOo09 > i4) {
                        o00oOOo09 = i4;
                    }
                    if (o00oOOo010 < 0) {
                        o00oOOo010 = 0;
                    } else if (o00oOOo010 > i4) {
                        o00oOOo010 = 255;
                    }
                    bArr4[(planes4[0].getRowStride() * i29) + i30] = (byte) i3;
                    int i37 = i29 >> 1;
                    int i38 = i30 >> 1;
                    bArr5[((planes4[1].getRowStride() * i37) / 2) + i38] = (byte) o00oOOo09;
                    bArr6[((planes4[1].getRowStride() * i37) / 2) + i38] = (byte) o00oOOo010;
                    i30++;
                    i28 = 16;
                    height3 = i35;
                    width2 = i36;
                }
                i29++;
                i30 = 0;
                i28 = 16;
            }
            ByteBuffer buffer7 = planes4[i30].getBuffer();
            buffer7.clear();
            buffer7.put(bArr4, i30, rowStride);
            ByteBuffer buffer8 = planes4[1].getBuffer();
            buffer8.clear();
            buffer8.put(bArr5, i30, rowStride2);
            ByteBuffer buffer9 = planes4[2].getBuffer();
            buffer9.clear();
            buffer9.put(bArr6, i30, rowStride3);
            return;
        }
        int i39 = width2;
        int height4 = image.getHeight();
        Image.Plane[] planes5 = image.getPlanes();
        int rowStride4 = (planes5[0].getRowStride() * height4) - (planes5[0].getRowStride() - i39);
        byte[] bArr7 = new byte[rowStride4];
        int rowStride5 = ((planes5[1].getRowStride() * height4) / 2) - (planes5[1].getRowStride() - i39);
        byte[] bArr8 = new byte[rowStride5];
        int rowStride6 = ((planes5[2].getRowStride() * height4) / 2) - (planes5[2].getRowStride() - i39);
        byte[] bArr9 = new byte[rowStride6];
        System.currentTimeMillis();
        for (int i40 = 0; i40 < height4; i40++) {
            int i41 = 0;
            while (true) {
                i = i39;
                if (i41 < i) {
                    int i42 = ((((height4 - 1) - i40) * i) + i41) * 4;
                    int i43 = bArr[i42];
                    if (i43 < 0) {
                        i43 += 256;
                    }
                    int i44 = bArr[i42 + 1];
                    if (i44 < 0) {
                        i44 += 256;
                    }
                    int i45 = bArr[i42 + 2];
                    if (i45 < 0) {
                        i45 += 256;
                    }
                    int i46 = height4;
                    int o00oOOo011 = (o0oO0Ooo.o00oOOo0(i45, 25, (i43 * 66) + (i44 * TsExtractor.TS_STREAM_TYPE_AC3), 128) >> 8) + 16;
                    i39 = i;
                    int o00oOOo012 = (o0oO0Ooo.o00oOOo0(i45, 112, (i43 * (-38)) - (i44 * 74), 128) >> 8) + 128;
                    int o00oOOo013 = (o00oOo0O.o00oOOo0(i45, 18, (i43 * 112) - (i44 * 94), 128) >> 8) + 128;
                    int i47 = 16;
                    if (o00oOOo011 < 16) {
                        i2 = 255;
                    } else {
                        i47 = 255;
                        if (o00oOOo011 > 255) {
                            i2 = 255;
                        } else {
                            i47 = o00oOOo011;
                            i2 = 255;
                        }
                    }
                    if (o00oOOo012 < 0) {
                        o00oOOo012 = 0;
                    } else if (o00oOOo012 > i2) {
                        o00oOOo012 = i2;
                    }
                    if (o00oOOo013 < 0) {
                        o00oOOo013 = 0;
                    } else if (o00oOOo013 > i2) {
                        o00oOOo013 = i2;
                    }
                    bArr7[(planes5[0].getRowStride() * i40) + i41] = (byte) i47;
                    int i48 = i40 >> 1;
                    int i49 = i41 & (-2);
                    byte b3 = (byte) o00oOOo012;
                    bArr8[(planes5[1].getRowStride() * i48) + i49 + 0] = b3;
                    byte b4 = (byte) o00oOOo013;
                    bArr8[(planes5[1].getRowStride() * i48) + i49 + 1] = b4;
                    bArr9[(planes5[2].getRowStride() * i48) + i49 + 0] = b4;
                    bArr9[(planes5[2].getRowStride() * i48) + i49 + 1] = b3;
                    i41++;
                    height4 = i46;
                }
            }
            i39 = i;
        }
        ByteBuffer buffer10 = planes5[0].getBuffer();
        buffer10.clear();
        buffer10.put(bArr7, 0, rowStride4);
        ByteBuffer buffer11 = planes5[1].getBuffer();
        buffer11.clear();
        buffer11.put(bArr8, 0, rowStride5 - 1);
        ByteBuffer buffer12 = planes5[2].getBuffer();
        buffer12.clear();
        buffer12.put(bArr9, 0, rowStride6 - 1);
    }

    public static int o00oOOoO(int i, int i2, int i3, int i4) {
        return o0oO0Ooo.o00oOOo0(i, i2, i3, i4);
    }

    public static ByteBuffer o00oOo00(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer order = ByteBuffer.allocateDirect(i4 * i5 * 4).order(ByteOrder.nativeOrder());
        GLES20.glReadPixels(i2, i3, i4, i5, o0OOo000.f15118o00oo0OO, 5121, order);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return order;
    }

    public static ByteBuffer o00oOo0O(int i, int i2, int i3, int i4) {
        ByteBuffer order = ByteBuffer.allocateDirect(i3 * i4 * 4).order(ByteOrder.nativeOrder());
        GLES20.glReadPixels(i, i2, i3, i4, o0OOo000.f15118o00oo0OO, 5121, order);
        return order;
    }

    public static ByteBuffer o00oOo0o(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer order = ByteBuffer.allocateDirect(i4 * i5 * 3).order(ByteOrder.nativeOrder());
        GLES20.glReadPixels(i2, i3, i4, i5, 6407, 5121, order);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return order;
    }

    public static Bitmap o00oOooO(int i, int i2, int i3, int i4) {
        ByteBuffer order = ByteBuffer.allocateDirect(i3 * i4 * 4).order(ByteOrder.nativeOrder());
        GLES20.glReadPixels(i, i2, i3, i4, o0OOo000.f15118o00oo0OO, 5121, order);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(order);
        return createBitmap;
    }
}
