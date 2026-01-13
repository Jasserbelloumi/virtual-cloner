package o0Oo0o0o;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo0Oo.oO0000O;
import o0Oo0o0o.o0O000o0;
/* loaded from: classes3.dex */
public final class o0O00O0o implements Closeable {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Logger f16495o00oo0o = Logger.getLogger(o0O00.class.getName());

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOOo0 f16496o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00000 f16497o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final boolean f16498o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0O000o0.o00oOOo0 f16499o00oo0o0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0O0O0Oo {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f16500o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00000 f16501o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public byte f16502o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f16503o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f16504o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public short f16505o00oo0oO;

        public o00oOOo0(o0O00000 o0o00000) {
            this.f16501o00oo0O0 = o0o00000;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final void o00oOOo0() throws IOException {
            int i = this.f16504o00oo0o0;
            int o00oOooo2 = o0O00O0o.o00oOooo(this.f16501o00oo0O0);
            this.f16503o00oo0o = o00oOooo2;
            this.f16500o00oo0O = o00oOooo2;
            byte readByte = (byte) (this.f16501o00oo0O0.readByte() & 255);
            this.f16502o00oo0Oo = (byte) (this.f16501o00oo0O0.readByte() & 255);
            Logger logger = o0O00O0o.f16495o00oo0o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(o0O00.o00oOOoO(true, this.f16504o00oo0o0, this.f16500o00oo0O, readByte, this.f16502o00oo0Oo));
            }
            int readInt = this.f16501o00oo0O0.readInt() & Integer.MAX_VALUE;
            this.f16504o00oo0o0 = readInt;
            if (readByte != 9) {
                throw o0O00.o00oOooO("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i) {
                throw o0O00.o00oOooO("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f16501o00oo0O0.o00oOooO();
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            while (true) {
                int i = this.f16503o00oo0o;
                if (i != 0) {
                    long o0O0o0002 = this.f16501o00oo0O0.o0O0o000(o00ooo, Math.min(j, i));
                    if (o0O0o0002 == -1) {
                        return -1L;
                    }
                    this.f16503o00oo0o = (int) (this.f16503o00oo0o - o0O0o0002);
                    return o0O0o0002;
                }
                this.f16501o00oo0O0.skip(this.f16505o00oo0oO);
                this.f16505o00oo0oO = (short) 0;
                if ((this.f16502o00oo0Oo & 4) != 0) {
                    return -1L;
                }
                o00oOOo0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOOoO {
        void o00oOOo0(int i, o0OoOoOo o0oooooo);

        void o00oOOoO(boolean z, int i, int i2, List<o0O000Oo> list);

        void o00oOo00(int i, long j);

        void o00oOo0O(int i, int i2, List<o0O000Oo> list) throws IOException;

        void o00oOo0o(boolean z, int i, o0O00000 o0o00000, int i2) throws IOException;

        void o00oOoO(int i, o0OoOoOo o0oooooo, o0O0000O o0o0000o);

        void o00oOoO0();

        void o00oOoOO(boolean z, int i, int i2);

        void o00oOoOo(int i, int i2, int i3, boolean z);

        void o00oOoo0(int i, String str, o0O0000O o0o0000o, String str2, int i2, long j);

        void o00oOooO(boolean z, o0O00oO0 o0o00oo0);
    }

    public o0O00O0o(o0O00000 o0o00000, boolean z) {
        this.f16497o00oo0O0 = o0o00000;
        this.f16498o00oo0Oo = z;
        o00oOOo0 o00oooo02 = new o00oOOo0(o0o00000);
        this.f16496o00oo0O = o00oooo02;
        this.f16499o00oo0o0 = new o0O000o0.o00oOOo0(4096, 4096, o00oooo02);
    }

    public static int o00oOOo0(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw o0O00.o00oOooO("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int o00oOooo(o0O00000 o0o00000) throws IOException {
        return (o0o00000.readByte() & 255) | ((o0o00000.readByte() & 255) << 16) | ((o0o00000.readByte() & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16497o00oo0O0.close();
    }

    public boolean o00oOOoO(boolean z, o00oOOoO o00ooooo2) throws IOException {
        try {
            this.f16497o00oo0O0.o0O00O0o(9L);
            int o00oOooo2 = o00oOooo(this.f16497o00oo0O0);
            if (o00oOooo2 < 0 || o00oOooo2 > 16384) {
                throw o0O00.o00oOooO("FRAME_SIZE_ERROR: %s", Integer.valueOf(o00oOooo2));
            }
            byte readByte = (byte) (this.f16497o00oo0O0.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f16497o00oo0O0.readByte() & 255);
                int readInt = this.f16497o00oo0O0.readInt() & Integer.MAX_VALUE;
                Logger logger = f16495o00oo0o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o0O00.o00oOOoO(true, readInt, o00oOooo2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        o00oOo0o(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 1:
                        o00oOoo0(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 2:
                        o00ooO0(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 3:
                        o00ooO0o(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 4:
                        o00ooOoO(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 5:
                        o00ooO0O(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 6:
                        o00oo0(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 7:
                        o00oOoO0(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    case 8:
                        o00oooOo(o00ooooo2, o00oOooo2, readByte2, readInt);
                        break;
                    default:
                        this.f16497o00oo0O0.skip(o00oOooo2);
                        break;
                }
                return true;
            }
            throw o0O00.o00oOooO("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    public void o00oOo0O(o00oOOoO o00ooooo2) throws IOException {
        if (this.f16498o00oo0Oo) {
            if (!o00oOOoO(true, o00ooooo2)) {
                throw o0O00.o00oOooO("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        o0O00000 o0o00000 = this.f16497o00oo0O0;
        o0O0000O o0o0000o = o0O00.f16395o00oOOo0;
        o0O0000O o0O00o2 = o0o00000.o0O00o(o0o0000o.size());
        Logger logger = f16495o00oo0o;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(oO0000O.o00oo00O("<< CONNECTION %s", o0O00o2.hex()));
        }
        if (!o0o0000o.equals(o0O00o2)) {
            throw o0O00.o00oOooO("Expected a connection header but was %s", o0O00o2.utf8());
        }
    }

    public final void o00oOo0o(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw o0O00.o00oOooO("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            throw o0O00.o00oOooO("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short readByte = (b & 8) != 0 ? (short) (this.f16497o00oo0O0.readByte() & 255) : (short) 0;
        o00ooooo2.o00oOo0o(z, i2, this.f16497o00oo0O0, o00oOOo0(i, b, readByte));
        this.f16497o00oo0O0.skip(readByte);
    }

    public final List<o0O000Oo> o00oOoO(int i, short s, byte b, int i2) throws IOException {
        o00oOOo0 o00oooo02 = this.f16496o00oo0O;
        o00oooo02.f16503o00oo0o = i;
        o00oooo02.f16500o00oo0O = i;
        o00oooo02.f16505o00oo0oO = s;
        o00oooo02.f16502o00oo0Oo = b;
        o00oooo02.f16504o00oo0o0 = i2;
        this.f16499o00oo0o0.o00oOooo();
        return this.f16499o00oo0o0.o00oOo0O();
    }

    public final void o00oOoO0(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw o0O00.o00oOooO("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw o0O00.o00oOooO("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int readInt = this.f16497o00oo0O0.readInt();
        int readInt2 = this.f16497o00oo0O0.readInt();
        int i3 = i - 8;
        o0OoOoOo fromHttp2 = o0OoOoOo.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            throw o0O00.o00oOooO("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        }
        o0O0000O o0o0000o = o0O0000O.EMPTY;
        if (i3 > 0) {
            o0o0000o = this.f16497o00oo0O0.o0O00o(i3);
        }
        o00ooooo2.o00oOoO(readInt, fromHttp2, o0o0000o);
    }

    public final void o00oOoo0(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw o0O00.o00oOooO("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.f16497o00oo0O0.readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            o00ooO00(o00ooooo2, i2);
            i -= 5;
        }
        o00ooooo2.o00oOOoO(z, i2, -1, o00oOoO(o00oOOo0(i, b, readByte), readByte, b, i2));
    }

    public final void o00oo0(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            throw o0O00.o00oOooO("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw o0O00.o00oOooO("TYPE_PING streamId != 0", new Object[0]);
        }
        o00ooooo2.o00oOoOO((b & 1) != 0, this.f16497o00oo0O0.readInt(), this.f16497o00oo0O0.readInt());
    }

    public final void o00ooO0(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw o0O00.o00oOooO("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw o0O00.o00oOooO("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        o00ooO00(o00ooooo2, i2);
    }

    public final void o00ooO00(o00oOOoO o00ooooo2, int i) throws IOException {
        int readInt = this.f16497o00oo0O0.readInt();
        o00ooooo2.o00oOoOo(i, readInt & Integer.MAX_VALUE, (this.f16497o00oo0O0.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public final void o00ooO0O(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw o0O00.o00oOooO("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short readByte = (b & 8) != 0 ? (short) (this.f16497o00oo0O0.readByte() & 255) : (short) 0;
        o00ooooo2.o00oOo0O(i2, this.f16497o00oo0O0.readInt() & Integer.MAX_VALUE, o00oOoO(o00oOOo0(i - 4, b, readByte), readByte, b, i2));
    }

    public final void o00ooO0o(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw o0O00.o00oOooO("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw o0O00.o00oOooO("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int readInt = this.f16497o00oo0O0.readInt();
        o0OoOoOo fromHttp2 = o0OoOoOo.fromHttp2(readInt);
        if (fromHttp2 == null) {
            throw o0O00.o00oOooO("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
        }
        o00ooooo2.o00oOOo0(i2, fromHttp2);
    }

    public final void o00ooOoO(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw o0O00.o00oOooO("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw o0O00.o00oOooO("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            o00ooooo2.o00oOoO0();
        } else if (i % 6 != 0) {
            throw o0O00.o00oOooO("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        } else {
            o0O00oO0 o0o00oo0 = new o0O00oO0();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f16497o00oo0O0.readShort();
                int readInt = this.f16497o00oo0O0.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw o0O00.o00oOooO("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw o0O00.o00oOooO("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw o0O00.o00oOooO("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                o0o00oo0.o00oOoo0(readShort, readInt);
            }
            o00ooooo2.o00oOooO(false, o0o00oo0);
        }
    }

    public final void o00oooOo(o00oOOoO o00ooooo2, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw o0O00.o00oOooO("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long readInt = this.f16497o00oo0O0.readInt() & 2147483647L;
        if (readInt == 0) {
            throw o0O00.o00oOooO("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        o00ooooo2.o00oOo00(i2, readInt);
    }
}
