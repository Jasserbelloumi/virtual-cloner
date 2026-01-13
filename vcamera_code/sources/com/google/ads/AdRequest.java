package com.google.ads;

import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public final class AdRequest {
    @oo0oO0
    public static final String LOGTAG = "Ads";
    @oo0oO0
    public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    @oo0oO0
    public static final String VERSION = "0.0.0";

    /* loaded from: classes.dex */
    public enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        private final String zzb;

        ErrorCode(String str) {
            this.zzb = str;
        }

        @Override // java.lang.Enum
        @oo0oO0
        public String toString() {
            return this.zzb;
        }
    }

    /* loaded from: classes.dex */
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private AdRequest() {
    }
}
