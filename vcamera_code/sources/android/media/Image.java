package android.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class Image implements AutoCloseable {
    public boolean mIsImageValid = false;

    /* loaded from: classes.dex */
    public static abstract class Plane {
        public abstract ByteBuffer getBuffer();

        public abstract int getPixelStride();

        public abstract int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    public abstract void close();

    public Rect getCropRect() {
        return null;
    }

    public int getDataSpace() {
        return 0;
    }

    public SyncFence getFence() throws IOException {
        return null;
    }

    public abstract int getFormat();

    @o0OO00OO
    public HardwareBuffer getHardwareBuffer() {
        return null;
    }

    public abstract int getHeight();

    public long getNativeContext() {
        return 0L;
    }

    public Object getOwner() {
        return null;
    }

    public int getPlaneCount() {
        return -1;
    }

    public abstract Plane[] getPlanes();

    public abstract int getScalingMode();

    public abstract long getTimestamp();

    public abstract int getTransform();

    public abstract int getWidth();

    public boolean isAttachable() {
        return false;
    }

    public void setCropRect(Rect rect) {
    }

    public void setDataSpace(int i) {
    }

    public void setFence(@oo0oO0 SyncFence syncFence) throws IOException {
    }

    public void setTimestamp(long j) {
    }
}
