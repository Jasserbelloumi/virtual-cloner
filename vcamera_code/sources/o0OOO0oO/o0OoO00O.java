package o0OOO0oO;

import java.io.File;
/* loaded from: classes3.dex */
public final class o0OoO00O {
    public static final String o00oOOoO(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb2, "sb.toString()");
        return sb2;
    }
}
