package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    @o0OO00OO
    private RandomAccessFile file;
    private boolean opened;
    @o0OO00OO
    private Uri uri;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static final class Api21 {
        private Api21() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @o0O0O0Oo
        public static boolean isPermissionError(@o0OO00OO Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static final class Factory implements DataSource.Factory {
        @o0OO00OO
        private TransferListener listener;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }

        public Factory setListener(@o0OO00OO TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(@o0OO00OO String str, @o0OO00OO Throwable th, int i) {
            super(str, th, i);
        }

        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            return new RandomAccessFile((String) Assertions.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (Util.SDK_INT < 21 || !Api21.isPermissionError(e.getCause())) {
                    i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
                }
                throw new FileDataSourceException(e, i);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, (int) PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws FileDataSourceException {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @o0OO00OO
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        RandomAccessFile openLocalFile = openLocalFile(uri);
        this.file = openLocalFile;
        try {
            openLocalFile.seek(dataSpec.position);
            long j = dataSpec.length;
            if (j == -1) {
                j = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = j;
            if (j >= 0) {
                this.opened = true;
                transferStarted(dataSpec);
                return this.bytesRemaining;
            }
            throw new FileDataSourceException(null, null, 2008);
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i, (int) Math.min(this.bytesRemaining, i2));
            if (read > 0) {
                this.bytesRemaining -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
