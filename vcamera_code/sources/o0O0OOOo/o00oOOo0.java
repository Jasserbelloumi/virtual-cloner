package o0O0OOOo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o00oOoOo.o00oo;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Map<String, Lock> f11474o00oOo0O = new HashMap();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final File f11475o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Lock f11476o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final boolean f11477o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public FileChannel f11478o00oOooO;

    public o00oOOo0(@oo0oO0 String str, @oo0oO0 File file, boolean z) {
        File file2 = new File(file, o00oo.o00oOOo0(str, ".lck"));
        this.f11475o00oOOo0 = file2;
        this.f11476o00oOOoO = o00oOOo0(file2.getAbsolutePath());
        this.f11477o00oOo00 = z;
    }

    public static Lock o00oOOo0(String str) {
        Lock lock;
        Map<String, Lock> map = f11474o00oOo0O;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void o00oOOoO() {
        this.f11476o00oOOoO.lock();
        if (this.f11477o00oOo00) {
            try {
                FileChannel channel = new FileOutputStream(this.f11475o00oOOo0).getChannel();
                this.f11478o00oOooO = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    public void o00oOo00() {
        FileChannel fileChannel = this.f11478o00oOooO;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f11476o00oOOoO.unlock();
    }
}
