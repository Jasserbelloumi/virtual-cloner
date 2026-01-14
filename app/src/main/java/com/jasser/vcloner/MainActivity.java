package com.jasser.vcloner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.SurfaceTexture;

public class MainActivity extends Activity {
    private static final int VIDEO_PICK_CODE = 1001;
    private VlcPlayer vlcPlayer;
    private CameraHook cameraHook;
    private String selectedVideoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // تهيئة المحرك والحاقن
        vlcPlayer = new VlcPlayer();
        cameraHook = new CameraHook(vlcPlayer);

        Button btnPick = findViewById(R.id.btn_pick_video);
        btnPick.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("video/*");
            startActivityForResult(intent, VIDEO_PICK_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == VIDEO_PICK_CODE) {
            Uri videoUri = data.getData();
            selectedVideoPath = videoUri.getPath(); // ملاحظة: في النسخة النهائية سنحتاج محول مسارات حقيقي
            
            Toast.makeText(this, "تم اختيار الفيديو، جاهز للحقن!", Toast.LENGTH_SHORT).show();
            
            // محاكاة عملية الحقن (تجريبياً)
            // في التطبيق الحقيقي، هذا يتم استدعاؤه عند فتح تطبيق آخر
            // cameraHook.onSetPreviewTexture(new SurfaceTexture(10), selectedVideoPath);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        vlcPlayer.stop();
    }
}

