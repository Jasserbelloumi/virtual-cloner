package org.osmdroid.util;

import org.osmdroid.config.Configuration;
/* loaded from: classes3.dex */
public class NetworkLocationIgnorer {
    private long mLastGps = 0;

    public boolean shouldIgnore(String str, long j) {
        if (!"gps".equals(str)) {
            return j < Configuration.getInstance().getGpsWaitTime() + this.mLastGps;
        }
        this.mLastGps = j;
        return false;
    }
}
