package o0OOoo0O;

import android.media.MediaPlayer;
import android.view.Surface;
import java.io.File;
/* loaded from: classes3.dex */
public class oO0Oo0oo {

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements MediaPlayer.OnPreparedListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f15309o00oo0O0;

        public o00oOOo0(MediaPlayer mediaPlayer) {
            this.f15309o00oo0O0 = mediaPlayer;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f15309o00oo0O0.start();
        }
    }

    public static MediaPlayer o00oOOo0(Surface surface, String str) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setSurface(surface);
        mediaPlayer.setVolume(1.0f, 1.0f);
        mediaPlayer.setLooping(true);
        mediaPlayer.setOnPreparedListener(new o00oOOo0(mediaPlayer));
        try {
            mediaPlayer.setDataSource(new File(str).getAbsolutePath());
            mediaPlayer.prepare();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mediaPlayer;
    }
}
