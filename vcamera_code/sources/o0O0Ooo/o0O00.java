package o0O0Ooo;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12053o00oOOoO = "androidx.work.workdb";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12052o00oOOo0 = o0O0Ooo0.o0O00000.o00oOo0o("WrkDbPathHelper");

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String[] f12054o00oOo00 = {"-journal", "-shm", "-wal"};

    @oo0oO0
    @o0o0000
    public static File o00oOOo0(@oo0oO0 Context context) {
        return o00oOo00(context, f12053o00oOOoO);
    }

    @oo0oO0
    @o0o0000
    public static File o00oOOoO(@oo0oO0 Context context) {
        return context.getDatabasePath(f12053o00oOOoO);
    }

    @o0OOooO0(23)
    public static File o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static void o00oOo0O(@oo0oO0 Context context) {
        if (o00oOOoO(context).exists()) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12052o00oOOo0, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> o00oOo0o2 = o00oOo0o(context);
            for (File file : o00oOo0o2.keySet()) {
                File file2 = o00oOo0o2.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        o0O0Ooo0.o0O00000.o00oOo00().o00oOoO(f12052o00oOOo0, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12052o00oOOo0, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @oo0oO0
    @o0o0000
    public static Map<File, File> o00oOo0o(@oo0oO0 Context context) {
        File o00oOOoO2;
        File o00oOOo02;
        String[] strArr;
        HashMap hashMap = new HashMap();
        hashMap.put(o00oOOoO(context), o00oOOo0(context));
        for (String str : f12054o00oOo00) {
            hashMap.put(new File(o00oOOoO2.getPath() + str), new File(o00oOOo02.getPath() + str));
        }
        return hashMap;
    }

    @oo0oO0
    public static String o00oOooO() {
        return f12053o00oOOoO;
    }
}
