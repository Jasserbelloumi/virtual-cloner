package o0Oo0OoO;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o00oOoOo.o00oo;
import o0Oo.o0;
import o0Oo.o0O00000;
import o0Oo.o0O00O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0oo0o;
import o0Oo.o0oO0Ooo;
import o0Oo0Oo.oO0000O;
import o0Oo0oO.oO0Ooooo;
import o0Oo0oO0.o0OOooO0;
/* loaded from: classes3.dex */
public final class o0OOO00 implements Closeable, Flushable {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ boolean f16232o0 = false;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f16233o00ooo0 = "journal.tmp";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f16234o00ooo00 = "journal";

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f16235o00ooo0O = "journal.bkp";

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final String f16236o00ooo0o = "libcore.io.DiskLruCache";

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f16237o00oooO = "1";

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final long f16238o00oooOO = -1;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final Pattern f16239o00oooOo = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f16240o00oooo = "DIRTY";

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f16241o00oooo0 = "CLEAN";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f16242o00ooooO = "REMOVE";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f16243o00ooooo = "READ";

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f16244o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final File f16245o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOooO0 f16246o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final File f16247o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final File f16248o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final File f16249o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f16250o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f16251o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o0 f16252o00ooO0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f16255o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f16256o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f16257o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public boolean f16258o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f16260o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final Executor f16261o00ooOoO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public long f16263o0O0o;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public long f16253o00ooO00 = 0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final LinkedHashMap<String, o00oOoO> f16254o00ooO0O = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o00ooOo  reason: collision with root package name */
    public long f16259o00ooOo = 0;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final Runnable f16262o00ooOoo = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (o0OOO00.this) {
                o0OOO00 o0ooo00 = o0OOO00.this;
                if ((!o0ooo00.f16257o00ooOO0) || o0ooo00.f16256o00ooOO) {
                    return;
                }
                try {
                    o0ooo00.o0O0O0Oo();
                } catch (IOException unused) {
                    o0OOO00.this.f16258o00ooOOo = true;
                }
                try {
                    if (o0OOO00.this.o00ooO0O()) {
                        o0OOO00.this.o0O000O();
                        o0OOO00.this.f16255o00ooO0o = 0;
                    }
                } catch (IOException unused2) {
                    o0OOO00 o0ooo002 = o0OOO00.this;
                    o0ooo002.f16260o00ooOo0 = true;
                    o0ooo002.f16252o00ooO0 = new o0oO0Ooo(o0O00O.o00oOOoO());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends o0OOO0 {

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final /* synthetic */ boolean f16265o00oo0o0 = false;

        public o00oOOoO(o0O0oo0o o0o0oo0o) {
            super(o0o0oo0o);
        }

        @Override // o0Oo0OoO.o0OOO0
        public void o00oOOoO(IOException iOException) {
            o0OOO00.this.f16251o00ooO = true;
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements Iterator<o00oo00O> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oo00O f16267o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<o00oOoO> f16268o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o00oo00O f16269o00oo0Oo;

        public o00oOo00() {
            this.f16268o00oo0O0 = new ArrayList(o0OOO00.this.f16254o00ooO0O.values()).iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16267o00oo0O != null) {
                return true;
            }
            synchronized (o0OOO00.this) {
                if (o0OOO00.this.f16256o00ooOO) {
                    return false;
                }
                while (this.f16268o00oo0O0.hasNext()) {
                    o00oo00O o00oOo002 = this.f16268o00oo0O0.next().o00oOo00();
                    if (o00oOo002 != null) {
                        this.f16267o00oo0O = o00oOo002;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: o00oOOo0 */
        public o00oo00O next() {
            if (hasNext()) {
                o00oo00O o00oo00o = this.f16267o00oo0O;
                this.f16269o00oo0Oo = o00oo00o;
                this.f16267o00oo0O = null;
                return o00oo00o;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            o00oo00O o00oo00o = this.f16269o00oo0Oo;
            if (o00oo00o == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                o0OOO00.this.o0O000o0(o00oo00o.f16285o00oo0O0);
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f16269o00oo0Oo = null;
                throw th;
            }
            this.f16269o00oo0Oo = null;
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOoO f16271o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean[] f16272o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f16273o00oOo00;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends o0OOO0 {
            public o00oOOo0(o0O0oo0o o0o0oo0o) {
                super(o0o0oo0o);
            }

            @Override // o0Oo0OoO.o0OOO0
            public void o00oOOoO(IOException iOException) {
                synchronized (o0OOO00.this) {
                    o00oOo0O.this.o00oOooO();
                }
            }
        }

        public o00oOo0O(o00oOoO o00oooo2) {
            this.f16271o00oOOo0 = o00oooo2;
            this.f16272o00oOOoO = o00oooo2.f16279o00oOo0O ? null : new boolean[o0OOO00.this.f16244o00oo];
        }

        public void o00oOOo0() throws IOException {
            synchronized (o0OOO00.this) {
                if (this.f16273o00oOo00) {
                    throw new IllegalStateException();
                }
                if (this.f16271o00oOOo0.f16280o00oOo0o == this) {
                    o0OOO00.this.o00oOOoO(this, false);
                }
                this.f16273o00oOo00 = true;
            }
        }

        public void o00oOOoO() {
            synchronized (o0OOO00.this) {
                if (!this.f16273o00oOo00 && this.f16271o00oOOo0.f16280o00oOo0o == this) {
                    try {
                        o0OOO00.this.o00oOOoO(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void o00oOo00() throws IOException {
            synchronized (o0OOO00.this) {
                if (this.f16273o00oOo00) {
                    throw new IllegalStateException();
                }
                if (this.f16271o00oOOo0.f16280o00oOo0o == this) {
                    o0OOO00.this.o00oOOoO(this, true);
                }
                this.f16273o00oOo00 = true;
            }
        }

        public o0O0oo0o o00oOo0O(int i) {
            synchronized (o0OOO00.this) {
                if (this.f16273o00oOo00) {
                    throw new IllegalStateException();
                }
                o00oOoO o00oooo2 = this.f16271o00oOOo0;
                if (o00oooo2.f16280o00oOo0o != this) {
                    return o0O00O.o00oOOoO();
                }
                if (!o00oooo2.f16279o00oOo0O) {
                    this.f16272o00oOOoO[i] = true;
                }
                try {
                    return new o00oOOo0(o0OOO00.this.f16246o00oo0O0.o00oOo0o(o00oooo2.f16283o00oOooO[i]));
                } catch (FileNotFoundException unused) {
                    return o0O00O.o00oOOoO();
                }
            }
        }

        public o0O0O0Oo o00oOo0o(int i) {
            synchronized (o0OOO00.this) {
                if (this.f16273o00oOo00) {
                    throw new IllegalStateException();
                }
                o00oOoO o00oooo2 = this.f16271o00oOOo0;
                if (o00oooo2.f16279o00oOo0O && o00oooo2.f16280o00oOo0o == this) {
                    try {
                        return o0OOO00.this.f16246o00oo0O0.o00oOo0O(o00oooo2.f16278o00oOo00[i]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                return null;
            }
        }

        public void o00oOooO() {
            if (this.f16271o00oOOo0.f16280o00oOo0o != this) {
                return;
            }
            int i = 0;
            while (true) {
                o0OOO00 o0ooo00 = o0OOO00.this;
                if (i >= o0ooo00.f16244o00oo) {
                    this.f16271o00oOOo0.f16280o00oOo0o = null;
                    return;
                } else {
                    try {
                        o0ooo00.f16246o00oo0O0.o00oOoO(this.f16271o00oOOo0.f16283o00oOooO[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f16276o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final long[] f16277o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final File[] f16278o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f16279o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public o00oOo0O f16280o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public long f16282o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final File[] f16283o00oOooO;

        public o00oOoO(String str) {
            this.f16276o00oOOo0 = str;
            int i = o0OOO00.this.f16244o00oo;
            this.f16277o00oOOoO = new long[i];
            this.f16278o00oOo00 = new File[i];
            this.f16283o00oOooO = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < o0OOO00.this.f16244o00oo; i2++) {
                sb.append(i2);
                this.f16278o00oOo00[i2] = new File(o0OOO00.this.f16245o00oo0O, sb.toString());
                sb.append(".tmp");
                this.f16283o00oOooO[i2] = new File(o0OOO00.this.f16245o00oo0O, sb.toString());
                sb.setLength(length);
            }
        }

        public final IOException o00oOOo0(String[] strArr) throws IOException {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("unexpected journal line: ");
            o00oOOo02.append(Arrays.toString(strArr));
            throw new IOException(o00oOOo02.toString());
        }

        public void o00oOOoO(String[] strArr) throws IOException {
            if (strArr.length != o0OOO00.this.f16244o00oo) {
                throw o00oOOo0(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f16277o00oOOoO[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw o00oOOo0(strArr);
                }
            }
        }

        public o00oo00O o00oOo00() {
            o0O0O0Oo o0o0o0oo;
            if (!Thread.holdsLock(o0OOO00.this)) {
                throw new AssertionError();
            }
            o0O0O0Oo[] o0o0o0ooArr = new o0O0O0Oo[o0OOO00.this.f16244o00oo];
            long[] jArr = (long[]) this.f16277o00oOOoO.clone();
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    o0OOO00 o0ooo00 = o0OOO00.this;
                    if (i2 >= o0ooo00.f16244o00oo) {
                        return new o00oo00O(this.f16276o00oOOo0, this.f16282o00oOoO0, o0o0o0ooArr, jArr);
                    }
                    o0o0o0ooArr[i2] = o0ooo00.f16246o00oo0O0.o00oOo0O(this.f16278o00oOo00[i2]);
                    i2++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        o0OOO00 o0ooo002 = o0OOO00.this;
                        if (i >= o0ooo002.f16244o00oo || (o0o0o0oo = o0o0o0ooArr[i]) == null) {
                            try {
                                o0ooo002.o0O000oo(this);
                                return null;
                            } catch (IOException unused2) {
                                return null;
                            }
                        }
                        oO0000O.o00oOo00(o0o0o0oo);
                        i++;
                    }
                }
            }
        }

        public void o00oOooO(o0 o0Var) throws IOException {
            for (long j : this.f16277o00oOOoO) {
                o0Var.writeByte(32).o0O00O(j);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oo00O implements Closeable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final long f16284o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final String f16285o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final o0O0O0Oo[] f16286o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final long[] f16288o00oo0o0;

        public o00oo00O(String str, long j, o0O0O0Oo[] o0o0o0ooArr, long[] jArr) {
            this.f16285o00oo0O0 = str;
            this.f16284o00oo0O = j;
            this.f16286o00oo0Oo = o0o0o0ooArr;
            this.f16288o00oo0o0 = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (o0O0O0Oo o0o0o0oo : this.f16286o00oo0Oo) {
                oO0000O.o00oOo00(o0o0o0oo);
            }
        }

        @Nullable
        public o00oOo0O o00oOOoO() throws IOException {
            return o0OOO00.this.o00oOoO(this.f16285o00oo0O0, this.f16284o00oo0O);
        }

        public long o00oOo0O(int i) {
            return this.f16288o00oo0o0[i];
        }

        public o0O0O0Oo o00oOo0o(int i) {
            return this.f16286o00oo0Oo[i];
        }

        public String o00oOoO0() {
            return this.f16285o00oo0O0;
        }
    }

    public o0OOO00(o0OOooO0 o0ooooo0, File file, int i, int i2, long j, Executor executor) {
        this.f16246o00oo0O0 = o0ooooo0;
        this.f16245o00oo0O = file;
        this.f16250o00oo0oO = i;
        this.f16247o00oo0Oo = new File(file, f16234o00ooo00);
        this.f16249o00oo0o0 = new File(file, f16233o00ooo0);
        this.f16248o00oo0o = new File(file, f16235o00ooo0O);
        this.f16244o00oo = i2;
        this.f16263o0O0o = j;
        this.f16261o00ooOoO = executor;
    }

    public static o0OOO00 o00oOo0O(o0OOooO0 o0ooooo0, File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                return new o0OOO00(o0ooooo0, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), oO0000O.o00ooO0("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f16257o00ooOO0 && !this.f16256o00ooOO) {
            for (o00oOoO o00oooo2 : (o00oOoO[]) this.f16254o00ooO0O.values().toArray(new o00oOoO[this.f16254o00ooO0O.size()])) {
                o00oOo0O o00ooo0o2 = o00oooo2.f16280o00oOo0o;
                if (o00ooo0o2 != null) {
                    o00ooo0o2.o00oOOo0();
                }
            }
            o0O0O0Oo();
            this.f16252o00ooO0.close();
            this.f16252o00ooO0 = null;
            this.f16256o00ooOO = true;
            return;
        }
        this.f16256o00ooOO = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f16257o00ooOO0) {
            o00oOOo0();
            o0O0O0Oo();
            this.f16252o00ooO0.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f16256o00ooOO;
    }

    public final synchronized void o00oOOo0() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void o00oOOoO(o00oOo0O o00ooo0o2, boolean z) throws IOException {
        o00oOoO o00oooo2 = o00ooo0o2.f16271o00oOOo0;
        if (o00oooo2.f16280o00oOo0o != o00ooo0o2) {
            throw new IllegalStateException();
        }
        if (z && !o00oooo2.f16279o00oOo0O) {
            for (int i = 0; i < this.f16244o00oo; i++) {
                if (!o00ooo0o2.f16272o00oOOoO[i]) {
                    o00ooo0o2.o00oOOo0();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!this.f16246o00oo0O0.o00oOOoO(o00oooo2.f16283o00oOooO[i])) {
                    o00ooo0o2.o00oOOo0();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f16244o00oo; i2++) {
            File file = o00oooo2.f16283o00oOooO[i2];
            if (!z) {
                this.f16246o00oo0O0.o00oOoO(file);
            } else if (this.f16246o00oo0O0.o00oOOoO(file)) {
                File file2 = o00oooo2.f16278o00oOo00[i2];
                this.f16246o00oo0O0.o00oOoO0(file, file2);
                long j = o00oooo2.f16277o00oOOoO[i2];
                long o00oOooO2 = this.f16246o00oo0O0.o00oOooO(file2);
                o00oooo2.f16277o00oOOoO[i2] = o00oOooO2;
                this.f16253o00ooO00 = (this.f16253o00ooO00 - j) + o00oOooO2;
            }
        }
        this.f16255o00ooO0o++;
        o00oooo2.f16280o00oOo0o = null;
        if (o00oooo2.f16279o00oOo0O || z) {
            o00oooo2.f16279o00oOo0O = true;
            this.f16252o00ooO0.o00oooo0(f16241o00oooo0).writeByte(32);
            this.f16252o00ooO0.o00oooo0(o00oooo2.f16276o00oOOo0);
            o00oooo2.o00oOooO(this.f16252o00ooO0);
            this.f16252o00ooO0.writeByte(10);
            if (z) {
                long j2 = this.f16259o00ooOo;
                this.f16259o00ooOo = 1 + j2;
                o00oooo2.f16282o00oOoO0 = j2;
            }
        } else {
            this.f16254o00ooO0O.remove(o00oooo2.f16276o00oOOo0);
            this.f16252o00ooO0.o00oooo0(f16242o00ooooO).writeByte(32);
            this.f16252o00ooO0.o00oooo0(o00oooo2.f16276o00oOOo0);
            this.f16252o00ooO0.writeByte(10);
        }
        this.f16252o00ooO0.flush();
        if (this.f16253o00ooO00 > this.f16263o0O0o || o00ooO0O()) {
            this.f16261o00ooOoO.execute(this.f16262o00ooOoo);
        }
    }

    public void o00oOo0o() throws IOException {
        close();
        this.f16246o00oo0O0.o00oOOo0(this.f16245o00oo0O);
    }

    public synchronized o00oOo0O o00oOoO(String str, long j) throws IOException {
        o00ooO0();
        o00oOOo0();
        o0ooO(str);
        o00oOoO o00oooo2 = this.f16254o00ooO0O.get(str);
        if (j == -1 || (o00oooo2 != null && o00oooo2.f16282o00oOoO0 == j)) {
            if (o00oooo2 == null || o00oooo2.f16280o00oOo0o == null) {
                if (!this.f16258o00ooOOo && !this.f16260o00ooOo0) {
                    this.f16252o00ooO0.o00oooo0(f16240o00oooo).writeByte(32).o00oooo0(str).writeByte(10);
                    this.f16252o00ooO0.flush();
                    if (this.f16251o00ooO) {
                        return null;
                    }
                    if (o00oooo2 == null) {
                        o00oooo2 = new o00oOoO(str);
                        this.f16254o00ooO0O.put(str, o00oooo2);
                    }
                    o00oOo0O o00ooo0o2 = new o00oOo0O(o00oooo2);
                    o00oooo2.f16280o00oOo0o = o00ooo0o2;
                    return o00ooo0o2;
                }
                this.f16261o00ooOoO.execute(this.f16262o00ooOoo);
                return null;
            }
            return null;
        }
        return null;
    }

    @Nullable
    public o00oOo0O o00oOoO0(String str) throws IOException {
        return o00oOoO(str, -1L);
    }

    public synchronized void o00oOoo0() throws IOException {
        o00ooO0();
        for (o00oOoO o00oooo2 : (o00oOoO[]) this.f16254o00ooO0O.values().toArray(new o00oOoO[this.f16254o00ooO0O.size()])) {
            o0O000oo(o00oooo2);
        }
        this.f16258o00ooOOo = false;
    }

    public synchronized o00oo00O o00oOooo(String str) throws IOException {
        o00ooO0();
        o00oOOo0();
        o0ooO(str);
        o00oOoO o00oooo2 = this.f16254o00ooO0O.get(str);
        if (o00oooo2 != null && o00oooo2.f16279o00oOo0O) {
            o00oo00O o00oOo002 = o00oooo2.o00oOo00();
            if (o00oOo002 == null) {
                return null;
            }
            this.f16255o00ooO0o++;
            this.f16252o00ooO0.o00oooo0(f16243o00ooooo).writeByte(32).o00oooo0(str).writeByte(10);
            if (o00ooO0O()) {
                this.f16261o00ooOoO.execute(this.f16262o00ooOoo);
            }
            return o00oOo002;
        }
        return null;
    }

    public File o00oo0() {
        return this.f16245o00oo0O;
    }

    public synchronized void o00ooO0() throws IOException {
        if (this.f16257o00ooOO0) {
            return;
        }
        if (this.f16246o00oo0O0.o00oOOoO(this.f16248o00oo0o)) {
            if (this.f16246o00oo0O0.o00oOOoO(this.f16247o00oo0Oo)) {
                this.f16246o00oo0O0.o00oOoO(this.f16248o00oo0o);
            } else {
                this.f16246o00oo0O0.o00oOoO0(this.f16248o00oo0o, this.f16247o00oo0Oo);
            }
        }
        if (this.f16246o00oo0O0.o00oOOoO(this.f16247o00oo0Oo)) {
            try {
                o00oooOo();
                o00ooOoO();
                this.f16257o00ooOO0 = true;
                return;
            } catch (IOException e) {
                oO0Ooooo o00oOoO2 = oO0Ooooo.o00oOoO();
                o00oOoO2.o00oo00O(5, "DiskLruCache " + this.f16245o00oo0O + " is corrupt: " + e.getMessage() + ", removing", e);
                o00oOo0o();
                this.f16256o00ooOO = false;
            }
        }
        o0O000O();
        this.f16257o00ooOO0 = true;
    }

    public synchronized long o00ooO00() {
        return this.f16263o0O0o;
    }

    public boolean o00ooO0O() {
        int i = this.f16255o00ooO0o;
        return i >= 2000 && i >= this.f16254o00ooO0O.size();
    }

    public final o0 o00ooO0o() throws FileNotFoundException {
        return o0O00O.o00oOo00(new o00oOOoO(this.f16246o00oo0O0.o00oOo00(this.f16247o00oo0Oo)));
    }

    public final void o00ooOoO() throws IOException {
        this.f16246o00oo0O0.o00oOoO(this.f16249o00oo0o0);
        Iterator<o00oOoO> it = this.f16254o00ooO0O.values().iterator();
        while (it.hasNext()) {
            o00oOoO next = it.next();
            int i = 0;
            if (next.f16280o00oOo0o == null) {
                while (i < this.f16244o00oo) {
                    this.f16253o00ooO00 += next.f16277o00oOOoO[i];
                    i++;
                }
            } else {
                next.f16280o00oOo0o = null;
                while (i < this.f16244o00oo) {
                    this.f16246o00oo0O0.o00oOoO(next.f16278o00oOo00[i]);
                    this.f16246o00oo0O0.o00oOoO(next.f16283o00oOooO[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void o00oooOo() throws IOException {
        o0O00000 o00oOooO2 = o0O00O.o00oOooO(this.f16246o00oo0O0.o00oOo0O(this.f16247o00oo0Oo));
        try {
            String o0OoOoOo2 = o00oOooO2.o0OoOoOo();
            String o0OoOoOo3 = o00oOooO2.o0OoOoOo();
            String o0OoOoOo4 = o00oOooO2.o0OoOoOo();
            String o0OoOoOo5 = o00oOooO2.o0OoOoOo();
            String o0OoOoOo6 = o00oOooO2.o0OoOoOo();
            if (!f16236o00ooo0o.equals(o0OoOoOo2) || !"1".equals(o0OoOoOo3) || !Integer.toString(this.f16250o00oo0oO).equals(o0OoOoOo4) || !Integer.toString(this.f16244o00oo).equals(o0OoOoOo5) || !"".equals(o0OoOoOo6)) {
                throw new IOException("unexpected journal header: [" + o0OoOoOo2 + ", " + o0OoOoOo3 + ", " + o0OoOoOo5 + ", " + o0OoOoOo6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    o0O000(o00oOooO2.o0OoOoOo());
                    i++;
                } catch (EOFException unused) {
                    this.f16255o00ooO0o = i - this.f16254o00ooO0O.size();
                    if (o00oOooO2.o0O0O0oO()) {
                        this.f16252o00ooO0 = o00ooO0o();
                    } else {
                        o0O000O();
                    }
                    oO0000O.o00oOo00(o00oOooO2);
                    return;
                }
            }
        } catch (Throwable th) {
            oO0000O.o00oOo00(o00oOooO2);
            throw th;
        }
    }

    public final void o0O000(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(o00oo.o00oOOo0("unexpected journal line: ", str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith(f16242o00ooooO)) {
                this.f16254o00ooO0O.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        o00oOoO o00oooo2 = this.f16254o00ooO0O.get(substring);
        if (o00oooo2 == null) {
            o00oooo2 = new o00oOoO(substring);
            this.f16254o00ooO0O.put(substring, o00oooo2);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f16241o00oooo0)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            o00oooo2.f16279o00oOo0O = true;
            o00oooo2.f16280o00oOo0o = null;
            o00oooo2.o00oOOoO(split);
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f16240o00oooo)) {
            o00oooo2.f16280o00oOo0o = new o00oOo0O(o00oooo2);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f16243o00ooooo)) {
            throw new IOException(o00oo.o00oOOo0("unexpected journal line: ", str));
        }
    }

    public synchronized void o0O000O() throws IOException {
        o0 o0Var = this.f16252o00ooO0;
        if (o0Var != null) {
            o0Var.close();
        }
        o0 o00oOo002 = o0O00O.o00oOo00(this.f16246o00oo0O0.o00oOo0o(this.f16249o00oo0o0));
        o00oOo002.o00oooo0(f16236o00ooo0o).writeByte(10);
        o00oOo002.o00oooo0("1").writeByte(10);
        o00oOo002.o0O00O(this.f16250o00oo0oO).writeByte(10);
        o00oOo002.o0O00O(this.f16244o00oo).writeByte(10);
        o00oOo002.writeByte(10);
        for (o00oOoO o00oooo2 : this.f16254o00ooO0O.values()) {
            if (o00oooo2.f16280o00oOo0o != null) {
                o00oOo002.o00oooo0(f16240o00oooo).writeByte(32);
                o00oOo002.o00oooo0(o00oooo2.f16276o00oOOo0);
            } else {
                o00oOo002.o00oooo0(f16241o00oooo0).writeByte(32);
                o00oOo002.o00oooo0(o00oooo2.f16276o00oOOo0);
                o00oooo2.o00oOooO(o00oOo002);
            }
            o00oOo002.writeByte(10);
        }
        o00oOo002.close();
        if (this.f16246o00oo0O0.o00oOOoO(this.f16247o00oo0Oo)) {
            this.f16246o00oo0O0.o00oOoO0(this.f16247o00oo0Oo, this.f16248o00oo0o);
        }
        this.f16246o00oo0O0.o00oOoO0(this.f16249o00oo0o0, this.f16247o00oo0Oo);
        this.f16246o00oo0O0.o00oOoO(this.f16248o00oo0o);
        this.f16252o00ooO0 = o00ooO0o();
        this.f16251o00ooO = false;
        this.f16260o00ooOo0 = false;
    }

    public synchronized boolean o0O000o0(String str) throws IOException {
        o00ooO0();
        o00oOOo0();
        o0ooO(str);
        o00oOoO o00oooo2 = this.f16254o00ooO0O.get(str);
        if (o00oooo2 == null) {
            return false;
        }
        boolean o0O000oo2 = o0O000oo(o00oooo2);
        if (o0O000oo2 && this.f16253o00ooO00 <= this.f16263o0O0o) {
            this.f16258o00ooOOo = false;
        }
        return o0O000oo2;
    }

    public boolean o0O000oo(o00oOoO o00oooo2) throws IOException {
        o00oOo0O o00ooo0o2 = o00oooo2.f16280o00oOo0o;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOooO();
        }
        for (int i = 0; i < this.f16244o00oo; i++) {
            this.f16246o00oo0O0.o00oOoO(o00oooo2.f16278o00oOo00[i]);
            long j = this.f16253o00ooO00;
            long[] jArr = o00oooo2.f16277o00oOOoO;
            this.f16253o00ooO00 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f16255o00ooO0o++;
        this.f16252o00ooO0.o00oooo0(f16242o00ooooO).writeByte(32).o00oooo0(o00oooo2.f16276o00oOOo0).writeByte(10);
        this.f16254o00ooO0O.remove(o00oooo2.f16276o00oOOo0);
        if (o00ooO0O()) {
            this.f16261o00ooOoO.execute(this.f16262o00ooOoo);
        }
        return true;
    }

    public void o0O0O0Oo() throws IOException {
        while (this.f16253o00ooO00 > this.f16263o0O0o) {
            o0O000oo(this.f16254o00ooO0O.values().iterator().next());
        }
        this.f16258o00ooOOo = false;
    }

    public synchronized Iterator<o00oo00O> o0oO0O0o() throws IOException {
        o00ooO0();
        return new o00oOo00();
    }

    public synchronized void o0oO0Ooo(long j) {
        this.f16263o0O0o = j;
        if (this.f16257o00ooOO0) {
            this.f16261o00ooOoO.execute(this.f16262o00ooOoo);
        }
    }

    public final void o0ooO(String str) {
        if (!f16239o00oooOo.matcher(str).matches()) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized long size() throws IOException {
        o00ooO0();
        return this.f16253o00ooO00;
    }
}
