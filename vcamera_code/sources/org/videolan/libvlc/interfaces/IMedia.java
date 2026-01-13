package org.videolan.libvlc.interfaces;

import android.net.Uri;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
/* loaded from: classes3.dex */
public interface IMedia extends IVLCObject<Event> {

    /* loaded from: classes3.dex */
    public static class AudioTrack extends Track {
        public final int channels;
        public final int rate;

        public AudioTrack(String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, int i5, int i6) {
            super(0, str, str2, z, str3, str4, i, i2, i3, i4, str5, str6);
            this.channels = i5;
            this.rate = i6;
        }
    }

    /* loaded from: classes3.dex */
    public static class Event extends AbstractVLCEvent {
        public static final int DurationChanged = 2;
        public static final int MetaChanged = 0;
        public static final int ParsedChanged = 3;
        public static final int SubItemAdded = 1;
        public static final int SubItemTreeAdded = 6;

        public Event(int i) {
            super(i);
        }

        public Event(int i, long j) {
            super(i, j);
        }

        public int getMetaId() {
            return (int) this.arg1;
        }

        public int getParsedStatus() {
            return (int) this.arg1;
        }
    }

    /* loaded from: classes3.dex */
    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    /* loaded from: classes3.dex */
    public static class Meta {
        public static final int Actors = 22;
        public static final int Album = 4;
        public static final int AlbumArtist = 23;
        public static final int Artist = 1;
        public static final int ArtworkURL = 15;
        public static final int Copyright = 3;
        public static final int Date = 8;
        public static final int Description = 6;
        public static final int Director = 18;
        public static final int DiscNumber = 24;
        public static final int EncodedBy = 14;
        public static final int Episode = 20;
        public static final int Genre = 2;
        public static final int Language = 11;
        public static final int MAX = 25;
        public static final int NowPlaying = 12;
        public static final int Publisher = 13;
        public static final int Rating = 7;
        public static final int Season = 19;
        public static final int Setting = 9;
        public static final int ShowName = 21;
        public static final int Title = 0;
        public static final int TrackID = 16;
        public static final int TrackNumber = 5;
        public static final int TrackTotal = 17;
        public static final int URL = 10;
    }

    /* loaded from: classes3.dex */
    public static class Parse {
        public static final int DoInteract = 8;
        public static final int FetchLocal = 2;
        public static final int FetchNetwork = 4;
        public static final int ParseLocal = 0;
        public static final int ParseNetwork = 1;
    }

    /* loaded from: classes3.dex */
    public static class ParsedStatus {
        public static final int Done = 4;
        public static final int Failed = 2;
        public static final int Skipped = 1;
        public static final int Timeout = 3;
    }

    /* loaded from: classes3.dex */
    public static class Slave {
        public final int priority;
        public final int type;
        public final String uri;

        /* loaded from: classes3.dex */
        public static class Type {
            public static final int Audio = 1;
            public static final int Subtitle = 0;
        }

