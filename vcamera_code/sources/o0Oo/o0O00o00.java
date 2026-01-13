package o0Oo;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes3.dex */
public final class o0O00o00 implements o0O00000 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O0O0Oo f15486o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00ooO f15487o00oo0O0 = new o00ooO();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f15488o00oo0Oo;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends InputStream {
        public o00oOOo0() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            o0O00o00 o0o00o00 = o0O00o00.this;
            if (o0o00o00.f15488o00oo0Oo) {
                throw new IOException("closed");
            }
            return (int) Math.min(o0o00o00.f15487o00oo0O0.f15434o00oo0O, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            o0O00o00.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            o0O00o00 o0o00o00 = o0O00o00.this;
            if (o0o00o00.f15488o00oo0Oo) {
                throw new IOException("closed");
            }
            o00ooO o00ooo = o0o00o00.f15487o00oo0O0;
            if (o00ooo.f15434o00oo0O == 0 && o0o00o00.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return o0O00o00.this.f15487o00oo0O0.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (o0O00o00.this.f15488o00oo0Oo) {
                throw new IOException("closed");
            }
            o0O0OO0.o00oOOoO(bArr.length, i, i2);
            o0O00o00 o0o00o00 = o0O00o00.this;
            o00ooO o00ooo = o0o00o00.f15487o00oo0O0;
            if (o00ooo.f15434o00oo0O == 0 && o0o00o00.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return o0O00o00.this.f15487o00oo0O0.read(bArr, i, i2);
        }

        public String toString() {
            return o0O00o00.this + ".inputStream()";
        }
    }

    public o0O00o00(o0O0O0Oo o0o0o0oo) {
        if (o0o0o0oo == null) {
            throw new NullPointerException("source == null");
        }
        this.f15486o00oo0O = o0o0o0oo;
    }

    @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15488o00oo0Oo) {
            return;
        }
        this.f15488o00oo0Oo = true;
        this.f15486o00oo0O.close();
        this.f15487o00oo0O0.o00oOOoO();
    }

    @Override // o0Oo.o0O00000, o0Oo.o0
    public o00ooO o00oOo00() {
        return this.f15487o00oo0O0;
    }

    @Override // o0Oo.o0O0O0Oo
    public o0O0O0o0 o00oOooO() {
        return this.f15486o00oo0O.o00oOooO();
    }

    @Override // o0Oo.o0O00000
    public void o00oo0o(o00ooO o00ooo, long j) throws IOException {
        try {
            o0O00O0o(j);
            this.f15487o00oo0O0.o00oo0o(o00ooo, j);
        } catch (EOFException e) {
            o00ooo.o0O0o0o(this.f15487o00oo0O0);
            throw e;
        }
    }

    @Override // o0Oo.o0O00000
    public long o00ooOO(byte b, long j) throws IOException {
        return o00ooOOo(b, j, Long.MAX_VALUE);
    }

    @Override // o0Oo.o0O00000
    public long o00ooOO0(o0O0000O o0o0000o, long j) throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long o00ooOO02 = this.f15487o00oo0O0.o00ooOO0(o0o0000o, j);
            if (o00ooOO02 != -1) {
                return o00ooOO02;
            }
            o00ooO o00ooo = this.f15487o00oo0O0;
            long j2 = o00ooo.f15434o00oo0O;
            if (this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // o0Oo.o0O00000
    public long o00ooOOo(byte b, long j, long j2) throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long o00ooOOo2 = this.f15487o00oo0O0.o00ooOOo(b, j, j2);
            if (o00ooOOo2 == -1) {
                o00ooO o00ooo = this.f15487o00oo0O0;
                long j3 = o00ooo.f15434o00oo0O;
                if (j3 >= j2 || this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return o00ooOOo2;
            }
        }
        return -1L;
    }

    @Override // o0Oo.o0O00000
    @Nullable
    public String o00ooOo0() throws IOException {
        long o0O00OOO2 = o0O00OOO((byte) 10);
        if (o0O00OOO2 == -1) {
            long j = this.f15487o00oo0O0.f15434o00oo0O;
            if (j != 0) {
                return o0O00Oo(j);
            }
            return null;
        }
        return this.f15487o00oo0O0.o0ooO(o0O00OOO2);
    }

    @Override // o0Oo.o0O00000
    public String o00ooOoo(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long o00ooOOo2 = o00ooOOo((byte) 10, 0L, j2);
            if (o00ooOOo2 != -1) {
                return this.f15487o00oo0O0.o0ooO(o00ooOOo2);
            }
            if (j2 < Long.MAX_VALUE && o0O0000o(j2) && this.f15487o00oo0O0.o00ooO0o(j2 - 1) == 13 && o0O0000o(1 + j2) && this.f15487o00oo0O0.o00ooO0o(j2) == 10) {
                return this.f15487o00oo0O0.o0ooO(j2);
            }
            o00ooO o00ooo = new o00ooO();
            o00ooO o00ooo2 = this.f15487o00oo0O0;
            o00ooo2.o00ooO00(o00ooo, 0L, Math.min(32L, o00ooo2.f15434o00oo0O));
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("\\n not found: limit=");
            o00oOOo02.append(Math.min(this.f15487o00oo0O0.f15434o00oo0O, j));
            o00oOOo02.append(" content=");
            o00oOOo02.append(o00ooo.o0O0Ooo().hex());
            o00oOOo02.append(oOo0oooO.f13933o00ooOo0);
            throw new EOFException(o00oOOo02.toString());
        }
        throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("limit < 0: ", j));
    }

    @Override // o0Oo.o0O00000
    public int o00ooo0(o0O00OO o0o00oo) throws IOException {
        o00ooO o00ooo;
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        do {
            int o0O0Oo2 = this.f15487o00oo0O0.o0O0Oo(o0o00oo);
            if (o0O0Oo2 == -1) {
                return -1;
            }
            long size = o0o00oo.f15475o00oo0O0[o0O0Oo2].size();
            o00ooo = this.f15487o00oo0O0;
            if (size <= o00ooo.f15434o00oo0O) {
                o00ooo.skip(size);
                return o0O0Oo2;
            }
        } while (this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // o0Oo.o0O00000
    public short o0O00() throws IOException {
        o0O00O0o(2L);
        return this.f15487o00oo0O0.o0O00();
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0000o(long j) throws IOException {
        o00ooO o00ooo;
        if (j >= 0) {
            if (this.f15488o00oo0Oo) {
                throw new IllegalStateException("closed");
            }
            do {
                o00ooo = this.f15487o00oo0O0;
                if (o00ooo.f15434o00oo0O >= j) {
                    return true;
                }
            } while (this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        }
        throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
    }

    @Override // o0Oo.o0O00000
    public long o0O00O0() throws IOException {
        o0O00O0o(8L);
        return this.f15487o00oo0O0.o0O00O0();
    }

    @Override // o0Oo.o0O00000
    public void o0O00O0o(long j) throws IOException {
        if (!o0O0000o(j)) {
            throw new EOFException();
        }
    }

    @Override // o0Oo.o0O00000
    public long o0O00OOO(byte b) throws IOException {
        return o00ooOOo(b, 0L, Long.MAX_VALUE);
    }

    @Override // o0Oo.o0O00000
    public String o0O00Oo(long j) throws IOException {
        o0O00O0o(j);
        return this.f15487o00oo0O0.o0O00Oo(j);
    }

    @Override // o0Oo.o0O00000
    public boolean o0O00Ooo(long j, o0O0000O o0o0000o, int i, int i2) throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || o0o0000o.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!o0O0000o(1 + j2) || this.f15487o00oo0O0.o00ooO0o(j2) != o0o0000o.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // o0Oo.o0O00000
    public o0O0000O o0O00o(long j) throws IOException {
        o0O00O0o(j);
        return this.f15487o00oo0O0.o0O00o(j);
    }

    @Override // o0Oo.o0O00000
    public byte[] o0O0O0o0() throws IOException {
        this.f15487o00oo0O0.o0O0o0o(this.f15486o00oo0O);
        return this.f15487o00oo0O0.o0O0O0o0();
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0O0oO() throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        return this.f15487o00oo0O0.o0O0O0oO() && this.f15486o00oo0O.o0O0o000(this.f15487o00oo0O0, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // o0Oo.o0O00000
    public long o0O0OO() throws IOException {
        byte o00ooO0o2;
        o0O00O0o(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!o0O0000o(i2)) {
                break;
            }
            o00ooO0o2 = this.f15487o00oo0O0.o00ooO0o(i);
            if ((o00ooO0o2 < 48 || o00ooO0o2 > 57) && !(i == 0 && o00ooO0o2 == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(o00ooO0o2)));
        }
        return this.f15487o00oo0O0.o0O0OO();
    }

    @Override // o0Oo.o0O00000
    public long o0O0Oo0(o0O0oo0o o0o0oo0o) throws IOException {
        if (o0o0oo0o != null) {
            long j = 0;
            while (this.f15486o00oo0O.o0O0o000(this.f15487o00oo0O0, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                long o00oOoo02 = this.f15487o00oo0O0.o00oOoo0();
                if (o00oOoo02 > 0) {
                    j += o00oOoo02;
                    o0o0oo0o.o00oo(this.f15487o00oo0O0, o00oOoo02);
                }
            }
            o00ooO o00ooo = this.f15487o00oo0O0;
            long j2 = o00ooo.f15434o00oo0O;
            if (j2 > 0) {
                long j3 = j + j2;
                o0o0oo0o.o00oo(o00ooo, j2);
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // o0Oo.o0O00000
    public long o0O0OoO(o0O0000O o0o0000o) throws IOException {
        return o0OoOoOO(o0o0000o, 0L);
    }

    @Override // o0Oo.o0O00000
    public String o0O0OoO0(Charset charset) throws IOException {
        if (charset != null) {
            this.f15487o00oo0O0.o0O0o0o(this.f15486o00oo0O);
            return this.f15487o00oo0O0.o0O0OoO0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // o0Oo.o0O00000
    public int o0O0OoOo() throws IOException {
        long j;
        o0O00O0o(1L);
        byte o00ooO0o2 = this.f15487o00oo0O0.o00ooO0o(0L);
        if ((o00ooO0o2 & 224) == 192) {
            j = 2;
        } else if ((o00ooO0o2 & 240) != 224) {
            if ((o00ooO0o2 & 248) == 240) {
                j = 4;
            }
            return this.f15487o00oo0O0.o0O0OoOo();
        } else {
            j = 3;
        }
        o0O00O0o(j);
        return this.f15487o00oo0O0.o0O0OoOo();
    }

    @Override // o0Oo.o0O00000
    public o0O0000O o0O0Ooo() throws IOException {
        this.f15487o00oo0O0.o0O0o0o(this.f15486o00oo0O);
        return this.f15487o00oo0O0.o0O0Ooo();
    }

    @Override // o0Oo.o0O00000
    public int o0O0o0() throws IOException {
        o0O00O0o(4L);
        return this.f15487o00oo0O0.o0O0o0();
    }

    @Override // o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
        if (o00ooo != null) {
            if (j >= 0) {
                if (this.f15488o00oo0Oo) {
                    throw new IllegalStateException("closed");
                }
                o00ooO o00ooo2 = this.f15487o00oo0O0;
                if (o00ooo2.f15434o00oo0O == 0 && this.f15486o00oo0O.o0O0o000(o00ooo2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return this.f15487o00oo0O0.o0O0o000(o00ooo, Math.min(j, this.f15487o00oo0O0.f15434o00oo0O));
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0o00O(long j, o0O0000O o0o0000o) throws IOException {
        return o0O00Ooo(j, o0o0000o, 0, o0o0000o.size());
    }

    @Override // o0Oo.o0O00000
    public String o0O0o0o0() throws IOException {
        this.f15487o00oo0O0.o0O0o0o(this.f15486o00oo0O);
        return this.f15487o00oo0O0.o0O0o0o0();
    }

    @Override // o0Oo.o0O00000
    public long o0O0oO0o(o0O0000O o0o0000o) throws IOException {
        return o00ooOO0(o0o0000o, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // o0Oo.o0O00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o0O0oOOO() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.o0O00O0o(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.o0O0000o(r3)
            if (r3 == 0) goto L4a
            o0Oo.o00ooO r3 = r6.f15487o00oo0O0
            long r4 = (long) r1
            byte r3 = r3.o00ooO0o(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            o0Oo.o00ooO r0 = r6.f15487o00oo0O0
            long r0 = r0.o0O0oOOO()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo.o0O00o00.o0O0oOOO():long");
    }

    @Override // o0Oo.o0O00000
    public InputStream o0O0oOo0() {
        return new o00oOOo0();
    }

    @Override // o0Oo.o0O00000
    public long o0OoOoOO(o0O0000O o0o0000o, long j) throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long o0OoOoOO2 = this.f15487o00oo0O0.o0OoOoOO(o0o0000o, j);
            if (o0OoOoOO2 != -1) {
                return o0OoOoOO2;
            }
            o00ooO o00ooo = this.f15487o00oo0O0;
            long j2 = o00ooo.f15434o00oo0O;
            if (this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - o0o0000o.size()) + 1);
        }
    }

    @Override // o0Oo.o0O00000
    public String o0OoOoOo() throws IOException {
        return o00ooOoo(Long.MAX_VALUE);
    }

    @Override // o0Oo.o0O00000
    public String o0oOo0O0(long j, Charset charset) throws IOException {
        o0O00O0o(j);
        if (charset != null) {
            return this.f15487o00oo0O0.o0oOo0O0(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // o0Oo.o0O00000
    public byte[] o0ooOoOO(long j) throws IOException {
        o0O00O0o(j);
        return this.f15487o00oo0O0.o0ooOoOO(j);
    }

    @Override // o0Oo.o0O00000
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // o0Oo.o0O00000
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = i2;
        o0O0OO0.o00oOOoO(bArr.length, i, j);
        o00ooO o00ooo = this.f15487o00oo0O0;
        if (o00ooo.f15434o00oo0O == 0 && this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f15487o00oo0O0.read(bArr, i, (int) Math.min(j, this.f15487o00oo0O0.f15434o00oo0O));
    }

    @Override // o0Oo.o0O00000
    public byte readByte() throws IOException {
        o0O00O0o(1L);
        return this.f15487o00oo0O0.readByte();
    }

    @Override // o0Oo.o0O00000
    public void readFully(byte[] bArr) throws IOException {
        try {
            o0O00O0o(bArr.length);
            this.f15487o00oo0O0.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                o00ooO o00ooo = this.f15487o00oo0O0;
                long j = o00ooo.f15434o00oo0O;
                if (j <= 0) {
                    throw e;
                }
                int read = o00ooo.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // o0Oo.o0O00000
    public int readInt() throws IOException {
        o0O00O0o(4L);
        return this.f15487o00oo0O0.readInt();
    }

    @Override // o0Oo.o0O00000
    public long readLong() throws IOException {
        o0O00O0o(8L);
        return this.f15487o00oo0O0.readLong();
    }

    @Override // o0Oo.o0O00000
    public short readShort() throws IOException {
        o0O00O0o(2L);
        return this.f15487o00oo0O0.readShort();
    }

    @Override // o0Oo.o0O00000
    public void skip(long j) throws IOException {
        if (this.f15488o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            o00ooO o00ooo = this.f15487o00oo0O0;
            if (o00ooo.f15434o00oo0O == 0 && this.f15486o00oo0O.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f15487o00oo0O0.f15434o00oo0O);
            this.f15487o00oo0O0.skip(min);
            j -= min;
        }
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("buffer(");
        o00oOOo02.append(this.f15486o00oo0O);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }
}
