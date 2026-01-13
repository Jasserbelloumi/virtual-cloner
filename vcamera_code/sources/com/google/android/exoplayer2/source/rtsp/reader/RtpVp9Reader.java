package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes.dex */
final class RtpVp9Reader implements RtpPayloadReader {
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int SCALABILITY_STRUCTURE_SIZE = 4;
    private static final String TAG = "RtpVp9Reader";
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private long startTimeOffsetUs = 0;
    private int previousSequenceNumber = -1;
    private int width = -1;
    private int height = -1;
    private boolean gotFirstPacketOfVP9Frame = false;
    private boolean reportedOutputFormat = false;

    public RtpVp9Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static long toSampleUs(long j, long j2, long j3) {
        return Util.scaleLargeTimestamp(j2 - j3, 1000000L, MEDIA_CLOCK_FREQUENCY) + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean validateVp9Descriptor(com.google.android.exoplayer2.util.ParsableByteArray r7, int r8) {
        /*
            r6 = this;
            int r0 = r7.readUnsignedByte()
            boolean r1 = r6.gotFirstPacketOfVP9Frame
            java.lang.String r2 = "RtpVp9Reader"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L1a
            r8 = r0 & 8
            if (r8 != 0) goto L17
            java.lang.String r7 = "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet."
        L13:
            com.google.android.exoplayer2.util.Log.w(r2, r7)
            return r5
        L17:
            r6.gotFirstPacketOfVP9Frame = r4
            goto L37
        L1a:
            int r1 = r6.previousSequenceNumber
            int r1 = com.google.android.exoplayer2.source.rtsp.RtpPacket.getNextSequenceNumber(r1)
            if (r8 == r1) goto L37
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7[r5] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            java.lang.String r8 = "Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet."
            java.lang.String r7 = com.google.android.exoplayer2.util.Util.formatInvariant(r8, r7)
            goto L13
        L37:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L4a
            int r8 = r7.readUnsignedByte()
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L4a
            int r8 = r7.bytesLeft()
            if (r8 >= r4) goto L4a
            return r5
        L4a:
            r8 = r0 & 16
            if (r8 != 0) goto L50
            r1 = r4
            goto L51
        L50:
            r1 = r5
        L51:
            java.lang.String r2 = "VP9 flexible mode is not supported."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1, r2)
            r1 = r0 & 32
            if (r1 == 0) goto L69
            r7.skipBytes(r4)
            int r1 = r7.bytesLeft()
            if (r1 >= r4) goto L64
            return r5
        L64:
            if (r8 != 0) goto L69
            r7.skipBytes(r4)
        L69:
            r8 = r0 & 2
            if (r8 == 0) goto Lbb
            int r8 = r7.readUnsignedByte()
            int r0 = r8 >> 5
            r0 = r0 & 7
            r1 = r8 & 16
            if (r1 == 0) goto L95
            int r0 = r0 + r4
            int r1 = r7.bytesLeft()
            int r2 = r0 * 4
            if (r1 >= r2) goto L83
            return r5
        L83:
            r1 = r5
        L84:
            if (r1 >= r0) goto L95
            int r2 = r7.readUnsignedShort()
            r6.width = r2
            int r2 = r7.readUnsignedShort()
            r6.height = r2
            int r1 = r1 + 1
            goto L84
        L95:
            r8 = r8 & 8
            if (r8 == 0) goto Lbb
            int r8 = r7.readUnsignedByte()
            int r0 = r7.bytesLeft()
            if (r0 >= r8) goto La4
            return r5
        La4:
            r0 = r5
        La5:
            if (r0 >= r8) goto Lbb
            int r1 = r7.readUnsignedShort()
            r1 = r1 & 12
            int r1 = r1 >> r3
            int r2 = r7.bytesLeft()
            if (r2 >= r1) goto Lb5
            return r5
        Lb5:
            r7.skipBytes(r1)
            int r0 = r0 + 1
            goto La5
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.reader.RtpVp9Reader.validateVp9Descriptor(com.google.android.exoplayer2.util.ParsableByteArray, int):boolean");
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z) {
        int i2;
        int i3;
        Assertions.checkStateNotNull(this.trackOutput);
        if (validateVp9Descriptor(parsableByteArray, i)) {
            int i4 = (this.fragmentedSampleSizeBytes == 0 && this.gotFirstPacketOfVP9Frame && (parsableByteArray.peekUnsignedByte() & 4) == 0) ? 1 : 0;
            if (!this.reportedOutputFormat && (i2 = this.width) != -1 && (i3 = this.height) != -1) {
                Format format = this.payloadFormat.format;
                if (i2 != format.width || i3 != format.height) {
                    this.trackOutput.format(format.buildUpon().setWidth(this.width).setHeight(this.height).build());
                }
                this.reportedOutputFormat = true;
            }
            int bytesLeft = parsableByteArray.bytesLeft();
            this.trackOutput.sampleData(parsableByteArray, bytesLeft);
            this.fragmentedSampleSizeBytes += bytesLeft;
            if (z) {
                if (this.firstReceivedTimestamp == C.TIME_UNSET) {
                    this.firstReceivedTimestamp = j;
                }
                this.trackOutput.sampleMetadata(toSampleUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp), i4, this.fragmentedSampleSizeBytes, 0, null);
                this.fragmentedSampleSizeBytes = 0;
                this.gotFirstPacketOfVP9Frame = false;
            }
            this.previousSequenceNumber = i;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput track = extractorOutput.track(i, 2);
        this.trackOutput = track;
        track.format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j2;
    }
}
