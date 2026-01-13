package com.google.android.exoplayer2.source.chunk;

import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class ChunkHolder {
    @o0OO00OO
    public Chunk chunk;
    public boolean endOfStream;

    public void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
