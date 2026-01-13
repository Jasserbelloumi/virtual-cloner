package android.media;

import android.annotation.NonNull;
import android.media.metrics.LogSessionId;
import android.util.Pair;
import java.io.IOException;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaParser {

    /* loaded from: classes.dex */
    public /* synthetic */ interface InputReader {
        static {
            throw new NoClassDefFoundError();
        }

        /* synthetic */ long getLength();

        /* synthetic */ int read(@NonNull byte[] bArr, int i, int i2) throws IOException;
    }

    /* loaded from: classes.dex */
    public /* synthetic */ interface OutputConsumer {
        static {
            throw new NoClassDefFoundError();
        }
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class SeekMap {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ long getDurationMicros();

        @NonNull
        public native /* synthetic */ Pair<SeekPoint, SeekPoint> getSeekPoints(long j);

        public native /* synthetic */ boolean isSeekable();
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class SeekPoint {
        static {
            throw new NoClassDefFoundError();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ interface SeekableInputReader extends InputReader {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ MediaParser create(@NonNull OutputConsumer outputConsumer, @NonNull String... strArr);

    @NonNull
    public static native /* synthetic */ MediaParser createByName(@NonNull String str, @NonNull OutputConsumer outputConsumer);

    public native /* synthetic */ boolean advance(@NonNull SeekableInputReader seekableInputReader) throws IOException;

    @NonNull
    public native /* synthetic */ String getParserName();

    public native /* synthetic */ void release();

    public native /* synthetic */ void seek(@NonNull SeekPoint seekPoint);

    public native /* synthetic */ void setLogSessionId(@NonNull LogSessionId logSessionId);

    @NonNull
    public native /* synthetic */ MediaParser setParameter(@NonNull String str, @NonNull Object obj);
}
