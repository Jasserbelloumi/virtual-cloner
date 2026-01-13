package o0OOoo0O;

import android.annotation.SuppressLint;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class oO000Oo implements Runnable {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final boolean f15166o00ooOO = false;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final long f15168o00ooOOo = 10000;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f15169o00ooOo = 2;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f15170o00ooOo0 = 1;

    /* renamed from: o00oo  reason: collision with root package name */
    public Surface f15173o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public LinkedBlockingQueue<byte[]> f15174o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public oO000O0O f15176o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public String f15177o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Throwable f15179o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o00oOo0O f15182o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Thread f15185o0O0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f15167o00ooOO0 = o00oo.o00oOOo0(new byte[]{-117, 1, -92, -65, -82, -106, -69, -5, -81, 9, -83, -65, -78}, new byte[]{-35, 104, -64, -38, -63, -62, -44, -67});

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static ImageReader f15171o00ooOoO = null;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static boolean f15172o00ooOoo = false;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f15175o00oo0O0 = 2135033992;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f15178o00oo0o0 = false;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public ImageReader f15181o00ooO0 = null;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public oO00000 f15183o00ooO0O = null;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f15184o00ooO0o = false;

    /* renamed from: o00ooO  reason: collision with root package name */
    public ImageReader.OnImageAvailableListener f15180o00ooO = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements ImageReader.OnImageAvailableListener {
        public o00oOOo0() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            oO000Oo oo000oo;
            Image acquireNextImage = imageReader.acquireNextImage();
            try {
                oo000oo = oO000Oo.this;
            } finally {
                try {
                } finally {
                }
            }
            if (oo000oo.f15178o00oo0o0) {
                return;
            }
            ImageReader imageReader2 = oO0Oo.f15257o00oo0OO.get(oo000oo.f15173o00oo);
            if (imageReader2 == null) {
                return;
            }
            oO000Oo oo000oo2 = oO000Oo.this;
            if (oo000oo2.f15184o00ooO0o) {
                return;
            }
            if (acquireNextImage == null) {
                o00oo.o00oOOo0(new byte[]{37, -47, 38, 98, -18}, new byte[]{Ascii.DC4, -32, Ascii.ETB, 83, -33, 94, -27, 120});
                o00oo.o00oOOo0(new byte[]{101, 95, -49, -22, -22, -61, -96, -110, 124, 80, -17, -21, -22, -58, -87, -74, 42, 72, -13, -15, -62, -55, -92, -76, 111, 17, -17, -12, -85, -54, -80, -65, 102, Ascii.US, -88}, new byte[]{10, 49, -122, -121, -117, -92, -59, -45});
                return;
            }
            oO000Oo.f15171o00ooOoO = imageReader2;
            oo000oo2.f15183o00ooO0O.o00oOooO(acquireNextImage, imageReader2, oo000oo2);
            oO000Oo.this.f15184o00ooO0o = true;
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends XC_MethodHook {
        public o00oOOoO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (Log.getStackTraceString(new Throwable()).contains(oO00000.class.getCanonicalName())) {
                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{51, -79, 115, -71, -108, 67, 101, -72, 63, -79, 100, -83, -110, 94, 94, -80, Ascii.DC2, -73, 117, -24, -116, 99, 122, -68, Ascii.DC4, -75, 66, -83, Byte.MIN_VALUE, 75, 115, -72, 1, -119, 101, -66, -75, 69, 93, -83, Ascii.DC4, -22}, new byte[]{115, -48, Ascii.DLE, -56, -31, 42, Ascii.ETB, -35}) + oO000Oo.this.f15183o00ooO0O);
                methodHookParam.setResult(oO000Oo.this.f15183o00ooO0O.o00oOo00());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends XC_MethodHook {
        public o00oOo00() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (Log.getStackTraceString(new Throwable()).contains(oO00000.class.getCanonicalName())) {
                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{3, -82, -62, Ascii.DLE, 52, -38, 37, -47, Ascii.CR, -86, -39, Ascii.NAK, 8, -34, 54, -45, 38, -17, -52, 40, 44, -46, 48, -47, 17, -86, -64, 0, 37, -42, 37, -19, 54, -71, -11, Ascii.SO, Ascii.VT, -61, 48, -114}, new byte[]{67, -49, -95, 97, 65, -77, 87, -76}) + oO000Oo.this.f15183o00ooO0O);
                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-29, 118, 59, 103, Ascii.RS, -81, -123, oo0OOoo.f13516o00oOoO, -19, 114, 32, 98, 34, -85, -106, 63, -58, 55, 53, 95, 6, -89, -112, oo0OOoo.f13516o00oOoO, -15, 114, 57, 119, Ascii.SI, -93, -123, 1, -42, 97, Ascii.FF, 121, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -74, -112, 98}, new byte[]{-93, Ascii.ETB, 88, Ascii.SYN, 107, -58, -9, 88}) + oO000Oo.this.f15183o00ooO0O + o00oo.o00oOOo0(new byte[]{-96, -18, 68, -14, -112, 88, -73}, new byte[]{-116, -98, 54, -99, -24, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -115, 9}) + oO000Oo.this.f15183o00ooO0O.o00oOo00() + o00oo.o00oOOo0(new byte[]{110, -16, -114, 119, -125, 89, Ascii.EM}, new byte[]{66, -110, -5, 17, -26, 43, 35, -25}) + oO000Oo.this.f15183o00ooO0O.o00oOo00().getPlanes()[0].getBuffer());
                methodHookParam.setResult(oO000Oo.this.f15183o00ooO0O.o00oOo00());
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOo0O {
        void o00oOOo0(int i);

        void o00oOOoO();
    }

    public static byte[] o00oOo0o(Image image, int i) {
        Rect rect;
        int i2;
        int i3 = i;
        int i4 = 2;
        int i5 = 1;
        if (i3 == 1 || i3 == 2) {
            if (!o00oOoOO(image)) {
                throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-75, 38, 122, -120, -44, -63, 68, -38, -72, 49, 113, -35, -44, -63, 110, -40, -73, 32, 113, -113, -44, -114, 7, -41, -81, 51, 113, -113, -63, -109, 85, -44, -81, 107, 52, -55, -49, -109, 74, -44, -94, 103}, new byte[]{-42, 71, Ascii.DC4, -81, -96, -31, 39, -75}) + image.getFormat());
            }
            Rect cropRect = image.getCropRect();
            int format = image.getFormat();
            int width = cropRect.width();
            int height = cropRect.height();
            Image.Plane[] planes = image.getPlanes();
            int i6 = width * height;
            byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i6) / 8];
            int i7 = 0;
            byte[] bArr2 = new byte[planes[0].getRowStride()];
            int i8 = 1;
            int i9 = 0;
            int i10 = 0;
            while (i9 < planes.length) {
                if (i9 == 0) {
                    i8 = i5;
                    i10 = i7;
                } else if (i9 != i5) {
                    if (i9 == i4) {
                        if (i3 == i5) {
                            i10 = (int) (i6 * 1.25d);
                            i8 = i5;
                        } else if (i3 == i4) {
                            i8 = i4;
                            i10 = i6;
                        }
                    }
                } else if (i3 == i5) {
                    i8 = i5;
                    i10 = i6;
                } else if (i3 == i4) {
                    i10 = i6 + 1;
                    i8 = i4;
                }
                ByteBuffer buffer = planes[i9].getBuffer();
                int rowStride = planes[i9].getRowStride();
                int pixelStride = planes[i9].getPixelStride();
                int i11 = i9 == 0 ? i7 : i5;
                int i12 = width >> i11;
                int i13 = height >> i11;
                int i14 = width;
                buffer.position(((cropRect.left >> i11) * pixelStride) + ((cropRect.top >> i11) * rowStride));
                int i15 = 0;
                while (i15 < i13) {
                    if (pixelStride == 1 && i8 == 1) {
                        buffer.get(bArr, i10, i12);
                        i10 += i12;
                        rect = cropRect;
                        i2 = i12;
                    } else {
                        rect = cropRect;
                        i2 = ((i12 - 1) * pixelStride) + 1;
                        buffer.get(bArr2, 0, i2);
                        for (int i16 = 0; i16 < i12; i16++) {
                            bArr[i10] = bArr2[i16 * pixelStride];
                            i10 += i8;
                        }
                    }
                    if (i15 < i13 - 1) {
                        buffer.position((buffer.position() + rowStride) - i2);
                    }
                    i15++;
                    cropRect = rect;
                }
                i9++;
                i3 = i;
                width = i14;
                i4 = 2;
                i5 = 1;
                i7 = 0;
            }
            return bArr;
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -77, 69, -24, 78, 107, 10, 54, 95, -78, 91, -27, 78, 91, 48, 10, 96, -113, 118, -41, 1, 106, Ascii.DC2, 39, 91, -108, Ascii.GS, -93, 94, 56, Ascii.RS, 40, 75, -3, 106, -34, 34, 87, 45, Ascii.EM, 105, -78, 91, -4, Ascii.SI, 108, 49, Ascii.DLE, Ascii.GS, -20}, new byte[]{47, -35, 41, -111, 110, Ascii.CAN, Byte.MAX_VALUE, 70}));
    }

    public static boolean o00oOoOO(Image image) {
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }

    public static int o00oOoOo(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString(o00oo.o00oOOo0(new byte[]{124, -116, -2, -97}, new byte[]{17, -27, -109, -6, 86, -17, -48, Ascii.RS})).startsWith(o00oo.o00oOOo0(new byte[]{-112, Ascii.CR, -111, -22, 53, -9}, new byte[]{-26, 100, -11, -113, 90, -40, Ascii.SO, -8}))) {
                return i;
            }
        }
        return -1;
    }

    public final void o00oOo0O(MediaCodec mediaCodec, MediaExtractor mediaExtractor, MediaFormat mediaFormat) {
        Surface surface;
        long j;
        int dequeueInputBuffer;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ImageReader imageReader = oO0Oo.f15257o00oo0OO.get(this.f15173o00oo);
        if (!this.f15176o00oo0Oo.equals(oO000O0O.JPEG) || imageReader == null) {
            surface = this.f15173o00oo;
        } else {
            this.f15181o00ooO0 = ImageReader.newInstance(imageReader.getWidth(), imageReader.getHeight(), 35, imageReader.getMaxImages());
            if (this.f15183o00ooO0O == null) {
                this.f15183o00ooO0O = oO00000.o00oOOo0();
            }
            this.f15181o00ooO0.setOnImageAvailableListener(this.f15180o00ooO, new Handler(Looper.getMainLooper()));
            surface = this.f15181o00ooO0.getSurface();
        }
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        mediaCodec.start();
        mediaFormat.getInteger(o00oo.o00oOOo0(new byte[]{36, 124, Ascii.GS, 86, -41}, new byte[]{83, Ascii.NAK, 121, 34, -65, -26, 110, -10}));
        mediaFormat.getInteger(o00oo.o00oOOo0(new byte[]{73, 121, 6, -73, Ascii.DLE, 43}, new byte[]{o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.FS, 111, -48, 120, 95, 57, 76}));
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        long j2 = 0;
        while (!z && !this.f15178o00oo0o0) {
            if (z2 || (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L)) < 0) {
                j = 10000;
            } else {
                int readSampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData < 0) {
                    j = 10000;
                    z2 = true;
                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } else {
                    j = 10000;
                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                }
            }
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer >= 0) {
                boolean z4 = (bufferInfo.flags & 4) != 0 ? true : z;
                if (bufferInfo.size != 0) {
                    int i2 = i + 1;
                    o00oOo0O o00ooo0o2 = this.f15182o00ooO00;
                    if (o00ooo0o2 != null) {
                        o00ooo0o2.o00oOOo0(i2);
                    }
                    if (!z3) {
                        j2 = System.currentTimeMillis();
                        z3 = true;
                    }
                    if (this.f15173o00oo == null) {
                        Image outputImage = mediaCodec.getOutputImage(dequeueOutputBuffer);
                        ByteBuffer buffer = outputImage.getPlanes()[0].getBuffer();
                        byte[] bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                        LinkedBlockingQueue<byte[]> linkedBlockingQueue = this.f15174o00oo0O;
                        if (linkedBlockingQueue != null) {
                            try {
                                linkedBlockingQueue.put(bArr);
                            } catch (InterruptedException e) {
                                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.DLE, -125, 98, Ascii.CAN, 84, Ascii.CR, -100, 66, 1}, new byte[]{-62, -112, 19, 52, 91, Ascii.NAK, SignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE}) + e.toString());
                            }
                        }
                        if (this.f15176o00oo0Oo != null) {
                            oO0Oo.f15251o00oOooo = o00oOo0o(outputImage, 2);
                        }
                        outputImage.close();
                    }
                    long currentTimeMillis = (bufferInfo.presentationTimeUs / 1000) - (System.currentTimeMillis() - j2);
                    if (currentTimeMillis > 0) {
                        try {
                            Thread.sleep(currentTimeMillis);
                        } catch (InterruptedException e2) {
                            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-27, 86, 108, 38, 121, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -118, 94, -122, 71}, new byte[]{6, -42, -4, 112, 58, 96, -57, -67}) + e2.toString());
                            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-114, Ascii.SO, -31, -27, Ascii.FS, 97, 68, -84, -19, Ascii.US, -106, 9, -32, -57, -95, -60, -120, 53, -57, 91, -32, -65, -20, -56, -41, 103, -27, 42}, new byte[]{109, -114, 113, -77, 95, 32, 9, 79}));
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    z = z4;
                    i = i2;
                } else {
                    z = z4;
                }
            }
        }
        o00oOo0O o00ooo0o3 = this.f15182o00ooO00;
        if (o00ooo0o3 != null) {
            o00ooo0o3.o00oOOoO();
        }
    }

    public final boolean o00oOoO(int i, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i2 : codecCapabilities.colorFormats) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final void o00oOoO0() {
        if (f15172o00ooOoo) {
            return;
        }
        f15172o00ooOoo = true;
        XposedHelpers.findAndHookMethod(ImageReader.class, o00oo.o00oOOo0(new byte[]{51, 85, oo0OOoo.f13516o00oOoO, 35, -105, -44, 71, Ascii.SI, 51, 66, 41, 37, -118, -17, 79, 34, 53, 83}, new byte[]{82, 54, 76, 86, -2, -90, 34, 67}), new Object[]{new o00oOOoO()});
        XposedHelpers.findAndHookMethod(ImageReader.class, o00oo.o00oOOo0(new byte[]{-120, 37, -71, 92, Ascii.SYN, 99, 34, 108, -116, 62, -68, 96, Ascii.DC2, 112, 32, 71}, new byte[]{-23, 70, -56, 41, Byte.MAX_VALUE, 17, 71, 34}), new Object[]{new o00oOo00()});
    }

    public void o00oOoo0(o00oOo0O o00ooo0o2) {
        this.f15182o00ooO00 = o00ooo0o2;
    }

    public void o00oOooO(String str) throws Throwable {
        this.f15177o00oo0o = str;
        if (this.f15185o0O0o == null) {
            Thread thread = new Thread(this, o00oo.o00oOOo0(new byte[]{-112, 68, 38, Ascii.VT, -118, 45}, new byte[]{-12, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 69, 100, -18, 72, -22, -47}));
            this.f15185o0O0o = thread;
            thread.start();
            Throwable th = this.f15179o00oo0oO;
            if (th != null) {
                throw th;
            }
        }
    }

    public void o00oOooo(LinkedBlockingQueue<byte[]> linkedBlockingQueue) {
        this.f15174o00oo0O = linkedBlockingQueue;
    }

    public void o00oo0(Surface surface) {
        if (surface != null) {
            this.f15173o00oo = surface;
        }
    }

    public void o00oo00O(String str, oO000O0O oo000o0o) throws IOException {
        this.f15176o00oo0Oo = oo000o0o;
    }

    @SuppressLint({"WrongConstant"})
    public void o00oo0O(String str) throws IOException {
        Throwable th;
        Exception exc;
        oO00000 oo00000;
        String o00oOOo02;
        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-52, 70, 83, 85, -125, -70, -68, -103, -81, 87, 32, -125, 80, -97, -108, Ascii.EM, SignedBytes.MAX_POWER_OF_TWO, -94, -90, 113, 35, 123, 96, -97, -109, 70, 38, -92, 75, 19, 86, -39, -56, 102, 66}, new byte[]{47, -58, -61, 3, -64, -5, -15, 122}));
        MediaExtractor mediaExtractor = null;
        MediaCodec mediaCodec = null;
        try {
            try {
                new File(str);
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    mediaExtractor2.setDataSource(str);
                    int o00oOoOo2 = o00oOoOo(mediaExtractor2);
                    if (o00oOoOo2 < 0) {
                        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-13, 56, Ascii.CAN, -114, -77, 45, -84, -106, -112, 41, 107, 88, 96, 8, -124, Ascii.SYN, Byte.MAX_VALUE, -36, -19, -86, 19, -20, 112, 59, Byte.MAX_VALUE, -104, -2, -79, -108, 9, -114, 85, 100, -54, -23, -69, -101, 76, -121, Ascii.SUB, 101, -42, -20, -8, -103, 2, -63}, new byte[]{Ascii.DLE, -72, -120, -40, -16, 108, -31, 117}) + str);
                    }
                    mediaExtractor2.selectTrack(o00oOoOo2);
                    MediaFormat trackFormat = mediaExtractor2.getTrackFormat(o00oOoOo2);
                    String string = trackFormat.getString(o00oo.o00oOOo0(new byte[]{85, -10, 126, 47}, new byte[]{56, -97, 19, 74, Ascii.SYN, 73, -117, -9}));
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
                    try {
                        o00oo0OO(createDecoderByType.getCodecInfo().getCapabilitiesForType(string));
                        if (o00oOoO(2135033992, createDecoderByType.getCodecInfo().getCapabilitiesForType(string))) {
                            trackFormat.setInteger(o00oo.o00oOOo0(new byte[]{Ascii.FS, 42, 80, -89, 59, -97, -50, 48, Ascii.CR, 40, 93, -68}, new byte[]{Byte.MAX_VALUE, 69, 60, -56, 73, -78, -88, 95}), 2135033992);
                            o00oOOo02 = o00oo.o00oOOo0(new byte[]{-65, -108, -75, 101, Ascii.VT, -99, -39, 66, -36, -123, -58, -77, -40, -72, -15, -62, 51, 112, SignedBytes.MAX_POWER_OF_TWO, 65, -85, 92, 5, -46, 57, 96, 5, 87, 45, -65, -5, -59, 57, 52, 70, 92, 36, -77, -26, -127, 58, 123, 87, 94, 41, -88, -76, -43, 51, 52, 81, 74, 56, -71, -76, -109, 109, 39, Ascii.DLE, 3, 123, -17, -83, -104, 110}, new byte[]{92, Ascii.DC4, 37, 51, 72, -36, -108, -95});
                        } else {
                            o00oo.o00oOOo0(new byte[]{-12, 88, 51, 103, 97, -103, -96, -71, -18, Ascii.SYN, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 96, 121, -36, -28, -88, -30, 89, 54, 96, 45, -97, -17, -95, -18, 68, 114, 99, 98, -114, -19, -84, -11, Ascii.SUB, 114, 102, 98, -112, -17, -65, -95, 80, oo0OOoo.f13516o00oOoO, 119, 96, -99, -12, -19, -11, 79, 34, 96, 45, -50, -79, -2, -76, 6, 97, 54, 52, -59, -78, -19, -17, 89, 38, 37, 126, -119, -16, -67, -18, 68, 38, 96, 105}, new byte[]{-127, 54, 82, 5, Ascii.CR, -4, Byte.MIN_VALUE, -51});
                            o00oOOo02 = o00oo.o00oOOo0(new byte[]{9, Byte.MIN_VALUE, -49, 90, 85, -96, -19, 49, 106, -111, -68, -116, -122, -123, -59, -79, -123, 100, 58, 126, -11, 97, 49, -89, -124, 97, oo0OOoo.f13516o00oOoO, 96, 115, -63, -44, -67, -54, 115, 58, 120, 54, -123, -59, -79, -123, 100, 58, 44, 117, -114, -52, -67, -104, 32, 57, 99, 100, -116, -63, -90, -58, 32, 60, 99, 122, -114, -46, -14, -116, 111, 45, 97, 119, -107, Byte.MIN_VALUE, -90, -109, 112, 58, 44, 36, -48, -109, -25, -38, 51, 108, 53, 47, -45, Byte.MIN_VALUE, -68, -123, 116, Byte.MAX_VALUE, Byte.MAX_VALUE, 99, -111, -48, -67, -104, 116, 58, 104}, new byte[]{-22, 0, 95, Ascii.FF, Ascii.SYN, -31, -96, -46});
                        }
                        oO0O0O0o.o00oOOo0(o00oOOo02);
                        o00oOo0O(createDecoderByType, mediaExtractor2, trackFormat);
                        createDecoderByType.stop();
                        while (!this.f15178o00oo0o0) {
                            mediaExtractor2.seekTo(0L, 0);
                            o00oOo0O(createDecoderByType, mediaExtractor2, trackFormat);
                            createDecoderByType.stop();
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        mediaExtractor2.release();
                        oo00000 = this.f15183o00ooO0O;
                        if (oo00000 == null) {
                            return;
                        }
                    } catch (Exception e) {
                        exc = e;
                        mediaCodec = createDecoderByType;
                        mediaExtractor = mediaExtractor2;
                        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{67, -127, Ascii.RS, -39, Ascii.NAK, 108, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 6, 32, -112, -43, -7, 63, 73, 9, -118, -58, 104, -30, -22, Ascii.VT}, new byte[]{-96, 1, -114, -113, 86, 45, 108, -27}) + exc.toString());
                        if (mediaCodec != null) {
                            mediaCodec.stop();
                            mediaCodec.release();
                        }
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        oo00000 = this.f15183o00ooO0O;
                        if (oo00000 == null) {
                            return;
                        }
                        oo00000.o00oOOoO();
                        this.f15183o00ooO0O = null;
                    } catch (Throwable th2) {
                        th = th2;
                        mediaCodec = createDecoderByType;
                        mediaExtractor = mediaExtractor2;
                        if (mediaCodec != null) {
                            mediaCodec.stop();
                            mediaCodec.release();
                        }
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        oO00000 oo000002 = this.f15183o00ooO0O;
                        if (oo000002 != null) {
                            try {
                                oo000002.o00oOOoO();
                            } catch (Throwable unused) {
                            }
                            this.f15183o00ooO0O = null;
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    exc = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e3) {
                exc = e3;
            }
            try {
                oo00000.o00oOOoO();
            } catch (Throwable unused2) {
            }
            this.f15183o00ooO0O = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void o00oo0O0() {
        this.f15178o00oo0o0 = true;
    }

    public final void o00oo0OO(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[] iArr;
        System.out.print(o00oo.o00oOOo0(new byte[]{47, -119, -89, -49, 43, 98, -30, Ascii.VT, 56, -36, -76, -48, 40, Byte.MAX_VALUE, -28, 78, 58, -109, -91, -46, 37, 100, -84, 78}, new byte[]{92, -4, -41, -65, 68, Ascii.DLE, -106, 110}));
        for (int i : codecCapabilities.colorFormats) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            o00oo0O(this.f15177o00oo0o);
        } catch (Throwable th) {
            this.f15179o00oo0oO = th;
        }
    }
}
