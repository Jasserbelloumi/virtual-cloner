package o0OOoo0o;

import com.google.common.base.Ascii;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO00O0o extends oOo00OO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {
        public o00oOOo0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult((Object) null);
        }
    }

    @Override // o0OOoo0o.oOo00OO0
    public void o00oOOo0() {
        XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{-2, -27, Ascii.SO, Ascii.NAK, 116, 90, 94, 35, -2, -5, Ascii.SUB, 73, 82, 114, 89, 121, -10, -3, 3, 19, 98, 112, 86, 100, -6, -27, Ascii.RS, 36, 116, 93, 78, Byte.MAX_VALUE, -16, -25, 6, 2, 105, Ascii.ETB, 105, 121, -22, -23, 78, 55, 105, 92, 66, 116}, new byte[]{-97, -117, 106, 103, Ascii.ESC, 51, 58, Ascii.CR}), oOo00OO0.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{-44, -9, Ascii.FF, -4, 91, -34, Ascii.ETB, 85, -62, -31, Ascii.ESC, -38, 83, -35, 8, 120, -56, -4}, new byte[]{-89, -110, 120, -88, 58, -83, 124, 17}), new o00oOOo0());
    }
}
