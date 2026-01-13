package o0OOOoo0;

import o0OO0o.o00ooO0;
import o0OO0o.o0O0O0o0;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class oO0O000o extends oO0O000 {
    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use append(value: Any?) instead", replaceWith = @o0OO000(expression = "append(value = obj)", imports = {}))
    public static final StringBuilder o0O00(StringBuilder sb, Object obj) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(obj);
        o0ooO.o00oo0OO(sb, "this.append(obj)");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00O(StringBuilder sb) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.ERROR, message = "Use appendRange instead.", replaceWith = @o0OO000(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    public static final StringBuilder o0O00O0(StringBuilder sb, char[] cArr, int i, int i2) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, "str");
        throw new o0O0O0o0(null, 1, null);
    }

    @NotNull
    public static final StringBuilder o0O00O0o(@NotNull StringBuilder sb, @NotNull String... strArr) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00OO(StringBuilder sb, char c) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(c);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00OOO(StringBuilder sb, CharSequence charSequence) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(charSequence);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00Oo(StringBuilder sb, Object obj) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(obj);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00OoO(StringBuilder sb, boolean z) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(z);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O00Ooo(StringBuilder sb, char[] cArr) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, "value");
        sb.append(cArr);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final String o0O00o00(int i, o00oo<? super StringBuilder, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        o00ooVar.invoke(sb);
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @o00oo00O
    public static final String o0O00o0O(o00oo<? super StringBuilder, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "builderAction");
        StringBuilder sb = new StringBuilder();
        o00ooVar.invoke(sb);
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public static final StringBuilder o0OoO00O(@NotNull StringBuilder sb, @NotNull Object... objArr) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0oO0Ooo(StringBuilder sb, String str) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(str);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }
}
