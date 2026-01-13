package o0OOOoo0;

import com.google.firebase.analytics.FirebaseAnalytics;
import o0OO0o.o00ooO0;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes3.dex */
public class oO0O000 extends oO0 {
    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o0(StringBuilder sb, StringBuilder sb2) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((CharSequence) sb2);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00oo(StringBuilder sb, byte b) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((int) b);
        o0ooO.o00oo0OO(sb, "append(value.toInt())");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooO(StringBuilder sb, StringBuffer stringBuffer) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(stringBuffer);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooO0(StringBuilder sb, float f) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(f);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooO00(StringBuilder sb, double d) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(d);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooO0O(StringBuilder sb, int i) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(i);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooO0o(StringBuilder sb, long j) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(j);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooOO(StringBuilder sb, short s) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((int) s);
        o0ooO.o00oo0OO(sb, "append(value.toInt())");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooOO0(StringBuilder sb, StringBuilder sb2) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((CharSequence) sb2);
        o0ooO.o00oo0OO(sb, "append(value)");
        sb.append('\n');
        o0ooO.o00oo0OO(sb, "append('\\n')");
        return sb;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooOOo(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(charSequence, "value");
        sb.append(charSequence, i, i2);
        o0ooO.o00oo0OO(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine()", imports = {}))
    @NotNull
    public static final Appendable o00ooOo(@NotNull Appendable appendable) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append(oO0O0O0o.f13893o00oOOoO);
        o0ooO.o00oo0OO(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o00ooOo0(StringBuilder sb, char[] cArr, int i, int i2) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, "value");
        sb.append(cArr, i, i2 - i);
        o0ooO.o00oo0OO(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final Appendable o00ooOoO(Appendable appendable, char c) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append(c);
        o0ooO.o00oo0OO(append, "append(value)");
        return o00ooOo(append);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final Appendable o00ooOoo(Appendable appendable, CharSequence charSequence) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        o0ooO.o00oo0OO(append, "append(value)");
        return o00ooOo(append);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00ooo0(StringBuilder sb, byte b) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((int) b);
        o0ooO.o00oo0OO(sb, "append(value.toInt())");
        return o00ooo00(sb);
    }

    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine()", imports = {}))
    @NotNull
    public static final StringBuilder o00ooo00(@NotNull StringBuilder sb) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(oO0O0O0o.f13893o00oOOoO);
        o0ooO.o00oo0OO(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00ooo0O(StringBuilder sb, char c) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(c);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00ooo0o(StringBuilder sb, double d) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(d);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00oooO(StringBuilder sb, float f) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(f);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00oooOO(StringBuilder sb, int i) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(i);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00oooOo(StringBuilder sb, long j) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(j);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00oooo(StringBuilder sb, Object obj) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(obj);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00oooo0(StringBuilder sb, CharSequence charSequence) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(charSequence);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00ooooO(StringBuilder sb, String str) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(str);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o00ooooo(StringBuilder sb, StringBuffer stringBuffer) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(stringBuffer);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final StringBuilder o0O000(@NotNull StringBuilder sb) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o0O00000(StringBuilder sb, short s) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append((int) s);
        o0ooO.o00oo0OO(sb, "append(value.toInt())");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o0O0000O(StringBuilder sb, boolean z) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.append(z);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @o00oo00O
    @o0O0o(level = o00ooO0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @o0OO000(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder o0O0000o(StringBuilder sb, char[] cArr) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, "value");
        sb.append(cArr);
        o0ooO.o00oo0OO(sb, "append(value)");
        return o00ooo00(sb);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O000O(StringBuilder sb, int i) {
        o0ooO.o00oo0O0(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i);
        o0ooO.o00oo0OO(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O000Oo(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(charSequence, "value");
        StringBuilder insert = sb.insert(i, charSequence, i2, i3);
        o0ooO.o00oo0OO(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0O000o(StringBuilder sb, int i, int i2, String str) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(str, "value");
        StringBuilder replace = sb.replace(i, i2, str);
        o0ooO.o00oo0OO(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @o00oo00O
    public static final void o0O000o0(StringBuilder sb, int i, char c) {
        o0ooO.o00oo0O0(sb, "<this>");
        sb.setCharAt(i, c);
    }

    public static /* synthetic */ void o0O000oo(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, FirebaseAnalytics.Param.DESTINATION);
        sb.getChars(i2, i3, cArr, i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0OoOoOO(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, "value");
        StringBuilder insert = sb.insert(i, cArr, i2, i3 - i2);
        o0ooO.o00oo0OO(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final StringBuilder o0OoOoOo(StringBuilder sb, int i, int i2) {
        o0ooO.o00oo0O0(sb, "<this>");
        StringBuilder delete = sb.delete(i, i2);
        o0ooO.o00oo0OO(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final void o0ooOoOO(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        o0ooO.o00oo0O0(sb, "<this>");
        o0ooO.o00oo0O0(cArr, FirebaseAnalytics.Param.DESTINATION);
        sb.getChars(i2, i3, cArr, i);
    }
}
