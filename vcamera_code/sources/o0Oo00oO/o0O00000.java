package o0Oo00oO;

import android.app.Application;
import com.google.common.base.Ascii;
import multispace.multiapp.clone.bean.LocationInfo;
import o0OOoO0.o00oo;
import o0OOooOo.o0O;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class o0O00000 extends o0 {
    @Override // o0Oo00oO.o0
    public boolean o00oOOoO(Application application) {
        StringBuilder sb;
        String o00oOOo02;
        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{102, -118, Ascii.FF, -110, Byte.MIN_VALUE, 47, -84, 59, 126, -101, 88}, new byte[]{Ascii.SO, -21, 98, -10, -20, 74, -116, 90}) + application + o00oo.o00oOOo0(new byte[]{5, Ascii.DC2, -68, -110, -77}, new byte[]{41, 98, -41, -11, -119, -74, 43, Ascii.CAN}) + application.getPackageName());
        if (o0Oo00o0.o0.o00oOoO().o00oOoo0()) {
            if (o0O.o00oOo00().o00oOo0o()) {
                LocationInfo o00oOOoO2 = o0O.o00oOo00().o00oOOoO(application.getPackageName());
                if (o00oOOoO2 == null) {
                    sb = new StringBuilder();
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-122, Byte.MAX_VALUE, -56, -118, -127, 105, 110, 125, -54, 121, -40, -53, -101, 117, 109, Byte.MAX_VALUE, -48}, new byte[]{-22, Ascii.DLE, -85, -21, -11, 0, 1, 19});
                } else if (o00oOOoO2.o00oOOoO() == 0.0d && o00oOOoO2.o00oOo00() == 0.0d) {
                    sb = new StringBuilder();
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-126, -121, 108, -79, 86, 76, -4, 45, -50, -127, 124, -16, Ascii.DC2, Ascii.US}, new byte[]{-18, -24, Ascii.SI, -48, 34, 37, -109, 67});
                } else if (o00oOOoO2.o00oOo0O()) {
                    return true;
                } else {
                    sb = new StringBuilder();
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-102, -62, -47, 85, Ascii.EM, Ascii.VT, 111, 58, -108, -63, -126, Ascii.ESC, Ascii.ETB, Ascii.SI, 63, Byte.MAX_VALUE, -109, -45, -64, Ascii.EM, Ascii.GS, 65}, new byte[]{-3, -78, -94, 117, 120, 123, Ascii.US, Ascii.SUB});
                }
            } else {
                sb = new StringBuilder();
                o00oOOo02 = o00oo.o00oOOo0(new byte[]{-5, -3, -1, 99, 82, -110, 75, 125, -3, -31, -84, 42, 70, -34, 74, 112, -24, -83, -23, 45, 84, -100, 72, 122, -90}, new byte[]{-100, -115, -116, 67, 53, -2, 36, Ascii.US});
            }
            sb.append(o00oOOo02);
            sb.append(application);
            oO0O0O0o.o00oOOo0(sb.toString());
            return false;
        }
        return false;
    }

    @Override // o0Oo00oO.o0
    public void o00oOo00(Application application) {
        o0O000.f15649o00oOOo0 = o0O.o00oOo00().o00oOOoO(application.getPackageName());
        o0O000.o00oOo0o();
    }
}
