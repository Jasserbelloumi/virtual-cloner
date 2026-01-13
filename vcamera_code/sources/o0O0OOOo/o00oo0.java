package o0O0OOOo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String[] f11483o00oOOo0 = new String[0];

    public static void o00oOOo0(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    @o0OO00OO
    public static String o00oOOoO(@o0OO00OO List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(Integer.toString(list.get(i).intValue()));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder o00oOo00() {
        return new StringBuilder();
    }

    @o0OO00OO
    public static List<Integer> o00oOooO(@o0OO00OO String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException unused) {
            }
        }
        return arrayList;
    }
}
