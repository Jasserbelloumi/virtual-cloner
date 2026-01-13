package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
/* loaded from: classes.dex */
public final class PlaybackParameters implements Bundleable {
    private static final int FIELD_PITCH = 1;
    private static final int FIELD_SPEED = 0;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            PlaybackParameters lambda$static$0;
            lambda$static$0 = PlaybackParameters.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(@o00oOooO.o0O0OO0(from = 0.0d, fromInclusive = false) float f, @o00oOooO.o0O0OO0(from = 0.0d, fromInclusive = false) float f2) {
        Assertions.checkArgument(f > 0.0f);
        Assertions.checkArgument(f2 > 0.0f);
        this.speed = f;
        this.pitch = f2;
        this.scaledUsPerMs = Math.round(f * 1000.0f);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PlaybackParameters lambda$static$0(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(keyForField(0), 1.0f), bundle.getFloat(keyForField(1), 1.0f));
    }

    public boolean equals(@o00oOooO.o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        return this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * this.scaledUsPerMs;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + 527) * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(keyForField(0), this.speed);
        bundle.putFloat(keyForField(1), this.pitch);
        return bundle;
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    @o00oOooO.o0OoO00O
    public PlaybackParameters withSpeed(@o00oOooO.o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
        return new PlaybackParameters(f, this.pitch);
    }
}