        public Slave(int i, int i2, String str) {
            this.type = i;
            this.priority = i2;
            this.uri = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class State {
        public static final int Ended = 6;
        public static final int Error = 7;
        public static final int MAX = 8;
        public static final int NothingSpecial = 0;
        public static final int Opening = 1;
        public static final int Paused = 4;
        public static final int Playing = 3;
        public static final int Stopped = 5;
    }

    /* loaded from: classes3.dex */
    public static class Stats {
        public final int decodedAudio;
        public final int decodedVideo;
        public final float demuxBitrate;
        public final int demuxCorrupted;
        public final int demuxDiscontinuity;
        public final int demuxReadBytes;
        public final int displayedPictures;
        public final float inputBitrate;
        public final int lostAbuffers;
        public final int lostPictures;
        public final int playedAbuffers;
        public final int readBytes;
        public final float sendBitrate;
        public final int sentBytes;
        public final int sentPackets;

        public Stats(int i, float f, int i2, float f2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f3) {
            this.readBytes = i;
            this.inputBitrate = f;
            this.demuxReadBytes = i2;
            this.demuxBitrate = f2;
            this.demuxCorrupted = i3;
            this.demuxDiscontinuity = i4;
            this.decodedVideo = i5;
            this.decodedAudio = i6;
            this.displayedPictures = i7;
            this.lostPictures = i8;
            this.playedAbuffers = i9;
            this.lostAbuffers = i10;
            this.sentPackets = i11;
            this.sentBytes = i12;
            this.sendBitrate = f3;
        }
    }

    /* loaded from: classes3.dex */
    public static class SubtitleTrack extends Track {
        public final String encoding;

        public SubtitleTrack(String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, String str7) {
            super(2, str, str2, z, str3, str4, i, i2, i3, i4, str5, str6);
            this.encoding = str7;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Track {
        public final int bitrate;
        public final String codec;
        public final String description;
        public final int fourcc;
        public final String id;
        public final String language;
        public final int level;
        public final String name;
        public final String originalCodec;
        public final int profile;
        public final boolean selected;
        public final int type;

        /* loaded from: classes3.dex */
        public static class Type {
            public static final int Audio = 0;
            public static final int Text = 2;
            public static final int Unknown = -1;
            public static final int Video = 1;
        }

        public Track(int i, String str, String str2, boolean z, String str3, String str4, int i2, int i3, int i4, int i5, String str5, String str6) {
            this.type = i;
            this.id = str;
            this.name = str2;
            this.selected = z;
            this.codec = str3;
            this.originalCodec = str4;
            this.fourcc = i2;
            this.profile = i3;
            this.level = i4;
            this.bitrate = i5;
            this.language = str5;
            this.description = str6;
        }
    }

    /* loaded from: classes3.dex */
    public static class Type {
        public static final int Directory = 2;
        public static final int Disc = 3;
        public static final int File = 1;
        public static final int Playlist = 5;
        public static final int Stream = 4;
        public static final int Unknown = 0;
    }

    /* loaded from: classes3.dex */
    public static class UnknownTrack extends Track {
        public UnknownTrack(String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6) {
            super(-1, str, str2, z, str3, str4, i, i2, i3, i4, str5, str6);
        }
    }

    /* loaded from: classes3.dex */
    public static class VideoTrack extends Track {
        public final int frameRateDen;
        public final int frameRateNum;
        public final int height;
        public final int orientation;
        public final int projection;
        public final int sarDen;
        public final int sarNum;
        public final int width;

        /* loaded from: classes3.dex */
        public static final class Orientation {
            public static final int BottomLeft = 2;
            public static final int BottomRight = 3;
            public static final int LeftBottom = 5;
            public static final int LeftTop = 4;
            public static final int RightBottom = 7;
            public static final int RightTop = 6;
            public static final int TopLeft = 0;
            public static final int TopRight = 1;
        }

        /* loaded from: classes3.dex */
        public static final class Projection {
            public static final int CubemapLayoutStandard = 256;
            public static final int EquiRectangular = 1;
            public static final int Rectangular = 0;
        }

        public VideoTrack(String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            super(1, str, str2, z, str3, str4, i, i2, i3, i4, str5, str6);
            this.height = i5;
            this.width = i6;
            this.sarNum = i7;
            this.sarDen = i8;
            this.frameRateNum = i9;
            this.frameRateDen = i10;
            this.orientation = i11;
            this.projection = i12;
        }
    }

    void addOption(String str);

    void addSlave(Slave slave);

    void clearSlaves();

    long getDuration();

    String getMeta(int i);

    String getMeta(int i, boolean z);

    Slave[] getSlaves();

    Stats getStats();

    Track[] getTracks();

    Track[] getTracks(int i);

    int getType();

    Uri getUri();

    boolean isParsed();

    boolean parse();

    boolean parse(int i);

    boolean parseAsync();

    boolean parseAsync(int i);

    boolean parseAsync(int i, int i2);

    void setDefaultMediaPlayerOptions();

    void setEventListener(EventListener eventListener);

    void setHWDecoderEnabled(boolean z, boolean z2);

    IMediaList subItems();
}
