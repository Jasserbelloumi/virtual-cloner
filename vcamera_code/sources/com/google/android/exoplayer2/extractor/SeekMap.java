package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface SeekMap {

    /* loaded from: classes.dex */
    public static final class SeekPoints {
        public final SeekPoint first;
        public final SeekPoint second;

        public SeekPoints(SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.first = (SeekPoint) Assertions.checkNotNull(seekPoint);
            this.second = (SeekPoint) Assertions.checkNotNull(seekPoint2);
        }

        public boolean equals(@o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SeekPoints.class != obj.getClass()) {
                return false;
            }
            SeekPoints seekPoints = (SeekPoints) obj;
            return this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second);
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            String sb;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("[");
            o00oOOo02.append(this.first);
            if (this.first.equals(this.second)) {
                sb = "";
            } else {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(", ");
                o00oOOo03.append(this.second);
                sb = o00oOOo03.toString();
            }
            return android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, sb, "]");
        }
    }

    /* loaded from: classes.dex */
    public static class Unseekable implements SeekMap {
        private final long durationUs;
        private final SeekPoints startSeekPoints;

        public Unseekable(long j) {
            this(j, 0L);
        }

        public Unseekable(long j, long j2) {
            this.durationUs = j;
            this.startSeekPoints = new SeekPoints(j2 == 0 ? SeekPoint.START : new SeekPoint(0L, j2));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekPoints getSeekPoints(long j) {
            return this.startSeekPoints;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }
    }

    long getDurationUs();

    SeekPoints getSeekPoints(long j);

    boolean isSeekable();
}
