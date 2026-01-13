package o0Oo;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class o0oO0O0o extends o0O0000O {
    public final transient int[] directory;
    public final transient byte[][] segments;

    public o0oO0O0o(o00ooO o00ooo, int i) {
        super(null);
        o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, i);
        o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = o0o00oo0.f15494o00oOo00;
            int i6 = o0o00oo0.f15493o00oOOoO;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        }
        this.segments = new byte[i4];
        this.directory = new int[i4 * 2];
        o0O00oO0 o0o00oo02 = o00ooo.f15435o00oo0O0;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.segments;
            bArr[i7] = o0o00oo02.f15492o00oOOo0;
            int i8 = o0o00oo02.f15494o00oOo00;
            int i9 = o0o00oo02.f15493o00oOOoO;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.directory;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            o0o00oo02.f15498o00oOooO = true;
            i7++;
            o0o00oo02 = o0o00oo02.f15496o00oOo0o;
        }
    }

    private int segment(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private o0O0000O toByteString() {
        return new o0O0000O(toByteArray());
    }

    private Object writeReplace() {
        return toByteString();
    }

    @Override // o0Oo.o0O0000O
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // o0Oo.o0O0000O
    public String base64() {
        return toByteString().base64();
    }

    @Override // o0Oo.o0O0000O
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // o0Oo.o0O0000O
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0000O) {
            o0O0000O o0o0000o = (o0O0000O) obj;
            if (o0o0000o.size() == size() && rangeEquals(0, o0o0000o, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // o0Oo.o0O0000O
    public byte getByte(int i) {
        o0O0OO0.o00oOOoO(this.directory[this.segments.length - 1], i, 1L);
        int segment = segment(i);
        int i2 = segment == 0 ? 0 : this.directory[segment - 1];
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i - i2) + iArr[bArr.length + segment]];
    }

    @Override // o0Oo.o0O0000O
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int length = this.segments.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.segments[i2];
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.hashCode = i3;
        return i3;
    }

    @Override // o0Oo.o0O0000O
    public String hex() {
        return toByteString().hex();
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O hmacSha1(o0O0000O o0o0000o) {
        return toByteString().hmacSha1(o0o0000o);
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O hmacSha256(o0O0000O o0o0000o) {
        return toByteString().hmacSha256(o0o0000o);
    }

    @Override // o0Oo.o0O0000O
    public int indexOf(byte[] bArr, int i) {
        return toByteString().indexOf(bArr, i);
    }

    @Override // o0Oo.o0O0000O
    public byte[] internalArray() {
        return toByteArray();
    }

    @Override // o0Oo.o0O0000O
    public int lastIndexOf(byte[] bArr, int i) {
        return toByteString().lastIndexOf(bArr, i);
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O md5() {
        return toByteString().md5();
    }

    @Override // o0Oo.o0O0000O
    public boolean rangeEquals(int i, o0O0000O o0o0000o, int i2, int i3) {
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            int i4 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!o0o0000o.rangeEquals(i2, bArr[segment], (i - i4) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    @Override // o0Oo.o0O0000O
    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            int i4 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!o0O0OO0.o00oOOo0(bArr2[segment], (i - i4) + iArr[bArr2.length + segment], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O sha1() {
        return toByteString().sha1();
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O sha256() {
        return toByteString().sha256();
    }

    @Override // o0Oo.o0O0000O
    public int size() {
        return this.directory[this.segments.length - 1];
    }

    @Override // o0Oo.o0O0000O
    public String string(Charset charset) {
        return toByteString().string(charset);
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O substring(int i) {
        return toByteString().substring(i);
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O substring(int i, int i2) {
        return toByteString().substring(i, i2);
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // o0Oo.o0O0000O
    public o0O0000O toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // o0Oo.o0O0000O
    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.directory;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.segments[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // o0Oo.o0O0000O
    public String toString() {
        return toByteString().toString();
    }

    @Override // o0Oo.o0O0000O
    public String utf8() {
        return toByteString().utf8();
    }

    @Override // o0Oo.o0O0000O
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            outputStream.write(this.segments[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // o0Oo.o0O0000O
    public void write(o00ooO o00ooo) {
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            o0O00oO0 o0o00oo0 = new o0O00oO0(this.segments[i], i3, (i3 + i4) - i2);
            o0O00oO0 o0o00oo02 = o00ooo.f15435o00oo0O0;
            if (o0o00oo02 == null) {
                o0o00oo0.f15497o00oOoO0 = o0o00oo0;
                o0o00oo0.f15496o00oOo0o = o0o00oo0;
                o00ooo.f15435o00oo0O0 = o0o00oo0;
            } else {
                o0o00oo02.f15497o00oOoO0.o00oOo00(o0o00oo0);
            }
            i++;
            i2 = i4;
        }
        o00ooo.f15434o00oo0O += i2;
    }
}
