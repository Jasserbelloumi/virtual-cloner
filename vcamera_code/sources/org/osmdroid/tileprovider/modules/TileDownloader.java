package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class TileDownloader {
    private boolean compatibilitySocketFactorySet;

    /* loaded from: classes3.dex */
    public static class CompatibilitySocketFactory extends SSLSocketFactory {
        public SSLSocketFactory sslSocketFactory;

        public CompatibilitySocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
        }

        private SSLSocket upgradeTlsAndRemoveSsl(SSLSocket sSLSocket) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (Arrays.binarySearch(supportedProtocols, "TLSv1.2") >= 0) {
                enabledProtocols = new String[]{"TLSv1.2"};
            } else {
                int binarySearch = Arrays.binarySearch(enabledProtocols, "SSLv3");
                if (binarySearch >= 0) {
                    int length = enabledProtocols.length - 1;
                    String[] strArr = new String[length];
                    System.arraycopy(enabledProtocols, 0, strArr, 0, binarySearch);
                    if (length > binarySearch) {
                        System.arraycopy(enabledProtocols, binarySearch + 1, strArr, binarySearch, length - binarySearch);
                    }
                    enabledProtocols = strArr;
                }
            }
            sSLSocket.setEnabledProtocols(enabledProtocols);
            return sSLSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket() throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket());
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(str, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(str, i, inetAddress, i2));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(inetAddress, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(socket, str, i, z));
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.sslSocketFactory.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.sslSocketFactory.getSupportedCipherSuites();
        }
    }

    @Deprecated
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.osmdroid.tileprovider.modules.IFilesystemCache] */
    /* JADX WARN: Type inference failed for: r22v0, types: [org.osmdroid.tileprovider.tilesource.ITileSource, org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.osmdroid.tileprovider.tilesource.TileSourcePolicy] */
    public Drawable downloadTile(long j, int i, String str, IFilesystemCache iFilesystemCache, OnlineTileSourceBase onlineTileSourceBase) throws CantContinueException {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        HttpURLConnection httpURLConnection;
        ByteArrayInputStream byteArrayInputStream;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        InputStream inputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        InputStream inputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        InputStream inputStream5;
        ByteArrayOutputStream byteArrayOutputStream6;
        ?? r1 = str;
        ByteArrayOutputStream byteArrayOutputStream7 = "https://";
        Object obj = null;
        if (i > 3) {
            return null;
        }
        String normalizedUserAgent = onlineTileSourceBase.getTileSourcePolicy().normalizesUserAgent() ? Configuration.getInstance().getNormalizedUserAgent() : null;
        if (normalizedUserAgent == null) {
            normalizedUserAgent = Configuration.getInstance().getUserAgentValue();
        }
        if (!onlineTileSourceBase.getTileSourcePolicy().acceptsUserAgent(normalizedUserAgent)) {
            return null;
        }
        try {
            try {
                Configuration.getInstance().isDebugMode();
                if (TextUtils.isEmpty(str)) {
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    try {
                        throw null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                httpURLConnection = (HttpURLConnection) (Configuration.getInstance().getHttpProxy() != null ? new URL(r1).openConnection(Configuration.getInstance().getHttpProxy()) : new URL(r1).openConnection());
                try {
                    httpURLConnection.setUseCaches(true);
                    httpURLConnection.setRequestProperty(Configuration.getInstance().getUserAgentHttpHeader(), normalizedUserAgent);
                    for (Map.Entry<String, String> entry : Configuration.getInstance().getAdditionalHttpRequestProperties().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        int responseCode = httpURLConnection.getResponseCode();
                        if ((responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308) && Configuration.getInstance().isMapTileDownloaderFollowRedirects()) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField != null) {
                                if (headerField.startsWith("/")) {
                                    URL url = new URL(r1);
                                    int port = url.getPort();
                                    boolean startsWith = str.toLowerCase().startsWith("https://");
                                    if (port == -1) {
                                        port = str.toLowerCase().startsWith("http://") ? 80 : PsExtractor.SYSTEM_HEADER_START_CODE;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(startsWith ? byteArrayOutputStream7 : "http");
                                    sb.append(url.getHost());
                                    sb.append(":");
                                    sb.append(port);
                                    sb.append(headerField);
                                    headerField = sb.toString();
                                }
                                MapTileIndex.toString(j);
                                httpURLConnection.getResponseMessage();
                                Drawable downloadTile = downloadTile(j, i + 1, headerField, iFilesystemCache, onlineTileSourceBase);
                                StreamUtils.closeStream(null);
                                StreamUtils.closeStream(null);
                                StreamUtils.closeStream(null);
                                StreamUtils.closeStream(null);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused2) {
                                }
                                return downloadTile;
                            }
                        }
                        MapTileIndex.toString(j);
                        httpURLConnection.getResponseMessage();
                        Configuration.getInstance().isDebugMapTileDownloader();
                        Counters.tileDownloadErrors++;
                        StreamUtils.closeStream(httpURLConnection.getErrorStream());
                        StreamUtils.closeStream(null);
                        StreamUtils.closeStream(null);
                        StreamUtils.closeStream(null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                        return null;
                    }
                    String headerField2 = httpURLConnection.getHeaderField("Content-Type");
                    Configuration.getInstance().isDebugMapTileDownloader();
                    if (headerField2 != null) {
                        headerField2.toLowerCase().contains("image");
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byteArrayOutputStream2 = new BufferedOutputStream(byteArrayOutputStream, 8192);
                            try {
                                long computeExpirationTime = onlineTileSourceBase.getTileSourcePolicy().computeExpirationTime(httpURLConnection, System.currentTimeMillis());
                                StreamUtils.copy(inputStream, byteArrayOutputStream2);
                                byteArrayOutputStream2.flush();
                                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                if (iFilesystemCache != 0) {
                                    try {
                                        iFilesystemCache.saveFile(onlineTileSourceBase, j, byteArrayInputStream, Long.valueOf(computeExpirationTime));
                                        byteArrayInputStream.reset();
                                    } catch (FileNotFoundException e) {
                                        e = e;
                                        Counters.tileDownloadErrors++;
                                        MapTileIndex.toString(j);
                                        e.toString();
                                        r1 = inputStream;
                                        byteArrayOutputStream7 = byteArrayOutputStream;
                                        normalizedUserAgent = byteArrayOutputStream2;
                                        httpURLConnection2 = httpURLConnection;
                                        StreamUtils.closeStream(r1);
                                        StreamUtils.closeStream(normalizedUserAgent);
                                        StreamUtils.closeStream(byteArrayInputStream);
                                        StreamUtils.closeStream(byteArrayOutputStream7);
                                        try {
                                            httpURLConnection2.disconnect();
                                        } catch (Exception unused4) {
                                        }
                                        return null;
                                    } catch (UnknownHostException e2) {
                                        e = e2;
                                        MapTileIndex.toString(j);
                                        e.toString();
                                        Counters.tileDownloadErrors++;
                                        r1 = inputStream;
                                        byteArrayOutputStream7 = byteArrayOutputStream;
                                        normalizedUserAgent = byteArrayOutputStream2;
                                        httpURLConnection2 = httpURLConnection;
                                        StreamUtils.closeStream(r1);
                                        StreamUtils.closeStream(normalizedUserAgent);
                                        StreamUtils.closeStream(byteArrayInputStream);
                                        StreamUtils.closeStream(byteArrayOutputStream7);
                                        httpURLConnection2.disconnect();
                                        return null;
                                    } catch (IOException e3) {
                                        e = e3;
                                        Counters.tileDownloadErrors++;
                                        MapTileIndex.toString(j);
                                        e.toString();
                                        r1 = inputStream;
                                        byteArrayOutputStream7 = byteArrayOutputStream;
                                        normalizedUserAgent = byteArrayOutputStream2;
                                        httpURLConnection2 = httpURLConnection;
                                        StreamUtils.closeStream(r1);
                                        StreamUtils.closeStream(normalizedUserAgent);
                                        StreamUtils.closeStream(byteArrayInputStream);
                                        StreamUtils.closeStream(byteArrayOutputStream7);
                                        httpURLConnection2.disconnect();
                                        return null;
                                    } catch (BitmapTileSourceBase.LowMemoryException e4) {
                                        e = e4;
                                        obj = inputStream;
                                        byteArrayOutputStream7 = byteArrayOutputStream;
                                        normalizedUserAgent = byteArrayOutputStream2;
                                        httpURLConnection2 = httpURLConnection;
                                        try {
                                            Counters.countOOM++;
                                            MapTileIndex.toString(j);
                                            e.toString();
                                            throw new CantContinueException(e);
                                        } catch (Throwable th) {
                                            th = th;
                                            r1 = obj;
                                            StreamUtils.closeStream(r1);
                                            StreamUtils.closeStream(normalizedUserAgent);
                                            StreamUtils.closeStream(byteArrayInputStream);
                                            StreamUtils.closeStream(byteArrayOutputStream7);
                                            try {
                                                httpURLConnection2.disconnect();
                                            } catch (Exception unused5) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable unused6) {
                                        Counters.tileDownloadErrors++;
                                        MapTileIndex.toString(j);
                                        r1 = inputStream;
                                        byteArrayOutputStream7 = byteArrayOutputStream;
                                        normalizedUserAgent = byteArrayOutputStream2;
                                        httpURLConnection2 = httpURLConnection;
                                        StreamUtils.closeStream(r1);
                                        StreamUtils.closeStream(normalizedUserAgent);
                                        StreamUtils.closeStream(byteArrayInputStream);
                                        StreamUtils.closeStream(byteArrayOutputStream7);
                                        httpURLConnection2.disconnect();
                                        return null;
                                    }
                                }
                                Drawable drawable = onlineTileSourceBase.getDrawable(byteArrayInputStream);
                                StreamUtils.closeStream(inputStream);
                                StreamUtils.closeStream(byteArrayOutputStream2);
                                StreamUtils.closeStream(byteArrayInputStream);
                                StreamUtils.closeStream(byteArrayOutputStream);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused7) {
                                }
                                return drawable;
                            } catch (FileNotFoundException e5) {
                                e = e5;
                                byteArrayInputStream = null;
                            } catch (UnknownHostException e6) {
                                e = e6;
                                byteArrayInputStream = null;
                            } catch (IOException e7) {
                                e = e7;
                                byteArrayInputStream = null;
                            } catch (BitmapTileSourceBase.LowMemoryException e8) {
                                e = e8;
                                byteArrayInputStream = null;
                            } catch (Throwable unused8) {
                                byteArrayInputStream = null;
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            byteArrayOutputStream2 = 0;
                            inputStream = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream;
                            byteArrayInputStream = byteArrayOutputStream2;
                            Counters.tileDownloadErrors++;
                            MapTileIndex.toString(j);
                            e.toString();
                            r1 = inputStream;
                            byteArrayOutputStream7 = byteArrayOutputStream;
                            normalizedUserAgent = byteArrayOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            StreamUtils.closeStream(r1);
                            StreamUtils.closeStream(normalizedUserAgent);
                            StreamUtils.closeStream(byteArrayInputStream);
                            StreamUtils.closeStream(byteArrayOutputStream7);
                            httpURLConnection2.disconnect();
                            return null;
                        } catch (UnknownHostException e10) {
                            e = e10;
                            byteArrayOutputStream2 = 0;
                            inputStream = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream;
                            byteArrayInputStream = byteArrayOutputStream2;
                            MapTileIndex.toString(j);
                            e.toString();
                            Counters.tileDownloadErrors++;
                            r1 = inputStream;
                            byteArrayOutputStream7 = byteArrayOutputStream;
                            normalizedUserAgent = byteArrayOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            StreamUtils.closeStream(r1);
                            StreamUtils.closeStream(normalizedUserAgent);
                            StreamUtils.closeStream(byteArrayInputStream);
                            StreamUtils.closeStream(byteArrayOutputStream7);
                            httpURLConnection2.disconnect();
                            return null;
                        } catch (IOException e11) {
                            e = e11;
                            byteArrayOutputStream2 = 0;
                            inputStream = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream;
                            byteArrayInputStream = byteArrayOutputStream2;
                            Counters.tileDownloadErrors++;
                            MapTileIndex.toString(j);
                            e.toString();
                            r1 = inputStream;
                            byteArrayOutputStream7 = byteArrayOutputStream;
                            normalizedUserAgent = byteArrayOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            StreamUtils.closeStream(r1);
                            StreamUtils.closeStream(normalizedUserAgent);
                            StreamUtils.closeStream(byteArrayInputStream);
                            StreamUtils.closeStream(byteArrayOutputStream7);
                            httpURLConnection2.disconnect();
                            return null;
                        } catch (BitmapTileSourceBase.LowMemoryException e12) {
                            e = e12;
                            byteArrayOutputStream2 = 0;
                            byteArrayOutputStream = byteArrayOutputStream;
                            byteArrayInputStream = byteArrayOutputStream2;
                            obj = inputStream;
                            byteArrayOutputStream7 = byteArrayOutputStream;
                            normalizedUserAgent = byteArrayOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            Counters.countOOM++;
                            MapTileIndex.toString(j);
                            e.toString();
                            throw new CantContinueException(e);
                        } catch (Throwable unused9) {
                            byteArrayOutputStream2 = 0;
                            inputStream = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream;
                            byteArrayInputStream = byteArrayOutputStream2;
                            Counters.tileDownloadErrors++;
                            MapTileIndex.toString(j);
                            r1 = inputStream;
                            byteArrayOutputStream7 = byteArrayOutputStream;
                            normalizedUserAgent = byteArrayOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            StreamUtils.closeStream(r1);
                            StreamUtils.closeStream(normalizedUserAgent);
                            StreamUtils.closeStream(byteArrayInputStream);
                            StreamUtils.closeStream(byteArrayOutputStream7);
                            httpURLConnection2.disconnect();
                            return null;
                        }
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        byteArrayOutputStream6 = null;
                        inputStream5 = inputStream;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        inputStream = inputStream5;
                        byteArrayOutputStream = byteArrayOutputStream6;
                        byteArrayInputStream = byteArrayOutputStream2;
                        Counters.tileDownloadErrors++;
                        MapTileIndex.toString(j);
                        e.toString();
                        r1 = inputStream;
                        byteArrayOutputStream7 = byteArrayOutputStream;
                        normalizedUserAgent = byteArrayOutputStream2;
                        httpURLConnection2 = httpURLConnection;
                        StreamUtils.closeStream(r1);
                        StreamUtils.closeStream(normalizedUserAgent);
                        StreamUtils.closeStream(byteArrayInputStream);
                        StreamUtils.closeStream(byteArrayOutputStream7);
                        httpURLConnection2.disconnect();
                        return null;
                    } catch (UnknownHostException e14) {
                        e = e14;
                        byteArrayOutputStream5 = null;
                        inputStream4 = inputStream;
                        byteArrayOutputStream2 = byteArrayOutputStream5;
                        inputStream = inputStream4;
                        byteArrayOutputStream = byteArrayOutputStream5;
                        byteArrayInputStream = byteArrayOutputStream2;
                        MapTileIndex.toString(j);
                        e.toString();
                        Counters.tileDownloadErrors++;
                        r1 = inputStream;
                        byteArrayOutputStream7 = byteArrayOutputStream;
                        normalizedUserAgent = byteArrayOutputStream2;
                        httpURLConnection2 = httpURLConnection;
                        StreamUtils.closeStream(r1);
                        StreamUtils.closeStream(normalizedUserAgent);
                        StreamUtils.closeStream(byteArrayInputStream);
                        StreamUtils.closeStream(byteArrayOutputStream7);
                        httpURLConnection2.disconnect();
                        return null;
                    } catch (IOException e15) {
                        e = e15;
                        byteArrayOutputStream4 = null;
                        inputStream3 = inputStream;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        inputStream = inputStream3;
                        byteArrayOutputStream = byteArrayOutputStream4;
                        byteArrayInputStream = byteArrayOutputStream2;
                        Counters.tileDownloadErrors++;
                        MapTileIndex.toString(j);
                        e.toString();
                        r1 = inputStream;
                        byteArrayOutputStream7 = byteArrayOutputStream;
                        normalizedUserAgent = byteArrayOutputStream2;
                        httpURLConnection2 = httpURLConnection;
                        StreamUtils.closeStream(r1);
                        StreamUtils.closeStream(normalizedUserAgent);
                        StreamUtils.closeStream(byteArrayInputStream);
                        StreamUtils.closeStream(byteArrayOutputStream7);
                        httpURLConnection2.disconnect();
                        return null;
                    } catch (BitmapTileSourceBase.LowMemoryException e16) {
                        e = e16;
                        byteArrayOutputStream = null;
                        byteArrayOutputStream2 = 0;
                    } catch (Throwable unused10) {
                        byteArrayOutputStream3 = null;
                        inputStream2 = inputStream;
                        byteArrayOutputStream2 = byteArrayOutputStream3;
                        inputStream = inputStream2;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        byteArrayInputStream = byteArrayOutputStream2;
                        Counters.tileDownloadErrors++;
                        MapTileIndex.toString(j);
                        r1 = inputStream;
                        byteArrayOutputStream7 = byteArrayOutputStream;
                        normalizedUserAgent = byteArrayOutputStream2;
                        httpURLConnection2 = httpURLConnection;
                        StreamUtils.closeStream(r1);
                        StreamUtils.closeStream(normalizedUserAgent);
                        StreamUtils.closeStream(byteArrayInputStream);
                        StreamUtils.closeStream(byteArrayOutputStream7);
                        httpURLConnection2.disconnect();
                        return null;
                    }
                } catch (FileNotFoundException e17) {
                    e = e17;
                    inputStream5 = null;
                    byteArrayOutputStream6 = null;
                } catch (UnknownHostException e18) {
                    e = e18;
                    inputStream4 = null;
                    byteArrayOutputStream5 = null;
                } catch (IOException e19) {
                    e = e19;
                    inputStream3 = null;
                    byteArrayOutputStream4 = null;
                } catch (BitmapTileSourceBase.LowMemoryException e20) {
                    e = e20;
                    byteArrayOutputStream7 = 0;
                    normalizedUserAgent = 0;
                    byteArrayInputStream = null;
                    httpURLConnection2 = httpURLConnection;
                } catch (Throwable unused11) {
                    inputStream2 = null;
                    byteArrayOutputStream3 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                StreamUtils.closeStream(r1);
                StreamUtils.closeStream(normalizedUserAgent);
                StreamUtils.closeStream(byteArrayInputStream);
                StreamUtils.closeStream(byteArrayOutputStream7);
                httpURLConnection2.disconnect();
                throw th;
            }
        } catch (FileNotFoundException e21) {
            e = e21;
            inputStream = null;
            byteArrayOutputStream = null;
            byteArrayOutputStream2 = 0;
            httpURLConnection = null;
            byteArrayInputStream = null;
        } catch (UnknownHostException e22) {
            e = e22;
            inputStream = null;
            byteArrayOutputStream = null;
            byteArrayOutputStream2 = 0;
            httpURLConnection = null;
            byteArrayInputStream = null;
        } catch (IOException e23) {
            e = e23;
            inputStream = null;
            byteArrayOutputStream = null;
            byteArrayOutputStream2 = 0;
            httpURLConnection = null;
            byteArrayInputStream = null;
        } catch (BitmapTileSourceBase.LowMemoryException e24) {
            e = e24;
            byteArrayOutputStream7 = null;
            normalizedUserAgent = 0;
            httpURLConnection2 = null;
            byteArrayInputStream = null;
        } catch (Throwable unused12) {
            inputStream = null;
            byteArrayOutputStream = null;
            byteArrayOutputStream2 = 0;
            httpURLConnection = null;
            byteArrayInputStream = null;
        }
    }

    public Drawable downloadTile(long j, IFilesystemCache iFilesystemCache, OnlineTileSourceBase onlineTileSourceBase) throws CantContinueException {
        return downloadTile(j, 0, onlineTileSourceBase.getTileURLString(j), iFilesystemCache, onlineTileSourceBase);
    }

    @Deprecated
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

    @Deprecated
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
}
