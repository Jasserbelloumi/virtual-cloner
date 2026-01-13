package o0OOoo0o;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO00OO extends oOo00OO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {
        public o00oOOo0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult((Object) null);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends XC_MethodHook {
        public o00oOOoO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult((Object) null);
        }
    }

    @Override // o0OOoo0o.oOo00OO0
    public void o00oOOo0() {
        XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{-65, 72, -26, 55, 69, 59, 110, -46, -79, 85, -84, Ascii.FF, 124, 59, 104, -114, -65, 82, -19, 55, 103, 51, 100, -99, -71, 67, -16, Ascii.SYN, 79, 32, 124, -107, -67, 67, -90, Ascii.SYN, 94, 39, 104, -40, -114, 84, -19, oo0OOoo.f13516o00oOoO, 83}, new byte[]{-34, 38, -126, 69, 42, 82, 10, -4}), oO00OO.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{-55, -80, 87, -90, -113, -98, -33, -111, -55, -102, 77, -94, -123, -113, -37, -117, -50}, new byte[]{-70, -43, 35, -25, -29, -23, -66, -24}), new o00oOOo0());
        XposedBridge.hookAllMethods(XposedHelpers.findClass(o00oo.o00oOOo0(new byte[]{56, -83, 45, 50, 67, 79, Ascii.SO, -77, 54, -80, 103, 9, 122, 79, 8, -17, 56, -73, 38, 50, 97, 71, 4, -4, 62, -90, 59, 19, 73, 84, Ascii.FS, -12, 58, -90, 109, 19, 88, 83, 8, -71, 9, -79, 38, 56, 85}, new byte[]{89, -61, 73, SignedBytes.MAX_POWER_OF_TWO, 44, 38, 106, -99}), oO00OO.class.getClassLoader()), o00oo.o00oOOo0(new byte[]{55, 88, -4, -65, -54, -28, 55}, new byte[]{65, 49, -98, -51, -85, -112, 82, -41}), new o00oOOoO());
    }
}
