package o0Oo0o00;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0OO;
import o0Oo0Oo0.o0O0OO0;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0oO0O0o;
import o0Oo0Oo0.oo0ooO;
/* loaded from: classes3.dex */
public final class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f16344o00oOOo0 = "([^ \"=]*)";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f16345o00oOOoO = "\"([^\"]*)\"";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Pattern f16346o00oOo00 = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static long o00oOOo0(o0O0o00 o0o0o00) {
        return o00oOoo0(o0o0o00.o00oOOo0("Content-Length"));
    }

    public static long o00oOOoO(oo0ooO oo0ooo) {
        return o00oOOo0(oo0ooo.f16174o00oo0oO);
    }

    public static boolean o00oOo00(oo0ooO oo0ooo) {
        if (oo0ooo.f16170o00oo0O0.f16087o00oOOoO.equals("HEAD")) {
            return false;
        }
        int i = oo0ooo.f16171o00oo0Oo;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && o00oOOoO(oo0ooo) == -1 && !"chunked".equalsIgnoreCase(oo0ooo.o00oOooo(HttpHeaders.TRANSFER_ENCODING, null))) ? false : true;
    }

    public static boolean o00oOo0O(oo0ooO oo0ooo) {
        return o00oOooO(oo0ooo.f16174o00oo0oO);
    }

    public static List<o0oO0O0o> o00oOo0o(o0O0o00 o0o0o00, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : o0o0o00.o00oOooo(str)) {
            int indexOf = str2.indexOf(32);
            if (indexOf != -1) {
                Matcher matcher = f16346o00oOo00.matcher(str2);
                int i = indexOf;
                while (true) {
                    if (!matcher.find(i)) {
                        break;
                    }
                    if (str2.regionMatches(true, matcher.start(1), "realm", 0, 5)) {
                        String substring = str2.substring(0, indexOf);
                        String group = matcher.group(3);
                        if (group != null) {
                            arrayList.add(new o0oO0O0o(substring, group));
                            break;
                        }
                    }
                    i = matcher.end();
                }
            }
        }
        return arrayList;
    }

    public static void o00oOoO(o0O0OO o0o0oo, o0O0o00O o0o0o00o, o0O0o00 o0o0o00) {
        if (o0o0oo == o0O0OO.f15841o00oOOo0) {
            return;
        }
        List<o0O0OO0> o00oOoo02 = o0O0OO0.o00oOoo0(o0o0o00o, o0o0o00);
        if (o00oOoo02.isEmpty()) {
            return;
        }
        o0o0oo.o00oOOoO(o0o0o00o, o00oOoo02);
    }

    public static int o00oOoO0(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int o00oOoOO(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int o00oOoOo(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static long o00oOoo0(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean o00oOooO(o0O0o00 o0o0o00) {
        return o00oOooo(o0o0o00).contains("*");
    }

    public static Set<String> o00oOooo(o0O0o00 o0o0o00) {
        Set<String> emptySet = Collections.emptySet();
        int length = o0o0o00.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(o0o0o00.o00oOooO(i))) {
                String o00oOoo02 = o0o0o00.o00oOoo0(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : o00oOoo02.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static o0O0o00 o00oo0(o0O0o00 o0o0o00, o0O0o00 o0o0o002) {
        Set<String> o00oOooo2 = o00oOooo(o0o0o002);
        if (o00oOooo2.isEmpty()) {
            return new o0O0o00(new o0O0o00.o00oOOo0());
        }
        o0O0o00.o00oOOo0 o00oooo02 = new o0O0o00.o00oOOo0();
        int length = o0o0o00.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            String o00oOooO2 = o0o0o00.o00oOooO(i);
            if (o00oOooo2.contains(o00oOooO2)) {
                o00oooo02.o00oOOoO(o00oOooO2, o0o0o00.o00oOoo0(i));
            }
        }
        return new o0O0o00(o00oooo02);
    }

    public static Set<String> o00oo00O(oo0ooO oo0ooo) {
        return o00oOooo(oo0ooo.f16174o00oo0oO);
    }

    public static boolean o00oo0O0(oo0ooO oo0ooo, o0O0o00 o0o0o00, o0OO000o o0oo000o) {
        for (String str : o00oo00O(oo0ooo)) {
            if (!oO0000O.o00oOooo(o0o0o00.o00oOooo(str), o0oo000o.o00oOooO(str))) {
                return false;
            }
        }
        return true;
    }

    public static o0O0o00 o00oo0OO(oo0ooO oo0ooo) {
        return o00oo0(oo0ooo.f16168o00oo.f16170o00oo0O0.f16088o00oOo00, oo0ooo.f16174o00oo0oO);
    }
}
