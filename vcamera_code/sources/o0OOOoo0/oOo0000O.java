package o0OOOoo0;

import java.util.ArrayList;
import java.util.List;
import o0OO0oO.o0O00O;
import o0OO0oO.o0O00O0o;
import o0OO0oO.o0O0oo0o;
import o0OOO0OO.o00oo0;
import o0OOOO.o00oo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes3.dex */
public class oOo0000O extends oOo000Oo {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o00oo<String, String> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull String str) {
            o0ooO.o00oo0O0(str, "line");
            return str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o00oo<String, String> {
        public final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull String str) {
            o0ooO.o00oo0O0(str, "line");
            return android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), this.$indent, str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o00oo<String, String> {
        public final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull String str) {
            o0ooO.o00oo0O0(str, "it");
            if (oO0O00o0.o0OoOoO(str)) {
                return str.length() < this.$indent.length() ? this.$indent : str;
            }
            return android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), this.$indent, str);
        }
    }

    public static final int o00oOoO(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!oO00OO0O.o00oo0Oo(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    public static final o00oo<String, String> o00oOoO0(String str) {
        return str.length() == 0 ? o00oOOo0.INSTANCE : new o00oOOoO(str);
    }

    @NotNull
    public static final String o00oOoOO(@NotNull String str, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "indent");
        return ooOOOOoo.o0O0o00O(ooOOOOoo.o0O0o0o0(oO0O0.o0Oo0O0O(str), new o00oOo00(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String o00oOoOo(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return o00oOoOO(str, str2);
    }

    public static final String o00oOoo0(List<String> list, int i, o00oo<? super String, String> o00ooVar, o00oo<? super String, String> o00ooVar2) {
        Appendable o0OOo0O2;
        String invoke;
        int o00ooOo2 = o0O00O0o.o00ooOo(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                o0O00O0o.o0O0000O();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == o00ooOo2) && oO0O00o0.o0OoOoO(str)) {
                str = null;
            } else {
                String invoke2 = o00ooVar2.invoke(str);
                if (invoke2 != null && (invoke = o00ooVar.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        o0OOo0O2 = o0O0oo0o.o0OOo0O(arrayList, new StringBuilder(i), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) o0OOo0O2).toString();
        o0ooO.o00oo0OO(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @NotNull
    public static final String o00oOooo(@NotNull String str, @NotNull String str2) {
        Appendable o0OOo0O2;
        String invoke;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "newIndent");
        List<String> o0Oo0O2 = oO0O0.o0Oo0O(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : o0Oo0O2) {
            if (!oO0O00o0.o0OoOoO((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(o0O00O.o0O000(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(o00oOoO(str3)));
        }
        Integer num = (Integer) o0O0oo0o.o0Oo0o0O(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int size = (o0Oo0O2.size() * str2.length()) + str.length();
        o00oo<String, String> o00oOoO02 = o00oOoO0(str2);
        int o00ooOo2 = o0O00O0o.o00ooOo(o0Oo0O2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : o0Oo0O2) {
            int i2 = i + 1;
            if (i < 0) {
                o0O00O0o.o0O0000O();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == o00ooOo2) && oO0O00o0.o0OoOoO(str4)) {
                str4 = null;
            } else {
                String o0o0OOoo = oO0O0O0.o0o0OOoo(str4, intValue);
                if (o0o0OOoo != null && (invoke = o00oOoO02.invoke(o0o0OOoo)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        o0OOo0O2 = o0O0oo0o.o0OOo0O(arrayList3, new StringBuilder(size), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) o0OOo0O2).toString();
        o0ooO.o00oo0OO(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @NotNull
    public static final String o00oo0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Appendable o0OOo0O2;
        int i;
        String invoke;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "newIndent");
        o0ooO.o00oo0O0(str3, "marginPrefix");
        if (!oO0O00o0.o0OoOoO(str3)) {
            List<String> o0Oo0O2 = oO0O0.o0Oo0O(str);
            int size = (o0Oo0O2.size() * str2.length()) + str.length();
            o00oo<String, String> o00oOoO02 = o00oOoO0(str2);
            int o00ooOo2 = o0O00O0o.o00ooOo(o0Oo0O2);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : o0Oo0O2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    o0O00O0o.o0O0000O();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i2 == 0 || i2 == o00ooOo2) && oO0O00o0.o0OoOoO(str4)) {
                    str4 = null;
                } else {
                    int length = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i = -1;
                            break;
                        } else if (!oO00OO0O.o00oo0Oo(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (oO0O00o0.o0OOO0O0(str4, str3, i, false, 4, null)) {
                            o0ooO.o00oo0(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(str3.length() + i5);
                            o0ooO.o00oo0OO(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (invoke = o00oOoO02.invoke(str5)) != null) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            o0OOo0O2 = o0O0oo0o.o0OOo0O(arrayList, new StringBuilder(size), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            String sb = ((StringBuilder) o0OOo0O2).toString();
            o0ooO.o00oo0OO(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String o00oo00O(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return o00oOooo(str, str2);
    }

    @o00oo0
    @NotNull
    public static final String o00oo0O(@NotNull String str, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "marginPrefix");
        return o00oo0(str, "", str2);
    }

    @o00oo0
    @NotNull
    public static final String o00oo0O0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o00oOooo(str, "");
    }

    public static /* synthetic */ String o00oo0OO(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = o0OO0.o00oOOoO.f12937o00oOOoO;
        }
        return o00oo0(str, str2, str3);
    }

    public static /* synthetic */ String o00oo0Oo(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = o0OO0.o00oOOoO.f12937o00oOOoO;
        }
        return o00oo0O(str, str2);
    }
}
