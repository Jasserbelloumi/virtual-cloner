package o0O0OO0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f11434o00oOOo0 = 8;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f11435o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f11436o00oOo00 = 2;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11437o00oOooO = 4;

    public static int o00oOOo0(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    public static byte[] o00oOOoO(@oo0oO0 byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @oo0oO0
    public static RuntimeException o00oOo00(@o0OO00OO String str) {
        return new IllegalStateException(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    @o00oOooO.oo0oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] o00oOo0O(@o00oOooO.oo0oO0 java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0OO0.o00oOo00.o00oOo0O(java.io.InputStream, int, int):byte[]");
    }

    @oo0oO0
    public static String o00oOo0o(InputStream inputStream, int i) throws IOException {
        return new String(o00oOooO(inputStream, i), StandardCharsets.UTF_8);
    }

    public static int o00oOoO(@oo0oO0 InputStream inputStream) throws IOException {
        return (int) o00oOoO0(inputStream, 2);
    }

    public static long o00oOoO0(@oo0oO0 InputStream inputStream, int i) throws IOException {
        byte[] o00oOooO2 = o00oOooO(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (o00oOooO2[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static long o00oOoOO(@oo0oO0 InputStream inputStream) throws IOException {
        return o00oOoO0(inputStream, 4);
    }

    public static int o00oOoOo(@oo0oO0 InputStream inputStream) throws IOException {
        return (int) o00oOoO0(inputStream, 1);
    }

    public static int o00oOoo0(@oo0oO0 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    @oo0oO0
    public static byte[] o00oOooO(@oo0oO0 InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException(android.support.v4.media.o00oOOo0.o00oOOo0("Not enough bytes to read: ", i));
            }
            i2 += read;
        }
        return bArr;
    }

    public static void o00oOooo(@oo0oO0 InputStream inputStream, @oo0oO0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void o00oo0(@oo0oO0 OutputStream outputStream, @oo0oO0 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o00oo00O(@oo0oO0 OutputStream outputStream, byte[] bArr) throws IOException {
        o00oo0OO(outputStream, bArr.length, 4);
        byte[] o00oOOoO2 = o00oOOoO(bArr);
        o00oo0OO(outputStream, o00oOOoO2.length, 4);
        outputStream.write(o00oOOoO2);
    }

    public static void o00oo0O(@oo0oO0 OutputStream outputStream, long j) throws IOException {
        o00oo0OO(outputStream, j, 4);
    }

    public static void o00oo0O0(@oo0oO0 OutputStream outputStream, int i) throws IOException {
        o00oo0OO(outputStream, i, 2);
    }

    public static void o00oo0OO(@oo0oO0 OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void o00oo0Oo(@oo0oO0 OutputStream outputStream, int i) throws IOException {
        o00oo0OO(outputStream, i, 1);
    }
}
