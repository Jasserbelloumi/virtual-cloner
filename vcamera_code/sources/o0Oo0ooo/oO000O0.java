package o0Oo0ooo;

import android.support.v4.media.o00oOo0O;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
/* loaded from: classes3.dex */
public final class oO000O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16738o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00000 f16739o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOOo0 f16740o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f16741o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public long f16742o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f16743o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public long f16744o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f16745o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f16746o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f16748o00oOooO;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final byte[] f16747o00oOoo0 = new byte[4];

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final byte[] f16749o00oOooo = new byte[8192];

    /* loaded from: classes3.dex */
    public interface o00oOOo0 {
        void o00oOo00(String str) throws IOException;

        void o00oOoO(o0O0000O o0o0000o);

        void o00oOoOO(o0O0000O o0o0000o) throws IOException;

        void o00oOoOo(int i, String str);

        void o00oOooO(o0O0000O o0o0000o);
    }

    public oO000O0(boolean z, o0O00000 o0o00000, o00oOOo0 o00oooo02) {
        if (o0o00000 == null) {
            throw new NullPointerException("source == null");
        }
        if (o00oooo02 == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.f16738o00oOOo0 = z;
        this.f16739o00oOOoO = o0o00000;
        this.f16740o00oOo00 = o00oooo02;
    }

    public void o00oOOo0() throws IOException {
        o00oOo00();
        if (this.f16745o00oOoOO) {
            o00oOOoO();
        } else {
            o00oOo0O();
        }
    }

    public final void o00oOOoO() throws IOException {
        String str;
        o00ooO o00ooo = new o00ooO();
        long j = this.f16744o00oOoO0;
        long j2 = this.f16742o00oOo0o;
        if (j < j2) {
            if (!this.f16738o00oOOo0) {
                while (true) {
                    long j3 = this.f16744o00oOoO0;
                    long j4 = this.f16742o00oOo0o;
                    if (j3 >= j4) {
                        break;
                    }
                    int read = this.f16739o00oOOoO.read(this.f16749o00oOooo, 0, (int) Math.min(j4 - j3, this.f16749o00oOooo.length));
                    if (read == -1) {
                        throw new EOFException();
                    }
                    long j5 = read;
                    oO000.o00oOo00(this.f16749o00oOooo, j5, this.f16747o00oOoo0, this.f16744o00oOoO0);
                    o00ooo.write(this.f16749o00oOooo, 0, read);
                    this.f16744o00oOoO0 += j5;
                }
            } else {
                this.f16739o00oOOoO.o00oo0o(o00ooo, j2);
            }
        }
        switch (this.f16741o00oOo0O) {
            case 8:
                short s = 1005;
                long j6 = o00ooo.f15434o00oo0O;
                if (j6 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j6 != 0) {
                    s = o00ooo.readShort();
                    str = o00ooo.o0O0o0o0();
                    String o00oOOoO2 = oO000.o00oOOoO(s);
                    if (o00oOOoO2 != null) {
                        throw new ProtocolException(o00oOOoO2);
                    }
                } else {
                    str = "";
                }
                this.f16740o00oOo00.o00oOoOo(s, str);
                this.f16748o00oOooO = true;
                return;
            case 9:
                this.f16740o00oOo00.o00oOoO(o00ooo.o0O0Ooo());
                return;
            case 10:
                this.f16740o00oOo00.o00oOooO(o00ooo.o0O0Ooo());
                return;
            default:
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Unknown control opcode: ");
                o00oOOo02.append(Integer.toHexString(this.f16741o00oOo0O));
                throw new ProtocolException(o00oOOo02.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void o00oOo00() throws IOException {
        if (this.f16748o00oOooO) {
            throw new IOException("closed");
        }
        long o00oOoOO2 = this.f16739o00oOOoO.o00oOooO().o00oOoOO();
        this.f16739o00oOOoO.o00oOooO().o00oOOoO();
        try {
            int readByte = this.f16739o00oOOoO.readByte() & 255;
            this.f16739o00oOOoO.o00oOooO().o00oOoO(o00oOoOO2, TimeUnit.NANOSECONDS);
            this.f16741o00oOo0O = readByte & 15;
            boolean z = (readByte & 128) != 0;
            this.f16743o00oOoO = z;
            boolean z2 = (readByte & 8) != 0;
            this.f16745o00oOoOO = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (readByte & 64) != 0;
            boolean z4 = (readByte & 32) != 0;
            boolean z5 = (readByte & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int readByte2 = this.f16739o00oOOoO.readByte() & 255;
            boolean z6 = (readByte2 & 128) != 0;
            this.f16746o00oOoOo = z6;
            if (z6 == this.f16738o00oOOo0) {
                throw new ProtocolException(this.f16738o00oOOo0 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = readByte2 & 127;
            this.f16742o00oOo0o = j;
            if (j == 126) {
                this.f16742o00oOo0o = this.f16739o00oOOoO.readShort() & oO000.f16696o00oo0o0;
            } else if (j == 127) {
                long readLong = this.f16739o00oOOoO.readLong();
                this.f16742o00oOo0o = readLong;
                if (readLong < 0) {
                    StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Frame length 0x");
                    o00oOOo02.append(Long.toHexString(this.f16742o00oOo0o));
                    o00oOOo02.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(o00oOOo02.toString());
                }
            }
            this.f16744o00oOoO0 = 0L;
            if (this.f16745o00oOoOO && this.f16742o00oOo0o > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (this.f16746o00oOoOo) {
                this.f16739o00oOOoO.readFully(this.f16747o00oOoo0);
            }
        } catch (Throwable th) {
            this.f16739o00oOOoO.o00oOooO().o00oOoO(o00oOoOO2, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public final void o00oOo0O() throws IOException {
        int i = this.f16741o00oOo0O;
        if (i != 1 && i != 2) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Unknown opcode: ");
            o00oOOo02.append(Integer.toHexString(i));
            throw new ProtocolException(o00oOOo02.toString());
        }
        o00ooO o00ooo = new o00ooO();
        o00oOooO(o00ooo);
        if (i == 1) {
            this.f16740o00oOo00.o00oOo00(o00ooo.o0O0o0o0());
        } else {
            this.f16740o00oOo00.o00oOoOO(o00ooo.o0O0Ooo());
        }
    }

    public void o00oOo0o() throws IOException {
        while (!this.f16748o00oOooO) {
            o00oOo00();
            if (!this.f16745o00oOoOO) {
                return;
            }
            o00oOOoO();
        }
    }

    public final void o00oOooO(o00ooO o00ooo) throws IOException {
        long o0O0o0002;
        while (!this.f16748o00oOooO) {
            if (this.f16744o00oOoO0 == this.f16742o00oOo0o) {
                if (this.f16743o00oOoO) {
                    return;
                }
                o00oOo0o();
                if (this.f16741o00oOo0O != 0) {
                    StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Expected continuation opcode. Got: ");
                    o00oOOo02.append(Integer.toHexString(this.f16741o00oOo0O));
                    throw new ProtocolException(o00oOOo02.toString());
                } else if (this.f16743o00oOoO && this.f16742o00oOo0o == 0) {
                    return;
                }
            }
            long j = this.f16742o00oOo0o - this.f16744o00oOoO0;
            if (this.f16746o00oOoOo) {
                o0O0o0002 = this.f16739o00oOOoO.read(this.f16749o00oOooo, 0, (int) Math.min(j, this.f16749o00oOooo.length));
                if (o0O0o0002 == -1) {
                    throw new EOFException();
                }
                oO000.o00oOo00(this.f16749o00oOooo, o0O0o0002, this.f16747o00oOoo0, this.f16744o00oOoO0);
                o00ooo.write(this.f16749o00oOooo, 0, (int) o0O0o0002);
            } else {
                o0O0o0002 = this.f16739o00oOOoO.o0O0o000(o00ooo, j);
                if (o0O0o0002 == -1) {
                    throw new EOFException();
                }
            }
            this.f16744o00oOoO0 += o0O0o0002;
        }
        throw new IOException("closed");
    }
}
