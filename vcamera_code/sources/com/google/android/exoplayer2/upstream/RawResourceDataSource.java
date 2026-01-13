package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    @o0OO00OO
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    @o0OO00OO
    private InputStream inputStream;
    private boolean opened;
    private final String packageName;
    private final Resources resources;
    @o0OO00OO
    private Uri uri;

    /* loaded from: classes.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(@o0OO00OO String str, @o0OO00OO Throwable th, int i) {
            super(str, th, i);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws RawResourceDataSourceException {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @o0OO00OO
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        int parseInt;
        Uri uri = dataSpec.uri;
        this.uri = uri;
        if (TextUtils.equals(RAW_RESOURCE_SCHEME, uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) Assertions.checkNotNull(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) Assertions.checkNotNull(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else if (!TextUtils.equals("android.resource", uri.getScheme())) {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
        } else {
            String str = (String) Assertions.checkNotNull(uri.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String host = uri.getHost();
            parseInt = this.resources.getIdentifier(android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), TextUtils.isEmpty(host) ? "" : o00oo.o00oOOo0(host, ":"), str), "raw", this.packageName);
            if (parseInt == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
            }
        }
        transferInitializing(dataSpec);
        try {
            AssetFileDescriptor openRawResourceFd = this.resources.openRawResourceFd(parseInt);
            this.assetFileDescriptor = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.inputStream = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0) {
                try {
                    if (dataSpec.position > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e) {
                    throw e;
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip == dataSpec.position) {
                if (i == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.bytesRemaining = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.bytesRemaining = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j = length - skip;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j2 = dataSpec.length;
                if (j2 != -1) {
                    long j3 = this.bytesRemaining;
                    if (j3 != -1) {
                        j2 = Math.min(j3, j2);
                    }
                    this.bytesRemaining = j2;
                }
                this.opened = true;
                transferStarted(dataSpec);
                long j4 = dataSpec.length;
                return j4 != -1 ? j4 : this.bytesRemaining;
            }
            throw new RawResourceDataSourceException(null, null, 2008);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }
}
