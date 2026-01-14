package com.jasser.vcloner;

import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.MediaPlayer;
import java.util.ArrayList;

public class VlcPlayer {
    private LibVLC libVLC;
    private MediaPlayer mediaPlayer;

    public void init(android.view.SurfaceView surfaceView) {
        ArrayList<String> options = new ArrayList<>();
        options.add("--no-drop-late-frames");
        options.add("--no-skip-frames");
        
        libVLC = new LibVLC(surfaceView.getContext(), options);
        mediaPlayer = new MediaPlayer(libVLC);
        mediaPlayer.getVLCVout().setVideoView(surfaceView);
        mediaPlayer.getVLCVout().attachViews();
    }

    public void playVideo(String path) {
        mediaPlayer.play(Uri.parse(path));
    }
}
y
