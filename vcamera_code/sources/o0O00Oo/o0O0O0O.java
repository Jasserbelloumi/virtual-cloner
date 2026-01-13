package o0O00Oo;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import o00oOoO0.o00oOOoO;
import o0O00Oo.o0O00OOO;
/* loaded from: classes.dex */
public final class o0O0O0O extends o0O00OOO {

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends IllegalArgumentException {
        public o00oOOo0(int i, int i2) {
            super(o0oO0Ooo.o00oOOo0("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    public static int o00oOo0o(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += o00oOoo0(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("UTF-8 length does not fit in int: ");
        o00oOOo02.append(i2 + o00oOOoO.o00oOo00.f6911o00ooo0o);
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public static String o00oOoO(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!(b >= 0)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!(b3 >= 0)) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (o0O00OOO.o00oOOo0.o00oOoOO(b2)) {
                    if (i6 >= i3) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    o0O00OOO.o00oOOo0.o00oOooO(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (o0O00OOO.o00oOOo0.o00oOoO(b2)) {
                    if (i6 >= i3 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i8 = i6 + 1;
                    o0O00OOO.o00oOOo0.o00oOo00(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    o0O00OOO.o00oOOo0.o00oOOo0(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static String o00oOoO0(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!(b >= 0)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!(b3 >= 0)) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (o0O00OOO.o00oOOo0.o00oOoOO(b2)) {
                    if (i6 >= i3) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    o0O00OOO.o00oOOo0.o00oOooO(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (o0O00OOO.o00oOOo0.o00oOoO(b2)) {
                    if (i6 >= i3 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i8 = i6 + 1;
                    o0O00OOO.o00oOOo0.o00oOo00(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    o0O00OOO.o00oOOo0.o00oOOo0(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o00oOoOO(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O00Oo.o0O0O0O.o00oOoOO(java.lang.CharSequence, byte[], int, int):int");
    }

    public static void o00oOoOo(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Failed writing ");
                o00oOOo02.append(charSequence.charAt(i));
                o00oOOo02.append(" at index ");
                o00oOOo02.append(Math.max(i, (position - byteBuffer.position()) + 1) + position2);
                throw new ArrayIndexOutOfBoundsException(o00oOOo02.toString());
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    int position22 = byteBuffer.position();
                    StringBuilder o00oOOo022 = o00oOo0O.o00oOOo0("Failed writing ");
                    o00oOOo022.append(charSequence.charAt(i));
                    o00oOOo022.append(" at index ");
                    o00oOOo022.append(Math.max(i, (position - byteBuffer.position()) + 1) + position22);
                    throw new ArrayIndexOutOfBoundsException(o00oOOo022.toString());
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i3 = i + 1;
                if (i3 != length) {
                    try {
                        char charAt3 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                int i5 = i4 + 1;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i6 = i5 + 1;
                                byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i6, (byte) ((codePoint & 63) | 128));
                                position = i6;
                                i = i3;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i4;
                                i = i3;
                                int position222 = byteBuffer.position();
                                StringBuilder o00oOOo0222 = o00oOo0O.o00oOOo0("Failed writing ");
                                o00oOOo0222.append(charSequence.charAt(i));
                                o00oOOo0222.append(" at index ");
                                o00oOOo0222.append(Math.max(i, (position - byteBuffer.position()) + 1) + position222);
                                throw new ArrayIndexOutOfBoundsException(o00oOOo0222.toString());
                            }
                        } else {
                            i = i3;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new o00oOOo0(i, length);
            } else {
                int i7 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position = i7 + 1;
                byteBuffer.put(i7, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static int o00oOoo0(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new o00oOOo0(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    @Override // o0O00Oo.o0O00OOO
    public String o00oOOo0(ByteBuffer byteBuffer, int i, int i2) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? o00oOoO0(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2) : o00oOoO(byteBuffer, i, i2);
    }

    @Override // o0O00Oo.o0O00OOO
    public void o00oOOoO(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            o00oOoOo(charSequence, byteBuffer);
            return;
        }
        int arrayOffset = byteBuffer.arrayOffset();
        byteBuffer.position(o00oOoOO(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
    }

    @Override // o0O00Oo.o0O00OOO
    public int o00oOo00(CharSequence charSequence) {
        return o00oOo0o(charSequence);
    }
}
