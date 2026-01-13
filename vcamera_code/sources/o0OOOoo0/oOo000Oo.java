package o0OOOoo0;

import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class oOo000Oo {
    @NotNull
    public static final <T extends Appendable> T o00oOOo0(@NotNull T t, @NotNull CharSequence... charSequenceArr) {
        o0ooO.o00oo0O0(t, "<this>");
        o0ooO.o00oo0O0(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static final <T> void o00oOOoO(@NotNull Appendable appendable, T t, @Nullable o00oo<? super T, ? extends CharSequence> o00ooVar) {
        CharSequence valueOf;
        o0ooO.o00oo0O0(appendable, "<this>");
        if (o00ooVar != null) {
            t = (T) o00ooVar.invoke(t);
        } else {
            if (!(t == 0 ? true : t instanceof CharSequence)) {
                if (t instanceof Character) {
                    appendable.append(((Character) t).charValue());
                    return;
                }
                valueOf = String.valueOf((Object) t);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) t;
        appendable.append(valueOf);
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Appendable o00oOo00(Appendable appendable) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append('\n');
        o0ooO.o00oo0OO(append, "append('\\n')");
        return append;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Appendable o00oOo0O(Appendable appendable, CharSequence charSequence) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        o0ooO.o00oo0OO(append, "append(value)");
        Appendable append2 = append.append('\n');
        o0ooO.o00oo0OO(append2, "append('\\n')");
        return append2;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T extends Appendable> T o00oOo0o(@NotNull T t, @NotNull CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(t, "<this>");
        o0ooO.o00oo0O0(charSequence, "value");
        T t2 = (T) t.append(charSequence, i, i2);
        o0ooO.o00oo0(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }

    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Appendable o00oOooO(Appendable appendable, char c) {
        o0ooO.o00oo0O0(appendable, "<this>");
        Appendable append = appendable.append(c);
        o0ooO.o00oo0OO(append, "append(value)");
        Appendable append2 = append.append('\n');
        o0ooO.o00oo0OO(append2, "append('\\n')");
        return append2;
    }
}
