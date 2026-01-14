package com.jasser.vcloner;

import android.content.Context;
import android.view.Surface;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import java.util.ArrayList;

public class VlcPlayer {
    private LibVLC mLibVLC;
    private MediaPlayer mMediaPlayer;

    public void startStreaming(Surface surface, String videoPath) {
        ArrayList<String> options = new ArrayList<>();
        options.add("--no-drop-late-frames");
        options.add("--no-skip-frames");
        
        // استخدام Context افتراضي من النظام إذا لزم الأمر، أو جعلها مبسطة
        mLibVLC = new LibVLC(null, options);
        mMediaPlayer = new MediaPlayer(mLibVLC);

        mMediaPlayer.getVLCVout().setVideoSurface(surface, null);
        mMediaPlayer.getVLCVout().attachViews();

        Media media = new Media(mLibVLC, videoPath);
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
