package o0OOOoo0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0OO0o.o0O;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O00o00;
import o0OO0oO.o0OoO00O;
import o0OOO0.o0O0o;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0oO0O0o;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import o0OOOoO0.oO000O0O;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.videolan.libvlc.MediaPlayer;
@o0OOO00({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n22#2,3:399\n1#3:402\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n104#1:399,3\n*E\n"})
/* loaded from: classes3.dex */
public final class oO00o00O implements Serializable {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    @Nullable
    private Set<? extends oOo00o0o> _options;
    @NotNull
    private final Pattern nativePattern;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public final int o00oOOoO(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @NotNull
        public final String o00oOo00(@NotNull String str) {
            o0ooO.o00oo0O0(str, "literal");
            String quote = Pattern.quote(str);
            o0ooO.o00oo0OO(quote, "quote(literal)");
            return quote;
        }

        @NotNull
        public final oO00o00O o00oOo0O(@NotNull String str) {
            o0ooO.o00oo0O0(str, "literal");
            return new oO00o00O(str, oOo00o0o.LITERAL);
        }

        @NotNull
        public final String o00oOooO(@NotNull String str) {
            o0ooO.o00oo0O0(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            o0ooO.o00oo0OO(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements Serializable {
        @NotNull
        public static final o00oOOo0 Companion = new o00oOOo0(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        @NotNull
        private final String pattern;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }
        }

        public o00oOOoO(@NotNull String str, int i) {
            o0ooO.o00oo0O0(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            o0ooO.o00oo0OO(compile, "compile(pattern, flags)");
            return new oO00o00O(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<oO00o00> {
        public final /* synthetic */ CharSequence $input;
        public final /* synthetic */ int $startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(CharSequence charSequence, int i) {
            super(0);
            this.$input = charSequence;
            this.$startIndex = i;
        }

        @Override // o0OOOO.o00oOOo0
        @Nullable
        public final oO00o00 invoke() {
            return oO00o00O.this.find(this.$input, this.$startIndex);
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOo0O extends o0oO0O0o implements o00oo<oO00o00, oO00o00> {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(1, oO00o00.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final oO00o00 invoke(@NotNull oO00o00 oo00o00) {
            o0ooO.o00oo0O0(oo00o00, "p0");
            return oo00o00.next();
        }
    }

    @o0OOO00({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,398:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o00oo<oOo00o0o, Boolean> {
        public final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(int i) {
            super(1);
            this.$value = i;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(oOo00o0o ooo00o0o) {
            oOo00o0o ooo00o0o2 = ooo00o0o;
            return Boolean.valueOf((this.$value & ooo00o0o2.getMask()) == ooo00o0o2.getValue());
        }
    }

    @o0OOO0.o00oo00O(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {MediaPlayer.Event.ESAdded, 284, 288}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0o implements o0O00000<oO000O0O<? super String>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ CharSequence $input;
        public final /* synthetic */ int $limit;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(CharSequence charSequence, int i, o0OO.o00oOo0O<? super o00oo00O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo00O o00oo00o = new o00oo00O(this.$input, this.$limit, o00ooo0o2);
            o00oo00o.L$0 = obj;
            return o00oo00o;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super String> oo000o0o, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo00O) create(oo000o0o, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                o0OO0o.oo0ooO.o00oo0(r11)
                goto L9d
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                int r1 = r10.I$0
                java.lang.Object r2 = r10.L$1
                java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
                java.lang.Object r6 = r10.L$0
                o0OOOoO0.oO000O0O r6 = (o0OOOoO0.oO000O0O) r6
                o0OO0o.oo0ooO.o00oo0(r11)
                r7 = r10
                r11 = r1
                r1 = r2
                goto L71
            L2e:
                o0OO0o.oo0ooO.o00oo0(r11)
                goto Laf
            L33:
                o0OO0o.oo0ooO.o00oo0(r11)
                java.lang.Object r11 = r10.L$0
                o0OOOoO0.oO000O0O r11 = (o0OOOoO0.oO000O0O) r11
                o0OOOoo0.oO00o00O r1 = o0OOOoo0.oO00o00O.this
                java.util.regex.Pattern r1 = o0OOOoo0.oO00o00O.access$getNativePattern$p(r1)
                java.lang.CharSequence r6 = r10.$input
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.$limit
                if (r6 == r5) goto La0
                boolean r6 = r1.find()
                if (r6 != 0) goto L51
                goto La0
            L51:
                r7 = r10
                r6 = r11
                r11 = r2
            L54:
                java.lang.CharSequence r8 = r7.$input
                int r9 = r1.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r9)
                java.lang.String r2 = r2.toString()
                r7.L$0 = r6
                r7.L$1 = r1
                r7.I$0 = r11
                r7.label = r4
                java.lang.Object r2 = r6.o00oOOoO(r2, r7)
                if (r2 != r0) goto L71
                return r0
            L71:
                int r2 = r1.end()
                int r11 = r11 + r5
                int r8 = r7.$limit
                int r8 = r8 - r5
                if (r11 == r8) goto L81
                boolean r8 = r1.find()
                if (r8 != 0) goto L54
            L81:
                java.lang.CharSequence r11 = r7.$input
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r2, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r11 = r6.o00oOOoO(r11, r7)
                if (r11 != r0) goto L9d
                return r0
            L9d:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            La0:
                java.lang.CharSequence r1 = r10.$input
                java.lang.String r1 = r1.toString()
                r10.label = r5
                java.lang.Object r11 = r11.o00oOOoO(r1, r10)
                if (r11 != r0) goto Laf
                return r0
            Laf:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoo0.oO00o00O.o00oo00O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oO00o00O(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            o0OOOOO0.o0ooO.o00oo0O0(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            o0OOOOO0.o0ooO.o00oo0OO(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOOoo0.oO00o00O.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oO00o00O(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<? extends o0OOOoo0.oOo00o0o> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            o0OOOOO0.o0ooO.o00oo0O0(r2, r0)
            java.lang.String r0 = "options"
            o0OOOOO0.o0ooO.o00oo0O0(r3, r0)
            o0OOOoo0.oO00o00O$o00oOOo0 r0 = o0OOOoo0.oO00o00O.Companion
            int r3 = o0OOOoo0.oO00o0.o00oOoo0(r3)
            int r3 = r0.o00oOOoO(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            o0OOOOO0.o0ooO.o00oo0OO(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOOoo0.oO00o00O.<init>(java.lang.String, java.util.Set):void");
    }

    @o0O
    public oO00o00O(@NotNull Pattern pattern) {
        o0ooO.o00oo0O0(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ oO00o00 find$default(oO00o00O oo00o00o, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oo00o00o.find(charSequence, i);
    }

    public static /* synthetic */ oO000 findAll$default(oO00o00O oo00o00o, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oo00o00o.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(oO00o00O oo00o00o, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oo00o00o.split(charSequence, i);
    }

    public static /* synthetic */ oO000 splitToSequence$default(oO00o00O oo00o00o, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oo00o00o.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        o0ooO.o00oo0OO(pattern, "nativePattern.pattern()");
        return new o00oOOoO(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    @Nullable
    public final oO00o00 find(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o0ooO.o00oo0OO(matcher, "nativePattern.matcher(input)");
        return oO00o0.o00oOo0o(matcher, i, charSequence);
    }

    @NotNull
    public final oO000<oO00o00> findAll(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        if (i < 0 || i > charSequence.length()) {
            StringBuilder o00oOOo02 = o00ooOoo.oO00O0oO.o00oOOo0("Start index out of bounds: ", i, ", input length: ");
            o00oOOo02.append(charSequence.length());
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        }
        return oO0OoOO0.o00oo0(new o00oOo00(charSequence, i), o00oOo0O.INSTANCE);
    }

    @NotNull
    public final Set<oOo00o0o> getOptions() {
        Set set = this._options;
        if (set == null) {
            int flags = this.nativePattern.flags();
            EnumSet allOf = EnumSet.allOf(oOo00o0o.class);
            o0ooO.o00oo0OO(allOf, "fromInt$lambda$1");
            o0O00o00.o0O0OOoO(allOf, new o00oOoO(flags));
            Set<oOo00o0o> unmodifiableSet = Collections.unmodifiableSet(allOf);
            o0ooO.o00oo0OO(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this._options = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @NotNull
    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        o0ooO.o00oo0OO(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.7")
    @Nullable
    public final oO00o00 matchAt(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (region.lookingAt()) {
            o0ooO.o00oo0OO(region, "this");
            return new oO0OOO00(region, charSequence);
        }
        return null;
    }

    @Nullable
    public final oO00o00 matchEntire(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o0ooO.o00oo0OO(matcher, "nativePattern.matcher(input)");
        return oO00o0.o00oOoO(matcher, charSequence);
    }

    public final boolean matches(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.7")
    public final boolean matchesAt(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        o0ooO.o00oo0O0(charSequence, "input");
        o0ooO.o00oo0O0(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        o0ooO.o00oo0OO(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull o00oo<? super oO00o00, ? extends CharSequence> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "input");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        int i = 0;
        oO00o00 find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, find$default.o00oOo00().o00oOOo0().intValue());
            sb.append(o00ooVar.invoke(find$default));
            i = find$default.o00oOo00().o00oOo00().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "sb.toString()");
        return sb2;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence, @NotNull String str) {
        o0ooO.o00oo0O0(charSequence, "input");
        o0ooO.o00oo0O0(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        o0ooO.o00oo0OO(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        oO0O0.o0OoOooO(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return o0OoO00O.o00oOoo0(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.6")
    @NotNull
    public final oO000<String> splitToSequence(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "input");
        oO0O0.o0OoOooO(i);
        return oO0o0o.o00oOOoO(new o00oo00O(charSequence, i, null));
    }

    @NotNull
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String pattern = this.nativePattern.toString();
        o0ooO.o00oo0OO(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oO00o00O(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull o0OOOoo0.oOo00o0o r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            o0OOOOO0.o0ooO.o00oo0O0(r2, r0)
            java.lang.String r0 = "option"
            o0OOOOO0.o0ooO.o00oo0O0(r3, r0)
            o0OOOoo0.oO00o00O$o00oOOo0 r0 = o0OOOoo0.oO00o00O.Companion
            int r3 = r3.getValue()
            int r3 = r0.o00oOOoO(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            o0OOOOO0.o0ooO.o00oo0OO(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOOoo0.oO00o00O.<init>(java.lang.String, o0OOOoo0.oOo00o0o):void");
    }
}
