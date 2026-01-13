package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import o00oOooO.o0OO00OO;
@Deprecated
/* loaded from: classes.dex */
public interface MediaSourceFactory extends MediaSource.Factory {
    public static final MediaSourceFactory UNSUPPORTED = new MediaSourceFactory() { // from class: com.google.android.exoplayer2.source.MediaSourceFactory.1
        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public MediaSourceFactory setDrmSessionManagerProvider(@o0OO00OO DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public MediaSourceFactory setLoadErrorHandlingPolicy(@o0OO00OO LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }
    };
}
