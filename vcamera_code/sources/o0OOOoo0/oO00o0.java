package o0OOOoo0;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import o0OO0oO.o0O00o00;
import o0OOOO.o00oo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.oo0OOoo;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n1789#2,3:399\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:399,3\n*E\n"})
/* loaded from: classes3.dex */
public final class oO00o0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,398:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0O0OO implements o00oo<T, Boolean> {
        public final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(int i) {
            super(1);
            this.$value = i;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(Enum r3) {
            oO00Oo00 oo00oo00 = (oO00Oo00) r3;
            return Boolean.valueOf((this.$value & oo00oo00.getMask()) == oo00oo00.getValue());
        }
    }

    public static final oO00o00 o00oOo0o(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new oO0OOO00(matcher, charSequence);
        }
        return null;
    }

    public static final oO00o00 o00oOoO(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new oO0OOO00(matcher, charSequence);
        }
        return null;
    }

    public static final <T extends Enum<T> & oO00Oo00> Set<T> o00oOoO0(int i) {
        o0ooO.o00oooOo();
        EnumSet allOf = EnumSet.allOf(Enum.class);
        o0ooO.o00oo0OO(allOf, "fromInt$lambda$1");
        o0ooO.o00oooOo();
        o0O00o00.o0O0OOoO(allOf, new o00oOOo0(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        o0ooO.o00oo0OO(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final o0O0O0Oo o00oOoOO(MatchResult matchResult) {
        return oo0OOoo.o0OO00o(matchResult.start(), matchResult.end());
    }

    public static final o0O0O0Oo o00oOoOo(MatchResult matchResult, int i) {
        return oo0OOoo.o0OO00o(matchResult.start(i), matchResult.end(i));
    }

    public static final int o00oOoo0(Iterable<? extends oO00Oo00> iterable) {
        int i = 0;
        for (oO00Oo00 oo00oo00 : iterable) {
            i |= oo00oo00.getValue();
        }
        return i;
    }
}
