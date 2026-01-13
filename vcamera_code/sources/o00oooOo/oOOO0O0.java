package o00oooOo;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.o00oOo0O;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000O.o00oo0OO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOO0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9843o00oOOo0 = "TypefaceCompatUtil";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9844o00oOOoO = ".font";

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ParcelFileDescriptor o00oOOo0(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    public static void o00oOOo0(@o0OO00OO Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static ByteBuffer o00oOOoO(@oo0oO0 Context context, @oo0oO0 Resources resources, int i) {
        File o00oOo0O2 = o00oOo0O(context);
        if (o00oOo0O2 == null) {
            return null;
        }
        try {
            if (o00oOo00(o00oOo0O2, resources, i)) {
                return o00oOoO0(o00oOo0O2);
            }
            return null;
        } finally {
            o00oOo0O2.delete();
        }
    }

    public static boolean o00oOo00(@oo0oO0 File file, @oo0oO0 Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean o00oOooO2 = o00oOooO(file, inputStream);
                o00oOOo0(inputStream);
                return o00oOooO2;
            } catch (Throwable th) {
                th = th;
                o00oOOo0(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    @o0OO00OO
    public static File o00oOo0O(@oo0oO0 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(f9844o00oOOoO);
        o00oOOo02.append(Process.myPid());
        o00oOOo02.append("-");
        o00oOOo02.append(Process.myTid());
        o00oOOo02.append("-");
        String sb = o00oOOo02.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, android.support.v4.media.o00oOOo0.o00oOOo0(sb, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static ByteBuffer o00oOo0o(@oo0oO0 Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 Uri uri) {
        try {
            ParcelFileDescriptor o00oOOo02 = o00oOOo0.o00oOOo0(context.getContentResolver(), uri, "r", cancellationSignal);
            if (o00oOOo02 == null) {
                if (o00oOOo02 != null) {
                    o00oOOo02.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(o00oOOo02.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                o00oOOo02.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @o0OOooO0(19)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static Map<Uri, ByteBuffer> o00oOoO(@oo0oO0 Context context, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, @o0OO00OO CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (o00oo0OO.o00oOo00 o00ooo002 : o00ooo00Arr) {
            if (o00ooo002.o00oOOoO() == 0) {
                Uri o00oOooO2 = o00ooo002.o00oOooO();
                if (!hashMap.containsKey(o00oOooO2)) {
                    hashMap.put(o00oOooO2, o00oOo0o(context, cancellationSignal, o00oOooO2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @o0OOooO0(19)
    @o0OO00OO
    public static ByteBuffer o00oOoO0(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean o00oOooO(@oo0oO0 File file, @oo0oO0 InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    o00oOOo0(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            o00oOOo0(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            o00oOOo0(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }
}
