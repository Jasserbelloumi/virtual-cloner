package org.osmdroid.tileprovider.tilesource;

import java.net.HttpURLConnection;
import org.osmdroid.config.Configuration;
import org.osmdroid.config.DefaultConfigurationProvider;
/* loaded from: classes3.dex */
public class TileSourcePolicy {
    public static final int FLAG_NO_BULK = 1;
    public static final int FLAG_NO_PREVENTIVE = 2;
    public static final int FLAG_USER_AGENT_MEANINGFUL = 4;
    public static final int FLAG_USER_AGENT_NORMALIZED = 8;
    private final int mFlags;
    private final int mMaxConcurrent;

    public TileSourcePolicy() {
        this(0, 0);
    }

    public TileSourcePolicy(int i, int i2) {
        this.mMaxConcurrent = i;
        this.mFlags = i2;
    }

    private boolean acceptsMeaninglessUserAgent() {
        return (this.mFlags & 4) == 0;
    }

    public boolean acceptsBulkDownload() {
        return (this.mFlags & 1) == 0;
    }

    public boolean acceptsPreventive() {
        return (this.mFlags & 2) == 0;
    }

    public boolean acceptsUserAgent(String str) {
        if (acceptsMeaninglessUserAgent()) {
            return true;
        }
        return (str == null || str.trim().length() <= 0 || str.equals(DefaultConfigurationProvider.DEFAULT_USER_AGENT)) ? false : true;
    }

    public long computeExpirationTime(String str, String str2, long j) {
        Long expirationOverrideDuration = Configuration.getInstance().getExpirationOverrideDuration();
        if (expirationOverrideDuration != null) {
            return expirationOverrideDuration.longValue() + j;
        }
        long expirationExtendedDuration = Configuration.getInstance().getExpirationExtendedDuration();
        Long httpCacheControlDuration = getHttpCacheControlDuration(str2);
        if (httpCacheControlDuration != null) {
            return (httpCacheControlDuration.longValue() * 1000) + j + expirationExtendedDuration;
        }
        Long httpExpiresTime = getHttpExpiresTime(str);
        return httpExpiresTime != null ? httpExpiresTime.longValue() + expirationExtendedDuration : j + 604800000 + expirationExtendedDuration;
    }

    public long computeExpirationTime(HttpURLConnection httpURLConnection, long j) {
        long computeExpirationTime = computeExpirationTime(httpURLConnection.getHeaderField("Expires"), httpURLConnection.getHeaderField("Cache-Control"), j);
        Configuration.getInstance().isDebugMapTileDownloader();
        return computeExpirationTime;
    }

    public Long getHttpCacheControlDuration(String str) {
        String[] split;
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            for (String str2 : str.split(", ")) {
                if (str2.indexOf("max-age=") == 0) {
                    return Long.valueOf(str2.substring(8));
                }
            }
            return null;
        } catch (Exception unused) {
            Configuration.getInstance().isDebugMapTileDownloader();
            return null;
        }
    }

    public Long getHttpExpiresTime(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            return Long.valueOf(Configuration.getInstance().getHttpHeaderDateTimeFormat().parse(str).getTime());
        } catch (Exception unused) {
            Configuration.getInstance().isDebugMapTileDownloader();
            return null;
        }
    }

    public int getMaxConcurrent() {
        return this.mMaxConcurrent;
    }

    public boolean normalizesUserAgent() {
        return (this.mFlags & 8) != 0;
    }
}
