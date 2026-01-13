package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    private static final int FIELD_CLIPPING_PROPERTIES = 3;
    private static final int FIELD_LIVE_CONFIGURATION = 1;
    private static final int FIELD_MEDIA_ID = 0;
    private static final int FIELD_MEDIA_METADATA = 2;
    private static final int FIELD_REQUEST_METADATA = 4;
    public final ClippingConfiguration clippingConfiguration;
    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    @o00oOooO.o0OO00OO
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    @o00oOooO.o0OO00OO
    @Deprecated
    public final PlaybackProperties playbackProperties;
    public final RequestMetadata requestMetadata;
    public static final MediaItem EMPTY = new Builder().build();
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o0OOO0OO
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            MediaItem fromBundle;
            fromBundle = MediaItem.fromBundle(bundle);
            return fromBundle;
        }
    };

    /* loaded from: classes.dex */
    public static final class AdsConfiguration {
        public final Uri adTagUri;
        @o00oOooO.o0OO00OO
        public final Object adsId;

        /* loaded from: classes.dex */
        public static final class Builder {
            private Uri adTagUri;
            @o00oOooO.o0OO00OO
            private Object adsId;

            public Builder(Uri uri) {
                this.adTagUri = uri;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }

            public Builder setAdTagUri(Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            public Builder setAdsId(@o00oOooO.o0OO00OO Object obj) {
                this.adsId = obj;
                return this;
            }
        }

        private AdsConfiguration(Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public Builder buildUpon() {
            return new Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdsConfiguration) {
                AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
                return this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        @o00oOooO.o0OO00OO
        private AdsConfiguration adsConfiguration;
        private ClippingConfiguration.Builder clippingConfiguration;
        @o00oOooO.o0OO00OO
        private String customCacheKey;
        private DrmConfiguration.Builder drmConfiguration;
        private LiveConfiguration.Builder liveConfiguration;
        @o00oOooO.o0OO00OO
        private String mediaId;
        @o00oOooO.o0OO00OO
        private MediaMetadata mediaMetadata;
        @o00oOooO.o0OO00OO
        private String mimeType;
        private RequestMetadata requestMetadata;
        private List<StreamKey> streamKeys;
        private ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @o00oOooO.o0OO00OO
        private Object tag;
        @o00oOooO.o0OO00OO
        private Uri uri;

        public Builder() {
            this.clippingConfiguration = new ClippingConfiguration.Builder();
            this.drmConfiguration = new DrmConfiguration.Builder();
            this.streamKeys = Collections.emptyList();
            this.subtitleConfigurations = ImmutableList.of();
            this.liveConfiguration = new LiveConfiguration.Builder();
            this.requestMetadata = RequestMetadata.EMPTY;
        }

        private Builder(MediaItem mediaItem) {
            this();
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
                this.adsConfiguration = localConfiguration.adsConfiguration;
            }
        }

        public MediaItem build() {
            PlaybackProperties playbackProperties;
            Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            Uri uri = this.uri;
            if (uri != null) {
                playbackProperties = new PlaybackProperties(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag);
            } else {
                playbackProperties = null;
            }
            String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            ClippingProperties buildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            LiveConfiguration build = this.liveConfiguration.build();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str2, buildClippingProperties, playbackProperties, build, mediaMetadata, this.requestMetadata);
        }

        @Deprecated
        public Builder setAdTagUri(@o00oOooO.o0OO00OO Uri uri) {
            return setAdTagUri(uri, null);
        }

        @Deprecated
        public Builder setAdTagUri(@o00oOooO.o0OO00OO Uri uri, @o00oOooO.o0OO00OO Object obj) {
            this.adsConfiguration = uri != null ? new AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        @Deprecated
        public Builder setAdTagUri(@o00oOooO.o0OO00OO String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        public Builder setAdsConfiguration(@o00oOooO.o0OO00OO AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @Deprecated
        public Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z);
            return this;
        }

        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z) {
            this.clippingConfiguration.setRelativeToLiveWindow(z);
            return this;
        }

        @Deprecated
        public Builder setClipStartPositionMs(@o00oOooO.o0O0o00O(from = 0) long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z) {
            this.clippingConfiguration.setStartsAtKeyFrame(z);
            return this;
        }

        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        public Builder setCustomCacheKey(@o00oOooO.o0OO00OO String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setDrmConfiguration(@o00oOooO.o0OO00OO DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
            return this;
        }

        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmConfiguration.setForceDefaultLicenseUri(z);
            return this;
        }

        @Deprecated
        public Builder setDrmKeySetId(@o00oOooO.o0OO00OO byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        @Deprecated
        public Builder setDrmLicenseRequestHeaders(@o00oOooO.o0OO00OO Map<String, String> map) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = ImmutableMap.of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @Deprecated
        public Builder setDrmLicenseUri(@o00oOooO.o0OO00OO Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @Deprecated
        public Builder setDrmLicenseUri(@o00oOooO.o0OO00OO String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        @Deprecated
        public Builder setDrmMultiSession(boolean z) {
            this.drmConfiguration.setMultiSession(z);
            return this;
        }

        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z);
            return this;
        }

        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @Deprecated
        public Builder setDrmSessionForClearTypes(@o00oOooO.o0OO00OO List<Integer> list) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = ImmutableList.of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @Deprecated
        public Builder setDrmUuid(@o00oOooO.o0OO00OO UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @Deprecated
        public Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveConfiguration.setMaxPlaybackSpeed(f);
            return this;
        }

        @Deprecated
        public Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f) {
            this.liveConfiguration.setMinPlaybackSpeed(f);
            return this;
        }

        @Deprecated
        public Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        public Builder setMediaId(String str) {
            this.mediaId = (String) Assertions.checkNotNull(str);
            return this;
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public Builder setMimeType(@o00oOooO.o0OO00OO String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        public Builder setStreamKeys(@o00oOooO.o0OO00OO List<StreamKey> list) {
            this.streamKeys = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.subtitleConfigurations = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        public Builder setSubtitles(@o00oOooO.o0OO00OO List<Subtitle> list) {
            this.subtitleConfigurations = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            return this;
        }

        public Builder setTag(@o00oOooO.o0OO00OO Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder setUri(@o00oOooO.o0OO00OO Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@o00oOooO.o0OO00OO String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }
    }

    /* loaded from: classes.dex */
    public static class ClippingConfiguration implements Bundleable {
        private static final int FIELD_END_POSITION_MS = 1;
        private static final int FIELD_RELATIVE_TO_DEFAULT_POSITION = 3;
        private static final int FIELD_RELATIVE_TO_LIVE_WINDOW = 2;
        private static final int FIELD_STARTS_AT_KEY_FRAME = 4;
        private static final int FIELD_START_POSITION_MS = 0;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        @o00oOooO.o0O0o00O(from = 0)
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o0OOOO00
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.ClippingProperties lambda$static$0;
                lambda$static$0 = MediaItem.ClippingConfiguration.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* loaded from: classes.dex */
        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            public Builder() {
                this.endPositionMs = Long.MIN_VALUE;
            }

            private Builder(ClippingConfiguration clippingConfiguration) {
                this.startPositionMs = clippingConfiguration.startPositionMs;
                this.endPositionMs = clippingConfiguration.endPositionMs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            public ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @Deprecated
            public ClippingProperties buildClippingProperties() {
                return new ClippingProperties(this);
            }

            public Builder setEndPositionMs(long j) {
                Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.endPositionMs = j;
                return this;
            }

            public Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            public Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
                return this;
            }

            public Builder setStartPositionMs(@o00oOooO.o0O0o00O(from = 0) long j) {
                Assertions.checkArgument(j >= 0);
                this.startPositionMs = j;
                return this;
            }

            public Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }
        }

        private ClippingConfiguration(Builder builder) {
            this.startPositionMs = builder.startPositionMs;
            this.endPositionMs = builder.endPositionMs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ClippingProperties lambda$static$0(Bundle bundle) {
            return new Builder().setStartPositionMs(bundle.getLong(keyForField(0), 0L)).setEndPositionMs(bundle.getLong(keyForField(1), Long.MIN_VALUE)).setRelativeToLiveWindow(bundle.getBoolean(keyForField(2), false)).setRelativeToDefaultPosition(bundle.getBoolean(keyForField(3), false)).setStartsAtKeyFrame(bundle.getBoolean(keyForField(4), false)).buildClippingProperties();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ClippingConfiguration) {
                ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
                return this.startPositionMs == clippingConfiguration.startPositionMs && this.endPositionMs == clippingConfiguration.endPositionMs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
            }
            return false;
        }

        public int hashCode() {
            long j = this.startPositionMs;
            long j2 = this.endPositionMs;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(keyForField(0), this.startPositionMs);
            bundle.putLong(keyForField(1), this.endPositionMs);
            bundle.putBoolean(keyForField(2), this.relativeToLiveWindow);
            bundle.putBoolean(keyForField(3), this.relativeToDefaultPosition);
            bundle.putBoolean(keyForField(4), this.startsAtKeyFrame);
            return bundle;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes.dex */
    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        @o00oOooO.o0OO00OO
        private final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        @o00oOooO.o0OO00OO
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;
        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;
        @Deprecated
        public final UUID uuid;

        /* loaded from: classes.dex */
        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private ImmutableList<Integer> forcedSessionTrackTypes;
            @o00oOooO.o0OO00OO
            private byte[] keySetId;
            private ImmutableMap<String, String> licenseRequestHeaders;
            @o00oOooO.o0OO00OO
            private Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            @o00oOooO.o0OO00OO
            private UUID scheme;

            @Deprecated
            private Builder() {
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }

            private Builder(DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            public Builder(UUID uuid) {
                this.scheme = uuid;
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Deprecated
            public Builder setNullableScheme(@o00oOooO.o0OO00OO UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }

            @InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @Deprecated
            public Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            public Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
                return this;
            }

            public Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                setForcedSessionTrackTypes(z ? ImmutableList.of(2, 1) : ImmutableList.of());
                return this;
            }

            public Builder setForcedSessionTrackTypes(List<Integer> list) {
                this.forcedSessionTrackTypes = ImmutableList.copyOf((Collection) list);
                return this;
            }

            public Builder setKeySetId(@o00oOooO.o0OO00OO byte[] bArr) {
                this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.licenseRequestHeaders = ImmutableMap.copyOf((Map) map);
                return this;
            }

            public Builder setLicenseUri(@o00oOooO.o0OO00OO Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public Builder setLicenseUri(@o00oOooO.o0OO00OO String str) {
                this.licenseUri = str == null ? null : Uri.parse(str);
                return this;
            }

            public Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            public Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            public Builder setScheme(UUID uuid) {
                this.scheme = uuid;
                return this;
            }
        }

        private DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrmConfiguration) {
                DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
                return this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId);
            }
            return false;
        }

        @o00oOooO.o0OO00OO
        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int hashCode = this.scheme.hashCode() * 31;
            Uri uri = this.licenseUri;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            int hashCode3 = this.licenseRequestHeaders.hashCode();
            return Arrays.hashCode(this.keySetId) + ((this.forcedSessionTrackTypes.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31)) * 31);
        }
    }

    /* loaded from: classes.dex */
    public static final class LiveConfiguration implements Bundleable {
        private static final int FIELD_MAX_OFFSET_MS = 2;
        private static final int FIELD_MAX_PLAYBACK_SPEED = 4;
        private static final int FIELD_MIN_OFFSET_MS = 1;
        private static final int FIELD_MIN_PLAYBACK_SPEED = 3;
        private static final int FIELD_TARGET_OFFSET_MS = 0;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o0OOOO0o
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.LiveConfiguration lambda$static$0;
                lambda$static$0 = MediaItem.LiveConfiguration.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* loaded from: classes.dex */
        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public Builder() {
                this.targetOffsetMs = C.TIME_UNSET;
                this.minOffsetMs = C.TIME_UNSET;
                this.maxOffsetMs = C.TIME_UNSET;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }

            public Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            public Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            public Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            public Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            public Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }
        }

        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        private LiveConfiguration(Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LiveConfiguration lambda$static$0(Bundle bundle) {
            return new LiveConfiguration(bundle.getLong(keyForField(0), C.TIME_UNSET), bundle.getLong(keyForField(1), C.TIME_UNSET), bundle.getLong(keyForField(2), C.TIME_UNSET), bundle.getFloat(keyForField(3), -3.4028235E38f), bundle.getFloat(keyForField(4), -3.4028235E38f));
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LiveConfiguration) {
                LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
                return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
            }
            return false;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            long j3 = this.maxOffsetMs;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.minPlaybackSpeed;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(keyForField(0), this.targetOffsetMs);
            bundle.putLong(keyForField(1), this.minOffsetMs);
            bundle.putLong(keyForField(2), this.maxOffsetMs);
            bundle.putFloat(keyForField(3), this.minPlaybackSpeed);
            bundle.putFloat(keyForField(4), this.maxPlaybackSpeed);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class LocalConfiguration {
        @o00oOooO.o0OO00OO
        public final AdsConfiguration adsConfiguration;
        @o00oOooO.o0OO00OO
        public final String customCacheKey;
        @o00oOooO.o0OO00OO
        public final DrmConfiguration drmConfiguration;
        @o00oOooO.o0OO00OO
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        @Deprecated
        public final List<Subtitle> subtitles;
        @o00oOooO.o0OO00OO
        public final Object tag;
        public final Uri uri;

        private LocalConfiguration(Uri uri, @o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO DrmConfiguration drmConfiguration, @o00oOooO.o0OO00OO AdsConfiguration adsConfiguration, List<StreamKey> list, @o00oOooO.o0OO00OO String str2, ImmutableList<SubtitleConfiguration> immutableList, @o00oOooO.o0OO00OO Object obj) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((ImmutableList.Builder) immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LocalConfiguration) {
                LocalConfiguration localConfiguration = (LocalConfiguration) obj;
                return this.uri.equals(localConfiguration.uri) && Util.areEqual(this.mimeType, localConfiguration.mimeType) && Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && Util.areEqual(this.tag, localConfiguration.tag);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int hashCode3 = (hashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int hashCode4 = (this.streamKeys.hashCode() + ((hashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31)) * 31;
            String str2 = this.customCacheKey;
            int hashCode5 = (this.subtitleConfigurations.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.tag;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class PlaybackProperties extends LocalConfiguration {
        private PlaybackProperties(Uri uri, @o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO DrmConfiguration drmConfiguration, @o00oOooO.o0OO00OO AdsConfiguration adsConfiguration, List<StreamKey> list, @o00oOooO.o0OO00OO String str2, ImmutableList<SubtitleConfiguration> immutableList, @o00oOooO.o0OO00OO Object obj) {
            super(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestMetadata implements Bundleable {
        private static final int FIELD_EXTRAS = 2;
        private static final int FIELD_MEDIA_URI = 0;
        private static final int FIELD_SEARCH_QUERY = 1;
        @o00oOooO.o0OO00OO
        public final Bundle extras;
        @o00oOooO.o0OO00OO
        public final Uri mediaUri;
        @o00oOooO.o0OO00OO
        public final String searchQuery;
        public static final RequestMetadata EMPTY = new Builder().build();
        public static final Bundleable.Creator<RequestMetadata> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.o0OOOO
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                MediaItem.RequestMetadata lambda$static$0;
                lambda$static$0 = MediaItem.RequestMetadata.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* loaded from: classes.dex */
        public static final class Builder {
            @o00oOooO.o0OO00OO
            private Bundle extras;
            @o00oOooO.o0OO00OO
            private Uri mediaUri;
            @o00oOooO.o0OO00OO
            private String searchQuery;

            public Builder() {
            }

            private Builder(RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }

            public RequestMetadata build() {
                return new RequestMetadata(this);
            }

            public Builder setExtras(@o00oOooO.o0OO00OO Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public Builder setMediaUri(@o00oOooO.o0OO00OO Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            public Builder setSearchQuery(@o00oOooO.o0OO00OO String str) {
                this.searchQuery = str;
                return this;
            }
        }

        private RequestMetadata(Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RequestMetadata lambda$static$0(Bundle bundle) {
            return new Builder().setMediaUri((Uri) bundle.getParcelable(keyForField(0))).setSearchQuery(bundle.getString(keyForField(1))).setExtras(bundle.getBundle(keyForField(2))).build();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestMetadata) {
                RequestMetadata requestMetadata = (RequestMetadata) obj;
                return Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && Util.areEqual(this.searchQuery, requestMetadata.searchQuery);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.mediaUri;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.searchQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (this.mediaUri != null) {
                bundle.putParcelable(keyForField(0), this.mediaUri);
            }
            if (this.searchQuery != null) {
                bundle.putString(keyForField(1), this.searchQuery);
            }
            if (this.extras != null) {
                bundle.putBundle(keyForField(2), this.extras);
            }
            return bundle;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class Subtitle extends SubtitleConfiguration {
        @Deprecated
        public Subtitle(Uri uri, String str, @o00oOooO.o0OO00OO String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, @o00oOooO.o0OO00OO String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, @o00oOooO.o0OO00OO String str2, int i, int i2, @o00oOooO.o0OO00OO String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        private Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes.dex */
    public static class SubtitleConfiguration {
        @o00oOooO.o0OO00OO
        public final String id;
        @o00oOooO.o0OO00OO
        public final String label;
        @o00oOooO.o0OO00OO
        public final String language;
        @o00oOooO.o0OO00OO
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        /* loaded from: classes.dex */
        public static final class Builder {
            @o00oOooO.o0OO00OO
            private String id;
            @o00oOooO.o0OO00OO
            private String label;
            @o00oOooO.o0OO00OO
            private String language;
            @o00oOooO.o0OO00OO
            private String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private Uri uri;

            public Builder(Uri uri) {
                this.uri = uri;
            }

            private Builder(SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.id = subtitleConfiguration.id;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Subtitle buildSubtitle() {
                return new Subtitle(this);
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            public Builder setId(@o00oOooO.o0OO00OO String str) {
                this.id = str;
                return this;
            }

            public Builder setLabel(@o00oOooO.o0OO00OO String str) {
                this.label = str;
                return this;
            }

            public Builder setLanguage(@o00oOooO.o0OO00OO String str) {
                this.language = str;
                return this;
            }

            public Builder setMimeType(@o00oOooO.o0OO00OO String str) {
                this.mimeType = str;
                return this;
            }

            public Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            public Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            public Builder setUri(Uri uri) {
                this.uri = uri;
                return this;
            }
        }

        private SubtitleConfiguration(Uri uri, String str, @o00oOooO.o0OO00OO String str2, int i, int i2, @o00oOooO.o0OO00OO String str3, @o00oOooO.o0OO00OO String str4) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.id = str4;
        }

        private SubtitleConfiguration(Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.id = builder.id;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubtitleConfiguration) {
                SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
                return this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.id, subtitleConfiguration.id);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.language;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str3 = this.label;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.id;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties, @o00oOooO.o0OO00OO PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = playbackProperties;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaItem fromBundle(Bundle bundle) {
        String str = (String) Assertions.checkNotNull(bundle.getString(keyForField(0), ""));
        Bundle bundle2 = bundle.getBundle(keyForField(1));
        LiveConfiguration fromBundle = bundle2 == null ? LiveConfiguration.UNSET : LiveConfiguration.CREATOR.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(keyForField(2));
        MediaMetadata fromBundle2 = bundle3 == null ? MediaMetadata.EMPTY : MediaMetadata.CREATOR.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(keyForField(3));
        ClippingProperties fromBundle3 = bundle4 == null ? ClippingProperties.UNSET : ClippingConfiguration.CREATOR.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(keyForField(4));
        return new MediaItem(str, fromBundle3, null, fromBundle, fromBundle2, bundle5 == null ? RequestMetadata.EMPTY : RequestMetadata.CREATOR.fromBundle(bundle5));
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@o00oOooO.o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaItem) {
            MediaItem mediaItem = (MediaItem) obj;
            return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && Util.areEqual(this.requestMetadata, mediaItem.requestMetadata);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        LocalConfiguration localConfiguration = this.localConfiguration;
        int hashCode2 = localConfiguration != null ? localConfiguration.hashCode() : 0;
        int hashCode3 = this.liveConfiguration.hashCode();
        int hashCode4 = this.clippingConfiguration.hashCode();
        return this.requestMetadata.hashCode() + ((this.mediaMetadata.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(keyForField(0), this.mediaId);
        bundle.putBundle(keyForField(1), this.liveConfiguration.toBundle());
        bundle.putBundle(keyForField(2), this.mediaMetadata.toBundle());
        bundle.putBundle(keyForField(3), this.clippingConfiguration.toBundle());
        bundle.putBundle(keyForField(4), this.requestMetadata.toBundle());
        return bundle;
    }
}
