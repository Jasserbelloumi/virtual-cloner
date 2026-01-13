package o0Oo00oO;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o0O0oooo.o0OO;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOooo.o0O00OO;
import o0OOooo.o0O00OOO;
import o0OOooo0.oO0OOO0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class o0O000O extends o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashSet<o0O00OO> f15675o00oOOo0 = null;

    public static String o00oOo0O() {
        String str;
        try {
            Method declaredMethod = Class.forName(o00oo.o00oOOo0(new byte[]{-44, -126, -97, 78, -110, 6, 99, 123, -44, -100, -117, Ascii.DC2, -68, Ascii.FF, 115, 60, -61, -123, -113, 69, -87, 7, 117, 48, -44, -120}, new byte[]{-75, -20, -5, 60, -3, 111, 7, 85}), false, Application.class.getClassLoader()).getDeclaredMethod(o00oo.o00oOOo0(new byte[]{-1, 1, 123, -94, 78, 112, 114, Ascii.SI, -18, Ascii.ESC, 106, -75, 88, 109, 72, 62, -15, 17}, new byte[]{-100, 116, 9, -48, 43, Ascii.RS, 6, 95}), new Class[0]);
            declaredMethod.setAccessible(true);
            str = null;
            try {
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        return str;
    }

    @Override // o0Oo00oO.o0
    public boolean o00oOOoO(Application application) {
        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-60, 82, -79, -94, -103, 120, -37, -112, -36, 67, -27}, new byte[]{-84, 51, -33, -58, -11, Ascii.GS, -5, -15}) + application + o00oo.o00oOOo0(new byte[]{-103, -111, -101, 99, 57}, new byte[]{-75, -31, -16, 4, 3, 57, -80, 60}) + application.getPackageName());
        if (o0O00OOO.o00oOo00().o00oOoO0()) {
            HashSet<o0O00OO> o00oOooO2 = o00oOooO(application);
            o00oo.o00oOOo0(new byte[]{72, -20, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, -97}, new byte[]{121, -35, 113, 38, -82, -16, -43, -20});
            o00oo.o00oOOo0(new byte[]{111, 79, Ascii.DC4, 75, -49, -113, 124, -58, 105, 87, 122, 93, -49, -97, Ascii.SO}, new byte[]{6, 60, 90, 46, -86, -21, 52, -87});
            Objects.toString(o00oOooO2);
            return o00oOooO2 != null && o00oOooO2.size() > 0;
        }
        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{63, -12, Ascii.ESC, 62, -9, 54, 34, -69, 57, -24, 72, 119, -29, 122, 35, -74, 44, -92, Ascii.CR, 112, -15, 56, o0OO0o00.f16655o00oOoOO, -68, 98}, new byte[]{88, -124, 104, Ascii.RS, -112, 90, 77, -39}) + application);
        return false;
    }

    @Override // o0Oo00oO.o0
    public void o00oOo00(Application application) {
        Iterator<o0O00OO> it = this.f15675o00oOOo0.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                PackageInfo o00oOoOo2 = o0OO.o00oOoOo(it.next().f15405o00oOOo0, 0, 0);
                if (o00oOoOo2 != null) {
                    oO0OOO0.o00oOoO0(o00oOoOo2.applicationInfo.publicSourceDir);
                    try {
                        o00oo.o00oOOo0(new byte[]{92, -13, 71, -83, -121}, new byte[]{109, -62, 118, -100, -74, -60, -35, -49});
                        o00oo.o00oOOo0(new byte[]{90, 83, 112, -65, -16, -40, -19, 63, 67, 80, 116, -5, -93, -64, -31, 56, 83, 79, 98, -31}, new byte[]{54, 60, 17, -37, -48, -75, -126, 91});
                        String str = o00oOoOo2.applicationInfo.publicSourceDir;
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        o00oo.o00oOOo0(new byte[]{-4, Ascii.US, -103, 92, -45}, new byte[]{-51, 46, -88, 109, -30, 74, Ascii.DC4, -28});
                        o00oo.o00oOOo0(new byte[]{-43, -24, 40, -49, -55, 85, 121, -64, -43, -30, 105, -51, -27, 83, 113, -113}, new byte[]{-71, -121, 73, -85, -124, 58, Ascii.GS, -75});
                        th.toString();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (z) {
            try {
                String o00oOo0O2 = o00oOo0O();
                boolean equals = application.getPackageName().equals(o00oOo0O2);
                o00oo.o00oOOo0(new byte[]{110, 66, 88, -29, 2}, new byte[]{95, 115, 105, -46, 51, 97, 2, 108});
                o00oo.o00oOOo0(new byte[]{58, -109, 88, 51}, new byte[]{74, -8, 63, 9, 113, Byte.MIN_VALUE, -69, -30});
                application.getPackageName();
                o00oo.o00oOOo0(new byte[]{98, -40, 70, 109, Byte.MAX_VALUE, 124, 89, -101, 116}, new byte[]{78, -88, 52, 2, Ascii.FS, Ascii.EM, 42, -24});
                oO0OOO0.o00oOoOO(application.getPackageName(), o00oOo0O2, application.getApplicationInfo(), equals, application.getClassLoader());
            } catch (Throwable th3) {
                o00oo.o00oOOo0(new byte[]{-11, 113, 1, -65, 66}, new byte[]{-60, SignedBytes.MAX_POWER_OF_TWO, 48, -114, 115, -23, -102, 121});
                o00oo.o00oOOo0(new byte[]{-32, 124, 55, -107, 46, -86, 100, Ascii.CR, -22, 94, 8, -107, 41, -31, 99, Ascii.VT, -26, 126, 93}, new byte[]{-113, Ascii.DC2, 103, -12, 77, -63, 5, 106});
                th3.toString();
            }
        }
    }

    public final HashSet<o0O00OO> o00oOooO(Application application) {
        HashSet<o0O00OO> hashSet = new HashSet<>();
        this.f15675o00oOOo0 = hashSet;
        List<o0O00OO> o00oOOoO2 = o0O00OOO.o00oOo00().o00oOOoO();
        if (o00oOOoO2 == null || o00oOOoO2.size() <= 0) {
            o00oo.o00oOOo0(new byte[]{109, -103, Ascii.FF, -17, Ascii.SYN}, new byte[]{92, -88, oo0OOoo.f13516o00oOoO, -34, 39, -65, Ascii.SUB, 34});
            o00oo.o00oOOo0(new byte[]{97, -58, 45, Ascii.FS, 110, 58, 44, -70, 120, -59, 41, 88, 34, 62, 48, -86, 45, -107, 113, 88, 126, 109}, new byte[]{Ascii.CR, -87, 76, 120, 78, 87, 67, -34});
            Objects.toString(o00oOOoO2);
            return hashSet;
        }
        for (o0O00OO o0o00oo : o00oOOoO2) {
            o00oo.o00oOOo0(new byte[]{4, -61, Ascii.GS, 107, 94}, new byte[]{53, -14, 44, 90, 111, 19, Ascii.SUB, 89});
            o00oo.o00oOOo0(new byte[]{50, -11, -124, 100, Ascii.US, 119, -42, Ascii.VT, 43, -10, Byte.MIN_VALUE, 32, 82, 117, -35, Ascii.SUB, 50, -1, -33}, new byte[]{94, -102, -27, 0, 63, Ascii.SUB, -71, 111});
            Objects.toString(o0o00oo);
            PackageInfo o00oOoOo2 = o0OO.o00oOoOo(o0o00oo.f15405o00oOOo0, 0, 0);
            o00oo.o00oOOo0(new byte[]{-22, 86, oo0OOoo.f13516o00oOoO, 7, -60}, new byte[]{-37, 103, Ascii.FF, 54, -11, 43, 78, -65});
            o00oo.o00oOOo0(new byte[]{-112, -10, -14, 4, -27, 115, -119, -112, -119, -11, -10, SignedBytes.MAX_POWER_OF_TWO, -75, Byte.MAX_VALUE, -123, -97, -99, -2, -10, 41, -85, 120, -119, -50}, new byte[]{-4, -103, -109, 96, -59, Ascii.RS, -26, -12});
            Objects.toString(o00oOoOo2);
            if (o00oOoOo2 != null) {
                if (o0o00oo.f15405o00oOOo0.equals(application.getPackageName())) {
                    hashSet.add(o0o00oo);
                }
                HashSet<String> o00oOooO2 = o0O00OOO.o00oOo00().o00oOooO(o0o00oo.f15405o00oOOo0);
                o00oo.o00oOOo0(new byte[]{-64, Ascii.GS, 40, 79, 111}, new byte[]{-15, 44, Ascii.EM, 126, 94, 55, -125, 54});
                o00oo.o00oOOo0(new byte[]{-118, Ascii.RS, 40, 90, 88, -46, 51, Ascii.CAN, -109, Ascii.GS, 44, Ascii.RS, Ascii.EM, -49, 44, Ascii.SI, -36}, new byte[]{-26, 113, 73, 62, 120, -65, 92, 124});
                Objects.toString(o00oOooO2);
                if (o00oOooO2 != null) {
                    o00oo.o00oOOo0(new byte[]{54, 7, 108, -43, Ascii.SI}, new byte[]{7, 54, 93, -28, 62, 70, -63, -83});
                    o00oo.o00oOOo0(new byte[]{67, 45, 51, 106, -89, 38, 35, -38, 90, 46, 55, 46, -26, 59, 60, -51, Ascii.NAK}, new byte[]{47, 66, 82, Ascii.SO, -121, 75, 76, -66});
                    o00oOooO2.toString();
                    if (o00oOooO2.contains(application.getPackageName())) {
                        hashSet.add(o0o00oo);
                    }
                }
            }
        }
        return hashSet;
    }
}
