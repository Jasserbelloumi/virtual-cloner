package o0Oo0Oo0;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import o00oo0o0.o00oo0;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo.o0O000O;
import o0Oo.o0OoOoOo;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.oo0ooO;
import o0Oo0OoO.o0OO;
import o0Oo0OoO.o0OO0oO;
import o0Oo0OoO.o0OOO00;
import o0Oo0OoO.o0OOO0O;
import o0Oo0o00.o0;
import o0Oo0o00.o00oo0O;
import o0Oo0o00.o00oo0O0;
import o0Oo0oO.oO0Ooooo;
import o0Oo0oO0.o0OOooO0;
/* loaded from: classes3.dex */
public final class o0O00OOO implements Closeable, Flushable {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f15781o00oo = 201105;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f15782o00ooO0 = 1;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f15783o00ooO00 = 0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f15784o00ooO0O = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OOO00 f15785o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOO0O f15786o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f15787o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f15788o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f15789o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f15790o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f15791o0O0o;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0OOO0O {
        public o00oOOo0() {
        }

        @Override // o0Oo0OoO.o0OOO0O
        public void o00oOOo0(o0OO o0oo) {
            o0O00OOO.this.o0O000(o0oo);
        }

        @Override // o0Oo0OoO.o0OOO0O
        public void o00oOOoO(oo0ooO oo0ooo, oo0ooO oo0ooo2) {
            o0O00OOO.this.o0O000O(oo0ooo, oo0ooo2);
        }

        @Override // o0Oo0OoO.o0OOO0O
        public void o00oOo00(o0OO000o o0oo000o) throws IOException {
            o0O00OOO.this.o00ooO0o(o0oo000o);
        }

        @Override // o0Oo0OoO.o0OOO0O
        public oo0ooO o00oOo0O(o0OO000o o0oo000o) throws IOException {
            return o0O00OOO.this.o00oOoO0(o0oo000o);
        }

        @Override // o0Oo0OoO.o0OOO0O
        public o0OO0oO o00oOo0o(oo0ooO oo0ooo) throws IOException {
            return o0O00OOO.this.o00ooO0(oo0ooo);
        }

