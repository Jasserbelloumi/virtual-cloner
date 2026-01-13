package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o0O0OOOo.o00oo0O0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    @o0OO00OO
    public final String connection;
    @o0OO00OO
    public final String key;
    @o0OO00OO
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    /* loaded from: classes.dex */
    public static final class Builder {
        private static final String RTP_MAP_ATTR_AUDIO_FMT = "%d %s/%d/%d";
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_MONO = 11;
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_STEREO = 10;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMA = 8;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMU = 0;
        private final HashMap<String, String> attributes = new HashMap<>();
        private int bitrate = -1;
        @o0OO00OO
        private String connection;
        @o0OO00OO
        private String key;
        @o0OO00OO
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String str, int i, String str2, int i2) {
            this.mediaType = str;
            this.port = i;
            this.transportProtocol = str2;
            this.payloadType = i2;
        }

        private static String constructAudioRtpMap(int i, String str, int i2, int i3) {
            return Util.formatInvariant(RTP_MAP_ATTR_AUDIO_FMT, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        private static String getRtpMapStringByPayloadType(int i) {
            Assertions.checkArgument(i < 96);
            if (i != 0) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 11) {
                            return constructAudioRtpMap(11, "L16", 44100, 1);
                        }
                        throw new IllegalStateException(android.support.v4.media.o00oOOo0.o00oOOo0("Unsupported static paylod type ", i));
                    }
                    return constructAudioRtpMap(10, "L16", 44100, 2);
                }
                return constructAudioRtpMap(8, "PCMA", 8000, 1);
            }
            return constructAudioRtpMap(0, "PCMU", 8000, 1);
        }

        public Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public MediaDescription build() {
            try {
                return new MediaDescription(this, ImmutableMap.copyOf((Map) this.attributes), RtpMapAttribute.parse(this.attributes.containsKey(SessionDescription.ATTR_RTPMAP) ? (String) Util.castNonNull(this.attributes.get(SessionDescription.ATTR_RTPMAP)) : getRtpMapStringByPayloadType(this.payloadType)));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setMediaTitle(String str) {
            this.mediaTitle = str;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MediaType {
    }

    /* loaded from: classes.dex */
    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int i, String str, int i2, int i3) {
            this.payloadType = i;
            this.mediaEncoding = str;
            this.clockRate = i2;
            this.encodingParameters = i3;
        }

        public static RtpMapAttribute parse(String str) throws ParserException {
            String[] splitAtFirst = Util.splitAtFirst(str, " ");
            Assertions.checkArgument(splitAtFirst.length == 2);
            int parseInt = RtspMessageUtil.parseInt(splitAtFirst[0]);
            String[] split = Util.split(splitAtFirst[1].trim(), "/");
            Assertions.checkArgument(split.length >= 2);
            return new RtpMapAttribute(parseInt, split[0], RtspMessageUtil.parseInt(split[1]), split.length == 3 ? RtspMessageUtil.parseInt(split[2]) : -1);
        }

        public boolean equals(@o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || RtpMapAttribute.class != obj.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) obj;
            return this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters;
        }

        public int hashCode() {
            return ((o00oo0O0.o00oOOo0(this.mediaEncoding, (this.payloadType + 217) * 31, 31) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    private MediaDescription(Builder builder, ImmutableMap<String, String> immutableMap, RtpMapAttribute rtpMapAttribute) {
        this.mediaType = builder.mediaType;
        this.port = builder.port;
        this.transportProtocol = builder.transportProtocol;
        this.payloadType = builder.payloadType;
        this.mediaTitle = builder.mediaTitle;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.attributes = immutableMap;
        this.rtpMapAttribute = rtpMapAttribute;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaDescription.class != obj.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        return this.mediaType.equals(mediaDescription.mediaType) && this.port == mediaDescription.port && this.transportProtocol.equals(mediaDescription.transportProtocol) && this.payloadType == mediaDescription.payloadType && this.bitrate == mediaDescription.bitrate && this.attributes.equals(mediaDescription.attributes) && this.rtpMapAttribute.equals(mediaDescription.rtpMapAttribute) && Util.areEqual(this.mediaTitle, mediaDescription.mediaTitle) && Util.areEqual(this.connection, mediaDescription.connection) && Util.areEqual(this.key, mediaDescription.key);
    }

    public ImmutableMap<String, String> getFmtpParametersAsMap() {
        String str = this.attributes.get(SessionDescription.ATTR_FMTP);
        if (str == null) {
            return ImmutableMap.of();
        }
        String[] splitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(splitAtFirst.length == 2, str);
        String[] split = splitAtFirst[1].split(";\\s?", 0);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (String str2 : split) {
            String[] splitAtFirst2 = Util.splitAtFirst(str2, "=");
            builder.put(splitAtFirst2[0], splitAtFirst2[1]);
        }
        return builder.buildOrThrow();
    }

    public int hashCode() {
        String str = this.transportProtocol;
        int hashCode = (this.rtpMapAttribute.hashCode() + ((this.attributes.hashCode() + ((((o00oo0O0.o00oOOo0(str, (o00oo0O0.o00oOOo0(this.mediaType, 217, 31) + this.port) * 31, 31) + this.payloadType) * 31) + this.bitrate) * 31)) * 31)) * 31;
        String str2 = this.mediaTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.connection;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.key;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
