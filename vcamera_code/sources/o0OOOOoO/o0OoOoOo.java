package o0OOOOoO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import o0OOO0oO.o0OooO0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import o0OOOoO0.ooOOOOoo;
import o0OOOoo0.oO00OOO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1295#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* loaded from: classes3.dex */
public class o0OoOoOo {
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final void o00oOOo0(Path path, byte[] bArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(bArr, "array");
        Files.write(path, bArr, StandardOpenOption.APPEND);
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o00oOOoO(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(iterable, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        o0ooO.o00oo0OO(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o00oOo00(Path path, oO000<? extends CharSequence> oo000, Charset charset) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(oo000, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        Path write = Files.write(path, ooOOOOoo.o00oooO(oo000), charset, StandardOpenOption.APPEND);
        o0ooO.o00oo0OO(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path o00oOo0O(Path path, oO000 oo000, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(oo000, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        Path write = Files.write(path, ooOOOOoo.o00oooO(oo000), charset, StandardOpenOption.APPEND);
        o0ooO.o00oo0OO(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final void o00oOo0o(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charSequence, "text");
        o0ooO.o00oo0O0(charset, "charset");
        OutputStream newOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        o0ooO.o00oo0OO(newOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            o0OOO0oO.o0O000o0.o00oOOo0(outputStreamWriter, null);
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final BufferedReader o00oOoO(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ void o00oOoO0(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o00oOo0o(path, charSequence, charset);
    }

    public static /* synthetic */ BufferedReader o00oOoOO(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final BufferedWriter o00oOoOo(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ BufferedWriter o00oOoo0(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ Path o00oOooO(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(iterable, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        o0ooO.o00oo0OO(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final void o00oOooo(Path path, Charset charset, o0OOOO.o00oo<? super String, oO0Ooooo> o00ooVar) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(o00ooVar, "action");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        o0ooO.o00oo0OO(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            for (String str : o0OooO0.o00oOoO(newBufferedReader)) {
                o00ooVar.invoke(str);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0OOO0oO.o0O000o0.o00oOOo0(newBufferedReader, null);
        } finally {
        }
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final <T> T o00oo(Path path, Charset charset, o0OOOO.o00oo<? super oO000<String>, ? extends T> o00ooVar) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(o00ooVar, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            o0ooO.o00oo0OO(newBufferedReader, "it");
            T invoke = o00ooVar.invoke(o0OooO0.o00oOoO(newBufferedReader));
            o0OOO0oO.o0O000o0.o00oOOo0(newBufferedReader, null);
            return invoke;
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final InputStream o00oo0(Path path, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    public static void o00oo00O(Path path, Charset charset, o0OOOO.o00oo o00ooVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(o00ooVar, "action");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        o0ooO.o00oo0OO(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            for (String str : o0OooO0.o00oOoO(newBufferedReader)) {
                o00ooVar.invoke(str);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0OOO0oO.o0O000o0.o00oOOo0(newBufferedReader, null);
        } finally {
        }
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final List<String> o00oo0O(Path path, Charset charset) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        o0ooO.o00oo0OO(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final byte[] o00oo0O0(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        byte[] readAllBytes = Files.readAllBytes(path);
        o0ooO.o00oo0OO(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final OutputStream o00oo0OO(Path path, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    public static /* synthetic */ List o00oo0Oo(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        o0ooO.o00oo0OO(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    public static /* synthetic */ String o00oo0o(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        return o00oo0o0(path, charset);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oo0o0(@NotNull Path path, @NotNull Charset charset) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String o00oOoo02 = o0OooO0.o00oOoo0(inputStreamReader);
            o0OOO0oO.o0O000o0.o00oOOo0(inputStreamReader, null);
            return o00oOoo02;
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final InputStreamReader o00oo0oO(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ Path o00ooO(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(iterable, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(write, "write(this, lines, charset, *options)");
        return write;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final void o00ooO0(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(bArr, "array");
        o0ooO.o00oo0O0(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public static Object o00ooO00(Path path, Charset charset, o0OOOO.o00oo o00ooVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(o00ooVar, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            o0ooO.o00oo0OO(newBufferedReader, "it");
            Object invoke = o00ooVar.invoke(o0OooO0.o00oOoO(newBufferedReader));
            o0OOO0oO.o0O000o0.o00oOOo0(newBufferedReader, null);
            return invoke;
        } finally {
        }
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o00ooO0O(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(iterable, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(write, "write(this, lines, charset, *options)");
        return write;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o00ooO0o(Path path, oO000<? extends CharSequence> oo000, Charset charset, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(oo000, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        Path write = Files.write(path, ooOOOOoo.o00oooO(oo000), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final void o00ooOO(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset, @NotNull OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charSequence, "text");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(newOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            o0OOO0oO.o0O000o0.o00oOOo0(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ Path o00ooOO0(Path path, oO000 oo000, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(oo000, "lines");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        Path write = Files.write(path, ooOOOOoo.o00oooO(oo000), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        o0ooO.o00oo0OO(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    public static /* synthetic */ void o00ooOOo(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o00ooOO(path, charSequence, charset, openOptionArr);
    }

    public static /* synthetic */ OutputStreamWriter o00ooOo(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final OutputStreamWriter o00ooOo0(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ InputStreamReader o0O0o(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        o0ooO.o00oo0O0(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }
}