        @Override // o0Oo0OoO.o0OOO0O
        public void o00oOooO() {
            o0O00OOO.this.o00oooOo();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements Iterator<String> {
        @Nullable

        /* renamed from: o00oo0O  reason: collision with root package name */
        public String f15793o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Iterator<o0OOO00.o00oo00O> f15794o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f15795o00oo0Oo;

        public o00oOOoO() throws IOException {
            this.f15794o00oo0O0 = o0O00OOO.this.f15785o00oo0O.o0oO0O0o();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15793o00oo0O != null) {
                return true;
            }
            this.f15795o00oo0Oo = false;
            while (this.f15794o00oo0O0.hasNext()) {
                o0OOO00.o00oo00O next = this.f15794o00oo0O0.next();
                try {
                    this.f15793o00oo0O = o0Oo.o0O00O.o00oOooO(next.f16286o00oo0Oo[0]).o0OoOoOo();
                    return true;
                } catch (IOException unused) {
                } finally {
                    next.close();
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        /* renamed from: o00oOOo0 */
        public String next() {
            if (hasNext()) {
                String str = this.f15793o00oo0O;
                this.f15793o00oo0O = null;
                this.f15795o00oo0Oo = true;
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f15795o00oo0Oo) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f15794o00oo0O0.remove();
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOo00 implements o0OO0oO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OOO00.o00oOo0O f15797o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0Oo.o0O0oo0o f15798o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0Oo.o0O0oo0o f15799o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f15801o00oOooO;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends o0O000O {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00OOO f15802o00oo0O;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ o0OOO00.o00oOo0O f15803o00oo0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(o0Oo.o0O0oo0o o0o0oo0o, o0O00OOO o0o00ooo, o0OOO00.o00oOo0O o00ooo0o2) {
                super(o0o0oo0o);
                this.f15802o00oo0O = o0o00ooo;
                this.f15803o00oo0Oo = o00ooo0o2;
            }

            @Override // o0Oo.o0O000O, o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (o0O00OOO.this) {
                    o00oOo00 o00ooo002 = o00oOo00.this;
                    if (o00ooo002.f15801o00oOooO) {
                        return;
                    }
                    o00ooo002.f15801o00oOooO = true;
                    o0O00OOO.this.f15787o00oo0Oo++;
                    super.close();
                    this.f15803o00oo0Oo.o00oOo00();
                }
            }
        }

        public o00oOo00(o0OOO00.o00oOo0O o00ooo0o2) {
            this.f15797o00oOOo0 = o00ooo0o2;
            o0Oo.o0O0oo0o o00oOo0O2 = o00ooo0o2.o00oOo0O(1);
            this.f15798o00oOOoO = o00oOo0O2;
            this.f15799o00oOo00 = new o00oOOo0(o00oOo0O2, o0O00OOO.this, o00ooo0o2);
        }

        @Override // o0Oo0OoO.o0OO0oO
        public void o00oOOo0() {
            synchronized (o0O00OOO.this) {
                if (this.f15801o00oOooO) {
                    return;
                }
                this.f15801o00oOooO = true;
                o0O00OOO.this.f15789o00oo0o0++;
                oO0000O.o00oOo00(this.f15798o00oOOoO);
                try {
                    this.f15797o00oOOo0.o00oOOo0();
                } catch (IOException unused) {
                }
            }
        }

        @Override // o0Oo0OoO.o0OO0oO
        public o0Oo.o0O0oo0o o00oOOoO() {
            return this.f15799o00oOo00;
        }
    }

    /* loaded from: classes3.dex */
    public static class o00oOo0O extends o0OO00OO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0OOO00.o00oo00O f15805o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final o0O00000 f15806o00oo0Oo;
        @Nullable

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final String f15807o00oo0o;
        @Nullable

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final String f15808o00oo0o0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends o0OoOoOo {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0OOO00.o00oo00O f15809o00oo0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(o0Oo.o0O0O0Oo o0o0o0oo, o0OOO00.o00oo00O o00oo00o) {
                super(o0o0o0oo);
                this.f15809o00oo0O = o00oo00o;
            }

            @Override // o0Oo.o0OoOoOo, o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f15809o00oo0O.close();
                super.close();
            }
        }

        public o00oOo0O(o0OOO00.o00oo00O o00oo00o, String str, String str2) {
            this.f15805o00oo0O = o00oo00o;
            this.f15808o00oo0o0 = str;
            this.f15807o00oo0o = str2;
            this.f15806o00oo0Oo = o0Oo.o0O00O.o00oOooO(new o00oOOo0(o00oo00o.f16286o00oo0Oo[1], o00oo00o));
        }

        @Override // o0Oo0Oo0.o0OO00OO
        public o0oOo0O0 o00oOoO() {
            String str = this.f15808o00oo0o0;
            if (str != null) {
                return o0oOo0O0.o00oOo00(str);
            }
            return null;
        }

        @Override // o0Oo0Oo0.o0OO00OO
        public long o00oOoO0() {
            try {
                String str = this.f15807o00oo0o;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // o0Oo0Oo0.o0OO00OO
        public o0O00000 o00ooO00() {
            return this.f15806o00oo0Oo;
        }
    }

    public o0O00OOO(File file, long j) {
        this(file, j, o0OOooO0.f16627o00oOOo0);
    }

    public o0O00OOO(File file, long j, o0OOooO0 o0ooooo0) {
        this.f15786o00oo0O0 = new o00oOOo0();
        this.f15785o00oo0O = o0OOO00.o00oOo0O(o0ooooo0, file, f15781o00oo, 2, j);
    }

    public static String o00oOooo(o0O0o00O o0o0o00o) {
        return o0O0000O.encodeUtf8(o0o0o00o.f15896o00oOoOO).md5().hex();
    }

    public static int o00ooO0O(o0O00000 o0o00000) throws IOException {
        try {
            long o0O0OO2 = o0o00000.o0O0OO();
            String o0OoOoOo2 = o0o00000.o0OoOoOo();
            if (o0O0OO2 < 0 || o0O0OO2 > 2147483647L || !o0OoOoOo2.isEmpty()) {
                throw new IOException("expected an int but was \"" + o0O0OO2 + o0OoOoOo2 + "\"");
            }
            return (int) o0O0OO2;
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15785o00oo0O.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f15785o00oo0O.flush();
    }

    public boolean isClosed() {
        return this.f15785o00oo0O.isClosed();
    }

    public final void o00oOOo0(@Nullable o0OOO00.o00oOo0O o00ooo0o2) {
        if (o00ooo0o2 != null) {
            try {
                o00ooo0o2.o00oOOo0();
            } catch (IOException unused) {
            }
        }
    }

    public void o00oOOoO() throws IOException {
        this.f15785o00oo0O.o00oOo0o();
    }

    public File o00oOo0O() {
        return this.f15785o00oo0O.f16245o00oo0O;
    }

    public void o00oOo0o() throws IOException {
        this.f15785o00oo0O.o00oOoo0();
    }

    public synchronized int o00oOoO() {
        return this.f15790o00oo0oO;
    }

    @Nullable
    public oo0ooO o00oOoO0(o0OO000o o0oo000o) {
        try {
            o0OOO00.o00oo00O o00oOooo2 = this.f15785o00oo0O.o00oOooo(o00oOooo(o0oo000o.f16086o00oOOo0));
            if (o00oOooo2 == null) {
                return null;
            }
            try {
                o00oOoO o00oooo2 = new o00oOoO(o00oOooo2.f16286o00oo0Oo[0]);
                oo0ooO o00oOooO2 = o00oooo2.o00oOooO(o00oOooo2);
                if (o00oooo2.o00oOOoO(o0oo000o, o00oOooO2)) {
                    return o00oOooO2;
                }
                oO0000O.o00oOo00(o00oOooO2.f16180o0O0o);
                return null;
            } catch (IOException unused) {
                oO0000O.o00oOo00(o00oOooo2);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public void o00oOoo0() throws IOException {
        this.f15785o00oo0O.o00ooO0();
    }

    public long o00oo0() {
        return this.f15785o00oo0O.o00ooO00();
    }

    @Nullable
    public o0OO0oO o00ooO0(oo0ooO oo0ooo) {
        o0OOO00.o00oOo0O o00ooo0o2;
        String str = oo0ooo.f16170o00oo0O0.f16087o00oOOoO;
        if (o00oo0O.o00oOOo0(str)) {
            try {
                o00ooO0o(oo0ooo.f16170o00oo0O0);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals(o00oo0.f7537o00oOoOO) || o00oo0O0.o00oOo0O(oo0ooo)) {
            return null;
        } else {
            o00oOoO o00oooo2 = new o00oOoO(oo0ooo);
            try {
                o00ooo0o2 = this.f15785o00oo0O.o00oOoO0(o00oOooo(oo0ooo.f16170o00oo0O0.f16086o00oOOo0));
                if (o00ooo0o2 == null) {
                    return null;
                }
                try {
                    o00oooo2.o00oOo0o(o00ooo0o2);
                    return new o00oOo00(o00ooo0o2);
                } catch (IOException unused2) {
                    o00oOOo0(o00ooo0o2);
                    return null;
                }
            } catch (IOException unused3) {
                o00ooo0o2 = null;
            }
        }
    }

    public synchronized int o00ooO00() {
        return this.f15788o00oo0o;
    }

    public void o00ooO0o(o0OO000o o0oo000o) throws IOException {
        this.f15785o00oo0O.o0O000o0(o00oOooo(o0oo000o.f16086o00oOOo0));
    }

    public synchronized int o00ooOoO() {
        return this.f15791o0O0o;
    }

    public synchronized void o00oooOo() {
        this.f15790o00oo0oO++;
    }

    public synchronized void o0O000(o0OO o0oo) {
        this.f15791o0O0o++;
        if (o0oo.f16211o00oOOo0 != null) {
            this.f15788o00oo0o++;
        } else if (o0oo.f16212o00oOOoO != null) {
            this.f15790o00oo0oO++;
        }
    }

    public void o0O000O(oo0ooO oo0ooo, oo0ooO oo0ooo2) {
        o00oOoO o00oooo2 = new o00oOoO(oo0ooo2);
        o0OOO00.o00oOo0O o00ooo0o2 = null;
        try {
            o00ooo0o2 = ((o00oOo0O) oo0ooo.f16180o0O0o).f15805o00oo0O.o00oOOoO();
            if (o00ooo0o2 != null) {
                o00oooo2.o00oOo0o(o00ooo0o2);
                o00ooo0o2.o00oOo00();
            }
        } catch (IOException unused) {
            o00oOOo0(o00ooo0o2);
        }
    }

    public Iterator<String> o0O000o0() throws IOException {
        return new o00oOOoO();
    }

    public synchronized int o0O000oo() {
        return this.f15789o00oo0o0;
    }

    public synchronized int o0oO0Ooo() {
        return this.f15787o00oo0Oo;
    }

    public long size() throws IOException {
        return this.f15785o00oo0O.size();
    }

    /* loaded from: classes3.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final String f15811o00oOoo0 = oO0Ooooo.o00oOoO().o00oOoOO() + "-Sent-Millis";

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final String f15812o00oOooo = oO0Ooooo.f16623o00oOOo0.o00oOoOO() + "-Received-Millis";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f15813o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O0o00 f15814o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f15815o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f15816o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final String f15817o00oOo0o;
        @Nullable

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final o0O0o000 f15818o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final o0O0o00 f15819o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public final long f15820o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public final long f15821o00oOoOo;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o0O f15822o00oOooO;

        public o00oOoO(o0Oo.o0O0O0Oo o0o0o0oo) throws IOException {
            try {
                o0O00000 o00oOooO2 = o0Oo.o0O00O.o00oOooO(o0o0o0oo);
                this.f15813o00oOOo0 = o00oOooO2.o0OoOoOo();
                this.f15815o00oOo00 = o00oOooO2.o0OoOoOo();
                o0O0o00.o00oOOo0 o00oooo02 = new o0O0o00.o00oOOo0();
                int o00ooO0O2 = o0O00OOO.o00ooO0O(o00oOooO2);
                for (int i = 0; i < o00ooO0O2; i++) {
                    o00oooo02.o00oOo00(o00oOooO2.o0OoOoOo());
                }
                this.f15814o00oOOoO = new o0O0o00(o00oooo02);
                o0 o00oOOoO2 = o0.o00oOOoO(o00oOooO2.o0OoOoOo());
                this.f15822o00oOooO = o00oOOoO2.f16336o00oOOo0;
                this.f15816o00oOo0O = o00oOOoO2.f16337o00oOOoO;
                this.f15817o00oOo0o = o00oOOoO2.f16338o00oOo00;
                o0O0o00.o00oOOo0 o00oooo03 = new o0O0o00.o00oOOo0();
                int o00ooO0O3 = o0O00OOO.o00ooO0O(o00oOooO2);
                for (int i2 = 0; i2 < o00ooO0O3; i2++) {
                    o00oooo03.o00oOo00(o00oOooO2.o0OoOoOo());
                }
                String str = f15811o00oOoo0;
                String o00oOoO02 = o00oooo03.o00oOoO0(str);
                String str2 = f15812o00oOooo;
                String o00oOoO03 = o00oooo03.o00oOoO0(str2);
                o00oooo03.o00oOoO(str);
                o00oooo03.o00oOoO(str2);
                this.f15820o00oOoOO = o00oOoO02 != null ? Long.parseLong(o00oOoO02) : 0L;
                this.f15821o00oOoOo = o00oOoO03 != null ? Long.parseLong(o00oOoO03) : 0L;
                this.f15819o00oOoO0 = new o0O0o00(o00oooo03);
                if (o00oOOo0()) {
                    String o0OoOoOo2 = o00oOooO2.o0OoOoOo();
                    if (o0OoOoOo2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + o0OoOoOo2 + "\"");
                    }
                    this.f15818o00oOoO = o0O0o000.o00oOo00(!o00oOooO2.o0O0O0oO() ? o0OoOoO.forJavaName(o00oOooO2.o0OoOoOo()) : o0OoOoO.SSL_3_0, o0O0oo0o.o00oOOo0(o00oOooO2.o0OoOoOo()), o00oOo00(o00oOooO2), o00oOo00(o00oOooO2));
                } else {
                    this.f15818o00oOoO = null;
                }
            } finally {
                o0o0o0oo.close();
            }
        }

        public final boolean o00oOOo0() {
            return this.f15813o00oOOo0.startsWith("https://");
        }

        public boolean o00oOOoO(o0OO000o o0oo000o, oo0ooO oo0ooo) {
            return this.f15813o00oOOo0.equals(o0oo000o.f16086o00oOOo0.f15896o00oOoOO) && this.f15815o00oOo00.equals(o0oo000o.f16087o00oOOoO) && o00oo0O0.o00oo0O0(oo0ooo, this.f15814o00oOOoO, o0oo000o);
        }

        public final List<Certificate> o00oOo00(o0O00000 o0o00000) throws IOException {
            int o00ooO0O2 = o0O00OOO.o00ooO0O(o0o00000);
            if (o00ooO0O2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(o00ooO0O2);
                for (int i = 0; i < o00ooO0O2; i++) {
                    String o0OoOoOo2 = o0o00000.o0OoOoOo();
                    o00ooO o00ooo = new o00ooO();
                    o00ooo.o0O0OO0O(o0O0000O.decodeBase64(o0OoOoOo2));
                    arrayList.add(certificateFactory.generateCertificate(new o00ooO.o00oOOoO()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void o00oOo0O(o0Oo.o0 o0Var, List<Certificate> list) throws IOException {
            try {
                o0Var.o0O00O(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o0Var.o00oooo0(o0O0000O.of(list.get(i).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public void o00oOo0o(o0OOO00.o00oOo0O o00ooo0o2) throws IOException {
            o0Oo.o0 o00oOo002 = o0Oo.o0O00O.o00oOo00(o00ooo0o2.o00oOo0O(0));
            o00oOo002.o00oooo0(this.f15813o00oOOo0).writeByte(10);
            o00oOo002.o00oooo0(this.f15815o00oOo00).writeByte(10);
            o00oOo002.o0O00O(this.f15814o00oOOoO.f15872o00oOOo0.length / 2).writeByte(10);
            int length = this.f15814o00oOOoO.f15872o00oOOo0.length / 2;
            for (int i = 0; i < length; i++) {
                o00oOo002.o00oooo0(this.f15814o00oOOoO.o00oOooO(i)).o00oooo0(": ").o00oooo0(this.f15814o00oOOoO.o00oOoo0(i)).writeByte(10);
            }
            o00oOo002.o00oooo0(new o0(this.f15822o00oOooO, this.f15816o00oOo0O, this.f15817o00oOo0o).toString()).writeByte(10);
            o00oOo002.o0O00O((this.f15819o00oOoO0.f15872o00oOOo0.length / 2) + 2).writeByte(10);
            int length2 = this.f15819o00oOoO0.f15872o00oOOo0.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                o00oOo002.o00oooo0(this.f15819o00oOoO0.o00oOooO(i2)).o00oooo0(": ").o00oooo0(this.f15819o00oOoO0.o00oOoo0(i2)).writeByte(10);
            }
            o00oOo002.o00oooo0(f15811o00oOoo0).o00oooo0(": ").o0O00O(this.f15820o00oOoOO).writeByte(10);
            o00oOo002.o00oooo0(f15812o00oOooo).o00oooo0(": ").o0O00O(this.f15821o00oOoOo).writeByte(10);
            if (o00oOOo0()) {
                o00oOo002.writeByte(10);
                o00oOo002.o00oooo0(this.f15818o00oOoO.f15875o00oOOoO.f16077o00oOOo0).writeByte(10);
                o00oOo0O(o00oOo002, this.f15818o00oOoO.f15876o00oOo00);
                o00oOo0O(o00oOo002, this.f15818o00oOoO.f15877o00oOooO);
                o00oOo002.o00oooo0(this.f15818o00oOoO.f15874o00oOOo0.javaName()).writeByte(10);
            }
            o00oOo002.close();
        }

        public oo0ooO o00oOooO(o0OOO00.o00oo00O o00oo00o) {
            String o00oOOo02 = this.f15819o00oOoO0.o00oOOo0("Content-Type");
            String o00oOOo03 = this.f15819o00oOoO0.o00oOOo0("Content-Length");
            o0OO000o o00oOOoO2 = new o0OO000o.o00oOOo0().o00oo0O0(this.f15813o00oOOo0).o00oOoOo(this.f15815o00oOo00, null).o00oOoOO(this.f15814o00oOOoO).o00oOOoO();
            oo0ooO.o00oOOo0 o00oooo02 = new oo0ooO.o00oOOo0();
            o00oooo02.f16181o00oOOo0 = o00oOOoO2;
            o00oooo02.f16182o00oOOoO = this.f15822o00oOooO;
            o00oooo02.f16183o00oOo00 = this.f15816o00oOo0O;
            o00oooo02.f16191o00oOooO = this.f15817o00oOo0o;
            return o00oooo02.o00oOoOo(this.f15819o00oOoO0).o00oOOoO(new o00oOo0O(o00oo00o, o00oOOo02, o00oOOo03)).o00oOoO(this.f15818o00oOoO).o00oo0Oo(this.f15820o00oOoOO).o00oo0OO(this.f15821o00oOoOo).o00oOo00();
        }

        public o00oOoO(oo0ooO oo0ooo) {
            this.f15813o00oOOo0 = oo0ooo.f16170o00oo0O0.f16086o00oOOo0.f15896o00oOoOO;
            this.f15814o00oOOoO = o00oo0O0.o00oo0OO(oo0ooo);
            this.f15815o00oOo00 = oo0ooo.f16170o00oo0O0.f16087o00oOOoO;
            this.f15822o00oOooO = oo0ooo.f16169o00oo0O;
            this.f15816o00oOo0O = oo0ooo.f16171o00oo0Oo;
            this.f15817o00oOo0o = oo0ooo.f16173o00oo0o0;
            this.f15819o00oOoO0 = oo0ooo.f16174o00oo0oO;
            this.f15818o00oOoO = oo0ooo.f16172o00oo0o;
            this.f15820o00oOoOO = oo0ooo.f16178o00ooO0O;
            this.f15821o00oOoOo = oo0ooo.f16179o00ooO0o;
        }
    }
}
