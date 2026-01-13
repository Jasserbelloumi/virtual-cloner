package o0OOOoo0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import o0OO0o.o00oo;
import o0OO0o.o0O0o;
import o0OO0o.o0O0o000;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0oO.o0;
import o0OO0oO.o0O0o0;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes3.dex */
public class oO0O0O00 extends oO0O0 {
    @o00oo00O
    public static final char o0o00ooO(CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character o0o00ooo(CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return oO0O0O0.o0oo0o0O(charSequence);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character o0o0O0(CharSequence charSequence, Comparator comparator) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return oO0O0O0.o0ooO0o0(charSequence, comparator);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character o0o0O00(CharSequence charSequence, Comparator comparator) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return oO0O0O0.o0oo0oO0(charSequence, comparator);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character o0o0O000(CharSequence charSequence, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        if (oO0O00oO.o00oOOo0(charSequence, "<this>", o00ooVar, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int o0OOo0oO2 = oO0O0.o0OOo0oO(charSequence);
        if (o0OOo0oO2 != 0) {
            R invoke = o00ooVar.invoke(Character.valueOf(charAt));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, o0OOo0oO2);
            while (o00oOOo02.hasNext()) {
                char charAt2 = charSequence.charAt(o00oOOo02.nextInt());
                R invoke2 = o00ooVar.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character o0o0O00O(CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return oO0O0O0.o0ooO0OO(charSequence);
    }

    @o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character o0o0O00o(CharSequence charSequence, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        if (oO0O00oO.o00oOOo0(charSequence, "<this>", o00ooVar, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int o0OOo0oO2 = oO0O0.o0OOo0oO(charSequence);
        if (o0OOo0oO2 != 0) {
            R invoke = o00ooVar.invoke(Character.valueOf(charAt));
            o0O0o0 o00oOOo02 = o0.o00oOOo0(1, o0OOo0oO2);
            while (o00oOOo02.hasNext()) {
                char charAt2 = charSequence.charAt(o00oOOo02.nextInt());
                R invoke2 = o00ooVar.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @o00oo00O
    @o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final BigInteger o0o0O0O(CharSequence charSequence, o0OOOO.o00oo<? super Character, ? extends BigInteger> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigInteger) oOoo0.o00oOOo0(charSequence, i, o00ooVar));
            o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o00oo00O
    @o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final BigDecimal o0o0O0O0(CharSequence charSequence, o0OOOO.o00oo<? super Character, ? extends BigDecimal> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigDecimal) oOoo0.o00oOOo0(charSequence, i, o00ooVar));
            o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final SortedSet<Character> o0o0Oo00(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return (SortedSet) oO0O0O0.oO0Ooooo(charSequence, new TreeSet());
    }
}
