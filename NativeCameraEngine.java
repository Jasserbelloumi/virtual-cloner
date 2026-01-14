package com.jasser.vcloner;

import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import android.view.Surface;
import java.util.ArrayList;

public class NativeCameraEngine {
    private LibVLC mLibVLC;
    private MediaPlayer mMediaPlayer;

    public void startVirtualCamera(Surface surface, String videoPath) {
        ArrayList<String> options = new ArrayList<>();
        options.add("--no-audio"); // نحن نحتاج الفيديو فقط للكاميرا
        options.add("--avcodec-hw=any");
        
        mLibVLC = new LibVLC(null, options);
        mMediaPlayer = new MediaPlayer(mLibVLC);
        
        // ربط مخرج الفيديو بالـ Surface الذي سيراه التطبيق المستهدف
        mMediaPlayer.getVLCVout().setVideoSurface(surface, null);
        mMediaPlayer.getVLCVout().attachViews();
        
        Media media = new Media(mLibVLC, videoPath);
        mMediaPlayer.setMedia(media);
        mMediaPlayer.play();
    }
}

