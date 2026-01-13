package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface RtpDataChannel extends DataSource {

    /* loaded from: classes.dex */
    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int i) throws IOException;

        @o0OO00OO
        default Factory createFallbackDataChannelFactory() {
            return null;
        }
    }

    @o0OO00OO
    RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener();

    int getLocalPort();

    String getTransport();
}
