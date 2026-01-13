package com.google.android.exoplayer2.upstream.cache;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.o00oOo00;
import com.google.android.exoplayer2.C;
import java.io.File;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    @o0OO00OO
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, C.TIME_UNSET, null);
    }

    public CacheSpan(String str, long j, long j2, long j3, @o0OO00OO File file) {
        this.key = str;
        this.position = j;
        this.length = j2;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j3;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (this.key.equals(cacheSpan.key)) {
            int i = ((this.position - cacheSpan.position) > 0L ? 1 : ((this.position - cacheSpan.position) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
        return this.key.compareTo(cacheSpan.key);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("[");
        o00oOOo02.append(this.position);
        o00oOOo02.append(", ");
        return o00oOo00.o00oOOo0(o00oOOo02, this.length, "]");
    }
}
