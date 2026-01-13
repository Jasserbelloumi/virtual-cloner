package com.google.android.exoplayer2.offline;

import java.io.IOException;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface Downloader {

    /* loaded from: classes.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(@o0OO00OO ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
