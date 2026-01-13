package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface DataSource extends DataReader {

    /* loaded from: classes.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    void addTransferListener(TransferListener transferListener);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @o0OO00OO
    Uri getUri();

    long open(DataSpec dataSpec) throws IOException;
}
