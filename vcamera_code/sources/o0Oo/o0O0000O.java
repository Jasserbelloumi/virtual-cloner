package o0Oo;

import android.support.v4.media.o00oOOo0;
import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
public class o0O0000O implements Serializable, Comparable<o0O0000O> {
    private static final long serialVersionUID = 1;
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final o0O0000O EMPTY = of(new byte[0]);

    public o0O0000O(byte[] bArr) {
        this.data = bArr;
    }

    public static int codePointIndexToCharIndex(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static o0O0000O decodeBase64(String str) {
        if (str != null) {
            byte[] o00oOOo02 = o00ooO0.o00oOOo0(str);
            if (o00oOOo02 != null) {
                return new o0O0000O(o00oOOo02);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static o0O0000O decodeHex(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
                }
                return of(bArr);
            }
            throw new IllegalArgumentException(o00oOoOo.o00oo.o00oOOo0("Unexpected hex string: ", str));
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int decodeHexDigit(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    private o0O0000O digest(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static o0O0000O encodeString(String str, Charset charset) {
        if (str != null) {
            if (charset != null) {
                return new o0O0000O(str.getBytes(charset));
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("s == null");
    }

    public static o0O0000O encodeUtf8(String str) {
        if (str != null) {
            o0O0000O o0o0000o = new o0O0000O(str.getBytes(o0O0OO0.f15506o00oOOo0));
            o0o0000o.utf8 = str;
            return o0o0000o;
        }
        throw new IllegalArgumentException("s == null");
    }

    private o0O0000O hmac(String str, o0O0000O o0o0000o) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(o0o0000o.toByteArray(), str));
            return of(mac.doFinal(this.data));
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static o0O0000O of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new o0O0000O(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static o0O0000O of(byte... bArr) {
        if (bArr != null) {
            return new o0O0000O((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static o0O0000O of(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            o0O0OO0.o00oOOoO(bArr.length, i, i2);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new o0O0000O(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static o0O0000O read(InputStream inputStream, int i) throws IOException {
        if (inputStream != null) {
            if (i >= 0) {
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i2 += read;
                }
                return new o0O0000O(bArr);
            }
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("byteCount < 0: ", i));
        }
        throw new IllegalArgumentException("in == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        o0O0000O read = read(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = o0O0000O.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, read.data);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public String base64() {
        return o00ooO0.o00oOOoO(this.data);
    }

    public String base64Url() {
        return o00ooO0.o00oOooO(this.data);
    }

    @Override // java.lang.Comparable
    public int compareTo(o0O0000O o0o0000o) {
        int size = size();
        int size2 = o0o0000o.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = getByte(i) & 255;
            int i3 = o0o0000o.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(o0O0000O o0o0000o) {
        return rangeEquals(size() - o0o0000o.size(), o0o0000o, 0, o0o0000o.size());
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0000O) {
            o0O0000O o0o0000o = (o0O0000O) obj;
            int size = o0o0000o.size();
            byte[] bArr = this.data;
            if (size == bArr.length && o0o0000o.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte getByte(int i) {
        return this.data[i];
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.hashCode = hashCode;
        return hashCode;
    }

    public String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public o0O0000O hmacSha1(o0O0000O o0o0000o) {
        return hmac("HmacSHA1", o0o0000o);
    }

    public o0O0000O hmacSha256(o0O0000O o0o0000o) {
        return hmac("HmacSHA256", o0o0000o);
    }

    public o0O0000O hmacSha512(o0O0000O o0o0000o) {
        return hmac("HmacSHA512", o0o0000o);
    }

    public final int indexOf(o0O0000O o0o0000o) {
        return indexOf(o0o0000o.internalArray(), 0);
    }

    public final int indexOf(o0O0000O o0o0000o, int i) {
        return indexOf(o0o0000o.internalArray(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public int indexOf(byte[] bArr, int i) {
        int length = this.data.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (o0O0OO0.o00oOOo0(this.data, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public byte[] internalArray() {
        return this.data;
    }

    public final int lastIndexOf(o0O0000O o0o0000o) {
        return lastIndexOf(o0o0000o.internalArray(), size());
    }

    public final int lastIndexOf(o0O0000O o0o0000o, int i) {
        return lastIndexOf(o0o0000o.internalArray(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int min = Math.min(i, this.data.length - bArr.length); min >= 0; min--) {
            if (o0O0OO0.o00oOOo0(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public o0O0000O md5() {
        return digest("MD5");
    }

    public boolean rangeEquals(int i, o0O0000O o0o0000o, int i2, int i3) {
        return o0o0000o.rangeEquals(i2, this.data, i, i3);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && o0O0OO0.o00oOOo0(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public o0O0000O sha1() {
        return digest("SHA-1");
    }

    public o0O0000O sha256() {
        return digest("SHA-256");
    }

    public o0O0000O sha512() {
        return digest("SHA-512");
    }

    public int size() {
        return this.data.length;
    }

    public final boolean startsWith(o0O0000O o0o0000o) {
        return rangeEquals(0, o0o0000o, 0, o0o0000o.size());
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public o0O0000O substring(int i) {
        return substring(i, this.data.length);
    }

    public o0O0000O substring(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new o0O0000O(bArr2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(o00oOo00.o00oOOo0(o00oOo0O.o00oOOo0("endIndex > length("), this.data.length, ")"));
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public o0O0000O toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new o0O0000O(bArr2);
            }
            i++;
        }
    }

    public o0O0000O toAsciiUppercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 97 && b <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new o0O0000O(bArr2);
            }
            i++;
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.data.clone();
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder o00oOOo02;
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String utf8 = utf8();
        int codePointIndexToCharIndex = codePointIndexToCharIndex(utf8, 64);
        if (codePointIndexToCharIndex == -1) {
            if (this.data.length <= 64) {
                o00oOOo02 = o00oOo0O.o00oOOo0("[hex=");
                o00oOOo02.append(hex());
                o00oOOo02.append("]");
            } else {
                o00oOOo02 = o00oOo0O.o00oOOo0("[size=");
                o00oOOo02.append(this.data.length);
                o00oOOo02.append(" hex=");
                o00oOOo02.append(substring(0, 64).hex());
                o00oOOo02.append("…]");
            }
            return o00oOOo02.toString();
        }
        String replace = utf8.substring(0, codePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (codePointIndexToCharIndex < utf8.length()) {
            sb = o00oOo0O.o00oOOo0("[size=");
            sb.append(this.data.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public String utf8() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, o0O0OO0.f15506o00oOOo0);
        this.utf8 = str2;
        return str2;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.data);
    }

    public void write(o00ooO o00ooo) {
        byte[] bArr = this.data;
        o00ooo.write(bArr, 0, bArr.length);
    }
}
