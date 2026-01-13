package o0ooO0O0;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOooo.o0O00OO;
/* loaded from: classes3.dex */
public class oO0oO000 {
    /* JADX WARN: Multi-variable type inference failed */
    public static String o00oOOo0(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        boolean z = false;
        bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            z = readLine.startsWith(o00oo.o00oOOo0(new byte[]{46}, new byte[]{Ascii.CR, -56, -47, 56, -94, -92, SignedBytes.MAX_POWER_OF_TWO, -105}));
                            if (!z) {
                                sb.append(readLine);
                                sb.append("\n");
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                bufferedReader = bufferedReader;
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    bufferedReader = z;
                } catch (Throwable unused2) {
                }
            } catch (Exception e2) {
                e = e2;
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean o00oOOoO(ApplicationInfo applicationInfo) {
        try {
            return applicationInfo.metaData.getBoolean(o00oo.o00oOOo0(new byte[]{86, 101, -76, 43, 5, -84, -118, Byte.MAX_VALUE, 74, 96, -73, oo0OOoo.f13516o00oOoO}, new byte[]{46, Ascii.NAK, -37, 88, 96, -56, -25, Ascii.DLE}));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean o00oOo00(String str) {
        try {
            return o00oOo0O(str) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00c0: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x00c0 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o00oOo0O(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0ooO0O0.oO0oO000.o00oOo0O(java.lang.String):java.lang.String");
    }

    public static o0O00OO o00oOooO(ApplicationInfo applicationInfo) {
        try {
            PackageManager packageManager = App.o00oOOoO().getPackageManager();
            o0O00OO o0o00oo = new o0O00OO();
            o0o00oo.f15405o00oOOo0 = applicationInfo.packageName;
            o0o00oo.f15408o00oOo0O = false;
            o0o00oo.f15407o00oOo00 = applicationInfo.metaData.getString(o00oo.o00oOOo0(new byte[]{-13, 100, Ascii.FF, oo0OOoo.f13516o00oOoO, -103, 111, -25, 114, -8, 119, 17, 39, -116, Byte.MAX_VALUE, -22, 120, -27}, new byte[]{-117, Ascii.DC4, 99, 78, -4, Ascii.VT, -125, Ascii.ETB}));
            o0o00oo.f15406o00oOOoO = applicationInfo.loadLabel(packageManager).toString();
            o0o00oo.f15409o00oOooO = o00oOo0O(applicationInfo.sourceDir);
            return o0o00oo;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
