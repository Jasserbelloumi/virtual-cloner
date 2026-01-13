package o0Oo0o0o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import o0O0OO0.o00oOo0O;
import o0Oo.o00oo;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo.o0O0oo0o;
/* loaded from: classes3.dex */
public final class o0O00O {

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final /* synthetic */ boolean f16453o00oo00O = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f16455o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f16456o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final List<o0O000Oo> f16457o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public List<o0O000Oo> f16458o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final o00oOOoO f16459o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f16460o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final o00oOOo0 f16461o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OoO00O f16464o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public long f16454o00oOOo0 = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final o00oOo00 f16462o00oOoOo = new o00oOo00();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final o00oOo00 f16463o00oOoo0 = new o00oOo00();

    /* renamed from: o00oOooo  reason: collision with root package name */
    public o0OoOoOo f16465o00oOooo = null;

    /* loaded from: classes3.dex */
    public final class o00oOOo0 implements o0O0oo0o {

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final long f16466o00oo0o = 16384;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final /* synthetic */ boolean f16467o00oo0oO = false;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f16468o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00ooO f16469o00oo0O0 = new o00ooO();

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f16470o00oo0Oo;

        public o00oOOo0() {
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (o0O00O.this) {
                if (this.f16468o00oo0O) {
                    return;
                }
                o0O00O o0o00o = o0O00O.this;
                if (!o0o00o.f16461o00oOoOO.f16470o00oo0Oo) {
                    if (this.f16469o00oo0O0.f15434o00oo0O > 0) {
                        while (this.f16469o00oo0O0.f15434o00oo0O > 0) {
                            o00oOOo0(true);
                        }
                    } else {
                        o0o00o.f16464o00oOooO.o0ooO(o0o00o.f16456o00oOo00, true, null, 0L);
                    }
                }
                synchronized (o0O00O.this) {
                    this.f16468o00oo0O = true;
                }
                o0O00O.this.f16464o00oOooO.flush();
                o0O00O.this.o00oOOoO();
            }
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            synchronized (o0O00O.this) {
                o0O00O.this.o00oOo00();
            }
            while (this.f16469o00oo0O0.f15434o00oo0O > 0) {
                o00oOOo0(false);
                o0O00O.this.f16464o00oOooO.flush();
            }
        }

