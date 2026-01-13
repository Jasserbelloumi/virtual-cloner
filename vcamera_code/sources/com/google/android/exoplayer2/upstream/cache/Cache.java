package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
/* loaded from: classes.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    /* loaded from: classes.dex */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }

        public CacheException(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes.dex */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    NavigableSet<CacheSpan> addListener(String str, Listener listener);

    @oO0Oo
    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws CacheException;

    @oO0Oo
    void commitFile(File file, long j) throws CacheException;

    long getCacheSpace();

    long getCachedBytes(String str, long j, long j2);

    long getCachedLength(String str, long j, long j2);

    NavigableSet<CacheSpan> getCachedSpans(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String str, long j, long j2);

    @oO0Oo
    void release();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeListener(String str, Listener listener);

    @oO0Oo
    void removeResource(String str);

    @oO0Oo
    void removeSpan(CacheSpan cacheSpan);

    @oO0Oo
    File startFile(String str, long j, long j2) throws CacheException;

    @oO0Oo
    CacheSpan startReadWrite(String str, long j, long j2) throws InterruptedException, CacheException;

    @o0OO00OO
    @oO0Oo
    CacheSpan startReadWriteNonBlocking(String str, long j, long j2) throws CacheException;
}
