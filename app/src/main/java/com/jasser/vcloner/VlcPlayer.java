package com.jasser.vcloner;

import android.content.Context;
import android.view.SurfaceView;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IVLCVout;
import java.util.ArrayList;

public class VlcPlayer {
    private LibVLC mLibVLC;
    private MediaPlayer mMediaPlayer;

    public void startVideo(Context context, String videoPath, SurfaceView surfaceView) {
        ArrayList<String> options = new ArrayList<>();
        options.add("--no-drop-late-frames");
        options.add("--no-skip-frames");
        options.add("-vvv");

        mLibVLC = new LibVLC(context, options);
        mMediaPlayer = new MediaPlayer(mLibVLC);

        // ربط العرض بالـ SurfaceView
        final IVLCVout vout = mMediaPlayer.getVLCVout();
        vout.setVideoView(surfaceView);
        vout.attachViews();

        // إعداد الفيديو وتفعيله
        Media media = new Media(mLibVLC, videoPath);
        
        // الطريقة الصحيحة للتكرار في الإصدارات الحديثة
        media.addOption(":input-repeat=65535"); 
        
        mMediaPlayer.setMedia(media);
        media.release();
        mMediaPlayer.play();
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer.release();
        }
        if (mLibVLC != null) {
            mLibVLC.release();
        }
    }
}
