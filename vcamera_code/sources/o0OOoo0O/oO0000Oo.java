package o0OOoo0O;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO0000Oo {
    public static MediaSource o00oOOo0(String str, Context context, boolean z) {
        return o00oOOoO(str, context);
    }

    public static MediaSource o00oOOoO(String str, Context context) {
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(context, Util.getUserAgent(context, o00oo.o00oOOo0(new byte[]{45, -110, 116, -97}, new byte[]{91, -15, Ascii.NAK, -14, 76, -31, -37, -73})));
        int inferContentType = Util.inferContentType(Uri.parse(str), null);
        if (inferContentType != 0) {
            if (inferContentType != 1) {
                if (inferContentType != 2) {
                    if (inferContentType != 3) {
                        if (inferContentType != 4) {
                            return null;
                        }
                        return new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(str));
                    }
                    return new RtspMediaSource.Factory().createMediaSource(MediaItem.fromUri(str));
                }
                return new HlsMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(str));
            }
            return new SsMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(str));
        }
        return new DashMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(str));
    }
}
