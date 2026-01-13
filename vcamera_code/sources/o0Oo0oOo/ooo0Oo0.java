package o0Oo0oOo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import o0Oo.o00ooO;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class ooo0Oo0 {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f16632o00oOoo0 = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f16633o00oOooo = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final long f16636o00oo0OO = 32;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public RandomAccessFile f16637o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Thread f16638o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O0O0Oo f16639o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public long f16640o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f16641o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O0000O f16643o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final long f16644o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f16645o00oOoOo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final o0O0000O f16635o00oo00O = o0O0000O.encodeUtf8("OkHttp cache v1\n");

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final o0O0000O f16634o00oo0 = o0O0000O.encodeUtf8("OkHttp DIRTY :(\n");

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00ooO f16646o00oOooO = new o00ooO();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final o00ooO f16642o00oOoO = new o00ooO();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O0O0Oo {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o0oo0000 f16647o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O0O0o0 f16648o00oo0O0 = new o0O0O0o0();

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public long f16649o00oo0Oo;

        public o00oOOo0() {
            this.f16647o00oo0O = new o0oo0000(ooo0Oo0.this.f16637o00oOOo0.getChannel());
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16647o00oo0O == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f16647o00oo0O = null;
            synchronized (ooo0Oo0.this) {
                ooo0Oo0 ooo0oo0 = ooo0Oo0.this;
                int i = ooo0oo0.f16645o00oOoOo - 1;
                ooo0oo0.f16645o00oOoOo = i;
                if (i == 0) {
                    RandomAccessFile randomAccessFile2 = ooo0oo0.f16637o00oOOo0;
                    ooo0oo0.f16637o00oOOo0 = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                oO0000O.o00oOo00(randomAccessFile);
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f16648o00oo0O0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
            if (r0 != true) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
            r2 = java.lang.Math.min(r23, r7 - r21.f16649o00oo0Oo);
            r21.f16647o00oo0O.o00oOOo0(r21.f16649o00oo0Oo + 32, r22, r2);
            r21.f16649o00oo0Oo += r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
            r0 = r21.f16650o00oo0o0;
            r9 = r0.f16639o00oOo00.o0O0o000(r0.f16646o00oOooO, r0.f16644o00oOoOO);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
            if (r9 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
            r21.f16650o00oo0o0.o00oOOo0(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
            r2 = r21.f16650o00oo0o0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
            r0 = r21.f16650o00oo0o0;
            r0.f16638o00oOOoO = null;
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
            r2 = java.lang.Math.min(r9, r23);
            r21.f16650o00oo0o0.f16646o00oOooO.o00ooO00(r22, 0, r2);
            r21.f16649o00oo0Oo += r2;
            r21.f16647o00oo0O.o00oOOoO(r7 + 32, r21.f16650o00oo0o0.f16646o00oOooO.clone(), r9);
            r4 = r21.f16650o00oo0o0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
            r0 = r21.f16650o00oo0o0;
            r0.f16642o00oOoO.o00oo(r0.f16646o00oOooO, r9);
            r0 = r21.f16650o00oo0o0;
            r5 = r0.f16642o00oOoO;
            r7 = r5.f15434o00oo0O;
            r11 = r0.f16644o00oOoOO;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
            if (r7 <= r11) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
            r5.skip(r7 - r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
            r5 = r21.f16650o00oo0o0;
            r5.f16640o00oOo0O += r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
            monitor-enter(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
            r0 = r21.f16650o00oo0o0;
            r0.f16638o00oOOoO = null;
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
            monitor-exit(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
            monitor-enter(r21.f16650o00oo0o0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
            r3 = r21.f16650o00oo0o0;
            r3.f16638o00oOOoO = null;
            r3.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
            throw r0;
         */
        @Override // o0Oo.o0O0O0Oo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long o0O0o000(o0Oo.o00ooO r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo0oOo.ooo0Oo0.o00oOOo0.o0O0o000(o0Oo.o00ooO, long):long");
        }
    }

    public ooo0Oo0(RandomAccessFile randomAccessFile, o0O0O0Oo o0o0o0oo, long j, o0O0000O o0o0000o, long j2) {
        this.f16637o00oOOo0 = randomAccessFile;
        this.f16639o00oOo00 = o0o0o0oo;
        this.f16641o00oOo0o = o0o0o0oo == null;
        this.f16640o00oOo0O = j;
        this.f16643o00oOoO0 = o0o0000o;
        this.f16644o00oOoOO = j2;
    }

    public static ooo0Oo0 o00oOOoO(File file, o0O0O0Oo o0o0o0oo, o0O0000O o0o0000o, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        ooo0Oo0 ooo0oo0 = new ooo0Oo0(randomAccessFile, o0o0o0oo, 0L, o0o0000o, j);
        randomAccessFile.setLength(0L);
        ooo0oo0.o00oOoO0(f16634o00oo0, -1L, -1L);
        return ooo0oo0;
    }

    public static ooo0Oo0 o00oOo0o(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        o0oo0000 o0oo0000Var = new o0oo0000(randomAccessFile.getChannel());
        o00ooO o00ooo = new o00ooO();
        o0oo0000Var.o00oOOo0(0L, o00ooo, 32L);
        o0O0000O o0o0000o = f16635o00oo00O;
        if (o00ooo.o0O00o(o0o0000o.size()).equals(o0o0000o)) {
            long readLong = o00ooo.readLong();
            long readLong2 = o00ooo.readLong();
            o00ooO o00ooo2 = new o00ooO();
            o0oo0000Var.o00oOOo0(readLong + 32, o00ooo2, readLong2);
            return new ooo0Oo0(randomAccessFile, null, readLong, o00ooo2.o0O0Ooo(), 0L);
        }
        throw new IOException("unreadable cache file");
    }

    public void o00oOOo0(long j) throws IOException {
        o00oOoO(j);
        this.f16637o00oOOo0.getChannel().force(false);
        o00oOoO0(f16635o00oo00O, j, this.f16643o00oOoO0.size());
        this.f16637o00oOOo0.getChannel().force(false);
        synchronized (this) {
            this.f16641o00oOo0o = true;
        }
        oO0000O.o00oOo00(this.f16639o00oOo00);
        this.f16639o00oOo00 = null;
    }

    public boolean o00oOo00() {
        return this.f16637o00oOOo0 == null;
    }

    public o0O0O0Oo o00oOo0O() {
        synchronized (this) {
            if (this.f16637o00oOOo0 == null) {
                return null;
            }
            this.f16645o00oOoOo++;
            return new o00oOOo0();
        }
    }

    public final void o00oOoO(long j) throws IOException {
        o00ooO o00ooo = new o00ooO();
        o00ooo.o0O0OO0O(this.f16643o00oOoO0);
        new o0oo0000(this.f16637o00oOOo0.getChannel()).o00oOOoO(32 + j, o00ooo, this.f16643o00oOoO0.size());
    }

    public final void o00oOoO0(o0O0000O o0o0000o, long j, long j2) throws IOException {
        o00ooO o00ooo = new o00ooO();
        o00ooo.o0O0OO0O(o0o0000o);
        o00ooo.writeLong(j);
        o00ooo.writeLong(j2);
        if (o00ooo.f15434o00oo0O != 32) {
            throw new IllegalArgumentException();
        }
        new o0oo0000(this.f16637o00oOOo0.getChannel()).o00oOOoO(0L, o00ooo, 32L);
    }

    public o0O0000O o00oOooO() {
        return this.f16643o00oOoO0;
    }
}
