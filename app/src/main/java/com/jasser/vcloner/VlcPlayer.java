package com.jasser.vcloner;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IVLCVout;
import java.util.ArrayList;

/**
 * هذا الكلاس هو المحرك المسؤول عن تشغيل الفيديو 
 * وتحويله إلى تدفق صور (Stream) ليتم حقنه في الكاميرا.
 */
public class VlcPlayer {
    private LibVLC mLibVLC;
    private MediaPlayer mMediaPlayer;

    public VlcPlayer(Context context) {
        // إعداد خيارات VLC لضمان أداء عالٍ وبدون تأخير (Lag)
        ArrayList<String> options = new ArrayList<>();
        options.add("--no-audio");               // لا نحتاج للصوت في الكاميرا
        options.add("--no-spu");                 // إيقاف الترجمة
        options.add("--avcodec-hw=any");         // استخدام تسريع العتاد إن أمكن
        options.add("--rtsp-tcp");               // لضمان استقرار التدفق
        
        mLibVLC = new LibVLC(context, options);
        mMediaPlayer = new MediaPlayer(mLibVLC);
    }

    /**
     * ربط الفيديو بالـ Surface (السطح) الذي يتوقعه التطبيق المستهدف
     */
    public void startStreaming(Surface surface, String videoPath) {
        final IVLCVout vout = mMediaPlayer.getVLCVout();
        
        // ربط مخرج الفيديو بالسطح المحقون
        vout.setVideoSurface(surface, null);
        vout.attachViews();

        // تحميل ملف الفيديو
        Media media = new Media(mLibVLC, videoPath);
        media.setHWDecoderEnabled(true, false);
        media.addOption(":network-caching=150"); // تقليل التخزين المؤقت لسرعة الاستجابة
        
        mMediaPlayer.setMedia(media);
        mMediaPlayer.setLooping(true); // تكرار الفيديو تلقائياً
        mMediaPlayer.play();
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer.getVLCVout().detachViews();
            mMediaPlayer.release();
        }
    }
}

