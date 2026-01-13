package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;
    @o0OO00OO
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;
    @o0OO00OO
    public final String id;
    public final long startMs;

    public Period(@o0OO00OO String str, long j, List<AdaptationSet> list) {
        this(str, j, list, Collections.emptyList(), null);
    }

    public Period(@o0OO00OO String str, long j, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j, list, list2, null);
    }

    public Period(@o0OO00OO String str, long j, List<AdaptationSet> list, List<EventStream> list2, @o0OO00OO Descriptor descriptor) {
        this.id = str;
        this.startMs = j;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.adaptationSets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.adaptationSets.get(i2).type == i) {
                return i2;
            }
        }
        return -1;
    }
}
