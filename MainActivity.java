package com.jasser.vcloner;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {
    private CameraProxy cameraProxy;
    private static final int VIDEO_PICK_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // تأكد من وجود ملف الواجهة

        cameraProxy = new CameraProxy();
        
        Button pickVideoButton = findViewById(R.id.btn_pick_video);
        pickVideoButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("video/*");
            startActivityForResult(intent, VIDEO_PICK_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == VIDEO_PICK_CODE) {
            Uri videoUri = data.getData();
            // هنا نمرر السطح الوهمي لـ CameraProxy كما رأينا في VCamera
            // سيتم استبدال هذا لاحقاً بالكود الذي يعترض التطبيقات الأخرى
        }
    }
}
y
