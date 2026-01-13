package o0ooOoOO;

import android.support.v4.media.o00oOo0O;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0oo0000 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f17152o00oOooO = "AtomicFile";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final File f17153o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final File f17154o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final File f17155o00oOo00;

    public o0oo0000(@oo0oO0 File file) {
        this.f17153o00oOOo0 = file;
        this.f17154o00oOOoO = new File(file.getPath() + ".new");
        this.f17155o00oOo00 = new File(file.getPath() + ".bak");
    }

    public static void o00oOoO0(@oo0oO0 File file, @oo0oO0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (file.renameTo(file2)) {
            return;
        }
        file.toString();
        file2.toString();
    }

    public static boolean o00oOoOO(@oo0oO0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void o00oOOo0() {
        this.f17153o00oOOo0.delete();
        this.f17154o00oOOoO.delete();
        this.f17155o00oOo00.delete();
    }

    public void o00oOOoO(@o0OO00OO FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        o00oOoOO(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (this.f17154o00oOOoO.delete()) {
            return;
        }
        Objects.toString(this.f17154o00oOOoO);
    }

    public void o00oOo00(@o0OO00OO FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        o00oOoOO(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        o00oOoO0(this.f17154o00oOOoO, this.f17153o00oOOo0);
    }

    @oo0oO0
    public FileInputStream o00oOo0O() throws FileNotFoundException {
        if (this.f17155o00oOo00.exists()) {
            o00oOoO0(this.f17155o00oOo00, this.f17153o00oOOo0);
        }
        if (this.f17154o00oOOoO.exists() && this.f17153o00oOOo0.exists() && !this.f17154o00oOOoO.delete()) {
            Objects.toString(this.f17154o00oOOoO);
        }
        return new FileInputStream(this.f17153o00oOOo0);
    }

    @oo0oO0
    public byte[] o00oOo0o() throws IOException {
        FileInputStream o00oOo0O2 = o00oOo0O();
        try {
            byte[] bArr = new byte[o00oOo0O2.available()];
            int i = 0;
            while (true) {
                int read = o00oOo0O2.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = o00oOo0O2.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            o00oOo0O2.close();
        }
    }

    @oo0oO0
    public FileOutputStream o00oOoO() throws IOException {
        if (this.f17155o00oOo00.exists()) {
            o00oOoO0(this.f17155o00oOo00, this.f17153o00oOOo0);
        }
        try {
            return new FileOutputStream(this.f17154o00oOOoO);
        } catch (FileNotFoundException unused) {
            if (!this.f17154o00oOOoO.getParentFile().mkdirs()) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Failed to create directory for ");
                o00oOOo02.append(this.f17154o00oOOoO);
                throw new IOException(o00oOOo02.toString());
            }
            try {
                return new FileOutputStream(this.f17154o00oOOoO);
            } catch (FileNotFoundException e) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Failed to create new file ");
                o00oOOo03.append(this.f17154o00oOOoO);
                throw new IOException(o00oOOo03.toString(), e);
            }
        }
    }

    @oo0oO0
    public File o00oOooO() {
        return this.f17153o00oOOo0;
    }
}
