package o0Oo;

import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public class o00oo extends o0O0O0o0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f15421o00oOoO = 65536;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final long f15422o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final long f15423o00oOoOo;
    @Nullable

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static o00oo f15424o00oOoo0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f15425o00oOo0O;
    @Nullable

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oo f15426o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public long f15427o00oOoO0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O0oo0o {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0oo0o f15429o00oo0O0;

        public o00oOOo0(o0O0oo0o o0o0oo0o) {
            this.f15429o00oo0O0 = o0o0oo0o;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            o00oo.this.o00oo00O();
            try {
                try {
                    this.f15429o00oo0O0.close();
                    o00oo.this.o00oo0OO(true);
                } catch (IOException e) {
                    throw o00oo.this.o00oo0(e);
                }
            } catch (Throwable th) {
                o00oo.this.o00oo0OO(false);
                throw th;
            }
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            o00oo.this.o00oo00O();
            try {
                try {
                    this.f15429o00oo0O0.flush();
                    o00oo.this.o00oo0OO(true);
                } catch (IOException e) {
                    throw o00oo.this.o00oo0(e);
                }
            } catch (Throwable th) {
                o00oo.this.o00oo0OO(false);
                throw th;
            }
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return o00oo.this;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    o0O00oO0 o0o00oo02 = o00ooo.f15435o00oo0O0;
                    j2 += o0o00oo02.f15494o00oOo00 - o0o00oo02.f15493o00oOOoO;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                }
                o00oo.this.o00oo00O();
                try {
                    try {
                        this.f15429o00oo0O0.o00oo(o00ooo, j2);
                        j -= j2;
                        o00oo.this.o00oo0OO(true);
                    } catch (IOException e) {
                        throw o00oo.this.o00oo0(e);
                    }
                } catch (Throwable th) {
                    o00oo.this.o00oo0OO(false);
                    throw th;
                }
            }
        }

        public String toString() {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("AsyncTimeout.sink(");
            o00oOOo02.append(this.f15429o00oo0O0);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0O0Oo f15431o00oo0O0;

        public o00oOOoO(o0O0O0Oo o0o0o0oo) {
            this.f15431o00oo0O0 = o0o0o0oo;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f15431o00oo0O0.close();
                    o00oo.this.o00oo0OO(true);
                } catch (IOException e) {
                    throw o00oo.this.o00oo0(e);
                }
            } catch (Throwable th) {
                o00oo.this.o00oo0OO(false);
                throw th;
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return o00oo.this;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            o00oo.this.o00oo00O();
            try {
                try {
                    long o0O0o0002 = this.f15431o00oo0O0.o0O0o000(o00ooo, j);
                    o00oo.this.o00oo0OO(true);
                    return o0O0o0002;
                } catch (IOException e) {
                    throw o00oo.this.o00oo0(e);
                }
            } catch (Throwable th) {
                o00oo.this.o00oo0OO(false);
                throw th;
            }
        }

        public String toString() {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("AsyncTimeout.source(");
            o00oOOo02.append(this.f15431o00oo0O0);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends Thread {
        public o00oOo00() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.o0O0o();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<o0Oo.o00oo> r0 = o0Oo.o00oo.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                o0Oo.o00oo r1 = o0Oo.o00oo.o00oOoo0()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                o0Oo.o00oo r2 = o0Oo.o00oo.f15424o00oOoo0     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                o0Oo.o00oo.f15424o00oOoo0 = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.o0O0o()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo.o00oo.o00oOo00.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15422o00oOoOO = millis;
        f15423o00oOoOo = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static o00oo o00oOoo0() throws InterruptedException {
        o00oo o00ooVar = f15424o00oOoo0.f15426o00oOo0o;
        long nanoTime = System.nanoTime();
        if (o00ooVar == null) {
            o00oo.class.wait(f15422o00oOoOO);
            if (f15424o00oOoo0.f15426o00oOo0o != null || System.nanoTime() - nanoTime < f15423o00oOoOo) {
                return null;
            }
            return f15424o00oOoo0;
        }
        long o00oo0Oo2 = o00ooVar.o00oo0Oo(nanoTime);
        if (o00oo0Oo2 > 0) {
            long j = o00oo0Oo2 / 1000000;
            o00oo.class.wait(j, (int) (o00oo0Oo2 - (1000000 * j)));
            return null;
        }
        f15424o00oOoo0.f15426o00oOo0o = o00ooVar.f15426o00oOo0o;
        o00ooVar.f15426o00oOo0o = null;
        return o00ooVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1.f15426o00oOo0o = r3.f15426o00oOo0o;
        r3.f15426o00oOo0o = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean o00oOooo(o0Oo.o00oo r3) {
        /*
            java.lang.Class<o0Oo.o00oo> r0 = o0Oo.o00oo.class
            monitor-enter(r0)
            o0Oo.o00oo r1 = o0Oo.o00oo.f15424o00oOoo0     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            o0Oo.o00oo r2 = r1.f15426o00oOo0o     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            o0Oo.o00oo r2 = r3.f15426o00oOo0o     // Catch: java.lang.Throwable -> L19
            r1.f15426o00oOo0o = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f15426o00oOo0o = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo.o00oo.o00oOooo(o0Oo.o00oo):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:16:0x003a, B:17:0x0040, B:19:0x0044, B:22:0x004d, B:23:0x0050, B:25:0x005a, B:15:0x0034, B:28:0x005f, B:29:0x0064), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void o00oo0o0(o0Oo.o00oo r5, long r6, boolean r8) {
        /*
            java.lang.Class<o0Oo.o00oo> r0 = o0Oo.o00oo.class
            monitor-enter(r0)
            o0Oo.o00oo r1 = o0Oo.o00oo.f15424o00oOoo0     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            o0Oo.o00oo r1 = new o0Oo.o00oo     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            o0Oo.o00oo.f15424o00oOoo0 = r1     // Catch: java.lang.Throwable -> L65
            o0Oo.o00oo$o00oOo00 r1 = new o0Oo.o00oo$o00oOo00     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L2f
            if (r8 == 0) goto L2f
            long r3 = r5.o00oOooO()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r6 = java.lang.Math.min(r6, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r6 = r6 + r1
            r5.f15427o00oOoO0 = r6     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r3 == 0) goto L32
            goto L2b
        L32:
            if (r8 == 0) goto L5f
            long r6 = r5.o00oOooO()     // Catch: java.lang.Throwable -> L65
            r5.f15427o00oOoO0 = r6     // Catch: java.lang.Throwable -> L65
        L3a:
            long r6 = r5.o00oo0Oo(r1)     // Catch: java.lang.Throwable -> L65
            o0Oo.o00oo r8 = o0Oo.o00oo.f15424o00oOoo0     // Catch: java.lang.Throwable -> L65
        L40:
            o0Oo.o00oo r3 = r8.f15426o00oOo0o     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.o00oo0Oo(r1)     // Catch: java.lang.Throwable -> L65
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4d
            goto L50
        L4d:
            o0Oo.o00oo r8 = r8.f15426o00oOo0o     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            o0Oo.o00oo r6 = r8.f15426o00oOo0o     // Catch: java.lang.Throwable -> L65
            r5.f15426o00oOo0o = r6     // Catch: java.lang.Throwable -> L65
            r8.f15426o00oOo0o = r5     // Catch: java.lang.Throwable -> L65
            o0Oo.o00oo r5 = o0Oo.o00oo.f15424o00oOoo0     // Catch: java.lang.Throwable -> L65
            if (r8 != r5) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L65
            throw r5     // Catch: java.lang.Throwable -> L65
        L65:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo.o00oo.o00oo0o0(o0Oo.o00oo, long, boolean):void");
    }

    public final IOException o00oo0(IOException iOException) throws IOException {
        return !o00oo0O0() ? iOException : o00oo0O(iOException);
    }

    public final void o00oo00O() {
        if (this.f15425o00oOo0O) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long o00oOoOO2 = o00oOoOO();
        boolean o00oOo0o2 = o00oOo0o();
        if (o00oOoOO2 != 0 || o00oOo0o2) {
            this.f15425o00oOo0O = true;
            o00oo0o0(this, o00oOoOO2, o00oOo0o2);
        }
    }

    public IOException o00oo0O(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean o00oo0O0() {
        if (this.f15425o00oOo0O) {
            this.f15425o00oOo0O = false;
            return o00oOooo(this);
        }
        return false;
    }

    public final void o00oo0OO(boolean z) throws IOException {
        if (o00oo0O0() && z) {
            throw o00oo0O(null);
        }
    }

    public final long o00oo0Oo(long j) {
        return this.f15427o00oOoO0 - j;
    }

    public final o0O0oo0o o00oo0o(o0O0oo0o o0o0oo0o) {
        return new o00oOOo0(o0o0oo0o);
    }

    public final o0O0O0Oo o00oo0oO(o0O0O0Oo o0o0o0oo) {
        return new o00oOOoO(o0o0o0oo);
    }

    public void o0O0o() {
    }
}
