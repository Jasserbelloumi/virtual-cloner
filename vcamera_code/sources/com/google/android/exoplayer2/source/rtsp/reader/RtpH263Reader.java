package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes.dex */
final class RtpH263Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int PICTURE_START_CODE = 128;
    private static final String TAG = "RtpH263Reader";
    private int fragmentedSampleSizeBytes;
    private int height;
    private boolean isKeyFrame;
    private boolean isOutputFormatSet;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private int width;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;

    public RtpH263Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private void parseVopHeader(ParsableByteArray parsableByteArray, boolean z) {
        int i;
        int position = parsableByteArray.getPosition();
        if (((parsableByteArray.readUnsignedInt() >> 10) & 63) != 32) {
            parsableByteArray.setPosition(position);
            this.isKeyFrame = false;
            return;
        }
        int peekUnsignedByte = parsableByteArray.peekUnsignedByte();
        int i2 = (peekUnsignedByte >> 1) & 1;
        if (!z && i2 == 0) {
            int i3 = (peekUnsignedByte >> 2) & 7;
            if (i3 == 1) {
                this.width = 128;
                i = 96;
            } else {
                int i4 = i3 - 2;
                this.width = 176 << i4;
                i = 144 << i4;
            }
            this.height = i;
        }
        parsableByteArray.setPosition(position);
        this.isKeyFrame = i2 == 0;
    }

    private static long toSampleUs(long j, long j2, long j3) {
        return Util.scaleLargeTimestamp(j2 - j3, 1000000L, MEDIA_CLOCK_FREQUENCY) + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(com.google.android.exoplayer2.util.ParsableByteArray r22, long r23, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.reader.RtpH263Reader.consume(com.google.android.exoplayer2.util.ParsableByteArray, long, int, boolean):void");
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
