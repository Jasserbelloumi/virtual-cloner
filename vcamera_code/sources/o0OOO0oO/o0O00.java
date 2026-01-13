package o0OOO0oO;

import java.io.InputStream;
import java.nio.charset.Charset;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "ConsoleKt")
/* loaded from: classes3.dex */
public final class o0O00 {
    @o00oo00O
    public static final void o00oOOo0(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @o00oo00O
    public static final void o00oOOoO(char c) {
        System.out.print(c);
    }

    @o00oo00O
    public static final void o00oOo00(double d) {
        System.out.print(d);
    }

    @o00oo00O
    public static final void o00oOo0O(int i) {
        System.out.print(i);
    }

    @o00oo00O
    public static final void o00oOo0o(long j) {
        System.out.print(j);
    }

    @o00oo00O
    public static final void o00oOoO(short s) {
        System.out.print(Short.valueOf(s));
    }

    @o00oo00O
    public static final void o00oOoO0(Object obj) {
        System.out.print(obj);
    }

    @o00oo00O
    public static final void o00oOoOO(boolean z) {
        System.out.print(z);
    }

    @o00oo00O
    public static final void o00oOoOo(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "message");
        System.out.print(cArr);
    }

    @o00oo00O
    public static final void o00oOoo0() {
        System.out.println();
    }

    @o00oo00O
    public static final void o00oOooO(float f) {
        System.out.print(f);
    }

    @o00oo00O
    public static final void o00oOooo(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @o0OO00o0(version = "1.6")
    @NotNull
    public static final String o00oo() {
        String o0O0o2 = o0O0o();
        if (o0O0o2 != null) {
            return o0O0o2;
        }
        throw new o0O0OOO0("EOF has already been reached");
    }

    @o00oo00O
    public static final void o00oo0(double d) {
        System.out.println(d);
    }

    @o00oo00O
    public static final void o00oo00O(char c) {
        System.out.println(c);
    }

    @o00oo00O
    public static final void o00oo0O(long j) {
        System.out.println(j);
    }

    @o00oo00O
    public static final void o00oo0O0(int i) {
        System.out.println(i);
    }

    @o00oo00O
    public static final void o00oo0OO(float f) {
        System.out.println(f);
    }

    @o00oo00O
    public static final void o00oo0Oo(Object obj) {
        System.out.println(obj);
    }

    @o00oo00O
    public static final void o00oo0o(boolean z) {
        System.out.println(z);
    }

    @o00oo00O
    public static final void o00oo0o0(short s) {
        System.out.println(Short.valueOf(s));
    }

    @o00oo00O
    public static final void o00oo0oO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "message");
        System.out.println(cArr);
    }

    @o0OO00o0(version = "1.6")
    @Nullable
    public static final String o00ooO00() {
        return o0O0o();
    }

    @Nullable
    public static final String o0O0o() {
        o0O0O0o0 o0o0o0o0 = o0O0O0o0.f13459o00oOOo0;
        InputStream inputStream = System.in;
        o0OOOOO0.o0ooO.o00oo0OO(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        o0OOOOO0.o0ooO.o00oo0OO(defaultCharset, "defaultCharset()");
        return o0o0o0o0.o00oOooO(inputStream, defaultCharset);
    }
}
