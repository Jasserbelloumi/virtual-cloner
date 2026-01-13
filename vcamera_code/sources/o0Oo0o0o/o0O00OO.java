package o0Oo0o0o;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo0Oo.oO0000O;
import o0Oo0o0o.o0O000o0;
/* loaded from: classes3.dex */
public final class o0O00OO implements Closeable {

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final Logger f16506o0O0o = Logger.getLogger(o0O00.class.getName());

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final boolean f16507o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0 f16508o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00ooO f16509o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f16510o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f16511o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final o0O000o0.o00oOOoO f16512o00oo0oO;

    public o0O00OO(o0 o0Var, boolean z) {
        this.f16508o00oo0O0 = o0Var;
        this.f16507o00oo0O = z;
        o00ooO o00ooo = new o00ooO();
        this.f16509o00oo0Oo = o00ooo;
        this.f16512o00oo0oO = new o0O000o0.o00oOOoO(o00ooo);
        this.f16511o00oo0o0 = 16384;
    }

    public static void o0O000o0(o0 o0Var, int i) throws IOException {
        o0Var.writeByte((i >>> 16) & 255);
        o0Var.writeByte((i >>> 8) & 255);
        o0Var.writeByte(i & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f16510o00oo0o = true;
        this.f16508o00oo0O0.close();
    }

    public synchronized void flush() throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        this.f16508o00oo0O0.flush();
    }

    public synchronized void o00oOOo0(o0O00oO0 o0o00oo0) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        this.f16511o00oo0o0 = o0o00oo0.o00oOoO0(this.f16511o00oo0o0);
        if (o0o00oo0.o00oOooO() != -1) {
            this.f16512o00oo0oO.o00oOo0O(o0o00oo0.o00oOooO());
        }
        o00oOoO0(0, 0, (byte) 4, (byte) 1);
        this.f16508o00oo0O0.flush();
    }

    public synchronized void o00oOOoO() throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        if (this.f16507o00oo0O) {
            Logger logger = f16506o0O0o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(oO0000O.o00oo00O(">> CONNECTION %s", o0O00.f16395o00oOOo0.hex()));
            }
            this.f16508o00oo0O0.write(o0O00.f16395o00oOOo0.toByteArray());
            this.f16508o00oo0O0.flush();
        }
    }

    public synchronized void o00oOo0O(boolean z, int i, o00ooO o00ooo, int i2) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        o00oOo0o(i, z ? (byte) 1 : (byte) 0, o00ooo, i2);
    }

    public void o00oOo0o(int i, byte b, o00ooO o00ooo, int i2) throws IOException {
        o00oOoO0(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f16508o00oo0O0.o00oo(o00ooo, i2);
        }
    }

    public synchronized void o00oOoO(int i, o0OoOoOo o0oooooo, byte[] bArr) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        if (o0oooooo.httpCode == -1) {
            throw o0O00.o00oOo00("errorCode.httpCode == -1", new Object[0]);
        }
        o00oOoO0(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f16508o00oo0O0.writeInt(i);
        this.f16508o00oo0O0.writeInt(o0oooooo.httpCode);
        if (bArr.length > 0) {
            this.f16508o00oo0O0.write(bArr);
        }
        this.f16508o00oo0O0.flush();
    }

    public void o00oOoO0(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f16506o0O0o;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(o0O00.o00oOOoO(false, i, i2, b, b2));
        }
        int i3 = this.f16511o00oo0o0;
        if (i2 > i3) {
            throw o0O00.o00oOo00("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw o0O00.o00oOo00("reserved bit set: %s", Integer.valueOf(i));
        }
        o0O000o0(this.f16508o00oo0O0, i2);
        this.f16508o00oo0O0.writeByte(b & 255);
        this.f16508o00oo0O0.writeByte(b2 & 255);
        this.f16508o00oo0O0.writeInt(i & Integer.MAX_VALUE);
    }

    public synchronized void o00oOoo0(int i, List<o0O000Oo> list) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        o00oOooo(false, i, list);
    }

    public void o00oOooo(boolean z, int i, List<o0O000Oo> list) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        this.f16512o00oo0oO.o00oOoO0(list);
        long j = this.f16509o00oo0Oo.f15434o00oo0O;
        int min = (int) Math.min(this.f16511o00oo0o0, j);
        long j2 = min;
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        byte b = i2 == 0 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        o00oOoO0(i, min, (byte) 1, b);
        this.f16508o00oo0O0.o00oo(this.f16509o00oo0Oo, j2);
        if (i2 > 0) {
            o0O000O(i, j - j2);
        }
    }

    public int o00oo0() {
        return this.f16511o00oo0o0;
    }

    public synchronized void o00ooO0(int i, int i2, List<o0O000Oo> list) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        this.f16512o00oo0oO.o00oOoO0(list);
        long j = this.f16509o00oo0Oo.f15434o00oo0O;
        int min = (int) Math.min(this.f16511o00oo0o0 - 4, j);
        long j2 = min;
        int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        o00oOoO0(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : (byte) 0);
        this.f16508o00oo0O0.writeInt(i2 & Integer.MAX_VALUE);
        this.f16508o00oo0O0.o00oo(this.f16509o00oo0Oo, j2);
        if (i3 > 0) {
            o0O000O(i, j - j2);
        }
    }

    public synchronized void o00ooO00(boolean z, int i, int i2) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        o00oOoO0(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f16508o00oo0O0.writeInt(i);
        this.f16508o00oo0O0.writeInt(i2);
        this.f16508o00oo0O0.flush();
    }

    public synchronized void o00ooO0O(int i, o0OoOoOo o0oooooo) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        if (o0oooooo.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        o00oOoO0(i, 4, (byte) 3, (byte) 0);
        this.f16508o00oo0O0.writeInt(o0oooooo.httpCode);
        this.f16508o00oo0O0.flush();
    }

    public synchronized void o00ooO0o(o0O00oO0 o0o00oo0) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        int i = 0;
        o00oOoO0(0, o0o00oo0.o00oOooo() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (o0o00oo0.o00oOoOO(i)) {
                this.f16508o00oo0O0.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f16508o00oo0O0.writeInt(o0o00oo0.f16530o00oOOoO[i]);
            }
            i++;
        }
        this.f16508o00oo0O0.flush();
    }

    public synchronized void o00ooOoO(boolean z, int i, List<o0O000Oo> list) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        o00oOooo(z, i, list);
    }

    public synchronized void o00oooOo(boolean z, int i, int i2, List<o0O000Oo> list) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        o00oOooo(z, i, list);
    }

    public synchronized void o0O000(int i, long j) throws IOException {
        if (this.f16510o00oo0o) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw o0O00.o00oOo00("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        o00oOoO0(i, 4, (byte) 8, (byte) 0);
        this.f16508o00oo0O0.writeInt((int) j);
        this.f16508o00oo0O0.flush();
    }

    public final void o0O000O(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.f16511o00oo0o0, j);
            long j2 = min;
            j -= j2;
            o00oOoO0(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f16508o00oo0O0.o00oo(this.f16509o00oo0Oo, j2);
        }
    }
}
