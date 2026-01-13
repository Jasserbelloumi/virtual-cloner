package o0Oo0o0O;

import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O000Oo;
import o0Oo.o0O00O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo.o0O0oo0o;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0OO00OO;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.o0OOOO0o;
import o0Oo0Ooo.oO0Oo;
import o0Oo0o00.o00oo;
import o0Oo0o00.o00oo0O0;
import o0Oo0o00.o00ooO0;
/* loaded from: classes3.dex */
public final class o0O000 implements o0Oo0o00.o00oo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f16364o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f16365o00oOoO0 = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16366o00oOoOO = 2;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f16367o00oOoOo = 3;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f16368o00oOoo0 = 4;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f16369o00oOooo = 5;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f16370o00oo00O = 6;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0oo00 f16371o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final oO0Oo f16372o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0 f16373o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f16374o00oOo0o = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00000 f16375o00oOooO;

    /* loaded from: classes3.dex */
    public abstract class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f16376o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000Oo f16377o00oo0O0;

        public o00oOOoO() {
            this.f16377o00oo0O0 = new o0O000Oo(o0O000.this.f16375o00oOooO.o00oOooO());
        }

        public final void o00oOOo0(boolean z) throws IOException {
            o0O000 o0o000 = o0O000.this;
            int i = o0o000.f16374o00oOo0o;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
                o00oOOo02.append(o0O000.this.f16374o00oOo0o);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            o0o000.o00oOoO0(this.f16377o00oo0O0);
            o0O000 o0o0002 = o0O000.this;
            o0o0002.f16374o00oOo0o = 6;
            oO0Oo oo0oo = o0o0002.f16372o00oOo00;
            if (oo0oo != null) {
                oo0oo.o00oo0O0(!z, o0o0002);
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f16377o00oo0O0;
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOo00 implements o0O0oo0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f16379o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000Oo f16380o00oo0O0;

        public o00oOo00() {
            this.f16380o00oo0O0 = new o0O000Oo(o0O000.this.f16373o00oOo0O.o00oOooO());
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f16379o00oo0O) {
                return;
            }
            this.f16379o00oo0O = true;
            o0O000.this.f16373o00oOo0O.o00oooo0("0\r\n\r\n");
            o0O000.this.o00oOoO0(this.f16380o00oo0O0);
            o0O000.this.f16374o00oOo0o = 3;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f16379o00oo0O) {
                return;
            }
            o0O000.this.f16373o00oOo0O.flush();
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return this.f16380o00oo0O0;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            if (this.f16379o00oo0O) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            o0O000.this.f16373o00oOo0O.o0O0Ooo0(j);
            o0O000.this.f16373o00oOo0O.o00oooo0("\r\n");
            o0O000.this.f16373o00oOo0O.o00oo(o00ooo, j);
            o0O000.this.f16373o00oOo0O.o00oooo0("\r\n");
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends o00oOOoO {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final long f16382o00oo = -1;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public long f16383o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o0O0o00O f16384o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f16385o00oo0oO;

        public o00oOo0O(o0O0o00O o0o0o00o) {
            super();
            this.f16383o00oo0o = -1L;
            this.f16385o00oo0oO = true;
            this.f16384o00oo0o0 = o0o0o00o;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16376o00oo0O) {
                return;
            }
            if (this.f16385o00oo0oO && !oO0000O.o00oOoOo(this, 100, TimeUnit.MILLISECONDS)) {
                o00oOOo0(false);
            }
            this.f16376o00oo0O = true;
        }

        public final void o00oOOoO() throws IOException {
            if (this.f16383o00oo0o != -1) {
                o0O000.this.f16375o00oOooO.o0OoOoOo();
            }
            try {
                this.f16383o00oo0o = o0O000.this.f16375o00oOooO.o0O0oOOO();
                String trim = o0O000.this.f16375o00oOooO.o0OoOoOo().trim();
                if (this.f16383o00oo0o < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f16383o00oo0o + trim + "\"");
                } else if (this.f16383o00oo0o == 0) {
                    this.f16385o00oo0oO = false;
                    o00oo0O0.o00oOoO(o0O000.this.f16371o00oOOoO.o00oo00O(), this.f16384o00oo0o0, o0O000.this.o00oo0OO());
                    o00oOOo0(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            if (j >= 0) {
                if (this.f16376o00oo0O) {
                    throw new IllegalStateException("closed");
                }
                if (this.f16385o00oo0oO) {
                    long j2 = this.f16383o00oo0o;
                    if (j2 == 0 || j2 == -1) {
                        o00oOOoO();
                        if (!this.f16385o00oo0oO) {
                            return -1L;
                        }
                    }
                    long o0O0o0002 = o0O000.this.f16375o00oOooO.o0O0o000(o00ooo, Math.min(j, this.f16383o00oo0o));
                    if (o0O0o0002 != -1) {
                        this.f16383o00oo0o -= o0O0o0002;
                        return o0O0o0002;
                    }
                    o00oOOo0(false);
                    throw new ProtocolException("unexpected end of stream");
                }
                return -1L;
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOoO implements o0O0oo0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f16387o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000Oo f16388o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public long f16389o00oo0Oo;

        public o00oOoO(long j) {
            this.f16388o00oo0O0 = new o0O000Oo(o0O000.this.f16373o00oOo0O.o00oOooO());
            this.f16389o00oo0Oo = j;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16387o00oo0O) {
                return;
            }
            this.f16387o00oo0O = true;
            if (this.f16389o00oo0Oo > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            o0O000.this.o00oOoO0(this.f16388o00oo0O0);
            o0O000.this.f16374o00oOo0o = 3;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            if (this.f16387o00oo0O) {
                return;
            }
            o0O000.this.f16373o00oOo0O.flush();
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return this.f16388o00oo0O0;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            if (this.f16387o00oo0O) {
                throw new IllegalStateException("closed");
            }
            oO0000O.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
            if (j <= this.f16389o00oo0Oo) {
                o0O000.this.f16373o00oOo0O.o00oo(o00ooo, j);
                this.f16389o00oo0Oo -= j;
                return;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("expected ");
            o00oOOo02.append(this.f16389o00oo0Oo);
            o00oOOo02.append(" bytes but received ");
            o00oOOo02.append(j);
            throw new ProtocolException(o00oOOo02.toString());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 extends o00oOOoO {

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f16392o00oo0o0;

        public o00oo0() {
            super();
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16376o00oo0O) {
                return;
            }
            if (!this.f16392o00oo0o0) {
                o00oOOo0(false);
            }
            this.f16376o00oo0O = true;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            if (j >= 0) {
                if (this.f16376o00oo0O) {
                    throw new IllegalStateException("closed");
                }
                if (this.f16392o00oo0o0) {
                    return -1L;
                }
                long o0O0o0002 = o0O000.this.f16375o00oOooO.o0O0o000(o00ooo, j);
                if (o0O0o0002 == -1) {
                    this.f16392o00oo0o0 = true;
                    o00oOOo0(true);
                    return -1L;
                }
                return o0O0o0002;
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends o00oOOoO {

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public long f16394o00oo0o0;

        public o00oo00O(long j) throws IOException {
            super();
            this.f16394o00oo0o0 = j;
            if (j == 0) {
                o00oOOo0(true);
            }
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16376o00oo0O) {
                return;
            }
            if (this.f16394o00oo0o0 != 0 && !oO0000O.o00oOoOo(this, 100, TimeUnit.MILLISECONDS)) {
                o00oOOo0(false);
            }
            this.f16376o00oo0O = true;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            if (j >= 0) {
                if (this.f16376o00oo0O) {
                    throw new IllegalStateException("closed");
                }
                long j2 = this.f16394o00oo0o0;
                if (j2 == 0) {
                    return -1L;
                }
                long o0O0o0002 = o0O000.this.f16375o00oOooO.o0O0o000(o00ooo, Math.min(j2, j));
                if (o0O0o0002 == -1) {
                    o00oOOo0(false);
                    throw new ProtocolException("unexpected end of stream");
                }
                long j3 = this.f16394o00oo0o0 - o0O0o0002;
                this.f16394o00oo0o0 = j3;
                if (j3 == 0) {
                    o00oOOo0(true);
                }
                return o0O0o0002;
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
    }

    public o0O000(o0O0oo00 o0o0oo00, oO0Oo oo0oo, o0O00000 o0o00000, o0 o0Var) {
        this.f16371o00oOOoO = o0o0oo00;
        this.f16372o00oOo00 = oo0oo;
        this.f16375o00oOooO = o0o00000;
        this.f16373o00oOo0O = o0Var;
    }

    @Override // o0Oo0o00.o00oo0
    public void cancel() {
        o0OOOO0o o00oOooO2 = this.f16372o00oOo00.o00oOooO();
        if (o00oOooO2 != null) {
            o00oOooO2.o00oOoO0();
        }
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOOo0() throws IOException {
        this.f16373o00oOo0O.flush();
    }

    @Override // o0Oo0o00.o00oo0
    public o0O0oo0o o00oOOoO(o0OO000o o0oo000o, long j) {
        if ("chunked".equalsIgnoreCase(o0oo000o.o00oOo00(HttpHeaders.TRANSFER_ENCODING))) {
            return o00oOoOo();
        }
        if (j != -1) {
            return o00oOooo(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOo00(o0OO000o o0oo000o) throws IOException {
        o00oo0O0(o0oo000o.f16088o00oOo00, o00ooO0.o00oOOo0(o0oo000o, this.f16372o00oOo00.o00oOooO().f16297o00oOo00.f16106o00oOOoO.type()));
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOo0O() throws IOException {
        this.f16373o00oOo0O.flush();
    }

    @Override // o0Oo0o00.o00oo0
    public o0OO00OO o00oOo0o(oo0ooO oo0ooo) throws IOException {
        return new o00oo(oo0ooo.f16174o00oo0oO, o0O00O.o00oOooO(o00oOoO(oo0ooo)));
    }

    public final o0O0O0Oo o00oOoO(oo0ooO oo0ooo) throws IOException {
        if (o00oo0O0.o00oOo00(oo0ooo)) {
            if ("chunked".equalsIgnoreCase(oo0ooo.o00oOooo(HttpHeaders.TRANSFER_ENCODING, null))) {
                return o00oOoo0(oo0ooo.f16170o00oo0O0.f16086o00oOOo0);
            }
            long o00oOOoO2 = o00oo0O0.o00oOOoO(oo0ooo);
            return o00oOOoO2 != -1 ? o00oo00O(o00oOOoO2) : o00oo0();
        }
        return o00oo00O(0L);
    }

    public void o00oOoO0(o0O000Oo o0o000oo) {
        o0O0O0o0 o00oOoo02 = o0o000oo.o00oOoo0();
        o0o000oo.o00oOooo(o0O0O0o0.f15502o00oOooO);
        o00oOoo02.o00oOOo0();
        o00oOoo02.o00oOOoO();
    }

    public boolean o00oOoOO() {
        return this.f16374o00oOo0o == 6;
    }

    public o0O0oo0o o00oOoOo() {
        if (this.f16374o00oOo0o == 1) {
            this.f16374o00oOo0o = 2;
            return new o00oOo00();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
        o00oOOo02.append(this.f16374o00oOo0o);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public o0O0O0Oo o00oOoo0(o0O0o00O o0o0o00o) throws IOException {
        if (this.f16374o00oOo0o == 4) {
            this.f16374o00oOo0o = 5;
            return new o00oOo0O(o0o0o00o);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
        o00oOOo02.append(this.f16374o00oOo0o);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // o0Oo0o00.o00oo0
    public oo0ooO.o00oOOo0 o00oOooO(boolean z) throws IOException {
        int i = this.f16374o00oOo0o;
        if (i != 1 && i != 3) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
            o00oOOo02.append(this.f16374o00oOo0o);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        try {
            o0Oo0o00.o0 o00oOOoO2 = o0Oo0o00.o0.o00oOOoO(this.f16375o00oOooO.o0OoOoOo());
            oo0ooO.o00oOOo0 o00oooo02 = new oo0ooO.o00oOOo0();
            o00oooo02.f16182o00oOOoO = o00oOOoO2.f16336o00oOOo0;
            o00oooo02.f16183o00oOo00 = o00oOOoO2.f16337o00oOOoO;
            o00oooo02.f16191o00oOooO = o00oOOoO2.f16338o00oOo00;
            oo0ooO.o00oOOo0 o00oOoOo2 = o00oooo02.o00oOoOo(o00oo0OO());
            if (z && o00oOOoO2.f16337o00oOOoO == 100) {
                return null;
            }
            this.f16374o00oOo0o = 4;
            return o00oOoOo2;
        } catch (EOFException e) {
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("unexpected end of stream on ");
            o00oOOo03.append(this.f16372o00oOo00);
            IOException iOException = new IOException(o00oOOo03.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public o0O0oo0o o00oOooo(long j) {
        if (this.f16374o00oOo0o == 1) {
            this.f16374o00oOo0o = 2;
            return new o00oOoO(j);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
        o00oOOo02.append(this.f16374o00oOo0o);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public o0O0O0Oo o00oo0() throws IOException {
        if (this.f16374o00oOo0o != 4) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
            o00oOOo02.append(this.f16374o00oOo0o);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        oO0Oo oo0oo = this.f16372o00oOo00;
        if (oo0oo != null) {
            this.f16374o00oOo0o = 5;
            oo0oo.o00oOoOo();
            return new o00oo0();
        }
        throw new IllegalStateException("streamAllocation == null");
    }

    public o0O0O0Oo o00oo00O(long j) throws IOException {
        if (this.f16374o00oOo0o == 4) {
            this.f16374o00oOo0o = 5;
            return new o00oo00O(j);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
        o00oOOo02.append(this.f16374o00oOo0o);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public void o00oo0O0(o0O0o00 o0o0o00, String str) throws IOException {
        if (this.f16374o00oOo0o != 0) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("state: ");
            o00oOOo02.append(this.f16374o00oOo0o);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        this.f16373o00oOo0O.o00oooo0(str).o00oooo0("\r\n");
        int length = o0o0o00.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            this.f16373o00oOo0O.o00oooo0(o0o0o00.o00oOooO(i)).o00oooo0(": ").o00oooo0(o0o0o00.o00oOoo0(i)).o00oooo0("\r\n");
        }
        this.f16373o00oOo0O.o00oooo0("\r\n");
        this.f16374o00oOo0o = 1;
    }

    public o0O0o00 o00oo0OO() throws IOException {
        o0O0o00.o00oOOo0 o00oooo02 = new o0O0o00.o00oOOo0();
        while (true) {
            String o0OoOoOo2 = this.f16375o00oOooO.o0OoOoOo();
            if (o0OoOoOo2.length() == 0) {
                return new o0O0o00(o00oooo02);
            }
            oO00000.f15748o00oOOo0.o00oOOo0(o00oooo02, o0OoOoOo2);
        }
    }
}
