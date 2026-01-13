package o0ooO0O0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.support.v4.media.o00oOo0O;
import android.system.Os;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class oO0O000o {

    /* loaded from: classes3.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static o00oOOo0 f17065o00oOOoO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Map<String, C0225o00oOOo0> f17066o00oOOo0 = new ConcurrentHashMap();

        /* renamed from: o0ooO0O0.oO0O000o$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0225o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public FileChannel f17067o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public RandomAccessFile f17068o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public FileLock f17069o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f17071o00oOooO;

            public C0225o00oOOo0(FileLock fileLock, int i, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
                this.f17069o00oOo00 = fileLock;
                this.f17071o00oOooO = i;
                this.f17068o00oOOoO = randomAccessFile;
                this.f17067o00oOOo0 = fileChannel;
            }
        }

        public static o00oOOo0 o00oOooO() {
            if (f17065o00oOOoO == null) {
                f17065o00oOOoO = new o00oOOo0();
            }
            return f17065o00oOOoO;
        }

        public boolean o00oOOo0(File file) {
            if (file == null) {
                return false;
            }
            try {
                File file2 = new File(file.getParentFile().getAbsolutePath().concat(o00oo.o00oOOo0(new byte[]{-84, -23, 79, 7, 52}, new byte[]{-125, -123, 32, 100, 95, 110, 7, 103})));
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2.getAbsolutePath(), o00oo.o00oOOo0(new byte[]{-112, -108}, new byte[]{-30, -29, 119, 89, -81, -12, oo0OOoo.f13516o00oOoO, -104}));
                FileChannel channel = randomAccessFile.getChannel();
                FileLock lock = channel.lock();
                if (lock.isValid()) {
                    o00oOo00(file2.getAbsolutePath(), lock, randomAccessFile, channel);
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final int o00oOOoO(String str) {
            if (this.f17066o00oOOo0.containsKey(str)) {
                C0225o00oOOo0 c0225o00oOOo0 = this.f17066o00oOOo0.get(str);
                int i = c0225o00oOOo0.f17071o00oOooO - 1;
                c0225o00oOOo0.f17071o00oOooO = i;
                if (i <= 0) {
                    this.f17066o00oOOo0.remove(str);
                    return i;
                }
                return i;
            }
            return 0;
        }

        public final int o00oOo00(String str, FileLock fileLock, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
            if (!this.f17066o00oOOo0.containsKey(str)) {
                this.f17066o00oOOo0.put(str, new C0225o00oOOo0(fileLock, 1, randomAccessFile, fileChannel));
                return 1;
            }
            C0225o00oOOo0 c0225o00oOOo0 = this.f17066o00oOOo0.get(str);
            int i = c0225o00oOOo0.f17071o00oOooO;
            c0225o00oOOo0.f17071o00oOooO = i + 1;
            return i;
        }

        public void o00oOo0O(File file) {
            C0225o00oOOo0 c0225o00oOOo0;
            File file2 = new File(file.getParentFile().getAbsolutePath().concat(o00oo.o00oOOo0(new byte[]{-49, Ascii.SUB, -68, 72, Ascii.SUB}, new byte[]{-32, 118, -45, 43, 113, 77, -75, -69})));
            if (file2.exists() && this.f17066o00oOOo0.containsKey(file2.getAbsolutePath()) && (c0225o00oOOo0 = this.f17066o00oOOo0.get(file2.getAbsolutePath())) != null) {
                FileLock fileLock = c0225o00oOOo0.f17069o00oOo00;
                RandomAccessFile randomAccessFile = c0225o00oOOo0.f17068o00oOOoO;
                FileChannel fileChannel = c0225o00oOOo0.f17067o00oOOo0;
                try {
                    if (o00oOOoO(file2.getAbsolutePath()) <= 0) {
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f17072o00oOOo0 = 2048;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f17073o00oOOoO = 1024;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f17074o00oOo00 = 512;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f17075o00oOo0O = 128;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f17076o00oOo0o = 64;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f17077o00oOoO = 16;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f17078o00oOoO0 = 32;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f17079o00oOoOO = 8;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f17080o00oOoOo = 4;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f17081o00oOoo0 = 2;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f17082o00oOooO = 256;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f17083o00oOooo = 1;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f17084o00oo00O = 493;
    }

    public static String o00oOOo0(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!o00oo.o00oOOo0(new byte[]{-118}, new byte[]{-92, 92, 122, -23, 105, 107, -101, -19}).equals(str) && !o00oo.o00oOOo0(new byte[]{-63, 9}, new byte[]{-17, 39, Byte.MAX_VALUE, 75, 91, -75, Ascii.DLE, oo0OOoo.f13516o00oOoO}).equals(str)) {
                StringBuilder sb = new StringBuilder(str.length());
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (!o00oo0o(charAt)) {
                        charAt = '_';
                    }
                    sb.append(charAt);
                }
                return sb.toString();
            }
        }
        return o00oo.o00oOOo0(new byte[]{114, 37, 55, -39, -78, 34, 38, -22, 115}, new byte[]{90, 76, 89, -81, -45, 78, 79, -114});
    }

    public static boolean o00oOOoO(String str) {
        return new File(str).canRead();
    }

    public static File o00oOo00(File file, String str) {
        int lastIndexOf;
        String sb;
        String absolutePath = file.getAbsolutePath();
        if (o00oo00O(absolutePath).equals(str)) {
            return file;
        }
        if (absolutePath.lastIndexOf(o00oo.o00oOOo0(new byte[]{115}, new byte[]{93, -89, -66, 35, -112, -40, -125, -90})) > 0) {
            sb = absolutePath.substring(0, lastIndexOf + 1) + str;
        } else {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(absolutePath);
            o00oOOo02.append(o00oo.o00oOOo0(new byte[]{-29}, new byte[]{-51, 82, 126, 87, -82, -59, 83, Ascii.RS}));
            o00oOOo02.append(str);
            sb = o00oOOo02.toString();
        }
        return new File(sb);
    }

    public static void o00oOo0O(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void o00oOo0o(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream2.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    while (true) {
                        allocate.clear();
                        if (channel.read(allocate) == -1) {
                            o00oOo0O(fileInputStream2);
                            o00oOo0O(fileOutputStream);
                            return;
                        }
                        allocate.limit(allocate.position());
                        allocate.position(0);
                        channel2.write(allocate);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    o00oOo0O(fileInputStream);
                    o00oOo0O(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static int o00oOoO(File file) {
        String[] list;
        if (file.exists()) {
            if (file.isFile()) {
                return 1;
            }
            if (!file.isDirectory() || (list = file.list()) == null) {
                return 0;
            }
            return list.length;
        }
        return -1;
    }

    public static boolean o00oOoO0(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream2.flush();
                        o00oOo0O(inputStream);
                        o00oOo0O(fileOutputStream2);
                        return true;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                o00oOo0O(inputStream);
                o00oOo0O(fileOutputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public static void o00oOoOO(String str, String str2) throws Exception {
        try {
            Os.link(str, str2);
        } catch (Throwable unused) {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(o00oo.o00oOOo0(new byte[]{-37, -95, -121, -5, 59, 80}, new byte[]{-73, -49, -89, -42, 72, 112, 43, 114}) + str + " " + str2).waitFor();
        }
    }

    public static int o00oOoOo(File file) {
        boolean z;
        int i = 0;
        if (file.isDirectory()) {
            try {
                z = o00oo0Oo(file);
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                String[] list = file.list();
                int length = list.length;
                int i2 = 0;
                while (i < length) {
                    i2 += o00oOoOo(new File(file, list[i]));
                    i++;
                }
                i = i2;
            }
        }
        return file.delete() ? i + 1 : i;
    }

    public static int o00oOoo0(String str) {
        return o00oOoOo(new File(str));
    }

    public static void o00oOooO(String str, int i) throws Exception {
        try {
            Os.chmod(str, i);
        } catch (Exception unused) {
            File file = new File(str);
            String o00oOOo02 = o00oo.o00oOOo0(new byte[]{Ascii.SYN, 79, -34, Ascii.SUB, 100, -46}, new byte[]{117, 39, -77, 117, 0, -14, 107, 117});
            if (file.isDirectory()) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0(o00oOOo02);
                o00oOOo03.append(o00oo.o00oOOo0(new byte[]{Ascii.ESC, -85, 108, 110}, new byte[]{59, -122, 62, 78, -81, -19, -125, -34}));
                o00oOOo02 = o00oOOo03.toString();
            }
            String format = String.format(o00oo.o00oOOo0(new byte[]{-71, -107}, new byte[]{-100, -6, -126, -5, 38, -80, 91, 79}), Integer.valueOf(i));
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(o00oOOo02 + format + " " + str).waitFor();
        }
    }

    public static String o00oOooo(Context context, Uri uri, String str, String[] strArr) {
        o00oo.o00oOOo0(new byte[]{-15, 77, -24, -65, -85}, new byte[]{-82, 41, -119, -53, -54, -27, -89, -94});
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{o00oo.o00oOOo0(new byte[]{53, Ascii.DLE, 118, -20, -75}, new byte[]{106, 116, Ascii.ETB, -104, -44, o0OO0o00.f16655o00oOoOO, -56, -91})}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(o00oo.o00oOOo0(new byte[]{87, -57, -25, 17, Ascii.ESC}, new byte[]{8, -93, -122, 101, 122, -125, -34, 81})));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int o00oo(byte[] bArr, int i, ByteOrder byteOrder) {
        int i2;
        int i3;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            i2 = ((bArr[i] & 255) << 24) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 8);
            i3 = bArr[i5 + 1] & 255;
        } else {
            int i6 = i + 1;
            int i7 = i6 + 1;
            i2 = (bArr[i] & 255) | ((bArr[i6] & 255) << 8) | ((bArr[i7] & 255) << 16);
            i3 = (bArr[i7 + 1] & 255) << 24;
        }
        return i3 | i2;
    }

    public static boolean o00oo0(Uri uri) {
        return o00oo.o00oOOo0(new byte[]{57, -59, 32, Ascii.ETB, 126, -20, -102, -51, 53, -61, 41, Ascii.ETB, 111, -16, -111, -55, 51, -50, 40, 75, 108, -84, -102, -48, 45, -60, o0OO0o00.f16655o00oOoOO, 86, 126, -26, -115, -111, 62, -59, 46, 76, 114, -25, -112, -53, 41}, new byte[]{90, -86, 77, 57, Ascii.US, -126, -2, -65}).equals(uri.getAuthority());
    }

    public static String o00oo00O(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }

    public static boolean o00oo0O(Uri uri) {
        return o00oo.o00oOOo0(new byte[]{-24, -26, 77, -119, -39, -38, 77, 105, -28, -32, 68, -119, -56, -58, 70, 109, -30, -19, 69, -43, -53, -102, 68, 126, -17, -32, 65, -119, -36, -37, 74, 110, -26, -20, 78, -45, -53}, new byte[]{-117, -119, 32, -89, -72, -76, 41, Ascii.ESC}).equals(uri.getAuthority());
    }

    public static boolean o00oo0O0(Uri uri) {
        return o00oo.o00oOOo0(new byte[]{-18, 114, 124, 42, Ascii.ETB, -47, -123, -89, -30, 116, 117, 42, 19, -57, -107, -80, -1, 115, 112, 104, 5, -53, -114, -89, -20, 122, 116, 42, Ascii.DC2, -48, -126, -96, -32, 120, Byte.MAX_VALUE, 112, 5}, new byte[]{-115, Ascii.GS, 17, 4, 118, -65, -31, -43}).equals(uri.getAuthority());
    }

    public static boolean o00oo0OO(String str) {
        return new File(str).exists();
    }

    public static boolean o00oo0Oo(File file) throws IOException {
        if (file != null) {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Ascii.SUB, -9, -34, -99, -18, -120, -71, 63, 40, -66, -36, -105, -70, -59, -82, 41, 124, -16, -57, -108, -94}, new byte[]{92, -98, -78, -8, -50, -27, -52, 76}));
    }

    public static boolean o00oo0o(char c) {
        return (c == 0 || c == '/') ? false : true;
    }

    public static boolean o00oo0o0(String str) {
        return str != null && str.equals(o00oOOo0(str));
    }

    public static void o00oo0oO(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static byte[] o00ooO(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String o00ooO0(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = fileInputStream.read();
            if (read == -1) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(read);
        }
    }

    public static Parcel o00ooO00(File file) throws IOException {
        Parcel obtain = Parcel.obtain();
        byte[] o00ooO0o2 = o00ooO0o(file);
        obtain.unmarshall(o00ooO0o2, 0, o00ooO0o2.length);
        obtain.setDataPosition(0);
        return obtain;
    }

    public static boolean o00ooO0O(File file, File file2) {
        return file.renameTo(file2);
    }

    public static byte[] o00ooO0o(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return o00ooO(fileInputStream);
        } finally {
            o00oOo0O(fileInputStream);
        }
    }

    public static void o00ooOO(Parcel parcel, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write(parcel.marshall());
    }

    public static void o00ooOO0(Parcel parcel, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(parcel.marshall());
        fileOutputStream.close();
    }

    public static void o00ooOOo(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read == -1) {
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    public static void o00ooOo0(byte[] bArr, File file) throws IOException {
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel2 = null;
        fileOutputStream = null;
        try {
            readableByteChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileChannel2 = fileOutputStream2.getChannel();
                    fileChannel2.transferFrom(readableByteChannel, 0L, bArr.length);
                    fileOutputStream2.close();
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    fileChannel2.close();
                } catch (Throwable th) {
                    th = th;
                    fileChannel = fileChannel2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
            readableByteChannel = null;
        }
    }

    public static void o0O0o(String str) {
        o00oo0oO(new File(str));
    }
}
