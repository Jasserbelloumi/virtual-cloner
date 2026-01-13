import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;

public class CameraProxy {
    private MediaPlayer mMediaPlayer;
    private Surface mFakeSurface;

    // هذه الدالة تقوم بحقن الفيديو في السطح الذي يطلبه النظام
    public void injectVideoToSurface(Surface originalSurface, String videoPath) {
        try {
            mMediaPlayer = new MediaPlayer();
            mMediaPlayer.setDataSource(videoPath);
            mMediaPlayer.setSurface(originalSurface); // هنا السر: ربط الفيديو بالسطح
            mMediaPlayer.setLooping(true);
            mMediaPlayer.prepare();
            mMediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

