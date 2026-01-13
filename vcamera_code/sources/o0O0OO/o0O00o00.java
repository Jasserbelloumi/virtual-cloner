package o0O0OO;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00o00 implements o0O0OOoO.o00ooO0 {
    @o0OO00OO

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f11374o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f11375o00oo0O0;
    @o0OO00OO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final File f11376o00oo0Oo;
    @oo0oO0

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O0OOoO.o00ooO0 f11377o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f11378o00oo0o0;
    @o0OO00OO

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oOo0O f11379o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f11380o0O0o;

    public o0O00o00(@oo0oO0 Context context, @o0OO00OO String str, @o0OO00OO File file, int i, @oo0oO0 o0O0OOoO.o00ooO0 o00ooo02) {
        this.f11375o00oo0O0 = context;
        this.f11374o00oo0O = str;
        this.f11376o00oo0Oo = file;
        this.f11378o00oo0o0 = i;
        this.f11377o00oo0o = o00ooo02;
    }

    @Override // o0O0OOoO.o00ooO0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f11377o00oo0o.close();
        this.f11380o0O0o = false;
    }

    @Override // o0O0OOoO.o00ooO0
    public String getDatabaseName() {
        return this.f11377o00oo0o.getDatabaseName();
    }

    @Override // o0O0OOoO.o00ooO0
    public synchronized o0O0OOoO.o00oo getReadableDatabase() {
        if (!this.f11380o0O0o) {
            o00oOo0O();
            this.f11380o0O0o = true;
        }
        return this.f11377o00oo0o.getReadableDatabase();
    }

    @Override // o0O0OOoO.o00ooO0
    public synchronized o0O0OOoO.o00oo getWritableDatabase() {
        if (!this.f11380o0O0o) {
            o00oOo0O();
            this.f11380o0O0o = true;
        }
        return this.f11377o00oo0o.getWritableDatabase();
    }

    public final void o00oOOo0(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f11374o00oo0O != null) {
            channel = Channels.newChannel(this.f11375o00oo0O0.getAssets().open(this.f11374o00oo0O));
        } else if (this.f11376o00oo0Oo == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            channel = new FileInputStream(this.f11376o00oo0Oo).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f11375o00oo0O0.getCacheDir());
        createTempFile.deleteOnExit();
        o0O0OOOo.o00oOo0O.o00oOOo0(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Failed to create directories for ");
            o00oOOo02.append(file.getAbsolutePath());
            throw new IOException(o00oOOo02.toString());
        } else if (createTempFile.renameTo(file)) {
        } else {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Failed to move intermediate file (");
            o00oOOo03.append(createTempFile.getAbsolutePath());
            o00oOOo03.append(") to destination (");
            o00oOOo03.append(file.getAbsolutePath());
            o00oOOo03.append(").");
            throw new IOException(o00oOOo03.toString());
        }
    }

    public void o00oOOoO(@o0OO00OO o00oOo0O o00ooo0o2) {
        this.f11379o00oo0oO = o00ooo0o2;
    }

    public final void o00oOo0O() {
        String databaseName = getDatabaseName();
        File databasePath = this.f11375o00oo0O0.getDatabasePath(databaseName);
        o00oOo0O o00ooo0o2 = this.f11379o00oo0oO;
        o0O0OOOo.o00oOOo0 o00oooo02 = new o0O0OOOo.o00oOOo0(databaseName, this.f11375o00oo0O0.getFilesDir(), o00ooo0o2 == null || o00ooo0o2.f11299o00oOoOo);
        try {
            o00oooo02.o00oOOoO();
            if (!databasePath.exists()) {
                try {
                    o00oOOo0(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.f11379o00oo0oO == null) {
            } else {
                try {
                    int o00oOo0O2 = o0O0OOOo.o00oOo00.o00oOo0O(databasePath);
                    int i = this.f11378o00oo0o0;
                    if (o00oOo0O2 == i) {
                        return;
                    }
                    if (this.f11379o00oo0oO.o00oOOo0(o00oOo0O2, i)) {
                        return;
                    }
                    if (this.f11375o00oo0O0.deleteDatabase(databaseName)) {
                        try {
                            o00oOOo0(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            o00oooo02.o00oOo00();
        }
    }

    @Override // o0O0OOoO.o00ooO0
    @o0OOooO0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f11377o00oo0o.setWriteAheadLoggingEnabled(z);
    }
}