        public final void o00oOOo0(boolean z) throws IOException {
            o0O00O o0o00o;
            long min;
            o0O00O o0o00o2;
            synchronized (o0O00O.this) {
                o0O00O.this.f16463o00oOoo0.o00oo00O();
                while (true) {
                    o0o00o = o0O00O.this;
                    if (o0o00o.f16455o00oOOoO > 0 || this.f16470o00oo0Oo || this.f16468o00oo0O || o0o00o.f16465o00oOooo != null) {
                        break;
                    }
                    o0o00o.o0O0o();
                }
                o0o00o.f16463o00oOoo0.o00oo();
                o0O00O.this.o00oOo00();
                min = Math.min(o0O00O.this.f16455o00oOOoO, this.f16469o00oo0O0.f15434o00oo0O);
                o0o00o2 = o0O00O.this;
                o0o00o2.f16455o00oOOoO -= min;
            }
            o0o00o2.f16463o00oOoo0.o00oo00O();
            try {
                o0O00O o0o00o3 = o0O00O.this;
                o0o00o3.f16464o00oOooO.o0ooO(o0o00o3.f16456o00oOo00, z && min == this.f16469o00oo0O0.f15434o00oo0O, this.f16469o00oo0O0, min);
            } finally {
                o0O00O.this.f16463o00oOoo0.o00oo();
            }
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return o0O00O.this.f16463o00oOoo0;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            this.f16469o00oo0O0.o00oo(o00ooo, j);
            while (this.f16469o00oo0O0.f15434o00oo0O >= 16384) {
                o00oOOo0(false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final /* synthetic */ boolean f16472o0O0o = false;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final long f16475o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f16476o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f16477o00oo0o0;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00ooO f16474o00oo0O0 = new o00ooO();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o00ooO f16473o00oo0O = new o00ooO();

        public o00oOOoO(long j) {
            this.f16475o00oo0Oo = j;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (o0O00O.this) {
                this.f16477o00oo0o0 = true;
                this.f16473o00oo0O.o00oOOoO();
                o0O00O.this.notifyAll();
            }
            o0O00O.this.o00oOOoO();
        }

        public final void o00oOOo0() throws IOException {
            if (this.f16477o00oo0o0) {
                throw new IOException("stream closed");
            }
            if (o0O00O.this.f16465o00oOooo != null) {
                throw new o0O0O0O(o0O00O.this.f16465o00oOooo);
            }
        }

        public void o00oOOoO(o0O00000 o0o00000, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (o0O00O.this) {
                    z = this.f16476o00oo0o;
                    z2 = true;
                    z3 = this.f16473o00oo0O.f15434o00oo0O + j > this.f16475o00oo0Oo;
                }
                if (z3) {
                    o0o00000.skip(j);
                    o0O00O.this.o00oOo0o(o0OoOoOo.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    o0o00000.skip(j);
                    return;
                } else {
                    long o0O0o0002 = o0o00000.o0O0o000(this.f16474o00oo0O0, j);
                    if (o0O0o0002 == -1) {
                        throw new EOFException();
                    }
                    j -= o0O0o0002;
                    synchronized (o0O00O.this) {
                        o00ooO o00ooo = this.f16473o00oo0O;
                        if (o00ooo.f15434o00oo0O != 0) {
                            z2 = false;
                        }
                        o00ooo.o0O0o0o(this.f16474o00oo0O0);
                        if (z2) {
                            o0O00O.this.notifyAll();
                        }
                    }
                }
            }
        }

        public final void o00oOo0O() throws IOException {
            o0O00O.this.f16462o00oOoOo.o00oo00O();
            while (this.f16473o00oo0O.f15434o00oo0O == 0 && !this.f16476o00oo0o && !this.f16477o00oo0o0) {
                try {
                    o0O00O o0o00o = o0O00O.this;
                    if (o0o00o.f16465o00oOooo != null) {
                        break;
                    }
                    o0o00o.o0O0o();
                } finally {
                    o0O00O.this.f16462o00oOoOo.o00oo();
                }
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return o0O00O.this.f16462o00oOoOo;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            if (j >= 0) {
                synchronized (o0O00O.this) {
                    o00oOo0O();
                    o00oOOo0();
                    o00ooO o00ooo2 = this.f16473o00oo0O;
                    long j2 = o00ooo2.f15434o00oo0O;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long o0O0o0002 = o00ooo2.o0O0o000(o00ooo, Math.min(j, j2));
                    o0O00O o0o00o = o0O00O.this;
                    long j3 = o0o00o.f16454o00oOOo0 + o0O0o0002;
                    o0o00o.f16454o00oOOo0 = j3;
                    if (j3 >= o0o00o.f16464o00oOooO.f16547o00ooOO0.o00oOo0O() / 2) {
                        o0O00O o0o00o2 = o0O00O.this;
                        o0o00o2.f16464o00oOooO.o0O0o0oO(o0o00o2.f16456o00oOo00, o0o00o2.f16454o00oOOo0);
                        o0O00O.this.f16454o00oOOo0 = 0L;
                    }
                    synchronized (o0O00O.this.f16464o00oOooO) {
                        o0OoO00O o0ooo00o = o0O00O.this.f16464o00oOooO;
                        long j4 = o0ooo00o.f16545o00ooO0o + o0O0o0002;
                        o0ooo00o.f16545o00ooO0o = j4;
                        if (j4 >= o0ooo00o.f16547o00ooOO0.o00oOo0O() / 2) {
                            o0OoO00O o0ooo00o2 = o0O00O.this.f16464o00oOooO;
                            o0ooo00o2.o0O0o0oO(0, o0ooo00o2.f16545o00ooO0o);
                            o0O00O.this.f16464o00oOooO.f16545o00ooO0o = 0L;
                        }
                    }
                    return o0O0o0002;
                }
            }
            throw new IllegalArgumentException(o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends o00oo {
        public o00oOo00() {
        }

        public void o00oo() throws IOException {
            if (o00oo0O0()) {
                throw o00oo0O(null);
            }
        }

        @Override // o0Oo.o00oo
        public IOException o00oo0O(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // o0Oo.o00oo
        public void o0O0o() {
            o0O00O.this.o00oOo0o(o0OoOoOo.CANCEL);
        }
    }

    public o0O00O(int i, o0OoO00O o0ooo00o, boolean z, boolean z2, List<o0O000Oo> list) {
        if (o0ooo00o == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f16456o00oOo00 = i;
        this.f16464o00oOooO = o0ooo00o;
        this.f16455o00oOOoO = o0ooo00o.f16546o00ooOO.o00oOo0O();
        o00oOOoO o00ooooo2 = new o00oOOoO(o0ooo00o.f16547o00ooOO0.o00oOo0O());
        this.f16459o00oOoO = o00ooooo2;
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f16461o00oOoOO = o00oooo02;
        o00ooooo2.f16476o00oo0o = z2;
        o00oooo02.f16470o00oo0Oo = z;
        this.f16457o00oOo0O = list;
    }

    public void o00oOOo0(long j) {
        this.f16455o00oOOoO += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void o00oOOoO() throws IOException {
        boolean z;
        boolean o00oo02;
        synchronized (this) {
            o00oOOoO o00ooooo2 = this.f16459o00oOoO;
            if (!o00ooooo2.f16476o00oo0o && o00ooooo2.f16477o00oo0o0) {
                o00oOOo0 o00oooo02 = this.f16461o00oOoOO;
                if (o00oooo02.f16470o00oo0Oo || o00oooo02.f16468o00oo0O) {
                    z = true;
                    o00oo02 = o00oo0();
                }
            }
            z = false;
            o00oo02 = o00oo0();
        }
        if (z) {
            o00oOooO(o0OoOoOo.CANCEL);
        } else if (o00oo02) {
        } else {
            this.f16464o00oOooO.o0O000o0(this.f16456o00oOo00);
        }
    }

    public void o00oOo00() throws IOException {
        o00oOOo0 o00oooo02 = this.f16461o00oOoOO;
        if (o00oooo02.f16468o00oo0O) {
            throw new IOException("stream closed");
        }
        if (o00oooo02.f16470o00oo0Oo) {
            throw new IOException("stream finished");
        }
        if (this.f16465o00oOooo != null) {
            throw new o0O0O0O(this.f16465o00oOooo);
        }
    }

    public final boolean o00oOo0O(o0OoOoOo o0oooooo) {
        synchronized (this) {
            if (this.f16465o00oOooo != null) {
                return false;
            }
            if (this.f16459o00oOoO.f16476o00oo0o && this.f16461o00oOoOO.f16470o00oo0Oo) {
                return false;
            }
            this.f16465o00oOooo = o0oooooo;
            notifyAll();
            this.f16464o00oOooO.o0O000o0(this.f16456o00oOo00);
            return true;
        }
    }

    public void o00oOo0o(o0OoOoOo o0oooooo) {
        if (o00oOo0O(o0oooooo)) {
            this.f16464o00oOooO.o0O0o0O(this.f16456o00oOo00, o0oooooo);
        }
    }

    public synchronized o0OoOoOo o00oOoO() {
        return this.f16465o00oOooo;
    }

    public o0OoO00O o00oOoO0() {
        return this.f16464o00oOooO;
    }

    public int o00oOoOO() {
        return this.f16456o00oOo00;
    }

    public List<o0O000Oo> o00oOoOo() {
        return this.f16457o00oOo0O;
    }

    public o0O0oo0o o00oOoo0() {
        synchronized (this) {
            if (!this.f16460o00oOoO0 && !o00oo00O()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f16461o00oOoOO;
    }

    public void o00oOooO(o0OoOoOo o0oooooo) throws IOException {
        if (o00oOo0O(o0oooooo)) {
            this.f16464o00oOooO.o0O0o00o(this.f16456o00oOo00, o0oooooo);
        }
    }

    public o0O0O0Oo o00oOooo() {
        return this.f16459o00oOoO;
    }

    public o0O0O0o0 o00oo() {
        return this.f16463o00oOoo0;
    }

    public synchronized boolean o00oo0() {
        if (this.f16465o00oOooo != null) {
            return false;
        }
        o00oOOoO o00ooooo2 = this.f16459o00oOoO;
        if (o00ooooo2.f16476o00oo0o || o00ooooo2.f16477o00oo0o0) {
            o00oOOo0 o00oooo02 = this.f16461o00oOoOO;
            if (o00oooo02.f16470o00oo0Oo || o00oooo02.f16468o00oo0O) {
                if (this.f16460o00oOoO0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean o00oo00O() {
        return this.f16464o00oOooO.f16536o00oo0O0 == ((this.f16456o00oOo00 & 1) == 1);
    }

    public void o00oo0O() {
        boolean o00oo02;
        synchronized (this) {
            this.f16459o00oOoO.f16476o00oo0o = true;
            o00oo02 = o00oo0();
            notifyAll();
        }
        if (o00oo02) {
            return;
        }
        this.f16464o00oOooO.o0O000o0(this.f16456o00oOo00);
    }

    public void o00oo0O0(o0O00000 o0o00000, int i) throws IOException {
        this.f16459o00oOoO.o00oOOoO(o0o00000, i);
    }

    public o0O0O0o0 o00oo0OO() {
        return this.f16462o00oOoOo;
    }

    public void o00oo0Oo(List<o0O000Oo> list) {
        boolean z;
        synchronized (this) {
            z = true;
            this.f16460o00oOoO0 = true;
            if (this.f16458o00oOo0o == null) {
                this.f16458o00oOo0o = list;
                z = o00oo0();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f16458o00oOo0o);
                arrayList.add(null);
                arrayList.addAll(list);
                this.f16458o00oOo0o = arrayList;
            }
        }
        if (z) {
            return;
        }
        this.f16464o00oOooO.o0O000o0(this.f16456o00oOo00);
    }

    public void o00oo0o(List<o0O000Oo> list, boolean z) throws IOException {
        if (list == null) {
            throw new NullPointerException("responseHeaders == null");
        }
        boolean z2 = false;
        synchronized (this) {
            this.f16460o00oOoO0 = true;
            if (!z) {
                this.f16461o00oOoOO.f16470o00oo0Oo = true;
                z2 = true;
            }
        }
        this.f16464o00oOooO.o0O0Oooo(this.f16456o00oOo00, z2, list);
        if (z2) {
            this.f16464o00oOooO.flush();
        }
    }

    public synchronized void o00oo0o0(o0OoOoOo o0oooooo) {
        if (this.f16465o00oOooo == null) {
            this.f16465o00oOooo = o0oooooo;
            notifyAll();
        }
    }

    public synchronized List<o0O000Oo> o00oo0oO() throws IOException {
        List<o0O000Oo> list;
        if (!o00oo00O()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f16462o00oOoOo.o00oo00O();
        while (this.f16458o00oOo0o == null && this.f16465o00oOooo == null) {
            o0O0o();
        }
        this.f16462o00oOoOo.o00oo();
        list = this.f16458o00oOo0o;
        if (list == null) {
            throw new o0O0O0O(this.f16465o00oOooo);
        }
        this.f16458o00oOo0o = null;
        return list;
    }

    public void o0O0o() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
