package o0OO000o;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes2.dex */
public class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f12959o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f12960o00oOOoO = 4096;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12961o00oOo00 = "o00oOOoO";

    public static void o00oOOo0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o00oOOoO(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static int o00oOo00(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return i;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
        } finally {
            o00oOOo0(inputStream);
            o00oOOo0(outputStream);
        }
    }

    public static void o00oOo0O(Context context, String str, File file) throws IOException {
        file.getParentFile().mkdirs();
        o00oOo00(context.getAssets().open(str), new FileOutputStream(file));
    }

    public static void o00oOo0o(File file, String str, File file2) throws IOException {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                String canonicalPath = file2.getCanonicalPath();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement.getName().startsWith(str) && !nextElement.isDirectory()) {
                        File file3 = new File(file2, nextElement.getName());
                        if (!file3.getCanonicalPath().startsWith(canonicalPath)) {
                            throw new IOException("security path " + nextElement.getName());
                        }
                        file3.getParentFile().mkdirs();
                        o00oOo00(zipFile2.getInputStream(nextElement), new FileOutputStream(file3));
                    }
                }
                try {
                    zipFile2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String o00oOoO(File file, Charset charset) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String o00oOoOO2 = o00oOoOO(fileInputStream, charset);
            fileInputStream.close();
            return o00oOoOO2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String o00oOoO0(File file) {
        return o00oOoO(file, StandardCharsets.UTF_8);
    }

    public static String o00oOoOO(InputStream inputStream, Charset charset) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o00oOOoO(inputStream, byteArrayOutputStream);
            return charset != null ? new String(byteArrayOutputStream.toByteArray(), charset) : byteArrayOutputStream.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void o00oOoOo(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes());
                o00oOOo0(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                o00oOOo0(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean o00oOooO(File file) {
        File[] listFiles;
        try {
            if (!file.isFile() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    o00oOooO(file2);
                }
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }
}
