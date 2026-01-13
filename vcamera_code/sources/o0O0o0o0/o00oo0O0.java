package o0O0o0o0;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.o00oOOo0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12556o00oOOo0 = o0O0Ooo0.o0O00000.o00oOo0o("ProcessUtils");

    @o0OO00OO
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String o00oOOo0(@oo0oO0 Context context) {
        return Application.getProcessName();
    }

    public static boolean o00oOOoO(@oo0oO0 Context context, @oo0oO0 o00oOOo0 o00oooo02) {
        String processName = Application.getProcessName();
        return !TextUtils.isEmpty(o00oooo02.f5742o00oOoO0) ? TextUtils.equals(processName, o00oooo02.f5742o00oOoO0) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
