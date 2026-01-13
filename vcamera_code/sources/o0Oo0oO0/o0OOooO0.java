package o0Oo0oO0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o0Oo.o0O00O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0oo0o;
/* loaded from: classes3.dex */
public interface o0OOooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OOooO0 f16627o00oOOo0 = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0OOooO0 {
        @Override // o0Oo0oO0.o0OOooO0
        public void o00oOOo0(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    o00oOOo0(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // o0Oo0oO0.o0OOooO0
        public boolean o00oOOoO(File file) {
            return file.exists();
        }

        @Override // o0Oo0oO0.o0OOooO0
        public o0O0oo0o o00oOo00(File file) throws FileNotFoundException {
            try {
                return o0O00O.o00oOOo0(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return o0O00O.o00oOOo0(file);
            }
        }

        @Override // o0Oo0oO0.o0OOooO0
        public o0O0O0Oo o00oOo0O(File file) throws FileNotFoundException {
            return o0O00O.o00oOoo0(file);
        }

        @Override // o0Oo0oO0.o0OOooO0
        public o0O0oo0o o00oOo0o(File file) throws FileNotFoundException {
            try {
                return o0O00O.o00oOo0o(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return o0O00O.o00oOo0o(file);
            }
        }

        @Override // o0Oo0oO0.o0OOooO0
        public void o00oOoO(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // o0Oo0oO0.o0OOooO0
        public void o00oOoO0(File file, File file2) throws IOException {
            o00oOoO(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // o0Oo0oO0.o0OOooO0
        public long o00oOooO(File file) {
            return file.length();
        }
    }

    void o00oOOo0(File file) throws IOException;

    boolean o00oOOoO(File file);

    o0O0oo0o o00oOo00(File file) throws FileNotFoundException;

    o0O0O0Oo o00oOo0O(File file) throws FileNotFoundException;

    o0O0oo0o o00oOo0o(File file) throws FileNotFoundException;

    void o00oOoO(File file) throws IOException;

    void o00oOoO0(File file, File file2) throws IOException;

    long o00oOooO(File file);
}
