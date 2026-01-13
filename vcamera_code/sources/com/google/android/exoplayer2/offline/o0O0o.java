package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class o0O0o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.o00oOOo0((Download) obj, (Download) obj2);
    }
}
