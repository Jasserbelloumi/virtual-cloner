package o0OOO0oO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0O0o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0O0o0 f13459o00oOOo0 = new o0O0O0o0();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f13460o00oOOoO = 32;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static CharsetDecoder f13461o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final byte[] f13462o00oOo0O;
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final char[] f13463o00oOo0o;
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final CharBuffer f13464o00oOoO;
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final ByteBuffer f13465o00oOoO0;
    @NotNull

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final StringBuilder f13466o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static boolean f13467o00oOooO;

    static {
        byte[] bArr = new byte[32];
        f13462o00oOo0O = bArr;
        char[] cArr = new char[32];
        f13463o00oOo0o = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        o0OOOOO0.o0ooO.o00oo0OO(wrap, "wrap(bytes)");
        f13465o00oOoO0 = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        o0OOOOO0.o0ooO.o00oo0OO(wrap2, "wrap(chars)");
        f13464o00oOoO = wrap2;
        f13466o00oOoOO = new StringBuilder();
    }

    public final int o00oOOo0() {
        ByteBuffer byteBuffer = f13465o00oOoO0;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    public final int o00oOOoO(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = f13461o00oOo00;
            if (charsetDecoder == null) {
                o0OOOOO0.o0ooO.o00ooooO("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f13465o00oOoO0;
            CharBuffer charBuffer = f13464o00oOoO;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            o0OOOOO0.o0ooO.o00oo0OO(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                o00oOo0O();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f13466o00oOoOO;
            char[] cArr = f13463o00oOo0o;
            int i = position - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    public final int o00oOo00(int i, int i2) {
        ByteBuffer byteBuffer = f13465o00oOoO0;
        byteBuffer.limit(i);
        f13464o00oOoO.position(i2);
        int o00oOOoO2 = o00oOOoO(true);
        CharsetDecoder charsetDecoder = f13461o00oOo00;
        if (charsetDecoder == null) {
            o0OOOOO0.o0ooO.o00ooooO("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return o00oOOoO2;
    }

    public final void o00oOo0O() {
        CharsetDecoder charsetDecoder = f13461o00oOo00;
        if (charsetDecoder == null) {
            o0OOOOO0.o0ooO.o00ooooO("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f13465o00oOoO0.position(0);
        f13466o00oOoOO.setLength(0);
    }

    public final void o00oOo0o() {
        StringBuilder sb = f13466o00oOoOO;
        sb.setLength(32);
        sb.trimToSize();
    }

    public final void o00oOoO0(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        o0OOOOO0.o0ooO.o00oo0OO(newDecoder, "charset.newDecoder()");
        f13461o00oOo00 = newDecoder;
        ByteBuffer byteBuffer = f13465o00oOoO0;
        byteBuffer.clear();
        CharBuffer charBuffer = f13464o00oOoO;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f13461o00oOo00;
        if (charsetDecoder == null) {
            o0OOOOO0.o0ooO.o00ooooO("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        f13467o00oOooO = z;
        o00oOo0O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (o0OOOOO0.o0ooO.o00oOoO0(r0.charset(), r12) == false) goto L67;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String o00oOooO(@org.jetbrains.annotations.NotNull java.io.InputStream r11, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            o0OOOOO0.o0ooO.o00oo0O0(r11, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "charset"
            o0OOOOO0.o0ooO.o00oo0O0(r12, r0)     // Catch: java.lang.Throwable -> Lc9
            java.nio.charset.CharsetDecoder r0 = o0OOO0oO.o0O0O0o0.f13461o00oOo00     // Catch: java.lang.Throwable -> Lc9
            r1 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            o0OOOOO0.o0ooO.o00ooooO(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r1
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = o0OOOOO0.o0ooO.o00oOoO0(r0, r12)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L25
        L22:
            r10.o00oOoO0(r12)     // Catch: java.lang.Throwable -> Lc9
        L25:
            r12 = 0
            r0 = r12
            r2 = r0
        L28:
            int r3 = r11.read()     // Catch: java.lang.Throwable -> Lc9
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L4c
            java.lang.StringBuilder r11 = o0OOO0oO.o0O0O0o0.f13466o00oOoOO     // Catch: java.lang.Throwable -> Lc9
            int r11 = r11.length()     // Catch: java.lang.Throwable -> Lc9
            if (r11 != 0) goto L3e
            r11 = r7
            goto L3f
        L3e:
            r11 = r12
        L3f:
            if (r11 == 0) goto L47
            if (r0 != 0) goto L47
            if (r2 != 0) goto L47
            monitor-exit(r10)
            return r1
        L47:
            int r11 = r10.o00oOo00(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            goto L7a
        L4c:
            byte[] r6 = o0OOO0oO.o0O0O0o0.f13462o00oOo0O     // Catch: java.lang.Throwable -> Lc9
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch: java.lang.Throwable -> Lc9
            r6[r0] = r9     // Catch: java.lang.Throwable -> Lc9
            if (r3 == r5) goto L5e
            if (r8 == r4) goto L5e
            boolean r0 = o0OOO0oO.o0O0O0o0.f13467o00oOooO     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L5c
            goto L5e
        L5c:
            r0 = r8
            goto L28
        L5e:
            java.nio.ByteBuffer r0 = o0OOO0oO.o0O0O0o0.f13465o00oOoO0     // Catch: java.lang.Throwable -> Lc9
            r0.limit(r8)     // Catch: java.lang.Throwable -> Lc9
            java.nio.CharBuffer r3 = o0OOO0oO.o0O0O0o0.f13464o00oOoO     // Catch: java.lang.Throwable -> Lc9
            r3.position(r2)     // Catch: java.lang.Throwable -> Lc9
            int r2 = r10.o00oOOoO(r12)     // Catch: java.lang.Throwable -> Lc9
            if (r2 <= 0) goto Lc3
            char[] r3 = o0OOO0oO.o0O0O0o0.f13463o00oOo0o     // Catch: java.lang.Throwable -> Lc9
            int r6 = r2 + (-1)
            char r3 = r3[r6]     // Catch: java.lang.Throwable -> Lc9
            if (r3 != r5) goto Lc3
            r0.position(r12)     // Catch: java.lang.Throwable -> Lc9
            r11 = r2
        L7a:
            if (r11 <= 0) goto L92
            char[] r0 = o0OOO0oO.o0O0O0o0.f13463o00oOo0o     // Catch: java.lang.Throwable -> Lc9
            int r1 = r11 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            if (r1 != r5) goto L92
            int r11 = r11 + (-1)
            if (r11 <= 0) goto L92
            int r1 = r11 + (-1)
            char r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            r1 = 13
            if (r0 != r1) goto L92
            int r11 = r11 + (-1)
        L92:
            java.lang.StringBuilder r0 = o0OOO0oO.o0O0O0o0.f13466o00oOoOO     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L9b
            goto L9c
        L9b:
            r7 = r12
        L9c:
            if (r7 == 0) goto La7
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lc9
            char[] r1 = o0OOO0oO.o0O0O0o0.f13463o00oOo0o     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r0
        La7:
            char[] r1 = o0OOO0oO.o0O0O0o0.f13463o00oOo0o     // Catch: java.lang.Throwable -> Lc9
            r0.append(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "sb.toString()"
            o0OOOOO0.o0ooO.o00oo0OO(r11, r1)     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 <= r4) goto Lbe
            r10.o00oOo0o()     // Catch: java.lang.Throwable -> Lc9
        Lbe:
            r0.setLength(r12)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r11
        Lc3:
            int r0 = r10.o00oOOo0()     // Catch: java.lang.Throwable -> Lc9
            goto L28
        Lc9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOO0oO.o0O0O0o0.o00oOooO(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
