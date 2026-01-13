package o0OOO0oO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import o0OO0o.oO0Ooooo;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOoO0.oO000;
import o0OOOoO0.oO0OoOO0;
import o0OOOoo0.oO00OOO;
import org.jetbrains.annotations.NotNull;
@o00oo0OO(name = "TextStreamsKt")
@o0OOO00({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1295#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o0OooO0 {

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

    @o00oo00O
    public static final BufferedReader o00oOOo0(Reader reader, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @o00oo00O
    public static final BufferedWriter o00oOOoO(Writer writer, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static /* synthetic */ BufferedReader o00oOo00(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static final long o00oOo0O(@NotNull Reader reader, @NotNull Writer writer, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long o00oOo0o(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return o00oOo0O(reader, writer, i);
    }

    @NotNull
    public static final oO000<String> o00oOoO(@NotNull BufferedReader bufferedReader) {
        o0OOOOO0.o0ooO.o00oo0O0(bufferedReader, "<this>");
        return oO0OoOO0.o00oOo0o(new o0ooO(bufferedReader));
    }

    public static final void o00oOoO0(@NotNull Reader reader, @NotNull o00oo<? super String, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String str : o00oOoO(bufferedReader)) {
                o00ooVar.invoke(str);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0O000o0.o00oOOo0(bufferedReader, null);
        } finally {
        }
    }

    @NotNull
    public static final byte[] o00oOoOO(@NotNull URL url) {
        o0OOOOO0.o0ooO.o00oo0O0(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            o0OOOOO0.o0ooO.o00oo0OO(openStream, "it");
            byte[] o00oo0O02 = o0O000Oo.o00oo0O0(openStream);
            o0O000o0.o00oOOo0(openStream, null);
            return o00oo0O02;
        } finally {
        }
    }

    @NotNull
    public static final List<String> o00oOoOo(@NotNull Reader reader) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        o00oOoO0(reader, new o00oOOo0(arrayList));
        return arrayList;
    }

    @NotNull
    public static final String o00oOoo0(@NotNull Reader reader) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        o00oOo0o(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        o0OOOOO0.o0ooO.o00oo0OO(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static /* synthetic */ BufferedWriter o00oOooO(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        o0OOOOO0.o0ooO.o00oo0O0(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @o00oo00O
    public static final String o00oOooo(URL url, Charset charset) {
        o0OOOOO0.o0ooO.o00oo0O0(url, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new String(o00oOoOO(url), charset);
    }

    @o00oo00O
    public static final StringReader o00oo0(String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "<this>");
        return new StringReader(str);
    }

    public static /* synthetic */ String o00oo00O(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0OOOOO0.o0ooO.o00oo0O0(url, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charset, "charset");
        return new String(o00oOoOO(url), charset);
    }

    public static final <T> T o00oo0OO(@NotNull Reader reader, @NotNull o00oo<? super oO000<String>, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(reader, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T invoke = o00ooVar.invoke(o00oOoO(bufferedReader));
            o0O000o0.o00oOOo0(bufferedReader, null);
            return invoke;
        } finally {
        }
    }
}
