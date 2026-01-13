package android.media;

import android.hardware.camera2.MultiResolutionImageReader;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class ImageReader {
    private static final int ACQUIRE_MAX_IMAGES = 2;
    private static final int ACQUIRE_NO_BUFS = 1;
    private static final int ACQUIRE_SUCCESS = 0;

    /* loaded from: classes.dex */
    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReader imageReader);
    }

    public ImageReader(int i, int i2, int i3, int i4, long j) {
    }

    public ImageReader(int i, int i2, int i3, int i4, long j, MultiResolutionImageReader multiResolutionImageReader) {
    }

    public ImageReader(int i, int i2, int i3, long j, MultiResolutionImageReader multiResolutionImageReader, int i4, int i5) {
    }

    public static ImageReader newInstance(int i, int i2, int i3, int i4) {
        return null;
    }

    public static ImageReader newInstance(int i, int i2, int i3, int i4, long j) {
        return null;
    }

    public static ImageReader newInstance(int i, int i2, int i3, int i4, MultiResolutionImageReader multiResolutionImageReader) {
        return null;
    }

    public Image acquireLatestImage() {
        return null;
    }

    public Image acquireNextImage() {
        return null;
    }

    public Image acquireNextImageNoThrowISE() {
        return null;
    }

    public int getDataSpace() {
        return 0;
    }

    public int getHardwareBufferFormat() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getImageFormat() {
        return 0;
    }

    public int getMaxImages() {
        return 0;
    }

    public Surface getSurface() {
        return null;
    }

    public long getUsage() {
        return 0L;
    }

    public int getWidth() {
        return 0;
    }

    public void initializeImageReader(int i, int i2, int i3, int i4, long j, int i5, int i6, boolean z) {
    }

    public void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Handler handler) {
    }

    public void setOnImageAvailableListenerWithExecutor(OnImageAvailableListener onImageAvailableListener, Executor executor) {
    }
}
