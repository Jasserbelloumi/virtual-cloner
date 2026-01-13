package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
/* loaded from: classes3.dex */
public class ManifestUtil {
    public static String retrieveKey(Context context, String str) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString(str)) != null) {
                return string.trim();
            }
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
