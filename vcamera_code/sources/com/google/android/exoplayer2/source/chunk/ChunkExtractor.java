package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface ChunkExtractor {

    /* loaded from: classes.dex */
    public interface Factory {
        @o0OO00OO
        ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List<Format> list, @o0OO00OO TrackOutput trackOutput, PlayerId playerId);
    }

    /* loaded from: classes.dex */
    public interface TrackOutputProvider {
        TrackOutput track(int i, int i2);
    }

    @o0OO00OO
    ChunkIndex getChunkIndex();

    @o0OO00OO
    Format[] getSampleFormats();

    void init(@o0OO00OO TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();
}
