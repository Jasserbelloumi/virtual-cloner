package o0OOOoo0;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0O0o00;
import o0OO0o.o0O0o000;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OO0oO.o0O00;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O00O;
import o0OO0oO.o0O0o0;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.o0OoO00O;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.o0oO0O0o;
import o0OOOo0o.oo0OOoo;
import o0OOOoO0.oO000;
import o0OOOoO0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12824#2,2:1618\n12824#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes3.dex */
public class oO0O0 extends oO0O00o0 {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O00 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ CharSequence f13886o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f13887o00oo0O0;

        public o00oOOo0(CharSequence charSequence) {
            this.f13886o00oo0O = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13887o00oo0O0 < this.f13886o00oo0O.length();
        }

        @Override // o0OO0oO.o0O00
        public char o00oOOoO() {
            CharSequence charSequence = this.f13886o00oo0O;
            int i = this.f13887o00oo0O0;
            this.f13887o00oo0O0 = i + 1;
            return charSequence.charAt(i);
        }
    }

    @o0OOO00({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0O00000<CharSequence, Integer, o0O0o00<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ char[] $delimiters;
        public final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(char[] cArr, boolean z) {
            super(2);
            this.$delimiters = cArr;
            this.$ignoreCase = z;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ o0O0o00<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @Nullable
        public final o0O0o00<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
            o0ooO.o00oo0O0(charSequence, "$this$$receiver");
            int o0OOoo02 = oO0O0.o0OOoo0(charSequence, this.$delimiters, i, this.$ignoreCase);
            if (o0OOoo02 < 0) {
                return null;
            }
            return new o0O0o00<>(Integer.valueOf(o0OOoo02), 1);
        }
    }

    @o0OOO00({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0O00000<CharSequence, Integer, o0O0o00<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ List<String> $delimitersList;
        public final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(List<String> list, boolean z) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ o0O0o00<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @Nullable
        public final o0O0o00<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
            o0ooO.o00oo0O0(charSequence, "$this$$receiver");
            o0O0o00<Integer, String> o0OOo0O2 = oO0O0.o0OOo0O(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
            if (o0OOo0O2 != null) {
                return new o0O0o00<>(o0OOo0O2.getFirst(), Integer.valueOf(o0OOo0O2.getSecond().length()));
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o00oo<o0O0O0Oo, String> {
        public final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull o0O0O0Oo o0o0o0oo) {
            o0ooO.o00oo0O0(o0o0o0oo, "it");
            return oO0O0.o0OoooOO(this.$this_splitToSequence, o0o0o0oo);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o00oo<o0O0O0Oo, String> {
        public final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull o0O0O0Oo o0o0o0oo) {
            o0ooO.o00oo0O0(o0o0o0oo, "it");
            return oO0O0.o0OoooOO(this.$this_splitToSequence, o0o0o0oo);
        }
    }

    @NotNull
    public static final String o0OOOo(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        int length;
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "other");
        int length2 = charSequence.length();
        int min = Math.min(length2, charSequence2.length());
        int i = 0;
        while (i < min && oO00OO.o00ooo00(charSequence.charAt((length2 - i) - 1), charSequence2.charAt((length - i) - 1), z)) {
            i++;
        }
        if (o0OOo0oo(charSequence, (length2 - i) - 1) || o0OOo0oo(charSequence2, (length - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length2 - i, length2).toString();
    }

    @NotNull
    public static final String o0OOOo0O(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && oO00OO.o00ooo00(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (o0OOo0oo(charSequence, i2) || o0OOo0oo(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ String o0OOOo0o(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOOo0O(charSequence, charSequence2, z);
    }

    public static final boolean o0OOOoO(@NotNull CharSequence charSequence, char c, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return o0OOoOOO(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static /* synthetic */ String o0OOOoO0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOOo(charSequence, charSequence2, z);
    }

    public static final boolean o0OOOoOo(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (o0OOoOo0(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (o0OOoOO(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean o0OOOoo(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOOoO(charSequence, c, z);
    }

    @o00oo00O
    public static final boolean o0OOOoo0(CharSequence charSequence, oO00o00O oo00o00o) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.containsMatchIn(charSequence);
    }

    public static /* synthetic */ boolean o0OOOooO(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOOoOo(charSequence, charSequence2, z);
    }

    public static final boolean o0OOOooo(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return oO0O00o0.o0O0oooo((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!oO00OO.o00ooo00(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0OOo00(@NotNull CharSequence charSequence, char c, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.length() > 0 && oO00OO.o00ooo00(charSequence.charAt(o0OOo0oO(charSequence)), c, z);
    }

    public static final boolean o0OOo000(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o0ooO.o00oOoO0(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0OOo00O(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? oO0O00o0.o0O0oooO((String) charSequence, (String) charSequence2, false, 2, null) : o0Oo0o00(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean o0OOo00o(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOo00(charSequence, c, z);
    }

    public static final o0O0o00<Integer, String> o0OOo0O(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        o0oO0O0o o0O00O0o2;
        Object obj;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str = (String) o0O0oo0o.o0Ooo0Oo(collection);
            int o0OOoOo02 = !z2 ? o0OOoOo0(charSequence, str, i, false, 4, null) : o0Oo00oo(charSequence, str, i, false, 4, null);
            if (o0OOoOo02 < 0) {
                return null;
            }
            return new o0O0o00<>(Integer.valueOf(o0OOoOo02), str);
        }
        if (z2) {
            int o0OOo0oO2 = o0OOo0oO(charSequence);
            if (i > o0OOo0oO2) {
                i = o0OOo0oO2;
            }
            o0O00O0o2 = oo0OOoo.o0O00O0o(i, 0);
        } else {
            if (i < 0) {
                i = 0;
            }
            o0O00O0o2 = new o0O0O0Oo(i, charSequence.length());
        }
        if (charSequence instanceof String) {
            int o00oOo0O2 = o0O00O0o2.o00oOo0O();
            int o00oOoO02 = o0O00O0o2.o00oOoO0();
            int o00oOoO2 = o0O00O0o2.o00oOoO();
            if ((o00oOoO2 > 0 && o00oOo0O2 <= o00oOoO02) || (o00oOoO2 < 0 && o00oOoO02 <= o00oOo0O2)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (oO0O00o0.o0OO0o0(str2, 0, (String) charSequence, o00oOo0O2, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (o00oOo0O2 == o00oOoO02) {
                            break;
                        }
                        o00oOo0O2 += o00oOoO2;
                    } else {
                        return new o0O0o00<>(Integer.valueOf(o00oOo0O2), str3);
                    }
                }
            }
        } else {
            int o00oOo0O3 = o0O00O0o2.o00oOo0O();
            int o00oOoO03 = o0O00O0o2.o00oOoO0();
            int o00oOoO3 = o0O00O0o2.o00oOoO();
            if ((o00oOoO3 > 0 && o00oOo0O3 <= o00oOoO03) || (o00oOoO3 < 0 && o00oOoO03 <= o00oOo0O3)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (o0Oo0o00(str4, 0, charSequence, o00oOo0O3, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (o00oOo0O3 == o00oOoO03) {
                            break;
                        }
                        o00oOo0O3 += o00oOoO3;
                    } else {
                        return new o0O0o00<>(Integer.valueOf(o00oOo0O3), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ boolean o0OOo0O0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOo00O(charSequence, charSequence2, z);
    }

    public static /* synthetic */ o0O0o00 o0OOo0OO(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OooOo(charSequence, collection, i, z);
    }

    @Nullable
    public static final o0O0o00<Integer, String> o0OOo0Oo(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(collection, "strings");
        return o0OOo0O(charSequence, collection, i, z, true);
    }

    @NotNull
    public static final o0O0O0Oo o0OOo0o(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return new o0O0O0Oo(0, charSequence.length() - 1);
    }

    public static /* synthetic */ o0O0o00 o0OOo0o0(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o0OOo0oO(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOo0Oo(charSequence, collection, i, z);
    }

    public static final int o0OOo0oO(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean o0OOo0oo(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return new o0O0O0Oo(0, charSequence.length() + (-2)).o00oOoo0(i) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static final int o0OOoO(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        o0oO0O0o o0O00O0o2;
        if (z2) {
            int o0OOo0oO2 = o0OOo0oO(charSequence);
            if (i > o0OOo0oO2) {
                i = o0OOo0oO2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            o0O00O0o2 = oo0OOoo.o0O00O0o(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            o0O00O0o2 = new o0O0O0Oo(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int o00oOo0O2 = o0O00O0o2.o00oOo0O();
            int o00oOoO02 = o0O00O0o2.o00oOoO0();
            int o00oOoO2 = o0O00O0o2.o00oOoO();
            if ((o00oOoO2 <= 0 || o00oOo0O2 > o00oOoO02) && (o00oOoO2 >= 0 || o00oOoO02 > o00oOo0O2)) {
                return -1;
            }
            while (!oO0O00o0.o0OO0o0((String) charSequence2, 0, (String) charSequence, o00oOo0O2, charSequence2.length(), z)) {
                if (o00oOo0O2 == o00oOoO02) {
                    return -1;
                }
                o00oOo0O2 += o00oOoO2;
            }
            return o00oOo0O2;
        }
        int o00oOo0O3 = o0O00O0o2.o00oOo0O();
        int o00oOoO03 = o0O00O0o2.o00oOoO0();
        int o00oOoO3 = o0O00O0o2.o00oOoO();
        if ((o00oOoO3 <= 0 || o00oOo0O3 > o00oOoO03) && (o00oOoO3 >= 0 || o00oOoO03 > o00oOo0O3)) {
            return -1;
        }
        while (!o0Oo0o00(charSequence2, 0, charSequence, o00oOo0O3, charSequence2.length(), z)) {
            if (o00oOo0O3 == o00oOoO03) {
                return -1;
            }
            o00oOo0O3 += o00oOoO3;
        }
        return o00oOo0O3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <C extends CharSequence & R, R> R o0OOoO0(C c, o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return c.length() == 0 ? o00oooo02.invoke() : c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <C extends CharSequence & R, R> R o0OOoO00(C c, o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return oO0O00o0.o0OoOoO(c) ? o00oooo02.invoke() : c;
    }

    public static final int o0OOoO0O(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? o0OOoo0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int o0OOoO0o(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(str, "string");
        return (z || !(charSequence instanceof String)) ? o0OOoOO(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int o0OOoOO(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return o0OOoO(charSequence, charSequence2, i, i2, z, z2);
    }

    public static /* synthetic */ int o0OOoOOO(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOoO0O(charSequence, c, i, z);
    }

    public static final int o0OOoOo(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(collection, "strings");
        o0O0o00<Integer, String> o0OOo0O2 = o0OOo0O(charSequence, collection, i, z, false);
        if (o0OOo0O2 != null) {
            return o0OOo0O2.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int o0OOoOo0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOoO0o(charSequence, str, i, z);
    }

    @o00oo00O
    public static final boolean o0OOoo(CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final int o0OOoo0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        boolean z2;
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(o0O000O.oo0ooo(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        o0O0o0 it = new o0O0O0Oo(i, o0OOo0oO(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (oO00OO.o00ooo00(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return nextInt;
            }
        }
        return -1;
    }

    public static /* synthetic */ int o0OOoo0O(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOoOo(charSequence, collection, i, z);
    }

    public static /* synthetic */ int o0OOoo0o(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOoo0(charSequence, cArr, i, z);
    }

    @o00oo00O
    public static final boolean o0OOooO(CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return !oO0O00o0.o0OoOoO(charSequence);
    }

    @o00oo00O
    public static final boolean o0OOooOO(CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @o00oo00O
    public static final boolean o0OOooOo(CharSequence charSequence) {
        return charSequence == null || oO0O00o0.o0OoOoO(charSequence);
    }

    @NotNull
    public static final o0O00 o0OOooo(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return new o00oOOo0(charSequence);
    }

    @o00oo00O
    public static final boolean o0OOooo0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @NotNull
    public static final String o0Oo(@NotNull String str, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, "suffix");
        if (o0OOo0O0(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final int o0Oo0(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(collection, "strings");
        o0O0o00<Integer, String> o0OOo0O2 = o0OOo0O(charSequence, collection, i, z, true);
        if (o0OOo0O2 != null) {
            return o0OOo0O2.getFirst().intValue();
        }
        return -1;
    }

    public static final int o0Oo00o(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(str, "string");
        return (z || !(charSequence instanceof String)) ? o0OOoO(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static final int o0Oo00o0(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? o0ooO0O0(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int o0Oo00oO(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o0OOo0oO(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0Oo00o0(charSequence, c, i, z);
    }

    public static /* synthetic */ int o0Oo00oo(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o0OOo0oO(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0Oo00o(charSequence, str, i, z);
    }

    @NotNull
    public static final List<String> o0Oo0O(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return ooOOOOoo.o0OOo0O0(o0Oo0O0O(charSequence));
    }

    public static /* synthetic */ int o0Oo0O0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o0OOo0oO(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0ooO0O0(charSequence, cArr, i, z);
    }

    public static /* synthetic */ int o0Oo0O00(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = o0OOo0oO(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0Oo0(charSequence, collection, i, z);
    }

    @NotNull
    public static final oO000<String> o0Oo0O0O(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return o0Ooo0Oo(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @o00oo00O
    public static final String o0Oo0OO(String str) {
        return str == null ? "" : str;
    }

    @o00oo00O
    public static final boolean o0Oo0OO0(CharSequence charSequence, oO00o00O oo00o00o) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.matches(charSequence);
    }

    public static /* synthetic */ String o0Oo0OOO(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return o0ooOOOO(str, i, c);
    }

    public static /* synthetic */ CharSequence o0Oo0OOo(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return o0oOo0o0(charSequence, i, c);
    }

    public static final oO000<o0O0O0Oo> o0Oo0Oo(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        o0OoOooO(i2);
        return new oO00OOo0(charSequence, i, i2, new o00oOOoO(cArr, z));
    }

    public static /* synthetic */ String o0Oo0Oo0(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return o0oOoo00(str, i, c);
    }

    public static final oO000<o0O0O0Oo> o0Oo0OoO(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        o0OoOooO(i2);
        return new oO00OOo0(charSequence, i, i2, new o00oOo00(o0OO0oO.o0O00000.o00oo0o(strArr), z));
    }

    public static /* synthetic */ oO000 o0Oo0Ooo(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return o0Oo0OoO(charSequence, strArr, i, z, i2);
    }

    public static final boolean o0Oo0o00(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!oO00OO.o00ooo00(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final CharSequence o0Oo0o0O(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        return o0Oooo0(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String o0Oo0o0o(@NotNull String str, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, "prefix");
        if (o0Oooo0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    @NotNull
    public static final CharSequence o0Oo0oO(@NotNull CharSequence charSequence, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        return o0Oo0oO0(charSequence, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final CharSequence o0Oo0oO0(@NotNull CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            o0ooO.o00oo0OO(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i2, charSequence.length());
            o0ooO.o00oo0OO(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    public static /* synthetic */ oO000 o0Oo0oOo(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return o0Oo0Oo(charSequence, cArr, i, z, i2);
    }

    @o00oo00O
    public static final String o0Oo0oo0(String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0Oo0oO0(str, i, i2).toString();
    }

    @o00oo00O
    public static final String o0Oo0ooO(String str, o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        return o0Oo0oO(str, o0o0o0oo).toString();
    }

    @NotNull
    public static final CharSequence o0Oo0ooo(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "suffix");
        return o0OOo0O0(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String o0OoO(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "replacement");
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0Oo00oO2 = o0Oo00oO(str, c, 0, false, 6, null);
        return o0Oo00oO2 == -1 ? str3 : o0OoOo(str, o0Oo00oO2 + 1, str.length(), str2).toString();
    }

    @NotNull
    public static final String o0OoO0(@NotNull String str, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, TtmlNode.RUBY_DELIMITER);
        return o0oO0O00(str, charSequence, charSequence);
    }

    @NotNull
    public static final CharSequence o0OoO000(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        o0ooO.o00oo0O0(charSequence3, "suffix");
        return (charSequence.length() >= charSequence3.length() + charSequence2.length() && o0Oooo0(charSequence, charSequence2, false, 2, null) && o0OOo0O0(charSequence, charSequence3, false, 2, null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @o00oo00O
    public static final String o0OoO0OO(CharSequence charSequence, oO00o00O oo00o00o, String str) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        o0ooO.o00oo0O0(str, "replacement");
        return oo00o00o.replace(charSequence, str);
    }

    @NotNull
    public static final String o0OoO0Oo(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "replacement");
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0OOoOOO2 = o0OOoOOO(str, c, 0, false, 6, null);
        return o0OOoOOO2 == -1 ? str3 : o0OoOo(str, o0OOoOOO2 + 1, str.length(), str2).toString();
    }

    @NotNull
    public static final String o0OoO0o0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "replacement");
        o0ooO.o00oo0O0(str4, "missingDelimiterValue");
        int o0OOoOo02 = o0OOoOo0(str, str2, 0, false, 6, null);
        return o0OOoOo02 == -1 ? str4 : o0OoOo(str, str2.length() + o0OOoOo02, str.length(), str3).toString();
    }

    public static /* synthetic */ String o0OoO0oO(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return o0OoO0Oo(str, c, str2, str3);
    }

    public static /* synthetic */ String o0OoO0oo(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return o0OoO0o0(str, str2, str3, str4);
    }

    public static /* synthetic */ String o0OoOO(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return o0OoOO00(str, str2, str3, str4);
    }

    @NotNull
    public static final String o0OoOO00(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "replacement");
        o0ooO.o00oo0O0(str4, "missingDelimiterValue");
        int o0Oo00oo2 = o0Oo00oo(str, str2, 0, false, 6, null);
        return o0Oo00oo2 == -1 ? str4 : o0OoOo(str, str2.length() + o0Oo00oo2, str.length(), str3).toString();
    }

    public static /* synthetic */ String o0OoOO0o(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return o0OoO(str, c, str2, str3);
    }

    public static /* synthetic */ String o0OoOOO(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return o0OoOOoO(str, c, str2, str3);
    }

    @NotNull
    public static final String o0OoOOO0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "replacement");
        o0ooO.o00oo0O0(str4, "missingDelimiterValue");
        int o0OOoOo02 = o0OOoOo0(str, str2, 0, false, 6, null);
        return o0OOoOo02 == -1 ? str4 : o0OoOo(str, 0, o0OOoOo02, str3).toString();
    }

    public static /* synthetic */ String o0OoOOOO(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return o0OoOOO0(str, str2, str3, str4);
    }

    @NotNull
    public static final String o0OoOOOo(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "replacement");
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0Oo00oO2 = o0Oo00oO(str, c, 0, false, 6, null);
        return o0Oo00oO2 == -1 ? str3 : o0OoOo(str, 0, o0Oo00oO2, str2).toString();
    }

    public static /* synthetic */ String o0OoOOo(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return o0OoOOOo(str, c, str2, str3);
    }

    @NotNull
    public static final String o0OoOOo0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "replacement");
        o0ooO.o00oo0O0(str4, "missingDelimiterValue");
        int o0Oo00oo2 = o0Oo00oo(str, str2, 0, false, 6, null);
        return o0Oo00oo2 == -1 ? str4 : o0OoOo(str, 0, o0Oo00oo2, str3).toString();
    }

    @NotNull
    public static final String o0OoOOoO(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "replacement");
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0OOoOOO2 = o0OOoOOO(str, c, 0, false, 6, null);
        return o0OOoOOO2 == -1 ? str3 : o0OoOo(str, 0, o0OOoOOO2, str2).toString();
    }

    @NotNull
    public static final CharSequence o0OoOo(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            o0ooO.o00oo0OO(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            o0ooO.o00oo0OO(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static /* synthetic */ String o0OoOo00(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return o0OoOOo0(str, str2, str3, str4);
    }

    @o00oo00O
    public static final String o0OoOo0O(CharSequence charSequence, oO00o00O oo00o00o, String str) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        o0ooO.o00oo0O0(str, "replacement");
        return oo00o00o.replaceFirst(charSequence, str);
    }

    @o00oo00O
    @o0O0o000
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo0OO(name = "replaceFirstCharWithCharSequence")
    @o0OO00o0(version = "1.5")
    public static final String o0OoOo0o(String str, o00oo<? super Character, ? extends CharSequence> o00ooVar) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) o00ooVar.invoke(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @NotNull
    public static final CharSequence o0OoOoO0(@NotNull CharSequence charSequence, @NotNull o0O0O0Oo o0o0o0oo, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        o0ooO.o00oo0O0(charSequence2, "replacement");
        return o0OoOo(charSequence, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1, charSequence2);
    }

    @o00oo00O
    public static final String o0OoOoo(String str, o0O0O0Oo o0o0o0oo, CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        o0ooO.o00oo0O0(charSequence, "replacement");
        return o0OoOoO0(str, o0o0o0oo, charSequence).toString();
    }

    @o00oo00O
    public static final String o0OoOoo0(String str, int i, int i2, CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, "replacement");
        return o0OoOo(str, i, i2, charSequence).toString();
    }

    public static final void o0OoOooO(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static /* synthetic */ boolean o0Ooo(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0Ooo0o(charSequence, charSequence2, i, z);
    }

    public static /* synthetic */ List o0Ooo0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o0Ooo00O(charSequence, strArr, z, i);
    }

    @NotNull
    public static final List<String> o0Ooo00(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "delimiters");
        if (cArr.length == 1) {
            return o0oOO0Oo(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<o0O0O0Oo> o00oooO2 = ooOOOOoo.o00oooO(o0Oo0oOo(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(o0O00O.o0O000(o00oooO2, 10));
        for (o0O0O0Oo o0o0o0oo : o00oooO2) {
            arrayList.add(o0OoooOO(charSequence, o0o0o0oo));
        }
        return arrayList;
    }

    @o00oo00O
    public static final List<String> o0Ooo000(CharSequence charSequence, oO00o00O oo00o00o, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.split(charSequence, i);
    }

    @NotNull
    public static final List<String> o0Ooo00O(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return o0oOO0Oo(charSequence, str, z, i);
            }
        }
        Iterable<o0O0O0Oo> o00oooO2 = ooOOOOoo.o00oooO(o0Oo0Ooo(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(o0O00O.o0O000(o00oooO2, 10));
        for (o0O0O0Oo o0o0o0oo : o00oooO2) {
            arrayList.add(o0OoooOO(charSequence, o0o0o0oo));
        }
        return arrayList;
    }

    public static /* synthetic */ List o0Ooo00o(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o0Ooo00(charSequence, cArr, z, i);
    }

    @NotNull
    public static final oO000<String> o0Ooo0O(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "delimiters");
        return ooOOOOoo.o0O0o0o0(o0Oo0oOo(charSequence, cArr, 0, z, i, 2, null), new o00oOoO(charSequence));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.6")
    public static final oO000<String> o0Ooo0O0(CharSequence charSequence, oO00o00O oo00o00o, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.splitToSequence(charSequence, i);
    }

    public static /* synthetic */ oO000 o0Ooo0Oo(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o0oOOOoo(charSequence, strArr, z, i);
    }

    public static final boolean o0Ooo0o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? oO0O00o0.o0OOO0O0((String) charSequence, (String) charSequence2, i, false, 4, null) : o0Oo0o00(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    public static final boolean o0Ooo0o0(@NotNull CharSequence charSequence, char c, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.length() > 0 && oO00OO.o00ooo00(charSequence.charAt(0), c, z);
    }

    public static final boolean o0Ooo0oO(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? oO0O00o0.o0OOO0O((String) charSequence, (String) charSequence2, false, 2, null) : o0Oo0o00(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean o0Ooo0oo(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0Ooo0o0(charSequence, c, z);
    }

    @Nullable
    public static final o0O0o00<Integer, String> o0OooOo(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(collection, "strings");
        return o0OOo0O(charSequence, collection, i, z, false);
    }

    @NotNull
    public static final CharSequence o0OooOoo(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, TtmlNode.RUBY_DELIMITER);
        return o0OoO000(charSequence, charSequence2, charSequence2);
    }

    @o00oo00O
    @o0O0o(message = "Use parameters named startIndex and endIndex.", replaceWith = @o0OO000(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    public static final CharSequence o0Oooo(String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.subSequence(i, i2);
    }

    public static /* synthetic */ boolean o0Oooo0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0Ooo0oO(charSequence, charSequence2, z);
    }

    @NotNull
    public static final CharSequence o0Oooo0o(@NotNull CharSequence charSequence, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        return charSequence.subSequence(o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @o00oo00O
    public static final String o0OoooO(CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static /* synthetic */ oO000 o0OoooO0(CharSequence charSequence, oO00o00O oo00o00o, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.splitToSequence(charSequence, i);
    }

    @NotNull
    public static final String o0OoooOO(@NotNull CharSequence charSequence, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        return charSequence.subSequence(o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1).toString();
    }

    @NotNull
    public static final String o0OoooOo(@NotNull String str, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        String substring = str.substring(o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String o0Ooooo(@NotNull String str, char c, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "missingDelimiterValue");
        int o0OOoOOO2 = o0OOoOOO(str, c, 0, false, 6, null);
        if (o0OOoOOO2 == -1) {
            return str2;
        }
        String substring = str.substring(o0OOoOOO2 + 1, str.length());
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0Ooooo0(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        o0ooO.o00oo0O0(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    @NotNull
    public static final String o0OooooO(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0OOoOo02 = o0OOoOo0(str, str2, 0, false, 6, null);
        if (o0OOoOo02 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + o0OOoOo02, str.length());
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String o0o00(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0Oo00oo2 = o0Oo00oo(str, str2, 0, false, 6, null);
        if (o0Oo00oo2 == -1) {
            return str3;
        }
        String substring = str.substring(0, o0Oo00oo2);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String o0o000(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0Oo00oo2 = o0Oo00oo(str, str2, 0, false, 6, null);
        if (o0Oo00oo2 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + o0Oo00oo2, str.length());
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0o0000(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return o0Ooooo(str, c, str2);
    }

    @NotNull
    public static final String o0o0000o(@NotNull String str, char c, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "missingDelimiterValue");
        int o0Oo00oO2 = o0Oo00oO(str, c, 0, false, 6, null);
        if (o0Oo00oO2 == -1) {
            return str2;
        }
        String substring = str.substring(o0Oo00oO2 + 1, str.length());
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0o000O(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return o0o000(str, str2, str3);
    }

    public static /* synthetic */ String o0o000O0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return o0o0000o(str, c, str2);
    }

    @NotNull
    public static final String o0o000OO(@NotNull String str, char c, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "missingDelimiterValue");
        int o0OOoOOO2 = o0OOoOOO(str, c, 0, false, 6, null);
        if (o0OOoOOO2 == -1) {
            return str2;
        }
        String substring = str.substring(0, o0OOoOOO2);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String o0o000Oo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, TtmlNode.RUBY_DELIMITER);
        o0ooO.o00oo0O0(str3, "missingDelimiterValue");
        int o0OOoOo02 = o0OOoOo0(str, str2, 0, false, 6, null);
        if (o0OOoOo02 == -1) {
            return str3;
        }
        String substring = str.substring(0, o0OOoOo02);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0o000o0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return o0o000OO(str, c, str2);
    }

    public static /* synthetic */ String o0o000oO(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return o0o000Oo(str, str2, str3);
    }

    @NotNull
    public static final String o0o000oo(@NotNull String str, char c, @NotNull String str2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "missingDelimiterValue");
        int o0Oo00oO2 = o0Oo00oO(str, c, 0, false, 6, null);
        if (o0Oo00oO2 == -1) {
            return str2;
        }
        String substring = str.substring(0, o0Oo00oO2);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final CharSequence o0o00O(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean o00oo0Oo2 = oO00OO0O.o00oo0Oo(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!o00oo0Oo2) {
                    break;
                }
                length--;
            } else if (o00oo0Oo2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static /* synthetic */ String o0o00O0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return o0o00(str, str2, str3);
    }

    public static /* synthetic */ String o0o00O00(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return o0o000oo(str, c, str2);
    }

    @o0OO00o0(version = "1.5")
    public static final boolean o0o00O0O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        if (o0ooO.o00oOoO0(str, "true")) {
            return true;
        }
        if (o0ooO.o00oOoO0(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException(o00oOoOo.o00oo.o00oOOo0("The string doesn't represent a boolean value: ", str));
    }

    @o0OO00o0(version = "1.5")
    @Nullable
    public static final Boolean o0o00O0o(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        if (o0ooO.o00oOoO0(str, "true")) {
            return Boolean.TRUE;
        }
        if (o0ooO.o00oOoO0(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    @NotNull
    public static final CharSequence o0o00OO0(@NotNull CharSequence charSequence, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ((Boolean) oOoo0.o00oOOo0(charSequence, !z ? i : length, o00ooVar)).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @NotNull
    public static final CharSequence o0o00OOO(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean o0ooooo0 = o0O000O.o0ooooo0(cArr, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!o0ooooo0) {
                    break;
                }
                length--;
            } else if (o0ooooo0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @o00oo00O
    public static final String o0o00OOo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0o00O(str).toString();
    }

    @NotNull
    public static final String o0o00Oo(@NotNull String str, @NotNull char... cArr) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean o0ooooo0 = o0O000O.o0ooooo0(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!o0ooooo0) {
                    break;
                }
                length--;
            } else if (o0ooooo0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @NotNull
    public static final String o0o00Oo0(@NotNull String str, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = o00ooVar.invoke(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @NotNull
    public static final CharSequence o0o00OoO(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!oO00OO0O.o00oo0Oo(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence o0o00Ooo(@NotNull CharSequence charSequence, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!((Boolean) oOoo0.o00oOOo0(charSequence, length, o00ooVar)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    @NotNull
    public static final String o0o00o(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!o0O000O.o0ooooo0(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @o00oo00O
    public static final String o0o00o0(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0o00OoO(str).toString();
    }

    @NotNull
    public static final CharSequence o0o00o00(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!o0O000O.o0ooooo0(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @NotNull
    public static final String o0o00o0O(@NotNull String str, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        CharSequence charSequence;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!o00ooVar.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @NotNull
    public static final CharSequence o0o00oO(@NotNull CharSequence charSequence, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        int o00oOOo02 = oO0O00oO.o00oOOo0(charSequence, "<this>", o00ooVar, "predicate");
        for (int i = 0; i < o00oOOo02; i++) {
            if (!((Boolean) oOoo0.o00oOOo0(charSequence, i, o00ooVar)).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence o0o00oO0(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!oO00OO0O.o00oo0Oo(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence o0o00oOO(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!o0O000O.o0ooooo0(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @o00oo00O
    public static final String o0o00oOo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0o00oO0(str).toString();
    }

    @NotNull
    public static final String o0o00oo(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!o0O000O.o0ooooo0(cArr, str.charAt(i))) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String o0o00oo0(@NotNull String str, @NotNull o00oo<? super Character, Boolean> o00ooVar) {
        CharSequence charSequence;
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!o00ooVar.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ String o0o0o00O(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return o0OooooO(str, str2, str3);
    }

    @NotNull
    public static final String o0oO0O00(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, "prefix");
        o0ooO.o00oo0O0(charSequence2, "suffix");
        if (str.length() >= charSequence2.length() + charSequence.length() && o0Oooo0(str, charSequence, false, 2, null) && o0OOo0O0(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final List<String> o0oOO0Oo(CharSequence charSequence, String str, boolean z, int i) {
        o0OoOooO(i);
        int i2 = 0;
        int o0OOoO0o2 = o0OOoO0o(charSequence, str, 0, z);
        if (o0OOoO0o2 == -1 || i == 1) {
            return o0OoO00O.o00oOoo0(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, o0OOoO0o2).toString());
            i2 = str.length() + o0OOoO0o2;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            o0OOoO0o2 = o0OOoO0o(charSequence, str, i2, z);
        } while (o0OOoO0o2 != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ oO000 o0oOOO0o(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o0Ooo0O(charSequence, cArr, z, i);
    }

    @NotNull
    public static final oO000<String> o0oOOOoo(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(strArr, "delimiters");
        return ooOOOOoo.o0O0o0o0(o0Oo0Ooo(charSequence, strArr, 0, z, i, 2, null), new o00oOo0O(charSequence));
    }

    public static /* synthetic */ CharSequence o0oOo000(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return o0oOooO0(charSequence, i, c);
    }

    @NotNull
    public static final CharSequence o0oOo0o0(@NotNull CharSequence charSequence, int i, char c) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            o0O0o0 it = new o0O0O0Oo(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Desired length ", i, " is less than zero."));
    }

    public static /* synthetic */ List o0oOoOoo(CharSequence charSequence, oO00o00O oo00o00o, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        return oo00o00o.split(charSequence, i);
    }

    @NotNull
    public static final String o0oOoo00(@NotNull String str, int i, char c) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0oOo0o0(str, i, c).toString();
    }

    @NotNull
    public static final CharSequence o0oOooO0(@NotNull CharSequence charSequence, int i, char c) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            o0O0o0 it = new o0O0O0Oo(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c);
            }
            return sb;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Desired length ", i, " is less than zero."));
    }

    public static final int o0ooO0O0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(o0O000O.oo0ooo(cArr), i);
        }
        int o0OOo0oO2 = o0OOo0oO(charSequence);
        if (i > o0OOo0oO2) {
            i = o0OOo0oO2;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (oO00OO.o00ooo00(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @o00oo00O
    public static final String o0ooOOO0(CharSequence charSequence, oO00o00O oo00o00o, o00oo<? super oO00o00, ? extends CharSequence> o00ooVar) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(oo00o00o, "regex");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return oo00o00o.replace(charSequence, o00ooVar);
    }

    @NotNull
    public static final String o0ooOOOO(@NotNull String str, int i, char c) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0oOooO0(str, i, c).toString();
    }

    @o00oo00O
    @o0O0o000
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo0OO(name = "replaceFirstCharWithChar")
    @o0OO00o0(version = "1.5")
    public static final String o0ooOOoo(String str, o00oo<? super Character, Character> o00ooVar) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        if (str.length() > 0) {
            char charValue = o00ooVar.invoke(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
            return charValue + substring;
        }
        return str;
    }
}
