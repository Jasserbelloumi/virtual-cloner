package o0O0o0o0;

import android.content.ComponentName;
import android.content.Context;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12546o00oOOo0 = o0O0Ooo0.o0O00000.o00oOo0o("PackageManagerHelper");

    public static boolean o00oOOo0(Context context, Class<?> cls) {
        return o00oOOoO(context, cls.getName());
    }

    public static boolean o00oOOoO(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }

    public static void o00oOo00(@oo0oO0 Context context, @oo0oO0 Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            o0O0Ooo0.o0O00000 o00oOo002 = o0O0Ooo0.o0O00000.o00oOo00();
            String str = f12546o00oOOo0;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            o00oOo002.o00oOOo0(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            o0O0Ooo0.o0O00000 o00oOo003 = o0O0Ooo0.o0O00000.o00oOo00();
            String str2 = f12546o00oOOo0;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            o00oOo003.o00oOOo0(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
