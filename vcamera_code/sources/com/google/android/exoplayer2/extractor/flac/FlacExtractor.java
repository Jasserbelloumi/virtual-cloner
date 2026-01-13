package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class FlacExtractor implements Extractor {
    private static final int BUFFER_LENGTH = 32768;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.flac.o00oOOoO
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = FlacExtractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    public static final int FLAG_DISABLE_ID3_METADATA = 1;
    private static final int SAMPLE_NUMBER_UNKNOWN = -1;
    private static final int STATE_GET_FRAME_START_MARKER = 4;
    private static final int STATE_GET_STREAM_MARKER_AND_INFO_BLOCK_BYTES = 1;
    private static final int STATE_READ_FRAMES = 5;
    private static final int STATE_READ_ID3_METADATA = 0;
    private static final int STATE_READ_METADATA_BLOCKS = 3;
    private static final int STATE_READ_STREAM_MARKER = 2;
    private FlacBinarySearchSeeker binarySearchSeeker;
    private final ParsableByteArray buffer;
    private int currentFrameBytesWritten;
    private long currentFrameFirstSampleNumber;
    private ExtractorOutput extractorOutput;
    private FlacStreamMetadata flacStreamMetadata;
    private int frameStartMarker;
    @o0OO00OO
    private Metadata id3Metadata;
    private final boolean id3MetadataDisabled;
    private int minFrameSize;
    private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;
    private int state;
    private final byte[] streamMarkerAndInfoBlock;
    private TrackOutput trackOutput;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    public FlacExtractor() {
        this(0);
    }

    public FlacExtractor(int i) {
        this.streamMarkerAndInfoBlock = new byte[42];
        this.buffer = new ParsableByteArray(new byte[32768], 0);
        this.id3MetadataDisabled = (i & 1) != 0;
        this.sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
        this.state = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.setPosition(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.sampleNumberHolder.sampleNumber;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long findFrame(com.google.android.exoplayer2.util.ParsableByteArray r5, boolean r6) {
        /*
            r4 = this;
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = r4.flacStreamMetadata
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            int r0 = r5.getPosition()
        L9:
            int r1 = r5.limit()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.setPosition(r0)
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r4.flacStreamMetadata
            int r2 = r4.frameStartMarker
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r3 = r4.sampleNumberHolder
            boolean r1 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.setPosition(r0)
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r5 = r4.sampleNumberHolder
            long r5 = r5.sampleNumber
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.limit()
            int r1 = r4.minFrameSize
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.setPosition(r0)
            r6 = 0
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r1 = r4.flacStreamMetadata     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.frameStartMarker     // Catch: java.lang.IndexOutOfBoundsException -> L45
            com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder r3 = r4.sampleNumberHolder     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = r6
        L46:
            int r2 = r5.getPosition()
            int r3 = r5.limit()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.limit()
            r5.setPosition(r6)
            goto L63
        L60:
            r5.setPosition(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flac.FlacExtractor.findFrame(com.google.android.exoplayer2.util.ParsableByteArray, boolean):long");
    }

    private void getFrameStartMarker(ExtractorInput extractorInput) throws IOException {
        this.frameStartMarker = FlacMetadataReader.getFrameStartMarker(extractorInput);
        ((ExtractorOutput) Util.castNonNull(this.extractorOutput)).seekMap(getSeekMap(extractorInput.getPosition(), extractorInput.getLength()));
        this.state = 5;
    }

    private SeekMap getSeekMap(long j, long j2) {
        Assertions.checkNotNull(this.flacStreamMetadata);
        FlacStreamMetadata flacStreamMetadata = this.flacStreamMetadata;
        if (flacStreamMetadata.seekTable != null) {
            return new FlacSeekTableSeekMap(flacStreamMetadata, j);
        }
        if (j2 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new SeekMap.Unseekable(flacStreamMetadata.getDurationUs());
        }
        FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(flacStreamMetadata, this.frameStartMarker, j, j2);
        this.binarySearchSeeker = flacBinarySearchSeeker;
        return flacBinarySearchSeeker.getSeekMap();
    }

    private void getStreamMarkerAndInfoBlockBytes(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = this.streamMarkerAndInfoBlock;
        extractorInput.peekFully(bArr, 0, bArr.length);
        extractorInput.resetPeekPosition();
        this.state = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FlacExtractor()};
    }

    private void outputSampleMetadata() {
        ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata((this.currentFrameFirstSampleNumber * 1000000) / ((FlacStreamMetadata) Util.castNonNull(this.flacStreamMetadata)).sampleRate, 1, this.currentFrameBytesWritten, 0, null);
    }

    private int readFrames(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z;
        Assertions.checkNotNull(this.trackOutput);
        Assertions.checkNotNull(this.flacStreamMetadata);
        FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
        if (flacBinarySearchSeeker == null || !flacBinarySearchSeeker.isSeeking()) {
            if (this.currentFrameFirstSampleNumber == -1) {
                this.currentFrameFirstSampleNumber = FlacFrameReader.getFirstSampleNumber(extractorInput, this.flacStreamMetadata);
                return 0;
            }
            int limit = this.buffer.limit();
            if (limit < 32768) {
                int read = extractorInput.read(this.buffer.getData(), limit, 32768 - limit);
                z = read == -1;
                if (!z) {
                    this.buffer.setLimit(limit + read);
                } else if (this.buffer.bytesLeft() == 0) {
                    outputSampleMetadata();
                    return -1;
                }
            } else {
                z = false;
            }
            int position = this.buffer.getPosition();
            int i = this.currentFrameBytesWritten;
            int i2 = this.minFrameSize;
            if (i < i2) {
                ParsableByteArray parsableByteArray = this.buffer;
                parsableByteArray.skipBytes(Math.min(i2 - i, parsableByteArray.bytesLeft()));
            }
            long findFrame = findFrame(this.buffer, z);
            int position2 = this.buffer.getPosition() - position;
            this.buffer.setPosition(position);
            this.trackOutput.sampleData(this.buffer, position2);
            this.currentFrameBytesWritten += position2;
            if (findFrame != -1) {
                outputSampleMetadata();
                this.currentFrameBytesWritten = 0;
                this.currentFrameFirstSampleNumber = findFrame;
            }
            if (this.buffer.bytesLeft() < 16) {
                int bytesLeft = this.buffer.bytesLeft();
                System.arraycopy(this.buffer.getData(), this.buffer.getPosition(), this.buffer.getData(), 0, bytesLeft);
                this.buffer.setPosition(0);
                this.buffer.setLimit(bytesLeft);
            }
            return 0;
        }
        return this.binarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
    }

    private void readId3Metadata(ExtractorInput extractorInput) throws IOException {
        this.id3Metadata = FlacMetadataReader.readId3Metadata(extractorInput, !this.id3MetadataDisabled);
        this.state = 1;
    }

    private void readMetadataBlocks(ExtractorInput extractorInput) throws IOException {
        FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder(this.flacStreamMetadata);
        boolean z = false;
        while (!z) {
            z = FlacMetadataReader.readMetadataBlock(extractorInput, flacStreamMetadataHolder);
            this.flacStreamMetadata = (FlacStreamMetadata) Util.castNonNull(flacStreamMetadataHolder.flacStreamMetadata);
        }
        Assertions.checkNotNull(this.flacStreamMetadata);
        this.minFrameSize = Math.max(this.flacStreamMetadata.minFrameSize, 6);
        ((TrackOutput) Util.castNonNull(this.trackOutput)).format(this.flacStreamMetadata.getFormat(this.streamMarkerAndInfoBlock, this.id3Metadata));
        this.state = 4;
    }

    private void readStreamMarker(ExtractorInput extractorInput) throws IOException {
        FlacMetadataReader.readStreamMarker(extractorInput);
        this.state = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i = this.state;
        if (i == 0) {
            readId3Metadata(extractorInput);
            return 0;
        } else if (i == 1) {
            getStreamMarkerAndInfoBlockBytes(extractorInput);
            return 0;
        } else if (i == 2) {
            readStreamMarker(extractorInput);
            return 0;
        } else if (i == 3) {
            readMetadataBlocks(extractorInput);
            return 0;
        } else if (i == 4) {
            getFrameStartMarker(extractorInput);
            return 0;
        } else if (i == 5) {
            return readFrames(extractorInput, positionHolder);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.setSeekTargetUs(j2);
            }
        }
        this.currentFrameFirstSampleNumber = j2 != 0 ? -1L : 0L;
        this.currentFrameBytesWritten = 0;
        this.buffer.reset(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        FlacMetadataReader.peekId3Metadata(extractorInput, false);
        return FlacMetadataReader.checkAndPeekStreamMarker(extractorInput);
    }
}
