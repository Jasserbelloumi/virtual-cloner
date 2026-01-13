package o0Oo0Oo0;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o0O0OO0.o00oOo0O;
import o0Oo0Oo.oO0000O;
import o0Oo0Ooo.o0OOOO;
import o0Oo0Ooo.o0OOOO0o;
import o0Oo0Ooo.oO0Oo;
import o0Oo0oO.oO0Ooooo;
/* loaded from: classes3.dex */
public final class o0O0O0o0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final /* synthetic */ boolean f15832o00oOoO = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final Executor f15833o00oOoO0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), oO0000O.o00ooO0("OkHttp ConnectionPool", true));

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f15834o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final long f15835o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Runnable f15836o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0OOOO f15837o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f15838o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Deque<o0OOOO0o> f15839o00oOooO;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long o00oOOo02 = o0O0O0o0.this.o00oOOo0(System.nanoTime());
                if (o00oOOo02 == -1) {
                    return;
                }
                if (o00oOOo02 > 0) {
                    long j = o00oOOo02 / 1000000;
                    long j2 = o00oOOo02 - (1000000 * j);
                    synchronized (o0O0O0o0.this) {
                        try {
                            o0O0O0o0.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public o0O0O0o0() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public o0O0O0o0(int i, long j, TimeUnit timeUnit) {
        this.f15836o00oOo00 = new o00oOOo0();
        this.f15839o00oOooO = new ArrayDeque();
        this.f15837o00oOo0O = new o0OOOO();
        this.f15834o00oOOo0 = i;
        this.f15835o00oOOoO = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(o00oOo0O.o00oOOo0("keepAliveDuration <= 0: ", j));
        }
    }

    public long o00oOOo0(long j) {
        synchronized (this) {
            o0OOOO0o o0oooo0o = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (o0OOOO0o o0oooo0o2 : this.f15839o00oOooO) {
                if (o00oOoO(o0oooo0o2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - o0oooo0o2.f16309o00oo0OO;
                    if (j3 > j2) {
                        o0oooo0o = o0oooo0o2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f15835o00oOOoO;
            if (j2 < j4 && i <= this.f15834o00oOOo0) {
                if (i > 0) {
                    return j4 - j2;
                } else if (i2 > 0) {
                    return j4;
                } else {
                    this.f15838o00oOo0o = false;
                    return -1L;
                }
            }
            this.f15839o00oOooO.remove(o0oooo0o);
            oO0000O.o00oOo0O(o0oooo0o.f16298o00oOo0O);
            return 0L;
        }
    }

    public boolean o00oOOoO(o0OOOO0o o0oooo0o) {
        if (o0oooo0o.f16304o00oOoo0 || this.f15834o00oOOo0 == 0) {
            this.f15839o00oOooO.remove(o0oooo0o);
            return true;
        }
        notifyAll();
        return false;
    }

    public synchronized int o00oOo00() {
        return this.f15839o00oOooO.size();
    }

    public void o00oOo0O() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<o0OOOO0o> it = this.f15839o00oOooO.iterator();
            while (it.hasNext()) {
                o0OOOO0o next = it.next();
                if (next.f16307o00oo0.isEmpty()) {
                    next.f16304o00oOoo0 = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            oO0000O.o00oOo0O(((o0OOOO0o) it2.next()).f16298o00oOo0O);
        }
    }

    @Nullable
    public o0OOOO0o o00oOo0o(o0O00O o0o00o, oO0Oo oo0oo, o0OO00o0 o0oo00o0) {
        for (o0OOOO0o o0oooo0o : this.f15839o00oOooO) {
            if (o0oooo0o.o00oo0OO(o0o00o, o0oo00o0)) {
                oo0oo.o00oOOo0(o0oooo0o);
                return o0oooo0o;
            }
        }
        return null;
    }

    public final int o00oOoO(o0OOOO0o o0oooo0o, long j) {
        List<Reference<oO0Oo>> list = o0oooo0o.f16307o00oo0;
        int i = 0;
        while (i < list.size()) {
            Reference<oO0Oo> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("A connection to ");
                o00oOOo02.append(o0oooo0o.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0);
                o00oOOo02.append(" was leaked. Did you forget to close a response body?");
                oO0Ooooo.o00oOoO().o00oo0(o00oOOo02.toString(), ((oO0Oo.o00oOOo0) reference).f16332o00oOOo0);
                list.remove(i);
                o0oooo0o.f16304o00oOoo0 = true;
                if (list.isEmpty()) {
                    o0oooo0o.f16309o00oo0OO = j - this.f15835o00oOOoO;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public synchronized int o00oOoO0() {
        int i;
        i = 0;
        for (o0OOOO0o o0oooo0o : this.f15839o00oOooO) {
            if (o0oooo0o.f16307o00oo0.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public void o00oOoOO(o0OOOO0o o0oooo0o) {
        if (!this.f15838o00oOo0o) {
            this.f15838o00oOo0o = true;
            f15833o00oOoO0.execute(this.f15836o00oOo00);
        }
        this.f15839o00oOooO.add(o0oooo0o);
    }

    @Nullable
    public Socket o00oOooO(o0O00O o0o00o, oO0Oo oo0oo) {
        for (o0OOOO0o o0oooo0o : this.f15839o00oOooO) {
            if (o0oooo0o.o00oo0OO(o0o00o, null) && o0oooo0o.o00oo0O() && o0oooo0o != oo0oo.o00oOooO()) {
                return oo0oo.o00oo00O(o0oooo0o);
            }
        }
        return null;
    }
}
