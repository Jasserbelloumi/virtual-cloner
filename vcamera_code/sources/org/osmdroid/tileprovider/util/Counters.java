package org.osmdroid.tileprovider.util;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class Counters {
    public static final String TAG = "osmCounters";
    public static int countOOM;
    public static int fileCacheHit;
    public static int fileCacheMiss;
    public static int fileCacheOOM;
    public static int fileCacheSaveErrors;
    private static final Map<String, Integer> sMap = new HashMap();
    public static int tileDownloadErrors;

    public static int get(String str) {
        Integer num = sMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void increment(String str) {
        Map<String, Integer> map = sMap;
        Integer num = map.get(str);
        map.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static void printToLogcat() {
    }

    public static void reset() {
        countOOM = 0;
        tileDownloadErrors = 0;
        fileCacheSaveErrors = 0;
        fileCacheMiss = 0;
        fileCacheOOM = 0;
        fileCacheHit = 0;
    }

    public static void reset(String str) {
        sMap.remove(str);
    }
}
