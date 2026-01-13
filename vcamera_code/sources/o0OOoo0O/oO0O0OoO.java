package o0OOoo0O;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import o0O0oOO0.o0oO0Ooo;
import o0OO0o.o0O0oo0o;
import o0OO0ooO.o0O0o00O;
import o0OOO0oo.oo0OOoo;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00072\u00020\u0001:\u0001\u000eB'\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0 \u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J(\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J(\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J(\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u00106\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u0006;"}, d2 = {"Lo0OOoo0O/oO0O0OoO;", "", "Lo0OO0o/oO0Ooooo;", "o00oo00O", "", "width", "height", "o00oOoo0", "o00oOoO0", "Landroid/graphics/Bitmap;", "bitmapFirst", "o00oOooo", "", "frameIndex", "o00oOOo0", "", "endOfStream", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", o0OO000o.o00oOOoO.f12961o00oOo00, "inputWidth", "inputHeight", "scaled", "", "o00oOoOO", "yuv420sp", "", "argb", "o00oOo0o", "o00oOo00", "o00oOo0O", "o00oOooO", "Lo0OOoo0O/o0oo0000;", "Lo0OOoo0O/o0oo0000;", "IProvider", "Ljava/io/File;", "Ljava/io/File;", "out", "I", "mFrameRate", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", "mediaMuxer", "Z", "mMuxerStarted", "isRunning", "o00oOoO", "mTrackIndex", "colorFormat", "o00oOoOo", "J", "defaultTimeOutUs", "()[I", "mediaCodecList", "<init>", "(Lo0OOoo0O/o0oo0000;Ljava/io/File;I)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class oO0O0OoO {
    @NotNull

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final o00oOOo0 f15232o00oOoo0 = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0oo0000<Bitmap> f15233o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final File f15234o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f15235o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public MediaMuxer f15236o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f15237o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f15238o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f15239o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f15240o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final long f15241o00oOoOo;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public MediaCodec f15242o00oOooO;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lo0OOoo0O/oO0O0OoO$o00oOOo0;", "", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o00ooO0
        @NotNull
        public final MediaCodecInfo.CodecCapabilities o00oOOo0() {
            int codecCount = MediaCodecList.getCodecCount();
            MediaCodecInfo mediaCodecInfo = null;
            int i = 0;
            while (i < codecCount && mediaCodecInfo == null) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    boolean z = false;
                    for (int i2 = 0; i2 < supportedTypes.length && !z; i2++) {
                        if (o0ooO.o00oOoO0(supportedTypes[i2], o00oo.o00oOOo0(new byte[]{51, -62, -112, -16, 40, 119, Ascii.FS, -26, 38}, new byte[]{69, -85, -12, -107, 71, 88, 125, -112}))) {
                            z = true;
                        }
                    }
                    if (z) {
                        i++;
                        mediaCodecInfo = codecInfoAt;
                    }
                }
                i++;
            }
            o0ooO.o00oo00O(mediaCodecInfo);
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(o00oo.o00oOOo0(new byte[]{-114, 91, 53, 42, 58, 85, Ascii.ETB, -51, -101}, new byte[]{-8, 50, 81, 79, 85, 122, 118, -69}));
            o0ooO.o00oo0OO(capabilitiesForType, o00oo.o00oOOo0(new byte[]{6, 96, 82, 124, -78, -78, Ascii.SI, -32, 17, 104, 71, 110}, new byte[]{101, 1, 34, Ascii.GS, -48, -37, 99, -119}));
            return capabilitiesForType;
        }
    }

    @o0O0oo0o(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oOOo0<String> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final String invoke() {
            return o00oo.o00oOOo0(new byte[]{-65, 59, 93, 38, -71, 101, -39, -72, -79, 53, 65, 44, -67, 117, -39, -81, -82, oo0OOoo.f13516o00oOoO, 76, 46}, new byte[]{-39, 84, 47, 75, -40, 17, -7, -37});
        }
    }

    @o0O0oo0o(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<String> {
        public final /* synthetic */ int $encoderStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(int i) {
            super(0);
            this.$encoderStatus = i;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final String invoke() {
            return o00oo.o00oOOo0(new byte[]{77, Ascii.CR, -37, -93, -23, 107, -8, -106, 93, Ascii.ETB, -56, -71, -7, 76, -1, -65, 78, 6, -54, -20}, new byte[]{40, 99, -72, -52, -115, Ascii.SO, -118, -39}) + this.$encoderStatus + o00oo.o00oOOo0(new byte[]{-8, 116, 51, 63, -111, -10, -75, 79, -76}, new byte[]{-40, 3, 82, 76, -79, -104, -64, 35});
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<o0OO0o.oO0Ooooo> {
        public o00oOo0O() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke() {
            invoke2();
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oO0O0OoO.this.o00oo00O();
        }
    }

    public oO0O0OoO(@NotNull o0oo0000<Bitmap> o0oo0000Var, @NotNull File file, int i) {
        o0ooO.o00oo0O0(o0oo0000Var, o00oo.o00oOOo0(new byte[]{50, 93, 37, 77, -107, 115, Ascii.ETB, -86, 9}, new byte[]{123, Ascii.CR, 87, 34, -29, Ascii.SUB, 115, -49}));
        o0ooO.o00oo0O0(file, o00oo.o00oOOo0(new byte[]{-96, 9, 51}, new byte[]{-49, 124, 71, 5, -12, -92, Ascii.FF, -49}));
        this.f15233o00oOOo0 = o0oo0000Var;
        this.f15234o00oOOoO = file;
        this.f15235o00oOo00 = i;
        this.f15241o00oOoOo = 10000L;
    }

    public /* synthetic */ oO0O0OoO(o0oo0000 o0oo0000Var, File file, int i, int i2, o0O00 o0o00) {
        this(o0oo0000Var, file, (i2 & 4) != 0 ? 30 : i);
    }

    @o00ooO0
    @NotNull
    public static final MediaCodecInfo.CodecCapabilities o00oOoOo() {
        return f15232o00oOoo0.o00oOOo0();
    }

    public final long o00oOOo0(long j) {
        return ((j * 1000000) / this.f15235o00oOo00) + 132;
    }

    public final void o00oOOoO(boolean z, MediaCodec.BufferInfo bufferInfo) {
        if (z) {
            try {
                MediaCodec mediaCodec = this.f15242o00oOooO;
                o0ooO.o00oo00O(mediaCodec);
                mediaCodec.signalEndOfInputStream();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true) {
            MediaCodec mediaCodec2 = this.f15242o00oOooO;
            o0ooO.o00oo00O(mediaCodec2);
            int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, this.f15241o00oOoOo);
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -2) {
                if (this.f15237o00oOo0o) {
                    throw new IllegalStateException(o00oOOoO.INSTANCE.toString());
                }
                MediaCodec mediaCodec3 = this.f15242o00oOooO;
                o0ooO.o00oo00O(mediaCodec3);
                MediaFormat outputFormat = mediaCodec3.getOutputFormat();
                o0ooO.o00oo0OO(outputFormat, o00oo.o00oOOo0(new byte[]{Ascii.EM, Ascii.SI, -6, -121, -104, -123, Ascii.SO, 63, 17, 9, -65, -49, -41, -87, Ascii.DC4, 47, 4, Ascii.US, -22, -88, -106, -76, Ascii.FF, 58, 0}, new byte[]{116, 106, -98, -18, -7, -58, 97, 91}));
                MediaMuxer mediaMuxer = this.f15236o00oOo0O;
                o0ooO.o00oo00O(mediaMuxer);
                this.f15238o00oOoO = mediaMuxer.addTrack(outputFormat);
                MediaMuxer mediaMuxer2 = this.f15236o00oOo0O;
                o0ooO.o00oo00O(mediaMuxer2);
                mediaMuxer2.start();
                this.f15237o00oOo0o = true;
            } else if (dequeueOutputBuffer < 0) {
                o00oo.o00oOOo0(new byte[]{-87, -59, -1, -87, 9, -10, -2, 100, -75, -54, -20, -112, 4, -9, -23}, new byte[]{-16, -92, -113, -1, 96, -110, -101, Ascii.VT});
                o00oo.o00oOOo0(new byte[]{-78, 38, 81, 89, -97, Ascii.DC4, -64, 8, -94, 44, Ascii.DC4, 83, -118, 2, -42, Ascii.DLE, -77, 104, 82, 83, Byte.MIN_VALUE, Ascii.FS, -125, Ascii.EM, -87, 43, 91, 69, -118, 3, -115, Ascii.CAN, -94, 57, 65, 68, -102, Ascii.DC4, -20, 9, -77, 56, 65, 85, -83, 4, -59, Ascii.SUB, -94, 58, Ascii.SO, 1}, new byte[]{-57, 72, 52, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -17, 113, -93, 124});
            } else {
                MediaCodec mediaCodec4 = this.f15242o00oOooO;
                o0ooO.o00oo00O(mediaCodec4);
                ByteBuffer outputBuffer = mediaCodec4.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new IllegalStateException(new o00oOo00(dequeueOutputBuffer).toString());
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f15237o00oOo0o) {
                        o00oo.o00oOOo0(new byte[]{117, -104, 82, 77, 100, -68, -20, -75, 105, -105, 65, 116, 105, -67, -5}, new byte[]{44, -7, 34, Ascii.ESC, Ascii.CR, -40, -119, -38});
                        o00oo.o00oOOo0(new byte[]{86, -91, Ascii.DLE, 115, 40, -6, -60, -64, 75, -78, Ascii.DLE, 60, 50, -95, -38, -37, Ascii.DC4, -93, 66, 111, 46, -95, -37, -63, 86, -77}, new byte[]{51, -41, 98, Ascii.FS, 90, -64, -87, -75});
                    }
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    try {
                        MediaMuxer mediaMuxer3 = this.f15236o00oOo0O;
                        o0ooO.o00oo00O(mediaMuxer3);
                        mediaMuxer3.writeSampleData(this.f15238o00oOoO, outputBuffer, bufferInfo);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                MediaCodec mediaCodec5 = this.f15242o00oOooO;
                o0ooO.o00oo00O(mediaCodec5);
                mediaCodec5.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (z) {
                        o00oo.o00oOOo0(new byte[]{-95, -2, 45, 118, Ascii.EM, 63, SignedBytes.MAX_POWER_OF_TWO, 45, -67, -15, 62, 79, Ascii.DC4, 62, 87}, new byte[]{-8, -97, 93, 32, 112, 91, 37, 66});
                        o00oo.o00oOOo0(new byte[]{70, 121, 66, Ascii.SO, -127, -55, 32, 98, 87, 101, 67, 79, -125, -113, 114, 116, 66, 116, 78, 75, -118}, new byte[]{35, Ascii.ETB, 38, 46, -18, -81, 0, 17});
                        return;
                    }
                    o00oo.o00oOOo0(new byte[]{85, -51, -68, -91, -12, 90, -113, 126, 73, -62, -81, -100, -7, 91, -104}, new byte[]{Ascii.FF, -84, -52, -13, -99, 62, -22, 17});
                    o00oo.o00oOOo0(new byte[]{86, -82, -118, -68, 88, -81, -21, -68, 65, -91, -113, -1, 95, -84, -81, -17, 80, -71, -114, -66, 93, -22, -6, -14, 65, -77, -101, -70, 83, -66, -22, -8, 72, -78}, new byte[]{36, -53, -21, -33, 48, -54, -113, -100});
                    this.f15233o00oOOo0.o00oOOo0(-1.0f);
                    return;
                }
            }
        }
    }

    public final void o00oOo00(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 / 4) + i3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i2) {
            int i9 = i5;
            while (i9 < i) {
                int i10 = iArr[i8];
                int i11 = (16711680 & i10) >> 16;
                int i12 = (65280 & i10) >> 8;
                int i13 = 255;
                int i14 = (i10 & 255) >> i5;
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i14, 25, (i12 * TsExtractor.TS_STREAM_TYPE_AC3) + (i11 * 66), 128) >> 8) + 16;
                int o00oOOo03 = (com.google.android.exoplayer2.extractor.o00oOo0O.o00oOOo0(i14, 18, (i11 * 112) - (i12 * 94), 128) >> 8) + 128;
                int o00oOOo04 = (o0oO0Ooo.o00oOOo0(i14, 112, (i11 * (-38)) - (i12 * 74), 128) >> 8) + 128;
                int i15 = i7 + 1;
                if (o00oOOo02 < 0) {
                    o00oOOo02 = 0;
                } else if (o00oOOo02 > 255) {
                    o00oOOo02 = 255;
                }
                bArr[i7] = (byte) o00oOOo02;
                if (i6 % 2 == 0 && i8 % 2 == 0) {
                    int i16 = i4 + 1;
                    if (o00oOOo03 < 0) {
                        o00oOOo03 = 0;
                    } else if (o00oOOo03 > 255) {
                        o00oOOo03 = 255;
                    }
                    bArr[i4] = (byte) o00oOOo03;
                    int i17 = i3 + 1;
                    if (o00oOOo04 < 0) {
                        i13 = 0;
                    } else if (o00oOOo04 <= 255) {
                        i13 = o00oOOo04;
                    }
                    bArr[i3] = (byte) i13;
                    i3 = i17;
                    i4 = i16;
                }
                i8++;
                i9++;
                i7 = i15;
                i5 = 0;
            }
            i6++;
            i5 = 0;
        }
    }

    public final void o00oOo0O(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i4];
                int i8 = (16711680 & i7) >> 16;
                int i9 = (65280 & i7) >> 8;
                int i10 = 255;
                int i11 = (i7 & 255) >> 0;
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i11, 25, (i9 * TsExtractor.TS_STREAM_TYPE_AC3) + (i8 * 66), 128) >> 8) + 16;
                int o00oOOo03 = (com.google.android.exoplayer2.extractor.o00oOo0O.o00oOOo0(i11, 18, (i8 * 112) - (i9 * 94), 128) >> 8) + 128;
                int o00oOOo04 = (o0oO0Ooo.o00oOOo0(i11, 112, (i8 * (-38)) - (i9 * 74), 128) >> 8) + 128;
                int i12 = i3 + 1;
                if (o00oOOo02 < 0) {
                    o00oOOo02 = 0;
                } else if (o00oOOo02 > 255) {
                    o00oOOo02 = 255;
                }
                bArr[i3] = (byte) o00oOOo02;
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    int i13 = i12 + 1;
                    if (o00oOOo04 < 0) {
                        o00oOOo04 = 0;
                    } else if (o00oOOo04 > 255) {
                        o00oOOo04 = 255;
                    }
                    bArr[i13] = (byte) o00oOOo04;
                    int i14 = i12 + 3;
                    if (o00oOOo03 < 0) {
                        i10 = 0;
                    } else if (o00oOOo03 <= 255) {
                        i10 = o00oOOo03;
                    }
                    bArr[i14] = (byte) i10;
                }
                if (i4 % 2 == 0) {
                    i12++;
                }
                i3 = i12;
                i4++;
            }
        }
    }

    public final void o00oOo0o(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int i8 = iArr[i5];
                int i9 = (16711680 & i8) >> 16;
                int i10 = (65280 & i8) >> 8;
                int i11 = 255;
                int i12 = (i8 & 255) >> 0;
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i12, 25, (i10 * TsExtractor.TS_STREAM_TYPE_AC3) + (i9 * 66), 128) >> 8) + 16;
                int o00oOOo03 = (com.google.android.exoplayer2.extractor.o00oOo0O.o00oOOo0(i12, 18, (i9 * 112) - (i10 * 94), 128) >> 8) + 128;
                int o00oOOo04 = (o0oO0Ooo.o00oOOo0(i12, 112, (i9 * (-38)) - (i10 * 74), 128) >> 8) + 128;
                int i13 = i4 + 1;
                if (o00oOOo02 < 0) {
                    o00oOOo02 = 0;
                } else if (o00oOOo02 > 255) {
                    o00oOOo02 = 255;
                }
                bArr[i4] = (byte) o00oOOo02;
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i14 = i3 + 1;
                    if (o00oOOo04 < 0) {
                        o00oOOo04 = 0;
                    } else if (o00oOOo04 > 255) {
                        o00oOOo04 = 255;
                    }
                    bArr[i3] = (byte) o00oOOo04;
                    i3 = i14 + 1;
                    if (o00oOOo03 < 0) {
                        i11 = 0;
                    } else if (o00oOOo03 <= 255) {
                        i11 = o00oOOo03;
                    }
                    bArr[i14] = (byte) i11;
                }
                i5++;
                i7++;
                i4 = i13;
            }
        }
    }

    public final int[] o00oOoO() {
        int[] iArr = f15232o00oOoo0.o00oOOo0().colorFormats;
        o0ooO.o00oo0OO(iArr, o00oo.o00oOOo0(new byte[]{74, -94, -114, -92, -53, 71, 90, -23, 93, -86, -101, -74, -121, 77, 89, -20, 70, -79, -72, -86, -37, 67, 87, -12, 90}, new byte[]{41, -61, -2, -59, -87, 46, 54, Byte.MIN_VALUE}));
        return iArr;
    }

    public final void o00oOoO0() {
        this.f15239o00oOoO0 = false;
        MediaCodec mediaCodec = this.f15242o00oOooO;
        if (mediaCodec != null) {
            o0ooO.o00oo00O(mediaCodec);
            mediaCodec.stop();
            MediaCodec mediaCodec2 = this.f15242o00oOooO;
            o0ooO.o00oo00O(mediaCodec2);
            mediaCodec2.release();
        }
        MediaMuxer mediaMuxer = this.f15236o00oOo0O;
        if (mediaMuxer != null) {
            try {
                if (this.f15237o00oOo0o) {
                    o0ooO.o00oo00O(mediaMuxer);
                    mediaMuxer.stop();
                    MediaMuxer mediaMuxer2 = this.f15236o00oOo0O;
                    o0ooO.o00oo00O(mediaMuxer2);
                    mediaMuxer2.release();
                }
            } catch (Exception e) {
                this.f15233o00oOOo0.o00oOOo0(-1.0f);
                e.printStackTrace();
            }
        }
    }

    public final byte[] o00oOoOO(int i, int i2, Bitmap bitmap) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        o0ooO.o00oo00O(bitmap);
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        byte[] bArr = new byte[(i3 * 3) / 2];
        int i4 = this.f15240o00oOoOO;
        if (i4 != 39) {
            switch (i4) {
                case 19:
                    o00oOo00(bArr, iArr, i, i2);
                    break;
                case 20:
                    o00oOooO(bArr, iArr, i, i2);
                    break;
                case 21:
                    o00oOo0o(bArr, iArr, i, i2);
                    break;
            }
        } else {
            o00oOo0O(bArr, iArr, i, i2);
        }
        return bArr;
    }

    public final void o00oOoo0(int i, int i2) {
        int[] o00oOoO2 = o00oOoO();
        if (o00oOoO2.length > 0) {
            int i3 = o00oOoO2[0];
            if (i3 != 39) {
                switch (i3) {
                }
            }
            this.f15240o00oOoOO = i3;
        }
        if (this.f15240o00oOoOO <= 0) {
            this.f15240o00oOoOO = 21;
        }
        int i4 = i % 2;
        int i5 = i2 % 2;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(o00oo.o00oOOo0(new byte[]{87, -100, 63, Ascii.DC4, -104, -72, -1, 126, 66}, new byte[]{o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -11, 91, 113, -9, -105, -98, 8}), i, i2);
        o0ooO.o00oo0OO(createVideoFormat, o00oo.o00oOOo0(new byte[]{52, 81, 110, 99, 54, -77, 86, -15, 51, 70, 100, 68, 45, -92, 109, -7, 35, Ascii.VT, 70, 103, 38, -65, 97, -34, -75, -93, -83, 67, Ascii.DC4, -107, 44, -72, 32, 74, 111, 118, 42, -112, 105, -32, 123, 3, 99, 103, 43, -79, 104, -20, 17, 74, 115, 43}, new byte[]{87, 35, Ascii.VT, 2, 66, -42, 0, -104}));
        createVideoFormat.setInteger(o00oo.o00oOOo0(new byte[]{-19, -36, 5, -22, -125, -12, -106, -34, -4, -34, 8, -15}, new byte[]{-114, -77, 105, -123, -15, -39, -16, -79}), this.f15240o00oOoOO);
        createVideoFormat.setInteger(o00oo.o00oOOo0(new byte[]{-119, -125, -33, 81, 39, 118, -118}, new byte[]{-21, -22, -85, 35, 70, 2, -17, -14}), i * i2);
        createVideoFormat.setInteger(o00oo.o00oOOo0(new byte[]{4, Ascii.FS, oo0OOoo.f13516o00oOoO, 46, 75, 51, 70, -94, Ascii.SYN, Ascii.VT}, new byte[]{98, 110, 92, 67, 46, Ascii.RS, 52, -61}), this.f15235o00oOo00);
        createVideoFormat.setInteger(o00oo.o00oOOo0(new byte[]{67, 42, -125, 1, 52, oo0OOoo.f13516o00oOoO, -111, 100, 67, 105, -111, Ascii.SYN, 39, 38, -107, 37}, new byte[]{42, 7, -27, 115, 85, 80, -12, 73}), 10);
        try {
            this.f15242o00oOooO = MediaCodec.createEncoderByType(o00oo.o00oOOo0(new byte[]{-83, -85, -77, -58, -102, -13, -91, 0, -72}, new byte[]{-37, -62, -41, -93, -11, -36, -60, 118}));
            if (!this.f15234o00oOOoO.exists()) {
                this.f15234o00oOOoO.createNewFile();
            }
            this.f15236o00oOo0O = new MediaMuxer(this.f15234o00oOOoO.getAbsolutePath(), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MediaCodec mediaCodec = this.f15242o00oOooO;
        o0ooO.o00oo00O(mediaCodec);
        mediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        MediaCodec mediaCodec2 = this.f15242o00oOooO;
        o0ooO.o00oo00O(mediaCodec2);
        mediaCodec2.start();
        this.f15239o00oOoO0 = true;
    }

    public final void o00oOooO(byte[] bArr, int[] iArr, int i, int i2) {
        int length = bArr.length / 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            int i7 = i3;
            while (i7 < i) {
                int i8 = iArr[i6];
                int i9 = (16711680 & i8) >> 16;
                int i10 = (65280 & i8) >> 8;
                int i11 = 255;
                int i12 = (i8 & 255) >> i3;
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i12, 25, (i10 * TsExtractor.TS_STREAM_TYPE_AC3) + (i9 * 66), 128) >> 8) + 16;
                int o00oOOo03 = (com.google.android.exoplayer2.extractor.o00oOo0O.o00oOOo0(i12, 18, (i9 * 112) - (i10 * 94), 128) >> 8) + 128;
                int o00oOOo04 = (o0oO0Ooo.o00oOOo0(i12, 112, (i9 * (-38)) - (i10 * 74), 128) >> 8) + 128;
                int i13 = i4 % 2;
                if (i13 == 0 && i6 % 2 == 0) {
                    int i14 = i5 + 1;
                    if (o00oOOo02 < 0) {
                        o00oOOo02 = 0;
                    } else if (o00oOOo02 > 255) {
                        o00oOOo02 = 255;
                    }
                    bArr[i5] = (byte) o00oOOo02;
                    int i15 = i14 + 1;
                    if (o00oOOo04 < 0) {
                        o00oOOo04 = 0;
                    } else if (o00oOOo04 > 255) {
                        o00oOOo04 = 255;
                    }
                    bArr[i15] = (byte) o00oOOo04;
                    int i16 = length + 1;
                    if (o00oOOo03 < 0) {
                        i11 = 0;
                    } else if (o00oOOo03 <= 255) {
                        i11 = o00oOOo03;
                    }
                    bArr[i16] = (byte) i11;
                    i5 = i15;
                } else if (i13 == 0 && i6 % 2 == 1) {
                    int i17 = i5 + 1;
                    if (o00oOOo02 < 0) {
                        i11 = 0;
                    } else if (o00oOOo02 <= 255) {
                        i11 = o00oOOo02;
                    }
                    bArr[i5] = (byte) i11;
                    i5 = i17;
                } else if (i13 == 1 && i6 % 2 == 0) {
                    int i18 = length + 1;
                    if (o00oOOo02 < 0) {
                        i11 = 0;
                    } else if (o00oOOo02 <= 255) {
                        i11 = o00oOOo02;
                    }
                    bArr[length] = (byte) i11;
                    length = i18 + 1;
                } else if (i13 == 1 && i6 % 2 == 1) {
                    int i19 = length + 1;
                    if (o00oOOo02 < 0) {
                        i11 = 0;
                    } else if (o00oOOo02 <= 255) {
                        i11 = o00oOOo02;
                    }
                    bArr[length] = (byte) i11;
                    length = i19;
                }
                i6++;
                i7++;
                i3 = 0;
            }
            i4++;
            i3 = 0;
        }
    }

    public final void o00oOooo(Bitmap bitmap) {
        o0oo0000<Bitmap> o0oo0000Var;
        this.f15239o00oOoO0 = true;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        long j = 0;
        while (this.f15239o00oOoO0) {
            MediaCodec mediaCodec = this.f15242o00oOooO;
            o0ooO.o00oo00O(mediaCodec);
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(this.f15241o00oOoOo);
            if (dequeueInputBuffer >= 0) {
                long o00oOOo02 = o00oOOo0(j);
                this.f15233o00oOOo0.o00oOOo0(((float) j) / o0oo0000Var.size());
                if (j >= this.f15233o00oOOo0.size()) {
                    MediaCodec mediaCodec2 = this.f15242o00oOooO;
                    o0ooO.o00oo00O(mediaCodec2);
                    mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, o00oOOo02, 4);
                    this.f15239o00oOoO0 = false;
                    o00oOOoO(true, bufferInfo);
                } else {
                    if (bitmap == null) {
                        bitmap = this.f15233o00oOOo0.next();
                    }
                    int width = bitmap.getWidth();
                    if (width % 2 != 0) {
                        width--;
                    }
                    int height = bitmap.getHeight();
                    if (height % 2 != 0) {
                        height--;
                    }
                    byte[] o00oOoOO2 = o00oOoOO(width, height, bitmap);
                    MediaCodec mediaCodec3 = this.f15242o00oOooO;
                    o0ooO.o00oo00O(mediaCodec3);
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    o0ooO.o00oo00O(inputBuffer);
                    inputBuffer.clear();
                    inputBuffer.put(o00oOoOO2);
                    MediaCodec mediaCodec4 = this.f15242o00oOooO;
                    o0ooO.o00oo00O(mediaCodec4);
                    mediaCodec4.queueInputBuffer(dequeueInputBuffer, 0, o00oOoOO2.length, o00oOOo02, 0);
                    o00oOOoO(false, bufferInfo);
                    bitmap = null;
                }
                j++;
            } else {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException unused) {
                    this.f15233o00oOOo0.o00oOOo0(-1.0f);
                }
            }
        }
    }

    public final void o00oo00O() {
        if (o0ooO.o00oOoO0(Looper.myLooper(), Looper.getMainLooper())) {
            o0O0o00O.o00oOo00(true, false, null, null, 0, new o00oOo0O(), 30, null);
            return;
        }
        try {
            if (this.f15233o00oOOo0.size() > 0) {
                Bitmap next = this.f15233o00oOOo0.next();
                o00oOoo0(next.getWidth(), next.getHeight());
                o00oOooo(next);
            }
        } finally {
            o00oOoO0();
        }
    }
}
