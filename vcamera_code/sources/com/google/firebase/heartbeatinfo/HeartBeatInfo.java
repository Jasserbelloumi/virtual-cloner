package com.google.firebase.heartbeatinfo;

import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface HeartBeatInfo {

    /* loaded from: classes2.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    @oo0oO0
    HeartBeat getHeartBeatCode(@oo0oO0 String str);
}
