package com.jasser.vcloner;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private VlcPlayer vlcPlayer;
    private ListView appsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        vlcPlayer = new VlcPlayer();
        appsListView = findViewById(R.id.appsListView);

        loadInstalledApps();
    }

    private void loadInstalledApps() {
        PackageManager pm = getPackageManager();
        List<String> appNames = new ArrayList<>();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo packageInfo : packages) {
            // تصفية التطبيقات لإظهار تطبيقات المستخدم فقط التي لها واجهة (مثل واتساب، فيسبوك...)
            if (pm.getLaunchIntentForPackage(packageInfo.packageName) != null) {
                appNames.add(packageInfo.loadLabel(pm).toString() + "\n" + packageInfo.packageName);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, appNames);
        appsListView.setAdapter(adapter);

        appsListView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = appNames.get(position);
            String packageName = selected.substring(selected.lastIndexOf("\n") + 1);
            Toast.makeText(this, "تم اختيار: " + packageName + " للحقن", Toast.LENGTH_LONG).show();
            // هنا يتم تفعيل الـ Hook لهذا التطبيق تحديداً
        });
    }
}
