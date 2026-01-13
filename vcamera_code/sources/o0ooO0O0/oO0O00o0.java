package o0ooO0O0;

import android.support.v4.media.o00oOo0O;
import com.google.common.base.Ascii;
import java.io.File;
import multispace.multiapp.clone.app.App;
import o0O0oooo.o0OO;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO0O00o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f17110o00oOOo0 = o00oo.o00oOOo0(new byte[]{-110, -57, 56, -106, 47, 72, 100, 76, -98, -63, 49, -106, 56, 67, 110, 90, -104, -58, 50}, new byte[]{-15, -88, 85, -72, 78, 38, 0, 62});

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f17111o00oOOoO = o00oo.o00oOOo0(new byte[]{-22, 121, 54, 19, Ascii.GS, 71, -8, 63, -27, 115, 117, 92, Ascii.DC4, 76, -27, 55, -32, 114, 117, 90, Ascii.ETB, 91}, new byte[]{-119, Ascii.SYN, 91, oo0OOoo.f13516o00oOoO, 122, 40, -105, 88});

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f17112o00oOo00 = o00oo.o00oOOo0(new byte[]{2, -26, 109, 82, 119, -78, 70, -121, Ascii.CR, -20, 46, Ascii.GS, 126, -71, 91, -113, 8, -19, 46, Ascii.ESC, 99, -69}, new byte[]{97, -119, 0, 124, Ascii.DLE, -35, 41, -32});

    public static String o00oOOo0(String str, String str2) {
        StringBuilder sb;
        String o00oOOo02;
        if (o0OO.o00oOoOo(str, 0, 0) == null) {
            try {
                if (oO00o0.o00oOo0O(new File(App.o00oOOoO().getPackageManager().getApplicationInfo(str, 0).sourceDir))) {
                    return str2 + o00oo.o00oOOo0(new byte[]{57, 41, -114, -41, -103, Ascii.RS, 125, -88, 112, 39, -97, -42, -53, 8, 125, -20, 55}, new byte[]{Ascii.EM, 74, -17, -71, -71, 124, Ascii.CAN, -120});
                }
                return str2 + o00oo.o00oOOo0(new byte[]{102, -53, 119, 110, -119, Ascii.DC4, 55, 92, 47, -42, 36, 45, -37, 72, 58, 80, 41, -42, 36, 39, -41, 86, 117, 76, 50, -114, 84, 34, -33, 71, 105, 91, 102, -58, 107, 57, -44, 74, 117, 95, 34, -126, 112, 38, -33, 6, 44, 10, 107, -64, 109, 58, -102}, new byte[]{70, -94, 4, 78, -70, 38, Ascii.SUB, 62}) + str2 + o00oo.o00oOOo0(new byte[]{99}, new byte[]{77, 89, Ascii.ESC, -82, 19, -56, -13, -117});
            } catch (Throwable th) {
                th.printStackTrace();
                sb = new StringBuilder();
                sb.append(str2);
                o00oOOo02 = o00oo.o00oOOo0(new byte[]{51, -82, 59, -21, -32, -53, 95, -31, 51, -25, 60, -21, -76, -60, 92, -7, 118, -22, 114, -9, -82, -123, 68, -3, 118, -82, 34, -16, -81, -53, 85, -71, 112, -17, 60, -72, -82, -54, 68, -75, 122, -29, 34, -9, -78, -47, Ascii.RS}, new byte[]{19, -114, 82, -104, -64, -91, 48, -107});
            }
        } else {
            sb = o00oOo0O.o00oOOo0(str2);
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{-74, -123, -49, -36, Ascii.EM, 98, -51, 62, -74, -115, -50, -34, 19, 113, -35, 34, -14, -54}, new byte[]{-106, -28, -93, -82, 124, 3, -87, 71});
        }
        sb.append(o00oOOo02);
        return sb.toString();
    }

    public static void o00oOOoO(int i) {
        String str = f17111o00oOOoO;
        if (o0OO.o00oOoOo(str, i, 0) == null) {
            try {
                if (oO00o0.o00oOo0O(new File(App.o00oOOoO().getPackageManager().getApplicationInfo(str, 0).sourceDir))) {
                    o0OO.o00oo0Oo(str, i, true);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String str2 = f17112o00oOo00;
        if (o0OO.o00oOoOo(str2, i, 0) == null) {
            try {
                if (oO00o0.o00oOo0O(new File(App.o00oOOoO().getPackageManager().getApplicationInfo(str2, 0).sourceDir))) {
                    o0OO.o00oo0Oo(str2, i, true);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        String str3 = f17110o00oOOo0;
        if (o0OO.o00oOoOo(str3, i, 0) == null) {
            try {
                if (oO00o0.o00oOo0O(new File(App.o00oOOoO().getPackageManager().getApplicationInfo(str3, 0).sourceDir))) {
                    o0OO.o00oo0Oo(str3, i, true);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    public static void o00oOo00(int i) {
        try {
            String str = f17111o00oOOoO;
            if (o0OO.o00oOoOo(str, i, 0) != null) {
                o0OO.o00ooOO0(str, 0);
            }
            String str2 = f17112o00oOo00;
            if (o0OO.o00oOoOo(str2, i, 0) != null) {
                o0OO.o00ooOO0(str2, 0);
            }
            String str3 = f17110o00oOOo0;
            if (o0OO.o00oOoOo(str3, i, 0) != null) {
                o0OO.o00ooOO0(str3, 0);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
