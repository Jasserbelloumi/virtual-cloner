package o0OOoo0o;

import com.google.common.base.Ascii;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oOo0oooO;
/* loaded from: classes3.dex */
public class oO00O extends oOo00OO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {
        public o00oOOo0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oOo0oooO.o00oOo0o(methodHookParam.args);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends XC_MethodHook {
        public o00oOOoO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr = methodHookParam.args;
            if (objArr[2] instanceof String) {
                objArr[2] = App.o00oOOoO().getPackageName();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends XC_MethodHook {
        public o00oOo00() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oOo0oooO.o00oOoO0(methodHookParam.args);
        }
    }

    @Override // o0OOoo0o.oOo00OO0
    public void o00oOOo0() {
        try {
            XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{-42, -40, 55, -2, 96, -2, -48, 94, -33, -41, o0OO0o00.f16655o00oOoOO, -24, 120, -10, -58, Ascii.NAK, -103, -1, Ascii.DLE, -19, 98, -14, -58, 17, -28, -45, o0OO0o00.f16655o00oOoOO, -6, 102, -12, -47, 84, -28, -62, 38, -18, 43, -57, -58, Ascii.US, -49, -49}, new byte[]{-73, -74, 83, -116, Ascii.SI, -105, -76, 112}), oOo00OO0.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{-41, -64, -123, 54, -69, 108, 74}, new byte[]{-76, -81, -21, 88, -34, Ascii.SI, 62, -126}), new o00oOOo0());
        } catch (Throwable unused) {
        }
        try {
            XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{-30, -39, 79, -81, 9, 52, -40, 88, -21, -42, 89, -71, 17, 60, -50, 19, -83, -2, 104, -68, Ascii.VT, 56, -50, Ascii.ETB, -48, -46, 89, -85, Ascii.SI, 62, -39, 82, -48, -61, 94, -65, 66, Ascii.CR, -50, Ascii.EM, -5, -50}, new byte[]{-125, -73, 43, -35, 102, 93, -68, 118}), oOo00OO0.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{-49, 108, -27, 98, Ascii.SI, -59, -94, -107, -55, 117, -30, 111, Ascii.SI}, new byte[]{-84, 3, -117, Ascii.FF, 106, -90, -42, -47}), new o00oOOoO());
        } catch (Throwable unused2) {
        }
        try {
            XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{Ascii.FF, -58, 69, 57, 67, 112, 91, 47, 5, -55, 83, 47, 91, 120, 77, 100, 67, -31, 98, 42, 65, 124, 77, 96, 62, -51, 83, oo0OOoo.f13516o00oOoO, 69, 122, 90, 37, 62, -36, 84, 41, 8, 73, 77, 110, Ascii.NAK, -47}, new byte[]{109, -88, o0OO0o00.f16655o00oOoOO, 75, 44, Ascii.EM, 63, 1}), oOo00OO0.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{-79, -59, -127, -112, -14, -32, 126, 121, -73, -51, -114, -99, -18}, new byte[]{-46, -86, -17, -2, -105, -125, 10, 53}), new o00oOo00());
        } catch (Throwable unused3) {
        }
    }
}
