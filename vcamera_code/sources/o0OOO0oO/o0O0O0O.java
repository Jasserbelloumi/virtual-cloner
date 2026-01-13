package o0OOO0oO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o0OOOOO0.o0OOO00;
import o0OOOoo0.oO0O0;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* loaded from: classes3.dex */
public class o0O0O0O {
    @NotNull
    public static final File o00oOOo0(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return new File(o00oOo00(file));
    }

    public static final int o00oOOoO(String str) {
        int o0OOoOOO2;
        int o0OOoOOO3 = oO0O0.o0OOoOOO(str, File.separatorChar, 0, false, 4, null);
        if (o0OOoOOO3 != 0) {
            if (o0OOoOOO3 <= 0 || str.charAt(o0OOoOOO3 - 1) != ':') {
                if (o0OOoOOO3 == -1 && oO0O0.o0OOo00o(str, ':', false, 2, null)) {
                    return str.length();
                }
                return 0;
            }
            return o0OOoOOO3 + 1;
        }
        if (str.length() > 1) {
            char charAt = str.charAt(1);
            char c = File.separatorChar;
            if (charAt == c && (o0OOoOOO2 = oO0O0.o0OOoOOO(str, c, 2, false, 4, null)) >= 0) {
                int o0OOoOOO4 = oO0O0.o0OOoOOO(str, File.separatorChar, o0OOoOOO2 + 1, false, 4, null);
                return o0OOoOOO4 >= 0 ? o0OOoOOO4 + 1 : str.length();
            }
        }
        return 1;
    }

    @NotNull
    public static final String o00oOo00(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        String path = file.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path, "path");
        String path2 = file.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path2, "path");
        String substring = path.substring(0, o00oOOoO(path2));
        o0OOOOO0.o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final File o00oOo0O(@NotNull File file, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        return o00oOo0o(file).o00oOoOo(i, i2);
    }

    @NotNull
    public static final o0O00OO o00oOo0o(@NotNull File file) {
        List list;
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        String path = file.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path, "path");
        int o00oOOoO2 = o00oOOoO(path);
        String substring = path.substring(0, o00oOOoO2);
        o0OOOOO0.o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(o00oOOoO2);
        o0OOOOO0.o0ooO.o00oo0OO(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = o0OO0oO.o0ooO.INSTANCE;
        } else {
            List<String> o0Ooo00o = oO0O0.o0Ooo00o(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(o0Ooo00o, 10));
            for (String str : o0Ooo00o) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new o0O00OO(new File(substring), list);
    }

    public static final boolean o00oOooO(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        String path = file.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path, "path");
        return o00oOOoO(path) > 0;
    }
}
