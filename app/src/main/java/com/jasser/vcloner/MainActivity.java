package com.jasser.vcloner;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView appsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        appsListView = findViewById(R.id.appsListView);
        loadInstalledApps();
    }

    private void loadInstalledApps() {
        PackageManager pm = getPackageManager();
        List<String> appNames = new ArrayList<>();
        // جلب قائمة التطبيقات المثبتة
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo packageInfo : packages) {
            // فلترة التطبيقات التي يمكن تشغيلها فقط (تطبيقات الواجهة)
            if (pm.getLaunchIntentForPackage(packageInfo.packageName) != null) {
                appNames.add(packageInfo.loadLabel(pm).toString() + "\n" + packageInfo.packageName);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, appNames);
        appsListView.setAdapter(adapter);

        appsListView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = appNames.get(position);
            String packageName = selected.substring(selected.lastIndexOf("\n") + 1);
            Toast.makeText(this, "تم اختيار: " + packageName, Toast.LENGTH_SHORT).show();
        });
    }
}
