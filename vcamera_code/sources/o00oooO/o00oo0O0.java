package o00oooO;

import android.text.TextUtils;
import o00ooOO0.o0O000O;
@Deprecated
/* loaded from: classes.dex */
public final class o00oo0O0 {
    @Deprecated
    public static String[] o00oOOo0(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    public static String o00oOOoO(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : TextUtils.isEmpty(str2) ? str : o0O000O.o00oOOo0("(", str, ") AND (", str2, ")");
    }
}
