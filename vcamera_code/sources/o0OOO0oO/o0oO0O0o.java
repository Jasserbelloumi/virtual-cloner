package o0OOO0oO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0OO0o.oO0Ooooo;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO00;
import o0OOOoO0.oO000;
import o0OOOoo0.oO00OOO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
/* loaded from: classes3.dex */
public class o0oO0O0o extends o0O0O0O {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o00oo<String, oO0Ooooo> {
        public final /* synthetic */ ArrayList<String> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(ArrayList<String> arrayList) {
            super(1);
            this.$result = arrayList;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(String str) {
            invoke2(str);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            o0OOOOO0.o0ooO.o00oo0O0(str, "it");
            this.$result.add(str);
        }
    }

    public static final void o00oOoO(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "text");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0OOOOO0.o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        o00oOoO0(file, bytes);
    }

    public static final void o00oOoO0(@NotNull File file, @NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0O000o0.o00oOOo0(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void o00oOoOO(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o00oOoO(file, str, charset);
    }

    @o00oo00O
    public static final BufferedReader o00oOoOo(File file, Charset charset, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    public static /* synthetic */ BufferedReader o00oOoo0(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @o00oo00O
    public static final BufferedWriter o00oOooo(File file, Charset charset, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    @NotNull
    public static final List<String> o00oo(@NotNull File file, @NotNull Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        ArrayList arrayList = new ArrayList();
        o00oo0O0(file, charset, new o00oOOo0(arrayList));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.lang.Object] */
    public static final void o00oo0(@NotNull File file, int i, @NotNull o0O00000<? super byte[], ? super Integer, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        if (i < 512) {
            i = 512;
        }
        ?? r3 = new byte[i];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r3);
                if (read <= 0) {
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                    o0O000o0.o00oOOo0(fileInputStream, null);
                    return;
                }
                o0o00000.invoke(r3, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static /* synthetic */ BufferedWriter o00oo00O(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    public static /* synthetic */ void o00oo0O(File file, Charset charset, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o00oo0O0(file, charset, o00ooVar);
    }

    public static final void o00oo0O0(@NotNull File file, @NotNull Charset charset, @NotNull o00oo<? super String, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        o0OooO0.o00oOoO0(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), o00ooVar);
    }

    public static final void o00oo0OO(@NotNull File file, @NotNull o0O00000<? super byte[], ? super Integer, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        o00oo0(file, 4096, o0o00000);
    }

    @o00oo00O
    public static final FileInputStream o00oo0Oo(File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return new FileInputStream(file);
    }

    @o00oo00O
    public static final PrintWriter o00oo0o(File file, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    @o00oo00O
    public static final FileOutputStream o00oo0o0(File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return new FileOutputStream(file);
    }

    public static /* synthetic */ PrintWriter o00oo0oO(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static /* synthetic */ InputStreamReader o00ooO(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @NotNull
    public static final String o00ooO0(@NotNull File file, @NotNull Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String o00oOoo02 = o0OooO0.o00oOoo0(inputStreamReader);
            o0O000o0.o00oOOo0(inputStreamReader, null);
            return o00oOoo02;
        } finally {
        }
    }

    public static /* synthetic */ List o00ooO00(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        return o00oo(file, charset);
    }

    public static /* synthetic */ String o00ooO0O(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        return o00ooO0(file, charset);
    }

    @o00oo00O
    public static final InputStreamReader o00ooO0o(File file, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static Object o00ooOO(File file, Charset charset, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object invoke = o00ooVar.invoke(o0OooO0.o00oOoO(bufferedReader));
            o0O000o0.o00oOOo0(bufferedReader, null);
            return invoke;
        } finally {
        }
    }

    public static final <T> T o00ooOO0(@NotNull File file, @NotNull Charset charset, @NotNull o00oo<? super oO000<String>, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T invoke = o00ooVar.invoke(o0OooO0.o00oOoO(bufferedReader));
            o0O000o0.o00oOOo0(bufferedReader, null);
            return invoke;
        } finally {
        }
    }

    public static final void o00ooOOo(@NotNull File file, @NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0O000o0.o00oOOo0(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void o00ooOo(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o00ooOo0(file, str, charset);
    }

    public static final void o00ooOo0(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "text");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0OOOOO0.o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        o00ooOOo(file, bytes);
    }

    @o00oo00O
    public static final OutputStreamWriter o00ooOoO(File file, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter o00ooOoo(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    @NotNull
    public static final byte[] o0O0o(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
                o0OOOOO0.o0ooO.o00oo0OO(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    o0O00O0o o0o00o0o = new o0O00O0o(8193);
                    o0o00o0o.write(read2);
                    o0O000Oo.o00oOooo(fileInputStream, o0o00o0o, 0, 2, null);
                    int size = o0o00o0o.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] o00oOOo02 = o0o00o0o.o00oOOo0();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
                    bArr = o0OO0oO.o0O00000.oo0OOoo(o00oOOo02, copyOf, i, 0, o0o00o0o.size());
                }
            }
            o0O000o0.o00oOOo0(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0O000o0.o00oOOo0(fileInputStream, th);
                throw th2;
            }
        }
    }
}
