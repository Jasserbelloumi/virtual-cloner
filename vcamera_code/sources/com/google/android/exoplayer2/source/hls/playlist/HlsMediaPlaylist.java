package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    @o0OO00OO
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    /* loaded from: classes.dex */
    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, @o0OO00OO Segment segment, long j, int i, long j2, @o0OO00OO DrmInitData drmInitData, @o0OO00OO String str2, @o0OO00OO String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, segment, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.isIndependent = z2;
            this.isPreload = z3;
        }

        public Part copyWith(long j, int i) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlaylistType {
    }

    /* loaded from: classes.dex */
    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j, long j2, @o0OO00OO String str2, @o0OO00OO String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, ImmutableList.of());
        }

        public Segment(String str, @o0OO00OO Segment segment, String str2, long j, int i, long j2, @o0OO00OO DrmInitData drmInitData, @o0OO00OO String str3, @o0OO00OO String str4, long j3, long j4, boolean z, List<Part> list) {
            super(str, segment, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.title = str2;
            this.parts = ImmutableList.copyOf((Collection) list);
        }

        public Segment copyWith(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                Part part = this.parts.get(i2);
                arrayList.add(part.copyWith(j2, i));
                j2 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        @o0OO00OO
        public final DrmInitData drmInitData;
        public final long durationUs;
        @o0OO00OO
        public final String encryptionIV;
        @o0OO00OO
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        @o0OO00OO
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, @o0OO00OO Segment segment, long j, int i, long j2, @o0OO00OO DrmInitData drmInitData, @o0OO00OO String str2, @o0OO00OO String str3, long j3, long j4, boolean z) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j2;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j3;
            this.byteRangeLength = j4;
            this.hasGapTag = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            if (this.relativeStartTimeUs > l.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z, long j2, long j3, boolean z2) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z;
            this.holdBackUs = j2;
            this.partHoldBackUs = j3;
            this.canBlockReload = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HlsMediaPlaylist(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, @o00oOooO.o0OO00OO com.google.android.exoplayer2.drm.DrmInitData r31, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment> r32, java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part> r33, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.ServerControl r34, java.util.Map<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.RenditionReport> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.playlistType = r3
            r3 = r17
            r0.startTimeUs = r3
            r3 = r16
            r0.preciseStart = r3
            r3 = r19
            r0.hasDiscontinuitySequence = r3
            r3 = r20
            r0.discontinuitySequence = r3
            r3 = r21
            r0.mediaSequence = r3
            r3 = r23
            r0.version = r3
            r3 = r24
            r0.targetDurationUs = r3
            r3 = r26
            r0.partTargetDurationUs = r3
            r3 = r29
            r0.hasEndTag = r3
            r3 = r30
            r0.hasProgramDateTime = r3
            r3 = r31
            r0.protectionSchemes = r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r32)
            r0.segments = r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r33)
            r0.trailingParts = r3
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r35)
            r0.renditionReports = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = com.google.common.collect.Iterables.getLast(r33)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Part) r3
        L58:
            long r6 = r3.relativeStartTimeUs
            long r8 = r3.durationUs
            long r6 = r6 + r8
            r0.durationUs = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = com.google.common.collect.Iterables.getLast(r32)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r3 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r3
            goto L58
        L6d:
            r0.durationUs = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.durationUs
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.startOffsetUs = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.hasPositiveStartOffset = r1
            r1 = r34
            r0.serverControl = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, com.google.android.exoplayer2.drm.DrmInitData, java.util.List, java.util.List, com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl, java.util.Map):void");
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(@o0OO00OO HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j = this.mediaSequence;
            long j2 = hlsMediaPlaylist.mediaSequence;
            if (j > j2) {
                return true;
            }
            if (j < j2) {
                return false;
            }
            int size = this.segments.size() - hlsMediaPlaylist.segments.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.trailingParts.size();
            int size3 = hlsMediaPlaylist.trailingParts.size();
            if (size2 <= size3) {
                return size2 == size3 && this.hasEndTag && !hlsMediaPlaylist.hasEndTag;
            }
            return true;
        }
        return true;
    }
}
