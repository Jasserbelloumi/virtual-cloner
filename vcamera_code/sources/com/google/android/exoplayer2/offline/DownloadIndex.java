package com.google.android.exoplayer2.offline;

import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
@oO0Oo
/* loaded from: classes.dex */
public interface DownloadIndex {
    @o0OO00OO
    Download getDownload(String str) throws IOException;

    DownloadCursor getDownloads(int... iArr) throws IOException;
}
