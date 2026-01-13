package o0OOO0oO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import o0OO0o.o00oo;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOoo0.oO00OOO;
import org.jetbrains.annotations.NotNull;
@o00oo0OO(name = "ByteStreamsKt")
/* loaded from: classes3.dex */
public final class o0O000Oo {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OO0oO.o0O000o0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f13450o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f13451o00oo0O0 = -1;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f13452o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ BufferedInputStream f13453o00oo0o0;

        public o00oOOo0(BufferedInputStream bufferedInputStream) {
            this.f13453o00oo0o0 = bufferedInputStream;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            o00oOoO0();
            return !this.f13452o00oo0Oo;
        }

        @Override // o0OO0oO.o0O000o0
        public byte o00oOOoO() {
            o00oOoO0();
            if (this.f13452o00oo0Oo) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b = (byte) this.f13451o00oo0O0;
            this.f13450o00oo0O = false;
            return b;
        }

        public final boolean o00oOo00() {
            return this.f13452o00oo0Oo;
        }

        public final boolean o00oOo0O() {
            return this.f13450o00oo0O;
        }

        public final void o00oOoO(boolean z) {
            this.f13452o00oo0Oo = z;
        }

        public final void o00oOoO0() {
            if (this.f13450o00oo0O || this.f13452o00oo0Oo) {
                return;
            }
            int read = this.f13453o00oo0o0.read();
            this.f13451o00oo0O0 = read;
            this.f13450o00oo0O = true;
            this.f13452o00oo0Oo = read == -1;
        }

        public final void o00oOoOO(int i) {
            this.f13451o00oo0O0 = i;
        }

        public final void o00oOoOo(boolean z) {
            this.f13450o00oo0O = z;
        }

        public final int o00oOooO() {
            return this.f13451o00oo0O0;
        }
    }

    @o00oo00O
    public static final BufferedInputStream o00oOOo0(InputStream inputStream, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @o00oo00O
    public static final BufferedOutputStream o00oOOoO(OutputStream outputStream, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    public static /* synthetic */ BufferedInputStream o00oOo00(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @o00oo00O
    public static final BufferedReader o00oOo0O(InputStream inputStream, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    public static /* synthetic */ BufferedReader o00oOo0o(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    public static /* synthetic */ BufferedWriter o00oOoO(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @o00oo00O
    public static final BufferedWriter o00oOoO0(OutputStream outputStream, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @o00oo00O
    public static final ByteArrayInputStream o00oOoOO(String str, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0OOOOO0.o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream o00oOoOo(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(str, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0OOOOO0.o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long o00oOoo0(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static /* synthetic */ BufferedOutputStream o00oOooO(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    public static /* synthetic */ long o00oOooo(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return o00oOoo0(inputStream, outputStream, i);
    }

    @o00oo00O
    public static final ByteArrayInputStream o00oo0(byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @o00oo00O
    public static final ByteArrayInputStream o00oo00O(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @o00oo(errorSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @o0OO000(expression = "readBytes()", imports = {}))
    @NotNull
    public static final byte[] o00oo0O(@NotNull InputStream inputStream, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        o00oOooo(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o0OOOOO0.o0ooO.o00oo0OO(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] o00oo0O0(@NotNull InputStream inputStream) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        o00oOooo(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o0OOOOO0.o0ooO.o00oo0OO(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @NotNull
    public static final o0OO0oO.o0O000o0 o00oo0OO(@NotNull BufferedInputStream bufferedInputStream) {
        o0OOOOO0.o0ooO.o00oo0O0(bufferedInputStream, "<this>");
        return new o00oOOo0(bufferedInputStream);
    }

    public static /* synthetic */ byte[] o00oo0Oo(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return o00oo0O(inputStream, i);
    }

    public static /* synthetic */ InputStreamReader o00oo0o(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @o00oo00O
    public static final InputStreamReader o00oo0o0(InputStream inputStream, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(inputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @o00oo00O
    public static final OutputStreamWriter o00oo0oO(OutputStream outputStream, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter o0O0o(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(outputStream, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
