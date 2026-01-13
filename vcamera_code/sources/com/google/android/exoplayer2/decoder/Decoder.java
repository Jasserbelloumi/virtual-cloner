package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface Decoder<I, O, E extends DecoderException> {
    @o0OO00OO
    I dequeueInputBuffer() throws DecoderException;

    @o0OO00OO
    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    String getName();

    void queueInputBuffer(I i) throws DecoderException;

    void release();
}
