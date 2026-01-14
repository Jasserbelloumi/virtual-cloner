package com.jasser.vcloner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

public class CameraActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // هنا نقوم بإرسال مسار الفيديو الذي اخترته بدلاً من فتح الكاميرا
        Intent resultIntent = new Intent();
        // لنفترض أن الفيديو موجود في هذا المسار مؤقتاً
        Uri videoUri = Uri.parse("file:///sdcard/Download/video.mp4"); 
        resultIntent.setData(videoUri);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
