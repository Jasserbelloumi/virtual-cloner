package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo;
import com.google.auto.value.AutoValue;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes.dex */
public abstract class AndroidClientInfo {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract AndroidClientInfo build();

        @oo0oO0
        public abstract Builder setApplicationBuild(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setCountry(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setDevice(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setFingerprint(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setHardware(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setLocale(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setManufacturer(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setMccMnc(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setModel(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setOsBuild(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setProduct(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setSdkVersion(@o0OO00OO Integer num);
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_AndroidClientInfo.Builder();
    }

    @o0OO00OO
    public abstract String getApplicationBuild();

    @o0OO00OO
    public abstract String getCountry();

    @o0OO00OO
    public abstract String getDevice();

    @o0OO00OO
    public abstract String getFingerprint();

    @o0OO00OO
    public abstract String getHardware();

    @o0OO00OO
    public abstract String getLocale();

    @o0OO00OO
    public abstract String getManufacturer();

    @o0OO00OO
    public abstract String getMccMnc();

    @o0OO00OO
    public abstract String getModel();

    @o0OO00OO
    public abstract String getOsBuild();

    @o0OO00OO
    public abstract String getProduct();

    @o0OO00OO
    public abstract Integer getSdkVersion();
}
