package com.google.android.datatransport.cct.internal;

import android.support.v4.media.o00oOOoO;
import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class AutoValue_AndroidClientInfo extends AndroidClientInfo {
    private final String applicationBuild;
    private final String country;
    private final String device;
    private final String fingerprint;
    private final String hardware;
    private final String locale;
    private final String manufacturer;
    private final String mccMnc;
    private final String model;
    private final String osBuild;
    private final String product;
    private final Integer sdkVersion;

    /* loaded from: classes.dex */
    public static final class Builder extends AndroidClientInfo.Builder {
        private String applicationBuild;
        private String country;
        private String device;
        private String fingerprint;
        private String hardware;
        private String locale;
        private String manufacturer;
        private String mccMnc;
        private String model;
        private String osBuild;
        private String product;
        private Integer sdkVersion;

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo build() {
            return new AutoValue_AndroidClientInfo(this.sdkVersion, this.model, this.hardware, this.device, this.product, this.osBuild, this.manufacturer, this.fingerprint, this.locale, this.country, this.mccMnc, this.applicationBuild);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setApplicationBuild(@o0OO00OO String str) {
            this.applicationBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setCountry(@o0OO00OO String str) {
            this.country = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setDevice(@o0OO00OO String str) {
            this.device = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setFingerprint(@o0OO00OO String str) {
            this.fingerprint = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setHardware(@o0OO00OO String str) {
            this.hardware = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setLocale(@o0OO00OO String str) {
            this.locale = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setManufacturer(@o0OO00OO String str) {
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setMccMnc(@o0OO00OO String str) {
            this.mccMnc = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setModel(@o0OO00OO String str) {
            this.model = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setOsBuild(@o0OO00OO String str) {
            this.osBuild = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setProduct(@o0OO00OO String str) {
            this.product = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setSdkVersion(@o0OO00OO Integer num) {
            this.sdkVersion = num;
            return this;
        }
    }

    private AutoValue_AndroidClientInfo(@o0OO00OO Integer num, @o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO String str3, @o0OO00OO String str4, @o0OO00OO String str5, @o0OO00OO String str6, @o0OO00OO String str7, @o0OO00OO String str8, @o0OO00OO String str9, @o0OO00OO String str10, @o0OO00OO String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidClientInfo) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            Integer num = this.sdkVersion;
            if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
                String str = this.model;
                if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                    String str2 = this.hardware;
                    if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                        String str3 = this.device;
                        if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                            String str4 = this.product;
                            if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                                String str5 = this.osBuild;
                                if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                    String str6 = this.manufacturer;
                                    if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                        String str7 = this.fingerprint;
                                        if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                            String str8 = this.locale;
                                            if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                                String str9 = this.country;
                                                if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                    String str10 = this.mccMnc;
                                                    if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                        String str11 = this.applicationBuild;
                                                        String applicationBuild = androidClientInfo.getApplicationBuild();
                                                        if (str11 == null) {
                                                            if (applicationBuild == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(applicationBuild)) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getApplicationBuild() {
        return this.applicationBuild;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getCountry() {
        return this.country;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getDevice() {
        return this.device;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getFingerprint() {
        return this.fingerprint;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getHardware() {
        return this.hardware;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getLocale() {
        return this.locale;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getMccMnc() {
        return this.mccMnc;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getModel() {
        return this.model;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getOsBuild() {
        return this.osBuild;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public String getProduct() {
        return this.product;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @o0OO00OO
    public Integer getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        Integer num = this.sdkVersion;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.model;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.hardware;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.device;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.product;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.osBuild;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.manufacturer;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.fingerprint;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.locale;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.country;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mccMnc;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.applicationBuild;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("AndroidClientInfo{sdkVersion=");
        o00oOOo02.append(this.sdkVersion);
        o00oOOo02.append(", model=");
        o00oOOo02.append(this.model);
        o00oOOo02.append(", hardware=");
        o00oOOo02.append(this.hardware);
        o00oOOo02.append(", device=");
        o00oOOo02.append(this.device);
        o00oOOo02.append(", product=");
        o00oOOo02.append(this.product);
        o00oOOo02.append(", osBuild=");
        o00oOOo02.append(this.osBuild);
        o00oOOo02.append(", manufacturer=");
        o00oOOo02.append(this.manufacturer);
        o00oOOo02.append(", fingerprint=");
        o00oOOo02.append(this.fingerprint);
        o00oOOo02.append(", locale=");
        o00oOOo02.append(this.locale);
        o00oOOo02.append(", country=");
        o00oOOo02.append(this.country);
        o00oOOo02.append(", mccMnc=");
        o00oOOo02.append(this.mccMnc);
        o00oOOo02.append(", applicationBuild=");
        return o00oOOoO.o00oOOo0(o00oOOo02, this.applicationBuild, "}");
    }
}
