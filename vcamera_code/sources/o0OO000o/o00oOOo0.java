package o0OO000o;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static o00oOOo0 f12952o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Map<String, C0161o00oOOo0> f12953o00oOOo0 = new ConcurrentHashMap();

    /* renamed from: o0OO000o.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0161o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public FileChannel f12954o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public RandomAccessFile f12955o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public FileLock f12956o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f12958o00oOooO;

        public C0161o00oOOo0(FileLock fileLock, int i, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
            this.f12956o00oOo00 = fileLock;
            this.f12958o00oOooO = i;
            this.f12955o00oOOoO = randomAccessFile;
            this.f12954o00oOOo0 = fileChannel;
        }
    }

    public static o00oOOo0 o00oOooO() {
        if (f12952o00oOOoO == null) {
            f12952o00oOOoO = new o00oOOo0();
        }
        return f12952o00oOOoO;
    }

    public boolean o00oOOo0(File file) {
        if (file == null) {
            return false;
        }
        try {
            File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
            if (!file2.exists()) {
                file2.createNewFile();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2.getAbsolutePath(), "rw");
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
        if (this.f12953o00oOOo0.containsKey(str)) {
            C0161o00oOOo0 c0161o00oOOo0 = this.f12953o00oOOo0.get(str);
            int i = c0161o00oOOo0.f12958o00oOooO - 1;
            c0161o00oOOo0.f12958o00oOooO = i;
            if (i <= 0) {
                this.f12953o00oOOo0.remove(str);
                return i;
            }
            return i;
        }
        return 0;
    }

    public final int o00oOo00(String str, FileLock fileLock, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        if (!this.f12953o00oOOo0.containsKey(str)) {
            this.f12953o00oOOo0.put(str, new C0161o00oOOo0(fileLock, 1, randomAccessFile, fileChannel));
            return 1;
        }
        C0161o00oOOo0 c0161o00oOOo0 = this.f12953o00oOOo0.get(str);
        int i = c0161o00oOOo0.f12958o00oOooO;
        c0161o00oOOo0.f12958o00oOooO = i + 1;
        return i;
    }

    public void o00oOo0O(File file) {
        C0161o00oOOo0 c0161o00oOOo0;
        File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
        if (file2.exists() && this.f12953o00oOOo0.containsKey(file2.getAbsolutePath()) && (c0161o00oOOo0 = this.f12953o00oOOo0.get(file2.getAbsolutePath())) != null) {
            FileLock fileLock = c0161o00oOOo0.f12956o00oOo00;
            RandomAccessFile randomAccessFile = c0161o00oOOo0.f12955o00oOOoO;
            FileChannel fileChannel = c0161o00oOOo0.f12954o00oOOo0;
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
