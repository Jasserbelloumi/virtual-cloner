package o00ooo0;

import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0OOO0 {
    @o0OO00OO
    public static String o00oOOo0(@o0OO00OO String str, @oo0oO0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (o00oOo0O(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @o0OO00OO
    public static String o00oOOoO(@o0OO00OO String[] strArr, @oo0oO0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (o00oOo0O(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean o00oOo00(@o0OO00OO String str, @oo0oO0 String str2) {
        if (str == null) {
            return false;
        }
        return o00oOo0O(str.split("/"), str2.split("/"));
    }

    public static boolean o00oOo0O(@oo0oO0 String[] strArr, @oo0oO0 String[] strArr2) {
        if (strArr2.length == 2) {
            if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
                throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
            }
            if (strArr.length != 2) {
                return false;
            }
            if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
                return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
            }
            return false;
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }

    @oo0oO0
    public static String[] o00oOooO(@o0OO00OO String[] strArr, @oo0oO0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (o00oOo0O(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
