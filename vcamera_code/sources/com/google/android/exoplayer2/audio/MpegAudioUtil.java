package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.MimeTypes;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int[] BITRATE_V1_L3 = {32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes.dex */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        @o0OO00OO
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean setForHeaderData(int r9) {
            /*
                r8 = this;
                boolean r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$000(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Laa
                if (r5 != r6) goto L21
                goto Laa
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.version = r0
                java.lang.String[] r1 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$100()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.mimeType = r1
                int[] r1 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$200()
                r1 = r1[r6]
                r8.sampleRate = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
            L3f:
                r8.sampleRate = r1
                goto L47
            L42:
                if (r0 != 0) goto L47
                int r1 = r1 / 4
                goto L3f
            L47:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$300(r0, r4)
                r8.samplesPerFrame = r7
                if (r4 != r2) goto L70
                if (r0 != r2) goto L5c
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$400()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L63
            L5c:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$500()
                int r5 = r5 - r3
                r0 = r0[r5]
            L63:
                r8.bitrate = r0
                int r0 = r0 * 12
                int r4 = r8.sampleRate
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L6d:
                r8.frameSize = r0
                goto La1
            L70:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L8d
                if (r4 != r6) goto L7e
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$600()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L85
            L7e:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$700()
                int r5 = r5 - r3
                r0 = r0[r5]
            L85:
                r8.bitrate = r0
                int r0 = r0 * r7
                int r4 = r8.sampleRate
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L6d
            L8d:
                int[] r0 = com.google.android.exoplayer2.audio.MpegAudioUtil.access$800()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.bitrate = r0
                if (r4 != r3) goto L9a
                r7 = 72
            L9a:
                int r7 = r7 * r0
                int r0 = r8.sampleRate
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.frameSize = r7
            La1:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto La7
                r6 = r3
            La7:
                r8.channels = r6
                return r3
            Laa:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.MpegAudioUtil.Header.setForHeaderData(int):boolean");
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1] : BITRATE_V2[i4 - 1];
        if (i2 == 3) {
            return com.github.megatronking.stringfog.o00oOOo0.o00oOOo0(i8, 144, i6, i7);
        }
        return com.github.megatronking.stringfog.o00oOOo0.o00oOOo0(i3 == 1 ? 72 : 144, i8, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i, int i2) {
        if (i2 == 1) {
            if (i == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return SAMPLES_PER_FRAME_L1;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i2;
        int i3;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i2, i3);
    }
}
