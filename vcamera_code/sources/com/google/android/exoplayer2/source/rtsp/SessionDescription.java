package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SessionDescription {
    public static final String ATTR_CONTROL = "control";
    public static final String ATTR_FMTP = "fmtp";
    public static final String ATTR_LENGTH = "length";
    public static final String ATTR_RANGE = "range";
    public static final String ATTR_RTPMAP = "rtpmap";
    public static final String ATTR_TOOL = "tool";
    public static final String ATTR_TYPE = "type";
    public static final String SUPPORTED_SDP_VERSION = "0";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    @o0OO00OO
    public final String connection;
    @o0OO00OO
    public final String emailAddress;
    @o0OO00OO
    public final String key;
    public final ImmutableList<MediaDescription> mediaDescriptionList;
    @o0OO00OO
    public final String origin;
    @o0OO00OO
    public final String phoneNumber;
    @o0OO00OO
    public final String sessionInfo;
    @o0OO00OO
    public final String sessionName;
    @o0OO00OO
    public final String timing;
    @o0OO00OO
    public final Uri uri;

    /* loaded from: classes.dex */
    public static final class Builder {
        @o0OO00OO
        private String connection;
        @o0OO00OO
        private String emailAddress;
        @o0OO00OO
        private String key;
        @o0OO00OO
        private String origin;
        @o0OO00OO
        private String phoneNumber;
        @o0OO00OO
        private String sessionInfo;
        @o0OO00OO
        private String sessionName;
        @o0OO00OO
        private String timing;
        @o0OO00OO
        private Uri uri;
        private final HashMap<String, String> attributes = new HashMap<>();
        private final ImmutableList.Builder<MediaDescription> mediaDescriptionListBuilder = new ImmutableList.Builder<>();
        private int bitrate = -1;

        public Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public Builder addMediaDescription(MediaDescription mediaDescription) {
            this.mediaDescriptionListBuilder.add((ImmutableList.Builder<MediaDescription>) mediaDescription);
            return this;
        }

        public SessionDescription build() {
            return new SessionDescription(this);
        }

        public Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public Builder setEmailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setOrigin(String str) {
            this.origin = str;
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder setSessionInfo(String str) {
            this.sessionInfo = str;
            return this;
        }

        public Builder setSessionName(String str) {
            this.sessionName = str;
            return this;
        }

        public Builder setTiming(String str) {
            this.timing = str;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }
    }

    private SessionDescription(Builder builder) {
        this.attributes = ImmutableMap.copyOf((Map) builder.attributes);
        this.mediaDescriptionList = builder.mediaDescriptionListBuilder.build();
        this.sessionName = (String) Util.castNonNull(builder.sessionName);
        this.origin = (String) Util.castNonNull(builder.origin);
        this.timing = (String) Util.castNonNull(builder.timing);
        this.uri = builder.uri;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.sessionInfo = builder.sessionInfo;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SessionDescription.class != obj.getClass()) {
            return false;
        }
        SessionDescription sessionDescription = (SessionDescription) obj;
        return this.bitrate == sessionDescription.bitrate && this.attributes.equals(sessionDescription.attributes) && this.mediaDescriptionList.equals(sessionDescription.mediaDescriptionList) && Util.areEqual(this.origin, sessionDescription.origin) && Util.areEqual(this.sessionName, sessionDescription.sessionName) && Util.areEqual(this.timing, sessionDescription.timing) && Util.areEqual(this.sessionInfo, sessionDescription.sessionInfo) && Util.areEqual(this.uri, sessionDescription.uri) && Util.areEqual(this.emailAddress, sessionDescription.emailAddress) && Util.areEqual(this.phoneNumber, sessionDescription.phoneNumber) && Util.areEqual(this.connection, sessionDescription.connection) && Util.areEqual(this.key, sessionDescription.key);
    }

    public int hashCode() {
        int hashCode = (this.mediaDescriptionList.hashCode() + ((this.attributes.hashCode() + 217) * 31)) * 31;
        String str = this.origin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timing;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.bitrate) * 31;
        String str4 = this.sessionInfo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.uri;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.emailAddress;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneNumber;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connection;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.key;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
