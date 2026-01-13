package o0Oo;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import o0O0OO0.o00oOo0O;
/* loaded from: classes3.dex */
public final class o0O00 implements o0O0O0Oo {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final byte f15440o00oo = 3;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final byte f15441o00oo0oO = 1;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final byte f15442o00ooO = 3;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final byte f15443o00ooO0 = 0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final byte f15444o00ooO00 = 4;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final byte f15445o00ooO0O = 1;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final byte f15446o00ooO0o = 2;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final byte f15447o0O0o = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00000 f15448o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Inflater f15450o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0O00O0o f15452o00oo0o0;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f15449o00oo0O0 = 0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final CRC32 f15451o00oo0o = new CRC32();

    public o0O00(o0O0O0Oo o0o0o0oo) {
        if (o0o0o0oo == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f15450o00oo0Oo = inflater;
        o0O00000 o00oOooO2 = o0O00O.o00oOooO(o0o0o0oo);
        this.f15448o00oo0O = o00oOooO2;
        this.f15452o00oo0o0 = new o0O00O0o(o00oOooO2, inflater);
    }

    @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15452o00oo0o0.close();
    }

    public final void o00oOOo0(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public final void o00oOOoO() throws IOException {
        this.f15448o00oo0O.o0O00O0o(10L);
        byte o00ooO0o2 = this.f15448o00oo0O.o00oOo00().o00ooO0o(3L);
        boolean z = ((o00ooO0o2 >> 1) & 1) == 1;
        if (z) {
            o00oOo0o(this.f15448o00oo0O.o00oOo00(), 0L, 10L);
        }
        o00oOOo0("ID1ID2", 8075, this.f15448o00oo0O.readShort());
        this.f15448o00oo0O.skip(8L);
        if (((o00ooO0o2 >> 2) & 1) == 1) {
            this.f15448o00oo0O.o0O00O0o(2L);
            if (z) {
                o00oOo0o(this.f15448o00oo0O.o00oOo00(), 0L, 2L);
            }
            long o0O002 = this.f15448o00oo0O.o00oOo00().o0O00();
            this.f15448o00oo0O.o0O00O0o(o0O002);
            if (z) {
                o00oOo0o(this.f15448o00oo0O.o00oOo00(), 0L, o0O002);
            }
            this.f15448o00oo0O.skip(o0O002);
        }
        if (((o00ooO0o2 >> 3) & 1) == 1) {
            long o0O00OOO2 = this.f15448o00oo0O.o0O00OOO((byte) 0);
            if (o0O00OOO2 == -1) {
                throw new EOFException();
            }
            if (z) {
                o00oOo0o(this.f15448o00oo0O.o00oOo00(), 0L, o0O00OOO2 + 1);
            }
            this.f15448o00oo0O.skip(o0O00OOO2 + 1);
        }
        if (((o00ooO0o2 >> 4) & 1) == 1) {
            long o0O00OOO3 = this.f15448o00oo0O.o0O00OOO((byte) 0);
            if (o0O00OOO3 == -1) {
                throw new EOFException();
            }
            if (z) {
                o00oOo0o(this.f15448o00oo0O.o00oOo00(), 0L, o0O00OOO3 + 1);
            }
            this.f15448o00oo0O.skip(o0O00OOO3 + 1);
        }
        if (z) {
            o00oOOo0("FHCRC", this.f15448o00oo0O.o0O00(), (short) this.f15451o00oo0o.getValue());
            this.f15451o00oo0o.reset();
        }
    }

    public final void o00oOo0O() throws IOException {
        o00oOOo0("CRC", this.f15448o00oo0O.o0O0o0(), (int) this.f15451o00oo0o.getValue());
        o00oOOo0("ISIZE", this.f15448o00oo0O.o0O0o0(), (int) this.f15450o00oo0Oo.getBytesWritten());
    }

    public final void o00oOo0o(o00ooO o00ooo, long j, long j2) {
        int i;
        o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
        while (true) {
            int i2 = o0o00oo0.f15494o00oOo00;
            int i3 = o0o00oo0.f15493o00oOOoO;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        }
        while (j2 > 0) {
            int min = (int) Math.min(o0o00oo0.f15494o00oOo00 - i, j2);
            this.f15451o00oo0o.update(o0o00oo0.f15492o00oOOo0, (int) (o0o00oo0.f15493o00oOOoO + j), min);
            j2 -= min;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
            j = 0;
        }
    }

    @Override // o0Oo.o0O0O0Oo
    public o0O0O0o0 o00oOooO() {
        return this.f15448o00oo0O.o00oOooO();
    }

    @Override // o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.f15449o00oo0O0 == 0) {
                o00oOOoO();
                this.f15449o00oo0O0 = 1;
            }
            if (this.f15449o00oo0O0 == 1) {
                long j2 = o00ooo.f15434o00oo0O;
                long o0O0o0002 = this.f15452o00oo0o0.o0O0o000(o00ooo, j);
                if (o0O0o0002 != -1) {
                    o00oOo0o(o00ooo, j2, o0O0o0002);
                    return o0O0o0002;
                }
                this.f15449o00oo0O0 = 2;
            }
            if (this.f15449o00oo0O0 == 2) {
                o00oOo0O();
                this.f15449o00oo0O0 = 3;
                if (!this.f15448o00oo0O.o0O0O0oO()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(o00oOo0O.o00oOOo0("byteCount < 0: ", j));
    }
}
