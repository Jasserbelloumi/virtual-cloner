package o0OOoo0o;

import android.os.Binder;
import com.google.common.base.Ascii;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O0O0o;
/* loaded from: classes3.dex */
public class oO00OO0O extends oOo00OO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {
        public o00oOOo0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Boolean.TRUE);
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{Ascii.GS, -46, 93, -12, o0OO0o00.f16655o00oOoOO, -37, -59, 40, Ascii.CAN, -40, 81, -4, oo0OOoo.f13516o00oOoO, -38, -54, 53, Ascii.SUB, -58, 77, -17, 50, -48, -43, oo0OOoo.f13516o00oOoO, Ascii.ETB, -43, 112, -14, oo0OOoo.f13516o00oOoO, -98, -43, 57, 0, -127, 109, -17, 38, -37, -120, 114}, new byte[]{116, -95, Ascii.EM, -99, 83, -66, -90, 92}));
        }
    }

    @Override // o0OOoo0o.oOo00OO0
    public void o00oOOo0() {
        try {
            String o00oOOo02 = o00oo.o00oOOo0(new byte[]{-1, 111, -94, 99, -43, -92, -50, -30, -6, 101, -82, 107, -55, -91, -63, -1, -8, 123, -78, 120, -58, -81, -34, -9, -11, 104, -113, 101, -55}, new byte[]{-106, Ascii.FS, -26, 10, -89, -63, -83, -106});
            Object[] objArr = new Object[1];
            try {
                objArr[0] = new o00oOOo0();
                XposedHelpers.findAndHookMethod(Binder.class, o00oOOo02, objArr);
                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-30, -116, -84, 38, -21, Ascii.SUB, 2, -19, -59, -115, -90, Ascii.GS, -89, 79, Ascii.NAK, -94, -61, -121, -25, 88}, new byte[]{-83, -30, -55, 118, -121, 111, 113, -51}));
            } catch (Throwable th) {
                th = th;
                oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-45, 121, -15, -75, -5, -20, -46, -110}, new byte[]{-100, Ascii.ETB, -108, -27, -105, -103, -95, -88}) + th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
