package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
/* loaded from: classes3.dex */
public class CloudmadeUtil {
    private static final String CLOUDMADE_ID = "CLOUDMADE_ID";
    private static final String CLOUDMADE_KEY = "CLOUDMADE_KEY";
    private static final String CLOUDMADE_TOKEN = "CLOUDMADE_TOKEN";
    public static boolean DEBUGMODE = false;
    private static String mAndroidId = "android_id";
    private static String mKey = "";
    private static SharedPreferences.Editor mPreferenceEditor = null;
    private static String mToken = "";

    public static String getCloudmadeKey() {
        return mKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (r3 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
        if (r3 != 0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCloudmadeToken() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.CloudmadeUtil.getCloudmadeToken():java.lang.String");
    }

    public static void retrieveCloudmadeKey(Context context) {
        mAndroidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        mKey = ManifestUtil.retrieveKey(context, CLOUDMADE_KEY);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mPreferenceEditor = defaultSharedPreferences.edit();
        if (!defaultSharedPreferences.getString(CLOUDMADE_ID, "").equals(mAndroidId)) {
            mPreferenceEditor.putString(CLOUDMADE_ID, mAndroidId);
            mPreferenceEditor.commit();
            return;
        }
        String string = defaultSharedPreferences.getString(CLOUDMADE_TOKEN, "");
        mToken = string;
        if (string.length() > 0) {
            mPreferenceEditor = null;
        }
    }

    public static void setCloudmadeKey(String str) {
        mKey = str;
    }
}
