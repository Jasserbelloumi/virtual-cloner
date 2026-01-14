package com.jasser.vcloner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final int PICK_VIDEO_REQUEST = 1;
    private TextView statusText;
    private Uri selectedVideoUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusText = findViewById(R.id.statusText);
        Button selectBtn = findViewById(R.id.selectVideoBtn);
        Button startBtn = findViewById(R.id.startInjectionBtn);

        selectBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_VIDEO_REQUEST);
        });

        startBtn.setOnClickListener(v -> {
            if (selectedVideoUri != null) {
                Toast.makeText(this, "الكاميرا الوهمية جاهزة الآن!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "يرجى اختيار فيديو أولاً", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_VIDEO_REQUEST && resultCode == RESULT_OK && data != null) {
            selectedVideoUri = data.getData();
            statusText.setText("الفيديو جاهز: " + selectedVideoUri.getLastPathSegment());
        }
    }
}
