package o0Oo;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedInts;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o00ooOoo.oO00O0oO;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes3.dex */
public final class o00ooO implements o0O00000, o0, Cloneable {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final byte[] f15432o00oo0Oo = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f15433o00oo0o0 = 65533;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public long f15434o00oo0O;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00oO0 f15435o00oo0O0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends OutputStream {
        public o00oOOo0() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return o00ooO.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            o00ooO.this.writeByte((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            o00ooO.this.write(bArr, i, i2);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends InputStream {
        public o00oOOoO() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(o00ooO.this.f15434o00oo0O, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            o00ooO o00ooo = o00ooO.this;
            if (o00ooo.f15434o00oo0O > 0) {
                return o00ooo.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return o00ooO.this.read(bArr, i, i2);
        }

        public String toString() {
            return o00ooO.this + ".inputStream()";
        }
    }

    @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00ooO) {
            o00ooO o00ooo = (o00ooO) obj;
            long j = this.f15434o00oo0O;
            if (j != o00ooo.f15434o00oo0O) {
                return false;
            }
            long j2 = 0;
            if (j == 0) {
                return true;
            }
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            o0O00oO0 o0o00oo02 = o00ooo.f15435o00oo0O0;
            int i = o0o00oo0.f15493o00oOOoO;
            int i2 = o0o00oo02.f15493o00oOOoO;
            while (j2 < this.f15434o00oo0O) {
                long min = Math.min(o0o00oo0.f15494o00oOo00 - i, o0o00oo02.f15494o00oOo00 - i2);
                int i3 = 0;
                while (i3 < min) {
                    int i4 = i + 1;
                    int i5 = i2 + 1;
                    if (o0o00oo0.f15492o00oOOo0[i] != o0o00oo02.f15492o00oOOo0[i2]) {
                        return false;
                    }
                    i3++;
                    i = i4;
                    i2 = i5;
                }
                if (i == o0o00oo0.f15494o00oOo00) {
                    o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                    i = o0o00oo0.f15493o00oOOoO;
                }
                if (i2 == o0o00oo02.f15494o00oOo00) {
                    o0o00oo02 = o0o00oo02.f15496o00oOo0o;
                    i2 = o0o00oo02.f15493o00oOOoO;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    @Override // o0Oo.o0, o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        if (o0o00oo0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o0o00oo0.f15494o00oOo00;
            for (int i3 = o0o00oo0.f15493o00oOOoO; i3 < i2; i3++) {
                i = (i * 31) + o0o00oo0.f15492o00oOOo0[i3];
            }
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        } while (o0o00oo0 != this.f15435o00oo0O0);
        return i;
    }

    public void o00oOOoO() {
        try {
            skip(this.f15434o00oo0O);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o0Oo.o0O00000, o0Oo.o0
    public o00ooO o00oOo00() {
        return this;
    }

    /* renamed from: o00oOo0o */
    public o00ooO clone() {
        o00ooO o00ooo = new o00ooO();
        if (this.f15434o00oo0O == 0) {
            return o00ooo;
        }
        o0O00oO0 o0o00oo0 = new o0O00oO0(this.f15435o00oo0O0);
        o00ooo.f15435o00oo0O0 = o0o00oo0;
        o0o00oo0.f15497o00oOoO0 = o0o00oo0;
        o0o00oo0.f15496o00oOo0o = o0o00oo0;
        o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
        while (true) {
            o0o00oo02 = o0o00oo02.f15496o00oOo0o;
            if (o0o00oo02 == this.f15435o00oo0O0) {
                o00ooo.f15434o00oo0O = this.f15434o00oo0O;
                return o00ooo;
            }
            o00ooo.f15435o00oo0O0.f15497o00oOoO0.o00oOo00(new o0O00oO0(o0o00oo02));
        }
    }

    public long o00oOoo0() {
        long j = this.f15434o00oo0O;
        if (j == 0) {
            return 0L;
        }
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0.f15497o00oOoO0;
        int i = o0o00oo0.f15494o00oOo00;
        return (i >= 8192 || !o0o00oo0.f15495o00oOo0O) ? j : j - (i - o0o00oo0.f15493o00oOOoO);
    }

    @Override // o0Oo.o0O0O0Oo
    public o0O0O0o0 o00oOooO() {
        return o0O0O0o0.f15502o00oOooO;
    }

    public o00ooO o00oOooo(OutputStream outputStream) throws IOException {
        return o00oo0(outputStream, 0L, this.f15434o00oo0O);
    }

    @Override // o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) {
        if (o00ooo == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (o00ooo == this) {
            throw new IllegalArgumentException("source == this");
        }
        o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
        while (j > 0) {
            o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
            if (j < o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO) {
                o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
                o0O00oO0 o0o00oo03 = o0o00oo02 != null ? o0o00oo02.f15497o00oOoO0 : null;
                if (o0o00oo03 != null && o0o00oo03.f15495o00oOo0O) {
                    if ((o0o00oo03.f15494o00oOo00 + j) - (o0o00oo03.f15498o00oOooO ? 0 : o0o00oo03.f15493o00oOOoO) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        o0o00oo0.o00oOo0O(o0o00oo03, (int) j);
                        o00ooo.f15434o00oo0O -= j;
                        this.f15434o00oo0O += j;
                        return;
                    }
                }
                o00ooo.f15435o00oo0O0 = o0o00oo0.o00oOooO((int) j);
            }
            o0O00oO0 o0o00oo04 = o00ooo.f15435o00oo0O0;
            long j2 = o0o00oo04.f15494o00oOo00 - o0o00oo04.f15493o00oOOoO;
            o00ooo.f15435o00oo0O0 = o0o00oo04.o00oOOoO();
            o0O00oO0 o0o00oo05 = this.f15435o00oo0O0;
            if (o0o00oo05 == null) {
                this.f15435o00oo0O0 = o0o00oo04;
                o0o00oo04.f15497o00oOoO0 = o0o00oo04;
                o0o00oo04.f15496o00oOo0o = o0o00oo04;
            } else {
                o0o00oo05.f15497o00oOoO0.o00oOo00(o0o00oo04).o00oOOo0();
            }
            o00ooo.f15434o00oo0O -= j2;
            this.f15434o00oo0O += j2;
            j -= j2;
        }
    }

    public o00ooO o00oo0(OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        if (outputStream != null) {
            o0O0OO0.o00oOOoO(this.f15434o00oo0O, j, j2);
            if (j2 == 0) {
                return this;
            }
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
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
                outputStream.write(o0o00oo0.f15492o00oOOo0, (int) (o0o00oo0.f15493o00oOOoO + j), min);
                j2 -= min;
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // o0Oo.o0
    public o0 o00oo0O() {
        return this;
    }

    @Override // o0Oo.o0O00000
    public void o00oo0o(o00ooO o00ooo, long j) throws EOFException {
        long j2 = this.f15434o00oo0O;
        if (j2 >= j) {
            o00ooo.o00oo(this, j);
        } else {
            o00ooo.o00oo(this, j2);
            throw new EOFException();
        }
    }

    public final o0O0000O o00ooO0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            if (o0o00oo0 != null) {
                byte[] bArr = o0o00oo0.f15492o00oOOo0;
                int i = o0o00oo0.f15493o00oOOoO;
                messageDigest.update(bArr, i, o0o00oo0.f15494o00oOo00 - i);
                o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
                while (true) {
                    o0o00oo02 = o0o00oo02.f15496o00oOo0o;
                    if (o0o00oo02 == this.f15435o00oo0O0) {
                        break;
                    }
                    byte[] bArr2 = o0o00oo02.f15492o00oOOo0;
                    int i2 = o0o00oo02.f15493o00oOOoO;
                    messageDigest.update(bArr2, i2, o0o00oo02.f15494o00oOo00 - i2);
                }
            }
            return o0O0000O.of(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public o00ooO o00ooO00(o00ooO o00ooo, long j, long j2) {
        if (o00ooo != null) {
            o0O0OO0.o00oOOoO(this.f15434o00oo0O, j, j2);
            if (j2 == 0) {
                return this;
            }
            o00ooo.f15434o00oo0O += j2;
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            while (true) {
                int i = o0o00oo0.f15494o00oOo00;
                int i2 = o0o00oo0.f15493o00oOOoO;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
            }
            while (j2 > 0) {
                o0O00oO0 o0o00oo02 = new o0O00oO0(o0o00oo0);
                int i3 = (int) (o0o00oo02.f15493o00oOOoO + j);
                o0o00oo02.f15493o00oOOoO = i3;
                o0o00oo02.f15494o00oOo00 = Math.min(i3 + ((int) j2), o0o00oo02.f15494o00oOo00);
                o0O00oO0 o0o00oo03 = o00ooo.f15435o00oo0O0;
                if (o0o00oo03 == null) {
                    o0o00oo02.f15497o00oOoO0 = o0o00oo02;
                    o0o00oo02.f15496o00oOo0o = o0o00oo02;
                    o00ooo.f15435o00oo0O0 = o0o00oo02;
                } else {
                    o0o00oo03.f15497o00oOoO0.o00oOo00(o0o00oo02);
                }
                j2 -= o0o00oo02.f15494o00oOo00 - o0o00oo02.f15493o00oOOoO;
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public o00ooO o00ooO0O() {
        return this;
    }

    public byte o00ooO0o(long j) {
        o0O0OO0.o00oOOoO(this.f15434o00oo0O, j, 1L);
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        while (true) {
            int i = o0o00oo0.f15494o00oOo00;
            int i2 = o0o00oo0.f15493o00oOOoO;
            long j2 = i - i2;
            if (j < j2) {
                return o0o00oo0.f15492o00oOOo0[i2 + ((int) j)];
            }
            j -= j2;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        }
    }

    @Override // o0Oo.o0O00000
    public long o00ooOO(byte b, long j) {
        return o00ooOOo(b, j, Long.MAX_VALUE);
    }

    @Override // o0Oo.o0O00000
    public long o00ooOO0(o0O0000O o0o0000o, long j) {
        int i;
        long j2 = 0;
        if (j >= 0) {
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            if (o0o00oo0 == null) {
                return -1L;
            }
            long j3 = this.f15434o00oo0O;
            if (j3 - j < j) {
                while (j3 > j) {
                    o0o00oo0 = o0o00oo0.f15497o00oOoO0;
                    j3 -= o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
                }
            } else {
                while (true) {
                    long j4 = (o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (o0o0000o.size() == 2) {
                byte b = o0o0000o.getByte(0);
                byte b2 = o0o0000o.getByte(1);
                while (j3 < this.f15434o00oo0O) {
                    byte[] bArr = o0o00oo0.f15492o00oOOo0;
                    i = (int) ((o0o00oo0.f15493o00oOOoO + j) - j3);
                    int i2 = o0o00oo0.f15494o00oOo00;
                    while (i < i2) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        return (i - o0o00oo0.f15493o00oOOoO) + j3;
                    }
                    j3 += o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
                    o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                    j = j3;
                }
                return -1L;
            }
            byte[] internalArray = o0o0000o.internalArray();
            while (j3 < this.f15434o00oo0O) {
                byte[] bArr2 = o0o00oo0.f15492o00oOOo0;
                i = (int) ((o0o00oo0.f15493o00oOOoO + j) - j3);
                int i3 = o0o00oo0.f15494o00oOo00;
                while (i < i3) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray) {
                        if (b4 == b5) {
                            return (i - o0o00oo0.f15493o00oOOoO) + j3;
                        }
                    }
                    i++;
                }
                j3 += o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // o0Oo.o0O00000
    public long o00ooOOo(byte b, long j, long j2) {
        o0O00oO0 o0o00oo0;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f15434o00oo0O), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f15434o00oo0O;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (o0o00oo0 = this.f15435o00oo0O0) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                o0o00oo0 = o0o00oo0.f15497o00oOoO0;
                j4 -= o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
            }
        } else {
            while (true) {
                long j6 = (o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO) + j3;
                if (j6 >= j) {
                    break;
                }
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = o0o00oo0.f15492o00oOOo0;
            int min = (int) Math.min(o0o00oo0.f15494o00oOo00, (o0o00oo0.f15493o00oOOoO + j5) - j4);
            for (int i = (int) ((o0o00oo0.f15493o00oOOoO + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - o0o00oo0.f15493o00oOOoO) + j4;
                }
            }
            j4 += o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
            j7 = j4;
        }
        return -1L;
    }

    @Override // o0Oo.o0
    public o0 o00ooOo() throws IOException {
        return this;
    }

    @Override // o0Oo.o0O00000
    @Nullable
    public String o00ooOo0() throws EOFException {
        long o0O00OOO2 = o0O00OOO((byte) 10);
        if (o0O00OOO2 == -1) {
            long j = this.f15434o00oo0O;
            if (j != 0) {
                return o0O00Oo(j);
            }
            return null;
        }
        return o0ooO(o0O00OOO2);
    }

    public final o0O0000O o00ooOoO(String str, o0O0000O o0o0000o) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(o0o0000o.toByteArray(), str));
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            if (o0o00oo0 != null) {
                byte[] bArr = o0o00oo0.f15492o00oOOo0;
                int i = o0o00oo0.f15493o00oOOoO;
                mac.update(bArr, i, o0o00oo0.f15494o00oOo00 - i);
                o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
                while (true) {
                    o0o00oo02 = o0o00oo02.f15496o00oOo0o;
                    if (o0o00oo02 == this.f15435o00oo0O0) {
                        break;
                    }
                    byte[] bArr2 = o0o00oo02.f15492o00oOOo0;
                    int i2 = o0o00oo02.f15493o00oOOoO;
                    mac.update(bArr2, i2, o0o00oo02.f15494o00oOo00 - i2);
                }
            }
            return o0O0000O.of(mac.doFinal());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // o0Oo.o0O00000
    public String o00ooOoo(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long o00ooOOo2 = o00ooOOo((byte) 10, 0L, j2);
            if (o00ooOOo2 != -1) {
                return o0ooO(o00ooOOo2);
            }
            if (j2 < this.f15434o00oo0O && o00ooO0o(j2 - 1) == 13 && o00ooO0o(j2) == 10) {
                return o0ooO(j2);
            }
            o00ooO o00ooo = new o00ooO();
            o00ooO00(o00ooo, 0L, Math.min(32L, this.f15434o00oo0O));
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("\\n not found: limit=");
            o00oOOo02.append(Math.min(this.f15434o00oo0O, j));
            o00oOOo02.append(" content=");
            o00oOOo02.append(o00ooo.o0O0Ooo().hex());
            o00oOOo02.append(oOo0oooO.f13933o00ooOo0);
            throw new EOFException(o00oOOo02.toString());
        }
        throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("limit < 0: ", j));
    }

    @Override // o0Oo.o0O00000
    public int o00ooo0(o0O00OO o0o00oo) {
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        if (o0o00oo0 == null) {
            return o0o00oo.indexOf(o0O0000O.EMPTY);
        }
        o0O0000O[] o0o0000oArr = o0o00oo.f15475o00oo0O0;
        int length = o0o0000oArr.length;
        for (int i = 0; i < length; i++) {
            o0O0000O o0o0000o = o0o0000oArr[i];
            if (this.f15434o00oo0O >= o0o0000o.size() && o0O000oo(o0o00oo0, o0o00oo0.f15493o00oOOoO, o0o0000o, 0, o0o0000o.size())) {
                try {
                    skip(o0o0000o.size());
                    return i;
                } catch (EOFException e) {
                    throw new AssertionError(e);
                }
            }
        }
        return -1;
    }

    public o0O0000O o00oooOo(o0O0000O o0o0000o) {
        return o00ooOoO("HmacSHA1", o0o0000o);
    }

    @Override // o0Oo.o0
    /* renamed from: o0O */
    public o00ooO o0O0OooO(String str, Charset charset) {
        return o0OoO00O(str, 0, str.length(), charset);
    }

    @Override // o0Oo.o0O00000
    public short o0O00() {
        return o0O0OO0.o00oOo0O(readShort());
    }

    public o0O0000O o0O000(o0O0000O o0o0000o) {
        return o00ooOoO("HmacSHA256", o0o0000o);
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0000o(long j) {
        return this.f15434o00oo0O >= j;
    }

    public o0O0000O o0O000O(o0O0000O o0o0000o) {
        return o00ooOoO("HmacSHA512", o0o0000o);
    }

    public o0O0000O o0O000o0() {
        return o00ooO0("MD5");
    }

    public final boolean o0O000oo(o0O00oO0 o0o00oo0, int i, o0O0000O o0o0000o, int i2, int i3) {
        int i4 = o0o00oo0.f15494o00oOo00;
        byte[] bArr = o0o00oo0.f15492o00oOOo0;
        while (i2 < i3) {
            if (i == i4) {
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                byte[] bArr2 = o0o00oo0.f15492o00oOOo0;
                bArr = bArr2;
                i = o0o00oo0.f15493o00oOOoO;
                i4 = o0o00oo0.f15494o00oOo00;
            }
            if (bArr[i] != o0o0000o.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // o0Oo.o0O00000
    public long o0O00O0() {
        return o0O0OO0.o00oOooO(readLong());
    }

    @Override // o0Oo.o0O00000
    public void o0O00O0o(long j) throws EOFException {
        if (this.f15434o00oo0O < j) {
            throw new EOFException();
        }
    }

    @Override // o0Oo.o0O00000
    public long o0O00OOO(byte b) {
        return o00ooOOo(b, 0L, Long.MAX_VALUE);
    }

    @Override // o0Oo.o0O00000
    public String o0O00Oo(long j) throws EOFException {
        return o0oOo0O0(j, o0O0OO0.f15506o00oOOo0);
    }

    @Override // o0Oo.o0O00000
    public boolean o0O00Ooo(long j, o0O0000O o0o0000o, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f15434o00oo0O - j < i2 || o0o0000o.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (o00ooO0o(i3 + j) != o0o0000o.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // o0Oo.o0O00000
    public o0O0000O o0O00o(long j) throws EOFException {
        return new o0O0000O(o0ooOoOO(j));
    }

    public final void o0O0O0Oo(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            o0O00oO0 o0O0oOO02 = o0O0oOO0(1);
            int read = inputStream.read(o0O0oOO02.f15492o00oOOo0, o0O0oOO02.f15494o00oOo00, (int) Math.min(j, 8192 - o0O0oOO02.f15494o00oOo00));
            if (read == -1) {
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            o0O0oOO02.f15494o00oOo00 += read;
            long j2 = read;
            this.f15434o00oo0O += j2;
            j -= j2;
        }
    }

    @Override // o0Oo.o0O00000
    public byte[] o0O0O0o0() {
        try {
            return o0ooOoOO(this.f15434o00oo0O);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0O0oO() {
        return this.f15434o00oo0O == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        r0 = new o0Oo.o00ooO().o0O0oOoo(r2).o0O0oOoO(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        r2 = android.support.v4.media.o00oOo0O.o00oOOo0("Number too large: ");
        r2.append(r0.o0O0o0o0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        r15.f15434o00oo0O -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
        return -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    @Override // o0Oo.o0O00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o0O0OO() {
        /*
            r15 = this;
            long r0 = r15.f15434o00oo0O
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lba
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r4 = -7
            r6 = 0
            r7 = r6
            r8 = r7
        L12:
            o0Oo.o0O00oO0 r9 = r15.f15435o00oo0O0
            byte[] r10 = r9.f15492o00oOOo0
            int r11 = r9.f15493o00oOOoO
            int r12 = r9.f15494o00oOo00
        L1a:
            if (r11 >= r12) goto L93
            r13 = r10[r11]
            r14 = 48
            if (r13 < r14) goto L63
            r14 = 57
            if (r13 > r14) goto L63
            int r14 = 48 - r13
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L3a
            if (r0 != 0) goto L34
            long r0 = (long) r14
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L34
            goto L3a
        L34:
            r0 = 10
            long r2 = r2 * r0
            long r0 = (long) r14
            long r2 = r2 + r0
            goto L6d
        L3a:
            o0Oo.o00ooO r0 = new o0Oo.o00ooO
            r0.<init>()
            o0Oo.o00ooO r0 = r0.o0O00O(r2)
            o0Oo.o00ooO r0 = r0.writeByte(r13)
            if (r7 != 0) goto L4c
            r0.readByte()
        L4c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.v4.media.o00oOo0O.o00oOOo0(r2)
            java.lang.String r0 = r0.o0O0o0o0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L63:
            r0 = 45
            if (r13 != r0) goto L77
            if (r6 != 0) goto L77
            r0 = 1
            long r4 = r4 - r0
            r7 = 1
        L6d:
            int r11 = r11 + 1
            int r6 = r6 + 1
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1a
        L77:
            if (r6 == 0) goto L7c
            r0 = 1
            r8 = r0
            goto L93
        L7c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.o00oOo0O.o00oOOo0(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r11 != r12) goto L9f
            o0Oo.o0O00oO0 r0 = r9.o00oOOoO()
            r15.f15435o00oo0O0 = r0
            o0Oo.o0O0O0O.o00oOOo0(r9)
            goto La1
        L9f:
            r9.f15493o00oOOoO = r11
        La1:
            if (r8 != 0) goto Laf
            o0Oo.o0O00oO0 r0 = r15.f15435o00oo0O0
            if (r0 != 0) goto La8
            goto Laf
        La8:
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L12
        Laf:
            long r0 = r15.f15434o00oo0O
            long r4 = (long) r6
            long r0 = r0 - r4
            r15.f15434o00oo0O = r0
            if (r7 == 0) goto Lb8
            goto Lb9
        Lb8:
            long r2 = -r2
        Lb9:
            return r2
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo.o00ooO.o0O0OO():long");
    }

    public List<Integer> o0O0OO0() {
        if (this.f15435o00oo0O0 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        arrayList.add(Integer.valueOf(o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO));
        o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
        while (true) {
            o0o00oo02 = o0o00oo02.f15496o00oOo0o;
            if (o0o00oo02 == this.f15435o00oo0O0) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(o0o00oo02.f15494o00oOo00 - o0o00oo02.f15493o00oOOoO));
        }
    }

    public int o0O0Oo(o0O00OO o0o00oo) {
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        o0O0000O[] o0o0000oArr = o0o00oo.f15475o00oo0O0;
        int length = o0o0000oArr.length;
        for (int i = 0; i < length; i++) {
            o0O0000O o0o0000o = o0o0000oArr[i];
            int min = (int) Math.min(this.f15434o00oo0O, o0o0000o.size());
            if (min == 0 || o0O000oo(o0o00oo0, o0o00oo0.f15493o00oOOoO, o0o0000o, 0, min)) {
                return i;
            }
        }
        return -1;
    }

    @Override // o0Oo.o0O00000
    public long o0O0Oo0(o0O0oo0o o0o0oo0o) throws IOException {
        long j = this.f15434o00oo0O;
        if (j > 0) {
            o0o0oo0o.o00oo(this, j);
        }
        return j;
    }

    @Override // o0Oo.o0O00000
    public long o0O0OoO(o0O0000O o0o0000o) throws IOException {
        return o0OoOoOO(o0o0000o, 0L);
    }

    @Override // o0Oo.o0O00000
    public String o0O0OoO0(Charset charset) {
        try {
            return o0oOo0O0(this.f15434o00oo0O, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o0Oo.o0O00000
    public int o0O0OoOo() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f15434o00oo0O != 0) {
            byte o00ooO0o2 = o00ooO0o(0L);
            if ((o00ooO0o2 & 128) == 0) {
                i = o00ooO0o2 & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((o00ooO0o2 & 224) == 192) {
                i = o00ooO0o2 & Ascii.US;
                i2 = 2;
                i3 = 128;
            } else if ((o00ooO0o2 & 240) == 224) {
                i = o00ooO0o2 & Ascii.SI;
                i2 = 3;
                i3 = 2048;
            } else if ((o00ooO0o2 & 248) != 240) {
                skip(1L);
                return f15433o00oo0o0;
            } else {
                i = o00ooO0o2 & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (this.f15434o00oo0O < j) {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("size < ", i2, ": ");
                o00oOOo02.append(this.f15434o00oo0O);
                o00oOOo02.append(" (to read code point prefixed 0x");
                o00oOOo02.append(Integer.toHexString(o00ooO0o2));
                o00oOOo02.append(")");
                throw new EOFException(o00oOOo02.toString());
            }
            for (int i4 = 1; i4 < i2; i4++) {
                long j2 = i4;
                byte o00ooO0o3 = o00ooO0o(j2);
                if ((o00ooO0o3 & 192) != 128) {
                    skip(j2);
                    return f15433o00oo0o0;
                }
                i = (i << 6) | (o00ooO0o3 & 63);
            }
            skip(j);
            return i > 1114111 ? f15433o00oo0o0 : ((i < 55296 || i > 57343) && i >= i3) ? i : f15433o00oo0o0;
        }
        throw new EOFException();
    }

    @Override // o0Oo.o0O00000
    public o0O0000O o0O0Ooo() {
        return new o0O0000O(o0O0O0o0());
    }

    public o0O0000O o0O0Oooo() {
        return o00ooO0("SHA-1");
    }

    @Override // o0Oo.o0O00000
    public int o0O0o0() {
        return o0O0OO0.o00oOo00(readInt());
    }

    @Override // o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) {
        if (o00ooo != null) {
            if (j >= 0) {
                long j2 = this.f15434o00oo0O;
                if (j2 == 0) {
                    return -1L;
                }
                if (j > j2) {
                    j = j2;
                }
                o00ooo.o00oo(this, j);
                return j;
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // o0Oo.o0O00000
    public boolean o0O0o00O(long j, o0O0000O o0o0000o) {
        return o0O00Ooo(j, o0o0000o, 0, o0o0000o.size());
    }

    public o0O0000O o0O0o00o() {
        return o00ooO0("SHA-256");
    }

    public o0O0000O o0O0o0O() {
        return o00ooO0("SHA-512");
    }

    @Override // o0Oo.o0
    public long o0O0o0o(o0O0O0Oo o0o0o0oo) throws IOException {
        if (o0o0o0oo == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long o0O0o0002 = o0o0o0oo.o0O0o000(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (o0O0o0002 == -1) {
                return j;
            }
            j += o0O0o0002;
        }
    }

    @Override // o0Oo.o0O00000
    public String o0O0o0o0() {
        try {
            return o0oOo0O0(this.f15434o00oo0O, o0O0OO0.f15506o00oOOo0);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public o0O0000O o0O0o0oO() {
        long j = this.f15434o00oo0O;
        if (j <= 2147483647L) {
            return o0O0oO0((int) j);
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("size > Integer.MAX_VALUE: ");
        o00oOOo02.append(this.f15434o00oo0O);
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @Override // o0Oo.o0
    public o0 o0O0o0oo(o0O0O0Oo o0o0o0oo, long j) throws IOException {
        while (j > 0) {
            long o0O0o0002 = o0o0o0oo.o0O0o000(this, j);
            if (o0O0o0002 == -1) {
                throw new EOFException();
            }
            j -= o0O0o0002;
        }
        return this;
    }

    public o0O0000O o0O0oO0(int i) {
        return i == 0 ? o0O0000O.EMPTY : new o0oO0O0o(this, i);
    }

    @Override // o0Oo.o0O00000
    public long o0O0oO0o(o0O0000O o0o0000o) {
        return o00ooOO0(o0o0000o, 0L);
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oOO */
    public o00ooO o0O0OO0O(o0O0000O o0o0000o) {
        if (o0o0000o != null) {
            o0o0000o.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public o0O00oO0 o0O0oOO0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        if (o0o00oo0 != null) {
            o0O00oO0 o0o00oo02 = o0o00oo0.f15497o00oOoO0;
            return (o0o00oo02.f15494o00oOo00 + i > 8192 || !o0o00oo02.f15495o00oOo0O) ? o0o00oo02.o00oOo00(o0O0O0O.o00oOOoO()) : o0o00oo02;
        }
        o0O00oO0 o00oOOoO2 = o0O0O0O.o00oOOoO();
        this.f15435o00oo0O0 = o00oOOoO2;
        o00oOOoO2.f15497o00oOoO0 = o00oOOoO2;
        o00oOOoO2.f15496o00oOo0o = o00oOOoO2;
        return o00oOOoO2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[EDGE_INSN: B:42:0x009c->B:38:0x009c ?: BREAK  , SYNTHETIC] */
    @Override // o0Oo.o0O00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o0O0oOOO() {
        /*
            r14 = this;
            long r0 = r14.f15434o00oo0O
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La3
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            o0Oo.o0O00oO0 r6 = r14.f15435o00oo0O0
            byte[] r7 = r6.f15492o00oOOo0
            int r8 = r6.f15493o00oOOoO
            int r9 = r6.f15494o00oOo00
        L13:
            if (r8 >= r9) goto L88
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6d
            r11 = 70
            if (r10 > r11) goto L6d
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            o0Oo.o00ooO r0 = new o0Oo.o00ooO
            r0.<init>()
            o0Oo.o00ooO r0 = r0.o0O0Ooo0(r4)
            o0Oo.o00ooO r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.v4.media.o00oOo0O.o00oOOo0(r2)
            java.lang.String r0 = r0.o0O0o0o0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6d:
            if (r0 == 0) goto L71
            r1 = 1
            goto L88
        L71:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.o00oOo0O.o00oOOo0(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L88:
            if (r8 != r9) goto L94
            o0Oo.o0O00oO0 r7 = r6.o00oOOoO()
            r14.f15435o00oo0O0 = r7
            o0Oo.o0O0O0O.o00oOOo0(r6)
            goto L96
        L94:
            r6.f15493o00oOOoO = r8
        L96:
            if (r1 != 0) goto L9c
            o0Oo.o0O00oO0 r6 = r14.f15435o00oo0O0
            if (r6 != 0) goto Lb
        L9c:
            long r1 = r14.f15434o00oo0O
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f15434o00oo0O = r1
            return r4
        La3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo.o00ooO.o0O0oOOO():long");
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oOo */
    public o00ooO write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            o0O0OO0.o00oOOoO(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                o0O00oO0 o0O0oOO02 = o0O0oOO0(1);
                int min = Math.min(i3 - i, 8192 - o0O0oOO02.f15494o00oOo00);
                System.arraycopy(bArr, i, o0O0oOO02.f15492o00oOOo0, o0O0oOO02.f15494o00oOo00, min);
                i += min;
                o0O0oOO02.f15494o00oOo00 += min;
            }
            this.f15434o00oo0O += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // o0Oo.o0O00000
    public InputStream o0O0oOo0() {
        return new o00oOOoO();
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oOoO */
    public o00ooO writeByte(int i) {
        o0O00oO0 o0O0oOO02 = o0O0oOO0(1);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i2 = o0O0oOO02.f15494o00oOo00;
        o0O0oOO02.f15494o00oOo00 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f15434o00oo0O++;
        return this;
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oOoo */
    public o00ooO o0O00O(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return o00oooo0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j < 10000000000L ? j < C.NANOS_PER_SECOND ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < IndexSeeker.MIN_TIME_BETWEEN_POINTS_US ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        o0O00oO0 o0O0oOO02 = o0O0oOO0(i2);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i3 = o0O0oOO02.f15494o00oOo00 + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f15432o00oo0Oo[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        o0O0oOO02.f15494o00oOo00 += i2;
        this.f15434o00oo0O += i2;
        return this;
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oo */
    public o00ooO writeInt(int i) {
        o0O00oO0 o0O0oOO02 = o0O0oOO0(4);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i2 = o0O0oOO02.f15494o00oOo00;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        o0O0oOO02.f15494o00oOo00 = i5 + 1;
        this.f15434o00oo0O += 4;
        return this;
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oo0 */
    public o00ooO o0O0Ooo0(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o0O00oO0 o0O0oOO02 = o0O0oOO0(numberOfTrailingZeros);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i = o0O0oOO02.f15494o00oOo00;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f15432o00oo0Oo[(int) (15 & j)];
            j >>>= 4;
        }
        o0O0oOO02.f15494o00oOo00 += numberOfTrailingZeros;
        this.f15434o00oo0O += numberOfTrailingZeros;
        return this;
    }

    @Override // o0Oo.o0
    public OutputStream o0O0oo00() {
        return new o00oOOo0();
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0ooO0 */
    public o00ooO o0O0O0o(int i) {
        return writeInt(o0O0OO0.o00oOo00(i));
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0ooOO */
    public o00ooO writeLong(long j) {
        o0O00oO0 o0O0oOO02 = o0O0oOO0(8);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i = o0O0oOO02.f15494o00oOo00;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        o0O0oOO02.f15494o00oOo00 = i8 + 1;
        this.f15434o00oo0O += 8;
        return this;
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0ooo */
    public o00ooO writeShort(int i) {
        o0O00oO0 o0O0oOO02 = o0O0oOO0(2);
        byte[] bArr = o0O0oOO02.f15492o00oOOo0;
        int i2 = o0O0oOO02.f15494o00oOo00;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        o0O0oOO02.f15494o00oOo00 = i3 + 1;
        this.f15434o00oo0O += 2;
        return this;
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0ooo0 */
    public o00ooO o0O0o(long j) {
        return writeLong(o0O0OO0.o00oOooO(j));
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oooO */
    public o00ooO o0O0OOoo(int i) {
        return writeShort(o0O0OO0.o00oOo0O((short) i));
    }

    @Override // o0Oo.o0
    /* renamed from: o0O0oooo */
    public o00ooO o0OoO00O(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > str.length()) {
                        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("endIndex > string.length: ", i2, " > ");
                        o00oOOo02.append(str.length());
                        throw new IllegalArgumentException(o00oOOo02.toString());
                    } else if (charset != null) {
                        if (charset.equals(o0O0OO0.f15506o00oOOo0)) {
                            return o0O00000(str, i, i2);
                        }
                        byte[] bytes = str.substring(i, i2).getBytes(charset);
                        return write(bytes, 0, bytes.length);
                    } else {
                        throw new IllegalArgumentException("charset == null");
                    }
                }
                throw new IllegalArgumentException(o0O00Oo.o0oO0Ooo.o00oOOo0("endIndex < beginIndex: ", i2, " < ", i));
            }
            throw new IllegalAccessError(android.support.v4.media.o00oOOo0.o00oOOo0("beginIndex < 0: ", i));
        }
        throw new IllegalArgumentException("string == null");
    }

    public o00ooO o0OO000(OutputStream outputStream) throws IOException {
        return o0OO000o(outputStream, this.f15434o00oo0O);
    }

    public o00ooO o0OO000o(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            o0O0OO0.o00oOOoO(this.f15434o00oo0O, 0L, j);
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            while (j > 0) {
                int min = (int) Math.min(j, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
                outputStream.write(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
                int i = o0o00oo0.f15493o00oOOoO + min;
                o0o00oo0.f15493o00oOOoO = i;
                long j2 = min;
                this.f15434o00oo0O -= j2;
                j -= j2;
                if (i == o0o00oo0.f15494o00oOo00) {
                    o0O00oO0 o00oOOoO2 = o0o00oo0.o00oOOoO();
                    this.f15435o00oo0O0 = o00oOOoO2;
                    o0O0O0O.o00oOOo0(o0o00oo0);
                    o0o00oo0 = o00oOOoO2;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // o0Oo.o0
    /* renamed from: o0OO00OO */
    public o00ooO o00oo0o0(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | PsExtractor.AUDIO_STREAM;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        writeByte(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i > 1114111) {
                    StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Unexpected code point: ");
                    o00oOOo02.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(o00oOOo02.toString());
                } else {
                    writeByte((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    i2 = ((i >> 12) & 63) | 128;
                }
                writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            writeByte(i3);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    @Override // o0Oo.o0O00000
    public long o0OoOoOO(o0O0000O o0o0000o, long j) throws IOException {
        byte[] bArr;
        if (o0o0000o.size() != 0) {
            long j2 = 0;
            if (j >= 0) {
                o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
                long j3 = -1;
                if (o0o00oo0 == null) {
                    return -1L;
                }
                long j4 = this.f15434o00oo0O;
                if (j4 - j < j) {
                    while (j4 > j) {
                        o0o00oo0 = o0o00oo0.f15497o00oOoO0;
                        j4 -= o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
                    }
                } else {
                    while (true) {
                        long j5 = (o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte b = o0o0000o.getByte(0);
                int size = o0o0000o.size();
                long j6 = 1 + (this.f15434o00oo0O - size);
                long j7 = j;
                o0O00oO0 o0o00oo02 = o0o00oo0;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = o0o00oo02.f15492o00oOOo0;
                    int min = (int) Math.min(o0o00oo02.f15494o00oOo00, (o0o00oo02.f15493o00oOOoO + j6) - j8);
                    int i = (int) ((o0o00oo02.f15493o00oOOoO + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == b) {
                            bArr = bArr2;
                            if (o0O000oo(o0o00oo02, i + 1, o0o0000o, 1, size)) {
                                return (i - o0o00oo02.f15493o00oOOoO) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += o0o00oo02.f15494o00oOo00 - o0o00oo02.f15493o00oOOoO;
                    o0o00oo02 = o0o00oo02.f15496o00oOo0o;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // o0Oo.o0O00000
    public String o0OoOoOo() throws EOFException {
        return o00ooOoo(Long.MAX_VALUE);
    }

    public o00ooO o0oO0O0o(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            o0O0O0Oo(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
    }

    public o00ooO o0oO0Ooo(InputStream inputStream) throws IOException {
        o0O0O0Oo(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // o0Oo.o0O00000
    public String o0oOo0O0(long j, Charset charset) throws EOFException {
        o0O0OO0.o00oOOoO(this.f15434o00oo0O, 0L, j);
        if (charset != null) {
            if (j <= 2147483647L) {
                if (j == 0) {
                    return "";
                }
                o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
                int i = o0o00oo0.f15493o00oOOoO;
                if (i + j > o0o00oo0.f15494o00oOo00) {
                    return new String(o0ooOoOO(j), charset);
                }
                String str = new String(o0o00oo0.f15492o00oOOo0, i, (int) j, charset);
                int i2 = (int) (o0o00oo0.f15493o00oOOoO + j);
                o0o00oo0.f15493o00oOOoO = i2;
                this.f15434o00oo0O -= j;
                if (i2 == o0o00oo0.f15494o00oOo00) {
                    this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
                    o0O0O0O.o00oOOo0(o0o00oo0);
                }
                return str;
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount > Integer.MAX_VALUE: ", j));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String o0ooO(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (o00ooO0o(j2) == 13) {
                String o0O00Oo2 = o0O00Oo(j2);
                skip(2L);
                return o0O00Oo2;
            }
        }
        String o0O00Oo3 = o0O00Oo(j);
        skip(1L);
        return o0O00Oo3;
    }

    @Override // o0Oo.o0O00000
    public byte[] o0ooOoOO(long j) throws EOFException {
        o0O0OO0.o00oOOoO(this.f15434o00oo0O, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount > Integer.MAX_VALUE: ", j));
    }

    @Override // o0Oo.o0
    /* renamed from: oo0oO0 */
    public o00ooO o00oooo0(String str) {
        return o0O00000(str, 0, str.length());
    }

    @Override // o0Oo.o0
    /* renamed from: oo0oOOo */
    public o00ooO write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // o0Oo.o0
    /* renamed from: oo0ooO */
    public o00ooO o0O00000(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > str.length()) {
                        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("endIndex > string.length: ", i2, " > ");
                        o00oOOo02.append(str.length());
                        throw new IllegalArgumentException(o00oOOo02.toString());
                    }
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            o0O00oO0 o0O0oOO02 = o0O0oOO0(1);
                            byte[] bArr = o0O0oOO02.f15492o00oOOo0;
                            int i4 = o0O0oOO02.f15494o00oOo00 - i;
                            int min = Math.min(i2, 8192 - i4);
                            int i5 = i + 1;
                            bArr[i + i4] = (byte) charAt2;
                            while (true) {
                                i = i5;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i5 = i + 1;
                                bArr[i + i4] = (byte) charAt;
                            }
                            int i6 = o0O0oOO02.f15494o00oOo00;
                            int i7 = (i4 + i) - i6;
                            o0O0oOO02.f15494o00oOo00 = i6 + i7;
                            this.f15434o00oo0O += i7;
                        } else {
                            if (charAt2 < 2048) {
                                i3 = (charAt2 >> 6) | PsExtractor.AUDIO_STREAM;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                writeByte((charAt2 >> '\f') | 224);
                                i3 = ((charAt2 >> 6) & 63) | 128;
                            } else {
                                int i8 = i + 1;
                                char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                                if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                    writeByte(63);
                                    i = i8;
                                } else {
                                    int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                    writeByte((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    writeByte(((i9 >> 12) & 63) | 128);
                                    writeByte(((i9 >> 6) & 63) | 128);
                                    writeByte((i9 & 63) | 128);
                                    i += 2;
                                }
                            }
                            writeByte(i3);
                            writeByte((charAt2 & '?') | 128);
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(o0O00Oo.o0oO0Ooo.o00oOOo0("endIndex < beginIndex: ", i2, " < ", i));
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("beginIndex < 0: ", i));
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // o0Oo.o0O00000
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // o0Oo.o0O00000
    public int read(byte[] bArr, int i, int i2) {
        o0O0OO0.o00oOOoO(bArr.length, i, i2);
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        if (o0o00oo0 == null) {
            return -1;
        }
        int min = Math.min(i2, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
        System.arraycopy(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, bArr, i, min);
        int i3 = o0o00oo0.f15493o00oOOoO + min;
        o0o00oo0.f15493o00oOOoO = i3;
        this.f15434o00oo0O -= min;
        if (i3 == o0o00oo0.f15494o00oOo00) {
            this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
            o0O0O0O.o00oOOo0(o0o00oo0);
        }
        return min;
    }

    @Override // o0Oo.o0O00000
    public byte readByte() {
        long j = this.f15434o00oo0O;
        if (j != 0) {
            o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
            int i = o0o00oo0.f15493o00oOOoO;
            int i2 = o0o00oo0.f15494o00oOo00;
            int i3 = i + 1;
            byte b = o0o00oo0.f15492o00oOOo0[i];
            this.f15434o00oo0O = j - 1;
            if (i3 == i2) {
                this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
                o0O0O0O.o00oOOo0(o0o00oo0);
            } else {
                o0o00oo0.f15493o00oOOoO = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // o0Oo.o0O00000
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // o0Oo.o0O00000
    public int readInt() {
        long j = this.f15434o00oo0O;
        if (j < 4) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("size < 4: ");
            o00oOOo02.append(this.f15434o00oo0O);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        int i = o0o00oo0.f15493o00oOOoO;
        int i2 = o0o00oo0.f15494o00oOo00;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = o0o00oo0.f15492o00oOOo0;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f15434o00oo0O = j - 4;
        if (i8 == i2) {
            this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
            o0O0O0O.o00oOOo0(o0o00oo0);
        } else {
            o0o00oo0.f15493o00oOOoO = i8;
        }
        return i9;
    }

    @Override // o0Oo.o0O00000
    public long readLong() {
        long j = this.f15434o00oo0O;
        if (j < 8) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("size < 8: ");
            o00oOOo02.append(this.f15434o00oo0O);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        int i = o0o00oo0.f15493o00oOOoO;
        int i2 = o0o00oo0.f15494o00oOo00;
        if (i2 - i < 8) {
            return ((readInt() & UnsignedInts.INT_MASK) << 32) | (UnsignedInts.INT_MASK & readInt());
        }
        byte[] bArr = o0o00oo0.f15492o00oOOo0;
        int i3 = i + 1;
        int i4 = i3 + 1;
        long j2 = (bArr[i3] & 255) << 48;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        int i10 = i9 + 1;
        long j3 = (bArr[i9] & 255) | j2 | ((bArr[i] & 255) << 56) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8);
        this.f15434o00oo0O = j - 8;
        if (i10 == i2) {
            this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
            o0O0O0O.o00oOOo0(o0o00oo0);
        } else {
            o0o00oo0.f15493o00oOOoO = i10;
        }
        return j3;
    }

    @Override // o0Oo.o0O00000
    public short readShort() {
        long j = this.f15434o00oo0O;
        if (j < 2) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("size < 2: ");
            o00oOOo02.append(this.f15434o00oo0O);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        o0O00oO0 o0o00oo0 = this.f15435o00oo0O0;
        int i = o0o00oo0.f15493o00oOOoO;
        int i2 = o0o00oo0.f15494o00oOo00;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = o0o00oo0.f15492o00oOOo0;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f15434o00oo0O = j - 2;
        if (i4 == i2) {
            this.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
            o0O0O0O.o00oOOo0(o0o00oo0);
        } else {
            o0o00oo0.f15493o00oOOoO = i4;
        }
        return (short) i5;
    }

    public long size() {
        return this.f15434o00oo0O;
    }

    @Override // o0Oo.o0O00000
    public void skip(long j) throws EOFException {
        o0O00oO0 o0o00oo0;
        while (j > 0) {
            if (this.f15435o00oo0O0 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
            long j2 = min;
            this.f15434o00oo0O -= j2;
            j -= j2;
            o0O00oO0 o0o00oo02 = this.f15435o00oo0O0;
            int i = o0o00oo02.f15493o00oOOoO + min;
            o0o00oo02.f15493o00oOOoO = i;
            if (i == o0o00oo02.f15494o00oOo00) {
                this.f15435o00oo0O0 = o0o00oo02.o00oOOoO();
                o0O0O0O.o00oOOo0(o0o00oo02);
            }
        }
    }

    public String toString() {
        return o0O0o0oO().toString();
    }
}
